package howard.edu.lsp.assignment2;

import java.util.Scanner;

public class Main {
	
	public static int sum = 0;
	public static int product = 1;
	
	public static void readInput() {
	
		Scanner scanner = new Scanner(System.in);
		
		while (true) {

			System.out.println("String?");
			String input = scanner.nextLine();
			
			if (input.charAt(0) == '.') {
				break;
			} else {
				if (input == "Goodbye") {
					System.out.println("Nyoom");
					end();
				} else {
					calculate(input);
				}
			}

		}
	
	}
	
	public static void calculate(String input) {
		
		if (input.equals("Goodbye")) {
			end();
		}
		
		int num, i = 0;

		String token;

		System.out.println("Tokens: ");

		while (true) {

			i = input.indexOf(' ');
			
			if (i == -1) {
				break;
			} else {
				token = input.substring(0, i);
				System.out.println(token);
				num = Integer.parseInt(token);
				sum += num;
				product *= num;
				input = input.substring(i + 1, input.length());
			}

		}
		
		System.out.println(input);
		num = Integer.parseInt(input);
		sum += num;
		product *= num;
		
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		
		sum = 0;
		product = 1;
		
	}
	
	public static void main(String args[]) {
		readInput();
	}
	
	public static void end() {
		System.out.println("Goodbye");
		System.exit(0);
	}

}