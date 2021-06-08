package singletone;

public class Company {
	//�ϳ��� �ν��Ͻ��� ����ؾ� �Ҷ�
	
	private static Company instance = new Company();
	
	private Company() {}
	 
	public static Company getInstance() { //�Ϲ� �޼ҵ�� ��ü�� ������ �Ŀ� ������ �� �� �ִµ�
				//returntype						  //static���� �����ϸ� ��ü�� �������� �ʰ� ����� �� �ִ�
		if(instance == null)
			instance = new Company();
		return instance;
	}

}
