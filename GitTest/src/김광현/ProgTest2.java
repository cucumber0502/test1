package 김광현;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ProgTest2 {
	Map<String, MemberData> mapList = new Hashtable<>();

	void mapListAdd(String memberID, String name, String tel, String gender) {
		mapList.put(memberID, new MemberData(memberID, name, tel, gender));
	}

	void mapListRemove(String memberID) {
		mapList.remove(memberID);
	}

	ArrayList<MemberData> getMapList() {
		ArrayList<MemberData> al_m = new ArrayList<MemberData>(mapList.values());
		
		return al_m;
	}
}
//}
//	ArrayList<MemberData> getMapList() {  		//일반변수와 객체변수의 차이 = 데이터를 다루는것과 다루지 않는것
//		Set<String> keyset = mapList.keySet();
//		Iterator<String> keyiterator = keyset.iterator();
//		ArrayList<MemberData> arraylist = new Arraylist<>();
//		while (keyiterator.hasNext() ) {
//			arrayList.add(maplist.get(keyiterator.hasNext()));
//		}
//		return arrayList;
//	})