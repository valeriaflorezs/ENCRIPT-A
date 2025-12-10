
package Encriptador_Morse;

/**
 *
 * @author valef
 */
public class Encriptador extends javax.swing.JFrame {

    public Encriptador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        encript = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();
        metodo = new javax.swing.JComboBox<>();
        clave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        Texto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversión de Texto a Código Morse Cifrado");
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(62, 0, 83));

        encript.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        encript.setText("ENCRIPTAR");
        encript.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        encript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptActionPerformed(evt);
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

        Display.setEditable(false);
        Display.setBackground(new java.awt.Color(62, 0, 83));
        Display.setColumns(20);
        Display.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.setRows(5);
        jScrollPane1.setViewportView(Display);

        metodo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        metodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Método", "Método Cesár", "Método Vigenére" }));

        clave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        clave.setToolTipText("Solo es necesaria para Método Vigenère");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Texto a encriptar:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar Clave:");

        mensaje.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        Texto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Texto.setToolTipText("Digite aquí el texto a encriptar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(borrar)))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(encript, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(metodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encript)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String[] abecedario={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private void encriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptActionPerformed
    String text = Texto.getText().toUpperCase();
    String clav = clave.getText().toUpperCase();
    
    if (!validarEntrada(text)) {
        return;
    }
    String[] Texto_claro = new String[text.length()];
    for (int i = 0; i < text.length(); i++) {
        Texto_claro[i] = text.substring(i, i+1); 
    }
        switch (metodo.getSelectedIndex()) {
            case 1 ->                 {
                    // Método César
                    String C = metodoCesar(Texto_claro, text.length());
                    Display.append("\nCriptograma: " + C);
                    traducirMorse(C);
                }
            case 2 ->                 {
                    // Método Vigenére
                    if (!validarEntrada(clav)) {
                        return;
                    }           String C = metodoVignere(text, clav);
                    Display.append("\nCriptograma: " + C);
                    traducirMorse(C);
                }
            default -> mensaje.setText("Debe seleccionar un método");
        }
    }//GEN-LAST:event_encriptActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        Texto.setText("");
        Display.setText("");
    }//GEN-LAST:event_borrarActionPerformed
String metodoCesar(String[] Texto_claro, int l){ 
String Criptograma = ""; // Inicializa el Criptograma
    
    for(int i = 0; i < l; i++){
        if (Texto_claro[i].equals(" ")) {  // Verifica si es un espacio
            Criptograma += " ";  // Agrega un espacio directamente
            continue;  // Salta al siguiente carácter
        }
        
        int j = 0;
        while ((j < 26) && (!abecedario[j].equals(Texto_claro[i]))) { 
            j++; 
        } 
        
        if (j < 26) {  // Si se encontró una letra válida en el abecedario
            Criptograma += abecedario[(j + 3) % 26];
        } 
    }
    return Criptograma;
}

void traducirMorse(String Criptograma){
    String Morse = "";
    String[] codigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", 
                            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", 
                            ".--", "-..-", "-.--", "--.."};

    for (int i = 0; i < Criptograma.length(); i++) {
        String letra = Criptograma.substring(i, i + 1);
        
        if (letra.equals(" ")) {  // Si es un espacio, agregar dos espacios para separarlo en Morse
            Morse += "  ";
        } else {
            int j = posicion(abecedario, letra);
            if (j != -1) {
                Morse += " " + codigoMorse[j];
            }
        }
    }
    Display.append("\nCódigo Morse: " + Morse.toLowerCase());
}

String metodoVignere(String text, String clav){
    text= text.toUpperCase();
    String cl = clav.toUpperCase();
    int longitud = text.length();
    
    String sub = ""; // Clave repetida
    String criptograma = ""; // Texto cifrado
    
    // Construir la clave repetida
    for (int i = 0; i < longitud; i++) {
        sub += cl.charAt(i % cl.length());
    }
    
    // Procesar cada letra del mensaje
    for (int i = 0; i < longitud; i++) {
        String letraMensaje = text.substring(i, i + 1);
        
        if (letraMensaje.equals(" ")) {  // Si es un espacio, simplemente añadirlo
            criptograma += " ";
            continue;
        }
        
        String letraClave = sub.substring(i, i + 1);
        int posMensaje = posicion(abecedario, letraMensaje);
        int posClave = posicion(abecedario, letraClave);
        
        if (posMensaje != -1 && posClave != -1) {
            criptograma += abecedario[(posMensaje + posClave) % 26];
        }
    }
    return criptograma;
}

public static int posicion(String[]ab, String c){
   for (int i = 0; i < ab.length+1; i++) { 
      if (ab[i].equals(c)){
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
    if (texto.equals("")) {
        mensaje.setText("El texto no puede estar vacío.");
        return false;
    }
    for (int i = 0; i < texto1.length(); i++) {
        String letra = texto1.substring(i, i+1);
        
        if (!letra.equals(" ") && posicion(abecedario, letra) == -1) {
            mensaje.setText("Esta palabra no es válida");
            return false;
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
    private javax.swing.JButton encript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JComboBox<String> metodo;
    // End of variables declaration//GEN-END:variables
}
