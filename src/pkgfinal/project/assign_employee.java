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
public class assign_employee extends javax.swing.JInternalFrame {
    PreparedStatement statement;
    ResultSet result;
    Connection dbconnection;
    /**
     * Creates new form assign_employee
     */
    public assign_employee() {
        initComponents();
//        load_combo();
        tbload();
    }
    
    public void load_combo(){
    try{
        open_connection();
        String query_command = "SELECT CONCAT(employee_id, ' ',firstname) AS Employee FROM employees";
        statement = dbconnection.prepareStatement(query_command);
        java.sql.ResultSet result = statement.executeQuery(query_command);
        while(result.next()){
            cmb_position.addItem(result.getString("Employee" ));            
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

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_employee_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmb_position = new javax.swing.JComboBox<>();
        btn_assgin = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_all_buses = new javax.swing.JTable();

        setTitle("Assign Employee");

        jPanel2.setPreferredSize(new java.awt.Dimension(1018, 586));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel11.setText("ID");

        txt_employee_id.setEditable(false);
        txt_employee_id.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel9.setText("First Name");

        txt_firstname.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txt_firstname.setEnabled(false);
        txt_firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_firstnameKeyTyped(evt);
            }
        });

        txt_lastname.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txt_lastname.setEnabled(false);
        txt_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lastnameKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel12.setText("Last Name");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel10.setText("Position");

        cmb_position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Ticketing Staff", "Security Personne", "Maintenance Staffl", "Cleaning Crew", "Bus Driver", "Supervisor " }));
        cmb_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_positionActionPerformed(evt);
            }
        });

        btn_assgin.setBackground(new java.awt.Color(255, 51, 51));
        btn_assgin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btn_assgin.setForeground(new java.awt.Color(255, 255, 255));
        btn_assgin.setText("Assign");
        btn_assgin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_assginActionPerformed(evt);
            }
        });

        btn_search.setBackground(new java.awt.Color(23, 30, 77));
        btn_search.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        txt_search.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        tb_all_buses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Emp ID", "First Name", "Last Name", "Phone", "Age", "Sex", "Email", "Position"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel11)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_firstname)
                                    .addComponent(txt_lastname)
                                    .addComponent(cmb_position, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(323, 323, 323)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btn_search)
                                        .addGap(2, 2, 2)
                                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_assgin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_assgin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_search)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_position, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_all_busesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tb_all_busesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_all_busesAncestorAdded

    private void tb_all_busesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_all_busesMouseClicked
        // TODO add your handling code here:
        int selectedRow = tb_all_buses.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tb_all_buses.getModel();
            txt_employee_id.setText(model.getValueAt(selectedRow, 0).toString());
            txt_firstname.setText(model.getValueAt(selectedRow, 1).toString());
            txt_lastname.setText(model.getValueAt(selectedRow, 2).toString());
            
           
    }//GEN-LAST:event_tb_all_busesMouseClicked
    }
    private void tb_all_busesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tb_all_busesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_all_busesPropertyChange

    private void cmb_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_positionActionPerformed

    private void btn_assginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_assginActionPerformed
        // TODO add your handling code here:
        String employee_id = txt_employee_id.getText();
//        String employee = cmb_employees.getSelectedItem().toString();
        String position = cmb_position.getSelectedItem().toString();    
        try{
            open_connection();
            String query_command = "UPDATE employees SET position = ? WHERE employee_id = ?";
            statement = dbconnection.prepareStatement(query_command);           
            statement.setString(1, position);
            statement.setString(2, employee_id);
            
            int result = statement.executeUpdate();
                if(result == 1){
                    JOptionPane.showMessageDialog(null, "Employee Position Asign Sucessfull");
                    clear_fields();
//                    load_combo();
                    tbload();
                }else{
                    JOptionPane.showMessageDialog(null, "Unable To Asign Employee Position");
                    clear_fields();
                }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error" +ex);
        }finally{
            close_connection();
        }
    }//GEN-LAST:event_btn_assginActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        search_data();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchKeyTyped

    private void txt_lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastnameKeyTyped

    private void txt_firstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameKeyTyped

    
    public void search_data(){
        String search = txt_search.getText();  
    try{
        open_connection();
        
        DefaultTableModel table_data = (DefaultTableModel) tb_all_buses.getModel();        
        table_data.setRowCount(0);
        String query_command = "SELECT * FROM employees WHERE employee_id LIKE '%" +search+ "%' OR firstname LIKE '%" +search+ "%' OR lastname LIKE '%" +search+ "%' OR position LIKE '%" +search+ "%' OR sex LIKE '%" +search+ "%' OR phone LIKE '%" +search+ "%' OR email LIKE '%" +search+ "%'   ";
                
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
            v.add(result.getString(8));
            
            table_data.addRow(v);
    }
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error"  + ex);
    }finally{
        close_connection();
    }
    }
    // function for clearning fields 
    public void clear_fields(){      
        txt_firstname.setText("");
        txt_lastname.setText("");
        cmb_position.setSelectedIndex(-1);
        
    }
    
    public void tbload(){
    
    try{
        open_connection();
        
        DefaultTableModel table_data = (DefaultTableModel) tb_all_buses.getModel();        
        table_data.setRowCount(0);
        String query_command = "SELECT employee_id, firstname, lastname, phone, age, sex, email, position FROM `employees` ";        
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
            v.add(result.getString(8));
            
            table_data.addRow(v);
    }
        
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null, "Error"  + ex);
    }finally{
        close_connection();
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_assgin;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cmb_position;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_all_buses;
    private javax.swing.JTextField txt_employee_id;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
