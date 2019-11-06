package com.sxt.sys.utils;

import java.util.List;

import com.sxt.sys.domain.User;

/**
 * 供shrio的认证和授权主法传值
 * 
 * @author LJH
 *
 */
public class ActiverUser {

	private User user;
	private List<String> roles;
	private List<String> permissions;

	public ActiverUser() {
		// TODO Auto-generated constructor stub
	}

	public ActiverUser(User user, List<String> roles, List<String> permissions) {
		super();
		this.user = user;
		this.roles = roles;
		this.permissions = permissions;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

}
