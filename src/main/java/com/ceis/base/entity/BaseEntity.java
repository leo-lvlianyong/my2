package com.ceis.base.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Title BaseEntity
 * @Description 共用entity
 * @Copyright Copyright (c) 2015
 * @author leo_lvlianyong
 * @version 1.0.0.0
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class BaseEntity extends IdEntity {

	@Column(length = 1)
	private String deleteFlag = "T";// 删除的标示?

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date created = new Date();// 创建日期

	@Column(length = 30)
	private String createBy; // 创建日期

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date updated;// 修改日期

	@Column(length = 30)
	private String updateBy; // 修改日期?

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

}
