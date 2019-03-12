
public class mainDriverExam {

	public static void main(String[] args) {
		char[] answerKey = {'a','b','c','d','e','f'};
		DriverExam exam = new DriverExam(answerKey);
		char[] student = {'a','b','c','d','e','g'};
		System.out.println(exam.totalIncorrect(student));
		System.out.println(exam.totalCorrect(student));
		System.out.println(exam.passed(student));
		int[] wrongAnswers = exam.questionsMissed(student);
		for (int i = 0; i < wrongAnswers.length; i++)
			System.out.println(wrongAnswers[i]);
	}

}
