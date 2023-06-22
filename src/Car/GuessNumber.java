package Car;

import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class GuessNumber {
	
	int theNUMBER;
	int max;
	Scanner scanner = new Scanner(System.in);
	
	public void GuessTheNumber() {
		Random rand = new Random();
		max = 100;
		theNUMBER = Math.abs(rand.nextInt() % (max +1));
	}
	
	public void play() {
		while(true) {
			int move = scanner.nextInt();
			if (move > theNUMBER) {
				System.out.println("YOur number is too big");
			} else if (move < theNUMBER) {
				System.out.println("YOur number is too small");
			} else {
				System.out.println("YOu got it ");
				break;
			}
		}
	}
	
	// static = class method: No instance needed to use this function
	public static void howBigIsMyNumber(int x) {
		if (x >=0 && x <=10) {
			System.out.println("Our number is pretting small");
		} else if (x >= 11 && x <= 100) {
			System.out.println("Our number is pretty big");
		} else {
			System.out.println("Our number is out of range");
		}
	}
	
	
	public static void main(String[] args) {
		//howBigIsMyNumber(19);
		
		GuessNumber guessGame = new GuessNumber();
		guessGame.play();
		
	}

}
