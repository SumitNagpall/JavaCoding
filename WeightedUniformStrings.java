import java.util.ArrayList;

public class WeightedUniformStrings
{

    // Complete the weightedUniformStrings function below.
    public static String[] weightedUniformStrings(String s, int[] queries)
    {
    	ArrayList<Integer> a=new ArrayList<Integer>();
    	int sum=0;
    	for(int i=0;i<s.length();i++)
    	{
    		sum=s.charAt(i)-96;
    		a.add(sum);
    		//System.out.print(s.charAt(i));
    		while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)  )//abccddde
    		{
    			sum+=s.charAt(i)-96;
    			a.add(sum);
    		//	System.out.print(s.charAt(i));
    			i++;
    		}
    		//System.out.println();
    		sum=0;
    	}
    	String result[]=new String[queries.length];
    	for(int i=0;i<queries.length;i++)
    		if(a.contains(queries[i]))
    			result[i]="Yes";
    		else
    			result[i]="No";
    	return result;
    }
    public static void main(String[] args)
    {
    	String s="abccddde";
    	int queries[]={6,1,3,12,5,9,10};
    	String[] res=weightedUniformStrings(s,queries);
    	for(String result:res)
	    	System.out.print(result+" ");
    }
}