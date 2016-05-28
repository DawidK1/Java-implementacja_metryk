package metrics;

import java.util.List;

public class MetricMinkowski extends Metric {

	public MetricMinkowski(List<Double> v1, List<Double> v2) {
		super(v1, v2);

	}

	@Override
	public
	double distance() {
		int i;
		double n = 0;
		int m = 10;
		
		for(i = 0 ; i < dim ; i++){
			n = n + Math.pow(Math.abs(vec1.get(i) - vec2.get(i)),m);	
		}
		return Math.pow(n,1.0/m);
	}

}
