package com.github.artemsinchuk.game;
/*
 * The Tasks class represents daily tasks that a virtual cow can perform.
 * These tasks include activities like milking the cow, collecting cow dung, and exploring the forest.
 */

public class DailyTasks {
    public void performTask(String taskName) {
        if (taskName.equalsIgnoreCase("feed")) {
            feedCow();
        } else if (taskName.equalsIgnoreCase("water")) {
            waterCow();
        } else if (taskName.equalsIgnoreCase("milk")) {
            milkCow();
        } else if (taskName.equalsIgnoreCase("collect dung")) {
            collectCowDung();
        } else if (taskName.equalsIgnoreCase("explore forest")) {
            exploreForest();
        } else {
            System.out.println("Invalid task: " + taskName);
        }
    }

    private void feedCow() {
        // Code to feed the cow
        System.out.println("The cow is being fed.");
    }

    private void waterCow() {
        // Code to water the cow
        System.out.println("The cow is being watered.");
    }

    private void milkCow() {
        // Code to milk the cow
        System.out.println("The cow is being milked.");
    }

    private void collectCowDung() {
        // Code to collect cow dung
        System.out.println("Cow dung is being collected.");
    }

    private void exploreForest() {
        // Code to explore the forest
        System.out.println("The cow is exploring the forest.");
    }
}