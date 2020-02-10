/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.ProductDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nitya
 */
public class ManageProdPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountPanel
     */
    private ProductDirectory prodDir;
    private JPanel userComponent;

    ManageProdPanel(JPanel userComponent, ProductDirectory prodDir) {
        initComponents();
        this.prodDir=prodDir;
        this.userComponent=userComponent;
        populate();
    }
    
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        
        for(Product a : prodDir.getProductDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getAvailNum();
            row[2]=a.getPrice();
            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        lblManage = new javax.swing.JLabel();
        lblSearchAccNo = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        Viewbtn1 = new javax.swing.JButton();
        Backbtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod Name ", "Availablity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        lblManage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblManage.setText("Manage Products");

        btnDelete.setText("Delete Product");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        Viewbtn1.setText("View Details");
        Viewbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Viewbtn1ActionPerformed(evt);
            }
        });

        Backbtn1.setText("Back");
        Backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Backbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblSearchAccNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(lblManage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Backbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(232, 232, 232)
                    .addComponent(Viewbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(251, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblManage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchAccNo)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Backbtn1)
                    .addComponent(btnDelete))
                .addGap(74, 74, 74))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(294, Short.MAX_VALUE)
                    .addComponent(Viewbtn1)
                    .addGap(74, 74, 74)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Product prod = (Product)tblDirectory.getValueAt(selectedRow, 0);
                prodDir.deleteProduct(prod);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        
           Product result = prodDir.searchProduct(txtsearch.getText());
        if (result == null) {
            JOptionPane.showMessageDialog(null, "Product does not exist.", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ViewPanel panel = new ViewPanel(userComponent, result,prodDir);
            userComponent.add("ViewProdJPanel", panel);
            CardLayout layout = (CardLayout) userComponent.getLayout();
            layout.next(userComponent);
    }//GEN-LAST:event_SearchBtnActionPerformed
    }
    private void Viewbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Viewbtn1ActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = tblDirectory.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Product product = (Product) tblDirectory.getValueAt(selectedRow, 0);
            ViewPanel panel = new ViewPanel(userComponent, product,prodDir);
            userComponent.add("ViewProductDetailsJPanel", panel);
            CardLayout layout = (CardLayout) userComponent.getLayout();
            layout.next(userComponent);}
    }//GEN-LAST:event_Viewbtn1ActionPerformed

    private void Backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Backbtn1ActionPerformed
        // TODO add your handling code here:
        
        userComponent.remove(this);
        CardLayout layout = (CardLayout) userComponent.getLayout();
        layout.previous(userComponent);
    }//GEN-LAST:event_Backbtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn1;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton Viewbtn1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManage;
    private javax.swing.JLabel lblSearchAccNo;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}