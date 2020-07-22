package practice2;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetLotto {
	public static void main(String[] args) {
		TreeSetLotto treesetLotto=new TreeSetLotto();
		TreeSet<String> lottonumber=new TreeSet<String>();
		lottonumber=treesetLotto.PlayLottoSet();
		System.out.println(lottonumber);
	}

	/**
	 * 建立六筆不重複亂數樂透
	 * @return
	 */
	public TreeSet<String> PlayLottoSet() {
		TreeSet<String> set =new TreeSet<String>();
		Random random = new Random();
		String s;
		//判斷是否已產生六筆不重複數字
		while (set.size()<6) {
			//產生亂數
			int x = random.nextInt(49) + 1;
			//格式化
			DecimalFormat g1 = new DecimalFormat("00");
			//轉字串
			s = g1.format(Integer.valueOf(x));
			//若未重複則加入set中
			set.add(s);
			
		}
		return set;
	}

}
