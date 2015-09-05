package mathmagic.robotrights436.com.mathmagic;

/**
 * Created by Peter on 7/12/2015.
 */
public class DisplayableCard {
    private String name;
    private String image;
    private boolean faceUp = false;

    public DisplayableCard(String cardName, String cardImage)
    {
        name = cardName;
        image = cardImage;

    }

    public void Display()
    {
        faceUp = !faceUp;
    }


}
