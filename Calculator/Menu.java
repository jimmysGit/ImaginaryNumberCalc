// James Barrington 90008620
public class Menu
{
	//This class will have 3 methods, 1 main method for the main menu and 2 seperate to handle imaginary and real numbers
	//This is the menu  which will handle the first user choice
	public static void run()
	{
		// Used to store the users choice
		 int choice;
		// This is used to toggle the menu on and off
		boolean menuOn;
		do
		{
			System.out.println("(1) Real Numbers");
			System.out.println("(2) Imaginary Numbers");
			System.out.println("(3) Exit!");
			choice = ConsoleInput.readInt("Please select an option! (E.g 1,2 or 3)");
			switch(choice)
			{		//Makes two RealNumber objects using the alternate constructor with the inputs from the user
				case 1: RealNumber realNum1 = new RealNumber(ConsoleInput.readDouble("Please input the first Real Number!"));
					RealNumber realNum2 = new RealNumber(ConsoleInput.readDouble("Please input the second Real Number!"));
					
					menuOn = false;
					// Calls the real number menu to allow the users to select what calculation to do with real numbers.
					realMenu(realNum1,realNum2);
				break;
				
				case 2: double realPart, imagPart;
					// Gets the two reuired parameters to hand the the ImaginaryNumber alternate constructor
					realPart = ConsoleInput.readDouble("Please input the Real part of the Imaginary Number!");
					imagPart = ConsoleInput.readDouble("Please input the Imaginary part of the imaginary number!");
					ImaginaryNumber imagNum1 = new ImaginaryNumber(realPart,imagPart);

					realPart = ConsoleInput.readDouble("Please Input the Real part of the second imaginary number!");
					imagPart = ConsoleInput.readDouble("Please input the imaginary part of the second imaginary number!");
					ImaginaryNumber imagNum2 = new ImaginaryNumber(realPart, imagPart);
					
					menuOn = false;

					// After the user input the numbers They are then prompted with a calculation to do with the imaginary numbers
					imaginaryMenu(imagNum1,imagNum2);
				break;
				//This exits the menu
				case 3: menuOn = false;
					System.exit(0);
				break;

				default: menuOn = true; 
					System.out.println("Invalid selection!");
					System.out.println("Please input another selection!");
				break;
		
			}
		}while(menuOn);	
	}

	public static void realMenu(RealNumber realNum1, RealNumber realNum2)
	{
		boolean looper;
		System.out.println(" ");
		
		int operation;
		do
		{
			System.out.println("Please choose one of the following operations!");
			System.out.println("(1) Addition");
			System.out.println("(2) Subtraction");
			System.out.println("(3) Multiplication");
			System.out.println("(4) Division");
			
			operation = ConsoleInput.readInt("Please select an operation to do! (E.g 1,2,3 or 4)");
			
			switch(operation)
			{
			//After each operation it will start the previous menu so the user can do another calculation
				case 1: realNum1.add(realNum2);
			    System.out.println("The addition of the two number was: " + realNum1.toString());
				looper = false;
				run();

				case 2: realNum1.subtract(realNum2);
				System.out.println("The subtraction of the two numbers was: " + realNum1.toString());
				looper = false;
				run();

				case 3: realNum1.multiply(realNum2);
				System.out.println("The Multiplication of the two numbers was: " + realNum1.toString());
				looper = false;
				run();
				
				case 4: realNum1.divide(realNum2);
				System.out.println("The division of the two numbers was: " + realNum1.toString());
				looper = false;
				run();
				
				default: System.out.println("Invalid selection please selct from 1,2,3 or 4");
				looper = true;
								
			}
		}while(looper);	
	}

	public static void imaginaryMenu(ImaginaryNumber imageNum1,ImaginaryNumber imageNum2)
	{	
		boolean looper;
		System.out.println(" ");
		System.out.println("Please choose one of the following operations!");
		int operation;
		do
		{
			System.out.println("(1) Addition");
			System.out.println("(2) Subtraction");
			System.out.println("(3) Multiplication");
			System.out.println("(4) Division");
			
			operation = ConsoleInput.readInt("Please select an operation to do! (E.g 1,2,3 or 4)");
			
			switch(operation)
			{
				case 1: imageNum1.add(imageNum2);
			        System.out.println("The addition of the two number was: " + imageNum1.getRealNum() + " + " + imageNum1.getImageNum() + "i"  );
				looper = false;
				run();
				break;

				case 2: imageNum1.subtract(imageNum2);
				System.out.println("The subtraction of the two numbers was: " + imageNum1.getRealNum() + " + " + imageNum1.getImageNum() + "i" );
				looper = false;
				run();
				break;

				case 3: imageNum1.multiply(imageNum2);
				System.out.println("The Multiplication of the two numbers was: " + imageNum1.getRealNum() + " + " + imageNum1.getImageNum() + "i" );
				looper = false;
				run();
				break;
							
				case 4: imageNum1.divide(imageNum2);
				System.out.println("The division of the two numbers was: " + imageNum1.getRealNum() + " + " + imageNum1.getImageNum() + "i");
				looper = false;
				run();
				break;

				default: System.out.println("Invalid selection please selct from 1,2,3 or 4");
				looper = true;
								
			}
		}while(looper);	
	}

	
}


