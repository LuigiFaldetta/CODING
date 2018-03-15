package decimaltobinar.converter;

import java.util.Scanner;

public class DecimaltoBinarConverter 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       Double Dvalue;
       String Binall = ""; 
       
        System.out.println("Please enter a number to convert to binary:");
        Dvalue = input.nextDouble();
       
        
        while (Dvalue > 0 )
        {
        Dvalue = (Dvalue/2);
        if (Dvalue % 1 != 0)
                {
                    Binall = "1" + Binall;
                    Dvalue = (Dvalue - 0.5);
                }
        else
        {
        Binall = "0" + Binall;
        }
           
        }
        System.out.println("your Binary number is: " + Binall);
    }
    
}
