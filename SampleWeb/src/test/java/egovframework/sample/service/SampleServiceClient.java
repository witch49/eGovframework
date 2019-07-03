package egovframework.sample.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import egovframework.sample.service.impl.AdvancedSampleServiceImpl;
import egovframework.sample.service.impl.SampleServiceImpl;

public class SampleServiceClient {
	public static void main(String[] args) throws Exception {
		// 1. Spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("egovframework/spring/context-common.xml");

		// 2. Spring 컨테이너로부터 SampleServiceImpl 객체를 lookup한다.
		//SampleServiceImpl sampleService = (SampleServiceImpl) container.getBean("sampleService");	// 생성
		//sampleService.insertSample();	// 등록
		//sampleService.selectSample();	// 상세 조회
		
		// 2. Spring 컨테이너로부터 SampleServiceImpl 객체를 lookup한다.
		AdvancedSampleServiceImpl advancedSampleService = (AdvancedSampleServiceImpl) container.getBean("advancedSampleService");	// 생성
		advancedSampleService.insertSample();	// 등록
		advancedSampleService.selectSample();	// 상세 조회

		// 3. Spring 컨테이너 종료
		container.close();
	}
}