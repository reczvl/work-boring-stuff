import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swój przychód: ");
        double przychod = scan.nextDouble();
        double wynik;
        if(przychod<=85528) {
            wynik = przychod*0.18-556;
            System.out.println(wynik);
        } else{
            wynik = ((przychod = 85528) *0.32+14839);
            System.out.println(wynik);
        }

    }
}
