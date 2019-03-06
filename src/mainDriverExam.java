
public class mainDriverExam {

	public static void main(String[] args) {
		char[] answerKey = {'a','b','c','d','e','f'};
		DriverExam exam = new DriverExam(answerKey);
		char[] student = {'a','b','d','d','e','g'};
		System.out.println(DriverExam.incorrectAnswers(student));
		
	}

}
