/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs499_ophthalmology_emr;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author angelaallison
 */
public class MainDashboard extends javax.swing.JFrame {
    

    public PatientPortal patientPortal;
    public AppointmentDisplay appointmentPanel;
    public AppointmentForm appointmentForm;
    public InsurancePage insurancePanel;
    public HomePanel homePanel;
    public PatientPageTemplate viewPatientPage;
    public VisualAcuity visualAcuity;
    public OcularExResults occularExResults;
    public PatientForm patientForm;
    private Patient activePatient;
    private Appointment activeAppointment;
    private EyeTestResults activeResults;
    public InfomationPanel informationPanel;
    /**
     * Creates new form MainWindow
     */
    public MainDashboard() {
    initComponents();
    currentPatientTextBar.setText("No active patient.");

    patientPortal       = new PatientPortal(this);
    appointmentPanel    = new AppointmentDisplay(this);
    insurancePanel      = new InsurancePage(this);
    homePanel           = new HomePanel();
    viewPatientPage     = new PatientPageTemplate(this);
    patientForm		= new PatientForm(this);
    appointmentForm     = new AppointmentForm(this);
    visualAcuity        = new VisualAcuity(this);//***
    occularExResults    = new OcularExResults(this);
    informationPanel    = new InfomationPanel();
    
        
    mainPanel.add(homePanel);	
    mainPanel.add(patientPortal);
    mainPanel.add(patientForm);
    mainPanel.add(appointmentPanel);
    mainPanel.add(insurancePanel);
    mainPanel.add(viewPatientPage);
    mainPanel.add(appointmentForm);
    mainPanel.add(visualAcuity);
    mainPanel.add(occularExResults);
    mainPanel.add(informationPanel);
    
    patientPortal.setVisible(false);
    patientForm.setVisible(false);
    appointmentPanel.setVisible(false);
    insurancePanel.setVisible(false);
    viewPatientPage.setVisible(false);
    appointmentForm.setVisible(false);
    visualAcuity.setVisible(false);
    occularExResults.setVisible(false);
    homePanel.setVisible(true);
    informationPanel.setVisible(true);

                
    }
	
	public void setActivePatient(Patient thePatient)
	{
		activePatient = thePatient;
		if (activePatient != null)
			currentPatientTextBar.setText(activePatient.getName());
		else
			currentPatientTextBar.setText("No active patient");
	}
	
	public Patient getActivePatient()
	{
		return activePatient;
	}
	
	public void setActiveAppointment(Appointment incomingAppt)
	{
		activeAppointment = incomingAppt;
	}
	
	public Appointment getActiveAppointment()
	{
		return activeAppointment;
	}

	public EyeTestResults getActiveResults() {
		return activeResults;
	}

	public void setActiveResults(EyeTestResults activeResults) {
		this.activeResults = activeResults;
	}
	
	public void showPatientPortal()
	{
            hideAllPanelComponents(mainPanel);
            patientPortal.loadTableAllEntries();
            patientPortal.setVisible(true);
	}
	
	public void showPatientForm()
	{
            hideAllPanelComponents(mainPanel);
            patientForm.setVisible(true);
	}
        
	public void showAppointmentForm()
	{
            hideAllPanelComponents(mainPanel);
            appointmentForm.setVisible(true);
	}       

	/*
	public void showAppointmentForm()
	{
		hideAllPanelComponents(mainPanel);
		newAppointmentForm.setVisable(true);

	}
	*/

	public void showPatientSummaryPage()
	{
		viewPatientPage.loadAllPatientInfo(activePatient);
		hideAllPanelComponents(mainPanel);
		viewPatientPage.setVisible(true);

	}
	
	public void showAppointmentDisplay()
	{
            hideAllPanelComponents(mainPanel);	
            appointmentPanel.loadTableAllEntries();
            appointmentPanel.setVisible(true);

	}
	
	public void showInsurancePage()
	{
            
            try
            {
                insurancePanel.insuranceInfo(activePatient);
                hideAllPanelComponents(mainPanel);
                insurancePanel.setVisible(true);
            }
        
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Select an active patient from Patient Portal to continue.");
               
            }
               
	}
        public void showVisualAcuity()
	{	visualAcuity.loadEyeTestResults();
                hideAllPanelComponents(mainPanel);
                visualAcuity.setVisible(true);
	}
        public void showOccularExResults()
	{	occularExResults.loadOcularResults();
                hideAllPanelComponents(mainPanel);
                occularExResults.setVisible(true);
	}
        public void showHomePanel()
	{
                hideAllPanelComponents(mainPanel);
                homePanel.setVisible(true);
                
	}
        public void showViewFutureAppointments()
	{ 
                hideAllPanelComponents(mainPanel);
            
	}
        public void showInformationPanel()
	{	
                hideAllPanelComponents(mainPanel);
                informationPanel.setVisible(true);
	}
	public void hideAllPanelComponents(JPanel theComp)
	{
		for(Component itsComp : theComp.getComponents())
		{
			itsComp.setVisible(false);
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

        background = new javax.swing.JPanel();
        toolBarJPanel = new javax.swing.JPanel();
        homeBttn = new javax.swing.JLabel();
        infoBttb = new javax.swing.JLabel();
        appointmentBttn = new javax.swing.JLabel();
        patientPortalBttn = new javax.swing.JLabel();
        insuranceBttn = new javax.swing.JLabel();
        helpBttn = new javax.swing.JLabel();
        emrToolsTxt = new javax.swing.JLabel();
        helpToolsTxt = new javax.swing.JLabel();
        homeTxt = new javax.swing.JLabel();
        emrToolsTxt1 = new javax.swing.JLabel();
        CurrentPatientLabel = new javax.swing.JLabel();
        currentPatientTextBar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        emrToolsTxt2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(getPreferredSize());

        background.setBackground(new java.awt.Color(57, 113, 177));
        background.setPreferredSize(new java.awt.Dimension(1900, 119));

        toolBarJPanel.setBackground(new java.awt.Color(53, 60, 81));
        toolBarJPanel.setAutoscrolls(true);
        toolBarJPanel.setMaximumSize(new java.awt.Dimension(2147483647, 100));
        toolBarJPanel.setMinimumSize(new java.awt.Dimension(1190, 100));
        toolBarJPanel.setPreferredSize(new java.awt.Dimension(1900, 90));
        toolBarJPanel.setRequestFocusEnabled(false);

        homeBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/homeIcon.png"))); // NOI18N
        homeBttn.setToolTipText("Home");
        homeBttn.setDisabledIcon(null);
        homeBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBttnMouseClicked(evt);
            }
        });

        infoBttb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/infoIcon2.png"))); // NOI18N
        infoBttb.setToolTipText("Information About Visions");
        infoBttb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoBttbMouseClicked(evt);
            }
        });

        appointmentBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appointmentBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/appointmentIcon.png"))); // NOI18N
        appointmentBttn.setToolTipText("Appointments");
        appointmentBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentBttnMouseClicked(evt);
            }
        });

        patientPortalBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/patientIcon.png"))); // NOI18N
        patientPortalBttn.setToolTipText("Patient Portal");
        patientPortalBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientPortalBttnMouseClicked(evt);
            }
        });

        insuranceBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insuranceBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/insuranceIcon.png"))); // NOI18N
        insuranceBttn.setToolTipText("Insurance");
        insuranceBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insuranceBttnMouseClicked(evt);
            }
        });

        helpBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/infoIcon.png"))); // NOI18N

        emrToolsTxt.setBackground(new java.awt.Color(255, 255, 255));
        emrToolsTxt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        emrToolsTxt.setForeground(new java.awt.Color(255, 255, 255));
        emrToolsTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emrToolsTxt.setText("Patient Portal");

        helpToolsTxt.setBackground(new java.awt.Color(255, 255, 255));
        helpToolsTxt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        helpToolsTxt.setForeground(new java.awt.Color(255, 255, 255));
        helpToolsTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpToolsTxt.setText("Help Tools");

        homeTxt.setBackground(new java.awt.Color(255, 255, 255));
        homeTxt.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        homeTxt.setForeground(new java.awt.Color(255, 255, 255));
        homeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTxt.setText("Home");

        emrToolsTxt1.setBackground(new java.awt.Color(255, 255, 255));
        emrToolsTxt1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        emrToolsTxt1.setForeground(new java.awt.Color(255, 255, 255));
        emrToolsTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emrToolsTxt1.setText("Insurance ");

        CurrentPatientLabel.setFont(helpToolsTxt.getFont());
        CurrentPatientLabel.setForeground(new java.awt.Color(255, 255, 255));
        CurrentPatientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentPatientLabel.setText("Active Patient");
        CurrentPatientLabel.setToolTipText("");
        CurrentPatientLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        currentPatientTextBar.setBackground(new java.awt.Color(204, 255, 255));
        currentPatientTextBar.setFont(helpToolsTxt.getFont());
        currentPatientTextBar.setToolTipText("Current Patient");
        currentPatientTextBar.setOpaque(true);

        emrToolsTxt2.setBackground(new java.awt.Color(255, 255, 255));
        emrToolsTxt2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        emrToolsTxt2.setForeground(new java.awt.Color(255, 255, 255));
        emrToolsTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emrToolsTxt2.setText("Appointments");

        javax.swing.GroupLayout toolBarJPanelLayout = new javax.swing.GroupLayout(toolBarJPanel);
        toolBarJPanel.setLayout(toolBarJPanelLayout);
        toolBarJPanelLayout.setHorizontalGroup(
            toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolBarJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toolBarJPanelLayout.createSequentialGroup()
                        .addComponent(homeBttn)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addComponent(homeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236)
                .addGroup(toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(toolBarJPanelLayout.createSequentialGroup()
                        .addComponent(patientPortalBttn)
                        .addGap(162, 162, 162)
                        .addComponent(appointmentBttn)
                        .addGap(176, 176, 176)
                        .addComponent(insuranceBttn)
                        .addGap(89, 89, 89))
                    .addGroup(toolBarJPanelLayout.createSequentialGroup()
                        .addComponent(emrToolsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(emrToolsTxt2)
                        .addGap(130, 130, 130)
                        .addComponent(emrToolsTxt1)
                        .addGap(68, 68, 68)))
                .addGroup(toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toolBarJPanelLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(CurrentPatientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(toolBarJPanelLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(currentPatientTextBar, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toolBarJPanelLayout.createSequentialGroup()
                        .addComponent(infoBttb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(helpBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(helpToolsTxt))
                .addGap(12, 12, 12))
        );
        toolBarJPanelLayout.setVerticalGroup(
            toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolBarJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpBttn)
                    .addComponent(infoBttb))
                .addGap(18, 18, 18)
                .addComponent(helpToolsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(toolBarJPanelLayout.createSequentialGroup()
                .addGroup(toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toolBarJPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(toolBarJPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(homeBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(currentPatientTextBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insuranceBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appointmentBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientPortalBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(toolBarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emrToolsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emrToolsTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emrToolsTxt1)
                            .addComponent(CurrentPatientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(toolBarJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(57, 113, 177));
        mainPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        mainPanel.setPreferredSize(new java.awt.Dimension(1900, 900));
        mainPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                mainPanelComponentShown(evt);
            }
        });
        mainPanel.setLayout(new java.awt.CardLayout());
        jScrollPane1.setViewportView(mainPanel);
        mainPanel.getAccessibleContext().setAccessibleName("mainPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientPortalBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientPortalBttnMouseClicked

        System.out.println("Patient Portal Bttn Clicked: " + evt.getClickCount());
        showPatientPortal();
    }//GEN-LAST:event_patientPortalBttnMouseClicked

    private void appointmentBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentBttnMouseClicked

        System.out.println("Appointment Bttn Clicked: " + evt.getClickCount());
	showAppointmentDisplay();
    }//GEN-LAST:event_appointmentBttnMouseClicked

    private void insuranceBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insuranceBttnMouseClicked
        
        System.out.print("Insurance Bttn Clicked: " + evt.getClickCount());
	showInsurancePage();       
    }//GEN-LAST:event_insuranceBttnMouseClicked

    private void homeBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBttnMouseClicked
        hideAllPanelComponents(mainPanel);	
        showHomePanel();
        
    }//GEN-LAST:event_homeBttnMouseClicked

    private void mainPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_mainPanelComponentShown
        // TODO add your handling code here:
        showHomePanel();
    }//GEN-LAST:event_mainPanelComponentShown

    private void infoBttbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBttbMouseClicked
        // TODO add your handling code here:
        showInformationPanel();
    }//GEN-LAST:event_infoBttbMouseClicked

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
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDashboard().setVisible(true);
                
                
                //MainWindow.add(new PatientPortal);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentPatientLabel;
    private javax.swing.JLabel appointmentBttn;
    private javax.swing.JPanel background;
    public javax.swing.JLabel currentPatientTextBar;
    private javax.swing.JLabel emrToolsTxt;
    private javax.swing.JLabel emrToolsTxt1;
    private javax.swing.JLabel emrToolsTxt2;
    private javax.swing.JLabel helpBttn;
    private javax.swing.JLabel helpToolsTxt;
    private javax.swing.JLabel homeBttn;
    private javax.swing.JLabel homeTxt;
    private javax.swing.JLabel infoBttb;
    private javax.swing.JLabel insuranceBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel patientPortalBttn;
    private javax.swing.JPanel toolBarJPanel;
    // End of variables declaration//GEN-END:variables
}
