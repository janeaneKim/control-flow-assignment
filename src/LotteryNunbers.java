import java.util.Scanner;

public class LotteryNunbers {
	
	//methods to check if number is within range of numbers
	public static boolean checkLottery(int number) {
		if (number <= 65 && number >= 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkMagicBall(int number) {
		if (number <= 75 && number >= 1) {
			return true;
		} else {
			return false;
		}
	}
	
	//methods to change numbers back to range if out of range
	public static int getLottery(int number) {
		if(number > 65) {
			return (number - 65);
		}else if(number <1) {
			return (number  +65);
		}else {
			return number;
		}
	}
	
	public static int getMagicBall(int number) {
		if(number > 75) {
			return (number - 75);
		}else if(number < 1) {
			return (number  +75);
		}else {
			return number;
		}
	}

	public static void main(String[] args) {
		
		int[] answers = new int[6];
		int[] lotteryNumbers = new int[6];		
		int magicBall;
		String runAgain = "placeholder";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String name = input.nextLine();
		System.out.println("Hello " + name + "...");
		System.out.println("Would you like to answer questions?");
		String response = input.nextLine();
		
		while (runAgain.toLowerCase().contains("n") ==  false) {
			if (response.toLowerCase().charAt(0) == 'y') {
				System.out.println("What is your favorite ice cream flavor?");
				String iceCream = input.nextLine();
				int ascii1 = (int)iceCream.charAt(2);
				answers[0] = ascii1; 
				
				System.out.println("What is the name of your favorite pet?");
				String pet = input.nextLine();
				int ascii2 = (int)pet.charAt(1);
				answers[1] = ascii2;
				
				
				System.out.println("What is the age of your favorite pet (whole numbers only)?");
				int petAge = input.nextInt();
				answers[2] = petAge;
				
				System.out.println("What is the two-digit model year of your car?");
				int carModelYear = input.nextInt();
				answers[3]  = carModelYear;
				
				input.nextLine();
				
				System.out.println("What is the first name of your favorite actor/actress?");
				String actName = input.nextLine();
				int ascii3 = (int)actName.charAt(actName.length() -1);
				answers[4] = ascii3;
				
				System.out.println("Pick a number between 1 and 50 (whole numbers only)");
				int luckyNumber = input.nextInt();
				answers[5] = luckyNumber;
			
				//generating lucky numbers
				lotteryNumbers[0] = ascii1;
				lotteryNumbers[1] = (int) Math.floor(carModelYear * luckyNumber/ascii1);
				lotteryNumbers[2] = ascii3 + ascii1;
				lotteryNumbers[3] = carModelYear + petAge;
				lotteryNumbers[4] = 42 + luckyNumber;
				lotteryNumbers[5] = ascii2 + carModelYear;
				
				magicBall = luckyNumber * ascii3;
				
				//accessing static methods outside main to check if numbers are valid
				for (int i = 0; i < lotteryNumbers.length; ++i) {
					if (checkLottery(lotteryNumbers[i])) {
						continue;
					} else {
						do {
							int newLotteryNum = getLottery(lotteryNumbers[i]);
							lotteryNumbers[i] = newLotteryNum;
						} while(checkLottery(lotteryNumbers[i]) == false);
					}
				}
				
				
				if (checkMagicBall(magicBall)) {
					return;
				} else {
					do {
						int newMagicBall = getMagicBall(magicBall);
						magicBall = newMagicBall;
					} while(checkMagicBall(magicBall) == false);
					
				}
				
				System.out.println("Lottery Numbers: " + lotteryNumbers[0] + " " + lotteryNumbers[1] + " " + + lotteryNumbers[2] + " " + lotteryNumbers[3] + " " + lotteryNumbers[4] + " " + lotteryNumbers[5]);
				System.out.println("Magic ball: " + magicBall );
				
				System.out.println("Would you like to play again?");
				input.nextLine();
				
				runAgain = input.nextLine();
				
			} else {
					System.out.println("Ok, come back later :)") ;
					}	
		}
	}
}
