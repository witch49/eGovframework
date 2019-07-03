package egovframework.sample.service.impl;

public class AdvancedSampleServiceImpl implements SampleService {

	public AdvancedSampleServiceImpl() throws Exception {
			System.out.println("AdvancedSampleServiceImpl ===> AdvancedSample 생성");
		}

	@Override
	public void insertSample() throws Exception {
		System.out.println("AdvancedSampleServiceImpl ===> AdvancedSample 등록");
	}

	@Override
	public void updateSample() throws Exception {
		System.out.println("AdvancedSampleServiceImpl ===> AdvancedSample 수정");
	}

	@Override
	public void deleteSample() throws Exception {
		System.out.println("AdvancedSampleServiceImpl ===> AdvancedSample 삭제");
	}

	@Override
	public void selectSample() throws Exception {
		System.out.println("AdvancedSampleServiceImpl ===> AdvancedSample 상세 조회");
	}

	@Override
	public void selectSampleList() throws Exception {
		System.out.println("AdvancedSampleServiceImpl ===> AdvancedSample 목록조회");
	}

}
