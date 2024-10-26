import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
//Zadanie 1. Napisać program służący do konwersji wartości temperatury podanej w stopniach
//Celsjusza na stopnie w skali Fahrenheita(stopnie Fahrenheita = 1.8 * stopnie Celsjusza = 32.0)

        boolean done = false;
        while(!done) {
            try {
                System.out.println();
                System.out.print("Podaj stopnie w skali Celsjusza: ");
                Scanner scan = new Scanner(System.in);
                double num = scan.nextDouble();
                double wynik = num * 1.8 + 32;
                scan.close();
                System.out.println();
                System.out.print("Stopnie w skali Fahrenheita: ");
                System.out.print(wynik);
                System.out.println();
                done = true;
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Sprawdź czy podałeś liczbę!");
            }
        }
    }
}
