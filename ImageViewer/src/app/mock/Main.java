/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.mock;
import Control.Command;
import Control.ExitCommand;
import Control.InitCommand;
import Control.NextCommand;
import Control.NullCommand;
import Control.PrevCommand;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import model.Image;
import view.ImageDisplay;
import view.ImageLoader;

/**
 *
 * @author Rebe
 */


public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, Command> commands = initCommands(new ArrayList<>(), new MockImageDisplay(), new MockImageLoader());
        
        while (true) {
           commands.getOrDefault(scanner.next(), NullCommand.Instance).execute();        
        }
        
    }
    
    private static Map<String, Command> initCommands(List<Image> images, ImageDisplay imageDisplay, ImageLoader imageLoader) {
        HashMap<String, Command> result = new HashMap<>();
        result.put("q", new ExitCommand());
        result.put("Q", result.get("q"));
        result.put("p", new PrevCommand(images, imageDisplay));
        result.put("P", result.get("p"));
        result.put("n", new NextCommand(images, imageDisplay));
        result.put("N", result.get("n"));
        result.put("i", new InitCommand(imageLoader, images, imageDisplay));
        return result;
    }
}

