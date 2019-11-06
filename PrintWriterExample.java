import java.io.*;
import java.util.Scanner;

public class PrintWriterExample
{
    public static void main(String args[]) throws IOException
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the numbser rows to printed");
    	int m=sc.nextInt();
    	System.out.println("enter the numbser columns to printed");
    	int n=sc.nextInt();
    	System.out.println("enter the elements");
    	int a[][]=new int[m][n];

    	for(int i=0; i<m; i++) {

    		for(int j=0; j<n; j++) {
    			a[i][j]=sc.nextInt();	
    		}
    	}

        PrintWriter outFile = new PrintWriter(System.out, true);
        double format = "(%d %d) \n";

            for (int i=0; i<m; i++)
            {
            	for(int j=0; j<n; j++) {
                    outFile.printf(format,a[i][j] );

        		}
            }
    }
}