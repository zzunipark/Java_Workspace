public class Variable {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '\u0041';
        char c3 = '\ubc15';
        char c4 = '\ubbfc';
        char c5 = '\uc900';

        boolean condition = true;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        if (condition) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
