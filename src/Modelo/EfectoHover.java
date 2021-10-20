/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author velez
 */
public class EfectoHover extends JLabel {
    private float opacidad= 1f;

    public EfectoHover() {
        super();
        addMouseListener(new EventLabel());
    }
    
    public void setopacity(float opacidad){
        this.opacidad=opacidad;
        repaint();
    }

    public float getOpacidad() {
        return this.opacidad;
    }
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2= (Graphics2D) g;
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacidad));
        super.paintComponent(g2);
    }
    
    public class EventLabel extends MouseAdapter{
        
        @Override
        public void mouseEntered(MouseEvent e) {
            efectoHover(1f, 0.5f, 0.03f, 10, false);
        }
        
        @Override
        public void mouseExited(MouseEvent e) {
            efectoHover(0.5f, 1f, 0.03f, 10, true);
        }
        
        public void efectoHover(float index, float range, float cont, int sleep, boolean event){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(float i = index; (event)?i<=range:i>=range;i= (event)?i+cont:i-cont){
                        setopacity(i);
                        try{
                            Thread.sleep(sleep);
                        }catch(Exception e){
                            
                        }
                    }
                }
            }).start();
        }
    }
}
