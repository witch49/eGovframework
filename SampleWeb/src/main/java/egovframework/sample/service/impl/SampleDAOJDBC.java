package egovframework.sample.service.impl;

// 의존(dependency) 관계
public class SampleDAOJDBC {

	public SampleDAOJDBC() {
		System.out.println("===> SampleDAOJDBC 생성");
	}

	public void insertSample() throws Exception {
		System.out.println("===> JDBC로 insertSample() 기능처리");
	}

	public void updateSample() throws Exception {
		System.out.println("===> JDBC로 updateSample() 기능처리");
	}

	public void deleteSample() throws Exception {
		System.out.println("===> JDBC로 deleteSample() 기능처리");
	}

	public void selectSample() throws Exception {
		System.out.println("===> JDBC로 selectSample() 기능처리");
	}

	public void selectSampleList() throws Exception {
		System.out.println("===> JDBC로 selectSampleList() 기능처리");
	}

}
