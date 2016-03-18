package com.semicolon.infra.domain.current.location.internal;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CurrentLocationImplTest {

	private CurrentLocationImpl underTest;

	@Before
	public void setUp() {
		underTest = new CurrentLocationImpl();
	}

	@Test
	public void testUserId() {
		int userId = 1;
		underTest.setUserId(userId);
		Assert.assertThat(underTest.getUserId(), CoreMatchers.equalTo(userId));
	}

	@Test
	public void testLatitude() {
		double latitude = 103.3342;
		underTest.setLatitude(latitude);
		Assert.assertThat(underTest.getLatitude(), CoreMatchers.equalTo(latitude));
	}

	@Test
	public void testLongitude() {
		double longitude = 103.3342;
		underTest.setLongitude(longitude);
		Assert.assertThat(underTest.getLongitude(), CoreMatchers.equalTo(longitude));
	}

	@Test
	public void testCreateTime() {
		Date createTime = new Date();
		underTest.setCreateTime(createTime);
		Assert.assertThat(underTest.getCreateTime(), CoreMatchers.equalTo(createTime));
	}
}
