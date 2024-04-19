//Librerías utilizadas:
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.nio.charset.StandardCharsets;

/*
Hecho por: José Raymundo Baca Hernández
Algoritmos y Sistemas de Cifrado - Criptografía
Instituto Tecnológico de Chihuahua ll
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null); // Centrar el JFrame en la pantalla
        setTitle("Método RSA"); //Declaramos título
        setIconImage(getIconImage()); //Pone el icono personalizado
    }
    
    @Override
    public Image getIconImage() {
        //Cambia el icono del JFrame
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Logo/RSA.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonEncriptarporPublica = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonDesencriptarporPrivada = new javax.swing.JButton();
        jButtonFileChooserLlavePublica = new javax.swing.JButton();
        jButtonFileChooserKeyPrivada = new javax.swing.JButton();
        jTextFieldLlavePublica = new javax.swing.JTextField();
        jTextFieldLlavePrivada = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBorrarjTextAreas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, -1, -1));

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 97, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Texto plano");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 75, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Texto encriptado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 75, -1, -1));

        jButtonEncriptarporPublica.setBackground(new java.awt.Color(51, 51, 51));
        jButtonEncriptarporPublica.setForeground(new java.awt.Color(255, 255, 51));
        jButtonEncriptarporPublica.setText("Encriptar");
        jButtonEncriptarporPublica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButtonEncriptarporPublica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncriptarporPublicaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEncriptarporPublica, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 257, 230, 30));

        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Llave pública");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 202, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Llave privada");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 202, -1, -1));

        jButtonDesencriptarporPrivada.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDesencriptarporPrivada.setForeground(new java.awt.Color(51, 204, 0));
        jButtonDesencriptarporPrivada.setText("Desencriptar");
        jButtonDesencriptarporPrivada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButtonDesencriptarporPrivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesencriptarporPrivadaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDesencriptarporPrivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 257, 240, 30));

        jButtonFileChooserLlavePublica.setBackground(new java.awt.Color(51, 51, 51));
        jButtonFileChooserLlavePublica.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFileChooserLlavePublica.setText("Key Pública");
        jButtonFileChooserLlavePublica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButtonFileChooserLlavePublica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileChooserLlavePublicaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFileChooserLlavePublica, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 225, 230, 30));

        jButtonFileChooserKeyPrivada.setBackground(new java.awt.Color(51, 51, 51));
        jButtonFileChooserKeyPrivada.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFileChooserKeyPrivada.setText("Key Privada");
        jButtonFileChooserKeyPrivada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButtonFileChooserKeyPrivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileChooserKeyPrivadaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFileChooserKeyPrivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 225, 240, 30));

        jTextFieldLlavePublica.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextFieldLlavePublica, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 290, 230, 30));

        jTextFieldLlavePrivada.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextFieldLlavePrivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 289, 240, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("RSA");

        jButtonBorrarjTextAreas.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBorrarjTextAreas.setForeground(new java.awt.Color(255, 153, 0));
        jButtonBorrarjTextAreas.setText("Borrar");
        jButtonBorrarjTextAreas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButtonBorrarjTextAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarjTextAreasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 436, Short.MAX_VALUE))
                    .addComponent(jButtonBorrarjTextAreas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jButtonBorrarjTextAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private PublicKey llavePublica;
    private PrivateKey clavePrivada;

    private void jButtonEncriptarporPublicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncriptarporPublicaActionPerformed
        try {
            // Obtener la clave pública desde jTextFieldLlavePublica
            String llavePublicaTexto = jTextFieldLlavePublica.getText();
            byte[] llavePublicaBytes = Base64.getDecoder().decode(llavePublicaTexto);
            X509EncodedKeySpec spec = new X509EncodedKeySpec(llavePublicaBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey llavePublica = keyFactory.generatePublic(spec);
            // Obtener el texto a encriptar desde jTextArea1
            String textoPlano = jTextArea1.getText();
            // Inicializar el cifrador RSA con PKCS1Padding
            Cipher cifrador = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cifrador.init(Cipher.ENCRYPT_MODE, llavePublica);
            // Encriptar el texto
            byte[] textoCifrado = cifrador.doFinal(textoPlano.getBytes());
            // Mostrar el texto encriptado en jTextArea2
            jTextArea2.setText(Base64.getEncoder().encodeToString(textoCifrado));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonEncriptarporPublicaActionPerformed

    private void jButtonDesencriptarporPrivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesencriptarporPrivadaActionPerformed
        try {
        // Obtener la clave privada desde la variable global
        if (clavePrivada == null) {
            return;
        }
        // Obtener el texto encriptado desde jTextArea2
        String textoCifradoTexto = jTextArea2.getText();
        byte[] textoCifrado = Base64.getDecoder().decode(textoCifradoTexto);
        // Inicializar el cifrador RSA con PKCS1Padding
        Cipher cifrador = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cifrador.init(Cipher.DECRYPT_MODE, clavePrivada);
        // Desencriptar el texto
        byte[] textoDesencriptado = cifrador.doFinal(textoCifrado);
        // Mostrar el texto desencriptado en jTextArea1
        jTextArea1.setText(new String(textoDesencriptado, StandardCharsets.UTF_8));
    } catch (BadPaddingException e) {
        System.err.println("Error de desencriptación: Datos cifrados incorrectos");
        System.err.println("Mensaje de la excepción: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButtonDesencriptarporPrivadaActionPerformed

    private void jButtonFileChooserLlavePublicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileChooserLlavePublicaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        // Configurar filtro para archivos con extensión .key
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de clave (.key)", "key");
        fileChooser.setFileFilter(filter);
        int resultado = fileChooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            // Llamar al método para cargar la clave pública desde el archivo
            cargarClavePublicaDesdeArchivo(archivoSeleccionado);
        }
    }//GEN-LAST:event_jButtonFileChooserLlavePublicaActionPerformed

    private void jButtonFileChooserKeyPrivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileChooserKeyPrivadaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de clave privada (.key)", "key");
        fileChooser.setFileFilter(filter);
        int resultado = fileChooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            cargarClavePrivadaDesdeArchivo(archivoSeleccionado);
        }
    }//GEN-LAST:event_jButtonFileChooserKeyPrivadaActionPerformed

    private void jButtonBorrarjTextAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarjTextAreasActionPerformed
        jTextArea1.setText(""); // Borra el contenido de jTextArea1
        jTextArea2.setText(""); // Borra el contenido de jTextArea2
    }//GEN-LAST:event_jButtonBorrarjTextAreasActionPerformed
    private void cargarClavePublicaDesdeArchivo(File archivo) {
        try {
            FileInputStream fis = new FileInputStream(archivo);
            byte[] llavePublicaBytes = new byte[(int) archivo.length()];
            fis.read(llavePublicaBytes);
            fis.close();
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec spec = new X509EncodedKeySpec(llavePublicaBytes);
            PublicKey llavePublica = keyFactory.generatePublic(spec);
            // Mostrar la clave pública en jTextFieldLlavePublica 
            jTextFieldLlavePublica.setText(Base64.getEncoder().encodeToString(llavePublica.getEncoded()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarClavePrivadaDesdeArchivo(File archivo) {
        try {
            FileInputStream fis = new FileInputStream(archivo);
            byte[] clavePrivadaBytes = new byte[(int) archivo.length()];
            fis.read(clavePrivadaBytes);
            fis.close();
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(clavePrivadaBytes);
            // Asignar la clave privada a la variable de instancia
            clavePrivada = keyFactory.generatePrivate(spec);
            // Mostrar la clave privada en jTextFieldLlavePrivada
            jTextFieldLlavePrivada.setText(Base64.getEncoder().encodeToString(clavePrivada.getEncoded()));
        } catch (Exception e) {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarjTextAreas;
    private javax.swing.JButton jButtonDesencriptarporPrivada;
    private javax.swing.JButton jButtonEncriptarporPublica;
    private javax.swing.JButton jButtonFileChooserKeyPrivada;
    private javax.swing.JButton jButtonFileChooserLlavePublica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextFieldLlavePrivada;
    private javax.swing.JTextField jTextFieldLlavePublica;
    // End of variables declaration//GEN-END:variables
}
