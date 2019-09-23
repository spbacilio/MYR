package com.tmm.myr.base.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	
	public static String DateToString(Date fecha) {          
          SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm:ss");
          String timee = localDateFormat.format(fecha);
          System.out.println(timee);
          return timee;
	}

}
