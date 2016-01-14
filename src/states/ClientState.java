/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import static ktcpchat.KTCPChat.frame;
import ktcpchat.State;
import javax.swing.JFrame;
/**
 *
 * @author Sarah M
 */
public class ClientState implements State {
    
    static final ClientState instance = new ClientState();
    private ClientState() {
    }
    public static ClientState instance() { return instance; }

    @Override
    public void enter() {
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);
        
        execute();
    }

    @Override
    public void execute() {
    }

    @Override
    public void exit() {
    }
    
}
