package practice1;

public class MultiplicationTable {
	public static void main(String[] args) {
		//99乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 9) {
					System.out.println(j + "×" + i + "=" + i * j);
				} else {
					System.out.print(j + "×" + i + "=" + i * j + '\t');
				}
			}
		}
	}
}
