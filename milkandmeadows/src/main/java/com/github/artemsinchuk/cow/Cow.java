package com.github.artemsinchuk.cow;

/**
 * Milk and Meadows is a simulation game where players take care of a virtual cow, collecting milk and crafting
 * various items from it. The game features a leveling system, daily tasks, and events that affect the cow's
 * well-being.
 */

public class Cow {

    private String name;
    private int level;
    private int experience;
    private int hydration;
    private int satiety;
    private int health;
    private int productivity;
    private int happiness;
    private boolean isSleeping;
    private boolean isReadyToMilk;
    private boolean isReadyToPoop;
    private int water;
    
    public Cow() {
        this.name = "Miley";
        this.level = 0;
        this.experience = 0;
        this.hydration = 100;
        this.satiety = 100;
        this.health = 100;
        this.productivity = 100;
        this.happiness = 100;
        this.isSleeping = false;
        this.isReadyToMilk = false;
        this.isReadyToPoop = false;
        this.water = 100;
    }

    public Cow(String name, int level, int experience, int thirst, int hunger, int health, int productivity, int happiness, boolean isSleeping, boolean isReadyToMilk, boolean isReadyToPoop, int water) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.hydration = thirst;
        this.satiety = hunger;
        this.health = health;
        this.productivity = productivity;
        this.happiness = happiness;
        this.isSleeping = isSleeping;
        this.isReadyToMilk = isReadyToMilk;
        this.isReadyToPoop = isReadyToPoop;
        this.water = water;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getHydration() {
        return hydration;
    }

    public void setHydration(int thirst) {
        this.hydration = thirst;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int hunger) {
        this.satiety = hunger;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    
    public boolean isSleeping() {
        return isSleeping;
    }
    
    public void setSleeping(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }
    
    public boolean isReadyToMilk() {
        return isReadyToMilk;
    }
    
    public void setReadyToMilk(boolean isReadyToMilk) {
        this.isReadyToMilk = isReadyToMilk;
    }
    
    public boolean isReadyToPoop() {
        return isReadyToPoop;
    }
    
    public void setReadyToPoop(boolean isReadyToPoop) {
        this.isReadyToPoop = isReadyToPoop;
    }
    
    public int getWater() {
        return water;
    }
    
    public void setWater(int water) {
        this.water = water;
    }
/*
 * Simulates the cow eating grass and hay. Decreases the cow's hunger level and increases health
 */
public void eat(FoodType foodType) {
    switch (foodType) {
        case GRASS:
            satiety = Math.max(0, satiety - 15);
            health = Math.min(100, health + 5);
            break;
        case HAY:
            satiety = Math.max(0, satiety - 60);
            health = Math.min(100, health + 25);
            break;
        default:
            System.out.println("Invalid food type: " + foodType);
            return;
    }
}
/*
 * Simulates the cow drinking water. Decreases the cow's thirst level
 */
    public void drink(int amount) {
        if (water >= amount) {
            water -= amount;
            hydration = Math.min(100, Math.max(0, hydration + 35));
            health = Math.min(100, Math.max(0, health + 10));

        }
    }
/*
 * Simulates the cow sleeping. Increases the cow's happiness level and health
 */
    public void sleep(int hours) {
    if (!isSleeping) {
        isSleeping = true;
        happiness += 10 + hours;
        health += 5 + hours;
        productivity += 2 + hours;
    }
}
/*
 * Simulates the cow producing milk. Returns the amount of milk produced based on the cow's productivity level
 */
public int collectMilk() {
    if (isReadyToMilk) {
        isReadyToMilk = false;
        return productivity / 10;
    }
    return 0;
}
/*
 * Simulates the cow pooping. Increases the poop count
 */
public void poop() {
    if (isReadyToPoop) {
        isReadyToPoop = false;
    }
}
/*
 * Updates the cow's well-being attributes (hunger, thirst, health, happiness) over time
 */
public void updateWellBeing() {
    satiety++;
    hydration++;
    health--;
    productivity--;
    happiness--;

    if (satiety >= 100) {
        health -= 10;
    }
    if (hydration >= 100) {
        health -= 10;
    }
    if (health <= 0) {
        setHealth(1);
    } else if (health < 25) {
        System.out.println("The cow is in critical condition.");
    } else if (health < 60) {
        System.out.println("The cow is in poor condition.");
    }
}
}