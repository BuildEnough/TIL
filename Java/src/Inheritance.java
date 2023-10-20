class Tv {
    boolean power;
    int channel;

    void power() { power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class Inheritance {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        System.out.println(stv.channel);
        System.out.println();

        stv.channelUp();
        System.out.println(stv.channel);
        System.out.println();

        System.out.println(stv.caption);
        stv.displayCaption("Hello World");
        System.out.println();

        stv.caption = true;
        stv.displayCaption("Hello World");
    }
}