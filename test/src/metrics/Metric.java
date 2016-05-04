package metrics;
import java.util.*;

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
	public double maximum(){
		double result=0;
		double p=0;
		int i=0;
		for (i=0;i<dim;i++){
			p=Math.abs(vec1.get(i) - vec2.get(i));
			if(p>result){result=p;}
		}
		return result;
	}
	public double rail(){
		double p, q;
		p=Math.sqrt(vec1.get(0)*vec1.get(0)+vec1.get(1)*vec1.get(1));
		q=Math.sqrt(vec2.get(0)*vec2.get(0)+vec2.get(1)*vec2.get(1));
		return p+q;
	}
}
