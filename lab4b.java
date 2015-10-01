import java.util.Scanner;
public class lab4b{
	public static void main(String[] args){
		System.out.println("5. Self-actualization");
		System.out.println("4. Esteem");
		System.out.println("3. Love and Belonging");
		System.out.println("2. Safety");
		System.out.println("1. Physiological");
		
		System.out.println("What is your level?");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		
		switch(level){
			case 5:
				System.out.println("Self-actualization");
			case 4:
				System.out.println("Esteem");
			case 3:
				System.out.println("Love and Belonging");
			case 2:
				System.out.println("Safety");
			case 1:
				System.out.println("Physiological");
		}
	}
}