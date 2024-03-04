/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author okyere
 */
public class admin_dashboard extends javax.swing.JFrame {

    /**
     * Creates new form admin_dashboard
     */
    
    String admin_user;
    public admin_dashboard() {
        initComponents();
    }
    
    public admin_dashboard(String auser){
        this.admin_user = auser;
        initComponents();
        String getValue = jLabel1.getText();
        jLabel1.setText(getValue + " : " + auser);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        show_tabs = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        tab_all_busses = new javax.swing.JMenuItem();
        tab_add_bus = new javax.swing.JMenuItem();
        tab_delete_bus = new javax.swing.JMenuItem();
        tab_edit_bus = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome:");

        javax.swing.GroupLayout show_tabsLayout = new javax.swing.GroupLayout(show_tabs);
        show_tabs.setLayout(show_tabsLayout);
        show_tabsLayout.setHorizontalGroup(
            show_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        show_tabsLayout.setVerticalGroup(
            show_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        jMenu1.setText("Manage Bus");

        tab_all_busses.setText("All Buses");
        tab_all_busses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_all_bussesActionPerformed(evt);
            }
        });
        jMenu1.add(tab_all_busses);

        tab_add_bus.setText("Add Bus ");
        tab_add_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_add_busActionPerformed(evt);
            }
        });
        jMenu1.add(tab_add_bus);

        tab_delete_bus.setText("Delete Bus ");
        tab_delete_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_delete_busActionPerformed(evt);
            }
        });
        jMenu1.add(tab_delete_bus);

        tab_edit_bus.setText("Edit Bus Details");
        tab_edit_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_edit_busActionPerformed(evt);
            }
        });
        jMenu1.add(tab_edit_bus);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Bus Fare");

        jMenuItem7.setText("Add Bus Fare");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Edit Bus Fare");
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Employess");

        jMenuItem9.setText("Add Employee");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Edit Employee Details");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Delete Employee");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("All Employees");
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Manage Admin");

        jMenuItem13.setText("Add Admin");
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Edit Admin");
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Bus Time");

        jMenuItem15.setText("Add Bus Time");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Edit Bus Time");
        jMenu5.add(jMenuItem16);

        jMenuItem17.setText("Delete But Time");
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("All Bus Time");
        jMenu5.add(jMenuItem18);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(865, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(show_tabs))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_all_bussesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_all_bussesActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_tab_all_bussesActionPerformed

    private void tab_delete_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_delete_busActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_delete_busActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void tab_add_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_add_busActionPerformed
        // TODO add your handling code here:
        add_bus_details addbus_view = new add_bus_details();
        show_tabs.add(addbus_view);
        addbus_view.show();
    }//GEN-LAST:event_tab_add_busActionPerformed

    private void tab_edit_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_edit_busActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_edit_busActionPerformed

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
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JDesktopPane show_tabs;
    private javax.swing.JMenuItem tab_add_bus;
    private javax.swing.JMenuItem tab_all_busses;
    private javax.swing.JMenuItem tab_delete_bus;
    private javax.swing.JMenuItem tab_edit_bus;
    // End of variables declaration//GEN-END:variables
}
