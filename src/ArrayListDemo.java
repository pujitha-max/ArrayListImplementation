
import java.util.ArrayList;

public class ArrayListDemo {

    private ArrayList<String> items = new ArrayList<>();

    // Add an element
    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added successfully.");
    }

    // Remove an element
    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " removed successfully.");
        } else {
            System.out.println(item + " not found in the list.");
        }
    }

    // Search for an element
    public void searchItem(String item) {
        if (items.contains(item)) {
            System.out.println(item + " found in the list.");
        } else {
            System.out.println(item + " not found in the list.");
        }
    }

    // Display all elements
    public void displayItems() {
        System.out.println("\nCurrent ArrayList:");
        if (items.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (String item : items) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();

        demo.addItem("Java");
        demo.addItem("Python");
        demo.addItem("SQL");

        demo.displayItems();

        demo.searchItem("Python");

        demo.removeItem("SQL");

        demo.displayItems();
    }
}
