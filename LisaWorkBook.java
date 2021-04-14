import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LisaWorkBook {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr)
    {
        int count=0,problem,pages=0;
        for(int i=0;i<arr.length;i++)
        {
            int val=0;
            problem=0;
            while(arr[i]>0)
            {
                pages++;
                if(arr[i]-k>0)
                    val=k;
                else
                    val=arr[i];
                for(int j=1;j<=val;j++)
                {
                    if(++problem == pages)
                    {
                        count++;
                        problem+=val-j;
                        break;
                    }
                }
                arr[i]-=k;
            }       
        }
        return count;
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int result = workbook(n, k, arr);
        System.out.print(result);
        sc.close();
    }
}