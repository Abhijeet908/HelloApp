public class UC2 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please provide your name as an argument.");
            return;
        }
        
        String name = args[0];
        System.out.println("Hello, " + name + "!");
    }
}