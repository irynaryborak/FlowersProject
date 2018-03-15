import java.util.ArrayList;

	public interface Bouquet {

		public double getFinalPrice(ArrayList<Flowers> list, double sum);
		public StringBuilder findFlowerByLength(double a, double b, ArrayList<Flowers> list);
		public void displayCollection(ArrayList<Flowers> list);
		public ArrayList<Flowers> createFirstCollection();
}