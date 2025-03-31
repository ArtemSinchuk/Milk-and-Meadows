package com.github.artemsinchuk;

import javax.swing.SwingUtilities;
import com.github.artemsinchuk.cow.Cow;
import com.github.artemsinchuk.gui.*;

/**
 * Milk and Meadows is a simulation game where players take care of a virtual cow, collecting milk and crafting
 * various items from it. The game features a leveling system, daily tasks, and events that affect the cow's
 * well-being.
 * @author Artem Sinchuk
 * @version 1.0
 */

public class MainGame {
    private Cow cow;
    private CowGUI cowGUI;

    public MainGame() {
        cow = new Cow();
        cowGUI = new CowGUI(cow);
        startGameLoop();
    }

    private void startGameLoop() {
        while (true) {
            updateGame();
            cowGUI.updateBars();
            try {
                Thread.sleep(600000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateGame() {
        cow.updateWellBeing();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        MainGame mainGUi = new MainGame();
        mainGUi.cowGUI.setVisible(true);
        });
    }
}

