package practice2;

import java.util.ArrayList;

public class ArrayListLotto {
	public static void main(String[] args) {
		PlayLotto playlotto=new PlayLotto();
		ArrayList<String> list=new ArrayList<String>();
		
		String[] lottonumber = playlotto.LottoCreat();
		list=playLottoList(lottonumber);
		System.out.println(list);
	}
	
	/**
	 * 將String[]放入ArrayList
	 * @param lott
	 * @return
	 */
	public static ArrayList<String> playLottoList(String[] lott) {
		ArrayList<String> list=new ArrayList<String>();
		for (int i = 0; i < lott.length; i++) {
			list.add(lott[i]);
		}
		return list;
	}
}
