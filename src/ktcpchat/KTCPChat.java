/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktcpchat;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author kasra
 */
public class KTCPChat{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new FormsMenuFrame();
//            frame.setSize(560, 120);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
    
}
