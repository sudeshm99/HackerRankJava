import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudents{
	
	public static int[] GradingFun(int[] arr){
		int[] resultArr = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<38){
				resultArr[i] = arr[i];
			}else{
				int val= (arr[i])%5;
				//System.out.println(val);
				int tempVal = arr[i]-val+5;
				if((tempVal-arr[i])<3){
					resultArr[i] = tempVal;
				}else{
					resultArr[i] = arr[i];
				}
			}
		}
		return resultArr;
	}

    public static void main(String[] args){
		int[] sample = {4,73,67,38,33};
		int [] resultArr = GradingFun(sample);
		System.out.println(Arrays.toString(resultArr));
    }	

}