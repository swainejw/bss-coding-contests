import java.io.IOException;
import java.io.BufferedReader;
import java.io.*;

public class Main {
    static boolean[] motel = new boolean[7001];
    static long[] ways = new long[7001];
    static int minn, maax, n;

    public static void main(String[] args) {
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("DATA41.txt"));
        
            for (int x = 0; x < 10; x++)
            {
            
                // Initialize motels
                for (int i = 0; i <= 7000; i++) {
                    motel[i] = false;
                }
                motel[0] = true;
                motel[990] = true;
                motel[1010] = true;
                motel[1970] = true;
                motel[2030] = true;
                motel[2940] = true;
                motel[3060] = true;
                motel[3930] = true;
                motel[4060] = true;
                motel[4970] = true;
                motel[5030] = true;
                motel[5990] = true;
                motel[6010] = true;
                motel[7000] = true;
        
                // Get input
                minn = Integer.parseInt(br.readLine());
                maax = Integer.parseInt(br.readLine());
                n = Integer.parseInt(br.readLine());
                if (n == 0)
                {
                    for (int i = 0; i < n; i++) {
                        int d = 0;
                        motel[d] = true;
                    }
                }
                else
                {
                    for (int i = 0; i < n; i++) {
                        int d = Integer.parseInt(br.readLine());
                        motel[d] = true;
                    }    
                }
        
                // Calculate ways
                ways[0] = 1;
                for (int i = 1; i <= 7000; i++) {
                    if (motel[i]) {
                        ways[i] = 0;
                        int a = i - maax;
                        if (a < 0) {
                            a = 0;
                        }
                        for (int j = a; j <= i - minn; j++) {
                            if (motel[j]) {
                                ways[i] += ways[j];
                            }
                        }
                    }
                }
        
                System.out.println(ways[7000]);
            }
            
        }
        catch (IOException e)
            {}
    }
}