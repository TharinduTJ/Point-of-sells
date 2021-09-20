/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Update;

import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thari
 */
public class Update extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pat = null;
    public Update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPcode = new javax.swing.JTextField();
        txtPname = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtGetPrice = new javax.swing.JTextField();
        txtSellPrice = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TJ'S Shop Update");
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1368, 768));
        setSize(new java.awt.Dimension(1368, 768));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        productTable.setBackground(new java.awt.Color(255, 255, 255));
        productTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        productTable.setForeground(new java.awt.Color(0, 0, 0));
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Quantity", "Get Price", "Sell Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        productTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 240, 1140, 470);

        btnUpdate.setIcon(new javax.swing.ImageIcon("F:\\2 nd year\\1 st sem\\CSCI 21052 - Object Oriented Programming - I\\Project\\Sample NetBeans\\Salles\\src\\Assets\\img\\updateitem.png")); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(1230, 310, 100, 100);

        btnInsert.setIcon(new javax.swing.ImageIcon("F:\\2 nd year\\1 st sem\\CSCI 21052 - Object Oriented Programming - I\\Project\\Sample NetBeans\\Salles\\src\\Assets\\img\\additem.png")); // NOI18N
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(1230, 150, 100, 100);

        btnUpdate1.setIcon(new javax.swing.ImageIcon("F:\\2 nd year\\1 st sem\\CSCI 21052 - Object Oriented Programming - I\\Project\\Sample NetBeans\\Salles\\src\\Assets\\img\\showall.png")); // NOI18N
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate1);
        btnUpdate1.setBounds(1230, 460, 100, 110);

        btnDelete.setIcon(new javax.swing.ImageIcon("F:\\2 nd year\\1 st sem\\CSCI 21052 - Object Oriented Programming - I\\Project\\Sample NetBeans\\Salles\\src\\Assets\\img\\removeitemhvr.png")); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(1230, 620, 100, 100);

        txtPcode.setBackground(new java.awt.Color(153, 153, 153));
        txtPcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPcodeKeyPressed(evt);
            }
        });
        getContentPane().add(txtPcode);
        txtPcode.setBounds(70, 170, 150, 40);

        txtPname.setBackground(new java.awt.Color(153, 153, 153));
        txtPname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtPname);
        txtPname.setBounds(280, 170, 170, 40);

        txtQty.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(txtQty);
        txtQty.setBounds(520, 170, 150, 40);

        txtGetPrice.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(txtGetPrice);
        txtGetPrice.setBounds(740, 170, 160, 40);

        txtSellPrice.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(txtSellPrice);
        txtSellPrice.setBounds(990, 170, 160, 40);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(1210, 30, 140, 50);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sell Price");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1010, 140, 130, 28);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Get Price");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(760, 140, 140, 28);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 130, 200, 40);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 140, 170, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Product Code");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 130, 160, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon("F:\\2 nd year\\1 st sem\\CSCI 21052 - Object Oriented Programming - I\\Project\\Sample NetBeans\\Salles\\src\\Assets\\img\\xupdatebackgrond.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -20, 1380, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void printTable(){
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel)productTable.getModel();
        
        model.addRow(new Object[]
        {
           txtPcode.getText(),
           txtPname.getText(),
           txtGetPrice.getText(),
           txtSellPrice.getText(),
        
        }          
        );
    }
    
        
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sallesbill","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showAllComponent(){
        connect();
        try {
            Statement st=con.createStatement();
            String sql="select * from product";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String id = rs.getString("ProductID");
                String Pname = rs.getString("Product Name");
                String quntity = rs.getString("Quantity");
                String getPrice = rs.getString("Get Price");
                String sellPrice = rs.getString("Sells Price");
                
                String tbData[] = {id,Pname,quntity,getPrice,sellPrice};
                DefaultTableModel tblModel = (DefaultTableModel)productTable.getModel();
                
                tblModel.addRow(tbData);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void txtPcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcodeKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            String pcode = txtPcode.getText();
            
            try{
                connect();
                pat = con.prepareStatement("SELECT * FROM `product` where ProductID=?");
                pat.setString(1, pcode);
                rs = pat.executeQuery();
                
                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this, "Product Code Not Found");
                }else{
                    String pname = rs.getString("Product Name");
                    String getPrice = rs.getString("Get Price");
                    String qty =rs.getString("Quantity");
                    String sellPrice = rs.getString("Sells Price");
                    
                    txtPname.setText(pname.trim());
                    txtGetPrice.setText(getPrice.trim()); 
                    txtQty.setText(qty.trim());
                    txtSellPrice.setText(sellPrice.trim());
                }
                
            }catch (Exception a){
                System.out.println("Error: " + a);
            }
        }
    }//GEN-LAST:event_txtPcodeKeyPressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String pcode = txtPcode.getText();
        String pname = txtPname.getText();
        String qty = txtQty.getText();
        String getPrice = txtGetPrice.getText();
        String sellPrice = txtSellPrice.getText();
        try{
            connect();
            pat=con.prepareStatement("UPDATE `product` SET `Product Name`=?,`Quantity`=?,`Get Price`=?, `Sells Price`=?  WHERE `ProductID`=?");
            pat.setString(5,pcode);
            pat.setString(1,pname);
            pat.setString(2, qty);
            pat.setString(3, getPrice);
            pat.setString(4,sellPrice);

            int k = pat.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null,"Update Succsess");
                txtPcode.setText("");
                txtPname.setText("");
                txtQty.setText("");
                txtGetPrice.setText("");
                txtSellPrice.setText("");
                tableClear();
                showAllComponent();
            }else{
                JOptionPane.showMessageDialog(null,"Update Fail");
            }
            
        }catch (Exception a){
            System.out.println("Error: "+a);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        try{
            int row = productTable.getSelectedRow();
            String tableClick = (productTable.getModel().getValueAt(row, 0).toString());
            String sql = "select * from product where ProductID='" + tableClick+"' ";
            pat = con.prepareStatement(sql);
            rs=pat.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ProductID");
                String add2 = rs.getString("Product Name");
                String add3 = rs.getString("Quantity");
                String add4 = rs.getString("Get Price");
                String add5 = rs.getString("Sells Price");
                
                txtPcode.setText(add1);
                txtPname.setText(add2);
                txtQty.setText(add3);
                txtGetPrice.setText(add4);
                txtSellPrice.setText(add5);
                
            }
        }catch (Exception a){
            System.out.println("Error: "+ a);
        }
    }//GEN-LAST:event_productTableMouseClicked

    private void productTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_productTableKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showAllComponent();
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String sql = "delete from product where ProductID=?";
        try{
            String pcode = txtPcode.getText();
            pat=con.prepareStatement(sql);
            pat.setString(1, pcode);
            pat.execute();
            JOptionPane.showMessageDialog(null, "Deleted");

            txtPcode.setText("");
            txtPname.setText("");
            txtQty.setText("");
            txtGetPrice.setText("");
            txtSellPrice.setText("");

        }catch(Exception e){
            System.out.println(e);
        }
        tableClear();
        showAllComponent();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        try{
            connect();
            //           pat = con.prepareStatement(sql);
            //           pat.setString(1, txtPcode.getText());

            String pcode = txtPcode.getText();
            String pname = txtPname.getText();
            String qty = txtQty.getText();
            String getPrice = txtGetPrice.getText();
            String sellPrice = txtSellPrice.getText();

            pat = con.prepareStatement("INSERT INTO `product`(`ProductID`, `Product Name`, `Quantity`, `Get Price`,`Sells Price`) VALUES (?,?,?,?,?)");
            pat.setString(1, pcode);
            pat.setString(2, pname);
            pat.setString(3, qty);
            pat.setString(4, getPrice);
            pat.setString(5, sellPrice);
            //            printTable();
            int k = pat.executeUpdate();

            if(k==1){
                JOptionPane.showMessageDialog(null,"Recored added");
                txtPcode.setText("");
                txtPname.setText("");
                txtQty.setText("");
                txtGetPrice.setText("");
                txtSellPrice.setText("");
                tableClear();
                showAllComponent();
            }

            else{
                JOptionPane.showMessageDialog(null, "Recored failed");
            }
        }catch(Exception a){
            System.out.println("Erorr: "+ a);
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        tableClear();
        showAllComponent();
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtPcode.setText("");
        txtPname.setText("");
        txtQty.setText("");
        txtGetPrice.setText("");
        txtSellPrice.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtPnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPnameActionPerformed

    public void tableClear(){
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);
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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField txtGetPrice;
    private javax.swing.JTextField txtPcode;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSellPrice;
    // End of variables declaration//GEN-END:variables
}
