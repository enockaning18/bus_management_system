/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pkgfinal.project;
import com.mysql.jdbc.ResultSet;
import java.sql.Statement;
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
public class edit_bus extends javax.swing.JInternalFrame {
PreparedStatement statement;
    ResultSet result;
    Connection dbconnection;
    /**
     * Creates new form edit_bus
     */
    public edit_bus() {
        initComponents();
        tbload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_all_buses = new javax.swing.JTable();
        btn_search = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        txt_seats = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_bus_destination = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_bus_number = new javax.swing.JTextField();
        txt_time = new javax.swing.JTextField();
        txt_bus_source = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3jhv = new javax.swing.JLabel();
        jLabelkk = new javax.swing.JLabel();
        txt_bus_id = new javax.swing.JTextField();

        setTitle("Edit Bus Details ");

        btn_clear.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        tb_all_buses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Bus ID", "Bus Number", "Bus Scource ", "Bus Destination", "Bus Price", "Bus Time", "Bus Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        tb_all_buses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_all_busesMouseClicked(evt);
            }
        });
        tb_all_buses.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tb_all_busesPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tb_all_buses);

        btn_search.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btn_update.setText("Edit");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        txt_seats.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        txt_price.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        txt_bus_destination.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel5.setText("Destination");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel9.setText("Price");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel6.setText("Seats");

        txt_bus_number.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        txt_time.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        txt_bus_source.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel4.setText("Source ");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel7.setText("Time");

        jLabel3jhv.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3jhv.setText("Bus No.");

        jLabelkk.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        jLabelkk.setText("Edit Bus Detials");

        txt_bus_id.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(889, Short.MAX_VALUE)
                .addComponent(txt_bus_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelkk)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3jhv)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_bus_number))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_bus_source, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(113, 113, 113)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel6))
                                    .addGap(74, 74, 74)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_bus_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(76, 76, 76)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txt_bus_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelkk)
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3jhv)
                                .addComponent(jLabel6)
                                .addComponent(txt_bus_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txt_bus_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txt_bus_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(145, 145, 145)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        clear_fields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void tb_all_busesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tb_all_busesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_all_busesAncestorAdded

    private void tb_all_busesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_all_busesMouseClicked
        // TODO add your handling code here:
        int selectedRow = tb_all_buses.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tb_all_buses.getModel();
            txt_bus_id.setText(model.getValueAt(selectedRow, 0).toString());
            txt_bus_number.setText(model.getValueAt(selectedRow, 1).toString());
            txt_bus_source.setText(model.getValueAt(selectedRow, 2).toString());
            txt_bus_destination.setText(model.getValueAt(selectedRow, 3).toString());
            txt_price.setText(model.getValueAt(selectedRow, 4).toString());
            txt_time.setText(model.getValueAt(selectedRow, 5).toString());
            txt_seats.setText(model.getValueAt(selectedRow, 6).toString());

    }//GEN-LAST:event_tb_all_busesMouseClicked
    }
    private void tb_all_busesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tb_all_busesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_all_busesPropertyChange

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String bus_id = txt_bus_id.getText();
        String bus_number = txt_bus_number.getText();
        String bus_source = txt_bus_source.getText();
        String bus_destination = txt_bus_destination.getText();
        String seats = txt_seats.getText();
        String price = txt_price.getText();
        String time = txt_time.getText();

        try{
            open_connection();
            String query_command = "UPDATE buses SET bus_number = ? , bus_source = ? , bus_destination = ? , seat = ? , price = ? , time = ? WHERE bus_id = '"+bus_id+"' ";
            statement = dbconnection.prepareStatement(query_command);
            statement.setString(1, bus_number);
            statement.setString(2, bus_source);          
            statement.setString(3, bus_destination);
            statement.setString(4, seats);
            statement.setString(5, price);
            statement.setString(6, time);

            int result = statement.executeUpdate();
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Bus Edit Successful");
                clear_fields();
                tbload();
            }else{
                JOptionPane.showMessageDialog(null, "Unable to Edit Bus");
                clear_fields();
                tbload();
            }
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null, "Error" +ex);
        }

    }//GEN-LAST:event_btn_updateActionPerformed

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
    
    // function for clearning fields 
    public void clear_fields(){
        txt_bus_number.setText("");
        txt_bus_source.setText("");
        txt_bus_destination.setText("");
        txt_price.setText("");
        txt_time.setText("");
        txt_seats.setText("");
    }
    
    public void tbload(){
    
    try{
        open_connection();
        
        DefaultTableModel table_data = (DefaultTableModel) tb_all_buses.getModel();        
        table_data.setRowCount(0);
        String query_command = "SELECT * FROM `buses` ";        
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
            v.add(result.getString(7));
            
            table_data.addRow(v);
    }
        
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null, "Error"  + ex);
    }finally{
        close_connection();
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel3jhv;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelkk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_all_buses;
    private javax.swing.JTextField txt_bus_destination;
    private javax.swing.JTextField txt_bus_id;
    private javax.swing.JTextField txt_bus_number;
    private javax.swing.JTextField txt_bus_source;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_seats;
    private javax.swing.JTextField txt_time;
    // End of variables declaration//GEN-END:variables
}