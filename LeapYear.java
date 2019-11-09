import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year year");
		String Year=sc.nextLine();
		
		if(Year.length()==4) {
		int n=Integer.parseInt(Year);
		   if((n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0)))
		   {
			   System.out.println("Year:"+ n + " is a leap year");		  
			   
		   }
		   else {  
				System.out.println("Year:"+ n + " is a not leap year");	
			}
		}
		else {
		   System.out.println("Year:"+ Year + " is not a valid  year");	

			  
			}
	}
		}
	
	

			  
		
		
	


