
public class DriverExam {
	private char[] correctAnswers;
	
	public DriverExam (char[] answerKey) {
		correctAnswers = new char[answerKey.length];
		for (int i = 0; i < answerKey.length; i++)
			correctAnswers[i] = answerKey[i];
	}//answersetter
	
	
	public int totalCorrect (char[] studentAnswers) {
		int correctAnsNum = 0;
		for (int i = 0; i < correctAnswers.length; i++) {
			if (studentAnswers[i] == correctAnswers[i])
				correctAnsNum++;
		}
		return correctAnsNum;
	}//totalCorrect
	
	
	public int totalIncorrect (char[] studentAnswers) {
		int incorrectAnsNum = 0;
		for (int i = 0; i < correctAnswers.length; i++) {
			if (studentAnswers[i] != correctAnswers[i])
				incorrectAnsNum++;
		}
		return incorrectAnsNum;
	}//totalCorrect
	
	
	public boolean passed (char[] studentAnswers) {
		double grade = ((double)totalCorrect(studentAnswers))/(correctAnswers.length);
		System.out.println(grade);
		boolean didPass = false;
		if (grade >= 0.75) {
			didPass = true;
		}
		return didPass;
	}//StudentAnswers
	
	public int[] questionsMissed (char[] studentAnswers) {
		int[] wrongQuestions;
		int counter = 0;
		counter = totalIncorrect(studentAnswers);
		wrongQuestions = new int[counter];
		for (int i = 0; i < correctAnswers.length; i++) {
			int arrayCounter = 0;
			if (correctAnswers[i] == studentAnswers[i]) {
				System.out.println("Question " + (i+1) + " is right");
			}
			else {
				System.out.println("Question " + (i+1) + " is wrong");
				wrongQuestions[arrayCounter] = i;
			}	
			arrayCounter = i;
			
		}
		return wrongQuestions;
	}
}
