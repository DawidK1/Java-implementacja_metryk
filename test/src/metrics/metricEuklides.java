package metrics;

import java.util.List;

public class metricEuklides extends Metric {

	metricEuklides(List<Double> v1, List<Double> v2) {
		super(v1, v2);
	}

	public double distance(){
		double result = 0;
		int i = 0;
		
		for(i = 0 ; i < dim ; i++){
			
			result = result + (vec1.get(i) - vec2.get(i))*(vec1.get(i) - vec2.get(i));
			
		}
		
		return Math.sqrt(result);
	}
}
