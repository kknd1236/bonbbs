package com.heavyplus.bonbbs;

import org.junit.runner.RunWith;
//https://stackoverflow.com/questions/15105556/the-import-org-junit-cannot-be-resolved

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//컨테이너 설정 정보를 가지고 있는 설정 클래스
//이 클래스를 상속받으면 컨테이너 ctx 필드를 사용할 있게 됨
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DBTestConfig {

	@Autowired
	public ApplicationContext ctx;
	
}
