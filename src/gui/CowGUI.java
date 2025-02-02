import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import cow.Cow;
public class CowGUI extends JFrame {

    private Cow cow;
    private JLabel lblCowLabel = new JLabel("Cow Miley");
    private JButton btnAccount = new JButton("Account");
    private JButton btnEatButton = new JButton("Eat");
    private JButton btnDrinkButton = new JButton("Drink");
    private JButton btnSleepButton = new JButton("Sleep");
    private JButton btnForest = new JButton("Forest");
    private JButton btnTasks = new JButton("Tasks");
    private JButton btnEvents = new JButton("Events");
    private JProgressBar barHealth = new JProgressBar(), barEat = new JProgressBar(), barDrink = new JProgressBar();
    private JPanel centerPanel, northPanel, southPanel, eastPanel, westPanel;

    public CowGUI() {
        createGUI();
         addComponents();
         new ImageHandler();
    }

    public CowGUI(Cow cow) {
        createGUI();
        addComponents();
        new ImageHandler();
        this.cow = new Cow();
       //  visibleComponents();
   }

    private void createGUI() {
        setupFrame();
        setupLabel();
        setupButtons();
        setupBars();
    }

    private void setupFrame() {
        setTitle("Cow Game");
        setSize(750, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(135, 206, 235));
        setResizable(false);

        ImageIcon imageIcon = new ImageIcon("icon.png");
        setIconImage(imageIcon.getImage());
    }

    private void setupLabel() {
        ImageIcon imageIcon = new ImageIcon("/images/Cow.png");
        lblCowLabel.setVisible(false);
        lblCowLabel.setIcon(imageIcon);
        lblCowLabel.setSize(150, 20);
        lblCowLabel.setLocation(325, 325);
        lblCowLabel.setHorizontalTextPosition(JLabel.CENTER);
        lblCowLabel.setVerticalTextPosition(JLabel.TOP);
        lblCowLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        lblCowLabel.setIconTextGap(-75);
        lblCowLabel.setBackground(Color.WHITE);
        lblCowLabel.setOpaque(true);

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        lblCowLabel.setBorder(border);
        
    }

    private void setupButtons() {
        
        btnAccount.setSize(60, 60);
        btnAccount.setLocation(10, 15);
        btnAccount.addActionListener(e -> {
            System.out.println("Account button pressed");
        });

        btnEatButton.setSize(60, 60);
        btnEatButton.setLocation(25, 150);
        btnEatButton.addActionListener(e -> {
            System.out.println("Eat button pressed");
        });
        
        btnDrinkButton.setSize(60, 60);
        btnDrinkButton.setLocation(25, 225);
        btnDrinkButton.addActionListener(e -> {
            System.out.println("Drink button pressed");
            
        });
        
        btnSleepButton.setSize(60, 60);
        btnSleepButton.setLocation(25, 300);
        btnSleepButton.addActionListener(e -> {
            System.out.println("Sleep button pressed");
        });
        
        btnForest.setSize(60, 60);
        btnForest.setLocation(650, 450);
        btnForest.addActionListener(e -> {
            System.out.println("Forest button pressed");
        });
        
        btnTasks.setSize(60, 60);
        btnTasks.setLocation(25, 450);
        btnTasks.addActionListener(e -> {
            System.out.println("Tasks button pressed");
        });
        
        btnEvents.setSize(60, 60);
        btnEvents.setLocation(650, 150);
        btnEvents.addActionListener(e -> {
            System.out.println("Events button pressed");
        });

    }

    private void addComponents() {
        add(lblCowLabel);
        add(btnAccount);
        add(btnEatButton);
        add(btnDrinkButton);
        add(btnSleepButton);
        add(btnForest);
        add(btnTasks);
        add(btnEvents);
        add(barHealth);
        add(barEat);
        add(barDrink);
}
    private void setupBars(){
    barHealth.setMaximum(100);
    barHealth.setValue(100);
    barHealth.setForeground(Color.RED);
    barHealth.setSize(100, 15);
    barHealth.setLocation(625, 15);
    
    barEat.setMaximum(100);
    barEat.setValue(100);
    barEat.setForeground(Color.GREEN);
    barEat.setSize(100, 15);
    barEat.setLocation(625, 35);

    barDrink.setMaximum(100);
    barDrink.setValue(100);
    barDrink.setForeground(new Color(0, 128, 255));
    barDrink.setSize(100, 15);
    barDrink.setLocation(625, 55);
    }
    
    public void updateBars() {
    barHealth.setValue(cow.getHealth());
    //barHappiness.setValue(cow.getHappiness());
    barDrink.setValue(cow.getHydration());
    barEat.setValue(cow.getSatiety());
    }
    
    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
          CowGUI gui = new CowGUI();
          gui.setVisible(true);
      });
  }
}
