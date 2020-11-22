package be.veraghtert.tutorial.semver.library;

public class Person {

    private final Name name;

    public Person(Object name) {
        this.name = new Name(String.valueOf(name));
    }

    public Name getName() {
        return name;
    }
}
