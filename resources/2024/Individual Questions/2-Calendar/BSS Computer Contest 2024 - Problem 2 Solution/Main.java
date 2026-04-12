import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br = new BufferedReader(new FileReader("DATA22.txt"));
            for (int x = 0; x < 10; x++)
            {
                //put "Enter day:"
                int s = Integer.parseInt(br.readLine());
                //put "Enter the number of days in the month:"
                int n = Integer.parseInt(br.readLine());
                System.out.println("Sun Mon Tue Wed Thr Fri Sat");
                
                if (s == 1)
                {
                    System.out.print("  ");
                }
                
                for (int i = 1; i < s; i++)
                {
                    if (i == 1) 
                        System.out.print("   ");
                    else
                        System.out.print("    ");
                }
                
                boolean isFirst = true;
                for (int i = 1 ; i <= n; i++)
                {
                    if (s == 1 && i > 9 && !isFirst) 
                        System.out.print(" " + i);//i : 3 ..
                    else if (s == 1 && i == 9 && !isFirst) 
                        System.out.print("  " + i);
                    else if (s == 1 && i < 9 && isFirst)
                        System.out.print(i);
                    else if (s == 1 && i < 9 && !isFirst) 
                        System.out.print("  " + i);//i : 3 .
                    else if (i > 9)
                        System.out.print("  " + i);
                    else
                        System.out.print("   " + i);//i : 4 ..
                        
                    s = s + 1;
                    if (s > 7)
                    {
                        System.out.println("");
                        s=1;
                        isFirst = false;
                    }
                }
                System.out.println("");
                System.out.println("");
            }
            
        }
        catch(IOException e){
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }
}
