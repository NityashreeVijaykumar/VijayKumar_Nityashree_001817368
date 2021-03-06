/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person_Information;

/**
 *
 * @author nitya
 */
public class View_SavingAcct_Panel extends javax.swing.JPanel {

    /**
     * Creates new form View_SavingAcct_Panel
     */
    public View_SavingAcct_Panel(Person_Information person) {
        initComponents();
        displaySaving(person);
    }
private void displaySaving(Person_Information person)
{
   String personSBankName=person.getPersonSaving().getBankName();
    BankName_Txt.setText(personSBankName);
    
    String personSRoutingNO=person.getPersonSaving().getBankRountingNo();
    Bank_Routing_No_Txt.setText(personSRoutingNO);
    
    String personSBankAcctNo=person.getPersonSaving().getBankAccNo();
    AccNo_Txt.setText(personSBankAcctNo);
    
    String personSBankAccBal=person.getPersonSaving().getAccBalance();
    AcctBalance_Txt.setText(personSBankAccBal);
    
    String personSBankAccType=person.getPersonSaving().getAccType();
    AcctType_Txt.setText(personSBankAccType);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccBalance = new javax.swing.JLabel();
        BankName_Txt = new javax.swing.JTextField();
        Bank_Routing_No_Txt = new javax.swing.JTextField();
        AcctType = new javax.swing.JLabel();
        SavingInfo = new javax.swing.JLabel();
        AccNo_Txt = new javax.swing.JTextField();
        AcctBalance_Txt = new javax.swing.JTextField();
        AcctType_Txt = new javax.swing.JTextField();
        BankName = new javax.swing.JLabel();
        BankRoutingNo = new javax.swing.JLabel();
        BankAccNo = new javax.swing.JLabel();

        AccBalance.setText("Account Balance:");

        AcctType.setText("Account Type:");

        SavingInfo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SavingInfo.setText("Saving Account Information");

        BankName.setText("Bank Name:");

        BankRoutingNo.setText("Bank Routing No:");

        BankAccNo.setText("Bank Account No:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BankAccNo)
                                .addComponent(BankRoutingNo)
                                .addComponent(BankName))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AcctType)
                                .addComponent(AccBalance)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(AcctType_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SavingInfo)
                            .addComponent(BankName_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bank_Routing_No_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccNo_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AcctBalance_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(SavingInfo)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankName)
                    .addComponent(BankName_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankRoutingNo)
                    .addComponent(Bank_Routing_No_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankAccNo)
                    .addComponent(AccNo_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccBalance)
                    .addComponent(AcctBalance_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcctType_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AcctType))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccBalance;
    private javax.swing.JTextField AccNo_Txt;
    private javax.swing.JTextField AcctBalance_Txt;
    private javax.swing.JLabel AcctType;
    private javax.swing.JTextField AcctType_Txt;
    private javax.swing.JLabel BankAccNo;
    private javax.swing.JLabel BankName;
    private javax.swing.JTextField BankName_Txt;
    private javax.swing.JLabel BankRoutingNo;
    private javax.swing.JTextField Bank_Routing_No_Txt;
    private javax.swing.JLabel SavingInfo;
    // End of variables declaration//GEN-END:variables
}
