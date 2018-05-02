import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion{
	
	public static String timeConversion(String s){
		String[] parts = s.split(":");
		String part1 = parts[0];
		String part2 = parts[1];
		String part3 = parts[2];
		String P = "P";
		Boolean flag = false;
		String formatTime;
		Integer IntVal = Integer.valueOf(part1);
		if(part3.charAt(2)==P.charAt(0)){
			IntVal+=12;
		}else{
			if(part1.equals("12")){
				flag = true;
			}
		}
		String newPart3 = part3.substring(0,2);
		if(flag){
			formatTime = "00:"+part2+":"+newPart3;
		}else{
			formatTime = String.valueOf(IntVal)+":"+part2+":"+newPart3;	
		}		
		return formatTime;
	}

    public static void main(String[] args){
		String a = "06:40:03AM";
		String time = timeConversion(a);
		System.out.println(time);
    }	

}