
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nimesh
 */
public class UserSelling extends javax.swing.JFrame {

    /**
     * Creates new form UserSelling
     */
    public UserSelling() {
        initComponents();
        jTextField1.requestFocus();
    }
    Connection connection;
    PreparedStatement pst;
    ResultSet rs;
    int No =0;
    
    public void bill(){
    
        String total=jTextField5.getText();
        String balance=jTextField7.getText();
        String cash=jTextField6.getText();
    
        DefaultTableModel model = new DefaultTableModel();
        model=(DefaultTableModel)jTable1.getModel();
        
        jTextArea1.setText(jTextArea1.getText()+ "**********************************************************************************"+"\n");
        jTextArea1.setText(jTextArea1.getText()+ "                                   RETAIL STORE                                   "+"\n");
        jTextArea1.setText(jTextArea1.getText()+ "**********************************************************************************"+"\n");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now(); 
        jTextArea1.setText(jTextArea1.getText()+dtf.format(now) +"\n");
        jTextArea1.setText(jTextArea1.getText()+"no "+"Product"+"\t\t"+"qnt"+"\t"+"Unit Price"+"\t"+"Amount"+"\n");
        
        for(int i=0;i<model.getRowCount();i++){
        
            
            String pname = (String)model.getValueAt(i,2);
            String qnt = (String)model.getValueAt(i,3);
            String unitPrice = (String)model.getValueAt(i,4);
            String amount = (String)model.getValueAt(i,5);
            jTextArea1.setText(jTextArea1.getText()+i+1+ pname+"\t\t" +qnt+"\t"+unitPrice+"\t"+amount+"0\n");
        }
        
        jTextArea1.setText(jTextArea1.getText()+"\n");
        jTextArea1.setText(jTextArea1.getText()+"\n");
        jTextArea1.setText(jTextArea1.getText()+"Total"+"\t"+"="+"\t\t\t"+total+"0\n");
        jTextArea1.setText(jTextArea1.getText()+"Cash"+"\t"+"="+"\t\t\t"+cash+".00\n");
        jTextArea1.setText(jTextArea1.getText()+ "___________________________________________________________"+"\n");
        jTextArea1.setText(jTextArea1.getText()+"Balance"+"\t"+"="+"\t\t\t"+balance+"0\n");
        jTextArea1.setText(jTextArea1.getText()+ "___________________________________________________________"+"\n");
        jTextArea1.setText(jTextArea1.getText()+ "___________________________________________________________"+"\n");
        jTextArea1.setText(jTextArea1.getText()+ "__________________________THANK YOU+_______________________"+"\n");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Selling");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abc.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 80));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ABC Stores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 260, 50));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No.48, Kurunduwatte, Walahanduwa, Galle");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 270, -1));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Code");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 60, 40));

        jTextField1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 30));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 60, 40));

        jTextField2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 200, 30));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Unit Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 100, 40));

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 80, 40));

        jTextField8.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 120, 30));

        jTextField3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 180, 30));

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Qunatity");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 100, 40));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 149, 260, 30));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 212, 260, 30));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cash");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 212, 80, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 430, 390));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 279, 260, 30));

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Balance");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 279, 130, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Code", "Name", "Unit Price", "Quantity", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 820, 470));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xback.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xbackhvr.png"))); // NOI18N
        jButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xbackslctd.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 15, 40, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closehovr.png"))); // NOI18N
        jButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeslctd.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 15, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sellingbackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        UserHome uh = new UserHome();
        uh.show();
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        YeaNo yn = new YeaNo();
        yn.show();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
       
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String pcode=jTextField1.getText();
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection=DriverManager.getConnection("jdbc:mysql://localhost/store","root","");
                pst= connection.prepareStatement("select * from product where id = ?");
                
                pst.setString(1,pcode);
                rs = pst.executeQuery();
                
                if(rs.next()==false) {
                    JOptionPane.showMessageDialog(this, "product code not found");
                }else{
                    String pname=rs.getString("proname");
                    String price=rs.getString("price");
                    
                    jTextField2.setText(pname.trim());
                    jTextField3.setText(price.trim());
                    jTextField8.requestFocus();
                    jTextField5.setText("");
                    jTextField6.setText("");
                    jTextField7.setText("");
                    jTextArea1.setText("");
                                                                    
                }
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(UserSelling.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                
            int qty = Integer.parseInt(jTextField8.getText());
            float price = Float.parseFloat(jTextField3.getText());
            float total = qty * price; 
            
        
            DefaultTableModel model = new DefaultTableModel();
            model=(DefaultTableModel)jTable1.getModel();
         
            model.addRow(new Object[]
            {
                No = No+1,
                jTextField1.getText(),
                jTextField2.getText(), 
                jTextField8.getText(),
                jTextField3.getText(),
                String.valueOf(total),
           
            } );
        
            float sum = 0;
        
            for(int i=0;i<jTable1.getRowCount();i++)
            {
                sum = sum + Float.parseFloat(jTable1.getValueAt(i,5).toString());
             
            }
        
        
             try {
                 String pcode = jTextField1.getText();
                 
                 Class.forName("com.mysql.jdbc.Driver");
                 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","");
                 pst= connection.prepareStatement("select * from product where id = ?");
                 pst.setString(1,pcode);
                 rs = pst.executeQuery();
                 
                 if(rs.next()==false) {
                     
                    JOptionPane.showMessageDialog(this, "product code not found");
                    
                }else{
                    
                    int availableQty = rs.getInt("quantity");
                    float cost = rs.getFloat("cost");
                    float profit = qty *(price-cost);
                    String pName = rs.getString("proname");
                    
                    if(availableQty>=qty&&qty>=0){
                    
                        availableQty = availableQty - qty;
                    
                    
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            connection=DriverManager.getConnection("jdbc:mysql://localhost/store","root","");
                            
                            pst= connection.prepareStatement("update product set quantity = ? where id = ?");
                            pst.setInt(1,availableQty);
                            pst.setString(2,pcode);
                            pst.executeUpdate();
                            
                            Class.forName("com.mysql.jdbc.Driver");
                            connection=DriverManager.getConnection("jdbc:mysql://localhost/store","root","");
                            pst= connection.prepareStatement("select * from tresury where id = ?");
                            pst.setString(1,pcode);
                            rs=pst.executeQuery();
                            
                            
                            if(rs.next()==true){
                                //JOptionPane.showMessageDialog(this, "succesfully updated");
                                int sellingQty = rs.getInt("selliings");
                                float selltotal = rs.getInt("total");
                                float sellprofit = rs.getInt("profit");
                                
                                sellingQty = sellingQty + qty;
                                selltotal = selltotal + total;
                                sellprofit = sellprofit + profit;
                                
                                Class.forName("com.mysql.jdbc.Driver");
                                connection=DriverManager.getConnection("jdbc:mysql://localhost/store","root","");
                                //pst= connection.prepareStatement("update tresury set selliings = ?,total = ?,profit = ? where id = ?");
                                pst= connection.prepareStatement("UPDATE `tresury` SET `selliings`= ?,`total`=?,`profit`=? WHERE id = ?");
                                pst.setInt(1,sellingQty);
                                pst.setFloat(2,selltotal);
                                pst.setFloat(3,sellprofit);
                                pst.setString(4,pcode);
                                pst.executeUpdate();
                            }else{
                            
                                pst= connection.prepareStatement("INSERT INTO `tresury`(`id`, `proname`, `selliings`, `total`, `profit`) VALUES (?,?,?,?,?)");
                                pst.setString(1,pcode);
                                pst.setString(2,pName);
                                pst.setInt(3,qty);
                                pst.setFloat(4,total);
                                pst.setFloat(5,profit);
                                pst.executeUpdate();
                                
                            }
                            
                            
                            
                        } catch(ClassNotFoundException | SQLException ex){
                        Logger.getLogger(UserSelling.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Required quantity is not availaable");
                    }
                    
                }
               
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(UserSelling.class.getName()).log(Level.SEVERE, null, ex);
             }
        
        
        
        jTextField5.setText(Float.toString(sum));
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField8.setText("");
        jTextField1.requestFocus();}
        
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        float cash=Integer.parseInt(jTextField6.getText());
        float total=Float.parseFloat(jTextField5.getText());
        float balance= cash-total;
            
        jTextField7.setText(Float.toString(balance) );
        bill();
        jTextField1.requestFocus();
        
       
        DefaultTableModel model = new DefaultTableModel();
        model=(DefaultTableModel)jTable1.getModel();
        
        for(int i=jTable1.getRowCount()-1;i>=0;i--)
        {
            
             model.removeRow(i);
        }
        No=0; 
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(UserSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSelling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
