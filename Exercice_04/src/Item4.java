import java.util.ArrayList;
import java.util.List;

public class Item4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int reste;
		for (int i = 2; i < 100; i++) {
			boolean flag = true;
			
			for (int j = 2; j <= i / 2; j++) {
				reste = i % j;
				if (reste == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				list.add(i);
			}
		}
		System.out.println(list);
	}
}