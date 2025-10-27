public class GroceryListTest {
    public static void main(String[] args) {
        GroceryList gl = new GroceryList();

        assert addItem("Milk").equals("Milk added.");
        assert addItem("Milk").equals("Milk is already in the list.");
        assert addItem("Eggs").equals("Eggs added.");

        assert showItems().size() == 2;
        assert showItems().get(0).equals("Milk");
        assert showItems().get(1).equals("Eggs");

        assert removeItem("Milk").equals("Milk removed.");
        assert removeItem("Milk").equals("Milk not found in the list.");

        assert showItems().size() == 1;
        assert showItems().get(0).equals("Eggs");

        System.out.println("All Java tests passed!");
    }
}