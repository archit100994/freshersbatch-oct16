package oct28;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Fruits> fruit = getAllFruits();
		List<Fruit> listf= fruit.stream().filter(Fruit -> fruit.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories)).collect(Collector.toList());
		
	}

}
