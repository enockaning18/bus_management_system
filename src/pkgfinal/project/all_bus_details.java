/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pkgfinal.project;

import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author okyere
 */
public class all_bus_details extends javax.swing.JInternalFrame {
    PreparedStatement statement;
    ResultSet result;
    Connection dbconnection;

    /**
     * Creates new form all_bus_details
     */
    public all_bus_details() {
        initComponents();
        tbload();
    }
    
    public void tbload(){
    
    try{
        open_connection();
        
        DefaultTableModel table_data = (DefaultTableModel) tb_all_buses.getModel();
        
        table_data.setRowCount(0);
        String query_command = "SELECT `bus_number`, `bus_source`, `bus_destination`, `price`, `time`, `seat` FROM `buses` ";
        
        statement = dbconnection.prepareStatement(query_command);

        
        java.sql.ResultSet result = statement.executeQuery(query_command);
        
        while(result.next()){
            Vector v = new Vector();
            v.add(result.getString(1));
            v.add(result.getString(2));
            v.add(result.getString(3));
            v.add(result.getString(4));
            v.add(result.getString(5));
            v.add(result.getString(6));
            
            table_data.addRow(v);
    }
        
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null, "Error"  + ex);
    }finally{
        close_connection();
    }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // function for opening database connection
    public void open_connection(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            String databaseUrl = "jdbc:mysql://localhost/busmanagementsystem";
            dbconnection = DriverManager.getConnection(databaseUrl, "root", "");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error" +ex);
        }
        
    }
    
    //function for closing database connection
    public void close_connection(){
        try{
            dbconnection.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error"  + ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_all_buses = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("All Bus Details");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1006, 522));
        jPanel1.setSize(new java.awt.Dimension(1006, 522));

        tb_all_buses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Bus Number", "Bus Scource ", "Bus Destination", "Bus Price", "Bus Time", "Bus Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_all_buses.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tb_all_busesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tb_all_buses.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tb_all_busesPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tb_all_buses);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_all_busesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tb_all_busesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_all_busesPropertyChange

    private void tb_all_busesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tb_all_busesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_all_busesAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_all_buses;
    // End of variables declaration//GEN-END:variables
}
