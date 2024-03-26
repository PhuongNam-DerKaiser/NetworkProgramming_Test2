/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_kiem_tra_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DerKaiser
 */
public class frmAuthentication extends javax.swing.JFrame {

    /**
     * Creates new form frmAuthentication
     */
    private String fullName;
    private boolean authentication;
    public frmAuthentication(String fullName, boolean authentication) {
        initComponents();
        this.fullName = fullName;
        lb_fullName.setText(fullName); 
        this.authentication = authentication;
        if(authentication == true){
            lb_authentication.setText("Admin");
        }else{
          lb_authentication.setText("Nhân viên bán hàng");
        }
    }

    private frmAuthentication() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb_authentication = new javax.swing.JLabel();
        lb_fullName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAdmin = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtSearch1 = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PHẦN MỀM QUẢN LÝ VĂN PHÒNG PHẨM");

        lb_authentication.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_authentication.setText("Chức vụ:");

        lb_fullName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_fullName.setText("Họ tên");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tbAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Thay đổi", "TÊN ĐẰNG NHẬP", "TÊN NHÂN VIÊN", "SỐ ĐIỆN THOẠI", "GIỚI TÍNH", "NGÀY SINH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAdmin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbAdminAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbAdmin);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nhân viên quản lý");

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSearch.png"))); // NOI18N

        txtSearch1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSearch1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSearch.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nhân viên");

        tbNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "THAY ĐỔI", "TÊN ĐẰNG NHẬP", "TÊN NHÂN VIÊN", "SỐ ĐIỆN THOẠI", "GIỚI TÍNH", "NGÀY SINH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbNV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(lb_authentication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch1))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack)
                    .addComponent(lb_fullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_authentication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DefaultTableModel nvList() {
        DefaultTableModel model = new DefaultTableModel() {
            // Override the getColumnClass method to specify the class of the "THAY ĐỔI" column
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 1 ? Boolean.class : super.getColumnClass(columnIndex);
            }
        };
        JTable table = new JTable(model);

        model.addColumn("STT");
        model.addColumn("THAY ĐỔI");
        model.addColumn("TÊN ĐĂNG NHẬP");
        model.addColumn("TÊN NHÂN VIÊN");
        model.addColumn("SỐ ĐIỆN THOẠI");
        model.addColumn("GIỚI TÍNH");
        model.addColumn("NGÀY SINH");

        Connection connection = Connect_Database.connect();
        if (connection != null) {
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery("SELECT TENDANGNHAP, TENNHANVIEN, SDT, GIOITINH, NGAYSINH FROM NHAN_VIEN WHERE LAQUANLY = 0");
                int count = 1;
                while (rs.next()) {    
                    String tendn = rs.getString("TENDANGNHAP");
                    String tennv = rs.getString("TENNHANVIEN");
                    String sdt = rs.getString("SDT");
                    String gioitinh = rs.getString("GIOITINH");
                    String ngaysinh = rs.getString("NGAYSINH");
                    model.addRow(new Object[]{count, Boolean.FALSE, tendn, tennv, sdt, gioitinh, ngaysinh});
                    count++;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                Connect_Database.close(connection);
            }
        }
        model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE && e.getColumn() == 1) {
                    // Lấy dòng và cột bị thay đổi
                    int row = e.getFirstRow();
                    int column = e.getColumn();

                    // Lấy giá trị mới của ô
                    Boolean newValue = (Boolean) model.getValueAt(row, column);

                    // Kiểm tra nếu giá trị là TRUE
                    if (newValue.equals(Boolean.TRUE)) {
                        String tendn = (String) model.getValueAt(row, 2); // Giả sử "TÊN ĐĂNG NHẬP" ở cột có chỉ số 2
                        int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thay đổi cho " + tendn + "?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
                        // Xử lý dựa trên lựa chọn của người dùng
                        if (option == JOptionPane.YES_OPTION) {
                            String adminPassword = JOptionPane.showInputDialog(null, "Nhập mật khẩu admin:", "Xác thực", JOptionPane.PLAIN_MESSAGE);
                            if (isValidAdminPassword(adminPassword)) {
                                changeEmployeePermission(tendn);
                            } else {
                                JOptionPane.showMessageDialog(null, "Mật khẩu admin không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            }
        });
        return model;
    }
    
    private boolean isValidAdminPassword(String password) {
        // Kết nối đến cơ sở dữ liệu và kiểm tra mật khẩu admin
        Connection connection = Connect_Database.connect();
        if (connection != null) {
            try {
                String query = "SELECT COUNT(*) FROM NHAN_VIEN WHERE TENNHANVIEN = ? AND MATKHAU = ?";
                try (PreparedStatement pst = connection.prepareStatement(query)) {
                    pst.setString(1, fullName);
                    pst.setString(2, password);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next() && rs.getInt(1) > 0) {
                        return true;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Connect_Database.close(connection);
            }
        }
        return false;
    }

    
        private void changeEmployeePermissionAD(String username) {
    // Kết nối đến cơ sở dữ liệu và thực hiện lệnh UPDATE
        Connection connection = Connect_Database.connect();
        if (connection != null) {
            try {
                String query = "UPDATE NHAN_VIEN SET LAQUANLY = 0 WHERE TENDANGNHAP = ?";
                try (PreparedStatement pst = connection.prepareStatement(query)) {
                    pst.setString(1, username);
                    pst.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Connect_Database.close(connection);
            }
        }
        loadDataTable();
    }
    
    private void changeEmployeePermission(String username) {
    // Kết nối đến cơ sở dữ liệu và thực hiện lệnh UPDATE
        Connection connection = Connect_Database.connect();
        if (connection != null) {
            try {
                String query = "UPDATE NHAN_VIEN SET LAQUANLY = 1 WHERE TENDANGNHAP = ?";
                try (PreparedStatement pst = connection.prepareStatement(query)) {
                    pst.setString(1, username);
                    pst.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Connect_Database.close(connection);
            }
        }
        loadDataTable();
    }
    
    public DefaultTableModel productList() {
        DefaultTableModel modelAD = new DefaultTableModel() {
            // Override the getColumnClass method to specify the class of the "THAY ĐỔI" column
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 1 ? Boolean.class : super.getColumnClass(columnIndex);
            }
        };
        JTable table = new JTable(modelAD);

        modelAD.addColumn("STT");
        modelAD.addColumn("THAY ĐỔI");
        modelAD.addColumn("TÊN ĐĂNG NHẬP");
        modelAD.addColumn("TÊN NHÂN VIÊN");
        modelAD.addColumn("SỐ ĐIỆN THOẠI");
        modelAD.addColumn("GIỚI TÍNH");
        modelAD.addColumn("NGÀY SINH");

        Connection connection = Connect_Database.connect();
        if (connection != null) {
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery("SELECT TENDANGNHAP, TENNHANVIEN, SDT, GIOITINH, NGAYSINH FROM NHAN_VIEN WHERE LAQUANLY = 1");
                int count = 1;
                while (rs.next()) {    
                    String tendn = rs.getString("TENDANGNHAP");
                    String tennv = rs.getString("TENNHANVIEN");
                    String sdt = rs.getString("SDT");
                    String gioitinh = rs.getString("GIOITINH");
                    String ngaysinh = rs.getString("NGAYSINH");
                    modelAD.addRow(new Object[]{count, Boolean.FALSE, tendn, tennv, sdt, gioitinh, ngaysinh});
                    count++;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                Connect_Database.close(connection);
            }
        }
        modelAD.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE && e.getColumn() == 1) {
                    // Lấy dòng và cột bị thay đổi
                    int row = e.getFirstRow();
                    int column = e.getColumn();

                    // Lấy giá trị mới của ô
                    Boolean newValue = (Boolean) modelAD.getValueAt(row, column);

                    // Kiểm tra nếu giá trị là TRUE
                    if (newValue.equals(Boolean.TRUE)) {
                        String tendn = (String) modelAD.getValueAt(row, 2);
                        int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thay đổi cho " + fullName + "?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
                        // Xử lý dựa trên lựa chọn của người dùng
                        if (option == JOptionPane.YES_OPTION) {
                            String adminPassword = JOptionPane.showInputDialog(null, "Nhập mật khẩu admin:", "Xác thực", JOptionPane.PLAIN_MESSAGE);
                            if (isValidAdminPassword(adminPassword)) {
                                changeEmployeePermissionAD(tendn);
                            } else {
                                JOptionPane.showMessageDialog(null, "Mật khẩu admin không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                                loadDataTable();
                            }
                        }
                    }
                }
            }
        });
        return modelAD;
    }
    
    public void loadDataTable() {
        DefaultTableModel modelAD = productList();
        tbAdmin.setModel(modelAD);
        DefaultTableModel model = nvList();
        tbNV.setModel(model);
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmMain frmMain = new frmMain(fullName, authentication);
        frmMain.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tbAdminAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbAdminAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbAdminAncestorAdded

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadDataTable();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAuthentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_authentication;
    private javax.swing.JLabel lb_fullName;
    private javax.swing.JTable tbAdmin;
    private javax.swing.JTable tbNV;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearch1;
    // End of variables declaration//GEN-END:variables
}
