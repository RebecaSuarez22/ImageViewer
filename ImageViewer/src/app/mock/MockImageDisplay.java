/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.mock;
import model.Image;
import view.ImageDisplay;

/**
 *
 * @author Rebe
 */


public class MockImageDisplay implements ImageDisplay {

    private Image image;
    
    @Override
    public void show(Image image) {
        this.image = image;
        System.out.println(image.getName());
    }
    
    @Override
    public Image image() {
        return image;
    }

    @Override
    public void on(Shift shift) {
    }
    
}