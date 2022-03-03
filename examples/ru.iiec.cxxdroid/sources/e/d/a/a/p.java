package e.d.a.a;

public class p extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8249d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8250e = {"def", "defonce", "cond", "apply", "if-not", "if-let", "if", "not", "not=", "=", "<", ">", "<=", ">=", "==", "+", "/", "*", "-", "rem", "quot", "neg?", "pos?", "delay?", "symbol?", "keyword?", "true?", "false?", "integer?", "empty?", "coll?", "list?", "set?", "ifn?", "fn?", "associative?", "sequential?", "sorted?", "counted?", "reversible?", "number?", "decimal?", "class?", "distinct?", "isa?", "float?", "rational?", "reduced?", "ratio?", "odd?", "even?", "char?", "seq?", "vector?", "string?", "map?", "nil?", "contains?", "zero?", "instance?", "not-every?", "not-any?", "libspec?", "->", "->>", "..", ".", "inc", "compare", "do", "dotimes", "mapcat", "take", "remove", "take-while", "drop", "letfn", "drop-last", "take-last", "drop-while", "while", "intern", "condp", "case", "reduced", "cycle", "split-at", "split-with", "repeat", "replicate", "iterate", "range", "merge", "zipmap", "declare", "line-seq", "sort", "comparator", "sort-by", "dorun", "doall", "nthnext", "nthrest", "partition", "eval", "doseq", "await", "await-for", "let", "agent", "atom", "send", "send-off", "release-pending-sends", "add-watch", "mapv", "filterv", "remove-watch", "agent-error", "restart-agent", "set-error-handler", "error-handler", "set-error-mode!", "error-mode", "shutdown-agents", "quote", "var", "fn", "loop", "recur", "throw", "try", "monitor-enter", "monitor-exit", "defmacro", "defn", "defn-", "macroexpand", "macroexpand-1", "for", "dosync", "and", "or", "when", "when-not", "when-let", "comp", "juxt", "partial", "sequence", "memoize", "constantly", "complement", "identity", "assert", "peek", "pop", "doto", "proxy", "defstruct", "first", "rest", "cons", "defprotocol", "cast", "coll", "deftype", "defrecord", "last", "butlast", "sigs", "reify", "second", "ffirst", "fnext", "nfirst", "nnext", "defmulti", "defmethod", "meta", "with-meta", "ns", "in-ns", "create-ns", "import", "refer", "keys", "select-keys", "vals", "key", "val", "rseq", "name", "namespace", "promise", "into", "transient", "persistent!", "conj!", "assoc!", "dissoc!", "pop!", "disj!", "use", "class", "type", "num", "float", "double", "short", "byte", "boolean", "bigint", "biginteger", "bigdec", "print-method", "print-dup", "throw-if", "printf", "format", "load", "compile", "get-in", "update-in", "pr", "pr-on", "newline", "flush", "read", "slurp", "read-line", "subvec", "with-open", "memfn", "time", "re-find", "re-groups", "rand-int", "rand", "mod", "locking", "assert-valid-fdecl", "alias", "resolve", "ref", "deref", "refset", "swap!", "reset!", "set-validator!", "compare-and-set!", "alter-meta!", "reset-meta!", "commute", "get-validator", "alter", "ref-set", "ref-history-count", "ref-min-history", "ref-max-history", "ensure", "sync", "io!", "new", "next", "conj", "set!", "to-array", "future", "future-call", "into-array", "aset", "gen-class", "reduce", "map", "filter", "find", "empty", "hash-map", "hash-set", "sorted-map", "sorted-map-by", "sorted-set", "sorted-set-by", "vec", "vector", "seq", "flatten", "reverse", "assoc", "dissoc", "list", "disj", "get", "union", "difference", "intersection", "extend", "extend-type", "extend-protocol", "int", "nth", "delay", "count", "concat", "chunk", "chunk-buffer", "chunk-append", "chunk-first", "chunk-rest", "max", "min", "dec", "unchecked-inc-int", "unchecked-inc", "unchecked-dec-inc", "unchecked-dec", "unchecked-negate", "unchecked-add-int", "unchecked-add", "unchecked-subtract-int", "unchecked-subtract", "chunk-next", "chunk-cons", "chunked-seq?", "prn", "vary-meta", "lazy-seq", "spread", "list*", "str", "find-keyword", "keyword", "symbol", "gensym", "force", "rationalize", "true", "false", "nil"};

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f8251f = {'(', ')', '{', '}', '[', ']'};

    private p() {
        super.a(f8250e);
        super.a(f8251f);
    }

    public static m e() {
        if (f8249d == null) {
            f8249d = new p();
        }
        return f8249d;
    }

    @Override // e.d.a.a.m
    public Character a() {
        return null;
    }

    @Override // e.d.a.a.m
    public boolean a(char c2) {
        return c2 == '\"';
    }

    @Override // e.d.a.a.m
    public boolean a(char c2, char c3) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean a(char c2, char c3, char c4) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "clj".equals(str2);
    }

    @Override // e.d.a.a.m
    public boolean b(char c2) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean b(char c2, char c3) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean b(char c2, char c3, char c4) {
        return false;
    }

    @Override // e.d.a.a.m
    public String c() {
        return ";";
    }

    @Override // e.d.a.a.m
    public boolean c(char c2, char c3) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean d(char c2) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean e(char c2) {
        return c2 == ';';
    }

    @Override // e.d.a.a.m
    public boolean h(char c2) {
        return c2 == ':';
    }
}
