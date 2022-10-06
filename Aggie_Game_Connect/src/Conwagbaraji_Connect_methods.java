import java.util.Scanner;
import java.util.Random;

public class Conwagbaraji_Connect_methods {
// This method id being used to print the array 
	public static void print_board(char[][] board_game) {
		for (int row = 0; row<board_game.length; ++row) {
			System.out.print(row + " ");
			for (int col = 0; col<board_game[row].length; ++col) {
				System.out.print("[" + board_game[row][col] + "]" ); 
			}
			System.out.println();
		}


	}
//this is uses to fill the board with spaces 
	public static void fill_board(char[][] board_game) {

		for(int row = 0; row<board_game.length; ++row) {
			for(int col = 0; col < board_game[row].length; ++col) {
				board_game[col][row]= ' ';
			}
		}
	}
// this takes the user input an places an x where the user wants the inputs 
	public static void play_x(char[][] board_game) {
		System.out.println("Enter the cordinates of where you would like to place the X:");
		Scanner x = new Scanner(System.in);
		int cor1 = x.nextInt();// this is for the rows 
		int cor2 = x.nextInt(); // this is for the colomns 
		board_game [cor1][cor2] = 'x';
		check_x(board_game, cor1, cor2);// this is the method that checks if the user or the comp has 4 in a row 

		





	}
	// this is the computer that the user will play against
	public static void comp_play(char[][] board_game) {
		System.out.println("Computer is making its term....");
		Random rand = new Random();
		int cor1 = rand.nextInt(10);//This is for the rows
		int cor2= rand.nextInt(10);//This is for the colomns
		board_game[cor1][cor2] = 'x';
		check_x(board_game, cor1, cor2);// this is the method that checks if the user or the comp has 4 in a row 

		




	}
	//This is the method that will bring all the other methods together to makes the single player game 
	public static void single_player(char[][] board_game) {
		fill_board(board_game);// this makes the board 
		while (true) {
			print_board(board_game);//print the board
			play_x(board_game);//this is the user turn and where they play
			comp_play(board_game);// this is the computer

		}
	}
	//This is for the 2 player mode and it takes the inputs for the first if the two players
	public static void play_x_two_firstPlayer(char[][] board_game) {
		System.out.println("Enter the cordinates of where you would like to place the X Player 1 :");
		Scanner x = new Scanner(System.in);
		int cor1 = x.nextInt();//this is for the rows
		int cor2 = x.nextInt(); //this is for the rows
		board_game [cor1][cor2] = 'x';
		check_x(board_game, cor1, cor2);// this is the method that checks if the user or the comp has 4 in a row 

		
	}
	//This is for the 2 player mode and it takes the inputs for the second if the two players
	public static void play_x_two_secondPlayer(char[][] board_game) {
		System.out.println("Enter the cordinates of where you would like to place the X Player 2:");
		Scanner x = new Scanner(System.in);
		int cor1 = x.nextInt();//this is for the rows
		int cor2 = x.nextInt(); //this is for the rows
		board_game [cor1][cor2] = 'x';
		check_x(board_game, cor1, cor2);// this is the method that checks if the user or the comp has 4 in a row 

		
	}
	public static void double_player(char[][] board_game) {
		fill_board(board_game);//this makes the  board and fills it with spaces 
		while (true) {
			print_board(board_game);// this makes the board 
			play_x_two_firstPlayer(board_game);// this gets the input of the first of the 2 players 
			print_board(board_game);// this reprints the board 
			play_x_two_secondPlayer(board_game);// this gets the input of the second of the 2 players 
			

		}
	}
	//This is the method that checks if there is  4 in a row in any of the the modes 
	public static Boolean check_x(char[][] board_game, int cor1, int cor2){
		if (cor1 + 1 < 10 && cor1 + 2 < 10 && cor1 + 3 < 10 && board_game[cor2][cor1 + 1] == 'x' && board_game[cor2][cor1 + 2] == 'x' && board_game[cor2][cor1 + 3] == 'x') {
			System.out.println("GAME OVER!! WINNER!!!!!");// horizontal right
			return true;
			} 
		else if (cor1 - 1 > -1 && cor1 - 2 > -1 && cor1 - 3 > -1 && board_game[cor2][cor1 - 1] == 'x' && board_game[cor1][cor2 - 2] == 'x'

				&& board_game[cor2][cor1 - 3] == 'x') {

			System.out.println("GAME OVER!! WINNER!!!!!");// horizontal right

			return true;



		} else if (cor2 + 1 < 10 && cor2 + 2 < 10 && cor2 + 3 < 10 && board_game[cor2 + 1][cor1] == 'x' && board_game[cor2 + 2][cor1] == 'x'

				&& board_game[cor2 + 3][cor1] == 'x') {

			System.out.println("GAME OVER!! WINNER!!!!!");// vertical up

			return true;



		} else if (cor2 - 1 > -1 && cor2 - 2 > -1 && cor2 - 3 > -1 && board_game[cor2 - 1][cor1] == 'x' && board_game[cor2 - 2][cor1] == 'x'

				&& board_game[cor2 - 3][cor1] == 'x') {

			System.out.println("GAME OVER!! WINNER!!!!!");// vertical bottom

			return true;



		} else if (cor1 + 1 < 10 && cor1 + 2 < 10 && cor1 + 3 < 10 && cor2 + 1 < 10 && cor2 + 2 < 10 && cor2 + 3 < 10

				&& board_game[cor2 + 1][cor1 + 1] == 'x' && board_game[cor2 + 2][cor1 + 2] == 'x' && board_game[cor2 + 3][cor1 + 3] == 'x') {

			System.out.println("GAME OVER!! WINNER!!!!!"); // diagonal bottom left

			return true;

		} else if (cor1 - 1 > -1 && cor1 - 2 > -1 && cor1 - 3 > -1 && cor2 - 1 > -1 && cor2 - 2 > -1 && cor2 - 3 > -1

				&& board_game[cor2 - 1][cor2 - 1] == 'x' && board_game[cor2 - 2][cor1 - 2] == 'x' && board_game[cor2 - 3][cor1 - 3] == 'x') {

			System.out.println("Winner! Game over"); // diagonal bottom right

			return true;

		} else if (cor1 + 1 < 10 && cor1 + 2 < 10 && cor1 + 3 < 10 && cor2 - 1 > -1 && cor2 - 2 > -1 && cor2 - 3 > -1

				&& board_game[cor2 - 1][cor1 + 1] == 'x' && board_game[cor2 - 2][cor1 + 2] == 'x' && board_game[cor2 - 3][cor1 + 3] == 'x') {

			System.out.println("GAME OVER!! WINNER!!!!!");// diagonal top left

			return true;

		} else if (cor1 - 1 > -1 && cor1 - 2 > -1 && cor1 - 3 > -1 && cor2 + 1 < 10 && cor2 + 2 < 10 && cor2 + 3 < 10

				&& board_game[cor2 + 1][cor1 - 1] == 'x' && board_game[cor2 + 2][cor1 - 2] == 'x' && board_game[cor2 + 3][cor1 - 3] == 'x') {

			System.out.println("GAME OVER!! WINNER!!!!!");// diagonal top right

			return true;

		} else{ 



			return false;

			



	}// end findWinner


		
}
}




