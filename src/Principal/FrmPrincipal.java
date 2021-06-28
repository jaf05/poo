/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Beans.Paciente;
import Controller.PacienteController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dr Baltazar
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private PacienteController pacicontroller = new PacienteController();
    private DefaultTableModel dtmPaciente = new DefaultTableModel();
    FondoPanel fondo = new FondoPanel();
    
    /**
     * Creates new form FrmPrincipalPaciente
     */
    public FrmPrincipal() {
 
        this.setContentPane(fondo);
        
        initComponents();
        llenaTabla();
        listar();
        this.setTitle("Registro de pacientes");

    }

    public void llenaTabla() {
        dtmPaciente.addColumn("HISTORIA CLINICA");
        dtmPaciente.addColumn("NOMBRE Y APELLIDOS");
        dtmPaciente.addColumn("EDAD");
        dtmPaciente.addColumn("SEXO");
        dtmPaciente.addColumn("DNI");
        dtmPaciente.addColumn("ANTECEDENTES");

        this.tPaciente.setModel(dtmPaciente);
    }

    public void listar() {
        dtmPaciente.setNumRows(0);
        for (int i = 0; i < pacicontroller.size(); i++) {
            Object[] vec = new Object[6];
            vec[0] = pacicontroller.get(i).getHistclini();
            vec[1] = pacicontroller.get(i).getNomape();
            vec[2] = pacicontroller.get(i).getEdad();
            vec[3] = pacicontroller.get(i).getSexo();
            vec[4] = pacicontroller.get(i).getDni();
            vec[5] = pacicontroller.get(i).getAntecepato();

            dtmPaciente.addRow(vec);
        }
        tPaciente.setModel(dtmPaciente);
    }

    /*
//Restricciones
public static boolean validardni(String dni){
    return dni.matches("{0-9}(1,8)");
}
\*

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txthistoriac = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnomape = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtantecedentes = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPaciente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtresultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registro de los pacientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Historia Clínica");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Nombres y apellidos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Edad");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Sexo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("DNI");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Antecedentes");

        txtnomape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomapeActionPerformed(evt);
            }
        });

        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevo.setText("Nuevo");
        btnnuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnuevoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnnuevoMouseReleased(evt);
            }
        });
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnregistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnregistrar.setText("Registar");
        btnregistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnregistrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnregistrarMouseReleased(evt);
            }
        });
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(255, 255, 255));
        btneditar.setText("Editar");
        btneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btneditarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btneditarMouseReleased(evt);
            }
        });
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btncerrar.setBackground(new java.awt.Color(255, 255, 255));
        btncerrar.setText("Cerrar");
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncerrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btncerrarMouseReleased(evt);
            }
        });
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txthistoriac, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnomape, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(txtedad))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtantecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthistoriac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnomape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtantecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnregistrar)
                    .addComponent(btneditar)
                    .addComponent(btncerrar))
                .addGap(34, 34, 34))
        );

        tPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tPaciente);

        txtresultado.setColumns(20);
        txtresultado.setRows(5);
        jScrollPane2.setViewportView(txtresultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas Buscar", "Buscar", JOptionPane.YES_NO_OPTION);
        if (msg == JOptionPane.YES_OPTION) {
            Paciente paci = pacicontroller.buscar(Integer.parseInt(this.txthistoriac.getText()));
            if (paci == null) {
                JOptionPane.showMessageDialog(this, "Registro no encontrado");
                txthistoriac.requestFocus();
            } else {
                this.txthistoriac.setText("" + paci.getHistclini());
                this.txtnomape.setText("" + paci.getNomape());
                this.txtedad.setText("" + paci.getEdad());
                this.txtsexo.setText("" + paci.getSexo());
                this.txtdni.setText("" + paci.getDni());
                this.txtantecedentes.setText("" + paci.getAntecepato()); //

            }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas Cerrar la ventana", "Cerrar", JOptionPane.YES_NO_OPTION);
        if (msg == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            txthistoriac.requestFocus();
        }
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas modificar el registro", "Modificar", JOptionPane.YES_NO_OPTION);
        if (msg == JOptionPane.YES_OPTION) {
            Paciente paci = pacicontroller.buscar(Integer.parseInt(txthistoriac.getText()));
            if (paci != null) {  //si pro es diferente de null

                //Modificadores
                paci.setNomape(this.txtnomape.getText());
                paci.setEdad(Integer.parseInt(this.txtedad.getText()));
                paci.setSexo(this.txtsexo.getText());
                paci.setDni(Integer.parseInt(this.txtdni.getText()));
                paci.setAntecepato(this.txtantecedentes.getText());

                //para actualizar se llama al metodo listar
                listar();

                pacicontroller.grabar();
                JOptionPane.showMessageDialog(this, "Registro actualizado satisfactoriamente");

            } else {
                JOptionPane.showMessageDialog(this, "Objeto no encontrado");
            }
        }

    }//GEN-LAST:event_btneditarActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas Registrar la información", "Registrar", JOptionPane.YES_NO_OPTION);
        if (msg == JOptionPane.YES_OPTION) {

            Paciente paci = new Paciente() {
            };
            paci.setHistclini(Integer.parseInt(this.txthistoriac.getText()));
            paci.setNomape(this.txtnomape.getText());
            paci.setEdad(Integer.parseInt(this.txtedad.getText()));
            paci.setSexo(this.txtsexo.getText());
            paci.setDni(Integer.parseInt(this.txtdni.getText()));
            paci.setAntecepato(this.txtantecedentes.getText());

            //Insertar el objeto al arreglo
            pacicontroller.add(paci);

            pacicontroller.grabar(); //METODO DE GRABAR en controller "semana 11"
            listar();

            int totalp = pacicontroller.getTotalP();
            txtresultado.append("La cantidad total de pacientes es: " + totalp + "\n");

            JOptionPane.showMessageDialog(this, "Datos registrados satisfactoriamente!!!");
            bloquear_controles();
            btneditar.setEnabled(true);  //habilitad el boton editar
        } else {
            txthistoriac.requestFocus();
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

//Tabla editable
    //Botones del programa

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        activar_controles();
        txthistoriac.setText("" + pacicontroller.getCorrelativo());
        limpiar();
        txtnomape.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txtnomapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomapeActionPerformed
    //metodo para editar sin boton
    private void tPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPacienteMouseClicked

    }//GEN-LAST:event_tPacienteMouseClicked

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
        if (!validarDNI(txtdni.getText().trim())) {
        }

    }

    public boolean validarDNI(String dni) {
        return dni.matches("[1-9](1,8)");

    }//GEN-LAST:event_txtdniActionPerformed

    private void btnnuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevoMousePressed
        btnnuevo.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnnuevoMousePressed

    private void btnnuevoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevoMouseReleased
        btnnuevo.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnnuevoMouseReleased

    private void btnregistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregistrarMousePressed
        btnregistrar.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnregistrarMousePressed

    private void btnregistrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregistrarMouseReleased
        btnregistrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnregistrarMouseReleased

    private void btneditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMousePressed
        btneditar.setBackground(Color.CYAN);
    }//GEN-LAST:event_btneditarMousePressed

    private void btneditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseReleased
        btneditar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btneditarMouseReleased

    private void btncerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMousePressed
        btncerrar.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btncerrarMousePressed

    private void btncerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseReleased
        btncerrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btncerrarMouseReleased

    public void limpiar() {

        this.txtnomape.setText("");
        this.txtedad.setText("");
        this.txtsexo.setText("");
        this.txtdni.setText("");
        this.txtantecedentes.setText("");

    }

    public void bloquear_controles() {
        btnnuevo.setEnabled(true);
        btnbuscar.setEnabled(true);

        btnregistrar.setEnabled(false);
        btneditar.setEnabled(false);
    }

    public void activar_controles() {
        btnnuevo.setEnabled(false);
        btnbuscar.setEnabled(true);

        btnregistrar.setEnabled(true);
        btneditar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tPaciente;
    private javax.swing.JTextField txtantecedentes;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txthistoriac;
    private javax.swing.JTextField txtnomape;
    private javax.swing.JTextArea txtresultado;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/fondoD.jpeg")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    

}
