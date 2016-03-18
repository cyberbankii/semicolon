package com.semicolon.infra.domain.user;

public interface User {
	/**
	 * Sets name.
	 * 
	 * @param name
	 *            name
	 */
	void setName(String name);

	/**
	 * Gets name.
	 * 
	 * @return name
	 */
	String getName();

	/**
	 * Sets email.
	 * 
	 * @param email
	 *            email
	 */
	void setEmail(String email);

	/**
	 * Gets email.
	 * 
	 * @return email
	 */
	String getEmail();

	/**
	 * Sets device.
	 * 
	 * @param device
	 *            device
	 */
	void setDevice(String device);

	/**
	 * Gets device.
	 * 
	 * @return device
	 */
	String getDevice();
}
