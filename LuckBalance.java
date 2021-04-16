class LuckBalance
{
	static int luckBalance(int k, int[][] contests) {
		int sum=0,diff=0;
	//Sorting Bubble Sort
		for(int j=0;j<contests.length-1;j++)
			for(int i=contests.length-1;i>0;i--)
				if(contests[i][0]<contests[i-1][0])
				{
					contests[i-1][0]=contests[i][0]+(contests[i][0]=contests[i-1][0])-contests[i-1][0];
					contests[i-1][1]=contests[i][1]+(contests[i][1]=contests[i-1][1])-contests[i-1][1];
				}
	//How many Important contest
		for(int i=0;i<contests.length;i++)
			sum+=contests[i][1];
		diff=sum-k;
		sum=0;
	//if important and have to win then luck value subtracted else added
		for(int i=0,j=0;i<contests.length;i++)
			if(j<diff && contests[i][1]==1 )
			{
				sum-=contests[i][0];
				j++;
			}
			else
				sum+=contests[i][0];
		return sum;
		}
 	
	public static void main(String[] args)
	{
		int k=3;
		int arr[][]={{5,1},{2,1},{1,1},{8,1},{10,0},{5,0}};
		System.out.println(LuckBalance.luckBalance(k,arr));
	}	
}