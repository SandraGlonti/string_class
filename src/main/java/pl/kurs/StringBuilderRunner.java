package pl.kurs;

public class StringBuilderRunner {
    public static void main(String[] args) {

        String wordBuildUsingStringBuilder = new StringBuilder("Wow").toString();
        StringBuilder wow = new StringBuilder("wow");
        String wow2 = wow.toString();

        StringBuilder builder = new StringBuilder();
        String aa = "";

        for (int i = 0; i < 1000; i++) {
            builder.append(i);
            builder.append(" ");
        }
        String numbers = builder.toString();
        System.out.println(numbers);

        String numbers2 = "";
        for (int i = 0; i < 1000; i++){
            numbers2 = numbers2 + i + " ";
            //Zły sposób, przez który powstaną tysiące obiektów i program wykona się w wielokrotnie dłuższym czasie,
            // w przypadku laczenia duzej iosci obiektow w string, nalezy uzyc StringBuilder/Buffera
        }
        System.out.println(numbers2);


    }
}
