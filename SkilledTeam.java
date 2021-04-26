import java.util.Arrays;
class SkilledTeam
{
	public static int skilledTeam(int arr[])
	{
		int maximum=-1,count=0,j=0;
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--)
		{
			j=i;
			while(j>=0&&arr[i]-arr[j--]<=5)
				count++;
			if(count>maximum)
				maximum=count;
			count=0;
		}
		return maximum;
	}
	public static void main(String[] args)
	{
		int arr[]={1,10,17,12,15,2};
		System.out.println(SkilledTeam.skilledTeam(arr)); 
	}
}