package metrics;

import java.util.List;

public class metricRiver extends Metric {

	metricRiver(List<Double> v1, List<Double> v2) {
		super(v1, v2);
	}

	public double distance(){
		double result = 0;
		result=vec1.get(2)+vec2.get(2)+Math.abs(vec1.get(1)-vec.get(1));
		
		return result;
	}
}
