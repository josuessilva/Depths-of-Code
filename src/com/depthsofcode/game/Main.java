import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.*;

class GamePanel extends JPanel implements Runnable {

    private boolean running = true;

    public GamePanel(){



        new Thread(this).start();

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillRect(0,0,getWidth(),getHeight());

    }
    public void mover(){

    }
    public void colisao(){

    }

    public void render(){
        repaint();

    }
    public void update(){
        mover();
        colisao();
    }




    @Override
    public void run(){

        while(running){

            render();
            update();


            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                System.out.println("Thread Erro : "+ e);
                break;
            }
        }


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