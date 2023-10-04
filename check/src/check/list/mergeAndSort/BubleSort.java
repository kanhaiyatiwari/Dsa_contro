package check.list.mergeAndSort;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class BubleSort {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());                // Reading input from STDIN
     String[]a=br.readLine().split(" ");
     int[]arr=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=Integer.parseInt(a[i]);
     }
     sort(arr,n);
     System.out.println(Arrays.toString(arr));
    }
    
    public static void sort(int[]arr,int N){
        for(int i=0;i<N-1;i++){
        
        for(int j=0;j<N-i-1;j++){
            if(arr[j]>arr[j+1]){
                int  temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    }
}
