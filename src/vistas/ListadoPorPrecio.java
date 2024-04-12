/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import entidades.Producto;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edulo
 */
public class ListadoPorPrecio extends javax.swing.JInternalFrame {

    private DefaultTableModel tp = new DefaultTableModel();
    TreeSet<Producto> productos;

    /**
     * Creates new form ListadoPorPrecio
     */
    public ListadoPorPrecio(TreeSet productos) {
        initComponents();

        tbFiltroPrecio.setModel(tp);
        this.productos = productos;
        tp.addColumn("Codigo");
        tp.addColumn("Descripcion");
        tp.addColumn("Precio");
        tp.addColumn("Stock");
    }

    public void limpiarTabla() {
        int filas = tp.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            tp.removeRow(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloPrecio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMinimo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaximo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFiltroPrecio = new javax.swing.JTable();

        setClosable(true);

        lblTituloPrecio.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblTituloPrecio.setText("Listado por precio");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setText("Entre $:");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setText("y");

        txtMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaximoKeyReleased(evt);
            }
        });

        tbFiltroPrecio.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tbFiltroPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripcion", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(tbFiltroPrecio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTituloPrecio)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPrecio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaximoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaximoKeyReleased
        // TODO add your handling code here:
        double minimo;
        double maximo;
        try {
            minimo = Double.parseDouble(txtMinimo.getText());
            maximo = Double.parseDouble(txtMaximo.getText());
        } catch (NumberFormatException e) {

            minimo = 0;
            maximo = 0;
            txtMaximo.setText("");
            txtMinimo.setText("");

        }
        
        boolean bandera = false;
        limpiarTabla();
        for (Producto p : productos) {
            if (minimo <= p.getPrecio() && maximo >= p.getPrecio()) {
                tp.addRow(new Object[]{p.getCodigo(), p.getRubro().getNombre(), p.getPrecio(), p.getStock()});
                bandera = true;
            }
            if (!bandera) {
                limpiarTabla();
            }
        }

    }//GEN-LAST:event_txtMaximoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloPrecio;
    private javax.swing.JTable tbFiltroPrecio;
    private javax.swing.JTextField txtMaximo;
    private javax.swing.JTextField txtMinimo;
    // End of variables declaration//GEN-END:variables
}
