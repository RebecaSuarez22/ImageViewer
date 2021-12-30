/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Rebe
 */
public class NullCommand implements Command {
    
    public static final Command Instance = new NullCommand();
    
    @Override
    public void execute() {
    }
    
}