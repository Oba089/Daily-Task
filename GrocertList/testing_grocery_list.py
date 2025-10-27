from grocery_manager import GroceryList

def test_grocery_list():
    item = GroceryList()
    
    assert add.item("Milk") == "Milk added."
    assert add_item("Milk") == "Milk is already in the list."
    assert add_item("Eggs") == "Eggs added."
    
    assert show_items() == ["Milk", "Eggs"]
    
    assert remove_item("Milk") == "Milk removed."
    assert remove_item("Milk") == "Milk not found in the list."
    
    assert show_items() == ["Eggs"]

test_grocery_list()

print("All tests passed!")







 