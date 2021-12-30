/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import model.Image;

/**
 *
 * @author Rebe
 */


public interface ImageDisplay {
    public void show(Image image);
    
    public Image image();
    
    void on(Shift shift);
    
    interface Shift {
        Image left();
        Image right();
    }
}