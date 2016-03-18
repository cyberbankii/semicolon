package com.semicolon.infra.domain.user.internal;

import com.semicolon.infra.domain.user.User;

public class UserImpl implements User {
	private String name;
	private String email;
	private String device;

	/**
	 * {@inheritDoc}
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getName() {
		return name;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setDevice(String device) {
		this.device = device;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getDevice() {
		return device;
	}
}
