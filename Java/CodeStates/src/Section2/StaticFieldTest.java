package Section2;

public class StaticFieldTest {
    public static void main(String[] args) {
        StaticField staticField1 = new StaticField();
        StaticField staticField2 = new StaticField();

        staticField1.num1 = 100;
        staticField2.num1 = 1000;

        System.out.println(staticField1.num1);
        System.out.println(staticField2.num1);

        staticField1.num2 = 150;
        staticField2.num2 = 1500;

        System.out.println(staticField1.num2);
        System.out.println(staticField2.num2);
    }
}

class StaticField {
    int num1 = 10;
    static int num2 = 15;
}