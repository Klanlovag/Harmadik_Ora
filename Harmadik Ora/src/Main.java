import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		/*try {
			int a = Integer.parseInt(args[0]);
			int b = a/0;
			System.out.println(b);
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("\n Addjon meg egy értéket a tömbnek!");
			System.out.println("\n + e");
		}catch(ArithmeticException ae) 
		{
			System.out.println("\n Nullával nem lehet osztani!");
			System.out.println("\n + ae");
		}*/
		
		Scanner beolvas = new Scanner(System.in);
//		System.out.println("Kérek egy szót: ");
//		String beolvasottadat = beolvas.nextLine();
//		System.out.println(beolvasottadat);
//		beolvas.close();
		
		try {
			System.out.println("Kérekt egy számot: ");
			char karakter = beolvas.next().charAt(0);
			//double eredmeny = 1 / szam;
			System.out.println("A karakter: ");
			System.out.println((int)karakter);
		}catch(InputMismatchException ime) 
		{
			//System.out.println("Hibás szám formátum! \n Számot kérek!");
			System.out.println(ime);
		}
		beolvas.close();
	}

}
