import java.util.Scanner;

public class TicTocToe {

public static Scanner sc= new Scanner(System.in);
public static int player = 0;
public static boolean isEmpty = true;
public static int row, column;
public static char[][] board= new char[3][3];
public static char turn='X';

	public static void                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      main(String[] args) {
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]='_';
			}
			
		}
		play();		
	}
	
public static void play() {
	
	boolean playing=true;
	printboard();
	while (playing) {
		System.out.println("enter a row");
		row=sc.nextInt();
		System.out.println("enter a column");
		column=sc.nextInt();
		board[row][column]=turn;
		if(!(gameover( row,  column))){
			playing=false;
			
			System.out.println("game over! palyer "+turn+" wins");

		}
		printboard();
		if (turn=='X') {

		 turn='O';

		}
			else {

				turn='X';

			}
			
				

		}
	}


	
	
	
 public static void printboard() {
	
	for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();

	}
	
	}




 static boolean gameover(int rmove, int cmove) {
	if((board[0][cmove]==board[1][cmove]) && (board[0][cmove]==board[2][cmove]))
	return true;
	if((board[rmove][0]==board[rmove][1]) && (board[rmove][0]==board[rmove][2]))
	return true;
	if((board[0][0]==board[1][1])&& (board[0][0]==board[2][2]))
	return true;
	if((board[0][2]==board[1][1]) && (board[0][2]==board[2][0]))
	return true;
	
	return false;
	}

}
	

