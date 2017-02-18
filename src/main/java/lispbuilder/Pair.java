package lispbuilder;

public class Pair implements Sexp {
    private final Sexp car;
    private final Sexp cdr;
    private final Propriety propriety;

    Pair(Sexp car, Sexp cdr) {
        this.car = car;
        this.cdr = cdr;
        this.propriety = Propriety.fromCdr(cdr);
    }

    public String toString() {
        return withContents(new StringBuilder("("))
            .append(")")
            .toString();
    }
    public String toCdrString() {
        return withContents(new StringBuilder(" "))
            .toString();
    }

    private StringBuilder withContents(StringBuilder sb) {
        return sb.append(car.toCarString())
            .append(propriety.separator())
            .append(cdr.toCdrString());
    }

    static enum Propriety {
        PROPER(""),
        IMPROPER(" .");

        public static Propriety fromCdr(Sexp cdr) {
            return cdr instanceof Scalar   ? IMPROPER : PROPER;
        }

        private String separator;
        public String separator() {
            return separator;
        }

        Propriety(String separator) {
            this.separator = separator;
        }
    }
}
