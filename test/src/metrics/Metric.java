package metrics;
import java.util.*;



// Metryka to klasa, zawiera w sobie wektor pierwszy i drugi, oraz wymiary obu wektorow
// ktore musza byc takie same. Potrzebne beda metody w tej klasie, ktore beda obliczeniem odleglosci
// w poszczegolnych metrykach, tak jak moja przykladowa euklides(). Dodatkowo metoda wczytywania z pliku,
// wyswitlania wektorow i nie wiem jakie jeszcze ficzery.

public class Metric {
	
	private int dim;
	private List<Double> vec1;
	private List<Double> vec2;
	
	Metric (List<Double> v1, List<Double> v2, int d){
		//Konstruktor, najprostszy, potem mozna zmienic jak bedzie potrzeba
		
		vec1 = v1;
		vec2 = v2;
		dim = d;
	}
	//Metryka numer jeden
	public double euklides(){
		double result = 0;
		int i = 0;
		
		for(i = 0; i < dim ; i++){
			
			result = result + (vec1.get(i) - vec2.get(i))*(vec1.get(i) - vec2.get(i));
			
		}
		
		return Math.sqrt(result);
	}
	
}
