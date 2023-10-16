public class Main {
    public static void main(String[] args) {
        String str = "I love codestates";
        String[] result = new String[str.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] += str.split(" ");
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }
}