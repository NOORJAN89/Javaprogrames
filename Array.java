import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array {
	
	static Scanner sc=new Scanner(System.in);
	
	 public static int[][] arrayint(int m1, int n1){
		 int a[][]=new int[m1][n1];

		 for(int i=0; i<m1; i++) {

		 	for(int j=0; j<n1; j++) {
		 		a[i][j]=sc.nextInt();	
		 	}
		 }
		 return a;
		 }

	 public static void display(int[][] a, int m, int n) {
			PrintWriter pw = new PrintWriter(System.out,true);
			pw.println("2D ARRAY INTEGER");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					pw.print(a[i][j] + " ");
				}
				pw.println("\t");
			}
	 }
	public static void main(String[] args) {

System.out.println("enter the numbeer rows to printed");
int m=sc.nextInt();
System.out.println("enter the numbeer columns to printed");
int n=sc.nextInt();
System.out.println("enter the elements");

int[][] a= arrayint(m, n);
display(a,m,n);
	
}
}	


