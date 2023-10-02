public class Demo {
    public static void main(String[] args) {

        Computer computer1 = new Computer("12345", "Model A", 8, 500, true);
        Computer computer2 = new Computer("67890", "Model B", 16, 1000, false);

        // Clone computer1 to create a new Computer object
        Computer clonedComputer = computer1.clone();

        // Compare computer1 and clonedComputer for equality
        boolean areEqual = computer1.equals(clonedComputer);
        System.out.println("Are computer1 and clonedComputer equal? " + areEqual); // Should print "true"

        // Compare computer1 and computer2 for equality
        areEqual = computer1.equals(computer2);
        System.out.println("Are computer1 and computer2 equal? " + areEqual); // Should print "false"


    }}



