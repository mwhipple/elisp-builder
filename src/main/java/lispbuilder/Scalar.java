package lispbuilder;

public class Scalar implements Sexp {
    private final String value;

    Scalar(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
