
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
		int arrayCounter = 0;
		for (int i = 0; i < correctAnswers.length; i++) {
			if (correctAnswers[i] == studentAnswers[i]) {
				//i know that the if should be backwards, im just lazy.
			}
			else {
				wrongQuestions[arrayCounter] = i+1;
				arrayCounter++;
			}	
			
		}
		return wrongQuestions;
	}
}
