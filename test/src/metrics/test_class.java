package metrics;
import java.util.*;


public class test_class {
	public static void main(String args[])
	{	

	
		List<Double> list1 = new ArrayList<Double>();
		List<Double> list2 = new ArrayList<Double>();
		
		
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
		
		Metric m = new Metric(list1, list2, 5);

	
		System.out.printf("Metryka euklidesowa: %.2f", m.euklides());
	}
}
