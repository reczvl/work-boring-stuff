import java.util.InputMismatchException;
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
//Zadanie 3. W sklepie ze sprzętem AGD oferowana jest sprzedaż
//ratalna. Napisz program umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt.
//Danymi wejściowymi dla programu są:
//- cena towaru (od 100zl do 10tys zl)
//- liczba rat (od 6 do 48)
//Kredyt jest oprocentowany w zależności od liczby rat:
//- od 6-12 wynosi 2.5%
//- od 13-24 wynosi 5%
//- od 25-48 wynosi 10%
//Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien sprawdzać, czy podane dane
//mieszczą się w określonych powyżej zakresach, a w przypadku blędu pytać prosić
//użytkownika ponownie o podanie danych

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj cenę towaru: ");
        double price = scan.nextDouble();
        System.out.print("Podaj liczbę rat: ");
        int rate = scan.nextInt();
        double w1 = price/rate;
        double w11 = Math.round(w1 + w1 * 0.025);
        double w2 = price/rate;
        double w22 = Math.round(w2 + w2 * 0.05);
        double w3 = price/rate;
        double w33 = Math.round(w3 + w3 * 0.1);

        if(price>99 && 10001>price) {
            if(rate>5 && 13>rate){
                System.out.println("Miesięczna rata będzie wynosić "+w11+" zł");
            }
            else if(rate>12 && 25>rate){
                System.out.println("Miesięczna rata będzie wynosić "+w22+" zł");
            }
            else if(rate>24 && 49>rate){
                System.out.println("Miesięczna rata będzie wynosić "+w33+" zł");
            }
            else {
                System.out.println("Coś poszło nie tak! Prosimy o ponowne podanie danych");
            }
        }

    }
}
