/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Rebe
 */
public class ExitCommand implements Command {

    @Override
    public void execute() {
        System.exit(0);
    }
}