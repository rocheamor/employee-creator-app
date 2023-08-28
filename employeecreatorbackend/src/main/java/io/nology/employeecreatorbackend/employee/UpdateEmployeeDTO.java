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
