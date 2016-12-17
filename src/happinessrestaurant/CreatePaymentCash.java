/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happinessrestaurant;

import businesstier.OrderBusinessTier;
import businesstier.PaymentBusinessTier;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class CreatePaymentCash extends javax.swing.JFrame {

    /**
     * Creates new form CreatePaymentCash
     */
    public CreatePaymentCash() {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
                OrderBusinessTier bt = new OrderBusinessTier();
                ArrayList order_no= bt.retrieveOrderNo();
                for(int i=0 ; i<order_no.size(); i++){
                    cb_order_no.addItem(order_no.get(i));
                }
    }catch(Exception ex){
        ex.printStackTrace();
    }
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
        cb_order_no = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tf_payment_id = new javax.swing.JTextField();
        tf_subtotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_gst = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_total = new javax.swing.JTextField();
        bt_create = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cb_member = new javax.swing.JComboBox();
        bt_calc = new javax.swing.JButton();
        lb_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cash Payment");

        jLabel1.setText("Order No:");

        jLabel3.setText("Payment Id:");

        tf_payment_id.setEditable(false);

        tf_subtotal.setEditable(false);

        jLabel4.setText("SubTotal: (RM) ");

        jLabel5.setText("GST 6%: (RM)");

        tf_gst.setEditable(false);

        jLabel6.setText("Total Price: (RM)");

        tf_total.setEditable(false);

        bt_create.setText("Create");
        bt_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_createActionPerformed(evt);
            }
        });

        bt_cancel.setText("Cancel");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        jLabel7.setText("Member?");

        cb_member.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Yes" }));
        cb_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_memberActionPerformed(evt);
            }
        });

        bt_calc.setText("Calculate");
        bt_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_calcActionPerformed(evt);
            }
        });

        lb_title.setBackground(new java.awt.Color(200, 100, 200));
        lb_title.setFont(new java.awt.Font("Vrinda", 3, 24)); // NOI18N
        lb_title.setForeground(new java.awt.Color(100, 200, 0));
        lb_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_title.setText("Cash Payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_create)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addComponent(tf_gst, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addComponent(cb_member, 0, 74, Short.MAX_VALUE)
                        .addComponent(cb_order_no, 0, 74, Short.MAX_VALUE)
                        .addComponent(tf_payment_id, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(bt_cancel)
                        .addGap(29, 29, 29)
                        .addComponent(bt_calc))
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_payment_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_order_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_gst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(bt_calc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancel)
                    .addComponent(bt_create))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_createActionPerformed
       try{
           
        PaymentBusinessTier pbt = new PaymentBusinessTier();
        tf_payment_id.setText(pbt.getPaymentId());
        String payment_id = tf_payment_id.getText();
        String order_no = (String) cb_order_no.getSelectedItem();
       String s_subtotal = tf_subtotal.getText();
       String s_gst = tf_gst.getText();
       String s_total = tf_total.getText();
       double subtotal = Double.parseDouble(s_subtotal);
       double gst = Double.parseDouble(s_gst);
       double total = Double.parseDouble(s_total);
       

           boolean p_id = pbt.createPayment(payment_id, order_no, "Cash","---", subtotal, gst, total);

           if(p_id){
               JOptionPane.showMessageDialog(this,"New payment Created!!!");
               new GenerateReceipt(payment_id).setVisible(true);
               OrderBusinessTier obt = new OrderBusinessTier();
               obt.deleteOrder(order_no);
               dispose();
           }
           else if(p_id == false)
               JOptionPane.showMessageDialog(this,"Please calculate subtotal, gst and total price!!!");
           
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Error in creating payment!");
       }
       
    }//GEN-LAST:event_bt_createActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        new CreatePayment().setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void bt_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_calcActionPerformed
        String order_no = (String) cb_order_no.getSelectedItem();
        String member = (String) cb_member.getSelectedItem();
         NumberFormat nf = NumberFormat.getInstance();
                    nf.setMaximumFractionDigits(2);
        try {
            PaymentBusinessTier pbt = new PaymentBusinessTier();
            double price = pbt.calculation(order_no);
            if(price==0.0){
                JOptionPane.showMessageDialog(null, "Error in Calculation");
            }
            else{
                if(member.equalsIgnoreCase("Yes")){
                    tf_subtotal.setText(nf.format(price*0.9)+"");
                    tf_gst.setText(nf.format((price*0.9)*(6.0/100.0))+"");
                    tf_total.setText(nf.format((price*0.9)*(106.0/100.0))+"");
                }
                else{
                     tf_subtotal.setText(nf.format(price)+"");
                    tf_gst.setText(nf.format(price*(6.0/100.0))+"");
                    tf_total.setText(nf.format(price*(106.0/100.0))+"");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bt_calcActionPerformed

    private void cb_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_memberActionPerformed

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
            java.util.logging.Logger.getLogger(CreatePaymentCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePaymentCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePaymentCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePaymentCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePaymentCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_calc;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_create;
    private javax.swing.JComboBox cb_member;
    private javax.swing.JComboBox cb_order_no;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb_title;
    private javax.swing.JTextField tf_gst;
    private javax.swing.JTextField tf_payment_id;
    private javax.swing.JTextField tf_subtotal;
    private javax.swing.JTextField tf_total;
    // End of variables declaration//GEN-END:variables
}
