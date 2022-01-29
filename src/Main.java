import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 1, b = 1;
        Scanner scanner = new Scanner(System.in);
        Chapter1 chapter1 = new Chapter1();
        Chapter2 chapter2 = new Chapter2();
        Chapter3 chapter3 = new Chapter3();
        Chapter4 chapter4 = new Chapter4();
        System.out.println("Zaadnia z Logika i teoria mnogości");

        System.out.println("Wybierz rozdiał \n Rozdział 1 - 1 \n Rozdział 2 - 2 \n Rozdział 3 - 3 \n Rozdział 4 - 4");
        a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.println("Wybierz zadanie\n Zadanie 1_1 - 1\n Zadanie 2_1 - 2\n");
                b = scanner.nextInt();
                switch (b) {
                    case 1:
                        chapter1.zadania1_1();
                        break;
                    case 2:
                        chapter1.zadanie2_1();
                        break;
                    default: System.out.println("Nieprawidłowa liczba");

                }
                break;
            case 2:
                System.out.println("Wybierz zadanie\n Zadanie 1_2 - 1\n Zadanie 2_2 - 2\n Zadanie 3_2" +
                        " - 3\n Zadanie 4_2 - 4\n Zadanie 5_2 - 5\n Zadanie 6_2 - 6\n Zadanie 10_2 - 7\n Zadanie 11_2 - 8\n Zadanie 12_2 - 9");
                b = scanner.nextInt();
                switch (b) {
                    case 1:
                        chapter2.zadanie1_2();
                        break;
                    case 2:
                        chapter2.zadanie2_2();
                        break;
                    case 3:
                        chapter2.zadanie3_2();
                        break;
                    case 4:
                        chapter2.zadanie4_2();
                        break;
                    case 5:
                        chapter2.zadanie5_2();
                        break;
                    case 6:
                        chapter2.zadanie6_2();
                        break;
                    case 7:
                        chapter2.zadanie10_2();
                        break;
                    case 8:
                        chapter2.zadanie11_2();
                        break;
                    case 9:
                        chapter2.zadanie12_2();
                        break;
                    default: System.out.println("Nieprawidłowa liczba");

                }
                break;
            case 3:
                System.out.println("Wybierz zadanie\n Zadanie 1_3 - 1\n Zadanie 2_3 - 2\n Zadanie 3_3" +
                        " - 3\n Zadanie 4_4 - 4\n Zadanie 5_5 - 5\n");
                b = scanner.nextInt();
                switch (b) {
                    case 1:
                        chapter3.zadanie1_3();
                        break;
                    case 2:
                        chapter3.zadanie2_3();
                        break;
                    case 3:
                        chapter3.zadanie3_3();
                        break;
                    case 4:
                        chapter3.zadanie4_3();
                        break;
                    case 5:
                        chapter3.zadanie5_3();
                        break;
                    default: System.out.println("Nieprawidłowa liczba");

                }
                break;
            case 4:
                System.out.println("Wybierz zadanie\n Zadanie 1_4 - 1\n Zadanie 2_4 - 2\n Zadanie 3_4" +
                        " - 3\n Zadanie 4_4 - 4\n");
                b = scanner.nextInt();
                switch (b) {
                    case 1:
                        chapter4.zadanie1_4();
                        break;
                    case 2:
                        chapter4.zadanie1_4();
                        break;
                    case 3:
                        chapter4.zadanie1_4();
                        break;
                    case 4:
                        chapter4.zadanie1_4();
                        break;
                    default: System.out.println("Nieprawidłowa liczba");

                }
                break;
        }
    }
}