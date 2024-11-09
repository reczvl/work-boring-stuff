import java.util.InputMismatchException;
import java.util.Scanner;


public class zadanie5 {
    public static void main(String[] args) {
//Zadanie 8. Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, A < B, a następnie
//wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu. Obliczenia należy wykonać trzykrotnie stosując kolejno pętle
//while, do-while, for
//Przyklad:
//Dla A=4 i B=11 program powinien wyświetlić: 60 60 60
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        a = scan.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą: ");
        b = scan.nextInt();
        if(a<b){
            int i = a;
            int sumfor = 0;
            for (i = a; i<=b; i++){
                sumfor += i;
            }
            System.out.println(sumfor);
            int sumwhile = 0;

            while(i<b) {
                sumwhile += i;
                i++;
            }
            System.out.println(sumwhile);

        }scan.close();
    }
}
