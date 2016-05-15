package metrics;
import java.util.*;

public class test_class{
	
	public static void main (String[] args){

	
		List<Double> list1 = new ArrayList<Double>();
		List<Double> list2 = new ArrayList<Double>();
		
		//nowe dwie listy ze wspolrzednymi do R^2
		List<Double> list3 = new ArrayList<Double>();
		List<Double> list4 = new ArrayList<Double>();
		
		
		// reczne dodawanie wspolrzednych wektorow 1 i 2, trzeba zrobic potem z pliku
		
		
		list1.add(1.4);
		list1.add(1.4);
		list1.add(11.4);
		list1.add(1.2);
		list1.add(1.4);
		
		list2.add(-5.0);
		list2.add(-1.0);
		list2.add(-0.0);
		list2.add(2.0);
		list2.add(-10.0);
		
		
		//notka co do R^2: pierwszy rekord w tablicy to jej wspolrzedna x, drugi to jej y)
		list3.add(9.4);
		list3.add(-2.6);
		
		list4.add(-0.5);
		list4.add(0.1);
		
		metricEuklides m = new metricEuklides(list1, list2);
		
		
	
		System.out.printf("Metryka euklidesowa w R^n: %.2f\n", m.distance());
		System.out.printf("Metryka dyskretna: %f\n", m.distance());
		System.out.printf("Metryka miejska w R^n: %.2f\n", m.distance());
		System.out.printf("Metryka maksimum w R^n: %.2f\n", m.distance());
		
	}
}
