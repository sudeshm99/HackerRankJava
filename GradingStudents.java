import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudents{
	
	public static int[] GradingFun(int[] grades){
		int[] resultgrades = new int[grades.length];
		for(int i=0; i<grades.length; i++){
			if(grades[i]<38){
				resultgrades[i] = grades[i];
			}else{
				int val= (grades[i])%5;
				//System.out.println(val);
				int tempVal = grades[i]-val+5;
				if((tempVal-grades[i])<3){
					resultgrades[i] = tempVal;
				}else{
					resultgrades[i] = grades[i];
				}
			}
		}
		return resultgrades;
	}

    public static void main(String[] args){
		int[] sample = {4,73,67,38,33};
		int [] resultgrades = GradingFun(sample);
		System.out.println(gradesays.toString(resultgrades));
    }	

}