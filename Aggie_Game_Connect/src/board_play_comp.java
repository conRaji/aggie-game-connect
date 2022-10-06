import java.util.Scanner;

public class board_play_comp {
	
	public static void play_game_more(int x, int y, char [][] board_connect) {
		System.out.println("Enter the column you would like to place your X: ");

		System.out.println("Enter the row you would like to place the X:");
		Scanner input = new Scanner(System.in);
		for (x = 0; x < 10; x++) {
			for (y = 0; y <10; x++) {
				board_connect [x][y] = (char) input.nextInt();				}
		}

	}

	





}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

