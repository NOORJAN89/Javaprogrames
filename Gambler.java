import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Eneter $Stake value");
int Stake=sc.nextInt();
System.out.println("Eneter $Goal value");
int Goal=sc.nextInt();
System.out.println("Eneter the number of Trails ");
int Trails=sc.nextInt();
int bets=0, wins=0;

for (int t = 0; t < Trails; t++) {

    int cash = Stake;
    while (cash > 0 && cash < Goal) {
        bets++;
        if (Math.random() < 0.5) cash++;     
        else                     cash--;     
    }
    if (cash == Goal) wins++;                
}



System.out.println("wins "+ wins+" out of trails "+Trails);
System.out.println("Percent of games won = " + 100 * wins / Trails);
System.out.println("Avg # bets           = " +bets/ Trails);

	}
	}


