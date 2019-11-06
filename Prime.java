import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println(" Enter the number");
int num=sc.nextInt();
System.out.print("prime factors are ");
for(int i=2; i*i<num; i++)
{
	
    if(num%i == 0)
    {
       
        System.out.print(i+" ");
    }
}

}
	

}
