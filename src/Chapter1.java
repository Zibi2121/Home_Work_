import java.util.Scanner;

public class Chapter1{
    Scanner scanner = new Scanner(System.in);

    void zadania1_1() {
        int a, b, c, d;
        System.out.println("Napisz program znajdujący Największy Wspólny Dzielnik dwóch liczb metodą Euklidesa /wykorzystaj poznany algorytm/");
        System.out.println("Wprowdz pierwsza liczbę");
        a = scanner.nextInt();
        System.out.println("Wprowdz drugą liczbę");
        b = scanner.nextInt();
        d = a % b;

        if (d == 0) {
            System.out.println("Największy wspólny dzielnik to " + b);
        }

        while (d > 0) {
            a = b;
            b = d;
            d = a % b;
        }
        System.out.println("Największy wspolny dzielnik to " + b);
    }

    void zadanie2_1() {
        int a, b, c, d, e, f;
        System.out.println("Napisz program znajdujący Najmniejszą Wspólną Wielokrotność dwóch liczb /wykorzystaj poznany algorytm/");
        System.out.println("Wprowdz pierwsza liczbę");
        a = scanner.nextInt();
        System.out.println("Wprowdz drugą liczbę");
        b = scanner.nextInt();
        d = a % b;
        e = a;
        f = b;
        if (d == 0) {
            System.out.println("największy dzielnik to " + b);
        }

        while (d > 0) {
            a = b;
            b = d;
            d = a % b;
        }
        System.out.println("największy dzielnik to " + b);
        c = e * f / b;
        System.out.println("NWW liczb " + e + " i " + f + " to " + c);
    }
}

