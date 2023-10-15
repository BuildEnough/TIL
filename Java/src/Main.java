public class Main {
    public static void main(String[] args) {
        String str = "cat";
        String result = "";
        for(int i=0; i<str.length(); i++) {
            result += str.charAt(i);
            for(int j=0; j<i+1; j++) {
                result += str.charAt(j);
            }
        }
        System.out.println(result);
    }
}