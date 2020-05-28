package npcdesktop;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static mssql.Mssql.getData;


public class CharacterSheetPanel extends javax.swing.JPanel {


    public CharacterSheetPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        characterSheetLabel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        raceLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        acLabel = new javax.swing.JLabel();
        hpLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        speedValueLabel = new javax.swing.JLabel();
        acValueLabel = new javax.swing.JLabel();
        hpValueLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        strengtLabel = new javax.swing.JLabel();
        strengtLabel1 = new javax.swing.JLabel();
        dexterityLabel = new javax.swing.JLabel();
        conditionLabel = new javax.swing.JLabel();
        inteligenceLabel = new javax.swing.JLabel();
        wisdomLabel = new javax.swing.JLabel();
        charismaLabel = new javax.swing.JLabel();
        strengthValueLabel = new javax.swing.JLabel();
        contValueLabel = new javax.swing.JLabel();
        dextValueLabel = new javax.swing.JLabel();
        inteligValueLabel = new javax.swing.JLabel();
        charismaValueLabel = new javax.swing.JLabel();
        wisdomValueLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        skillsLabel = new javax.swing.JLabel();
        skillsValueLabel = new javax.swing.JLabel();
        sensesLabel = new javax.swing.JLabel();
        sensesValueLabel = new javax.swing.JLabel();
        languageLabel = new javax.swing.JLabel();
        languageValueLabel = new javax.swing.JLabel();
        descriptionLabel5 = new javax.swing.JPanel();
        appearenceLabel = new javax.swing.JLabel();
        personalityValueLabel = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        personalityLabel = new javax.swing.JLabel();
        appearenceValueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(530, 594));

        characterSheetLabel.setBackground(new java.awt.Color(255, 247, 226));
        characterSheetLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        characterSheetLabel.setOpaque(false);

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameLabel.setText("Tu będzie imię");

        raceLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        raceLabel.setText("rasa i podrasa, charakter");

        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));

        acLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        acLabel.setText("Klasa pancerza");

        hpLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        hpLabel.setText("Punkty wytrzymałości");

        speedLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        speedLabel.setText("Szybkość");

        speedValueLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        speedValueLabel.setText("10");

        acValueLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        acValueLabel.setText("12");

        hpValueLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        hpValueLabel.setText("30");

        jSeparator2.setForeground(new java.awt.Color(0, 102, 102));

        strengtLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        strengtLabel.setText("SI");

        strengtLabel1.setText("S");

        dexterityLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dexterityLabel.setText("ZR");

        conditionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        conditionLabel.setText("KON");

        inteligenceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        inteligenceLabel.setText("INT");

        wisdomLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        wisdomLabel.setText("MDR");

        charismaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        charismaLabel.setText("CHA");

        strengthValueLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        strengthValueLabel.setText("8 (-1)");

        contValueLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        contValueLabel.setText("14 (+2)");

        dextValueLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        dextValueLabel.setText("14 (+2)");

        inteligValueLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        inteligValueLabel.setText("14 (+2)");

        charismaValueLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        charismaValueLabel.setText("14 (+2)");

        wisdomValueLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        wisdomValueLabel.setText("14 (+2)");

        jSeparator3.setForeground(new java.awt.Color(0, 102, 102));

        skillsLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        skillsLabel.setText("Umiejętności");

        skillsValueLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        skillsValueLabel.setText("tutaj będzie lista umiejętności");

        sensesLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        sensesLabel.setText("Zdolności");

        sensesValueLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        sensesValueLabel.setText("pasywna percepcja, widzenie w ciemności itp");

        languageLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        languageLabel.setText("Języki");

        languageValueLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        languageValueLabel.setText("wspólny, elfi itp");

        javax.swing.GroupLayout characterSheetLabelLayout = new javax.swing.GroupLayout(characterSheetLabel);
        characterSheetLabel.setLayout(characterSheetLabelLayout);
        characterSheetLabelLayout.setHorizontalGroup(
            characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, characterSheetLabelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(raceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(characterSheetLabelLayout.createSequentialGroup()
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(characterSheetLabelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(strengtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(dexterityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(characterSheetLabelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(strengthValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dextValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(characterSheetLabelLayout.createSequentialGroup()
                        .addComponent(conditionLabel)
                        .addGap(40, 40, 40)
                        .addComponent(inteligenceLabel))
                    .addGroup(characterSheetLabelLayout.createSequentialGroup()
                        .addComponent(contValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inteligValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wisdomLabel)
                    .addComponent(wisdomValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(charismaLabel)
                    .addComponent(charismaValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(characterSheetLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(characterSheetLabelLayout.createSequentialGroup()
                        .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(characterSheetLabelLayout.createSequentialGroup()
                                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(characterSheetLabelLayout.createSequentialGroup()
                                        .addComponent(speedLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(speedValueLabel))
                                    .addGroup(characterSheetLabelLayout.createSequentialGroup()
                                        .addComponent(acLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(acValueLabel))
                                    .addGroup(characterSheetLabelLayout.createSequentialGroup()
                                        .addComponent(hpLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hpValueLabel)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(characterSheetLabelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(characterSheetLabelLayout.createSequentialGroup()
                                .addComponent(sensesLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sensesValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(characterSheetLabelLayout.createSequentialGroup()
                                .addComponent(skillsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(skillsValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(characterSheetLabelLayout.createSequentialGroup()
                                .addComponent(languageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(languageValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(characterSheetLabelLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(strengtLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(429, Short.MAX_VALUE)))
        );
        characterSheetLabelLayout.setVerticalGroup(
            characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(characterSheetLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedLabel)
                    .addComponent(speedValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acLabel)
                    .addComponent(acValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpLabel)
                    .addComponent(hpValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strengtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dexterityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conditionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inteligenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wisdomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(charismaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strengthValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dextValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inteligValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(charismaValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wisdomValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skillsLabel)
                    .addComponent(skillsValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sensesLabel)
                    .addComponent(sensesValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(languageLabel)
                    .addComponent(languageValueLabel))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(characterSheetLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, characterSheetLabelLayout.createSequentialGroup()
                    .addContainerGap(161, Short.MAX_VALUE)
                    .addComponent(strengtLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(147, 147, 147)))
        );

        descriptionLabel5.setBackground(new java.awt.Color(255, 247, 226));
        descriptionLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        appearenceLabel.setText("Wygląd");

        personalityValueLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        personalityValueLabel.setText("opis osobowości bla bal bla");

        jSeparator9.setForeground(new java.awt.Color(0, 102, 102));

        personalityLabel.setText("Osobowość");

        appearenceValueLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        appearenceValueLabel.setText("opis wyglądu bla bal bla");

        javax.swing.GroupLayout descriptionLabel5Layout = new javax.swing.GroupLayout(descriptionLabel5);
        descriptionLabel5.setLayout(descriptionLabel5Layout);
        descriptionLabel5Layout.setHorizontalGroup(
            descriptionLabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriptionLabel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(descriptionLabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(descriptionLabel5Layout.createSequentialGroup()
                        .addGroup(descriptionLabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(descriptionLabel5Layout.createSequentialGroup()
                                .addComponent(appearenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(appearenceValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(descriptionLabel5Layout.createSequentialGroup()
                                .addComponent(personalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(personalityValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        descriptionLabel5Layout.setVerticalGroup(
            descriptionLabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriptionLabel5Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(descriptionLabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appearenceLabel)
                    .addComponent(appearenceValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(descriptionLabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalityLabel)
                    .addComponent(personalityValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descriptionLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(characterSheetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(characterSheetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descriptionLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acLabel;
    private static javax.swing.JLabel acValueLabel;
    private javax.swing.JLabel appearenceLabel;
    private static javax.swing.JLabel appearenceValueLabel;
    private static javax.swing.JPanel characterSheetLabel;
    private javax.swing.JLabel charismaLabel;
    private static javax.swing.JLabel charismaValueLabel;
    private javax.swing.JLabel conditionLabel;
    private static javax.swing.JLabel contValueLabel;
    private static javax.swing.JPanel descriptionLabel5;
    private static javax.swing.JLabel dextValueLabel;
    private javax.swing.JLabel dexterityLabel;
    private javax.swing.JLabel hpLabel;
    private static javax.swing.JLabel hpValueLabel;
    private static javax.swing.JLabel inteligValueLabel;
    private javax.swing.JLabel inteligenceLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel languageLabel;
    private static javax.swing.JLabel languageValueLabel;
    private static javax.swing.JLabel nameLabel;
    private javax.swing.JLabel personalityLabel;
    private static javax.swing.JLabel personalityValueLabel;
    private static javax.swing.JLabel raceLabel;
    private javax.swing.JLabel sensesLabel;
    private static javax.swing.JLabel sensesValueLabel;
    private javax.swing.JLabel skillsLabel;
    private static javax.swing.JLabel skillsValueLabel;
    private javax.swing.JLabel speedLabel;
    private static javax.swing.JLabel speedValueLabel;
    private javax.swing.JLabel strengtLabel;
    private javax.swing.JLabel strengtLabel1;
    private static javax.swing.JLabel strengthValueLabel;
    private javax.swing.JLabel wisdomLabel;
    private static javax.swing.JLabel wisdomValueLabel;
    // End of variables declaration//GEN-END:variables
    public static String sex, name, surname, race, subrace, classes, appearence;
    public static String alignment, age;
    public static int[] atributes = {0,0,0,0,0,0};
    public static int ac, hp, speed, bonus;
    public static ArrayList<String> personality = new ArrayList<String>();
    public static ArrayList<String> skills = new ArrayList<String>();

    //metody
    public static void readComboBoxValues() {
        sex = String.valueOf(GenerateButtonPanel.sexBox.getSelectedItem());
        race = String.valueOf(GenerateButtonPanel.raceBox.getSelectedItem());
        subrace = String.valueOf(GenerateButtonPanel.subraceBox.getSelectedItem());
        classes = String.valueOf(GenerateButtonPanel.classBox.getSelectedItem());
        alignment = String.valueOf(GenerateButtonPanel.alignmentBox.getSelectedItem());
        age = String.valueOf(GenerateButtonPanel.ageBox.getSelectedItem());
    }
    
    public static void generateSpeedAndLanguage(String races) {
        switch (races) {
            case "Człowiek":
                speedValueLabel.setText("9m");
                languageValueLabel.setText("wspólny");
                break;
            case "Elf":
                speedValueLabel.setText("10,5m");
                languageValueLabel.setText("wspólny, elfi");
                break;
            case "Krasnolud":
                speedValueLabel.setText("7,5m");
                languageValueLabel.setText("wspólny, krasnoludzki");
                break;
            case "Niziołek":
                speedValueLabel.setText("7,5m");
                languageValueLabel.setText("wspólny, niziołczy");
                break;
            case "Gnom":
                speedValueLabel.setText("7,5m");
                languageValueLabel.setText("wspólny, gnomi");
                break;
            case "Drakon":
                speedValueLabel.setText("9m");
                languageValueLabel.setText("wspólny, smoczy");
                break;
            case "Diabelstwo":
                speedValueLabel.setText("9m");
                languageValueLabel.setText("wspólny, piekielny");
                break;
            case "Półelf":
                speedValueLabel.setText("9m");
                languageValueLabel.setText("wspólny, elfi");
                break;
            case "Półork":
                speedValueLabel.setText("9m");
                languageValueLabel.setText("wspólny, orczy");
                break;
            default:
                System.out.println("Hmm, niewłaściwa wartość rasy");
        }
    }
    
    public static void generateACandHP(String classes) {
            switch (classes) {
            case "Barbarzyńca":
                acValueLabel.setText("");
                hpValueLabel.setText("12");
                break;
            case "Bard":
                acValueLabel.setText("");
                hpValueLabel.setText("8");
                break;
            case "Czarownik":
                acValueLabel.setText("");
                hpValueLabel.setText("8");
                break;
            case "Druid":
                acValueLabel.setText("");
                hpValueLabel.setText("8");
                break;
            case "Kleryk":
                acValueLabel.setText("");
                hpValueLabel.setText("8");
                break;
            case "Łotr":
                acValueLabel.setText("");
                hpValueLabel.setText("8");
                break;
            case "Łowca":
                acValueLabel.setText("");
                hpValueLabel.setText("10");
                break;
            case "Mag":
                acValueLabel.setText("");
                hpValueLabel.setText("6");
                break;
            case "Mnich":
                acValueLabel.setText("");
                hpValueLabel.setText("8");
                break;
            case "Paladyn":
                acValueLabel.setText("");
                hpValueLabel.setText("10");
                break;
            case "Wojownik":
                acValueLabel.setText("");
                hpValueLabel.setText("10");
                break;
            case "Zaklinacz":
                acValueLabel.setText("");
                hpValueLabel.setText("6");
                break;
            default:
                System.out.println("Hmm, niewłaściwa wartość klasy");
        }
            
    }
    
    public static void randomCharacter() {
        try{
            //rasa
            if("Random".equals(race)){
                String sqlQuery = "SELECT TOP 1 rasa FROM Rasa ORDER BY NEWID()";
                ResultSet resultSet = getData(sqlQuery);
                while(resultSet.next()) {
                String  s = resultSet.getString("rasa");
                race = s;}}

            if("Random".equals(subrace)) {
                String sqlQuery = String.format("SELECT TOP 1 p.podrasa FROM Rasa r\n" +
                "JOIN  Podrasa p ON p.rasaID=r.rasaID\n" +
                "WHERE r.rasa='%s' ORDER BY NEWID()",race);
                ResultSet resultSet = getData(sqlQuery);
                while(resultSet.next()) {
                String  s = resultSet.getString("podrasa");
                subrace = s;}
            }
            if("Random".equals(classes)){
                String sqlQuery = "SELECT TOP 1 klasa FROM Klasa ORDER BY NEWID()";
                ResultSet resultSet = getData(sqlQuery);
                while(resultSet.next()) {
                String  s = resultSet.getString("klasa");
                classes = s;}}
            if ("Random".equals(alignment)) {
                String sqlQuery = String.format("SELECT TOP 1 c.charakter FROM Charakter c\n" +
                    "JOIN Charakter_Rasy cr ON c.charakterID=cr.charakterID \n" +
                    "JOIN Rasa r ON cr.rasaID=r.rasaID\n" +
                    "WHERE r.rasa='%s' \n" +
                    "ORDER BY NEWID()",race );
                ResultSet resultSet = getData(sqlQuery);
                while(resultSet.next()) {
                String  s = resultSet.getString("charakter");
                alignment = s;}}

            if ("Random".equals(age)) {
                String sqlQuery = "SELECT TOP 1 wiek FROM Wiek ORDER BY NEWID()";
                ResultSet resultSet = getData(sqlQuery);
                while(resultSet.next()) {
                String  s = resultSet.getString("wiek");
                age = s;}
                }
            if ("Random".equals(subrace)) { String s = ""; raceLabel.setText(race + ", " + s + " , " + alignment );}
            else {String s = subrace; raceLabel.setText(race + ", " + s + " , " + alignment );}
                
        }
        catch (Exception e) {
        System.out.println(e.getMessage());}
    }
    
    public static void generateNameSurname() {
        try {
            String sqlQuery = String.format("SELECT TOP 1 i.imie FROM Imiona i\n" +
                                           "JOIN Rasa r ON i.rasaID=r.rasaID\n" +
                                           "JOIN Plec p ON p.plecID=i.plecID\n" +
                                           "WHERE r.rasa='Elf' AND p.plec='Kobieta'\n" +
                                            "ORDER BY NEWID()", race, sex);
            ResultSet resultSet = getData(sqlQuery);
            while(resultSet.next()) {
            String  s = resultSet.getString("imie");
            name = s;
            }
            sqlQuery = String.format("SELECT TOP 1 n.nazwisko FROM Nazwiska n JOIN Rasa r ON n.rasaID=r.rasaID\n" +
                               "WHERE r.rasa='%s' ORDER BY NEWID()", race);
            resultSet = getData(sqlQuery);
            while(resultSet.next()) {
            String  s = resultSet.getString("nazwisko");
            surname = s;
            nameLabel.setText(name + " " + surname);}}
            
        catch (Exception e) {System.out.println(e.getMessage());}
    }
    
    public static void generateAtributes() {
        try {
            String sqlQuery = "SELECT TOP 1 sila  FROM Atrybuty\n" +
                                            "ORDER BY NEWID()";
            ResultSet resultSet = getData(sqlQuery);
            while(resultSet.next()) {
            int n = resultSet.getInt("sila");
            atributes[0] = n;
            strengthValueLabel.setText(String.valueOf(atributes[0]) + " (+"+ calculateBonus(atributes[0])+")");}
            
            sqlQuery = "SELECT TOP 1 zrecznosc FROM Atrybuty ORDER BY NEWID()";
            resultSet = getData(sqlQuery);
            while(resultSet.next()) {
            int n = resultSet.getInt("zrecznosc");
            atributes[1] = n;
            dextValueLabel.setText(String.valueOf(atributes[1]) + " (+"+ calculateBonus(atributes[1])+")");}
            
            sqlQuery = "SELECT TOP 1  kondycja FROM Atrybuty ORDER BY NEWID()";
            resultSet = getData(sqlQuery);
            while(resultSet.next()) {
            int n = resultSet.getInt("kondycja");
            atributes[2] = n;
            contValueLabel.setText(String.valueOf(atributes[2]) + " (+"+ calculateBonus(atributes[2])+")");}

           
            sqlQuery = "SELECT TOP 1  inteligencja  FROM Atrybuty ORDER BY NEWID()";
            resultSet = getData(sqlQuery);
            while(resultSet.next()) {
            int n = resultSet.getInt("inteligencja");
            atributes[3] = n;
            inteligValueLabel.setText(String.valueOf(atributes[3]) + " (+"+ calculateBonus(atributes[3])+")");}
            
            sqlQuery = "SELECT TOP 1  madrosc FROM Atrybuty ORDER BY NEWID()";
            resultSet = getData(sqlQuery);
            while(resultSet.next()) {
            int n = resultSet.getInt("madrosc");
            atributes[4] = n;
            wisdomValueLabel.setText(String.valueOf(atributes[4]) + " (+"+ calculateBonus(atributes[4])+")");}
            
            sqlQuery = "SELECT TOP 1 charyzma  FROM Atrybuty ORDER BY NEWID()";
            resultSet = getData(sqlQuery);
            while(resultSet.next()) {
            int n = resultSet.getInt("charyzma");
            atributes[5] = n;
            charismaValueLabel.setText(String.valueOf(atributes[5]) + " (+"+ calculateBonus(atributes[5])+")");}
            }
        catch (Exception e) { System.out.println(e.getMessage());}
    }
    
    public static void generateAppearence(){
        try {
            String sqlQuery = String.format("  SELECT TOP 1 w.wyglad FROM Wyglad w" +
            "JOIN Rasa r ON r.rasaID=w.rasaID" +
            "JOIN Podrasa p ON p.podrasaID=w.podrasaID" +
            "JOIN Plec pl ON pl.plecID=w.plecID" +
            "JOIN Wiek wi ON wi.wiekID=w.wiekID" +
            "WHERE rasa='%s' AND plec='%s'", race, sex);
            ResultSet resultSet = getData(sqlQuery);
            while (resultSet.next()) {
                String s = resultSet.getString("wyglad");
                appearence = s;
                appearenceValueLabel.setText(appearence);}
                System.out.println(appearence);}
        catch (ClassNotFoundException | SQLException e) {}
    }
    
    public static void generatePersonality() {
  
        try {
            String sqlQuery = "SELECT TOP 3 cecha FROM Osobowosc ORDER BY NEWID()";
            ResultSet resultSet = getData(sqlQuery);
            while (resultSet.next()) {
                String s = resultSet.getString("cecha");
                personality.add(s);
                personalityValueLabel.setText(personality.toString());}}
        catch (ClassNotFoundException | SQLException e) {}
    }
    
    public static void generateSkills() {
        try {
            if("Krasnolud".equals(race) || "Gnom".equals(race) || "Elf".equals(race) || "Niziołek".equals(race) ) {
                String sqlQuery = "SELECT TOP u.umiejetnosc FROM Umiejetnosci ORDER BY NEWID()";
                ResultSet resultSet = getData(sqlQuery);
            while(resultSet.next()) {
                String s = resultSet.getString("umiejetnosc");
                skills.add(s);
                }
            skillsValueLabel.setText(skills.toString());
            
            }
            else {
                String sqlQuery = "SELECT TOP 3 umiejetnosc FROM Umiejetnosci ORDER BY NEWID()";
                ResultSet resultSet = getData(sqlQuery);
            while(resultSet.next()) {
                String s = resultSet.getString("umiejetnosc");
                skills.add(s);
                }
            skillsValueLabel.setText(skills.toString());
                }
        }
        catch (ClassNotFoundException | SQLException e) {}
    }
    
    public static int calculateBonus(int atribute) {
        if (atribute <=7) { bonus = -2; }
        else if (atribute <=9) {bonus = -1;}
        else if (atribute <=11) {bonus = 0;}
        else if (atribute <=13) {bonus = 1;}
        else if (atribute <=15) {bonus = 2;}
        else if (atribute <=17) {bonus = 3;}
        else if (atribute <=19) {bonus = 4;}
        else if (atribute <=21) {bonus = 5;}
        return bonus;
    }
    
    //podział na Random i wybrane
    public static void generateCharacterSheet() {
        clearAfterReset();
        readComboBoxValues();
        randomCharacter();
        generateSpeedAndLanguage(race);
        generateACandHP(classes);
        generateNameSurname();
        generateAtributes();
        generateSkills();
        generateAppearence();
        generatePersonality();
        }
    
    public static void clearAfterReset() {
    	race=null;
    	subrace=null;
    	alignment=null;
    	skills.clear();
    	personality.clear();
    }
}
