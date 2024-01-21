package CollectionFramework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_ArrayList {

	public void SortArray() {

		int a[] = { 20, 30, 15, 45 };

		List<int[]> ls = Arrays.asList(a);
		System.out.println(ls);
		Iterator it = ls.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void main(String[] args) {
		List_ArrayList obj = new List_ArrayList();
		obj.SortArray();
	}

}
