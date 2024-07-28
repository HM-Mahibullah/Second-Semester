package MainGame;

import javax.swing.*;
import java.awt.*;

public class Missile extends Entity {

    public Missile(int x, int y) {
        super(x, y);
    }

    public void update() 
    {
        y -= 3;// if i write plus sign(+) then missile go to anti direction
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(getMissileImg(), x+5, y, null);// if i ues only x then missile can not throw from the fighter head.
//        g2d.draw(getBounds());
    }

    public Image getMissileImg() {
        ImageIcon ic = new ImageIcon("./src/resources/missile.png");
        return ic.getImage();
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, getMissileImg().getWidth(null), getMissileImg().getHeight(null));
    }
}
