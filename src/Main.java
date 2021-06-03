import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int type,option,logout;
		

		do {
			System.out.print("\nSign In as (1.Admin)|(2.Customer) : ");
			type = s.nextInt();
			System.out.println();
			switch(type) {
			case 1: //Admin login
				System.out.println("\n=== WELCOME TO HUNTER BOWLING ===");
				do {
					System.out.println("\n1.Employee System | 2.Bowling");
					System.out.print("Choose your option : ");
					option = s.nextInt();
					switch(option) {
					case 1:
						Employee e = new Employee();
						System.out.println(e);
						break;
						
					case 2:
						Bowling sports = new Bowling();
						sports.printBowling("Hunter Bowling", "NO 12, JALAN HARMONI 3/8 TAMAN HARMONI JOHOR BAHRU JOHOR.", 
											"0174424258", 9.00, 11.00,"Friday");
						break;
					}
				if(option<1 && option>1) {
					System.out.println("\n1.Employee System");
					System.out.print("Choose your option : ");
					option = s.nextInt();
				}
					System.out.print("\nLogout(1-Yes || 2-No) :");
					logout = s.nextInt(); 
				}
				while(logout==1);
				break;
				
			case 2: //Customer login
				System.out.println("\n=== WELCOME TO HUNTER BOWLING ===");
				do {
					System.out.println("\n1.Bowling | 2.Membership Registration | 3.Coaching Guide | 4.Advertisment");
					System.out.print("Choose your option : ");
					option = s.nextInt();
					switch(option) {
					case 1:
						Bowling sports = new Bowling();
						sports.printBowling("Hunter Bowling", "NO 12, JALAN HARMONI 3/8 TAMAN HARMONI JOHOR BAHRU JOHOR.", 
											"0174424258", 9.00, 11.00,"Friday");
						
						
						System.out.println();
						break;
						
					case 2:
						MembersCard members = new MembersCard();
						System.out.println(members);
						
					case 3:
						Guide g = new Guide();
						System.out.println(g);
						
					case 4:
						Advertisment ad = new Advertisment();
						System.out.println(ad);
					}
				if(option<1 && option>1) {
					System.out.println("\n1.Employee System");
					System.out.print("Choose your option : ");
					option = s.nextInt();
				}
					System.out.print("\nLogout(1-Yes || 2-No) :");
					logout = s.nextInt();
				}
				while(logout==1);
				break;
			}
			System.out.print("\nContinue Using HUNTER BOWLING SYSTEM(1-YES,2-No) :");
			option =s.nextInt();
		}
		while(option==1);
		System.out.println("\n\n***Thankyou for visiting HUNTER BOWLING***");
	}
	
	
}
				
		

				
		   
	  
		
			
		

