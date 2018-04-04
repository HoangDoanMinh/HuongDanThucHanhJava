/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author DOANMINH
 */
public class SWING extends JFrame{
    public SWING (){
        setTitle("SW1");
        setSize(300,200);
        setLayout(new FlowLayout());
        
        Container cp = getContentPane();
        JLabel lbHello = new JLabel("Hello swing");
        cp.add(lbHello);
        setVisible(true);
            
      
    }
    public static void main(String[] args){
        SWING swing = new SWING();
    }
}
