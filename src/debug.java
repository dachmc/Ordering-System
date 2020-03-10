import java.util.*;
import java.awt.*;
import javax.swing.*;
public class debug {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(570,460);
        JPanel panel = new JPanel();
        JTextArea hey = new JTextArea("Hey");
        hey.setColumns(10);
        hey.setRows(20);
        panel.add(hey);
        frame.add(panel);
    }
}
