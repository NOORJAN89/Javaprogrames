import java.util.Scanner;

public class Quadratic {
	//Root 1 of x = (-b + sqrt(delta))/(2*a)
			//Root 2 of x = (-b - sqrt(delta))/(2*a)

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of a");
int a=sc.nextInt();
System.out.println("Enter the value of b");
int b=sc.nextInt();
System.out.println("Enter the value of c");
int c=sc.nextInt();

double delta=b*b-4*a*c;
double x1=(-b+Math.sqrt(delta))/(2*a);
double x2=(-b-Math.sqrt(delta))/(2*a);
System.out.println(x1);
System.out.println(x2);
	}

}
