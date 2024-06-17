import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageHandler {

    private Image cowImage;
    private Image eatButtonImage;
    private Image drinkButtonImage;
    private Image sleepButtonImage;
    
    public ImageHandler() {
        loadImages();
    }

    private void loadImages() {
        cowImage = new ImageIcon("Cow.png").getImage();
        eatButtonImage = new ImageIcon("EatButton.png").getImage();
        drinkButtonImage = new ImageIcon("DrinkButton.png").getImage();
        sleepButtonImage = new ImageIcon("SleepButton.png").getImage();

    }

    public Image getCowImage() {
        return cowImage;
    }

    public Image getEatButtonImage() {
        return eatButtonImage;
    }

    public Image getDrinkButtonImage() {
        return drinkButtonImage;
    }

    public Image getSleepButtonImage() {
        return sleepButtonImage;
    }
}