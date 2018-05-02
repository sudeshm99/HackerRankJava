import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MinMaxSum{
	
	public static void minMaxSumFun(int[] arr){
		long minSum = 0;
		long maxSum = 0;
		int min = arr[0];
		int max = arr[0];
		int minCount = 0;
		int maxCount = 0;
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			if(max<arr[i]){
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(min!=arr[i]){
				maxSum+=arr[i];
			}else{
				minCount++;
			}
			if(max!=arr[i]){
				minSum+=arr[i];
			}else{
				maxCount++;
			}
		}
		for(int k=minCount;k>1;k--){
			maxSum+=min;
		}
		for(int j=maxCount;j>1;j--){
			minSum+=max;
		}			
		System.out.println("minCount: "+minCount);
		System.out.println("maxCount: "+maxCount);		
		System.out.println(minSum+" "+maxSum);
	}

    public static void main(String[] args){
		int[] sample = {5,5,5,5,5};
		System.out.println("main");
		minMaxSumFun(sample);
		
    }	

}