import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Give me a name: ");
		String person1 = in.nextLine(); 
		System.out.println("Give me another name: ");
		String person2 = in.nextLine(); 
		System.out.println("Now, give me an animal: ");
		String animal = in.nextLine(); 
		System.out.println("And now, give me an air vehicle: ");
		String vehicle = in.nextLine(); 
		System.out.println("This next one is hard.........give me a responsibility you're tired of, like work or school: ");
		String responsibility = in.nextLine();
		System.out.println("Give me a day of the week: ");
		String Dayofweek = in.nextLine(); 
		System.out.println("Give me a number between 0 and 12.....this number can have decimals: ");
		double time = in.nextDouble();  
		in.nextLine();
		System.out.println("You're almost done, but first give me a country: ");
		String Countryname = in.nextLine(); 

		System.out.println("Give me a bizarre job (Write in in plural) : ");
		String Weirdjob = in.nextLine(); 
		System.out.println("Now, give me an international food: ");
		String food = in.nextLine(); 
		System.out.println("Last question, give me a name for a pet: ");
		String petname = in.nextLine(); 
		
		System.out.println("On a " +Dayofweek+ " morning, " + person1 + " and " + person2 + " were so tired of " + responsibility + " that they took their pet " + animal+ ", " + petname+ ", and then went to the airport, where they took the " + time+ " "+ vehicle + " to " + Countryname + ". When they arrived, they decided to stay in there forever, working as " + Weirdjob+ " and eating " + food+ "."); 
				
	
		// person 1 
		// person 2 
		// animal 
		// air vehicle 
		// responsibility 
		// day of week 
		// time --- decimal 
		// country 
		// bizarre job 
		// international food
		// pet name 
		
		
		
		

	}

}
