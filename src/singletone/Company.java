package singletone;

public class Company {
	//하나의 인스턴스만 사용해야 할때
	
	private static Company instance = new Company();
	
	private Company() {}
	 
	public static Company getInstance() { //일반 메소드는 객체를 생성한 후에 가져다 쓸 수 있는데
				//returntype						  //static으로 선언하면 객체를 생성하지 않고도 사용할 수 있다
		if(instance == null)
			instance = new Company();
		return instance;
	}

}
