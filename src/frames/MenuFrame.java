/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author kasra
 */
public class MenuFrame extends JFrame{
    
    public static JButton client;
    public static JButton server;
    
    public MenuFrame() {
        super("Menu");
        
        // Set Layout Manager
        setLayout(new GridBagLayout());
        
        // Create Swing Components
        JPanel buttonPanel = new ButtonPanel();
        JPanel infoForm = new infoPanel();
        
        // Add Swing Components to its Contents Pane
        Container c = getContentPane();
        GridBagConstraints gc = new GridBagConstraints();
        gc.weightx = 0.5;
        gc.weighty = 0.5;
        gc.gridy = 0;
        
        gc.gridx = 0;
        c.add(infoForm, gc);
        
        gc.gridx = 1;
        c.add(buttonPanel, gc);
    }
    
    
    
    class ButtonPanel extends JPanel {
        ButtonPanel() {
            setPreferredSize(new Dimension(200,100));
            setLayout(new BorderLayout());
            JButton clientButton = new JButton("Client");
            JButton serverButton = new JButton("Server");
            
            client = clientButton;
            server = serverButton;
            
            add(clientButton, BorderLayout.NORTH);
            add(serverButton, BorderLayout.SOUTH);
        }
    }
    
    class infoPanel extends JPanel {
        infoPanel() {
            setBorder(BorderFactory.createTitledBorder("Network Information"));
            
            // Set Layout Manager
            setLayout(new GridBagLayout());
            
            // Create Swing Components
            JLabel portLabel = new JLabel("Port: ");
            JLabel addressLabel = new JLabel("Address: ");
            JTextField portField = new JTextField(10);
            JTextField addressField = new JTextField(10);
            
            // Add them to your Panel
            GridBagConstraints gc = new GridBagConstraints();
            gc.ipadx = 10;
            gc.ipady = 10;
            gc.weightx = 1;
            gc.weighty = 1;
            
            gc.anchor = GridBagConstraints.LINE_END;
            gc.gridx = 0;
            gc.gridy = 0;
            add(addressLabel, gc);
            gc.gridy = 1;
            add(portLabel, gc);
            
            gc.anchor = GridBagConstraints.LINE_START;
            gc.gridx = 1;
            gc.gridy = 0;
            add(addressField, gc);
            gc.gridy = 1;
            add(portField, gc);
        }
    }
}