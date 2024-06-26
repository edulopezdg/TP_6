package vistas;

import entidades.Producto;
import entidades.Rubro;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

public class ListadoPorRubro extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos = new TreeSet<>();
        Rubro seleccion = new Rubro(4, "Seleccione uno");
    
    private DefaultTableModel tr = new DefaultTableModel();
    
    public ListadoPorRubro(TreeSet<Producto> productos) {
        initComponents();
        llenarCombo();
        this.productos = productos;
        jTable1.setModel(tr);
        tr.addColumn("Codigo");
        tr.addColumn("Descripcion");
        tr.addColumn("Precio");
        tr.addColumn("Stock");
        
        
        

    }

    private void llenarCombo() {

        Rubro comestible = new Rubro(1, "Comestible");
        Rubro limpieza = new Rubro(2, "Limpieza");
        Rubro perfumeria = new Rubro(3, "Perfumeria");
        
        cbRubros.addItem(seleccion);
        cbRubros.addItem(comestible);
        cbRubros.addItem(limpieza);
        cbRubros.addItem(perfumeria);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFiltroRubro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbRubros = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        lblFiltroRubro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFiltroRubro.setText("Listado de productos por rubro");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setText("Elija rubro: ");

        cbRubros.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cbRubros.setSelectedIndex(-1);
        cbRubros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRubrosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbRubros, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFiltroRubro)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblFiltroRubro)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbRubros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRubrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRubrosActionPerformed
        // TODO add your handling code here:
        limpiarTabla();      
        
        for (Producto producto : productos) {
            if (cbRubros.getSelectedItem().toString().equals(producto.getRubro().getNombre())) {
                 tr.addRow(new Object[]{producto.getCodigo(), producto.getDescripcion(), producto.getPrecio(), producto.getStock()});
                 cbRubros.removeItem(seleccion);
            }
            
        }
      
    }//GEN-LAST:event_cbRubrosActionPerformed

    public void limpiarTabla() {
        int filas = tr.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            tr.removeRow(i);
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Rubro> cbRubros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFiltroRubro;
    // End of variables declaration//GEN-END:variables
}
