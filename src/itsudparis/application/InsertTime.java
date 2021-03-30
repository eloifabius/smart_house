package itsudparis.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class InsertTime {
	
	public static String millisecondeTofullTime(long millisecond) {
		
		return timeUnitToFullTime (millisecond,TimeUnit.MILLISECONDS);
	}
	
	public static String  secondToFulltime (long second)
	{
		return timeUnitToFullTime(second,TimeUnit.SECONDS);
	}

	public static String timeUnitToFullTime (long time,TimeUnit timeunit)
	{
		long day =timeunit.toDays(time);
		long hour =timeunit.toHours(time)%24;
		long minute =timeunit.toMinutes(time)%60;
		long second=timeunit.toSeconds(time)%60;
		if (day>0)
		{
			return String.format("%dday %02d:%02d:%02d",day,hour,minute,second);
		}else if (hour>0) {
			return String.format("%d:%02d:%02d",hour,minute,second);
		}else if (minute>0) {
			return String.format("00:%d:%02d",minute,second);
		}else {
			return String.format("00:00:%02d",second);
		}
	}
	public static String moment (long second) {
		 
		TimeUnit timeunit = TimeUnit.SECONDS;
		long hour = timeunit.toHours(second)%24;
		
		if(hour <= 12 ) {
			return "matin";
		} else if(hour > 12 && hour < 17) {
			return "journee";
		} else {
			return "soiree";
		}
	}
	
	public static void main (String [] args) throws IOException {
		/*File file = new File ("Data/DAY_1.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		FileWriter fw = new FileWriter("C:/Users/utilisateur/Desktop/projects/Projet_Environnement_Intelligent-main/OntologieProject/Data/times.txt");
		
		String chaine;
		int i = 0;
		while ((chaine=br.readLine())!= null)
		{
			fw.write(secondToFulltime(i)+""+chaine+"\r\n");
			System.out.println(secondToFulltime(i)+" "+chaine);
			i++;
		} 
		fw.close();*/
		
		System.out.println(InsertTime.moment(64800));
	}
}