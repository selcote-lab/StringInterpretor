public interface Expression {
    String interpret(InterpretorContext ic);
}

class InToBinaryExpression implements Expression {
    private int i;

    public InToBinaryExpression(int i) {
        this.i = i;
    }

    public String interpret(InterpretorContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}

class InToHexadecimalExpression implements Expression {
    private int i;

    public InToHexadecimalExpression(int i) {
        this.i = i;
    }

    public String interpret(InterpretorContext ic) {
        return ic.getHexadecimalFormat(this.i);
    }
}
