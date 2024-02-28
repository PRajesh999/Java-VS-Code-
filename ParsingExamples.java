public class ParsingExamples {
    public static void main(String[] args) {
        String x = "10"; //Decimal Stirng
        String y = "1100"; //Binary String
        String z = "ABC";  //Hex String
        int a =  Integer.parseInt(x);
        int b = Integer.parseInt(y, 2);
        int c = Integer.parseInt(z, 16);
        System.out.println(a*a);
        System.out.println(b);
        System.out.println(c);
    }
}
