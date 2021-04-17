//https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
class TheLoveLetterMystery
{
   static int theLoveLetterMystery(String s)
   {
   		int count=0;
   		for(int i=0,j=s.length()-1;i<j;i++,j--)
   			count+=Math.abs(s.charAt(i)-s.charAt(j));
   		return count;
   }
    public static void main(String[] args)
    {
    	String s="abcd";
    	System.out.println(TheLoveLetterMystery.theLoveLetterMystery(s));
    }
}
