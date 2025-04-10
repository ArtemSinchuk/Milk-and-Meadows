package com.github.artemsinchuk.cow;

import java.util.ArrayList;
import java.util.List;

import com.github.artemsinchuk.cow.Slot;
/**
 * The Inventory class represents the player's inventory and provides methods for managing items.
 * @author Artem Sinchuk
 * @version 1.1
 */
public class Inventory {
    private List<Slot> slots;
    private int size;

    /**
     * Constructor to create an inventory with the specified size.
     * @param size number of slots in the inventory
     */
    public Inventory(int size) {
        this.size = size;
        this.slots = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            slots.add(new Slot());
        }
    }

   /**
     * Method for adding an item to the inventory.
     * If there is already such an item in the inventory and there is a stack slot, the items are stacked.
     * If there is no such item or all stacks are full, the item is added to an empty slot.
     * @param newItem the item to be added to the inventory
     * @return true if the item was successfully added, otherwise false (inventory is full)
     */
    public boolean addItem(Item newItem) {
        for (Slot slot : slots) {
            if (!slot.isEmpty() && slot.getItem().getName().equals(newItem.getName())) {
                int currentQuantity = slot.getItem().getQuantity();
                int maxStackSize = slot.getItem().getMaxStackSize();
                if (currentQuantity < maxStackSize) {
                    int remainingSpace = maxStackSize - currentQuantity;
                    int addQuantity = Math.min(newItem.getQuantity(), remainingSpace);
                    slot.getItem().setQuantity(currentQuantity + addQuantity);
                    newItem.setQuantity(newItem.getQuantity() - addQuantity);
                    if (newItem.getQuantity() == 0) {
                        return true;
                    }
                }
            }
        }
    /*
     * If the item could not be added to an existing stack, attempt to add it to an empty slot
     */
        for (Slot slot : slots) {
            if (slot.isEmpty()) {
                slot.setItem(newItem);
                return true;
            }
        }
        return false; // Inventory is full
    }

    /**
     * Method to remove the specified number of items from the inventory.
     * If there are not enough items in the inventory, the method does not delete anything.
     * @param itemName the name of the item to be deleted
     * @param quantity the number of items to be deleted
     */
    public void removeItem(String itemName, int quantity) {
        for (Slot slot : slots) {
            if (!slot.isEmpty() && slot.getItem().getName().equals(itemName)) {
                int currentQuantity = slot.getItem().getQuantity();
                if (currentQuantity >= quantity) {
                    slot.getItem().setQuantity(currentQuantity - quantity);
                    if (slot.getItem().getQuantity() == 0) {
                        slot.setItem(null);
                    }
                    return;
                }
            }
        }
    }

     /**
     * Method to get the total amount of the specified item in the inventory.
     * @param itemName is the name of the item whose quantity is to be found out
     * @return the total amount of the specified item in the inventory
     */
    public int getItemQuantity(String itemName) {
        int totalQuantity = 0;
        for (Slot slot : slots) {
            if (!slot.isEmpty() && slot.getItem().getName().equals(itemName)) {
                totalQuantity += slot.getItem().getQuantity();
            }
        }
        return totalQuantity;
    }

    /*
     * Method for outputting inventory contents to the console.
     * Shows items and their quantity in each slot.
     */
    public void printInventory() {
        for (int i = 0; i < slots.size(); i++) {
            Slot slot = slots.get(i);
            if (!slot.isEmpty()) {
                System.out.println("Slot " + i + ": " + slot.getItem().getName() + " x " + slot.getItem().getQuantity());
            } else {
                System.out.println("Slot " + i + ": empty");
            }
        }
    }
}
