package com.cts.datesamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
Date date=new Date();
		//String date="01/09/1987";
		TimeZone etTimeZone = TimeZone.getTimeZone("AET");
SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy  hh:mm:ss");
sdf.setTimeZone(etTimeZone);
//Date dat=sdf.parse(date);
String date1 = sdf.format(date); 



System.out.println(date1);

	}

}
