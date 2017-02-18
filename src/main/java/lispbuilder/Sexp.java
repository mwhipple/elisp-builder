package lispbuilder;

public interface Sexp {
    default String toCarString() { return this.toString(); }
    default String toCdrString() {
        return new StringBuilder(" ")
            .append(this.toString())
            .toString();
    }
}
