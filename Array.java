import java.io.PrintWriter;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
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

for(int k=0; k<m; k++) {

	for(int l=0; l<n; l++) {
		System.out.print(a[k][l]+ " ");	
	}
	
	System.out.println();

}





	}

}
