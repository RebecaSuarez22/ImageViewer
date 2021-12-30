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


public class PrevCommand implements Command {
    private final List<Image> images;
    private final ImageDisplay imageDisplay;
    

    public PrevCommand(List<Image> images, ImageDisplay imageDisplay) {
        this.images = images;
        this.imageDisplay = imageDisplay;
    }
    
    @Override
    public void execute() {
        imageDisplay.show(prev());
    }
    
    private Image prev() {
        int index = images.indexOf(imageDisplay.image());
        return images.get((index-1+images.size())%images.size());
    }
    
}
