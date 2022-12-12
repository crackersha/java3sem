package prak20.task1_2_3;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    private String name = "Bob";

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}