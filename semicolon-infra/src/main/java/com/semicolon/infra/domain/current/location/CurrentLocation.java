package com.semicolon.infra.domain.current.location;

import java.util.Date;

public interface CurrentLocation {
	/**
	 * Sets user id.
	 * 
	 * @param userId
	 *            user id
	 */
	void setUserId(int userId);

	/**
	 * Gets user id.
	 * 
	 * @return user id
	 */
	int getUserId();

	/**
	 * Sets latitude.
	 * 
	 * @param latitude
	 *            latitude
	 */
	void setLatitude(double latitude);

	/**
	 * Gets latitude.
	 * 
	 * @return latitude
	 */
	double getLatitude();

	/**
	 * Sets longitude.
	 * 
	 * @param longitude
	 *            longitude
	 */
	void setLongitude(double longitude);

	/**
	 * Gets longitude.
	 * 
	 * @return longitude
	 */
	double getLongitude();

	/**
	 * Sets create time.
	 * 
	 * @param createTime
	 *            create time
	 */
	void setCreateTime(Date createTime);

	/**
	 * Gets create time.
	 * 
	 * @return create time
	 */
	Date getCreateTime();
}
