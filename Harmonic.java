import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
System.out.println("Enter the nth harmonic number");
int n=sc.nextInt();
double sum=0;

if(n!=0) {
	for(double i=1; i<=n;i++) {
	sum+=1/i;	
	}
	System.out.println(sum);

}
else {
	System.out.println("Enter harmonic number more than 0");

	}

}
}

