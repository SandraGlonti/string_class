package pl.kurs;

public class StringBufferRunner {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < 1000; i++) {
            buffer.append(i);
            buffer.append(" ");

        }
        String numbers = buffer.toString();
        System.out.println(numbers);
    }
}
