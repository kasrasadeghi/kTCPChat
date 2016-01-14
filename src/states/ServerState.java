/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import javax.swing.JFrame;
import static ktcpchat.KTCPChat.frame;
import ktcpchat.State;

/**
 *
 * @author Sarah M
 */
public class ServerState implements State {
    
    static final ServerState instance = new ServerState();
    private ServerState() {
    }
    public static ServerState instance() { return instance; }

    @Override
    public void enter() {
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void execute() {
    }

    @Override
    public void exit() {
    }
    
}
