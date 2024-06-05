package com.hadoop1.covid19;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Covid19CustomReducer extends Reducer<Text, Covid19CustomWritable, Text, Covid19CustomWritable> {

	public void reduce(Text _key, Iterable<Covid19CustomWritable> values, Context context) throws IOException, InterruptedException {
		
		// _key : iso_code
		// values : [Covid19CustomWritable, Covid19CustomWritable, Covid19CustomWritable ...]
		Covid19CustomWritable maxWritable = new Covid19CustomWritable();
		
		int max = Integer.MIN_VALUE;


		for (Covid19CustomWritable val : values) {
			if(_key.toString().equals("KOR")) {
				System.out.println(val);
				System.out.println(System.identityHashCode(val));
			}
			if (max < val.getMax().get()) {
				//maxWritable = val;
				max = val.getMax().get();
				maxWritable.setDate(new Text(val.getDate().toString()));
				maxWritable.setMax(new IntWritable(val.getMax().get()));
			}
		}	// end for
		
		context.write(_key, maxWritable);
	
	}	// end reducer
}
