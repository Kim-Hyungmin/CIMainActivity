package SellApp.MainActivity;

import java.util.List;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Search 
{
	private List<String> list;          // 데이터를 넣은 리스트변수
	private ArrayList<String> arraylist;

	// 검색을 수행하는 메소드
	public void search(String charText) {

		// 문자 입력시마다 리스트를 지우고 새로 뿌려준다.
		list.clear();

		// 문자 입력이 없을때는 모든 데이터를 보여준다.
		if (charText.length() == 0) {
			list.addAll(arraylist);
		}
		// 문자 입력을 할때..
		else
		{
			// 리스트의 모든 데이터를 검색한다.
			for(int i = 0;i < arraylist.size(); i++)
			{
				//  모든 데이터에 입력받은 단어(charText)가 포함되어 있으면 true를 반환한다.
				if (arraylist.get(i).toLowerCase().contains(charText))
				{
					// 검색된 데이터를 리스트에 추가한다.
					list.add(arraylist.get(i));
				}
			}
		}
	}
}
