
package vistas;

import entidades.Producto;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;


public class ListadoPorNombre extends javax.swing.JInternalFrame {

    //Atributos
    TreeSet<Producto> productos = new TreeSet<>();
    private DefaultTableModel tn = new DefaultTableModel();
    
    public ListadoPorNombre( TreeSet<Producto> productos ) {
        initComponents();
        this.productos = productos;
        
        tbFiltroNombre.setModel(tn);
        tn.addColumn("Codigo");
        tn.addColumn("Descripcion");
        tn.addColumn("Precio");
        tn.addColumn("Stock");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListadoNombre = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtBusquedaNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFiltroNombre = new javax.swing.JTable();

        setClosable(true);

        lblListadoNombre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblListadoNombre.setText("Listado por nombre");

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNombre.setText("Escriba los primeros caracteres");

        txtBusquedaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaNombreKeyReleased(evt);
            }
        });

        tbFiltroNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(tbFiltroNombre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusquedaNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblListadoNombre)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblListadoNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtBusquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaNombreKeyReleased
        // TODO add your handling code here:
        limpiarTabla();
        String txt = txtBusquedaNombre.getText().toLowerCase();
        for (Producto p : productos) {
            if ( p.getDescripcion().toLowerCase().startsWith(txt)) {
                 tn.addRow(new Object[]{p.getCodigo(), p.getDescripcion(), p.getPrecio(), p.getStock()});
            }
        }
        
        
    }//GEN-LAST:event_txtBusquedaNombreKeyReleased

    
    public void limpiarTabla() {
        int filas = tn.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            tn.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListadoNombre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tbFiltroNombre;
    private javax.swing.JTextField txtBusquedaNombre;
    // End of variables declaration//GEN-END:variables
}
