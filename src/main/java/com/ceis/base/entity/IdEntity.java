package com.ceis.base.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * @Title IdEntity
 * @Description 共用id
 * @Copyright Copyright (c) 2013
 * @author leo_lvlianyong
 * @version 1.0.0.0
 */
@SuppressWarnings("serial")
@MappedSuperclass
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class IdEntity implements Serializable {
	@Id
	// 把ID生成策略从自动增1改为UUID
	// @GenericGenerator(name = "increment", strategy = "increment")
	@GenericGenerator(name = "idGenerator", strategy = "uuid")
	@GeneratedValue(generator = "idGenerator")
	private String id;

	@Version
	@Column(name = "VERSION")
	private Integer version;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
