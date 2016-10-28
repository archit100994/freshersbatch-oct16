package oct28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestData {

	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 90, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruits;
	}
	public static void printFruits(List<Fruit> fruits) {
		fruits.stream().forEach(System.out::println);
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Tom", "Anand", "Very nice article on budget"));
		newsList.add(new News(2, "Ivan", "Bipin", "Good budget description"));
		newsList.add(new News(1, "Tom", "Narang", "How can you write such an article?"));
		newsList.add(new News(2, "Jerry", "Mitul", "I agree with you!!"));
		newsList.add(new News(2, "James", "Anand", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Sara", "Daji", "Good article"));
		return newsList;
	}
	public static void printNews(List<News> newsList) {
		newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Anand", "Pune"), 2016, 10000));
		transactions.add(new Transaction(new Trader("Neeraja", "Indore"), 2015, 25000));
		transactions.add(new Transaction(new Trader("Yog", "Mumbai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000));
		transactions.add(new Transaction(new Trader("Komal", "Pune"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Ishwar", "Indore"), 2016, 12000));
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		transactions.stream().forEach(System.out::println);
	}
	
	
	public static void main(String args[])
	{
		List<Fruit> fruit = getAllFruits();
		List<News> news= getAllNews();
		List<Transaction> transaction= getAllTransactions();
		
		
		System.out.println("\n*******\t\tFIRST\t\t*******\n");
				List<Fruit> listf= fruit.stream().filter(blablabla -> blablabla.getCalories()<100)
						.sorted(Comparator.comparing(Fruit::getCalories).reversed())
						.collect(Collectors.toList());
				printFruits(listf);
		
		
		System.out.println("\n*******\t\tSECOND\t\t*******\n");
		
				Map<String, List<Fruit>> minPriceOrderByLocation = fruit.stream().collect(Collectors.groupingBy(Fruit::getColor));
				for (Map.Entry entry : minPriceOrderByLocation.entrySet())
				{
					System.out.println(entry.getKey() + " -------- " + entry.getValue());
				}
		
		System.out.println("\n*******\t\tTHIRD\t\t*******\n");
		
				List<Fruit> onlyRed = fruit.stream().filter(fu->fu.getColor()=="Red")
						.sorted(Comparator.comparing(Fruit::getPrice))
						.collect(Collectors.toList());
				printFruits(onlyRed);
		
		System.out.println("\n*******\t\tFOURTH\t\t*******\n");
		
				Map<Integer, Long> maxComment= news.stream().collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));
				for (Map.Entry entry : maxComment.entrySet())
				{
					System.out.println(entry.getKey() + " -------- " + entry.getValue());
				}
		
		System.out.println("\n*******\t\tFIFTH\t\t*******\n");
		
				long l= news.stream().filter(n->n.getComment().contains("budget")).count();
				System.out.println("No of times the word 'budget' came is: "+l);
		
		System.out.println("\n*******\t\tSIXTH\t\t*******\n");
		
				Map<String, Long> commentByUser= news.stream().collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
				for (Map.Entry entry : commentByUser.entrySet())
				{
					System.out.println(entry.getKey() + " -------- " + entry.getValue());
				}
				
		System.out.println("\n*******\t\tSEVENTH\t\t*******\n");
		
				List<Transaction> year2011= transaction.stream().filter(y -> y.getYear()==2011)
						.sorted(Comparator.comparing(Transaction::getYear))
						.collect(Collectors.toList());
				printTransactions(year2011);
				
		System.out.println("\n*******\t\tSEVENTH\t\t*******\n");
	}
	
}
