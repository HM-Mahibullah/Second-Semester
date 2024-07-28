package MainGame;

import javax.swing.*;

public class AirCraft extends JFrame {
    public AirCraft() 
    {
        setTitle("Space AirCraft");
        setSize(600,600);//background size 
        setIconImage(new ImageIcon("./src/resources/spaceship.png").getImage());
     
        add(new GameFrame());//object
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
