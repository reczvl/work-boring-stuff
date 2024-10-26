import java.util.InputMismatchException;
import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {
//Zadanie 2. Wczytać od użytkownika 3 liczby całkowite i
// wypisać na ekran najwięszką oraz najmniejszą z nich
        boolean done = false;
        while(!done) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Podaj pierwszą liczbę całkowitą:");
                int a = scan.nextInt();
                System.out.print("Podaj drugą liczbę całkowitą: ");
                int b = scan.nextInt();
                System.out.print("Podaj trzecią liczbę całkowitą: ");
                int c = scan.nextInt();

                System.out.println("Twoje numery to: " + a + ", " + b + ", " + c);

                if (a > b && b > c) {
                    System.out.println("Największa liczba to " + a + " a najmniejsza to " + c);
                } else if (c > b && b > a) {
                    System.out.println("Największa liczba to " + c + " a najmniejsza to " + a);
                } else if (b > c && c > a) {
                    System.out.println("Największa liczba to " + b + " a najmniejsza to " + a);
                } else if (a > c && c > b) {
                    System.out.println("Największa liczba to " + a + " a najmniejsza to " + b);
                } else if (b > a && a > c) {
                    System.out.println("Największa liczba to " + b + " a najmniejsza to " + c);
                } else {
                    System.out.println("Największa liczba to " + c + " a najmniejsza to " + b);
                }done = true;
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Sprawdź czy podałeś liczbę!");
            }
        }
    }
}
