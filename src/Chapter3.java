import java.util.Scanner;

public class Chapter3 {
    Scanner scanner = new Scanner(System.in);

    public void zadanie1_3() {
        System.out.println();
        System.out.println("Napisz program sumujący elementy tablicy jednowymiarowej");
        int tab[] = new int[100];
        int n = 5;
        int a = 0, b = 0;
        System.out.println("Podaj wielkośc tablicy (maks 100)");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b++;
            System.out.println("Podaj " + b + " wartość");
            tab[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a += tab[i];
        }
        System.out.println("Sumy liczb to: " + a);
    }

    public void zadanie2_3() {
        System.out.println();
        System.out.println("Napisz program sumujący elementy parzyste - tablicy jednowymiarowej");
        int tab[] = new int[100];
        int n = 5;
        int a = 0, b = 0;
        System.out.println("Podaj wielkośc tablicy (maks 100)");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b++;
            System.out.println("Podaj " + b + " wartość");
            tab[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (tab[i] % 2 == 0) {
                a += tab[i];
            }
        }
        System.out.println("Suma liczb parzystych to: " + a);
    }

    public void zadanie3_3() {
        System.out.println();
        System.out.println("Napisz program sumujący elementy nieparzyste - tablicy jednowymiarowej");
        int tab[] = new int[100];
        int n = 5;
        int a = 0, b = 0;
        System.out.println("Podaj wielkośc tablicy (maks 100)");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b++;
            System.out.println("Podaj " + b + " wartość");
            tab[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (tab[i] % 2 == 1) {
                a += tab[i];
            }
        }
        System.out.println("Suma liczb nieparzystych to: " + a);
    }

    public void zadanie4_3() {
        System.out.println();
        System.out.println("Napisz program sumujący elementy podzielne przez 7 - tablicy jednowymiarowej");
        int tab[] = new int[100];
        int n = 5;
        int a = 0, b = 0;
        System.out.println("Podaj wielkośc tablicy (maks 100)");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b++;
            System.out.println("Podaj " + b + " wartość");
            tab[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (tab[i] % 7 == 0) {
                a += tab[i];
            }
        }
        System.out.println("Suma liczb podzielnych przez 7 to: " + a);
    }

    public void zadanie5_3() {
        System.out.println();
        System.out.println("Napisz program obliczający iloczyn elementów tablicy jednowymiarowej");

        int tab[] = new int[100];
        int n = 5;
        int a = 1, b = 0;
        System.out.println("Podaj wielkośc tablicy (maks 100)");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b++;
            System.out.println("Podaj " + b + " wartość");
            tab[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a *= tab[i];
        }
        System.out.println("Iloczyn liczb to: " + a);
    }
}
