
package OrderingSystem;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OrderFrame_MANUAL {
    
    public void positionAdd(Component c, int gridx, int gridy) {
        gbc.gridx = gridx;
        gbc.gridy = gridy;  
        lastPanel.add(c,gbc);
    }
    JFrame frame = new JFrame("Potato Giant Make Order");
        JPanel mainPanel = new JPanel(new BorderLayout());
        CardLayout cardLayout = new CardLayout();
        JPanel lastPanel = new JPanel(new GridBagLayout());
        JPanel centerPanel = new JPanel();
        JPanel imagePanel = new JPanel(cardLayout);
        JPanel bottomPanel = new JPanel(new GridLayout());
        JPanel rightPanel = new JPanel();
        JLabel potatoImage  = new JLabel("");
        JLabel potpots = new JLabel("");
        JLabel price = new JLabel(); //setText
        JTextArea rightText = new JTextArea(9,9);
        JButton back = new JButton("Back");
        JButton next = new JButton("Next");
        JButton addOrder = new JButton("Add Order");
        JButton finish = new JButton("Proceed to checkout.");
            String[] menu = {"Menu: ", "Potpots", "French Fries", "Hash Browns"};
            String[] size = {"Size: ", "Solo", "Grande", "Giant", "Super Giant" };
        JComboBox mainCombo = new JComboBox(menu);
        JComboBox dynamicBox = new JComboBox(size);
        GridBagConstraints gbc = new GridBagConstraints();
        
    public OrderFrame_MANUAL() { 
        
        centerPanel.setSize(420,420);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        positionAdd(addOrder, 0, 0);
        positionAdd(finish, 0, 1);
        
        bottomPanel.add(price);
        bottomPanel.add(back);
        bottomPanel.add(mainCombo);
        bottomPanel.add(dynamicBox);
        bottomPanel.add(next);
        
        rightPanel.add(rightText);
        rightPanel.add(lastPanel);
        
        potatoImage.setIcon(new ImageIcon("C:\\Users\\client\\Pictures\\potatogBorder.png"));
        potpots.setIcon(new ImageIcon("C:\\Users\\client\\Pictures\\POTS.jpg"));
        imagePanel.add(potatoImage, "1");
        imagePanel.add(potpots, "2");
        cardLayout.show(imagePanel, "1");
        
        centerPanel.add(imagePanel);
        centerPanel.add(bottomPanel);
        
        mainPanel.add(rightPanel,BorderLayout.EAST);
        mainPanel.add(centerPanel,BorderLayout.CENTER);
        frame.add(mainPanel);
        
        frame.setSize(570,460);
        frame.setLocationRelativeTo(null); //center trick!
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OrderFrame_MANUAL();
            }
        });
        
    }
        
}
