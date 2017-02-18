package lispbuilder;

public class KeywordScalar extends Scalar {
    KeywordScalar(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return new StringBuilder(":")
            .append(super.toString())
            .toString();
    }
}
