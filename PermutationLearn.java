 import java.util.*;
class PermutationLearn
{
	private static void swap(char[] a,int i,int j)
	{
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void permutation(char[] arr,int i,int n)
	{
		if(i==n)
			System.out.println(arr);
		else
			for(int j=i;j<n;j++)
			{
				swap(arr,i,j);
				permutation(arr,i+1,n);
				swap(arr,i,j);
			}
	}
	
	public static void main(String[] args)
	{
		char arr[]="123".toCharArray();
		permutation(arr,0,arr.length);
	}
}