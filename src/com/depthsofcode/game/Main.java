import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class GamePanel extends JPanel implements Runnable,KeyListener {

    private boolean running = true;

    private boolean player_up,player_down,player_left,player_right;

    private int player_tamanho = 15;
    private int player_X = 200;
    private int player_Y = 200;
    private int player_velocidade = 5;

    public GamePanel(){

        addKeyListener(this);
        setFocusable(true);

        new Thread(this).start();

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillRect(0,0,getWidth(),getHeight());

        g.setColor(Color.red);
        g.fillRect(player_X , player_Y, player_tamanho , player_tamanho);
        

    }
    public void mover(){

        if(player_up) player_Y -= player_velocidade;
        if(player_down) player_Y += player_velocidade;
        if(player_left) player_X -= player_velocidade;
        if(player_right) player_X += player_velocidade;

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

    @Override
    public void keyTyped(KeyEvent e) {
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int tecla = e.getKeyCode();

        switch (tecla) {
            case KeyEvent.VK_W : player_up = true; break;
            case KeyEvent.VK_S : player_down = true; break;
            case KeyEvent.VK_A : player_left = true; break;
            case KeyEvent.VK_D : player_right = true; break;

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
      
         int tecla = e.getKeyCode();

        switch (tecla) {
            case KeyEvent.VK_W : player_up = false; break;
            case KeyEvent.VK_S : player_down = false; break;
            case KeyEvent.VK_A : player_left = false; break;
            case KeyEvent.VK_D : player_right = false; break;

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