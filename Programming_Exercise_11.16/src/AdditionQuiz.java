/*
 * (Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user if an
 * answer is entered again. Hint: use an array list to store answers.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		// Create scanner
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> userAnswersList = new ArrayList<>();

		int answer = number1 + number2;
		int userAnswer;

		System.out.print("What is " + number1 + " + " + number2 + "? ");
		userAnswer = input.nextInt();
		userAnswersList.add(userAnswer);

		if (userAnswer != answer) {
			do {
				if (userAnswer != answer) {
					System.out.print("Wrong Answer. Try Again. What is " + number1 + " + " + number2 + "? ");
				}
				userAnswer = input.nextInt();

				if (userAnswersList.contains(userAnswer)) {
					System.out.println("You already entered " + userAnswer);
				}
				userAnswersList.add(userAnswer);
			} while (answer != userAnswer);
		}
		System.out.println("You got it!");
	}
}
