package ifstatement;

import java.util.Scanner;
public class ForLoop 
{
    public static void main(String args[])
    {
        int  n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum * 10 + n;
            m = m / 10;
        }
        System.out.println("Reverse of the number:"+sum);
    }
}
