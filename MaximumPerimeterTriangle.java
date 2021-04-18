import java.util.Arrays;

class MaximumPerimeterTriangle
{
    
 	static int[] maximumPerimeterTriangle(int[] sticks)
    {
    	Arrays.sort(sticks);
    	int max=-1,perimeter=-1,a=-1,b=-1,c=-1;
        for(int i=sticks.length-3;i>=0;i--)
        {
            a=sticks[i];
            b=sticks[i+1];
            c=sticks[i+2];
            
            if(a+b>c)
            {
                if(a+b+c>perimeter)
                {
         			perimeter=a+b+c;		       	
                	int arr[]=new int[3];
				    arr[0]=a;
				    arr[1]=b;
				    arr[2]=c;
				    return arr;
                } 
    		}
    	}
    	int arr[]=new int[1];
        arr[0]=-1;
        return arr;
    }
	public static void main(String[] args)
	{
		int arr[]={1,1,1,3,3};
		int array[]=MaximumPerimeterTriangle.maximumPerimeterTriangle(arr);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
}