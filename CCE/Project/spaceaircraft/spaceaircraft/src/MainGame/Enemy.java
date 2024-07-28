package MainGame;

import Settings.Settings;

import javax.swing.*;
import java.awt.*;//java.awt Abstract Window Toolkit.

public class Enemy extends Entity {

    private int startY;
    public Enemy(int x, int y)
    {
        super(x, y);
        startY = y;
    }

    public void update() 
    {
        y += 1;
        checkOffScreen();
        checkCollisions();
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(getEnemyImg(), x, y,null);
//        g2d.draw(getBounds());
    }

    public Image getEnemyImg() {
        ImageIcon ic = new ImageIcon("./src/resources/enemy.png");
        return ic.getImage();
    }

    public void checkCollisions() {
        for(int i = 0; i < GameFrame.getMissileList().size(); i++) {
            Missile m = GameFrame.getMissileList().get(i);
            if(getBounds().intersects(m.getBounds())) {
                GameFrame.removeEnemy( this);//from gameframe
                GameFrame.removeMissile(m);
                if(Settings.isSoundOn()) {
                    Sound.destroySound();
                }
                GameFrame.score.update();
            }
        }
    }

    public void checkOffScreen()
    {
        if(y >= 610) 
        {
            
           y = startY;//y is indeed greater than or equal to 610, the value of y is reset to the value of startY.
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, getEnemyImg().getWidth(null), getEnemyImg().getHeight(null));
        //these methods indicates that the caller does not provide a ImageObserver object to observe changes in the image loading process.
    }
}
