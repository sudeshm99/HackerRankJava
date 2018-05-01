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
            for(int j=i;j<a[i].length;j++){
              if(i==j){
                val1+=a[i][j];  
              }                 
            }
        }
        for(int i=3;i>0;i--){
            for(int j=i;j>0;j--){
                if(i==j){
                    val2+=a[i-1][j-1];
                }
            }
        }
        int val = val1-val2;
        int absVal = Math.abs(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val);
		System.out.println(absVal);
        return absVal;

    }
	
	
    public static void main(String[] args){
		int a[][] = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        int result = diagonalDifference(a);
		System.out.println(result);
    }	
}	