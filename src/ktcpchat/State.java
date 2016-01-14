/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktcpchat;

/**
 *
 * @author Sarah M
 */
public interface State {
    public void enter();
    public void execute();
    public void exit();
}
