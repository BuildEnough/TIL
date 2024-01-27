import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<String>();

        list.add("public");
        list.add("static");
        list.add("void");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.stream().forEach(str -> System.out.println(str));
    }
}