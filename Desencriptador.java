
package Encriptador_Morse;

/**
 *
 * @author valef
 */
public class Desencriptador extends javax.swing.JFrame {

    public Desencriptador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        desencript = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        metodo = new javax.swing.JComboBox<>();
        clave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        Texto = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversión de Código Morse a Texto decifrado");
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(62, 0, 83));

        desencript.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        desencript.setText("DESENCRIPTAR");
        desencript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencriptActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(62, 0, 83));
        jTextField1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
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

        metodo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        metodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Método", "Método Cesár", "Método Vigenére" }));

        clave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        clave.setToolTipText("Solo es necesaria para Método Vigenère");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Texto a desencriptar:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar Clave:");

        mensaje.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));

        Texto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Texto.setToolTipText("Digite aquí el texto a encriptar");

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        Display.setEditable(false);
        Display.setBackground(new java.awt.Color(62, 0, 83));
        Display.setColumns(20);
        Display.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.setRows(5);
        jScrollPane1.setViewportView(Display);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(borrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desencript, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desencript)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void desencriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencriptActionPerformed
    String b = Texto.getText();
    String C = traducirMorse(b);
     if (!validarEntrada(C)) {
        return;
    }
    Display.append("\nCriptograma: " + C);
    String[] Cripto = new String[C.length()];
    for (int i = 0; i < C.length(); i++) {
        Cripto[i] = C.substring(i, i+1); 
    }
        switch (metodo.getSelectedIndex()) {
            case 1 -> {
                // Método César
                String MC = metodoCesarInverso(Cripto, C.length());
                Display.append("\nMensaje descifrado: " + MC.toLowerCase());
            }
            case 2 -> {
                // Método Vigenère
                String cl = clave.getText().toUpperCase();
                if (!validarEntrada(cl)) {
                     return;
                } else {
                    String textoDescifrado = metodoVignere(C);
                    Display.append("\nMensaje descifrado (Vigenère): " + textoDescifrado.toLowerCase());
                }
            }
            default -> mensaje.setText("Debe seleccionar un método");
        }
    }//GEN-LAST:event_desencriptActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        Texto.setText("");
        Display.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    String[] abecedario={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

String traducirMorse(String Morse){
    String Criptograma="";
    String[] codigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", 
                            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", 
                            ".--", "-..-", "-.--", "--.."};
    int em = 0; 
    while (em < Morse.length()) {
        int ter = em; 
        while (ter < Morse.length() && !Morse.substring(ter, ter + 1).equals(" ")) {
            ter++; 
        }
        
      String letra = Morse.substring(em, ter);

        boolean encontrado = false;
        for (int i = 0; i < codigoMorse.length; i++) {
            if (letra.equals(codigoMorse[i])) {
                Criptograma += abecedario[i]; 
                encontrado = true;
            }
        }

        em = ter + 1;

        if (em < Morse.length() - 1 && Morse.substring(em, em + 1).equals(" ") && Morse.substring(em + 1, em + 2).equals(" ")) {
            Criptograma += " "; // Añadir espacio entre palabras
            em += 2; // Saltar los dos espacios
        }
    }

    return Criptograma; // Devolver el texto traducido
}

String metodoCesarInverso(String[] Cripto, int l) {
    String Texto_claro = "";
    
    for (int i = 0; i < l; i++) {
        if (Cripto[i].equals(" ")) {
            Texto_claro += " "; // Agrega espacio directamente
        } else {
            int j = posicion(abecedario, Cripto[i]);
            if (j != -1) {
                Texto_claro += abecedario[(j - 3 + 26) % 26];
            }
        }
    }
    
    return Texto_claro;
}
String metodoVignere(String text) {
     String mensaje1 = text.toUpperCase();
    String cl = clave.getText().toUpperCase();
    int longitud = mensaje1.length();
    String sub = "";
    String textoDescifrado = "";
    
    for (int i = 0; i < longitud; i++) {
        sub += cl.charAt(i % cl.length());
    }
    
    for (int i = 0; i < longitud; i++) {
        String letraMensaje = mensaje1.substring(i, i + 1);
        
        if (letraMensaje.equals(" ")) {
            textoDescifrado += " "; // Agregar espacio directamente
        } else {
            String letraClave = sub.substring(i, i + 1);
            int posMensaje = posicion(abecedario, letraMensaje);
            int posClave = posicion(abecedario, letraClave);
            
            if (posMensaje != -1 && posClave != -1) {
                int posLetraOriginal = (posMensaje - posClave + 26) % 26;
                textoDescifrado += abecedario[posLetraOriginal];
            }
        }
    }
    return textoDescifrado;
}

public static int posicion(String[] ab, String c) {
    for (int i = 0; i < ab.length; i++) { // Cambiar a ab.length
        if (ab[i].equals(c)) {
            return i;
        }
    }
    return -1;
}
private boolean validarEntrada(String texto) {
  if (texto.equals("")) {
        mensaje.setText("El texto no puede estar vacío.");
        return false;
    }

    String texto1 = texto.toUpperCase();
    for (int i = 0; i < texto1.length(); i++) {
        String caracter = texto1.substring(i, i + 1);
        if (!caracter.equals(" ")) { // Ignora los espacios
            boolean letraValida = false;
            for (String letra : abecedario) {
                if (caracter.equals(letra)) {
                    letraValida = true;
                }
            }
            if (!letraValida) {
                mensaje.setText("Esta palabra no es válida");
                return false;
            }
        }
    }
    mensaje.setText("");
    return true;
}


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
    private javax.swing.JTextArea Display;
    private javax.swing.JTextField Texto;
    private javax.swing.JButton borrar;
    private javax.swing.JTextField clave;
    private javax.swing.JButton desencript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JComboBox<String> metodo;
    // End of variables declaration//GEN-END:variables
}
