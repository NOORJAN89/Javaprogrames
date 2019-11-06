import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of times you want to flip a coin");
int flips=sc.nextInt();
int heads = 0;
int tails = 0;
int counter=0;
double percentHeads,percentTails; 

while(counter <= flips) {
	
	if(Math.random()<=0.5) {
	
		System.out.println("Heads");
		heads++;
	}
	else {
		System.out.println("tails");
		tails++;
	}
	counter++;
}

percentHeads = heads/flips*100;

percentTails = (flips-heads)/flips*100;

System.out.println("theentage of heads is: " +percentHeads);

System.out.println("theentage of tails is: " +percentTails);

	}
}







