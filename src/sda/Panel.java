package sda;

import javax.swing.*;
import java.util.Random;

public class Panel {

   private int wight = 500, height = 500;
   // String s =Players.getNamePlayer();
    public void initPanel(){
        JFrame frame = new JFrame("Gigurda");
        JPanel jp = new JPanel();
        JButton roll = new JButton("Бросить кости");
        JLabel rollRezult = new JLabel("результат костей");
        JLabel movePlayers = new JLabel("Ходит игрок: ");

        frame.setSize(wight, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(jp);
        frame.setVisible(true);
        jp.add(roll);
        jp.add(rollRezult);
        jp.add(movePlayers);

    }



    }
    public void rollClick(){
        if ( )
    }
}
