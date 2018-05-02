import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        /*
         * Write your code here.
         */
        int val1=0;
        int val2=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
              if(i==j){
                val1+=a[i][j];  
				
              }                 
            }
        }
        for(int i=0;i<a.length;i++){
			int val=0;
            for(int j=a[i].length;j>=(a[i].length-i);j--){					
                    val=a[i][j-1];
                }
				val2+=val;          
        }
        int Finalval = val1-val2;
        int absVal = Math.abs(Finalval);
        return absVal;

    }
	
	
    public static void main(String[] args){
		int a[][] = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        int result = diagonalDifference(a);
		System.out.println(result);
    }	
}	