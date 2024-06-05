package com.hadoop1.covid19;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Covid19CustomMapper extends Mapper<LongWritable, Text, Text, Covid19CustomWritable> {

	public void map(LongWritable ikey, Text ivalue, Context context) throws IOException, InterruptedException {
		/**
		 * 국가별 신규확진자 수가 가장 많았던 날과
		   신규확진자 수 
		*/
		String[] covidStr = ivalue.toString().split(",");
		String iso_code = covidStr[0];
		String date = covidStr[1];
		String newCasesStr = covidStr[2];
		
		if (ikey.get() != 0 && isNumeric(newCasesStr)) {
			int newCases = Integer.parseInt(newCasesStr);
			Text dateText = new Text(date);
			IntWritable cases = new IntWritable(newCases);
			Covid19CustomWritable writable = new Covid19CustomWritable(dateText, cases);
			context.write(new Text(iso_code), writable);
		}
		
		
		
	}	// end map
	
	public static boolean isNumeric(String strNum) {
		if (strNum == null) return false;
		
		try {
			Double.parseDouble(strNum);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}	// end isNumeric

}
