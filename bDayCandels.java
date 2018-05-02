import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class bDayCandels{
	
	public static int bDayCandelsFun(int n, int[] ar){
        int count = 0;
        int maxhight = ar[0]; 
        for(int i=0;i<n;i++){
            if(maxhight<ar[i]){
                maxhight=ar[i];
            }
        }
        for(int j=0;j<n;j++){
            if(maxhight==ar[j]){
               count++; 
            }
        }
        return count;
	}

    public static void main(String[] args){
		int[] arr = {18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
		int count = bDayCandelsFun(10,arr);
		System.out.println(count);
    }	

}