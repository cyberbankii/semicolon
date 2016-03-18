package com.semicolon.infra.domain.user.internal;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserImplTest {

	private UserImpl underTest;

	@Before
	public void setUp() {
		underTest = new UserImpl();
	}

	@Test
	public void testName() {
		String name = "name";
		underTest.setName(name);
		Assert.assertThat(underTest.getName(), CoreMatchers.equalTo(name));
	}

	@Test
	public void testEmail() {
		String email = "a@semicolon.com";
		underTest.setEmail(email);
		Assert.assertThat(underTest.getEmail(), CoreMatchers.equalTo(email));
	}

	@Test
	public void testDevice() {
		String device = "android";
		underTest.setDevice(device);
		Assert.assertThat(underTest.getDevice(), CoreMatchers.equalTo(device));
	}
}
