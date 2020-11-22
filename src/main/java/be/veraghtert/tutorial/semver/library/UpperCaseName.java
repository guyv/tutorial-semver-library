package be.veraghtert.tutorial.semver.library;

public class UpperCaseName extends Name {

    public UpperCaseName(String value) {
        super(value);
    }

    @Override
    public String getValue() {
        return super.getValue().toUpperCase();
    }
}
