package reference;

public class Subject {
	
	String subjectName;
	int score;
	
	public Subject(String name) {
		subjectName = name;
	}
	
	//직접 만들경우
	public void setSujectName(String name) {
		subjectName = name;
	}
	
	//우클릭->source->generate getter and setter
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
