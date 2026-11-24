
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FMedicamentos extends javax.swing.JFrame {

    Conexion2 cnx = new Conexion2();
    String todo = "SELECT * FROM medicamentos ORDER BY nombreMe";
    
    public FMedicamentos() {
        initComponents();
        setLocationRelativeTo(this);
        
        if (cnx.conectar("127.0.0.1", "simitel", "root","") == 1) {
            cnx.entablar(todo, TConsultas);
        } else {
            JOptionPane.showMessageDialog(this, "Sin conexión a la base de datos");
            System.exit(0);
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Actualizar = new javax.swing.JToolBar();
        BRegistrar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        Tvalor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Medicamentos");

        Actualizar.setBackground(new java.awt.Color(204, 255, 204));
        Actualizar.setRollover(true);

        BRegistrar.setText("Registrar");
        BRegistrar.setFocusable(false);
        BRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BRegistrar.setMaximumSize(new java.awt.Dimension(59, 60));
        BRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actualizar.add(BRegistrar);

        BActualizar.setText("Actualizar");
        BActualizar.setFocusable(false);
        BActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actualizar.add(BActualizar);

        BBorrar.setText("Borrar");
        BBorrar.setFocusable(false);
        BBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actualizar.add(BBorrar);

        Tvalor.setMaximumSize(new java.awt.Dimension(200, 64));
        Tvalor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TvalorMousePressed(evt);
            }
        });
        Actualizar.add(Tvalor);

        TConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TvalorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TvalorMousePressed
        char tecla = evt.getKeyChar();
        if (tecla == '\n') {
        String call = "{call filtrar_medicamento(?)}";
        
        

        try {

            CallableStatement cs = cnx.con.prepareCall(call);
            cs.setString(1, Tvalor.getText());
            cs.execute();
            cnx.entablar(call, TConsultas);

        } catch (SQLException ex) {
            System.out.println("Error al llamar al procedimiento");
        }
    }


    }//GEN-LAST:event_TvalorMousePressed

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
            java.util.logging.Logger.getLogger(FMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar Actualizar;
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JTable TConsultas;
    private javax.swing.JTextField Tvalor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
