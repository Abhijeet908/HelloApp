public class UC4{

    public static void main(String[] args) {

        String name;

        // If no arguments are given
        if (args.length == 0) {
            name = "World";
        } 
        else {
            // Build a string with multiple names
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}