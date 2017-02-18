package lispbuilder;

import java.util.Collections;

public class Functions {

    private Functions() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static Sexp identifier(String value) {
        return new Scalar(value);
    }
    public static Sexp string(String value) {
        return new StringScalar(value);
    }
    public static Sexp keyword(String value) {
        return new KeywordScalar(value);
    }

    public static Sexp cons(Sexp car, Sexp cdr) {
        return new Pair(car, cdr);
    }
    public static Sexp list(Sexp... els) {
        Sexp head = EmptyList.getList();
        for (int i = (els.length - 1); i >=0; i--) {
            head = cons(els[i], head);
        }
        return head;
    }
}
