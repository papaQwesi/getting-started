import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class AbsoluteSum {
    
    public static void main(String[] args) {
        
            int sumEven = 0;
        int sumOdd = 0;
        int total = 0;
        int absvalue = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Scanner input = new Scanner(System.in);
        String val;
        try {
            val = br.readLine();
        

            String[] str = val.trim().split("\\s+");

            int[] array = new int[str.length];
            for (int i = 0; i <= str.length-1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }

             for (int i = 0; i <= array.length-1; i++) {
                if ((array[i] % 2) == 0) {
                    sumEven = sumEven + array[i];
                } else {
                    sumOdd = sumOdd + array[i];
                }

            }
            total = sumEven - sumOdd;

            absvalue = Math.abs(total);

            System.out.println("the absolute value is : "+absvalue);
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
