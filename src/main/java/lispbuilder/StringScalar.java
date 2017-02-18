package lispbuilder;

public class StringScalar extends Scalar {
    StringScalar(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return new StringBuilder("\"")
            .append(super.toString())
            .append("\"")
            .toString();
    }
}
