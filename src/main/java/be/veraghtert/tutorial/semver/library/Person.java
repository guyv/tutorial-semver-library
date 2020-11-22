package be.veraghtert.tutorial.semver.library;

public class Person {

    private final Name name;

    public Person(String name) {
        this.name = new Name(name);
    }

    public Name getName() {
        return name;
    }
}
