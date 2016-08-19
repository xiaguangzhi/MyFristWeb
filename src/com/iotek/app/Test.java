package com.iotek.app;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Timestamp timestamp=new Timestamp(new Date().getTime());
		System.out.println(timestamp.toString());
	}

}
