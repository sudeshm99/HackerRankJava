import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GetTotalXCount{
	
	public static int getTotalX(int[] a, int[] b) {
		int xCount = 0;
        int xVal;
        int aMax=a[0];
        int bMin=b[0];
        for(int i=1;i<a.length;i++){
            if(aMax<a[i]){
                aMax = a[i];
            }
        }
		
        for(int j=1;j<b.length;j++){
            if(bMin>b[j]){
                bMin = b[j];
            }
        }
		
        for(int k=aMax; k<=bMin; k++){
             boolean flagA = true;
             boolean flagB = true;            
            for(int i=0;i<a.length;i++){
                if((k%a[i])!=0){
                    flagA = false;
                }
            }
            if(flagA){
                for(int j=0;j<b.length;j++){
                    if((b[j]%k)!=0){
                        flagB = false;
                    }
                }
                if(flagB){
                    xCount++;
                }
            }
        }
        return xCount;
	}

    public static void main(String[] args){
		int[] a = {2,4};
		int[] b = {16,32,96};
		int outPut = getTotalX(a,b);
		System.out.println(outPut);
    }	

}