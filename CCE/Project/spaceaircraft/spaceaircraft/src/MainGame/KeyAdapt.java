package MainGame;

import java.awt.event.KeyAdapter;// Abstract Window Toolkit (AWT).
import java.awt.event.KeyEvent;

public class KeyAdapt extends KeyAdapter {
    Player player;

    public KeyAdapt(Player player) {
        this.player = player;
    }

    @Override
    public void keyPressed(KeyEvent e) {//the name of 'e' is  parameter.
        player.keyPressed(e);//from settings.
    }

    public void keyReleased(KeyEvent e) {//It takes a KeyEvent object e as a parameter, which represents the event of releasing a key.
        player.keyReleased(e);//from settings
    }

}
