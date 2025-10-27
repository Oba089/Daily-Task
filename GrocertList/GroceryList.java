import java.util.ArrayList;
import java.util.List;

    public GroceryList() {
        items = new ArrayList<>();
    }

    public String addItem(String item) {
        if(!items.contains(item)) {
            items.add(item);
            return item + " added.";
        }
        return item + " is already in the list.";
    }

    public String removeItem(String item) {
        if(items.contains(item)) {
            items.remove(item);
            return item + " removed.";
        }
        return item + " not found in the list.";
    }
   public List<String> showItems() {
        return items;
    }
}