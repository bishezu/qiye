package com.liandi.ems04.entity.advice;

import java.util.Date;


public class Advice {

	private Integer adviceId;//意见编号
	private String adviceTitle;//意见标题
	private Integer staffId;//意见人编号
	private String adviceContent;//意见内容
	private Date adviceTime;//发表意见的时间
	private String adviceTimeString;
	private String replyContent;//回复内容
	private Integer adminId;//回复人编号
	private Date replyTime;//回复时间
	private String replyTimeString;
	
	public Advice() {
		super();
	}

	public Advice(Integer adviceId, String adviceTitle, Integer staffId,
			String adviceContent, Date adviceTime, String replyContent,
			Integer adminId, Date replyTime) {
		super();
		this.adviceId = adviceId;
		this.adviceTitle = adviceTitle;
		this.staffId = staffId;
		this.adviceContent = adviceContent;
		this.adviceTime = adviceTime;
		this.replyContent = replyContent;
		this.adminId = adminId;
		this.replyTime = replyTime;
	}

	@Override
	public String toString() {
		return "Advice [adviceId=" + adviceId + ", adviceTitle=" + adviceTitle
				+ ", staffId=" + staffId + ", adviceContent=" + adviceContent
				+ ", adviceTime=" + adviceTime + ", replyContent="
				+ replyContent + ", adminId=" + adminId + ", replyTime="
				+ replyTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
		result = prime * result
				+ ((adviceContent == null) ? 0 : adviceContent.hashCode());
		result = prime * result
				+ ((adviceId == null) ? 0 : adviceId.hashCode());
		result = prime * result
				+ ((adviceTime == null) ? 0 : adviceTime.hashCode());
		result = prime * result
				+ ((adviceTitle == null) ? 0 : adviceTitle.hashCode());
		result = prime * result
				+ ((replyContent == null) ? 0 : replyContent.hashCode());
		result = prime * result
				+ ((replyTime == null) ? 0 : replyTime.hashCode());
		result = prime * result + ((staffId == null) ? 0 : staffId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Advice other = (Advice) obj;
		if (adminId == null) {
			if (other.adminId != null)
				return false;
		} else if (!adminId.equals(other.adminId))
			return false;
		if (adviceContent == null) {
			if (other.adviceContent != null)
				return false;
		} else if (!adviceContent.equals(other.adviceContent))
			return false;
		if (adviceId == null) {
			if (other.adviceId != null)
				return false;
		} else if (!adviceId.equals(other.adviceId))
			return false;
		if (adviceTime == null) {
			if (other.adviceTime != null)
				return false;
		} else if (!adviceTime.equals(other.adviceTime))
			return false;
		if (adviceTitle == null) {
			if (other.adviceTitle != null)
				return false;
		} else if (!adviceTitle.equals(other.adviceTitle))
			return false;
		if (replyContent == null) {
			if (other.replyContent != null)
				return false;
		} else if (!replyContent.equals(other.replyContent))
			return false;
		if (replyTime == null) {
			if (other.replyTime != null)
				return false;
		} else if (!replyTime.equals(other.replyTime))
			return false;
		if (staffId == null) {
			if (other.staffId != null)
				return false;
		} else if (!staffId.equals(other.staffId))
			return false;
		return true;
	}

	public Integer getAdviceId() {
		return adviceId;
	}

	public void setAdviceId(Integer adviceId) {
		this.adviceId = adviceId;
	}

	public String getAdviceTitle() {
		return adviceTitle;
	}

	public void setAdviceTitle(String adviceTitle) {
		this.adviceTitle = adviceTitle;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getAdviceContent() {
		return adviceContent;
	}

	public void setAdviceContent(String adviceContent) {
		this.adviceContent = adviceContent;
	}

	public Date getAdviceTime() {
		return adviceTime;
	}

	public void setAdviceTime(Date adviceTime) {
		this.adviceTime = adviceTime;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public String getAdviceTimeString() {
		return adviceTimeString;
	}

	public void setAdviceTimeString(String adviceTimeString) {
		this.adviceTimeString = adviceTimeString;
	}

	public String getReplyTimeString() {
		return replyTimeString;
	}

	public void setReplyTimeString(String replyTimeString) {
		this.replyTimeString = replyTimeString;
	}
	
	
}