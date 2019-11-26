/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs499_ophthalmology_emr;

/**
 *
 * @author angela
 */
public class InsurancePage extends javax.swing.JPanel {


    private MainDashboard dashBoard = null;
 
    private DataBaseManager dataBase;
    private Patient activePatient;

    
    public InsurancePage(MainDashboard _dashBoard) {
        
        dashBoard = _dashBoard;
        dataBase = DataBaseManager.getInstance();
        initComponents();

    }
    
    public void insuranceInfo(Patient thePatient)
    {
        activePatient = dashBoard.getActivePatient();
         
        patientNameTxtF.setEditable(false);
        patientNameTxtF.setText(thePatient.getName());
        
        insuranceProviderTxtF.setEditable(false);
        insuranceProviderTxtF.setText(thePatient.getInsProvider());
        
        groupNumTxtF.setEditable(false);
        groupNumTxtF.setText(thePatient.getInsGroupNo());
        
        insProviderAddrTXTF.setEditable(false);
        insProviderAddrTXTF.setText(thePatient.getInsProviderAddr());
        
        phoneNumTxtF.setEditable(false);
        phoneNumTxtF.setText(thePatient.getInsProviderPhone());
        
        contactNumTxtF1.setEditable(false);
        contactNumTxtF1.setText(thePatient.getInsContractNo());
        
        String coPay = Double.toString(thePatient.getInsCoPayAmount());
        coPaymentTxtF.setEditable(false);
        coPaymentTxtF.setText(coPay);
        
        String effDate = Integer.toString(thePatient.getInsEffectiveDate());
        effDateTxtF1. setEditable(false);
        effDateTxtF1.setText(effDate);

       
    }
    public void calculateTotalChageAmt(Patient thePatient)
    {
        Double serviceCharge = Double.parseDouble(serviceChargeTXTF1.getText());
        Double coPayAmt =  thePatient.getInsCoPayAmount();
        Double totalChargeAmt = serviceCharge + coPayAmt;
        thePatient.setinsTotalAmtCharged(totalChargeAmt);
        
        String totalAmt = Double.toString(totalChargeAmt);
        amtChargedTXTF.setEditable(false);
        amtChargedTXTF.setText("$ " + totalAmt);
                  
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patientNameTxtF = new javax.swing.JTextField();
        inssaveBttn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        coPaymentTxtF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        groupNumTxtF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneNumTxtF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        insProviderAddrTXTF = new javax.swing.JTextField();
        insuranceProviderTxtF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        contactNumTxtF1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        effDateTxtF1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        amtChargedTXTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        serviceChargeTXTF1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(57, 113, 177));

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insurance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 486, 27, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        patientNameTxtF.setBackground(new java.awt.Color(204, 255, 255));
        patientNameTxtF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        patientNameTxtF.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(patientNameTxtF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 330, 30));

        inssaveBttn.setBackground(new java.awt.Color(102, 255, 102));
        inssaveBttn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inssaveBttn.setForeground(new java.awt.Color(0, 0, 0));
        inssaveBttn.setText("SAVE");
        inssaveBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inssaveBttnMouseClicked(evt);
            }
        });
        jPanel2.add(inssaveBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 590, 250, 50));

        jPanel4.setBackground(new java.awt.Color(32, 33, 35));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 3, 2, 3, new java.awt.Color(253, 252, 233)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/emrlogo3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 510, 540));

        jPanel5.setBackground(new java.awt.Color(32, 33, 35));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 3, 2, 3, new java.awt.Color(253, 252, 233)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Insurance Provider Information :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Copayment:");

        coPaymentTxtF.setBackground(new java.awt.Color(204, 255, 255));
        coPaymentTxtF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        coPaymentTxtF.setForeground(new java.awt.Color(0, 0, 0));
        coPaymentTxtF.setToolTipText("Input Co-Payment Amount");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Group Number:");

        groupNumTxtF.setBackground(new java.awt.Color(204, 255, 255));
        groupNumTxtF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        groupNumTxtF.setForeground(new java.awt.Color(0, 0, 0));
        groupNumTxtF.setToolTipText("List Group Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone Number:");

        phoneNumTxtF.setBackground(new java.awt.Color(204, 255, 255));
        phoneNumTxtF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneNumTxtF.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumTxtF.setToolTipText("List Phone Number ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Provider:");

        insProviderAddrTXTF.setBackground(new java.awt.Color(204, 255, 255));
        insProviderAddrTXTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        insProviderAddrTXTF.setToolTipText("List Insurance Provider Address");

        insuranceProviderTxtF.setBackground(new java.awt.Color(204, 255, 255));
        insuranceProviderTxtF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        insuranceProviderTxtF.setForeground(new java.awt.Color(0, 0, 0));
        insuranceProviderTxtF.setToolTipText("List Insurance Provider");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contract Number:");

        contactNumTxtF1.setBackground(new java.awt.Color(204, 255, 255));
        contactNumTxtF1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contactNumTxtF1.setForeground(new java.awt.Color(0, 0, 0));
        contactNumTxtF1.setToolTipText("List Inurance's Contact Number");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Effective Date:");

        effDateTxtF1.setBackground(new java.awt.Color(204, 255, 255));
        effDateTxtF1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        effDateTxtF1.setForeground(new java.awt.Color(0, 0, 0));
        effDateTxtF1.setToolTipText("MMDDYYYY");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Amount Charge:");

        amtChargedTXTF.setBackground(new java.awt.Color(204, 255, 255));
        amtChargedTXTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amtChargedTXTF.setForeground(new java.awt.Color(0, 0, 0));
        amtChargedTXTF.setToolTipText("Total Amount that will be charged to Patient");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Enter Service Charge:");

        serviceChargeTXTF1.setBackground(new java.awt.Color(204, 255, 255));
        serviceChargeTXTF1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        serviceChargeTXTF1.setForeground(new java.awt.Color(0, 0, 0));
        serviceChargeTXTF1.setToolTipText("Enter the Service Charge Amount to be Charged to Insurance");
        serviceChargeTXTF1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                serviceChargeTXTF1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insProviderAddrTXTF)
                            .addComponent(insuranceProviderTxtF)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactNumTxtF1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(effDateTxtF1)
                            .addComponent(groupNumTxtF)
                            .addComponent(phoneNumTxtF)
                            .addComponent(coPaymentTxtF)
                            .addComponent(amtChargedTXTF)
                            .addComponent(serviceChargeTXTF1))))
                .addGap(29, 29, 29))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(insuranceProviderTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insProviderAddrTXTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(contactNumTxtF1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneNumTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(groupNumTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(coPaymentTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(effDateTxtF1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(serviceChargeTXTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(amtChargedTXTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 680, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void serviceChargeTXTF1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serviceChargeTXTF1FocusLost
        // TODO add your handling code here:
        Double serviceCharge = Double.parseDouble(serviceChargeTXTF1.getText());
        //serviceChargeTXTF1.setEditable(true);
        serviceChargeTXTF1.setText("$" + serviceCharge); //????????????????? we'll see

        System.out.println("Insurance: Service Charged: " + serviceCharge);
    }//GEN-LAST:event_serviceChargeTXTF1FocusLost

    private void inssaveBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inssaveBttnMouseClicked
        // TODO add your handling code here:
        dataBase.save(activePatient);
    }//GEN-LAST:event_inssaveBttnMouseClicked
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amtChargedTXTF;
    private javax.swing.JTextField coPaymentTxtF;
    private javax.swing.JTextField contactNumTxtF1;
    private javax.swing.JTextField effDateTxtF1;
    private javax.swing.JTextField groupNumTxtF;
    private javax.swing.JTextField insProviderAddrTXTF;
    private javax.swing.JButton inssaveBttn;
    private javax.swing.JTextField insuranceProviderTxtF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField patientNameTxtF;
    private javax.swing.JTextField phoneNumTxtF;
    private javax.swing.JTextField serviceChargeTXTF1;
    // End of variables declaration//GEN-END:variables
}
