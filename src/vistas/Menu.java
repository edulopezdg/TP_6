package vistas;

import entidades.Producto;
import entidades.Rubro;
import java.util.ArrayList;
import java.util.TreeSet;

public class Menu extends javax.swing.JFrame {
    
    private TreeSet<Producto> productos = new TreeSet<>();

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        Rubro Comestible = new Rubro(1, "Comestible");
        Rubro Limpieza = new Rubro(2, "Limpieza");
        Rubro Perfumeria = new Rubro(3, "Perfumeria");
        
        productos.add(new Producto(1, "Aceite de Girasol 1L", 180.0, Comestible, 50));
        productos.add(new Producto(2, "Shampoo Sedal 400ml", 220.0, Perfumeria, 30));
        productos.add(new Producto(3, "Detergente Ala 500ml", 150.0, Limpieza, 40));
        productos.add(new Producto(4, "Azúcar 1kg", 100.0, Comestible, 60));
        productos.add(new Producto(5, "Desodorante Rexona 150ml", 260.0, Perfumeria, 20));
        productos.add(new Producto(6, "Lavandina Ayudín 1L", 100.0, Limpieza, 45));
        productos.add(new Producto(7, "Arroz 1kg", 110.0, Comestible, 55));
        productos.add(new Producto(8, "Crema Dental Colgate 90g", 160.0, Perfumeria, 25));
        productos.add(new Producto(9, "Limpiador en Gel Cif 500ml", 140.0, Limpieza, 35));
        productos.add(new Producto(10, "Fideos Spaghetti 500g", 80.0, Comestible, 70));
        productos.add(new Producto(11, "Perfume Adidas 100ml", 900.0, Perfumeria, 15));
        productos.add(new Producto(12, "Jabón en Barra Ala 150g", 60.0, Limpieza, 50));
        productos.add(new Producto(13, "Leche Entera 1L", 130.0, Comestible, 40));
        productos.add(new Producto(14, "Acondicionador Sedal 300ml", 200.0, Perfumeria, 30));
        productos.add(new Producto(15, "Limpiahogar Mr. Músculo 500ml", 180.0, Limpieza, 35));
        productos.add(new Producto(16, "Yogur Frutado 250g", 60.0, Comestible, 50));
        productos.add(new Producto(17, "Jabón Líquido para Manos Palmolive 250ml", 120.0, Perfumeria, 40));
        productos.add(new Producto(18, "Desinfectante Lysoform 500ml", 220.0, Limpieza, 30));
        productos.add(new Producto(19, "Pan de Molde 500g", 100.0, Comestible, 60));
        productos.add(new Producto(20, "Colonial 250g", 170.0, Perfumeria, 25));
        productos.add(new Producto(21, "Café Molido 250g", 150.0, Comestible, 45));
        productos.add(new Producto(22, "Jabón Líquido para Ropa Skip 1L", 280.0, Limpieza, 20));
        productos.add(new Producto(23, "Té Negro 25 Saquitos", 90.0, Comestible, 50));
        productos.add(new Producto(24, "Acondicionador Pantene 300ml", 220.0, Perfumeria, 30));
        productos.add(new Producto(25, "Limpiador de Baño Vim 500ml", 170.0, Limpieza, 35));
        productos.add(new Producto(26, "Agua Mineral 2L", 70.0, Comestible, 40));
        productos.add(new Producto(27, "Desodorante Nivea 150ml", 240.0, Perfumeria, 25));
        productos.add(new Producto(28, "Detergente en Polvo Cif 800g", 200.0, Limpieza, 30));
        productos.add(new Producto(29, "Lechuga Crespa", 80.0, Comestible, 55));
        productos.add(new Producto(30, "Crema para Manos Neutrogena 75g", 190.0, Perfumeria, 20));
        productos.add(new Producto(31, "Limpiavidrios Glassex 500ml", 130.0, Limpieza, 40));
        productos.add(new Producto(32, "Mermelada de Frutilla 450g", 120.0, Comestible, 35));
        productos.add(new Producto(33, "Perfume Carolina Herrera 100ml", 1500.0, Perfumeria, 15));
        productos.add(new Producto(34, "Pañuelos de Papel Kleenex 6 unidades", 180.0, Limpieza, 25));
        productos.add(new Producto(35, "Queso Cremoso 200g", 200.0, Comestible, 30));
        productos.add(new Producto(36, "Colonia Natura 100ml", 500.0, Perfumeria, 10));
        productos.add(new Producto(37, "Desengrasante Sapolio 500ml", 150.0, Limpieza, 30));
        productos.add(new Producto(38, "Tomate Perita por Kg", 100.0, Comestible, 45));
        productos.add(new Producto(39, "Gel de Ducha Dove 400ml", 280.0, Perfumeria, 20));
        productos.add(new Producto(40, "Limpia Pisos Magistral 1L", 200.0, Limpieza, 25));
        productos.add(new Producto(41, "Mermelada de Durazno 450g", 130.0, Comestible, 35));
        productos.add(new Producto(42, "Agua de Colonia Nenuco 200ml", 350.0, Perfumeria, 15));
        productos.add(new Producto(43, "Desodorante de Ambientes Glade 360ml", 220.0, Limpieza, 30));
        productos.add(new Producto(44, "Manzana Roja por Kg", 120.0, Comestible, 40));
        productos.add(new Producto(45, "Shampoo Head & Shoulders 400ml", 250.0, Perfumeria, 25));
        productos.add(new Producto(46, "Lavandina Off 1L", 80.0, Limpieza, 50));
        productos.add(new Producto(47, "Batata por Kg", 90.0, Comestible, 55));
        productos.add(new Producto(48, "Loción Corporal Nivea 400ml", 280.0, Perfumeria, 20));
        productos.add(new Producto(49, "Insecticida Raid 300ml", 180.0, Limpieza, 35));
        productos.add(new Producto(50, "Cebolla por Kg", 80.0, Comestible, 60));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jmMenuGeneral = new javax.swing.JMenuBar();
        jmAdministracion = new javax.swing.JMenu();
        jmiProductos = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiRubro = new javax.swing.JMenuItem();
        jmiNombre = new javax.swing.JMenuItem();
        jmiPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setSize(new java.awt.Dimension(500, 400));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1031, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );

        jmAdministracion.setText("Administración");

        jmiProductos.setText("Productos");
        jmiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductosActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiProductos);

        jmMenuGeneral.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmiRubro.setText("Por Rubro");
        jmiRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRubroActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiRubro);

        jmiNombre.setText("Por Nombre");
        jmConsultas.add(jmiNombre);

        jmiPrecio.setText("Por Precio");
        jmiPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrecioActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiPrecio);

        jmMenuGeneral.add(jmConsultas);

        setJMenuBar(jmMenuGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        gestionDeProductos gdp = new gestionDeProductos(productos);
        gdp.setVisible(true);
        escritorio.add(gdp);
        

    }//GEN-LAST:event_jmiProductosActionPerformed

    private void jmiPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrecioActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ListadoPorPrecio lpp = new ListadoPorPrecio(productos);
        lpp.setVisible(true);
        escritorio.add(lpp);
    }//GEN-LAST:event_jmiPrecioActionPerformed

    private void jmiRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRubroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ListadoPorRubro lpr = new ListadoPorRubro(productos);
        lpr.setVisible(true);
        escritorio.add(lpr);
    }//GEN-LAST:event_jmiRubroActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuBar jmMenuGeneral;
    private javax.swing.JMenuItem jmiNombre;
    private javax.swing.JMenuItem jmiPrecio;
    private javax.swing.JMenuItem jmiProductos;
    private javax.swing.JMenuItem jmiRubro;
    // End of variables declaration//GEN-END:variables
}
