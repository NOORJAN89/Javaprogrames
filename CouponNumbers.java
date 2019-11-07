import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		System.out.println("Enter coupon number");
		int n=sc.nextInt();
		boolean[] iscollected= new boolean[n];
		int count=0, distinct=0;
		while(distinct<n) {
			int value=(int) (Math.random()*n);
			count++;
			  if (!iscollected[value]) {
	                distinct++;
	                iscollected[value] = true;
	            }
		}
		
		System.out.println(count );
	}

}
