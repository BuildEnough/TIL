package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        System.out.println();

        rc = new Audio();
        rc.turnOn();

    }
}
