package vista;

import controlador.Item;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ArchivoItem;

public class Main extends javax.swing.JFrame {
    
    ArchivoItem ai = new ArchivoItem();
    DefaultTableModel inventario; //Creamos list model default
    Vector vCabeceras = new Vector();

    public Main() {
        initComponents();
        inventario = new DefaultTableModel(); //Instanciamos el table model
        tblInv.setModel(inventario);        //Asignamos el table model al tbl del jswing
        
        setLocationRelativeTo(null); //CENTRAR VENTANA
        
        vCabeceras.addElement("Codigo");
        vCabeceras.addElement("Nombre");
        vCabeceras.addElement("Marca");
        vCabeceras.addElement("Categoria");
        vCabeceras.addElement("Stock");
        vCabeceras.addElement("Estado");
        vCabeceras.addElement("Ubicacion");
        vCabeceras.addElement("Fecha");
        
        inventario = new DefaultTableModel(vCabeceras, 0);
        
        tblInv.setModel(inventario);
        refresh();
    }
    
    public void refresh(){
        tblInv.setModel(ai.mostrarInv());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInventario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInv = new javax.swing.JTable();
        pnlFiltro = new javax.swing.JPanel();
        menuGnral = new javax.swing.JMenuBar();
        menuRegistros = new javax.swing.JMenu();
        itemNuevo = new javax.swing.JMenuItem();
        itemExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemModificar = new javax.swing.JMenuItem();
        itemUpdate = new javax.swing.JMenuItem();
        itemDelete = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        itemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventario"));
        pnlInventario.setToolTipText("");

        tblInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Categoria", "Stock", "Estado", "Ubicacion", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInv);

        javax.swing.GroupLayout pnlInventarioLayout = new javax.swing.GroupLayout(pnlInventario);
        pnlInventario.setLayout(pnlInventarioLayout);
        pnlInventarioLayout.setHorizontalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
        );
        pnlInventarioLayout.setVerticalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pnlFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar"));

        javax.swing.GroupLayout pnlFiltroLayout = new javax.swing.GroupLayout(pnlFiltro);
        pnlFiltro.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        menuRegistros.setText("Registros");

        itemNuevo.setText("Nuevo");
        itemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoActionPerformed(evt);
            }
        });
        menuRegistros.add(itemNuevo);

        itemExit.setText("Salir");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        menuRegistros.add(itemExit);

        menuGnral.add(menuRegistros);

        jMenu1.setText("Editar");

        itemModificar.setText("Modificar");
        itemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModificarActionPerformed(evt);
            }
        });
        jMenu1.add(itemModificar);

        itemUpdate.setText("Actualizar Stock");
        itemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdateActionPerformed(evt);
            }
        });
        jMenu1.add(itemUpdate);

        itemDelete.setText("Eliminar");
        itemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeleteActionPerformed(evt);
            }
        });
        jMenu1.add(itemDelete);

        menuGnral.add(jMenu1);

        menuHelp.setText("Ayuda");

        itemAbout.setText("Acerca de");
        menuHelp.add(itemAbout);

        menuGnral.add(menuHelp);

        setJMenuBar(menuGnral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoActionPerformed
        new FormItem(this,true,false,null).setVisible(true);
        refresh();
        
    }//GEN-LAST:event_itemNuevoActionPerformed

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemExitActionPerformed

    private void itemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeleteActionPerformed
        
        int column = 0;
        int row = tblInv.getSelectedRow();
        String value = tblInv.getModel().getValueAt(row, column).toString();
        
        Item i = new Item();
        i.eliminarItem(value);
        refresh();
        //new deleteItem(value).setVisible(true);
    }//GEN-LAST:event_itemDeleteActionPerformed

    private void itemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModificarActionPerformed
        
        String item[] = new String[8];
        
        for(int i=0;i<item.length;i++){
            int column=i;
            int row = tblInv.getSelectedRow();
            item[i] = tblInv.getModel().getValueAt(row, column).toString();
        }
        
        new FormItem(this,true,true,item).setVisible(true);
        refresh();
    }//GEN-LAST:event_itemModificarActionPerformed

    private void itemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdateActionPerformed
        
        int row = tblInv.getSelectedRow();
        String stock = tblInv.getModel().getValueAt(row, 4).toString();
        String value = tblInv.getModel().getValueAt(row, 0).toString();
        
        new FormStock(this, rootPaneCheckingEnabled, value, Integer.parseInt(stock)).setVisible(true);
        
        
    }//GEN-LAST:event_itemUpdateActionPerformed

    public static void main(String args[]) {
        /* Set the Windows look and feel */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAbout;
    private javax.swing.JMenuItem itemDelete;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemModificar;
    private javax.swing.JMenuItem itemNuevo;
    private javax.swing.JMenuItem itemUpdate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuGnral;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuRegistros;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JTable tblInv;
    // End of variables declaration//GEN-END:variables
}
