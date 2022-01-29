import java.util.Scanner;

public class Chapter2 {
    Scanner scanner = new Scanner(System.in);

    public void zadanie1_2() {
        int a = 0, b = 0, c = 0;
        System.out.println();
        System.out.println("Napisz program sumujący liczby parzyste – liczba (-50) konczy wprowadzanie danych (zastosuj iterację dopóki Q wykonuj A)");

        System.out.println("Podaj pierwsza liczbę (mniejszą)");
        b = scanner.nextInt();
        System.out.println("Podaj pierwsza liczbę (Większą)");
        a = scanner.nextInt();

        if (a != -50 && b != -50) {
            while (a > b) {
                b++;
                if (b % 2 == 0) {
                    c += b;
                }
            }
            System.out.println("Suma liczb parzystych to " + c);

        } else {
            System.out.println("Podałeś liczbę -50, przerwano działanie");
        }
    }

    public void zadanie2_2() {
        int a = 0, b = 0, c = 0;
        System.out.println();
        System.out.println("Napisz program sumujący liczby nieparzyste – liczba (50) konczy wprowadzanie danych (zastosuj iterację dopóki Q wykonuj A)");

        System.out.println("Podaj pierwsza liczbę (mniejszą)");
        b = scanner.nextInt();
        System.out.println("Podaj pierwsza liczbę (Większą)");
        a = scanner.nextInt();

        if (a != 50 && b != 50) {
            while (a > b) {
                b++;
                if (b % 2 == 1) {
                    c += b;
                }
            }
            System.out.println("Suma liczb nieparzystych to " + c);

        } else {
            System.out.println("Podałeś liczbę 50, przerwano działanie");
        }
    }

    public void zadanie3_2() {
        int a = 0, b = 0, c = 0;
        System.out.println();
        System.out.println("Napisz program sumujący liczby podzielne przez 7 – liczba (-50) kooczy wprowadzanie danych (zastosuj iterację dopóki Q wykonuj A)");

        System.out.println("Podaj pierwsza liczbę (mniejszą)");
        b = scanner.nextInt();
        System.out.println("Podaj pierwsza liczbę (Większą)");
        a = scanner.nextInt();

        if (a != -50 && b != -50) {
            while (a > b) {
                b++;
                if (b % 2 == 1) {
                    c += b;
                }
            }
            System.out.println("Suma liczb podzielnych przez 7 to " + c);

        } else {
            System.out.println("Podałeś liczbę -50, przerwano działanie");
        }
    }


    public void zadanie4_2() {
        int a = 0, c = 0;
        System.out.println();
        System.out.println("Napisz program sumujący liczby parzyste – liczba (-50) kooczy wprowadzanie danych (zastosuj iterację wykonuj A aż do Q)");

        do {
            System.out.println("Podaj liczbę, liczba -50 kończy działanie");
            a = scanner.nextInt();
            if (a % 2 == 0) {
                c += a;
                System.out.println("Suma liczb parzystych to " + c);
            }
            if (a % 2 == 1) {
                System.out.println("Podałeś liczbę nieparzystą, nie jest ona wliczona, podaj parzystą");
            }
        } while (a != -50);
    }


    public void zadanie5_2() {
        int a = 0, c = 0;
        System.out.println();
        System.out.println("Napisz program sumujący liczby nie parzyste – liczba (50) kooczy wprowadzanie danych (zastosuj iterację wykonuj A aż do Q)");

        do {
            System.out.println("Podaj liczbę, liczba 50 kończy działanie");
            a = scanner.nextInt();
            if (a % 2 == 1) {
                c += a;
                System.out.println("Suma liczb nieparzystych to " + c);
            }
            if (a % 2 == 0) {
                System.out.println("Podałeś liczbę parzystą, nie jest ona wliczona, podaj liczbę nieparzystą");
            }
        } while (a != 50);
    }

    public void zadanie6_2() {
        int a = 0, c = 0;
        System.out.println();
        System.out.println("Napisz program sumujący liczby podzielne przez 7 – liczba (-50) kooczy wprowadzanie danych (zastosuj iterację wykonuj A aż do Q)");

        do {
            System.out.println("Podaj liczbę, liczba -50 kończy działanie");
            a = scanner.nextInt();
            if (a % 7 == 0) {
                c += a;
                System.out.println("Suma liczb podzielych przez 7 to " + c);
            }
            if (a % 7 > 0) {
                System.out.println("Podałeś liczbę niepodzielną przez 7, podaj liczbę podzielną przez 7 np. 21");
            }
        } while (a != -50);

    }

    public void zadanie10_2() {
        int a = 0, c = 1;
        System.out.println();
        System.out.println("Napisz program obliczający iloczyn liczb parzystych – liczba (-50) kooczy wprowadzanie danych (zastosuj iterację wykonuj A aż do Q)");

        do {
            System.out.println("Podaj liczbę, liczba -50 kończy działanie");
            a = scanner.nextInt();
            if (a % 2 == 0) {
                c *= a;
                System.out.println("Iloczyn liczb parzystych to " + c);
            }
            if (a % 2 == 1) {
                System.out.println("Podałeś liczbę nieparzystą, nie jest ona wliczona, podaj parzystą");
            }
        } while (a != -50);
    }


    public void zadanie11_2() {
        int a = 0, c = 1;
        System.out.println();
        System.out.println("Napisz program obliczający iloczyn liczb nie parzystych – liczba (50) kooczy wprowadzanie danych (zastosuj iterację wykonuj A aż do Q)");

        do {
            System.out.println("Podaj liczbę, liczba 50 kończy działanie");
            a = scanner.nextInt();
            if (a % 2 == 1) {
                c *= a;
                System.out.println("Iloczyn liczb nieparzystych to " + c);
            }
            if (a % 2 == 0) {
                System.out.println("Podałeś liczbę parzystą, nie jest ona wliczona, podaj liczbę nieparzystą");
            }
        } while (a != 50);
    }

    public void zadanie12_2() {
        int a = 0, c = 1;
        System.out.println();
        System.out.println("Napisz program obliczający iloczyn liczb podzielnych przez 7 – liczba (-50) kooczy wprowadzanie danych (zastosuj iterację wykonuj A aż do Q)");

        do {
            System.out.println("Podaj liczbę, liczba -50 kończy działanie");
            a = scanner.nextInt();
            if (a % 7 == 0) {
                c *= a;
                System.out.println("Iloczyn liczb podzielych przez 7 to " + c);
            }
            if (a % 7 > 0) {
                System.out.println("Podałeś liczbę niepodzielną przez 7, podaj liczbę podzielną przez 7 np. 21");
            }
        } while (a != -50);

    }

}


