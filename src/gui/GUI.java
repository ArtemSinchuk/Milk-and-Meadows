// * This code was generated with love by Window Builder VS Code extension. * //

import javax.swing.*;
import java.awt.*;


public class GUI {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Milk and Meadow GUi");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 500);
    
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Fill the layout with placeholders
    for (int row = 0; row < 20; row++) {
        for (int col = 0; col < 20; col++) {
            constraints.gridx = col;
            constraints.gridy = row;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;

            Component filler = Box.createRigidArea(new Dimension(0, 0));
            panel.add(filler, constraints);
        }
    }

    constraints.weightx = 0;
    constraints.weighty = 0;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTHWEST;

    
    JButton btnAccount = new JButton("Account");
    btnAccount.setPreferredSize(new Dimension(100, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btnAccount, constraints);
    
    JButton btnEat = new JButton("eat");
    btnEat.setPreferredSize(new Dimension(75, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 8;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btnEat, constraints);
    
    JButton btnDrink = new JButton("drink");
    btnDrink.setPreferredSize(new Dimension(75, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 9;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btnDrink, constraints);
    
    JButton btnSleep = new JButton("sleep");
    btnSleep.setPreferredSize(new Dimension(75, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 10;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btnSleep, constraints);
    
    JButton btnPoop = new JButton("poop");
    btnPoop.setPreferredSize(new Dimension(75, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 11;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btnPoop, constraints);
    
    JButton btnForest = new JButton("forest");
    btnForest.setPreferredSize(new Dimension(75, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 14;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btnForest, constraints);
    
    JButton btnTasks = new JButton("tasks");
    btnTasks.setPreferredSize(new Dimension(75, 27));
    
    constraints.gridx = -20;
    constraints.gridy = 14;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btnTasks, constraints);
    
    JButton btnInv = new JButton("inventory");
    btnInv.setPreferredSize(new Dimension(89, 27));
    
    constraints.gridx = -20;
    constraints.gridy = 8;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btnInv, constraints);
    
    JButton button_8 = new JButton("events");
    button_8.setPreferredSize(new Dimension(80, 27));
    
    constraints.gridx = -20;
    constraints.gridy = 10;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(button_8, constraints);
    
    // JButton button_9 = new JButton("Button");
    // button_9.setPreferredSize(new Dimension(55, 27));
    
    // constraints.gridx = -8;
    // constraints.gridy = 12;
    // constraints.gridwidth = 2;
    // constraints.gridheight = 2;
    // panel.add(button_9, constraints);
    
    JProgressBar barHealth = new JProgressBar();
    barHealth.setPreferredSize(new Dimension(135, 10));
    barHealth.setMaximum(100);
    barHealth.setValue(100);
    barHealth.setForeground(Color.RED);
    constraints.gridx = -20;
    constraints.gridy = 0;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(barHealth, constraints);
    
    JProgressBar barHunger = new JProgressBar();
    barHunger.setPreferredSize(new Dimension(135, 10));
    barHunger.setMaximum(100);
    barHunger.setValue(100);
    barHunger.setForeground(Color.GREEN);
    constraints.gridx = 17;
    constraints.gridy = 1;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(barHunger, constraints);
    
    JProgressBar barThirst = new JProgressBar();
    barThirst.setPreferredSize(new Dimension(135, 10));
    barThirst.setMaximum(100);
    barThirst.setValue(100);
    barThirst.setForeground(new Color(0,128,255));
    constraints.gridx = 17;
    constraints.gridy = 2;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(barThirst, constraints);

    JProgressBar barProductivity = new JProgressBar();
    barProductivity.setPreferredSize(new Dimension(135, 10));
    barProductivity.setMaximum(100);
    barProductivity.setValue(100);
    barProductivity.setForeground(new Color(0,128,255));
    constraints.gridx = 17;
    constraints.gridy = 3;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(barProductivity, constraints);

    JProgressBar barHappiness = new JProgressBar();
    barHappiness.setPreferredSize(new Dimension(135, 10));
    barHappiness.setMaximum(100);
    barHappiness.setValue(100);
    barHappiness.setForeground(new Color(0,128,255));
    constraints.gridx = 17;
    constraints.gridy = 4;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(barHappiness, constraints);

    frame.add(panel);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
  }
}
    