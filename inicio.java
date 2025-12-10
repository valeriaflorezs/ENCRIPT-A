
package Encriptador_Morse;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author valef
 */
public class inicio extends javax.swing.JFrame {

    public inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        m_usuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        m_sistema = new javax.swing.JButton();
        desencript = new javax.swing.JButton();
        encript = new javax.swing.JButton();
        msj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENCRIPT-A: Encriptador-Morse Combinado");
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(62, 0, 83));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(62, 0, 83));
        jTextField1.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ENCRIPT-A");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.setFocusable(false);
        jTextField1.setHighlighter(null);
        jTextField1.setOpaque(true);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(62, 0, 83));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n       Descubre el mundo de la criptografía con nuestro \n                       Encriptador-Morse Combinado.\n\n       ¿Alguna vez has querido enviar mensajes secretos? \n        ¡Ahora puedes! Nuestra herramienta te permite:\n\nEncriptar: Codificar tus textos utilizando los métodos \nde cifrado clásicos Vigenère y César. Estos métodos, \ncombinados con la traducción a código Morse, hacen \ntus mensajes casi imposibles de descifrar sin la clave \ncorrecta.\n\nDesencriptar: Decodificar mensajes en código Morse \nque hayan sido encriptados con los métodos mencionados.");
        jTextArea1.setToolTipText("");
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Antes de empezar, lea el manual:");

        m_usuario.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        m_usuario.setText("MANUAL DE USUARIO");
        m_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_usuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Si presenta inconvenientes consulta:");

        m_sistema.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        m_sistema.setText("MANUAL DE SISTEMA");
        m_sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sistemaActionPerformed(evt);
            }
        });

        desencript.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        desencript.setText("DESENCRIPTAR");
        desencript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencriptActionPerformed(evt);
            }
        });

        encript.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        encript.setText("ENCRIPTAR");
        encript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptActionPerformed(evt);
            }
        });

        msj.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        msj.setForeground(new java.awt.Color(255, 255, 255));
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(msj, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(m_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desencript, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(encript, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(m_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(encript, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(desencript, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_usuario)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(m_sistema))))
                .addComponent(msj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_usuarioActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://heyzine.com/flip-book/a3a0edee39.html"));
        } catch (URISyntaxException | IOException ex) {
            msj.setText("Error al abrir el enlace.");
        }
    }//GEN-LAST:event_m_usuarioActionPerformed

    private void m_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sistemaActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://heyzine.com/flip-book/1bf6846ce7.html"));
        } catch (URISyntaxException | IOException ex) {
            msj.setText("Error al abrir el enlace.");
        }
    }//GEN-LAST:event_m_sistemaActionPerformed

    private void desencriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencriptActionPerformed
        Desencriptador sv = new Desencriptador();
        sv.setVisible(true);
    }//GEN-LAST:event_desencriptActionPerformed

    private void encriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptActionPerformed
        Encriptador sv = new Encriptador();
        sv.setVisible(true);
    }//GEN-LAST:event_encriptActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton desencript;
    private javax.swing.JButton encript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton m_sistema;
    private javax.swing.JButton m_usuario;
    private javax.swing.JLabel msj;
    // End of variables declaration//GEN-END:variables
}
