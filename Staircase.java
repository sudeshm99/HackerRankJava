import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Staircase{
	
	public static void stairCaseFun(int n){
		int count1=0;
		for(int i=0; i<n; i++){
			count1++;
			int count2 = n;
			for(int j=0; j<n; j++){
				if(count2>count1){
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
				count2--;				
			}
			System.out.println("");
		}
	}

    public static void main(String[] args){
		stairCaseFun(6);
    }	

}