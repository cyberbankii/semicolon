package com.semicolon.infra.domain.current.location.internal;

import java.util.Date;

import com.semicolon.infra.domain.current.location.CurrentLocation;

public class CurrentLocationImpl implements CurrentLocation {

	private int userId;
	private double latitude;
	private double longitude;
	private Date createTime;

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}
}
