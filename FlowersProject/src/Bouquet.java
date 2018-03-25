import java.util.ArrayList;

	public interface Bouquet {

		public double getFinalPrice(ArrayList<Flowers> list, double sum);
		public void displayCollection(ArrayList<Flowers> list);
		public ArrayList<Flowers> createFirstCollection();
}