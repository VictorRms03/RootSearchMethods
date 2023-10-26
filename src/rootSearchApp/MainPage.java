/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rootSearchApp;

/**
 *
 * @author Victor Ramos
 */
public class MainPage extends javax.swing.JFrame {
    
    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        precisionPanel = new javax.swing.JPanel();
        precisionTextField = new javax.swing.JTextField();
        precisionLabel = new javax.swing.JLabel();
        precisionButton = new javax.swing.JButton();
        bisectionMethodPanel = new javax.swing.JPanel();
        bisectionMethodLabel = new javax.swing.JLabel();
        subBisectionMethodLabel = new javax.swing.JLabel();
        resultBisectionMethodLabel = new javax.swing.JLabel();
        numberIterationsBisectionMethodLabel = new javax.swing.JLabel();
        x1OfBisectionMethod = new javax.swing.JTextField();
        x2OfBisectionMethod = new javax.swing.JTextField();
        subBisectionMethodLabel2 = new javax.swing.JLabel();
        newtonMethodPanel = new javax.swing.JPanel();
        newtonMethodLabel = new javax.swing.JLabel();
        subNewtonMethodLabel = new javax.swing.JLabel();
        resultNewtonMethodLabel = new javax.swing.JLabel();
        numberIterationsNewtonMethodLabel = new javax.swing.JLabel();
        xOfNewtonMethod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLabel.setText("Busca de Raizes para Função: x³ - 7x² + 14x - 6");
        titleLabel.setToolTipText("");

        precisionTextField.setText("0");
        precisionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precisionTextFieldActionPerformed(evt);
            }
        });

        precisionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precisionLabel.setText("Insira a Precisão Buscada:");

        precisionButton.setText("Enviar");
        precisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precisionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout precisionPanelLayout = new javax.swing.GroupLayout(precisionPanel);
        precisionPanel.setLayout(precisionPanelLayout);
        precisionPanelLayout.setHorizontalGroup(
            precisionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, precisionPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(precisionLabel)
                .addGap(47, 47, 47)
                .addComponent(precisionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(precisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        precisionPanelLayout.setVerticalGroup(
            precisionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(precisionPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(precisionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precisionLabel)
                    .addComponent(precisionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bisectionMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bisectionMethodLabel.setText("Método da Bissecção");

        subBisectionMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subBisectionMethodLabel.setText("Procurando Raiz entre:");

        resultBisectionMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resultBisectionMethodLabel.setText("Resultado Obtido:");

        numberIterationsBisectionMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numberIterationsBisectionMethodLabel.setText("Número de Iterações Necessárias:");

        x1OfBisectionMethod.setText("0");

        x2OfBisectionMethod.setText("1");

        subBisectionMethodLabel2.setText("e");

        javax.swing.GroupLayout bisectionMethodPanelLayout = new javax.swing.GroupLayout(bisectionMethodPanel);
        bisectionMethodPanel.setLayout(bisectionMethodPanelLayout);
        bisectionMethodPanelLayout.setHorizontalGroup(
            bisectionMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bisectionMethodPanelLayout.createSequentialGroup()
                .addGroup(bisectionMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bisectionMethodPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(bisectionMethodLabel))
                    .addGroup(bisectionMethodPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(bisectionMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberIterationsBisectionMethodLabel)
                            .addComponent(resultBisectionMethodLabel)))
                    .addGroup(bisectionMethodPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(subBisectionMethodLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x1OfBisectionMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subBisectionMethodLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2OfBisectionMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        bisectionMethodPanelLayout.setVerticalGroup(
            bisectionMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bisectionMethodPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bisectionMethodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bisectionMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subBisectionMethodLabel)
                    .addComponent(x1OfBisectionMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2OfBisectionMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subBisectionMethodLabel2))
                .addGap(53, 53, 53)
                .addComponent(resultBisectionMethodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(numberIterationsBisectionMethodLabel)
                .addGap(47, 47, 47))
        );

        newtonMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newtonMethodLabel.setText("Método de Newton");

        subNewtonMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subNewtonMethodLabel.setText("Procurando Raiz com chute inicial");

        resultNewtonMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resultNewtonMethodLabel.setText("Resultado Obtido:");

        numberIterationsNewtonMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numberIterationsNewtonMethodLabel.setText("Número de Iterações Necessárias:");

        xOfNewtonMethod.setText("1");
        xOfNewtonMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xOfNewtonMethodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newtonMethodPanelLayout = new javax.swing.GroupLayout(newtonMethodPanel);
        newtonMethodPanel.setLayout(newtonMethodPanelLayout);
        newtonMethodPanelLayout.setHorizontalGroup(
            newtonMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newtonMethodPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(newtonMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberIterationsNewtonMethodLabel)
                    .addComponent(resultNewtonMethodLabel))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newtonMethodPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(newtonMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subNewtonMethodLabel)
                    .addComponent(newtonMethodLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(xOfNewtonMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        newtonMethodPanelLayout.setVerticalGroup(
            newtonMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newtonMethodPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(newtonMethodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newtonMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subNewtonMethodLabel)
                    .addComponent(xOfNewtonMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(resultNewtonMethodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numberIterationsNewtonMethodLabel)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bisectionMethodPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newtonMethodPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addComponent(precisionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(precisionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bisectionMethodPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newtonMethodPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precisionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precisionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precisionTextFieldActionPerformed

    private void precisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precisionButtonActionPerformed
    
        resultBisectionMethodLabel.setText("Resultado Obtido: " + RootSearch.bisectionMethodResult(Double.parseDouble(x1OfBisectionMethod.getText()), Double.parseDouble(x2OfBisectionMethod.getText()), Integer.parseInt(precisionTextField.getText())));
        numberIterationsBisectionMethodLabel.setText("Número de Iterações Necessárias: " + RootSearch.bisectionMethodIterationsNumber(Double.parseDouble(x1OfBisectionMethod.getText()), Double.parseDouble(x2OfBisectionMethod.getText()), Integer.parseInt(precisionTextField.getText())));
        
        resultNewtonMethodLabel.setText("Resultado Obtido: " + RootSearch.newtonMethodResult(0, Integer.parseInt(precisionTextField.getText())));
        numberIterationsNewtonMethodLabel.setText("Número de Iterações Necessárias: " + RootSearch.newtonMethodIterationsNumber(Double.parseDouble(xOfNewtonMethod.getText()), Integer.parseInt(precisionTextField.getText())));
    }//GEN-LAST:event_precisionButtonActionPerformed

    private void xOfNewtonMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xOfNewtonMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xOfNewtonMethodActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bisectionMethodLabel;
    private javax.swing.JPanel bisectionMethodPanel;
    private javax.swing.JLabel newtonMethodLabel;
    private javax.swing.JPanel newtonMethodPanel;
    private javax.swing.JLabel numberIterationsBisectionMethodLabel;
    private javax.swing.JLabel numberIterationsNewtonMethodLabel;
    private javax.swing.JButton precisionButton;
    private javax.swing.JLabel precisionLabel;
    private javax.swing.JPanel precisionPanel;
    private javax.swing.JTextField precisionTextField;
    private javax.swing.JLabel resultBisectionMethodLabel;
    private javax.swing.JLabel resultNewtonMethodLabel;
    private javax.swing.JLabel subBisectionMethodLabel;
    private javax.swing.JLabel subBisectionMethodLabel2;
    private javax.swing.JLabel subNewtonMethodLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField x1OfBisectionMethod;
    private javax.swing.JTextField x2OfBisectionMethod;
    private javax.swing.JTextField xOfNewtonMethod;
    // End of variables declaration//GEN-END:variables
}
