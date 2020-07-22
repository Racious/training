package practice2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class HashMapLotto {
	public static void main(String[] args) {
		TreeSetLotto treesetlotto=new TreeSetLotto();
		HashMapLotto hashmapLotto=new HashMapLotto();
		TreeSet<String> lottonumber=new TreeSet<String>();
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();

		lottonumber=treesetlotto.PlayLottoSet();
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
