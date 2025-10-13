package edu.kh.project.model.dto;

public class DatePlan {
	private String applicant;
	private String receiver;
	private String date;
	
	public DatePlan() {}
	
	public DatePlan(String applicant, String receiver, String date) {
		super();
		this.applicant = applicant;
		this.receiver = receiver;
		this.date = date;
	}

	/**
	 * @return the applicant
	 */
	public String getApplicant() {
		return applicant;
	}

	/**
	 * @param applicant the applicant to set
	 */
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	/**
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
}


