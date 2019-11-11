/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs499_ophthalmology_emr;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author kenda
 */
public class PatientPortal extends javax.swing.JPanel {
	final Integer PATIENT_ID_COLUMN = 3;
	private MainDashboard mainFrame = null;
	private ArrayList<Patient> patientList = null;
	private DataBaseManager dataBase = DataBaseManager.getInstance();
	private DefaultTableModel tableModel = null;
    /**
     * Creates new form PatientPortal
     */
    public PatientPortal(MainDashboard _mainFrame) {
		mainFrame = _mainFrame;
        initComponents();
		tableModel = (DefaultTableModel) patientPortalTable.getModel();
		loadTableAllEntries();
    }
	
	public void loadTableAllEntries()
	{
		String patientName = null;
		String patientAddr = null;
		Integer patientDoB = null;
		Integer patientID = null;
		
		patientList = dataBase.getAllPatients();
		tableModel.setRowCount(0);		// Clear all rows, in anticipation of update.
		
		for (Patient currentPatient: patientList)
		{
			patientName = currentPatient.getName();
			patientAddr = currentPatient.getAddress();
			patientDoB = currentPatient.getDateOfBirth();
			patientID = currentPatient.getPatientID();
			
			tableModel.addRow(new Object[] {patientName, patientAddr, patientDoB, patientID});
		}
		
	}
	
	public void loadTableFromList(ArrayList<Patient> theList)
	{
		String patientName = null;
		String patientAddr = null;
		Integer patientDoB = null;
		Integer patientID = null;
		
		patientList = theList;
		tableModel.setRowCount(0);		// Clear all rows, in anticipation of update.
		
		for (Patient currentPatient: patientList)
		{
			patientName = currentPatient.getName();
			patientAddr = currentPatient.getAddress();
			patientDoB = currentPatient.getDateOfBirth();
			patientID = currentPatient.getPatientID();
			
			tableModel.addRow(new Object[] {patientName, patientAddr, patientDoB, patientID});
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

        jLabel4 = new javax.swing.JLabel();
        patientSearchBar = new javax.swing.JTextField();
        patientSearchSubmitButton = new javax.swing.JButton();
        deletePatientButton = new javax.swing.JButton();
        editPatientButton = new javax.swing.JButton();
        addPatientButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientPortalTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(185, 134, 11));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("Patient Portal");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        patientSearchBar.setText("Search for patient name");
        patientSearchBar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        patientSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patientSearchBarKeyPressed(evt);
            }
        });

        patientSearchSubmitButton.setText("Search");
        patientSearchSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSearchSubmitButtonActionPerformed(evt);
            }
        });

        deletePatientButton.setText("Delete Patient");
        deletePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientButtonActionPerformed(evt);
            }
        });
        deletePatientButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deletePatientButtonKeyPressed(evt);
            }
        });

        editPatientButton.setText("Edit Patient");
        editPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientButtonActionPerformed(evt);
            }
        });

        addPatientButton.setText("Add Patient");
        addPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientButtonActionPerformed(evt);
            }
        });

        patientPortalTable.setAutoCreateRowSorter(true);
        patientPortalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Address", "DoB (MM/DD/YYYY)", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientPortalTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patientPortalTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(patientPortalTable);
        if (patientPortalTable.getColumnModel().getColumnCount() > 0) {
            patientPortalTable.getColumnModel().getColumn(3).setMinWidth(50);
            patientPortalTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            patientPortalTable.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(patientSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientSearchSubmitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editPatientButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addPatientButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                        .addComponent(deletePatientButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientSearchSubmitButton)
                    .addComponent(patientSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPatientButton)
                    .addComponent(addPatientButton)
                    .addComponent(deletePatientButton))
                .addGap(12, 12, 12))
        );

        getAccessibleContext().setAccessibleName("patientPortalPanel");
        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void patientSearchSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSearchSubmitButtonActionPerformed
        System.out.println("Patient Portal: Search button");
		String patientName = patientSearchBar.getText();
		ArrayList<Patient> patientList = dataBase.searchForPatientName(patientName);
		loadTableFromList(patientList);
    }//GEN-LAST:event_patientSearchSubmitButtonActionPerformed

    private void editPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPatientButtonActionPerformed
        System.out.println("Patient Portal: Edit button");
		Integer selectedRow = patientPortalTable.getSelectedRow();
		Integer patientID = (Integer)patientPortalTable.getValueAt(selectedRow, PATIENT_ID_COLUMN);
		Patient thePatient = dataBase.getPatientByID(patientID);
		mainFrame.newPatientForm.loadPatientInfo(thePatient);
		mainFrame.showPatientForm();
    }//GEN-LAST:event_editPatientButtonActionPerformed

    private void deletePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientButtonActionPerformed
        
		if (evt != null)
			System.out.println("Patient Portal: Delete button");
		else
			System.out.println("Patient Portal: Delete key");
		
		Integer selectedCol = patientPortalTable.getSelectedColumn();
		Integer selectedRow = patientPortalTable.getSelectedRow();
		if ((selectedRow >= 0) && (selectedCol >=0))
		{
			Integer patientID = (Integer)patientPortalTable.getValueAt(selectedRow, PATIENT_ID_COLUMN);

			tableModel.removeRow(selectedRow);

			Patient theVictim = dataBase.getPatientByID(patientID);
			dataBase.delete(theVictim);
		}
		
    }//GEN-LAST:event_deletePatientButtonActionPerformed

    private void deletePatientButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deletePatientButtonKeyPressed
        
    }//GEN-LAST:event_deletePatientButtonKeyPressed

    private void patientPortalTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientPortalTableKeyPressed
        //System.out.println("Patient Portal: Delete key");
		if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE)
		{
			deletePatientButtonActionPerformed(null);
		}
    }//GEN-LAST:event_patientPortalTableKeyPressed

    private void addPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientButtonActionPerformed
        System.out.println("Patient Portal: Add button");
		mainFrame.showPatientForm();
    }//GEN-LAST:event_addPatientButtonActionPerformed

    private void patientSearchBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientSearchBarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
		{
			patientSearchSubmitButtonActionPerformed(null);
		}
    }//GEN-LAST:event_patientSearchBarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientButton;
    private javax.swing.JButton deletePatientButton;
    private javax.swing.JButton editPatientButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientPortalTable;
    private javax.swing.JTextField patientSearchBar;
    private javax.swing.JButton patientSearchSubmitButton;
    // End of variables declaration//GEN-END:variables
}
