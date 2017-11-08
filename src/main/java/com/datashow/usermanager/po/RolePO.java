/**
 * 
 */
package com.datashow.usermanager.po;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jason
 *
 */
@Entity(name = "t_role")
public class RolePO {
	@Id
	@GeneratedValue
	private int roleId;

	private String roleName;
	private String roleRemark;
	private Timestamp roleCreateTime;
	private Timestamp roleUpdateTime;
	private BigInteger roleCreateUserId;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleRemark() {
		return roleRemark;
	}

	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}

	public Timestamp getRoleCreateTime() {
		return roleCreateTime;
	}

	public void setRoleCreateTime(Timestamp roleCreateTime) {
		this.roleCreateTime = roleCreateTime;
	}

	public Timestamp getRoleUpdateTime() {
		return roleUpdateTime;
	}

	public void setRoleUpdateTime(Timestamp roleUpdateTime) {
		this.roleUpdateTime = roleUpdateTime;
	}

	public BigInteger getRoleCreateUserId() {
		return roleCreateUserId;
	}

	public void setRoleCreateUserId(BigInteger roleCreateUserId) {
		this.roleCreateUserId = roleCreateUserId;
	}

	public BigInteger getRoleUpdateUserId() {
		return roleUpdateUserId;
	}

	public void setRoleUpdateUserId(BigInteger roleUpdateUserId) {
		this.roleUpdateUserId = roleUpdateUserId;
	}

	private BigInteger roleUpdateUserId;

}
