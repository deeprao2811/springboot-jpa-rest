package com.vintellus.sfa.model;

//import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "meeting")
@EntityListeners(AuditingEntityListener.class)
public class Meeting {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long meetingId;

	String meetingNumber;

	String subject;
	String location;
//	String statusCode;
//	Timestamp startDate;
//	Timestamp endDate;
//	Integer ownerUserId;
//	String description;
//	Boolean allDayFlag;
//	Boolean recurrenceFlag;
//	Integer recurReq;
//	Timestamp recurEndDate;
//	Integer customerId;
//	String sourceTypeCode;
//	Integer sourceTypeId;
	
	public Long getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}
	public String getMeetingNumber() {
		return meetingNumber;
	}
	public void setMeetingNumber(String meetingNumber) {
		this.meetingNumber = meetingNumber;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
//	public String getStatusCode() {
//		return statusCode;
//	}
//	public void setStatusCode(String statusCode) {
//		this.statusCode = statusCode;
//	}
//	public Timestamp getStartDate() {
//		return startDate;
//	}
//	public void setStartDate(Timestamp startDate) {
//		this.startDate = startDate;
//	}
//	public Timestamp getEndDate() {
//		return endDate;
//	}
//	public void setEndDate(Timestamp endDate) {
//		this.endDate = endDate;
//	}
//	public Integer getOwnerUserId() {
//		return ownerUserId;
//	}
//	public void setOwnerUserId(Integer ownerUserId) {
//		this.ownerUserId = ownerUserId;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public Boolean getAllDayFlag() {
//		return allDayFlag;
//	}
//	public void setAllDayFlag(Boolean allDayFlag) {
//		this.allDayFlag = allDayFlag;
//	}
//	public Boolean getRecurrenceFlag() {
//		return recurrenceFlag;
//	}
//	public void setRecurrenceFlag(Boolean recurrenceFlag) {
//		this.recurrenceFlag = recurrenceFlag;
//	}
//	public Integer getRecurReq() {
//		return recurReq;
//	}
//	public void setRecurReq(Integer recurReq) {
//		this.recurReq = recurReq;
//	}
//	public Timestamp getRecurEndDate() {
//		return recurEndDate;
//	}
//	public void setRecurEndDate(Timestamp recurEndDate) {
//		this.recurEndDate = recurEndDate;
//	}
//	public Integer getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(Integer customerId) {
//		this.customerId = customerId;
//	}
//	public String getSourceTypeCode() {
//		return sourceTypeCode;
//	}
//	public void setSourceTypeCode(String sourceTypeCode) {
//		this.sourceTypeCode = sourceTypeCode;
//	}
//	public Integer getSourceTypeId() {
//		return sourceTypeId;
//	}
//	public void setSourceTypeId(Integer sourceTypeId) {
//		this.sourceTypeId = sourceTypeId;
//	}
	
}
