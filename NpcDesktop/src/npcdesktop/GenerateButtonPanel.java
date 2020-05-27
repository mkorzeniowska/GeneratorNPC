package npcdesktop;


import java.sql.ResultSet;
import java.sql.SQLException;
import static mssql.Mssql.connection;
import static mssql.Mssql.getData;


public class GenerateButtonPanel extends javax.swing.JPanel {

    /**
     * Creates new form generateButtonPanel
     */
    public GenerateButtonPanel() {
        initComponents();
        fillCombo();
        subraceBox.setEnabled(false);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        sexLabel = new javax.swing.JLabel();
        sexBox = new javax.swing.JComboBox<>();
        raceLabel = new javax.swing.JLabel();
        raceBox = new javax.swing.JComboBox<>();
        subraceBox = new javax.swing.JComboBox<>();
        classBox = new javax.swing.JComboBox<>();
        alignmentBox = new javax.swing.JComboBox<>();
        subraceLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        alignmentLabel = new javax.swing.JLabel();
        ageBox = new javax.swing.JComboBox<>();
        ageLabel = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(205, 305));

        buttonPanel.setBackground(new java.awt.Color(0, 153, 153));
        buttonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Wylosuj nową postać"));
        buttonPanel.setOpaque(false);

        sexLabel.setText("Płeć");

        sexBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        raceLabel.setText("Rasa");

        raceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        raceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raceBoxActionPerformed(evt);
            }
        });

        subraceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        subraceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subraceBoxActionPerformed(evt);
            }
        });

        classBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        alignmentBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        subraceLabel.setText("Podrasa");

        classLabel.setText("Klasa");

        alignmentLabel.setText("Charakter");

        ageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ageLabel.setText("Wiek");

        generateButton.setText("Losuj");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Resetuj");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(raceLabel)
                            .addComponent(subraceLabel)
                            .addComponent(classLabel)
                            .addComponent(alignmentLabel)
                            .addComponent(ageLabel)
                            .addComponent(sexLabel))
                        .addGap(12, 12, 12)
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(raceBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sexBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subraceBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alignmentBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subraceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subraceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alignmentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alignmentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addGap(29, 29, 29)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateButton)
                    .addComponent(resetButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void subraceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subraceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subraceBoxActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        //new GenerateCharacter().setVisible(true);
        Home.characterSheetPanel1.setVisible(true);
        Home.imageLabel.setVisible(false);
        Home.rightPanel.setVisible(false);
        Home.rightPanelWithSaveButton2.setVisible(true);
        CharacterSheetPanel.generateCharacterSheet();
 
    }//GEN-LAST:event_generateButtonActionPerformed

    private void raceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raceBoxActionPerformed
        // TODO add your handling code here:
        CharacterSheetPanel.race = String.valueOf(raceBox.getSelectedItem());
        fillAlignment();
        if("Elf".equals(CharacterSheetPanel.race) || "Krasnolud".equals(CharacterSheetPanel.race) || 
                "Niziołek".equals(CharacterSheetPanel.race) || "Gnom".equals(CharacterSheetPanel.race)){      
            fillSubraces();
            subraceBox.setEnabled(true);
            }
        else {
            subraceBox.setEnabled(false);}
    }//GEN-LAST:event_raceBoxActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        clearCombo();
        CharacterSheetPanel.clearAfterReset();
    }//GEN-LAST:event_resetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> ageBox;
    private javax.swing.JLabel ageLabel;
    public static javax.swing.JComboBox<String> alignmentBox;
    private javax.swing.JLabel alignmentLabel;
    private javax.swing.JPanel buttonPanel;
    public static javax.swing.JComboBox<String> classBox;
    private javax.swing.JLabel classLabel;
    private javax.swing.JButton generateButton;
    public static javax.swing.JComboBox<String> raceBox;
    private javax.swing.JLabel raceLabel;
    private javax.swing.JButton resetButton;
    public static javax.swing.JComboBox<String> sexBox;
    private javax.swing.JLabel sexLabel;
    public static javax.swing.JComboBox<String> subraceBox;
    private javax.swing.JLabel subraceLabel;
    // End of variables declaration//GEN-END:variables
    private String random = "Random";
    private String[] columns = {"plec", "rasa", "podrasa", "klasa", "charakter", "wiek"};
    private String[] tables = {"Plec", "Rasa", "Podrasa", "Klasa", "Charakter", "Wiek"};
    

    //wypelnienie listy typu JComboBox danymi produktow
    private void fillCombo() {
  
    try {
        //sex 
        String sqlQuery = String.format("SELECT %s FROM %s", columns[0], tables[0]);
        ResultSet resultSet = getData(sqlQuery);
        sexBox.removeAllItems();
        sexBox.addItem(random);
        while(resultSet.next()) {
            String  s = resultSet.getString(columns[0]);
            sexBox.addItem(s);
        }
        //race
        sqlQuery = String.format("SELECT %s FROM %s", columns[1], tables[1]);
        resultSet = getData(sqlQuery);
        raceBox.removeAllItems();
        raceBox.addItem(random);
        while(resultSet.next()) {
            String  s = resultSet.getString(columns[1]);
            raceBox.addItem(s);
        }
        //subraces
        subraceBox.removeAllItems();
        subraceBox.addItem(random);

        //classes
        sqlQuery = String.format("SELECT %s FROM %s", columns[3], tables[3]);
        resultSet = getData(sqlQuery);
        classBox.removeAllItems();
        classBox.addItem(random);
        while(resultSet.next()) {
            String  s = resultSet.getString(columns[3]);
            classBox.addItem(s);
        }
        //alingment
        sqlQuery = String.format("SELECT %s FROM %s", columns[4], tables[4]);
        resultSet = getData(sqlQuery);
        alignmentBox.removeAllItems();
        alignmentBox.addItem(random);
        while(resultSet.next()) {
            String  s = resultSet.getString(columns[4]);
            alignmentBox.addItem(s);
        }
        //age
        sqlQuery = String.format("SELECT %s FROM %s", columns[5], tables[5]);
        resultSet = getData(sqlQuery);
        ageBox.removeAllItems();
        ageBox.addItem(random);
        while(resultSet.next()) {
            String  s = resultSet.getString(columns[5]);
            ageBox.addItem(s);
        }
        connection.close();
        
    } catch (Exception e) {
        //Gdyby coś poszło nie tak, wydrukuj komunikat...
        System.out.println(e.getMessage());
    }
    
    }
    
    private void fillSubraces() {
        try{
        //subraces;
        String sqlQuery = String.format("SELECT p.podrasa FROM Podrasa AS p, Rasa AS r WHERE p.rasaID=r.rasaID AND r.rasa='%s'", CharacterSheetPanel.race);
        ResultSet resultSet = getData(sqlQuery);
        subraceBox.removeAllItems();
        subraceBox.addItem(random);
        while(resultSet.next()) {
            String  s = resultSet.getString(columns[2]);
            subraceBox.addItem(s);
        }
        }  
        catch (Exception e) {
         System.out.println(e.getMessage());}
    }
    
    private void fillAlignment() {
        try{
            String sqlQuery = String.format("SELECT c.charakterID, charakter\n" +
                                             "FROM Charakter c\n" +
                                             "JOIN Charakter_Rasy cr ON c.charakterID=cr.charakterID \n" +
                                             "JOIN Rasa r ON cr.rasaID=r.rasaID\n" +
                                             "WHERE r.rasa='%s' " , CharacterSheetPanel.race);
            ResultSet resultSet = getData(sqlQuery);
            alignmentBox.removeAllItems();
            alignmentBox.addItem(random);
        while(resultSet.next()) {
            String  s = resultSet.getString(columns[4]);
            alignmentBox.addItem(s);
        }
    }  
        catch (ClassNotFoundException | SQLException e) {
         System.out.println(e.getMessage());}
    }
    
    private void clearCombo() {
        sexBox.setSelectedIndex(0);
        raceBox.setSelectedIndex(0);
        subraceBox.setSelectedIndex(0);
        classBox.setSelectedIndex(0);
        alignmentBox.setSelectedIndex(0);
        ageBox.setSelectedIndex(0);
    }
}