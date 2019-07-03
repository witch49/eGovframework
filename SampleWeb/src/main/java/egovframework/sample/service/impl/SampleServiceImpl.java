package egovframework.sample.service.impl;

import egovframework.sample.service.impl.SampleService;

// 다형성 적용
public class SampleServiceImpl implements SampleService {
	
	public SampleServiceImpl() throws Exception {
		System.out.println("SampleService ===> Sample 생성");
	}

	@Override
	public void insertSample() throws Exception {
		System.out.println("SampleService ===> Sample 등록");
	}

	@Override
	public void updateSample() throws Exception {
		System.out.println("SampleService ===> Sample 수정");
	}

	@Override
	public void deleteSample() throws Exception {
		System.out.println("SampleService ===> Sample 삭제");
	}

	@Override
	public void selectSample() throws Exception {
		System.out.println("SampleService ===> Sample 상세 조회");
	}

	@Override
	public void selectSampleList() throws Exception {
		System.out.println("SampleService ===> Sample 목록조회");
	}
}