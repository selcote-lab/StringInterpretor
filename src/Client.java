public class Client {
    private InterpretorContext ic;

    public Client(InterpretorContext ic) {
        this.ic = ic;
    }

    public String interpret(String str) {
        Expression exp = null;

        if(str.contains("Hexadecimal")) {
            exp = new InToHexadecimalExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }
        else if(str.contains("Binary")) {
            exp = new InToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }
        else {
            return str;
        }

        return exp.interpret(this.ic);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "29 in Hexadecimal";

        Client client = new Client(new InterpretorContext());

        System.out.println(client.interpret(str1));
        System.out.println(client.interpret(str2));
    }
}
