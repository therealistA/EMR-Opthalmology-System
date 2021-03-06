/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs499_ophthalmology_emr;

import java.util.ArrayList;
import java.util.List;

/**
 * A Java object representing one patient entry in the SQL database.
 * 
 */
public class Patient
{
    private String name;
    private String address;
    private Integer age;
    private Integer zip;
    private final Integer patientID;
    private String homePhone;
    private String workPhone;
    private String mobilePhone;
    private String gender;
    private String title;
    private Integer dateOfBirth;
    private String emailAddress;
    private String ssn;
    private String emgergContactNum;
    private String emergContactName;
    private String insProvider;
    private String insContractNo;
    private String insGroupNo;
    private Integer insEffectiveDate;
    private Double insCoPayAmount;
    private Double insTotalAmtCharged;
    private String insProviderAddr;
    private String insProviderPhone;
    
    private List<Appointment> appointmentList = new ArrayList<>();
	
	public Patient(Integer _patientID)
	{
		this.patientID = _patientID;
		this.name = "";
		this.address = "";
		this.age = -1;
		this.zip = -1;
		this.homePhone = "";
		this.workPhone = "";
		this.mobilePhone = "";
		this.gender = "";
		this.title = "";
		this.dateOfBirth = -1;
		this.emailAddress = "";
		this.ssn = "";
		this.emgergContactNum = "";
		this.emergContactName = "";
		this.insProvider = "";
		this.insContractNo = "";
		this.insGroupNo = "";
		this.insEffectiveDate = -1;
		this.insCoPayAmount = -1.0;
        this.insTotalAmtCharged = -1.0;
		this.insProviderAddr = "";
		this.insProviderPhone = "";
	}
	
	/**
	 * Appends an Appointment object to a Patient object's list of Appointments.
	 * @param theAppointment The Appointment object to append to the Patient's list.
	 */
	public void attachAppointment(Appointment theAppointment)
	{
		appointmentList.add(theAppointment);
	}
	
	/**
	 * Removes an Appointment with matching ID from a Patient's list of Appointments.
	 * @param appointmentID The ID of the appointment to match.
	 */
	public void removeAppointment(Integer appointmentID)
	{
		for (Appointment listElement : appointmentList) // for each listElement in appointmentList...
		{
			if (listElement.getApptID() == appointmentID)
			{
				appointmentList.remove(listElement);
			}
		}
	}
	
	public void removeAppointment(Appointment theAppointment)
	{
		for (Appointment listElement : appointmentList) // for each listElement in appointmentList...
		{
			if (listElement == theAppointment)
			{
				appointmentList.remove(listElement);
			}
		}
	}
	
	
	/**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
	
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the zip
     */
    public Integer getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(Integer zip) {
        this.zip = zip;
    }

    /**
     * @return the patientID
     */
    public Integer getPatientID() {
        return patientID;
    }

    /**
     * @param patientID the patientID to set
     */
/*	
    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }
*/
    /**
     * @return the homePhone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * @param homePhone the homePhone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @return the workPhone
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * @param workPhone the workPhone to set
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    /**
     * @return the mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * @param mobilePhone the mobilePhone to set
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
	
	/**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the gender to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the dateOfBirth
     */
    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * @return the emgergContactNum
     */
    public String getEmergContactPhone() {
        return emgergContactNum;
    }

    /**
     * @param emgergContactNum the emgergContactNum to set
     */
    public void setEmergContactPhone(String emgergContactNum) {
        this.emgergContactNum = emgergContactNum;
    }

    /**
     * @return the emergContactName
     */
    public String getEmergContactName() {
        return emergContactName;
    }

    /**
     * @param emergContactName the emergContactName to set
     */
    public void setEmergContactName(String emergContactName) {
        this.emergContactName = emergContactName;
    }

    /**
     * @return the insProvider
     */
    public String getInsProvider() {
        return insProvider;
    }

    /**
     * @param insProvider the insProvider to set
     */
    public void setInsProvider(String insProvider) {
        this.insProvider = insProvider;
    }

    /**
     * @return the insContactNo
     */
    public String getInsContractNo() {
        return insContractNo;
    }

    /**
     * @param insContractNo the insContactNo to set
     */
    public void setInsContractNo(String insContractNo) {
        this.insContractNo = insContractNo;
    }

    /**
     * @return the insGroupNo
     */
    public String getInsGroupNo() {
        return insGroupNo;
    }

    /**
     * @param insGroupNo the insGroupNo to set
     */
    public void setInsGroupNo(String insGroupNo) {
        this.insGroupNo = insGroupNo;
    }

    /**
     * @return the insEffectiveDate
     */
    public Integer getInsEffectiveDate() {
        return insEffectiveDate;
    }

    /**
     * @param insEffectiveDate the insEffectiveDate to set
     */
    public void setInsEffectiveDate(Integer insEffectiveDate) {
        this.insEffectiveDate = insEffectiveDate;
    }

    /**
     * @return the insCoPayAmount
     */
    public double getInsCoPayAmount() {
        return insCoPayAmount;
    }

    /**
     * @param insCoPayAmount the insCoPayAmount to set
     */
    public void setInsCoPayAmount(double insCoPayAmount) {
        this.insCoPayAmount = insCoPayAmount;
    }
    /**
     * @return the insCoPayAmount
     */
    public double getinsTotalAmtCharged() {
        return insTotalAmtCharged;
    }

    /**
     * @param insCoPayAmount the insCoPayAmount to set
     */
    public void setinsTotalAmtCharged(double insTotalAmtCharged) {
        this.insTotalAmtCharged = insTotalAmtCharged;
    }
    /**
     * @return the insProviderAddr
     */
    public String getInsProviderAddr() {
        return insProviderAddr;
    }

    /**
     * @param insProviderAddr the insProviderAddr to set
     */
    public void setInsProviderAddr(String insProviderAddr) {
        this.insProviderAddr = insProviderAddr;
    }

    /**
     * @return the insProviderPhone
     */
    public String getInsProviderPhone() {
        return insProviderPhone;
    }

    /**
     * @param insProviderPhone the insProviderPhone to set
     */
    public void setInsProviderPhone(String insProviderPhone) {
        this.insProviderPhone = insProviderPhone;
    }

    /**
     * @return the appointmentList
     */
    public List<Appointment> getAppointmentList() {
        return appointmentList;
    } 
	
}
