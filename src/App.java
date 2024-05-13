import javax.swing.*;
public class App {
    public static void main(String[] args){
        //Main class that runs the code
        SwingUtilities.invokeLater(() -> GUIFrame.guiFrame()); //Ensures all components are displayed
    }
}
