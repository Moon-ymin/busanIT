package com.hadoop1.covid19;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

public class Covid19CustomWritable implements Writable, WritableComparable<Covid19CustomWritable> {
	
	private Text date;
	private IntWritable max;
	
	// Constructor
	public Covid19CustomWritable() {
		this.date = new Text();
		this.max = new IntWritable(0);
	}
	
	// alt + s, a : generate constructor
	public Covid19CustomWritable(Text date, IntWritable max) {
		super();
		this.date = date;
		this.max = max;
	}


	@Override
	public int compareTo(Covid19CustomWritable arg0) {
		return (max.get() - arg0.max.get());
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		this.date.readFields(in);
		this.max.readFields(in);

	}

	@Override
	public void write(DataOutput out) throws IOException {
		this.date.write(out);
		this.max.write(out);
	}
	
	// alt + s, r : generate getter&setter
	public Text getDate() {
		return date;
	}

	public void setDate(Text date) {
		this.date = date;
	}

	public IntWritable getMax() {
		return max;
	}

	public void setMax(IntWritable max) {
		this.max = max;
	}
	
	@Override
	public String toString() {
		return this.date+"\t"+this.max;
	}

}
