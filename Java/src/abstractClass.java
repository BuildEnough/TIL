abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {}
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.printf("Marine: %d, %d%n", x, y);
    }
    void stimPact() {}
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.printf("Tank: %d, %d%n", x, y);
    }
    void changeMode() { }
}


class Dropship extends Unit {
    void move(int x, int y) {
        System.out.printf("Dropship: %d, %d%n", x, y);
    }
    void load() { }
    void unload() { }
}

class abstractClass {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}
