package greeting;

public class Hello {
    public static void main(String[] args) {
        String target = args.length > 0 ? args[0] : "World";
        System.out.println("Hello" + target + "!");
    }
}
