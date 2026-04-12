import java.io.*;
import java.util.Scanner;
import java.util.Arrays;


public class Main
{
    public Main()
    {
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("DATA12.txt"));
            for (int z = 0; z < 10; z++)
            {
                int numTriads = Integer.parseInt(br.readLine());
                for (int x = 0; x < numTriads; x++)
                {
                    int n1 = Integer.parseInt(br.readLine());
                    int n2 = Integer.parseInt(br.readLine());
                    int n3 = Integer.parseInt(br.readLine());
                    
                    int[] arr = {n1, n2, n3};
                    Arrays.sort(arr);
                    
                    System.out.print(arr[1] + " ");
                }
                System.out.println();
                
            }
        }
        catch(IOException e){
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        Main m = new Main();
    }

}
