/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktcpchat;

import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import states.SetupState;
import javax.swing.JFrame;


/**
 *
 * @author kasra
 */
public class KTCPChat{
    
    public static State currentState;
    public static State previousState;
    public static JFrame frame;
    
    public static void main(String[] args) {
        //System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
        //maybe handle resolutions or something?
        currentState = SetupState.instance();
        currentState.enter();
    }
    
    public static void update() {
        currentState.execute();
    }
    
    public static void changeState(State nextState) {
        currentState.exit();
        previousState = currentState;
        currentState = nextState;
        currentState.enter();
    }
}
