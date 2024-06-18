// package milkandmeadows.cow;
public class Item {

    private String name;
    private int quantity;
    private int maxStackSize;

    public Item(String name, int maxStackSize) {
        this.name = name;
        this.quantity = 0;
        this.maxStackSize = maxStackSize;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMaxStackSize() {
        return maxStackSize;
    }
}
