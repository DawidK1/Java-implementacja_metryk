package metrics;
import java.util.*;

public abstract class Metric {
	protected int dim;
	protected List<Double> vec1;
	protected List<Double> vec2;
	
	Metric (List<Double> v1, List<Double> v2){
		//Konstruktor, najprostszy, potem mozna zmienic jak bedzie potrzeba
		if(v1.size()==v2.size())
		{
			vec1 = v1;
			vec2 = v2;
			dim = v1.size();
		}
		
		else {
			dim = 0;
			vec1 = new ArrayList<Double>();
			vec2 = new ArrayList<Double>();
			}
		}
	abstract double distance();
	
	
	
}
