import java.util.Scanner;

public class Chapter4 {
    Scanner scanner = new Scanner(System.in);

    public void zadanie1_4() {
        System.out.println();
        System.out.println("Napisz program sumujący elementy tablicy dwuwymiarowej");
        int[][] n = new int[100][100];
        int w, k, a = 0, b = 0;
        System.out.println("Podaj z ilu wierszy ma skladac sie tablica");
        w = scanner.nextInt();
        System.out.println("Podaj z ilu kolumn ma skladac sie tablica");
        k = scanner.nextInt();

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                b++;
                System.out.println("Podaj " + b + " wartość");
                n[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                a += n[i][j];
            }
        }
        System.out.println(a);
        scanner.close();
    }

    public void zadanie2_4() {
        System.out.println();
        System.out.println("Napisz program sumujący elementy parzyste - tablicy dwuwymiarowej");
        int[][] n = new int[100][100];
        int w, k, a = 0, b = 0;
        System.out.println("Podaj z ilu wierszy ma skladac sie tablica");
        w = scanner.nextInt();
        System.out.println("Podaj z ilu kolumn ma skladac sie tablica");
        k = scanner.nextInt();

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                b++;
                System.out.println("Podaj " + b + " wartość");
                n[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                if (n[i][j] % 2 == 0) {
                    a += n[i][j];
                }
            }
        }
        System.out.println("Suma liczb parzystych to: " + a);
        scanner.close();
    }
    public void zadanie3_4() {
        System.out.println();
        System.out.println("Napisz program sumujący elementy nieparzyste - tablicy dwuwymiarowej");
        int[][] n = new int[100][100];
        int w, k, a = 0, b = 0;
        System.out.println("Podaj z ilu wierszy ma skladac sie tablica");
        w = scanner.nextInt();
        System.out.println("Podaj z ilu kolumn ma skladac sie tablica");
        k = scanner.nextInt();

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                b++;
                System.out.println("Podaj " + b + " wartość");
                n[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                if (n[i][j] % 2 == 1) {
                    a += n[i][j];
                }
            }
        }
        System.out.println("Suma liczb nieparzystych to: " + a);
        scanner.close();
    }
    public void zadanie4_4() {
        System.out.println();
        System.out.println("Napisz program sumujący elementy podzielne przez 7 - tablicy dwuwymiarowej");
        int[][] n = new int[100][100];
        int w, k, a = 0, b = 0;
        System.out.println("Podaj z ilu wierszy ma skladac sie tablica");
        w = scanner.nextInt();
        System.out.println("Podaj z ilu kolumn ma skladac sie tablica");
        k = scanner.nextInt();

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                b++;
                System.out.println("Podaj " + b + " wartość");
                n[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                if (n[i][j] % 7 == 0) {
                    a += n[i][j];
                }
            }
        }
        System.out.println("Suma liczb podzielnych przez 7 to: " + a);
        scanner.close();
    }
}
