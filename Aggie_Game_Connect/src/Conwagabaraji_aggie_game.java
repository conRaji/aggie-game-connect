/*
 *Chinenye Nwagbaraji, 10/02/2022
 *Class Section: COMP167002.202310
 *This Program is a multi-player game or a single player game that simulates connect 4. 
 */

import java.util.Scanner;
public class Conwagabaraji_aggie_game {
	public static void main (String [] args) {
// this is the menu that will printed so the user can pick what mode they want
		System.out.println("Welcome to Aggie Game");
		System.out.println("Select a mode for and Awesome game play!!");
		System.out.println("Eneter 1 or 2 please.");
		System.out.println("1). Computer play :|"); 
		System.out.println("2). Two Player play :)");
		System.out.println("3). Exit)");

		System.out.println("Enter here:");
		menu();
	}
// this method is being used so dictate or go to what the user is asking for. 
// this is the array and the size it will be 
	static char board_game[][] = new char[10][10];
	public static void menu() {
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
// This if for the menu to work according to what the user inputs
		switch(num) {
// this is for computer play with one player 		
		case 1:
			
			Conwagbaraji_Connect_methods.single_player(board_game);
	
			break;
// This is for 2 player where the user can play with someone else that is not the computer 
		case 2:
			Conwagbaraji_Connect_methods.double_player(board_game);
			break;
// This is just print done if the user want it 
		case 3:
			System.out.println("DONE!!");


		}
		

	}
}
