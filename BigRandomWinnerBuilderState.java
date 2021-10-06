import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: BigRandomWinnerBuilderState.java
 * 
 * The user will go through a menu to customized their own hand bag.
 * Also, if the user wants, it can be randomized by the program to create their hand bag.
 */
public class BigRandomWinnerBuilderState implements State {
	// Initialized varibales and objects
	Scanner sc = new Scanner(System.in);
	String brand, strap, material, color, decorations;
	MysteryHandBagMachine mhbm;
	HandBagBuilder hbBuilder = new HandBagOptionsBuilder();

	public BigRandomWinnerBuilderState(MysteryHandBagMachine mhbm) {
		this.mhbm = mhbm;
	}

	public void insertMoney() {
		System.out.println("Let me give your Mystery Hand Bag first before inserting more money.");
	}

	public void ejectMoney() {
		System.out.println("I'm serious. Let me give your Mysterby Hand Bag first.");
	}

	public void confirmPurchase() {
		System.out.println("Stop trying to confirm. You're not gonna get another one.");
	}

	// message to the user
	void message() {
		System.out.println("\nYou might be wondering what have you won right?! "
				+ "You get to customize your own handbag!");
	}
	
	// menu displayed to user
	Integer showMenuHB() {
		// Initialized object and variables
		Scanner hb = new Scanner(System.in);
		int choice = 0;
		boolean done = false;
		/*
		 * try-catch inside do-while
		 * If the user were to type in letters or a number outside of the menu
		 * it will give the user a message
		 */
		do {
			try {
				System.out.println("\nPlease select what would you like to customize!");
				System.out.println("1. Brands");
				System.out.println("2. Types");
				System.out.println("3. Material");
				System.out.println("4. Straps");
				System.out.println("5. Colors");
				System.out.println("6. Decorations");
				System.out.println("7. Done");
				System.out.print("Please choose from the following: ");
				choice = hb.nextInt();
				if (choice > 7) {
					System.out.println("Please choose a number in the menu.");
					hb.reset();
				} else {
					done = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("You don't type in text, you type in a number. Please try again.");
				hb.reset();
				hb.next();
			}
		} while (done != true);
		
		return choice;
	}
	
	// displays the body for dispensing the handbags.
	void dispenseBody(int choice) {
		int menuChoice = 0;
		String brand = "", bag = "", material= "", strap = "", color = "", decor = "";
		boolean done = false;
		/*
		 * if-else statements inside a do-while inside if-else statements
		 * if-statements to determine the first set of options in the first menu and for the customize menu
		 * do-while which goes through the handbag menu until user inputs 7 to quit/done
		 */
		if (choice == 1) {
			do {
				menuChoice = showMenuHB();
				if (menuChoice == 1) {
					System.out.print("Type in what brand would you like (Example: Dior, Gucci): ");
					brand = sc.nextLine();
				} else if (menuChoice == 2) {
					System.out.print("Type in what type of bag would you like (Examples: Tote Bag, Shoulder Bag, Satchel: ");
					bag = sc.nextLine();
				} else if (menuChoice == 3) {
					System.out.print("Type in what material would you like (Example: Cotton, Leather, Plastic): ");
					material = sc.nextLine();
				} else if (menuChoice == 4) {
					System.out.print("Type in what the length of strap you would like (Example: Short, Medium, Long): ");
					strap = sc.nextLine();
				} else if (menuChoice == 5) {
					System.out.print("Type in what color would you like (Example: Blue, Red, White): ");
					color = sc.nextLine();
				} else if (menuChoice == 6){
					System.out.print("Type in what decorations you want on your hand bag: ");
					decor = sc.nextLine();
				} else if (menuChoice == 7) {
					System.out.println("You're bag will be prepared shortly!");
					done = true;
				} else {
					System.out.println("That is not a valid option. Please choose a number");
				}
			} while (done != true);
			
			// hb object assigns itself the list of options from hbBuilder
			HandBag hb = hbBuilder.addBrand(brand).addType(bag).addMaterial(material).addStrap(strap).addColor(color).addDecorations(decor).hbBuilder();
			hb.prepare();
			System.out.println(hb);
			System.out.println("Press Enter to continue.");
			sc.nextLine();
			mhbm.bigWinnerReleaseHandBag();
			if (mhbm.getCount() > 0) {
				mhbm.setState(mhbm.getPaymentNotGivenState());
			} else {
				System.out.println("All Hand bags have been sold.");
				mhbm.setState(mhbm.getSoldOutState());
			}
		} else if (choice == 2) {
			// program creates the user a hand bag randomly
			HandBag hb = hbBuilder.addBrand().addType().addMaterial().addStrap().addColor().addDecorations().hbBuilder();
			hb.prepare();
			System.out.println(hb);
			System.out.println("Press Enter to continue.");
			sc.nextLine();
			mhbm.bigWinnerReleaseHandBag();
			if (mhbm.getCount() > 0) {
				mhbm.setState(mhbm.getPaymentNotGivenState());
			} else {
				System.out.println("All Hand bags have been sold.");
				mhbm.setState(mhbm.getSoldOutState());
			}
		} else if (choice == 3) {
			System.out.println("Well I guess you're not getting anything then.");
			mhbm.setState(mhbm.getPaymentNotGivenState());
		}
	}
	public void dispenseMysteryBag() {
		// Initialized Variables
		int ch = 0;
		System.out.println("\n*-----Hand bag Selection -----*");
		boolean done = false;
		do {
			try {
				System.out.println("1. Customize your own Handbag.\n2. Program Customizes your Handbag\n3. I don't want to customize.");
				System.out.print("Please choose a number: ");
				ch = sc.nextInt();
				sc.nextLine();
				dispenseBody(ch);
				done = true;
				
			} catch (InputMismatchException e) {
				System.out.println("You typed in something wrong right? Please try again..and choose a number this time.\n");
				sc.reset();
				sc.next();
			}
		} while (done != true);
	}
	public void magicallyRefill() {}
	
	public String toString() {
		return "dispensing a customized hand bag made by YOU!";
	}
}

