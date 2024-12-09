package pl.kurs.homework;

import java.util.Scanner;

public class LastLettersRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość wyrazów");
        int n = scanner.nextInt();
        scanner.nextLine();

        String result = "";
        for (int i = 0; i < n; i++) {
            System.out.println("Wprowadź wyraz " + (i + 1) + " :");
            String word = scanner.nextLine();
            if (!word.isEmpty()) {
                result += word.charAt(word.length() - 1);
            }
        }
        System.out.println("Wynik połączenia ostatnich liter to: " + result);
        scanner.close();
    }

}
