package data;

public class President {
	private int termNumber;
	private String name;
	private String party;
	private String termBeginDate;
	private String termEndDate;
	private String picURL;
	private String fact;
	/**
	 * @param termNumber
	 * @param name
	 * @param party
	 * @param termBeginDate
	 * @param termEndDate
	 * @param picURL
	 * @param fact
	 */
	public President(int termNumber, String name, String party, String termBeginDate, String termEndDate,
			String picURL, String fact) {
		super();
		this.termNumber = termNumber;
		this.name = name;
		this.party = party;
		this.termBeginDate = termBeginDate;
		this.termEndDate = termEndDate;
		this.picURL = picURL;
		this.fact = fact;
	}
	/**
	 *
	 */
	public President() {
		super();
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
	 * @return the party
	 */
	public String getParty() {
		return party;
	}
	/**
	 * @param party the party to set
	 */
	public void setParty(String party) {
		this.party = party;
	}
	/**
	 * @return the termBeginDate
	 */
	public String getTermBeginDate() {
		return termBeginDate;
	}
	/**
	 * @param termBeginDate the termBeginDate to set
	 */
	public void setTermBeginDate(String termBeginDate) {
		this.termBeginDate = termBeginDate;
	}
	/**
	 * @return the termEndDate
	 */
	public String getTermEndDate() {
		return termEndDate;
	}
	/**
	 * @param termEndDate the termEndDate to set
	 */
	public void setTermEndDate(String termEndDate) {
		this.termEndDate = termEndDate;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("President [termNumber=");
		builder.append(termNumber);
		builder.append(", name=");
		builder.append(name);
		builder.append(", party=");
		builder.append(party);
		builder.append(", termBeginDate=");
		builder.append(termBeginDate);
		builder.append(", termEndDate=");
		builder.append(termEndDate);
		builder.append(", picURL=");
		builder.append(picURL);
		builder.append(", fact=");
		builder.append(fact);
		builder.append("]");
		return builder.toString();
	}


}
