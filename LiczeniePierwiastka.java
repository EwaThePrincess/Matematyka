import java.util.Scanner;
public class LiczeniePierwiastka {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();

    System.out.println("Podaj nieujemny x.");
    if (x<0) {
        System.out.println("Błąd, podaj liczbę nieujemną.");
    } else {
        double pierwiastek = Math.sqrt(x);
        System.out.println("Pierwiastek z x wynisi " + pierwiastek);
    }
    }
}