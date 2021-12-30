/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import java.util.List;
import model.Image;
import view.ImageDisplay;
import view.ImageDisplay.Shift;

/**
 *
 * @author Rebe
 */


public class ImagePresenter {
    private final List<Image> images;
    private final ImageDisplay imageDisplay;

    public ImagePresenter(List<Image> images, ImageDisplay imageDisplay) {
        this.images = images;
        this.imageDisplay = imageDisplay;
        this.imageDisplay.on(shift());
    }
    
    private int current() {
        return images.indexOf(imageDisplay.image());
    }
    
    private Shift shift() {
        return new Shift() {
            @Override
            public Image left() {
                return images.get((current() + 1) % images.size());
            }

            @Override
            public Image right() {
                return images.get((current() - 1) % images.size() < 0 ? current() - 1 + images.size() : current() - 1);
            }
            
        };
    }
    
}