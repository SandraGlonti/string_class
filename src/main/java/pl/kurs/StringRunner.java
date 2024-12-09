package pl.kurs;

public class StringRunner {
    public static void main(String[] args) {

        String word1 = "Java";
        String word2 = "Java";

        System.out.println(word1 == word2);

        String word3 = new String("Java");
        System.out.println(word3 == word2);
        word3 = word3.intern();

        String word3Interned = word3.intern();
        System.out.println(word3Interned == word2);


        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
        System.out.println("JAVA".equalsIgnoreCase("java"));

        String w1 = "Rumak";
        String w2 = "Rum";

        String w3 = w1.substring(0,3); // Utworzenie stringa "Rum" z "Rumak", poprzez wyciecie ze zmiennej w1
        //pierwszy argument to początek wyciecia(zaczynamy liczyc od 0), a drugi to koniec wyciecia(ktory nie wlicza sie, 3 nie zostanie wycieta)
        // pod spodem substring uzywa konstruktora new String(), wiec porownanie w2 == w3 zwroci false
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        String w4 = w1.substring(3);
        System.out.println(w4);

        String w5 = w3.concat(w4);
        //Złaczenie zmiennej w3, ze zmienna w4, pod spodem wywolywany jest konstruktor new String() wiec w1 == w5 zwroci nam false
        System.out.println(w5);

        System.out.println(w1 == w5);
        System.out.println(w1.equals(w5));

        String empty = "";
        System.out.println(empty.length() == 0);
        System.out.println(empty.equals(""));
        System.out.println(empty.isEmpty());

        String nullString = null;
        System.out.println(nullString.length());
    }
}
