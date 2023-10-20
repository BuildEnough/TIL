public class Main {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class Human {
    public Human() {
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human {
    public Student() {
        // super();
        System.out.println("학생 클래스 생성자");
    }
}