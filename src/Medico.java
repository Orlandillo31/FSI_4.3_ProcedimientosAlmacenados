import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class Medico extends javax.swing.JFrame {
    
    
    
    
    private Conexion2 cnx;
    private String archivoFoto;
    private final String todo = "SELECT * FROM medicos";
    
    
    
    
    public Medico() {
        
        
        initComponents();
        pack();
        setLocationRelativeTo(null);
        
        TConsultas.setRowHeight(100);

        cnx = new Conexion2();
        if (cnx.conectar("localhost", "simitel", "root", "") == 1) {
            cnx.entablar(todo, TConsultas);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Sin conexión a la base de datos");
            BInsertar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BInsertar = new javax.swing.JButton();
        LEtiqueta1 = new javax.swing.JLabel();
        TCedula = new javax.swing.JTextField();
        LEtiqueta2 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        LEtiqueta3 = new javax.swing.JLabel();
        TEspecialidad = new javax.swing.JTextField();
        LEtiqueta4 = new javax.swing.JLabel();
        CBSexo = new javax.swing.JComboBox();
        LEtiqueta5 = new javax.swing.JLabel();
        TConsultorio = new javax.swing.JTextField();
        LEtiqueta6 = new javax.swing.JLabel();
        TFecha = new javax.swing.JTextField();
        LEtiqueta7 = new javax.swing.JLabel();
        CBEstado = new javax.swing.JComboBox();
        LFechaFormato = new javax.swing.JLabel();
        LFoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Médicos");

        BInsertar.setText("Insertar");
        BInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertarActionPerformed(evt);
            }
        });

        LEtiqueta1.setText("Cédula");

        LEtiqueta2.setText("Nombre");

        LEtiqueta3.setText("Especialidad");

        LEtiqueta4.setText("Sexo");

        CBSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        LEtiqueta5.setText("Consultorio");

        LEtiqueta6.setText("Fecha de nacimiento");

        LEtiqueta7.setText("Estado");

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));

        LFechaFormato.setText("AAAA-MM-DD");

        LFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFoto.setText("Elegir foto");
        LFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LFotoMousePressed(evt);
            }
        });

        TConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Especialidad", "Sexo", "Consultorio", "Nacimiento", "Estado", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BInsertar, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LEtiqueta1, 145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(TCedula, 270, 270, 270))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LEtiqueta2, 145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(TNombre, 270, 270, 270))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LEtiqueta3, 145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(TEspecialidad, 270, 270, 270))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LEtiqueta4, 145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(CBSexo, 270, 270, 270))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LEtiqueta5, 145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(TConsultorio, 270, 270, 270))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LEtiqueta6, 145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(TFecha, 270, 270, 270))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LEtiqueta7, 145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(CBEstado, 270, 270, 270))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(LFechaFormato, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(555, 555, 555)
                        .addComponent(LFoto, 145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, 680, 680, 680)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BInsertar, 29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(LEtiqueta1, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(TCedula, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(LEtiqueta2, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(TNombre, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(LEtiqueta3, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(TEspecialidad, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(LEtiqueta4, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(CBSexo, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(LEtiqueta5, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(TConsultorio, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(LEtiqueta6, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(TFecha, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(LEtiqueta7, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(CBEstado, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(LFechaFormato, 23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(LFoto, 145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jScrollPane1, 183, 183, 183)))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LFotoMousePressed
        JFileChooser selector = new JFileChooser();

        if (selector.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            archivoFoto = selector.getSelectedFile().getPath();
            ImageIcon foto = new ImageIcon(archivoFoto);

            LFoto.setText("");
            LFoto.setIcon(new ImageIcon(Conexion2.escalarImagen(
                    foto.getImage(), LFoto.getWidth(), LFoto.getHeight()
            )));
        }
    }//GEN-LAST:event_LFotoMousePressed

    private void BInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertarActionPerformed
        try {
            LocalDate fecha = LocalDate.parse(TFecha.getText().trim());
            byte[] foto = archivoFoto == null
                    ? null
                    : Files.readAllBytes(Paths.get(archivoFoto));

            Object[] resultado = cnx.ejecutarCRUD("gestionar_medico", new Object[]{
                "INSERT",
                TCedula.getText().trim(),
                TNombre.getText().trim(),
                TEspecialidad.getText().trim(),
                CBSexo.getSelectedItem().toString(),
                TConsultorio.getText().trim(),
                fecha,
                CBEstado.getSelectedItem().toString(),
                foto
            });

            if ("1".equals(String.valueOf(resultado[0]))) {
                cnx.entablar(todo, TConsultas);
            }

            JOptionPane.showMessageDialog(this,
                    "Estado: " + resultado[0] + "\nMensaje: " + resultado[1]);

        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Escribe la fecha como AAAA-MM-DD.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo leer la foto seleccionada.");
        }
    }//GEN-LAST:event_BInsertarActionPerformed

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new Medico().setVisible(true);
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BInsertar;
    private javax.swing.JComboBox CBEstado;
    private javax.swing.JComboBox CBSexo;
    private javax.swing.JLabel LEtiqueta1;
    private javax.swing.JLabel LEtiqueta2;
    private javax.swing.JLabel LEtiqueta3;
    private javax.swing.JLabel LEtiqueta4;
    private javax.swing.JLabel LEtiqueta5;
    private javax.swing.JLabel LEtiqueta6;
    private javax.swing.JLabel LEtiqueta7;
    private javax.swing.JLabel LFechaFormato;
    private javax.swing.JLabel LFoto;
    private javax.swing.JTextField TCedula;
    private javax.swing.JTable TConsultas;
    private javax.swing.JTextField TConsultorio;
    private javax.swing.JTextField TEspecialidad;
    private javax.swing.JTextField TFecha;
    private javax.swing.JTextField TNombre;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
