import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main implements Bouquet {
 
	public static void createBouquet() {

		Main main = new Main();
		ArrayList<Flowers> list = main.createFirstCollection();
						
		main.displayCollection(list);
		
		double res = main.getFinalPrice(list, 0);
		System.out.println("\nTotal cost of your bouquet is: " + res + "\n");
				
		System.out.println("Sorted list by Freshness:\n");
		Collections.sort(list, new Sort());
		main.displayCollection(list);
		
		System.out.println("\nAnd now let's find some flowers by their length.\nPlease enter first and last numbers of range");
		main.findFlowerByLength(list);
		}
	
	// create collection
	public ArrayList<Flowers> createFirstCollection(){
		ArrayList<Flowers> list = new ArrayList<Flowers>();
		Roses rosesOne = new Roses("Pink Rose", 25, 10, 1);
		list.add(rosesOne);
		Roses rosesTwo = new Roses("White Rose", 30, 15, 2);
		list.add(rosesTwo);
		Tulips tulipsOne = new Tulips("Avory Tulip", 7.5, 10, 1);
		list.add(tulipsOne);
		Tulips tulipsTwo = new Tulips("Red Tulip", 8, 12, 2);
		list.add(tulipsTwo);
		Orchids orchidOne = new Orchids("Violet Orchid", 150, 25, 3);
		list.add(orchidOne);
		Orchids orchidTwo = new Orchids("Yellow Orchid", 250, 30, 3);
		list.add(orchidTwo);
		return list;
	}

	// display collection
	public void displayCollection(ArrayList<Flowers> list) {
		int i = 1;
		System.out.println("ID: " + " NAME:    " + " 	    	  Price: " + "	Length:  " + " Fresh:");
		for (Flowers vault : list) {
			
				System.out.println(i + ".   " + vault.getName() + "  	  " + vault.getPrice() + "		" + vault.getLength()
						+ "   	  " + vault.getFresh());
			i++;
		}
    }

	// count price of bouquet
	public double getFinalPrice(ArrayList<Flowers> list, double sum) {
		for (Flowers vault : list) {
			sum += vault.getPrice();
		}
		return sum;
	}

	// find flowers with selected length	
	public void findFlowerByLength(ArrayList<Flowers> list) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
	
		int j = 1;
		for (Flowers vault : list) {
			if ((vault.getLength() >= a && vault.getLength() <= b) || (vault.getLength() >= b && vault.getLength() <= a)){
				System.out.println("\nYour flower is: " + vault.getName() + ", length=" + vault.getLength());
				}
			j++;
		}
	}
}	
