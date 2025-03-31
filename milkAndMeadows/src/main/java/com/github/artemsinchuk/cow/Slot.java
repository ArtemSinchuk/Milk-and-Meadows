package com.github.artemsinchuk.cow;

public class Slot {
  private Item item;

  public Slot() {
      this.item = null;
  }

  public Item getItem() {
      return item;
  }

  public void setItem(Item item) {
      this.item = item;
  }

  public boolean isEmpty() {
      return item == null || item.getQuantity() == 0;
  }
}
