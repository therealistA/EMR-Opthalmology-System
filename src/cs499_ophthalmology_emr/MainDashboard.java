/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs499_ophthalmology_emr;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author angelaallison
 */
public class MainDashboard extends javax.swing.JFrame {
    
    public PatientPortal pPanel;

  //  public NewPatientsForm newPatientForm;
    public AppointmentDisplay appointmentPanel;
    public InsurancePage insurancePanel;
    public HomePanel homePanel;
    //public ViewFutureAppointments viewFutureAppts;

    public PatientForm newPatientForm;
    //public AppointmentForm newAppointmentForm;
    public JPanel mainWindow;		// TODO: Remove this.
    //public AppointmentDisplay appointmentPanel;
   // public InsurancePage insurancePanel;
	
    private Patient activePatient;

    
        
        
    /**
     * Creates new form MainWindow
     */
    public MainDashboard() {
        initComponents();

		
       // newPatientForm      = new NewPatientsForm(this);
        pPanel              = new PatientPortal(this);
	appointmentPanel    = new AppointmentDisplay(this);
	insurancePanel      = new InsurancePage();
        homePanel           = new HomePanel();

	//mainWindow = new JPanel();	// This JPanel doesn't exist anywhere. Use mainPanel to display cards and stuff
        newPatientForm = new PatientForm(this);
        //newAppointmentForm = new AppointmentForm(this);
	pPanel = new PatientPortal(this);
	appointmentPanel = new AppointmentDisplay(this);
	insurancePanel = new InsurancePage();
        

		
        mainPanel.add(pPanel);
	mainPanel.add(newPatientForm);
        //mainPanel.add(newAppointmentForm);
	mainPanel.add(appointmentPanel);
	mainPanel.add(insurancePanel);
        mainPanel.add(homePanel);
       // mainPanel.add(viewFutureAppts);
                
      
    }
	
	public void setActivePatient(Patient thePatient)
	{
		
	}
	
	public Patient getActivePatient()
	{
		return activePatient;
	}
	
	public void showPatientPortal()
	{
            hideAllPanelComponents(mainPanel);
            pPanel.loadTableAllEntries();
            pPanel.setVisible(true);
	}
	
	public void showPatientForm()
	{
            hideAllPanelComponents(mainPanel);
            newPatientForm.setVisible(true);
	}
        
        /*
        public void showAppointmentForm()
        {
            hideAllPanelComponents(mainPanel);
            newAppointmentForm.setVisable(true);
            
        }
        */
	
	public void showAppointmentDisplay()
	{
            hideAllPanelComponents(mainPanel);
            appointmentPanel.setVisible(true);
	}
	
	public void showInsurancePage()
	{
            hideAllPanelComponents(mainPanel);
            insurancePanel.setVisible(true);
	}
        public void showHomePanel()
	{
            hideAllPanelComponents(mainPanel);
            homePanel.setVisible(true);
	}
        public void showViewFutureAppointments()
	{ 
            hideAllPanelComponents(mainPanel);
            //viewFutureAppts.setVisible(true);
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
        eyeTestBttn = new javax.swing.JLabel();
        helpBttn = new javax.swing.JLabel();
        emrToolsTxt = new javax.swing.JLabel();
        helpToolsTxt = new javax.swing.JLabel();
        homeTxt = new javax.swing.JLabel();
        emrToolsTxt1 = new javax.swing.JLabel();
        CurrentPatientLabel = new javax.swing.JLabel();
        currentPatient = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(57, 113, 177));
        background.setPreferredSize(new java.awt.Dimension(1280, 730));

        toolBarJPanel.setBackground(new java.awt.Color(53, 60, 81));
        toolBarJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/homeIcon.png"))); // NOI18N
        homeBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBttnMouseClicked(evt);
            }
        });
        toolBarJPanel.add(homeBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        infoBttb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/infoIcon2.png"))); // NOI18N
        toolBarJPanel.add(infoBttb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, 50));

        appointmentBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appointmentBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/appointmentIcon.png"))); // NOI18N
        appointmentBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentBttnMouseClicked(evt);
            }
        });
        toolBarJPanel.add(appointmentBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 70));

        patientPortalBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/patientIcon.png"))); // NOI18N
        patientPortalBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientPortalBttnMouseClicked(evt);
            }
        });
        toolBarJPanel.add(patientPortalBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 70));

        insuranceBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insuranceBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/insuranceIcon.png"))); // NOI18N
        insuranceBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insuranceBttnMouseClicked(evt);
            }
        });
        toolBarJPanel.add(insuranceBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 70));

        eyeTestBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/eyeTestIcon.png"))); // NOI18N
        toolBarJPanel.add(eyeTestBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, 70));

        helpBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs499_ophthalmology_emr/images/infoIcon.png"))); // NOI18N
        toolBarJPanel.add(helpBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 50, 70));

        emrToolsTxt.setBackground(new java.awt.Color(255, 255, 255));
        emrToolsTxt.setFont(new java.awt.Font("Corsiva Hebrew", 2, 14)); // NOI18N
        emrToolsTxt.setForeground(new java.awt.Color(255, 255, 255));
        emrToolsTxt.setText("EMR Tools");
        toolBarJPanel.add(emrToolsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 20));

        helpToolsTxt.setBackground(new java.awt.Color(255, 255, 255));
        helpToolsTxt.setFont(new java.awt.Font("Corsiva Hebrew", 2, 14)); // NOI18N
        helpToolsTxt.setForeground(new java.awt.Color(255, 255, 255));
        helpToolsTxt.setText("Help Tools");
        toolBarJPanel.add(helpToolsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, -1, 20));

        homeTxt.setBackground(new java.awt.Color(255, 255, 255));
        homeTxt.setFont(new java.awt.Font("Corsiva Hebrew", 2, 14)); // NOI18N
        homeTxt.setForeground(new java.awt.Color(255, 255, 255));
        homeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTxt.setText("Home");
        toolBarJPanel.add(homeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 20));

        emrToolsTxt1.setBackground(new java.awt.Color(255, 255, 255));
        emrToolsTxt1.setFont(new java.awt.Font("Corsiva Hebrew", 2, 14)); // NOI18N
        emrToolsTxt1.setText("EMR Tools");
        toolBarJPanel.add(emrToolsTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 20));

        CurrentPatientLabel.setFont(helpToolsTxt.getFont());
        CurrentPatientLabel.setForeground(new java.awt.Color(255, 255, 255));
        CurrentPatientLabel.setText("Current Patient");
        toolBarJPanel.add(CurrentPatientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, -1, -1));

        currentPatient.setBackground(new java.awt.Color(255, 255, 255));
        currentPatient.setFont(helpToolsTxt.getFont());
        currentPatient.setOpaque(true);
        toolBarJPanel.add(currentPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 40, 240, 20));

        mainPanel.setBackground(new java.awt.Color(57, 113, 177));
        mainPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        mainPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                mainPanelComponentShown(evt);
            }
        });
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(toolBarJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.getAccessibleContext().setAccessibleName("mainPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_mainPanelComponentShown
        // TODO add your handling code here:
        showHomePanel();
    }//GEN-LAST:event_mainPanelComponentShown

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
		//emrLogo.setVisible(true);
                showHomePanel();
        
    }//GEN-LAST:event_homeBttnMouseClicked

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
    private javax.swing.JLabel currentPatient;
    private javax.swing.JLabel emrToolsTxt;
    private javax.swing.JLabel emrToolsTxt1;
    private javax.swing.JLabel eyeTestBttn;
    private javax.swing.JLabel helpBttn;
    private javax.swing.JLabel helpToolsTxt;
    private javax.swing.JLabel homeBttn;
    private javax.swing.JLabel homeTxt;
    private javax.swing.JLabel infoBttb;
    private javax.swing.JLabel insuranceBttn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel patientPortalBttn;
    private javax.swing.JPanel toolBarJPanel;
    // End of variables declaration//GEN-END:variables
}
