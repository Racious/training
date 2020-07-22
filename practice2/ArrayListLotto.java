package practice2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListLotto {
	public static void main(String[] args) {
		ArrayListLotto play = new ArrayListLotto();
		ArrayList<String> list=new ArrayList<String>();
		
		String[] lottonumber = play.PlayLotto();
		list=play.playLottoList(lottonumber);
		System.out.println(list);
	}
	
	/**
	 * 建立六筆不重複亂數樂透號碼
	 * @return
	 */
	public String[] PlayLotto() {
		Random random = new Random();
		String s;
		// 樂透六筆數字
		String[] number = new String[6];
		for (int j = 0; j < 6; j++) {
			do {
				// 產生亂數
				int x = random.nextInt(49) + 1;
				// 格式化
				DecimalFormat g1 = new DecimalFormat("00");
				// 轉字串
				s = g1.format(Integer.valueOf(x));
				// 判斷是否重複
			} while (s.equals(number[0]) || s.equals(number[1]) || s.equals(number[2]) || s.equals(number[3])
					|| s.equals(number[4]));
			// 若無重複放入字串陣列中
			number[j] = s;
			// System.out.print(number[j]+" ");
		}
		// 照數字大小排序
		Arrays.sort(number);
		return number;
	}
	/**
	 * 將String[]放入ArrayList
	 * @param lott
	 * @return
	 */
	public ArrayList<String> playLottoList(String[] lott) {
		ArrayList<String> list=new ArrayList<String>();
		for (int i = 0; i < lott.length; i++) {
			list.add(lott[i]);
		}
		return list;
	}
}
