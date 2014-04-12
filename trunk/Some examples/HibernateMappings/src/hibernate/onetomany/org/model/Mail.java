package org.model;

public class Mail {

	private int mailId;
	private String email;
	private String emailType;

	public int getMailId() {
		return mailId;
	}

	public void setMailId(int mailId) {
		this.mailId = mailId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	@Override
	public String toString() {
		return "Mail [mailId=" + mailId + ", email=" + email + ", emailType="
				+ emailType + "]";
	}

}
