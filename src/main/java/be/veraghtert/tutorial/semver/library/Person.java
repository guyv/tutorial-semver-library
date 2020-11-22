package be.veraghtert.tutorial.semver.library;

public class Person {

    private final UpperCaseName name;

    public Person(String name) {
        this.name = new UpperCaseName(name);
    }

    public UpperCaseName getName() {
        return name;
    }
}
