package com.ceis.module.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ceis.base.entity.BaseEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "ceis_account")
public class Account extends BaseEntity {

	/**
	 * 登录名
	 */
	@Column(length = 30)
	private String loginName;
	
	/**
	 * 密码
	 */
	@Column(length = 50)
	private String passWord;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
