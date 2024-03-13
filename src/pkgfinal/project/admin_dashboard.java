/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
public class admin_dashboard extends javax.swing.JFrame {
    PreparedStatement statement;
    ResultSet result;
    Connection dbconnection;
    /**
     * Creates new form admin_dashboard
     */
    
    String admin_user;
    public admin_dashboard() {
        initComponents();
        booked_lable();
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
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        show_tabs = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3jhv = new javax.swing.JLabel();
        jLabel3jhv2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3jhv3 = new javax.swing.JLabel();
        jLabel3jhv4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3jhv5 = new javax.swing.JLabel();
        jLabel3jhv6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3jhv8 = new javax.swing.JLabel();
        llb_booked_ticket = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel3jhv10 = new javax.swing.JLabel();
        jLabel3jhv11 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel3jhv12 = new javax.swing.JLabel();
        jLabel3jhv13 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        tab_all_busses = new javax.swing.JMenuItem();
        tab_add_bus = new javax.swing.JMenuItem();
        tab_delete_bus = new javax.swing.JMenuItem();
        tab_edit_bus = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        tab_add_employee = new javax.swing.JMenuItem();
        tab_edit_employee = new javax.swing.JMenuItem();
        tab_delete_employee = new javax.swing.JMenuItem();
        tab_all_employees = new javax.swing.JMenuItem();
        tab_assign = new javax.swing.JMenuItem();
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

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome:");

        show_tabs.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3jhv.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3jhv.setText("Employees");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3jhv)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3jhv)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3jhv2.setFont(new java.awt.Font("Helvetica Neue", 1, 80)); // NOI18N
        jLabel3jhv2.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3jhv2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3jhv2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(258, 196));

        jLabel3jhv3.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3jhv3.setText(" Passengers ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel3jhv3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3jhv3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3jhv4.setFont(new java.awt.Font("Helvetica Neue", 1, 80)); // NOI18N
        jLabel3jhv4.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3jhv4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3jhv4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3jhv5.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3jhv5.setText("Cancelled");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel3jhv5)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3jhv5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3jhv6.setFont(new java.awt.Font("Helvetica Neue", 1, 80)); // NOI18N
        jLabel3jhv6.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3jhv6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3jhv6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3jhv8.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3jhv8.setText("Booked Tickets");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3jhv8)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3jhv8)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        llb_booked_ticket.setFont(new java.awt.Font("Helvetica Neue", 1, 80)); // NOI18N
        llb_booked_ticket.setText("0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(llb_booked_ticket)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(llb_booked_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3jhv10.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3jhv10.setText("Number of Employees ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3jhv10)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3jhv10)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3jhv11.setFont(new java.awt.Font("Helvetica Neue", 1, 80)); // NOI18N
        jLabel3jhv11.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3jhv11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3jhv11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3jhv12.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3jhv12.setText("Number of Employees ");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3jhv12)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3jhv12)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3jhv13.setFont(new java.awt.Font("Helvetica Neue", 1, 80)); // NOI18N
        jLabel3jhv13.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3jhv13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3jhv13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        show_tabs.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        show_tabs.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        show_tabs.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        show_tabs.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        show_tabs.setLayer(jPanel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        show_tabs.setLayer(jPanel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        show_tabs.setLayer(jPanel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout show_tabsLayout = new javax.swing.GroupLayout(show_tabs);
        show_tabs.setLayout(show_tabsLayout);
        show_tabsLayout.setHorizontalGroup(
            show_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_tabsLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(show_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(show_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(show_tabsLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(show_tabsLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        show_tabsLayout.setVerticalGroup(
            show_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(show_tabsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(show_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(show_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        btn_close.setText("close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

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

        jMenu3.setText("Employees");

        tab_add_employee.setText("Add Employee");
        tab_add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_add_employeeActionPerformed(evt);
            }
        });
        jMenu3.add(tab_add_employee);

        tab_edit_employee.setText("Edit Employee Details");
        tab_edit_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_edit_employeeActionPerformed(evt);
            }
        });
        jMenu3.add(tab_edit_employee);

        tab_delete_employee.setText("Delete Employee");
        tab_delete_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_delete_employeeActionPerformed(evt);
            }
        });
        jMenu3.add(tab_delete_employee);

        tab_all_employees.setText("All Employees");
        tab_all_employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_all_employeesActionPerformed(evt);
            }
        });
        jMenu3.add(tab_all_employees);

        tab_assign.setText("Assign Employee");
        tab_assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_assignActionPerformed(evt);
            }
        });
        jMenu3.add(tab_assign);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Manage Admin");

        jMenuItem13.setText("Add Admin");
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Edit Admin");
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Bookings");

        jMenuItem15.setText("All Bookings");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Add Bookings");
        jMenu5.add(jMenuItem16);

        jMenuItem17.setText("Delete Bookings");
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("Modify Bookings");
        jMenu5.add(jMenuItem18);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(show_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_close))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_all_bussesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_all_bussesActionPerformed
        // TODO add your handling code here:        
        all_bus_details all_bus_view = new all_bus_details();
        show_tabs.add(all_bus_view);
        all_bus_view.show();
        
        
        
    }//GEN-LAST:event_tab_all_bussesActionPerformed

    private void tab_delete_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_delete_busActionPerformed
        // TODO add your handling code here:        
        delete_bus delete_view = new delete_bus();
        show_tabs.add(delete_view);
        delete_view.show();
    }//GEN-LAST:event_tab_delete_busActionPerformed

    private void tab_add_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_add_busActionPerformed
        // TODO add your handling code here:
 
        add_bus_details addbus_view = new add_bus_details();
        show_tabs.add(addbus_view);
        addbus_view.show();
    }//GEN-LAST:event_tab_add_busActionPerformed

    private void tab_edit_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_edit_busActionPerformed
        // TODO add your handling code here:
        edit_bus delete_view = new edit_bus();
        show_tabs.add(delete_view);
        delete_view.show();
    }//GEN-LAST:event_tab_edit_busActionPerformed

    private void tab_add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_add_employeeActionPerformed
        // TODO add your handling code here:
        add_employee add_employee_view = new add_employee();
        show_tabs.add(add_employee_view);
        add_employee_view.show();
    }//GEN-LAST:event_tab_add_employeeActionPerformed

    private void tab_edit_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_edit_employeeActionPerformed
        // TODO add your handling code here:
        edit_employee edit_employee_view = new edit_employee();
        show_tabs.add(edit_employee_view);
        edit_employee_view.show();
    }//GEN-LAST:event_tab_edit_employeeActionPerformed

    private void tab_delete_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_delete_employeeActionPerformed
        // TODO add your handling code here:
        delete_employee delete_employee_view = new delete_employee();
        show_tabs.add(delete_employee_view);
        delete_employee_view.show();
    }//GEN-LAST:event_tab_delete_employeeActionPerformed

    private void tab_all_employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_all_employeesActionPerformed
        // TODO add your handling code here:
        all_employees_details all_employee_view = new all_employees_details();
        show_tabs.add(all_employee_view);
        all_employee_view.show();
    }//GEN-LAST:event_tab_all_employeesActionPerformed

    private void tab_assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_assignActionPerformed
        // TODO add your handling code here:
        assign_employee assign_employee_view = new assign_employee();
        show_tabs.add(assign_employee_view);
        assign_employee_view.show();
    }//GEN-LAST:event_tab_assignActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        dispose();
        dashboard_view();
    }//GEN-LAST:event_btn_closeActionPerformed

    public void dashboard_view(){        
        admin_dashboard admin_view = new admin_dashboard();
        admin_view.setLocationRelativeTo(null);
        admin_view.setVisible(true);
    }
    
    public void booked_lable(){
        try{
            open_connection();
            String query_command = "SELECT COUNT(employee_id) FROM employees";
            statement = dbconnection.prepareStatement(query_command);               
            java.sql.ResultSet result = statement.executeQuery(query_command);
                        
          if (result.next()) {
                // Retrieve data from the result set
                String data = result.getString("COUNT(employee_id)");

                // Set the retrieved data to the label
                llb_booked_ticket.setText(data);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error" +ex);
        }
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3jhv;
    private javax.swing.JLabel jLabel3jhv10;
    private javax.swing.JLabel jLabel3jhv11;
    private javax.swing.JLabel jLabel3jhv12;
    private javax.swing.JLabel jLabel3jhv13;
    private javax.swing.JLabel jLabel3jhv2;
    private javax.swing.JLabel jLabel3jhv3;
    private javax.swing.JLabel jLabel3jhv4;
    private javax.swing.JLabel jLabel3jhv5;
    private javax.swing.JLabel jLabel3jhv6;
    private javax.swing.JLabel jLabel3jhv8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel llb_booked_ticket;
    private javax.swing.JDesktopPane show_tabs;
    private javax.swing.JMenuItem tab_add_bus;
    private javax.swing.JMenuItem tab_add_employee;
    private javax.swing.JMenuItem tab_all_busses;
    private javax.swing.JMenuItem tab_all_employees;
    private javax.swing.JMenuItem tab_assign;
    private javax.swing.JMenuItem tab_delete_bus;
    private javax.swing.JMenuItem tab_delete_employee;
    private javax.swing.JMenuItem tab_edit_bus;
    private javax.swing.JMenuItem tab_edit_employee;
    // End of variables declaration//GEN-END:variables
}
