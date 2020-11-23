package be.veraghtert.tutorial.semver.library;

public class DefaultName implements Name {

    private final String value;

    public DefaultName(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
