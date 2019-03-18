package com.experian.pid.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.experian.pid.domain.UserInfo;
import com.experian.pid.repository.UserInfoRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserInfoServiceTest {
	
	@InjectMocks
	UserInfoService service;
	
	@Mock
	UserInfoRepository repository;
	
	private static final Integer ID = 1;
	
	
	/*@Test
	public void findByIdTest() {
		UserInfo userinfo = mock(UserInfo.class);
		service.findById(userinfo);
		verify(repository).findOne(userinfo.getId());		
	}
	
	@Test
	public void findAllTest() {
		service.findAll();
		verify(repository).findAll();		
	}*/
	
	@Test
	public void saveTest() {
		//UserInfo userinfo = mock(UserInfo.class);
		UserInfo userinfo = new UserInfo();
		userinfo.setId(1);
		userinfo.setName("test name");
		userinfo.setAddress("test address");
		
		service.create(userinfo);
		verify(repository).save(userinfo);		
	}
	
	/*@Test
	public void updateTest() {
		UserInfo userinfo = mock(UserInfo.class);
		when(userinfo.getId()).thenReturn(ID);
		when(userinfo.getName()).thenReturn("test name");
		when(userinfo.getAddress()).thenReturn("test address");
		when(repository.findOne(ID)).thenReturn(userinfo);
		service.update(userinfo);
		verify(repository).save(userinfo);		
	}
	
	@Test
	public void deleteTest() {
		UserInfo userinfo = mock(UserInfo.class);
		service.delete(userinfo);
		verify(repository).delete(userinfo.getId());		
	}*/
	
}
