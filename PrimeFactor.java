import java.util.Scanner;

public class PrimeFactor{

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println(" Enter the number");
int num=sc.nextInt();
System.out.print("prime factors are ");
for(int i=2; i<num; i++)
{
	
    if(num%i == 0)
    {
       
        System.out.print(i+" ");
    }
}
if(num% 2!= 0) {
	  System.out.println(1+" "+num);
}

}
	

}
