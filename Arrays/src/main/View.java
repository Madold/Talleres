package main;

import javax.swing.JOptionPane;

public class View extends javax.swing.JFrame {

    private Array namesList;
    private int counter = 0;

    public View() {
        initComponents();
        initWindow();
    }

    private void initWindow() {
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        namesListLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        findNameBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        namesTextArea = new javax.swing.JTextArea();
        avaliableSpacesCounter = new javax.swing.JLabel();
        findNameInput = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        setNamesNumberBtn = new javax.swing.JButton();
        namesNumberLabel = new javax.swing.JLabel();
        inputNamesNumber = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        addNameBtn = new javax.swing.JButton();
        avaliableSpacesLabel = new javax.swing.JLabel();
        indexLabel = new javax.swing.JLabel();
        findNameLabel = new javax.swing.JLabel();
        indexCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario");

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namesListLabel.setFont(new java.awt.Font("Red Hat Display", 1, 18)); // NOI18N
        namesListLabel.setForeground(new java.awt.Color(51, 51, 51));
        namesListLabel.setText("Listado de nombres");
        bg.add(namesListLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        nameLabel.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setText("Nombre:");
        bg.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        inputName.setEditable(false);
        inputName.setBackground(new java.awt.Color(255, 255, 255));
        inputName.setFont(new java.awt.Font("Red Hat Display", 0, 15)); // NOI18N
        inputName.setForeground(new java.awt.Color(102, 102, 102));
        inputName.setBorder(null);
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });
        bg.add(inputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 210, 20));

        findNameBtn.setBackground(new java.awt.Color(51, 51, 51));
        findNameBtn.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        findNameBtn.setForeground(new java.awt.Color(255, 255, 255));
        findNameBtn.setText("Buscar");
        findNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findNameBtnActionPerformed(evt);
            }
        });
        bg.add(findNameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 110, 30));

        jLabel3.setFont(new java.awt.Font("Red Hat Display", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Formulario de Nombres");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 280, -1));

        namesTextArea.setEditable(false);
        namesTextArea.setBackground(new java.awt.Color(255, 255, 255));
        namesTextArea.setColumns(20);
        namesTextArea.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        namesTextArea.setForeground(new java.awt.Color(51, 51, 51));
        namesTextArea.setRows(5);
        namesTextArea.setBorder(null);
        jScrollPane1.setViewportView(namesTextArea);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 330, 160));

        avaliableSpacesCounter.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        avaliableSpacesCounter.setForeground(new java.awt.Color(51, 51, 51));
        avaliableSpacesCounter.setText("0");
        bg.add(avaliableSpacesCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        findNameInput.setBackground(new java.awt.Color(255, 255, 255));
        findNameInput.setFont(new java.awt.Font("Red Hat Display", 0, 15)); // NOI18N
        findNameInput.setForeground(new java.awt.Color(102, 102, 102));
        findNameInput.setBorder(null);
        findNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findNameInputActionPerformed(evt);
            }
        });
        bg.add(findNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 210, 20));

        setNamesNumberBtn.setBackground(new java.awt.Color(51, 51, 51));
        setNamesNumberBtn.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        setNamesNumberBtn.setForeground(new java.awt.Color(255, 255, 255));
        setNamesNumberBtn.setText("Establecer");
        setNamesNumberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNamesNumberBtnActionPerformed(evt);
            }
        });
        bg.add(setNamesNumberBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 110, 30));

        namesNumberLabel.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        namesNumberLabel.setForeground(new java.awt.Color(51, 51, 51));
        namesNumberLabel.setText("Cantidad de nombres:");
        bg.add(namesNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        inputNamesNumber.setBackground(new java.awt.Color(255, 255, 255));
        inputNamesNumber.setFont(new java.awt.Font("Red Hat Display", 0, 15)); // NOI18N
        inputNamesNumber.setForeground(new java.awt.Color(102, 102, 102));
        inputNamesNumber.setBorder(null);
        inputNamesNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamesNumberActionPerformed(evt);
            }
        });
        bg.add(inputNamesNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 210, 20));

        addNameBtn.setBackground(new java.awt.Color(51, 51, 51));
        addNameBtn.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        addNameBtn.setForeground(new java.awt.Color(255, 255, 255));
        addNameBtn.setText("Agregar");
        addNameBtn.setEnabled(false);
        addNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNameBtnActionPerformed(evt);
            }
        });
        bg.add(addNameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 110, 30));

        avaliableSpacesLabel.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        avaliableSpacesLabel.setForeground(new java.awt.Color(51, 51, 51));
        avaliableSpacesLabel.setText("Espacios disponibles:");
        bg.add(avaliableSpacesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        indexLabel.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        indexLabel.setForeground(new java.awt.Color(51, 51, 51));
        indexLabel.setText("Indice:");
        bg.add(indexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        findNameLabel.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        findNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        findNameLabel.setText("Buscar nombre:");
        bg.add(findNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        indexCounter.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        indexCounter.setForeground(new java.awt.Color(51, 51, 51));
        indexCounter.setText("0");
        bg.add(indexCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void findNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findNameInputActionPerformed

    private void inputNamesNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamesNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamesNumberActionPerformed

    private void setNamesNumberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNamesNumberBtnActionPerformed
        int namesNumber = 0;

        try {
            namesNumber = Integer.parseInt(inputNamesNumber.getText());
            namesList = new Array(namesNumber);
            addNameBtn.setEnabled(true);
            inputName.setEditable(true);
            setNamesNumberBtn.setEnabled(false);
            inputNamesNumber.setEditable(false);
            avaliableSpacesCounter.setText(String.valueOf(namesList.getAvaliableSpaces()));
        } catch (NumberFormatException e) {
            showMesage("No se pueden colocar letras, carácteres especiales o espacios en blanco, solo números");
        }
    }//GEN-LAST:event_setNamesNumberBtnActionPerformed

    private void addNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNameBtnActionPerformed
        String element = inputName.getText();

        if (namesList.getAvaliableSpaces() != 0) {
            namesList.setElement(counter, element);
            counter++;
            namesList.decreaseSpaces();
            avaliableSpacesCounter.setText(String.valueOf(namesList.getAvaliableSpaces()));
            addNameToHistory(element);
        } else {
            showMesage("No puedes agregar mas elementos");
        }
    }//GEN-LAST:event_addNameBtnActionPerformed

    private void findNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findNameBtnActionPerformed
       String nameToFind = findNameInput.getText();
       int nameIndex = namesList.findElementIndexByName(nameToFind);
       indexCounter.setText(String.valueOf(nameIndex));
       
    }//GEN-LAST:event_findNameBtnActionPerformed
    
    private void addNameToHistory(String name) {
        String history = namesTextArea.getText();       
        history = "  - "+name + "\n";    
        namesTextArea.append(history);   
    }
    
    private void showMesage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNameBtn;
    private javax.swing.JLabel avaliableSpacesCounter;
    private javax.swing.JLabel avaliableSpacesLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JButton findNameBtn;
    private javax.swing.JTextField findNameInput;
    private javax.swing.JLabel findNameLabel;
    private javax.swing.JLabel indexCounter;
    private javax.swing.JLabel indexLabel;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputNamesNumber;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel namesListLabel;
    private javax.swing.JLabel namesNumberLabel;
    private javax.swing.JTextArea namesTextArea;
    private javax.swing.JButton setNamesNumberBtn;
    // End of variables declaration//GEN-END:variables

}
