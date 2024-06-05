package com.hadoop1.covid19;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Covid19Reducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	public void reduce(Text _key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
		// _key KOR
		// values [5,0,60, ..., 50684]
		
		int max = Integer.MIN_VALUE;
		
		// process values
		for (IntWritable val : values) {
			if (max < val.get()) {
				max = val.get();
			}
		}	// end for
		//			 (iso_code, max_new_cases);
		context.write(_key, new IntWritable(max));
	}	// end reduce
}
