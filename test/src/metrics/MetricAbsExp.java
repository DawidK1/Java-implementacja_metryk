package metrics;

import java.util.List;

public class MetricAbsExp extends Metric {

	public MetricAbsExp(List<Double> v1, List<Double> v2) {
		super(v1, v2);
		// TODO Auto-generated constructor stub
	}

	@Override
	double distance() {
		double sum = 0;
		for(int i = 0; i < dim ; i++){
			sum += Math.abs(vec1.get(i) - vec2.get(i));
		}
		return Math.exp(-sum);
	}

}
