package com.experian.pid.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.experian.pid.domain.UserInfo;
import com.experian.pid.service.UserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserInfoControllerTest {
	
	@InjectMocks
	UserInfoController controller;
	
	@Mock
	UserInfoService service;
	
	@Mock
	UserInfo userinfo;
	
	@Mock
	Map<String,Object> request;
	
	
	private static final Integer ID = 1;
	
	/*@Test
	public void getUserInfoTest() {
		when(service.findById(userinfo)).thenReturn(userinfo);
		assertEquals(controller.getUserInfo(request).getBody(),userinfo);
	}*/
	
	@Test
	public void getAllUserInfoTest() {
		List<UserInfo> userinfos = new ArrayList<>();
		userinfos.add(userinfo);
		when(service.findAll()).thenReturn(userinfos);
		assertEquals(controller.getAllUserInfo().getBody().size(),userinfos.size());		
	}

}
