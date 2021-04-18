import java.util.TreeSet;
class ManasaAndStones
{
	public static int[] stones(int n,int a,int b)
	{
        TreeSet<Integer> set=new TreeSet();
        for(int i=0,j=n-1;i<=n-1;i++,j--)
            set.add(a*i+b*j);
        int arr[]=new int[set.size()],i=0;
        for(Integer val:set)
            arr[i++]=val;
        return arr;
	}
	public static void main(String[] args)
	{
		int a[]=stones(4,10,100);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}