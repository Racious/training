package practice2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class PlayLotto {
	public static void main(String[] args) {
		String[] lottonumber = new PlayLotto().LottoCreat();
		for (int i = 0; i < lottonumber.length; i++) {
			System.out.print(lottonumber[i] + " ");
		}
	}

	public String[] LottoCreat() {	
		Random random = new Random();
		String s;
		//樂透六筆數字
		String[] number = new String[6];
		for (int j = 0; j < 6; j++) {
			do {
				//產生亂數
				int x = random.nextInt(49) + 1;
				//格式化
				DecimalFormat g1 = new DecimalFormat("00");
				//轉字串
				s = g1.format(Integer.valueOf(x));
				//判斷是否重複
			} while (s.equals(number[0]) || s.equals(number[1]) || s.equals(number[2]) || s.equals(number[3])
					|| s.equals(number[4]));
			//若無重複放入字串陣列中
			number[j] = s;
			// System.out.print(number[j]+" ");
		}
		//照數字大小排序
		Arrays.sort(number);
		return number;
	}
}
