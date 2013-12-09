package com.jshop.entity;

// Generated 2013-12-9 16:30:46 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ActHiActinst generated by hbm2java
 */
@Entity
@Table(name = "act_hi_actinst", catalog = "jshoper3")
public class ActHiActinst implements java.io.Serializable {

	private String id;
	private String procDefId;
	private String procInstId;
	private String executionId;
	private String actId;
	private String taskId;
	private String callProcInstId;
	private String actName;
	private String actType;
	private String assignee;
	private Date startTime;
	private Date endTime;
	private Long duration;

	public ActHiActinst() {
	}

	public ActHiActinst(String id, String procDefId, String procInstId,
			String executionId, String actId, String actType, Date startTime) {
		this.id = id;
		this.procDefId = procDefId;
		this.procInstId = procInstId;
		this.executionId = executionId;
		this.actId = actId;
		this.actType = actType;
		this.startTime = startTime;
	}

	public ActHiActinst(String id, String procDefId, String procInstId,
			String executionId, String actId, String taskId,
			String callProcInstId, String actName, String actType,
			String assignee, Date startTime, Date endTime, Long duration) {
		this.id = id;
		this.procDefId = procDefId;
		this.procInstId = procInstId;
		this.executionId = executionId;
		this.actId = actId;
		this.taskId = taskId;
		this.callProcInstId = callProcInstId;
		this.actName = actName;
		this.actType = actType;
		this.assignee = assignee;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "PROC_DEF_ID_", nullable = false, length = 64)
	public String getProcDefId() {
		return this.procDefId;
	}

	public void setProcDefId(String procDefId) {
		this.procDefId = procDefId;
	}

	@Column(name = "PROC_INST_ID_", nullable = false, length = 64)
	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	@Column(name = "EXECUTION_ID_", nullable = false, length = 64)
	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	@Column(name = "ACT_ID_", nullable = false)
	public String getActId() {
		return this.actId;
	}

	public void setActId(String actId) {
		this.actId = actId;
	}

	@Column(name = "TASK_ID_", length = 64)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Column(name = "CALL_PROC_INST_ID_", length = 64)
	public String getCallProcInstId() {
		return this.callProcInstId;
	}

	public void setCallProcInstId(String callProcInstId) {
		this.callProcInstId = callProcInstId;
	}

	@Column(name = "ACT_NAME_")
	public String getActName() {
		return this.actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	@Column(name = "ACT_TYPE_", nullable = false)
	public String getActType() {
		return this.actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	@Column(name = "ASSIGNEE_", length = 64)
	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_TIME_", nullable = false, length = 0)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_TIME_", length = 0)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "DURATION_")
	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

}
