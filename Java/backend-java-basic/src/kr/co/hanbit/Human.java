package kr.co.hanbit;

import java.util.Objects;

public class Human {
    private String name;
    private Integer age;
    private Double height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(age, human.age) && Objects.equals(height, human.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}
