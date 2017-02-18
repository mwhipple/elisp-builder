package lispbuilder;

public class EmptyList implements Sexp {
    private static final EmptyList INSTANCE = new EmptyList();
    public static EmptyList getList() {
        return INSTANCE;
    }

    private EmptyList() {}

    @Override
    public String toString() {
        return "()";
    }

    @Override
    public String toCdrString() {
        return "";
    }
}
