package pl.kurs;

import java.util.Arrays;

public class APIStringRunner {
    public static void main(String[] args) {
        String names = " Asia Bartek Maciek Alek Hubert ";
        System.out.println(names);

        String asia = names.substring(1, 5);
        System.out.println(asia);

        String wojtek = names.replaceAll("Bartek", "Wojtek"); // Zamienia wszystkie "Bartek" na "Wojtek"
        System.out.println(wojtek);

        String trimmed = names.trim(); // Obcina biale znaiki z poczatku i konca
        System.out.println(trimmed);

        char bigA = names.charAt(1); // Pobiera char pod indexem 1
        System.out.println(bigA);

        String upperCase = names.toUpperCase(); // Zamienia na duze litery
        System.out.println(upperCase);

        String lowerCase = names.toLowerCase(); // Zamienia na male litery
        System.out.println(lowerCase);

        int length = names.length(); // Pobiera dlugosc
        System.out.println(length);

        String[] splitNames = names.trim().split(" "); // Split - rozdziela po spacji
        System.out.println(Arrays.toString(splitNames));

    }
}
