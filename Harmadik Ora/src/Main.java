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
			System.out.println("\n Addjon meg egy �rt�ket a t�mbnek!");
			System.out.println("\n + e");
		}catch(ArithmeticException ae) 
		{
			System.out.println("\n Null�val nem lehet osztani!");
			System.out.println("\n + ae");
		}*/
		
		Scanner beolvas = new Scanner(System.in);
//		System.out.println("K�rek egy sz�t: ");
//		String beolvasottadat = beolvas.nextLine();
//		System.out.println(beolvasottadat);
//		beolvas.close();
		
		try {
			System.out.println("K�rekt egy sz�mot: ");
			char karakter = beolvas.next().charAt(0);
			//double eredmeny = 1 / szam;
			System.out.println("A karakter: ");
			System.out.println((int)karakter);
		}catch(InputMismatchException ime) 
		{
			//System.out.println("Hib�s sz�m form�tum! \n Sz�mot k�rek!");
			System.out.println(ime);
		}
		beolvas.close();
	}

}
