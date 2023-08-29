package io.nology.employeecreatorbackend.employee;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public class UpdateEmployeeDTO {

	@Pattern(regexp = "^(?=\\S).*$", message="First name cannot be an empty string")
	String firstName;
	
	@Pattern(regexp = "^(?=\\S).*$", message="Middle name cannot be an empty string")
	String middleName;
	
	@Pattern(regexp = "^(?=\\S).*$", message="Last name cannot be an empty string")
	String lastName;
	
	@Pattern(regexp = "^(?=\\S).*$", message="Email cannot be an empty string")
	@Email
	String email;
	
	@Pattern(regexp = "^\\d{10}$", message="Mobile number must be 10-digits")
	String mobileNumber;
	
	@Pattern(regexp = "^(?=\\S).*$", message="Address cannot be an empty string")
	String address;
	
	String contractType;
	
	Date startDate;
	
	Date finishDate;
	
	boolean ongoing;
	
	String workType;
	
	double hoursPerWeek;

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContractType() {
		return contractType;
	}


	public void setContractType(String contractType) {
		this.contractType = contractType;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getFinishDate() {
		return finishDate;
	}


	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}


	public boolean isOngoing() {
		return ongoing;
	}


	public void setOngoing(boolean ongoing) {
		this.ongoing = ongoing;
	}


	public String getWorkType() {
		return workType;
	}


	public void setWorkType(String workType) {
		this.workType = workType;
	}


	public double getHoursPerWeek() {
		return hoursPerWeek;
	}


	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}


	public UpdateEmployeeDTO(
			@Pattern(regexp = "^(?=\\S).*$", message = "First name cannot be an empty string") String firstName,
			@Pattern(regexp = "^(?=\\S).*$", message = "Middle name cannot be an empty string") String middleName,
			@Pattern(regexp = "^(?=\\S).*$", message = "Last name cannot be an empty string") String lastName,
			@Pattern(regexp = "^(?=\\S).*$", message = "Email cannot be an empty string") @Email String email,
			@Pattern(regexp = "^\\d{10}$", message = "Mobile number must be 10-digits") String mobileNumber,
			@Pattern(regexp = "^(?=\\S).*$", message = "Address cannot be an empty string") String address,
			String contractType, Date startDate, Date finishDate, boolean ongoing, String workType,
			double hoursPerWeek) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.contractType = contractType;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.ongoing = ongoing;
		this.workType = workType;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	
	
}
