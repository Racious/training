package practice2;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeSet;

public class HashMapLotto {
	public static void main(String[] args) {
		HashMapLotto hashmapLotto=new HashMapLotto();
		TreeSet<String> lottonumber=new TreeSet<String>();
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		
		lottonumber=hashmapLotto.PlayLottoSet();
		//System.out.println(lottonumber);

		hashmap=hashmapLotto.playLottoMap(lottonumber);
		
//      獲取值
//		for (Integer order : hashmap.keySet()) {
//			System.out.print(hashmap.get(order)+", ");
//		}
		
		//獲取key與值
		for(Entry<Integer, String> vo :hashmap.entrySet()){
			vo.getKey();
			vo.getValue();
			System.out.println(vo.getKey()+" "+vo.getValue());
		}

	}

	/**
	 * 建立六筆不重複亂數樂透
	 * 
	 * @return
	 */
	public TreeSet<String> PlayLottoSet() {
		TreeSet<String> set = new TreeSet<String>();
		Random random = new Random();
		String s;
		// 樂透六筆數字
		String[] number = new String[6];
		// 判斷是否已產生六筆不重複數字
		while (set.size() < 6) {
			// 產生亂數
			int x = random.nextInt(49) + 1;
			// 格式化
			DecimalFormat g1 = new DecimalFormat("00");
			// 轉字串
			s = g1.format(Integer.valueOf(x));
			// 判斷是否重複數字
			if (s.equals(number[0]) || s.equals(number[1]) || s.equals(number[2]) || s.equals(number[3])
					|| s.equals(number[4])) {
				break;
			} else {
				// 若未重複則加入set中
				set.add(s);
			}
		}
		return set;
	}
	
	/**
	 * 將TreeSet陣列放入HashMap並回傳
	 * @param lotto
	 * @return
	 */
	public HashMap<Integer, String> playLottoMap(TreeSet<String> lotto) {
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		Integer keynumber=0;
		for (String string : lotto) {
			hashmap.put(keynumber+1, string);
			keynumber+=1;
		}	
		return hashmap;
	}

}
