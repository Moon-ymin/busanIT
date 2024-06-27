package com.hadoop1.covid19;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Covid19Mapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	public void map(LongWritable ikey, Text ivalue, Context context) throws IOException, InterruptedException {
		// line number == begin 0
// iso_code,date,new_cases,new_cases_14_days,new_cases_14_days_100k,total_cases,
// total_cases_100k,new_deaths,new_deaths_14_days,new_deaths_14_days_100k,total_deaths,
// total_deaths_100k
		Text iso_code;
		int newCases;
		
		String[] strs = ivalue.toString().split(",");
		
		iso_code = new Text(strs[0]);
		newCases = isNumberic(strs[2]);
		
		context.write(iso_code, new IntWritable(newCases));
		
		
	}	// end map
	
	public static int isNumberic(String s) {
		if (s == null) return 0;
		try {
			int num = Integer.parseInt(s);
			return  num;
		} catch(NumberFormatException e) {
			return 0;
		}
	}	// end isNumberic

}
