package data;

import java.time.LocalDate;

public class President {
	private String name;
	private String picURL;
	private int termNumber;
	private LocalDate termBeginDate;
	private LocalDate termEndDate;
	private String fact;
	/**
	 * @param name
	 * @param picURL
	 * @param termNumber
	 * @param termBeginDate
	 * @param termEndDate
	 * @param fact
	 */
	public President(String name, String picURL, int termNumber, LocalDate termBeginDate, LocalDate termEndDate,
			String fact) {
		super();
		this.name = name;
		this.picURL = picURL;
		this.termNumber = termNumber;
		this.termBeginDate = termBeginDate;
		this.termEndDate = termEndDate;
		this.fact = fact;
	}
	/**
	 *
	 */
	public President() {
		super();
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
	 * @return the picURL
	 */
	public String getPicURL() {
		return picURL;
	}
	/**
	 * @param picURL the picURL to set
	 */
	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	/**
	 * @return the termNumber
	 */
	public int getTermNumber() {
		return termNumber;
	}
	/**
	 * @param termNumber the termNumber to set
	 */
	public void setTermNumber(int termNumber) {
		this.termNumber = termNumber;
	}
	/**
	 * @return the termBeginDate
	 */
	public LocalDate getTermBeginDate() {
		return termBeginDate;
	}
	/**
	 * @param termBeginDate the termBeginDate to set
	 */
	public void setTermBeginDate(LocalDate termBeginDate) {
		this.termBeginDate = termBeginDate;
	}
	/**
	 * @return the termEndDate
	 */
	public LocalDate getTermEndDate() {
		return termEndDate;
	}
	/**
	 * @param termEndDate the termEndDate to set
	 */
	public void setTermEndDate(LocalDate termEndDate) {
		this.termEndDate = termEndDate;
	}
	/**
	 * @return the fact
	 */
	public String getFact() {
		return fact;
	}
	/**
	 * @param fact the fact to set
	 */
	public void setFact(String fact) {
		this.fact = fact;
	}


}
