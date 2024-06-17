import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class CowGUI extends JFrame {

    JLabel lblCowLabel = new JLabel("Cow Miley");
    JButton btnEatButton = new JButton("Eat");
    JButton btnDrinkButton = new JButton("Drink");
    JButton btnSleepButton = new JButton("Sleep");
    JProgressBar barHealth = new JProgressBar();
    JProgressBar barEat = new JProgressBar();
    JProgressBar barDrink = new JProgressBar();

    public CowGUI() {
        createGUI();
        addComponents();
    }

    private void createGUI() {
        setupFrame();
        setupLabel();
        setupButtons();
    }

    private void setupFrame() {
        setTitle("Cow Game");
        setSize(750, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(135, 206, 235));
        setLayout(new GridBagLayout());

        ImageIcon imageIcon = new ImageIcon("icon.png");
        setIconImage(imageIcon.getImage());
    }

    private void setupLabel() {
        ImageIcon imageIcon = new ImageIcon("/images/Cow.png");
        lblCowLabel.setIcon(imageIcon);
        lblCowLabel.setHorizontalTextPosition(JLabel.CENTER);
        lblCowLabel.setVerticalTextPosition(JLabel.TOP);
        lblCowLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        lblCowLabel.setIconTextGap(-75);
        lblCowLabel.setBackground(Color.WHITE);
        lblCowLabel.setOpaque(true);
        lblCowLabel.setVerticalAlignment(JLabel.CENTER);
        lblCowLabel.setHorizontalAlignment(JLabel.CENTER);

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        lblCowLabel.setBorder(border);
    }

    private void setupButtons() {
        btnEatButton.addActionListener(e -> {
            System.out.println("Eat button pressed");
        });

        btnDrinkButton.addActionListener(e -> {
        System.out.println("Drink button pressed");

        });
        btnSleepButton.addActionListener(e -> {
            System.out.println("Sleep button pressed");
        });
    }

    private void addComponents() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10,10,10,10);

    gbc.gridwidth = 1;
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(lblCowLabel, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    add(btnEatButton, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    add(btnDrinkButton, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    add(btnSleepButton, gbc);
}
    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
          CowGUI gui = new CowGUI();
          gui.setVisible(true);
      });
  }
}
