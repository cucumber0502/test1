package �豤��;

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
//	ArrayList<MemberData> getMapList() {  		//�Ϲݺ����� ��ü������ ���� = �����͸� �ٷ�°Ͱ� �ٷ��� �ʴ°�
//		Set<String> keyset = mapList.keySet();
//		Iterator<String> keyiterator = keyset.iterator();
//		ArrayList<MemberData> arraylist = new Arraylist<>();
//		while (keyiterator.hasNext() ) {
//			arrayList.add(maplist.get(keyiterator.hasNext()));
//		}
//		return arrayList;
//	})