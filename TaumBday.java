import java.util.Scanner;

class Result {

    /*
     * Complete the 'taumBday' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */
    public static long taumBday(int b, int w, int bc, int wc, int z)
    {
        // Write your code here
        long result;
        if( bc+z < wc)
            result = bc*(b+w)+w*z;
        else if ( wc+z < bc )
            result = wc*(b+w)+b*z;
        else
             result = b*bc + w*wc;
        return result;
    }

}

public class TaumBday {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {

            int b = sc.nextInt();
            int w = sc.nextInt();
            int bc = sc.nextInt();
            int wc = sc.nextInt();
            int z = sc.nextInt();
            long res = Result.taumBday(b, w, bc, wc, z);
            System.out.println("Res = "+res);
        }
        sc.close();
    }
}

