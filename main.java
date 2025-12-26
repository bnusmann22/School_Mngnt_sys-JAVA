import core.Menu;

/**
 * Main entry point for the School Management System.
 */
public class Main {
    public static void main(String[] args) {
        try (Menu menu = new Menu()) {
            menu.show();
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}