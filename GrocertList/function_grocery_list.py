class GroceryList:

    def _init_(self):
        self.items = []

    def add_item(self, item):

        if item not in self.items:
            self.items.append(item)

            return f"{item} added."

        return f"{item} is already in the list."

    def remove_item(self, item):

        if item in self.items:
            self.items.remove(item)

            return f"{item} removed."

        return f"{item} not found in the list."

    def show_items(self):
        return self.items