package reference;

public class Subject {
	
	String subjectName;
	int score;
	
	public Subject(String name) {
		subjectName = name;
	}
	
	//���� ������
	public void setSujectName(String name) {
		subjectName = name;
	}
	
	//��Ŭ��->source->generate getter and setter
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
}
