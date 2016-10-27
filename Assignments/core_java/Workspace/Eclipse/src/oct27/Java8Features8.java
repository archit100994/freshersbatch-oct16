package oct27;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8Features8 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Shrey");
		list.add("Archit");
		list.add("Tom");
		list.add("Sarita");
		
		Consumer<List<String>> consumer = (list1) -> {
			new Thread(() -> {
				for (String s : list1)
					System.out.println(s);
			}).start();
		};
		consumer.accept(list);
	}
}