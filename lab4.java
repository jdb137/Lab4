import java.util.Scanner;
public class lab4{
	public static void main(String[] args){
		System.out.println("Please enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		int i=1;
		int utils=0;
		
		do{
			poop();
			System.out.println("What would "+ name +" like to do?");
			
			Scanner sc1 = new Scanner(System.in);
			int option = sc1.nextInt();
			int ppl=0;
			System.out.println("How many people?");
			Scanner sc2 = new Scanner(System.in);
			
			
			switch(option){
				case 1:
					ppl = sc2.nextInt();
					utils=pop(utils,ppl,3);
					break;
				case 2:
					ppl = sc2.nextInt();
					utils=pop(utils,ppl,-5);
					break;
				case 3:
					ppl = sc2.nextInt();
					utils=pop(utils,ppl,0);
					break;
				case 4:
					i=0;
					break;
				default:
					break;
			}
		}while(i==1);
		
		System.out.println(name +" caused "+ utils +" utils of happiness");
		String gb=pee(utils);
		System.out.println("You've lived a morally "+ gb +" life");
	}
	
	public static void poop(){
		System.out.println("(1) Buy people ice cream");
		System.out.println("(2) Steal ice cream from people");
		System.out.println("(3) Dream about eating ice cream");
		System.out.println("(4) Die");
	}
	
	public static String pee(int utils){
		String gb;
		if(utils>0){
			gb="good";
		}else if (utils==0){
			gb="neutral";
		}else{
			gb="bad";
		}
		return gb;
	}
	
	public static int pop(int a, int b, int c){
		int d=a+b*c;
		return d;
	}
}