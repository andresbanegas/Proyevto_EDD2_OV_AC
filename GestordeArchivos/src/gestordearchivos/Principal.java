/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordearchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author MBanegas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jd_Campos = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jd_Registro = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jd_Estandarizacion = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jm_campos = new javax.swing.JMenuItem();
        jm_registro = new javax.swing.JMenuItem();
        jm_estandarizacion = new javax.swing.JMenuItem();
        jm_guardar = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jd_Campos.setSize(new java.awt.Dimension(700, 700));

        jLabel1.setText("Campos");

        javax.swing.GroupLayout jd_CamposLayout = new javax.swing.GroupLayout(jd_Campos.getContentPane());
        jd_Campos.getContentPane().setLayout(jd_CamposLayout);
        jd_CamposLayout.setHorizontalGroup(
            jd_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CamposLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel1)
                .addContainerGap(358, Short.MAX_VALUE))
        );
        jd_CamposLayout.setVerticalGroup(
            jd_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CamposLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(628, Short.MAX_VALUE))
        );

        jd_Registro.setSize(new java.awt.Dimension(700, 700));

        jLabel2.setText("Registro");

        javax.swing.GroupLayout jd_RegistroLayout = new javax.swing.GroupLayout(jd_Registro.getContentPane());
        jd_Registro.getContentPane().setLayout(jd_RegistroLayout);
        jd_RegistroLayout.setHorizontalGroup(
            jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RegistroLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel2)
                .addContainerGap(357, Short.MAX_VALUE))
        );
        jd_RegistroLayout.setVerticalGroup(
            jd_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RegistroLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(628, Short.MAX_VALUE))
        );

        jd_Estandarizacion.setSize(new java.awt.Dimension(700, 700));

        jLabel3.setText("Estandarizacion");

        javax.swing.GroupLayout jd_EstandarizacionLayout = new javax.swing.GroupLayout(jd_Estandarizacion.getContentPane());
        jd_Estandarizacion.getContentPane().setLayout(jd_EstandarizacionLayout);
        jd_EstandarizacionLayout.setHorizontalGroup(
            jd_EstandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EstandarizacionLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel3)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jd_EstandarizacionLayout.setVerticalGroup(
            jd_EstandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EstandarizacionLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addContainerGap(628, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Cargar Archivos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Nuevo Archivo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jm_archivo.setText("Archivo");
        jm_archivo.setEnabled(false);
        jm_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_archivoMouseClicked(evt);
            }
        });

        jm_campos.setText("Campos");
        jm_archivo.add(jm_campos);

        jm_registro.setText("Registros");
        jm_registro.setEnabled(false);
        jm_archivo.add(jm_registro);

        jm_estandarizacion.setText("Estandarizacion");
        jm_estandarizacion.setEnabled(false);
        jm_archivo.add(jm_estandarizacion);

        jMenuBar1.add(jm_archivo);

        jm_guardar.setText("Guardar Archivo");
        jm_guardar.setEnabled(false);
        jm_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_guardarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jm_guardar);

        jMenu3.setText("Exit");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton1)
                .addGap(72, 72, 72)
                .addComponent(jButton2)
                .addContainerGap(435, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JFileChooser jf = new JFileChooser();

        try {
            //FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            //FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Imagenes", "jpg", "png", "bmp");
            //jf.setFileFilter(filtro);
            //jf.addChoosableFileFilter(filtro2);
            int selec = jf.showOpenDialog(this);

            if (selec == JFileChooser.APPROVE_OPTION) {

            }

        } catch (Exception e) {
        }

        JOptionPane.showMessageDialog(this, "Archivo Cargaddo Exitosamente");

        // despues de que cargue el archivo valido
        jm_archivo.setEnabled(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String path=JOptionPane.showInputDialog("Ingrese el nombre del archivo: \n***Asegurese de que no existe un archivo con el mismo nombre***");
        archivo=new File("./"+path+".txt");  
        while(archivo.exists()){
            path=JOptionPane.showInputDialog("Ingrese el nombre del archivo: \n***Asegurese de que no existe un archivo con el mismo nombre***");
            archivo=new File("./"+path+".txt");  
        }
        try {
            archivo.createNewFile();
            System.out.println("Se creo un archivo.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        //despues de crear un archivo enable para guardarlo y enable para archivo
        jm_archivo.setEnabled(true);
        jm_guardar.setEnabled(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jm_archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_archivoMouseClicked

        //luego de crear un campo enable agregar a registro y estandarizacion
        jm_registro.setEnabled(true);
        jm_estandarizacion.setEnabled(true);
    }//GEN-LAST:event_jm_archivoMouseClicked

    private void jm_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_guardarMouseClicked
        // TODO add your handling code here:

        JFileChooser jf = new JFileChooser();
        //FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
        //jf.addChoosableFileFilter(filtro);

        int selec = jf.showSaveDialog(this);

        if (selec == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = null;

                /*if (jf.getFileFilter().getDescription().equals("Archivos de Texto")) {
                    fichero = new File(jf.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jf.getSelectedFile();
                }*/
                JOptionPane.showMessageDialog(this, "Archivo Guardado Exitosamente");
            } catch (Exception e) {
            }
        }

        jm_archivo.setEnabled(true);
    }//GEN-LAST:event_jm_guardarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDialog jd_Campos;
    private javax.swing.JDialog jd_Estandarizacion;
    private javax.swing.JDialog jd_Registro;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenuItem jm_campos;
    private javax.swing.JMenuItem jm_estandarizacion;
    private javax.swing.JMenu jm_guardar;
    private javax.swing.JMenuItem jm_registro;
    // End of variables declaration//GEN-END:variables
    private File archivo = null;
}
