import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.*;

class GamePanel extends JPanel{

    public GamePanel(){

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillRect(0,0,getWidth(),getHeight());

    }
}

public class Main{
    public static void main(String [] args){

        SwingUtilities.invokeLater(() ->{


        JFrame janela = new JFrame();
        GamePanel gamePanel = new GamePanel();


        janela.setTitle("Depths of Code");

        janela.add(gamePanel);
        gamePanel.setPreferredSize(new Dimension(800,600));
        janela.pack();
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);


        });
        
       




    }
}