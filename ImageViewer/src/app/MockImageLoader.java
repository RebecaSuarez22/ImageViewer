/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import java.util.ArrayList;
import java.util.List;
import model.Image;
import view.ImageLoader;

/**
 *
 * @author Rebe
 */


public class MockImageLoader implements ImageLoader {

    @Override
    public List<Image> load() {
        ArrayList<Image> list = new ArrayList<>();
        list.add(new Image("Hola"));
        list.add(new Image("Mundo"));
        list.add(new Image("Bienvenido"));
        return list;
    }    
}