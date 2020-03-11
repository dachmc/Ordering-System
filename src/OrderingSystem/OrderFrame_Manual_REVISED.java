
package OrderingSystem;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/*To do:
    Fix components sizes
    Make components resize in relation to frame size
    Add events
*/

public class OrderFrame_Manual_REVISED extends javax.swing.JFrame {


    public OrderFrame_Manual_REVISED() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
                     
    private void initComponents() {
        cardLayout = new java.awt.CardLayout(); 
        mainPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel(cardLayout);
        bottomPanelInsideCenterPanel = new javax.swing.JPanel();
        PriceTag = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        comboSize = new javax.swing.JComboBox<>();
        comboMenu = new javax.swing.JComboBox<>();
        cardSelector = 0;
        
        String[] menu = {"Menu: ", "Potpots", "French Fries", "Hash Browns"};
        String[] size = {"Size: ", "Solo", "Grande", "Giant", "Super Giant" };
        String[] sizePot = {"Size: ", "Solo", "Grande", "Giant", "Super Giant", "Cheesy Bacon" };
        String[] sizeHash = {"Size: "};
        
        model = new javax.swing.DefaultComboBoxModel(size);
        model1 = new javax.swing.DefaultComboBoxModel(sizePot);
        model2 = new javax.swing.DefaultComboBoxModel(sizeHash);
        
        JLabel potatoBackground  = new JLabel("");
        JLabel potpots = new JLabel("");
        JLabel menupots = new JLabel("");
        JLabel smalpots = new JLabel("");
        JLabel grandepots = new JLabel("");
        JLabel giantpot = new JLabel("");
        JLabel supgiantpot = new JLabel("");
        JLabel potpotsmenu = new JLabel("");
        JLabel frenchmenu = new JLabel("");
        JLabel solofries = new JLabel("");
        JLabel grandfries = new JLabel("");
        JLabel giantfries = new JLabel("");
        JLabel superfries = new JLabel("");
        JLabel hashbrown = new JLabel("");
        JLabel cheesebacpots = new JLabel("");
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Potato Order");
        setSize(new java.awt.Dimension(420, 420));

        mainPanel.setName(""); // NOI18N
        mainPanel.setLayout(new java.awt.BorderLayout());

        rightPanel.setPreferredSize(new java.awt.Dimension(125, 100));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Add Order");
        jButton2.setText("Finish Order");
        
        potpots.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\POTS.jpg")); //unused
        cheesebacpots.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\cheesebacpots1.1.png"));
        menupots.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\MENUPOTS.jpg"));
        potpotsmenu.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\potpotsmenu1.png")); 
        hashbrown.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\hashbrown1.png"));
        smalpots.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\solopot1.1.png"));
        grandepots.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\grandepot1.1.png"));
        giantpot.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\giantpot1.1.png"));
        supgiantpot.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\supgiantpot1.1.png"));
        frenchmenu.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\frenchmenu1.png"));
        solofries.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\solofries1.1.png"));
        grandfries.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\grandfries1.1.png"));
        giantfries.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\giantfries1.1.png"));
        superfries.setIcon(new ImageIcon("src\\OrderingSystem\\Images\\supgiantfries1.1.png"));
        
        imagePanel.add(menupots, "1");
        imagePanel.add(potpotsmenu, "2");
        imagePanel.add(frenchmenu, "3");
        imagePanel.add(hashbrown, "4");
        imagePanel.add(smalpots, "5");
        imagePanel.add(grandepots, "6");
        imagePanel.add(giantpot, "7");
        imagePanel.add(supgiantpot, "8");
        imagePanel.add(cheesebacpots, "9");
        imagePanel.add(solofries, "10");
        imagePanel.add(grandfries, "11");
        imagePanel.add(giantfries, "12");
        imagePanel.add(superfries, "13");
        
        
        cardLayout.show(imagePanel, "1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
        );

        mainPanel.add(rightPanel, java.awt.BorderLayout.EAST);

        centerPanel.setLayout(new javax.swing.BoxLayout(centerPanel, javax.swing.BoxLayout.Y_AXIS));

        imagePanel.setPreferredSize(new java.awt.Dimension(275, 250));
        //imagePanel.setLayout(new java.awt.CardLayout()); error!
        centerPanel.add(imagePanel);

        bottomPanelInsideCenterPanel.setPreferredSize(new java.awt.Dimension(0, 60));

        PriceTag.setText("Price: ");

        backButton.setText("\u22b2Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next\u22b3");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        comboSize.setModel(new javax.swing.DefaultComboBoxModel<>(size));
        comboSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSizeActionPerformed(evt);
            }
        });

        comboMenu.setModel(new javax.swing.DefaultComboBoxModel<>(menu));
        comboMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(bottomPanelInsideCenterPanel);
        bottomPanelInsideCenterPanel.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(PriceTag, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(PriceTag)
                    .addComponent(nextButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(comboMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(comboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        centerPanel.add(bottomPanelInsideCenterPanel);

        mainPanel.add(centerPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
        );
        setLocationRelativeTo(null); //center trick!
        pack();
    }// </editor-fold>                        
    public static void comboSelector(javax.swing.JComboBox<String> comboMenu, javax.swing.JComboBox<String> comboSize, int cardSelector) {
        if(cardSelector == -1) {
            cardSelector = 12;
        }
        
        if(cardSelector == 1) {
            comboMenu.setSelectedItem("Potpots");
            //comboSize.setModel(model2);
        }
        if(cardSelector == 2) {
            comboMenu.setSelectedItem("French Fries");
            //comboSize.setModel(model2);
        }
        if(cardSelector == 3) {
            comboMenu.setSelectedItem("Hash Browns");
            //comboSize.setModel(model2);
        }
        if(cardSelector == 4) {
            comboMenu.setSelectedItem("Potpots");
            //comboSize.setModel(model1);
            comboSize.setSelectedItem("Solo");
        }
        if(cardSelector == 5) {
            comboMenu.setSelectedItem("Potpots");
            //comboSize.setModel(model1);
            comboSize.setSelectedItem("Grande");
        }
        if(cardSelector == 6) {
            comboMenu.setSelectedItem("Potpots");
            //comboSize.setModel(model1);
            comboSize.setSelectedItem("Giant");
        }
        if(cardSelector == 7) {
            comboMenu.setSelectedItem("Potpots");
            //comboSize.setModel(model1);
            comboSize.setSelectedItem("Super Giant");
        }
        if(cardSelector == 8) {
            comboMenu.setSelectedItem("Potpots");
            //comboSize.setModel(model1);
            comboSize.setSelectedItem("Cheesy Bacon");
        }
        if(cardSelector == 9) {
            comboMenu.setSelectedItem("French Fries");
            //comboSize.setModel(model1);
            comboSize.setSelectedItem("Solo");
        }
        if(cardSelector == 10) {
            comboMenu.setSelectedItem("French Fries");
            //comboSize.setModel(model1);
            comboSize.setSelectedItem("Grande");
        }
        if(cardSelector == 11) {
            comboMenu.setSelectedItem("French Fries");
            //comboSize.setModel(model1);
            comboSize.setSelectedItem("Giant");
        }
        if(cardSelector == 12) {
            comboMenu.setSelectedItem("French Fries");
            //comboSize.setModel(model1);
            comboSize.setSelectedItem("Super Giant");
        }
        if(cardSelector == 13) {
            cardSelector = 0;
        }
        if(cardSelector == 0) {
            comboMenu.setSelectedItem("Menu: ");
        } 
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) imagePanel.getLayout();
         //back button
         cl.previous(imagePanel);
        imagePanel.revalidate();
        imagePanel.repaint();
        cardSelector--;
      
        comboSelector(comboMenu, comboSize, cardSelector);
    }
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CardLayout cl = (CardLayout) imagePanel.getLayout();
        //next button
        cl.next(imagePanel); 
        imagePanel.revalidate();
        imagePanel.repaint();
        cardSelector++;
        
        comboSelector(comboMenu, comboSize, cardSelector);
    }

    private void comboMenuActionPerformed(java.awt.event.ActionEvent evt) {
        if(comboMenu.getSelectedItem().toString().equals("Menu: ")) {
            cardLayout.show(imagePanel, "1");
            comboSize.setModel(model2);
            cardSelector = 0;
        }
        if(comboMenu.getSelectedItem().toString().equals("Potpots")) {
            cardLayout.show(imagePanel, "2");
            comboSize.setModel(model1);
            comboSize.setSelectedItem("Size: ");
            cardSelector = 1;
        }
        if(comboMenu.getSelectedItem().toString().equals("French Fries")) {
            cardLayout.show(imagePanel, "3");
            comboSize.setModel(model);
            comboSize.setSelectedItem("Size: ");
            cardSelector = 2;
        }
        if(comboMenu.getSelectedItem().toString().equals("Hash Browns")) {
            cardLayout.show(imagePanel, "4");
            comboSize.setModel(model2);
            cardSelector = 3;
        }
        
    }
    private void comboSizeActionPerformed(java.awt.event.ActionEvent evt) {
        if(comboMenu.getSelectedItem().toString().equals("Potpots") && comboSize.getSelectedItem().toString().equals("Size: ")) {
            cardLayout.show(imagePanel, "2");
            cardSelector = 1;
        }
        if(comboMenu.getSelectedItem().toString().equals("Potpots") && comboSize.getSelectedItem().toString().equals("Solo")) {
            cardLayout.show(imagePanel, "5");
            cardSelector = 4;
        }
        if(comboMenu.getSelectedItem().toString().equals("Potpots") && comboSize.getSelectedItem().toString().equals("Grande")) {
            cardLayout.show(imagePanel, "6");
            cardSelector = 5;
        }
        if(comboMenu.getSelectedItem().toString().equals("Potpots") && comboSize.getSelectedItem().toString().equals("Giant")) {
            cardLayout.show(imagePanel, "7");
            cardSelector = 6;
        }
        if(comboMenu.getSelectedItem().toString().equals("Potpots") && comboSize.getSelectedItem().toString().equals("Super Giant")) {
            cardLayout.show(imagePanel, "8");
            cardSelector = 7;
        }
        if(comboMenu.getSelectedItem().toString().equals("Potpots") && comboSize.getSelectedItem().toString().equals("Cheesy Bacon")) {
            cardLayout.show(imagePanel, "9");
            cardSelector = 8;
        }
        //FRENCH FRIES!!!
        if(comboMenu.getSelectedItem().toString().equals("French Fries") && comboSize.getSelectedItem().toString().equals("Size: ")) {
            cardLayout.show(imagePanel, "3");
            cardSelector = 2;
        }
        if(comboMenu.getSelectedItem().toString().equals("French Fries") && comboSize.getSelectedItem().toString().equals("Solo")) {
            cardLayout.show(imagePanel, "10");
            cardSelector = 9;
        }
        if(comboMenu.getSelectedItem().toString().equals("French Fries") && comboSize.getSelectedItem().toString().equals("Grande")) {
            cardLayout.show(imagePanel, "11");
            cardSelector = 10;
        }
        if(comboMenu.getSelectedItem().toString().equals("French Fries") && comboSize.getSelectedItem().toString().equals("Giant")) {
            cardLayout.show(imagePanel, "12");
            cardSelector = 11;
        }
        if(comboMenu.getSelectedItem().toString().equals("French Fries") && comboSize.getSelectedItem().toString().equals("Super Giant")) {
            cardLayout.show(imagePanel, "13");
            cardSelector = 12;
        }
    }                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderFrame_Manual_REVISED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFrame_Manual_REVISED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFrame_Manual_REVISED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFrame_Manual_REVISED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFrame_Manual_REVISED().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> comboSize;
    private javax.swing.JComboBox<String> comboMenu;
    private javax.swing.JLabel PriceTag;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel bottomPanelInsideCenterPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel mainPanel;
    private java.awt.CardLayout cardLayout;
    private javax.swing.DefaultComboBoxModel<String> model;
    private javax.swing.DefaultComboBoxModel<String> model1;
    private javax.swing.DefaultComboBoxModel<String> model2;
    private int cardSelector;
    // End of variables declaration                   
}
