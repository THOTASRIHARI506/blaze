package com.icicilombard.marine.model.jaxb.adapters;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;

import com.blazesoft.objects.java.NdCalendar;
import com.blazesoft.objects.java.NdDuration;
/**
 *
 * Custom types is used by the JAXB component to marshal and unmarshal the data
 * @author Ruchir Deshpande, FICO
 *
 */

public class CustomTypes {

	private static NdCalendar calendar;
	private static SimpleDateFormat dateFormat;
	private static SimpleDateFormat tsFormat;

	static{
		InputStream is = CustomTypes.class.getClassLoader().getResourceAsStream("jaxbtypes.properties");
		Properties props = new Properties();
		try {
			props.load(is);
		    calendar = new NdCalendar(TimeZone.getDefault(), Locale.getDefault());
		    dateFormat = new SimpleDateFormat(props.getProperty("dateFormat"));
		   tsFormat = new SimpleDateFormat(props.getProperty("timestampFormat"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//for duration
	public synchronized static String marshalDuration(NdDuration arg0) {
		if(arg0 == null){
			return null;
		}
		return arg0.getISOString();
	}

	public synchronized static NdDuration unmarshalDuration(String arg0) {
		NdDuration duration = null;
		try{
			duration = NdDuration.getDurationFromISOString(calendar, arg0);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return duration;
	}

	//for date
	/*public static String marshalDate(NdDate arg0) {
		if (dateFormat == null || arg0 == null){
			return null;
		}
		return dateFormat.format(arg0.getJavaDate());
	}

	public static NdDate unmarshalDate(String arg0) {
		NdDate date = null;
		try{
			date = new NdDate(calendar, dateFormat.parse(arg0));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return date;
	}*/

	//for date
		public synchronized static String marshalDate(Date arg0) {
			if (dateFormat == null || arg0 == null){
				return null;
			}
			return dateFormat.format(arg0);
		}

		public synchronized static Date unmarshalDate(String arg0) {
			Date date = null;
			try{
				if(!arg0.isEmpty())
				date = new Date(dateFormat.parse(arg0).getTime());
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			return date;
		}
	
	
	//for date time
	public synchronized static String marshalTimestamp(Date arg0) {
		if (tsFormat == null || arg0 == null){
			return null;
		}
		return tsFormat.format(arg0);
	}

	public synchronized static Date unmarshalTimestamp(String arg0) {
		Date timestamp = null;
		try{
			timestamp = tsFormat.parse(arg0);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return timestamp;
	}

	//for boolean

	public synchronized static String marshalBoolean (Boolean arg0){
		if(arg0 == null){
			return null;
		}
		return arg0.toString();
	}

	public synchronized static Boolean unmarshalBoolean ( String arg0 ){
		return Boolean.parseBoolean(arg0);
	}
	
}
