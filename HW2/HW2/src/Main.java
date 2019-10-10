import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Below is an inefficient menu system. 
		System.out.println("Please select an algorithm:");
		System.out.println("1 for table store");
		System.out.println("2 for document store");
		System.out.println("3 for node store.");
		System.out.println("4 to exit.");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		if(input <= 0 || input >=5){
			System.out.println("Please select a valid option.");
			input = 4;
		}
		
		if(input == 4){
			System.exit(0);
		}
		Storing store = new Storing(input);//Begins utilizing the stores.
	}
}
