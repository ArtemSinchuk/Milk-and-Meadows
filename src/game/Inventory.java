import java.util.HashMap;
import java.util.Map;

public class Inventory {
  private Map<String, Integer> items;

  public Inventory() {
      this.items = new HashMap<>();
  }

  public void addItem(String itemName) {
      if (items.containsKey(itemName)) {
          int currentQuantity = items.get(itemName);
          if (currentQuantity < 50) {
              items.put(itemName, currentQuantity + 1);
          } else {
              items.put(itemName + "_" + items.size(), 1);
          }
      } else {
          items.put(itemName, 1);
      }
  }

  public int getItemQuantity(String itemName) {
      return items.getOrDefault(itemName, 0);
  }
}