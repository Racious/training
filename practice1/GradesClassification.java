package practice1;

import java.util.Random;

public class GradesClassification {
	public static void main(String[] args) {
		Random random = new Random();
		//產生20筆成績
		for (int i = 0; i < 20; i++) {
			//亂數0~100
			int number = random.nextInt(101);
			if (number >= 90 & number <= 100) {
				System.out.println(number + "→甲");
			} else if (number >= 80 & number <= 89) {
				System.out.println(number + "→乙");
			} else if (number >= 70 & number <= 79) {
				System.out.println(number + "→丙");
			} else if (number >= 60 & number <= 69) {
				System.out.println(number + "→丁");
			} else {
				System.out.println(number + "→不及格");
			}

		}
	}
}
