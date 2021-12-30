/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import java.util.List;
import model.Image;
import view.ImageDisplay;

/**
 *
 * @author Rebe
 */


public class NextCommand implements Command {

    private final List<Image> images;
    private final ImageDisplay imageDisplay;
   

    public NextCommand(List<Image> images, ImageDisplay imageDisplay) {
        this.images = images;
        this.imageDisplay = imageDisplay;
    }
    
    @Override
    public void execute() {
        imageDisplay.show(next());
    }
    
    private Image next() {
        int index = images.indexOf(imageDisplay.image());
        return images.get((index+1)%images.size());
    }
    
}