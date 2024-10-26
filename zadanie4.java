import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
//Zadanie 4. Napisać program realizujący funkcje prostego kalkulatora pozwalającego
//na wykonanie operacji dodawania, odejmowania, możenia i dzielenia na dwóch liczbach
//rzeczywistych. Program ma identyfikować sytuację wprowadzenia błędu symbolu działania oraz próbę
//dzielenia przez 0. Zastosować instrukcję switch do wykonania odpowiedniego działania w zależności od
//wprowadzonego symboku operacji:
//a) Program wyswietla informacje o swoim przeznaczeniu
//b)wczytuje pierwszą liczbę
//c) wczytuje symbol operacji
//d)wczytuje drugą liczbę
    Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = scan.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scan.nextInt();
        System.out.println("Podaj znak operacji (+, -, *, /)");
        String sign = scan.next();
        int result;
        scan.close();

        switch(sign){
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.println(result);
                break;
            case "*":
                result = a * b;
                System.out.println(result);
                break;
            case "/":
                result = a / b;
                System.out.println(result);
                break;
            default:
                System.out.println("Podałeś zły znak!");
        }



    }
}
