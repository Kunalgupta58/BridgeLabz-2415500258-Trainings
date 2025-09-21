public class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item(1001, "Laptop", 1200.00);
        item1.displayItemDetails();

        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("\nTotal cost for " + quantity + " " + item1.itemName + ": $" + String.format("%.2f", totalCost));
    }
}
