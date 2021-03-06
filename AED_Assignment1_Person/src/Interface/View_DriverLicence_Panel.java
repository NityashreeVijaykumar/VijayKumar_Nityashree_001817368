/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person_Information;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author nitya
 */
public class View_DriverLicence_Panel extends javax.swing.JPanel {

    /**
     * Creates new form View_DriverLicence_Panel
     */
    public View_DriverLicence_Panel(Person_Information person) {
        initComponents();
        displayDLInfo(person);
    }
private void displayDLInfo(Person_Information person)
{ 
    String personLicenseNO=person.getPersonDL().getLicenseNo();
    LicenseNum_Txt.setText(personLicenseNO);
        
    String personDLIssue=person.getPersonDL().getDateofIssue();
    IssueDate_Txt.setText(personDLIssue);
    
    String personDLExpiry=person.getPersonDL().getDateofExpiration();
    ExpiryDate_Txt.setText(personDLExpiry);
    
    String personBloodType=person.getPersonDL().getBloodtype();
    BloodType_Txt.setText(personBloodType);
        
    String PersonImage = person.getPersonDL().getPicture();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(PersonImage).getImage().getScaledInstance(150,150 , Image.SCALE_SMOOTH));
        Picture.setIcon(imageIcon);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BloodType_Txt = new javax.swing.JTextField();
        LicenseNum = new javax.swing.JLabel();
        IssueDate = new javax.swing.JLabel();
        ExpiryDate = new javax.swing.JLabel();
        BloodType = new javax.swing.JLabel();
        LicenseNum_Txt = new javax.swing.JTextField();
        IssueDate_Txt = new javax.swing.JTextField();
        Picture = new javax.swing.JLabel();
        CheckingInfo = new javax.swing.JLabel();
        ExpiryDate_Txt = new javax.swing.JTextField();

        LicenseNum.setText("License Number:");

        IssueDate.setText("Date Of Issue:");

        ExpiryDate.setText("Date Of Expiry:");

        BloodType.setText("Blood Type:");

        Picture.setText("Picture");

        CheckingInfo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CheckingInfo.setText("Driver License Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExpiryDate)
                            .addComponent(IssueDate)
                            .addComponent(LicenseNum)
                            .addComponent(BloodType)
                            .addComponent(Picture))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LicenseNum_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IssueDate_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExpiryDate_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BloodType_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(CheckingInfo)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(CheckingInfo)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LicenseNum)
                    .addComponent(LicenseNum_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IssueDate)
                    .addComponent(IssueDate_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExpiryDate)
                    .addComponent(ExpiryDate_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodType)
                    .addComponent(BloodType_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(Picture)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodType;
    private javax.swing.JTextField BloodType_Txt;
    private javax.swing.JLabel CheckingInfo;
    private javax.swing.JLabel ExpiryDate;
    private javax.swing.JTextField ExpiryDate_Txt;
    private javax.swing.JLabel IssueDate;
    private javax.swing.JTextField IssueDate_Txt;
    private javax.swing.JLabel LicenseNum;
    private javax.swing.JTextField LicenseNum_Txt;
    private javax.swing.JLabel Picture;
    // End of variables declaration//GEN-END:variables
}
