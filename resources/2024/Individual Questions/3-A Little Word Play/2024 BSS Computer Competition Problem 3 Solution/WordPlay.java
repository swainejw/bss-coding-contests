import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordPlay
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br = new BufferedReader(new FileReader("DATA32.txt"));
        
            for (int i = 0; i < 10; i++)
            {
                String s = br.readLine();
                char thechar = s.charAt(0);
                String targ = br.readLine();
                            
                char[] letters = targ.toCharArray();
                
                char[][] grid = new char[letters.length][letters.length];
                
                for (int x = 0; x < grid.length; x++)
                {
                    for (int y = 0; y < grid[x].length; y++)
                    {
                        grid[x][y] = thechar;
                    }
                }
                
                for (int x = 0; x < letters.length; x++)
                {
                    grid[x][x] = letters[x];
                    grid[x][grid.length - x - 1] = letters[letters.length - x - 1];
                }
               
                if (letters.length % 2 == 1)
                {
                    for (int x = 0; x < letters.length; x++)
                    {
                        grid[letters.length/2][x] = letters[x];
                        grid[x][letters.length/2] = letters[x];
                    }
                }
                
                for (int x = 0; x < grid.length; x++)
                {
                    for (int y = 0; y < grid[x].length; y++)
                    {
                        System.out.print(grid[x][y]);
                    }
                    System.out.println();
                }
                
                System.out.println();
            }
        }
        catch (IOException e)
        {}
    }
}
