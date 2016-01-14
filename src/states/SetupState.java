/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import frames.ClientFrame;
import javax.swing.JFrame;
import frames.MenuFrame;
import frames.ServerFrame;
import ktcpchat.State;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import static ktcpchat.KTCPChat.changeState;
import static ktcpchat.KTCPChat.frame;

/**
 *
 * @author Sarah M
 */
public class SetupState implements State {
    
    static final SetupState instance = new SetupState();
    private SetupState() {
    }
    public static SetupState instance() { return instance; }
    
    private int exitCode;
    
    private int CLIENT_CODE = 1;
    private int SERVER_CODE = 2;
    
    @Override
    public void enter() {
        frame = new MenuFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 200));
        frame.setVisible(true);
        
        execute();
    }

    @Override
    public void execute() {
        MenuFrame.client.addActionListener((ActionEvent ae) -> {
//            System.out.println(ae);
            exitCode = CLIENT_CODE;
            changeState(ClientState.instance());
        });
        MenuFrame.server.addActionListener((ActionEvent ae) -> {
//            System.out.println(ae);
            exitCode = SERVER_CODE;
            changeState(ServerState.instance());
        });
    }

    @Override
    public void exit() {
        frame.setVisible(false);
        if (exitCode == CLIENT_CODE) 
            frame = new ClientFrame();
        if (exitCode == SERVER_CODE)
            frame = new ServerFrame();
    }
    
}
