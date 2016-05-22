package metrics;

import java.util.List;

public class MetricMinMax extends Metric {

	public MetricMinMax(List<Double> v1, List<Double> v2) {
		super(v1, v2);
		
	}

	@Override
	double distance() {
		double minS = 0;
		double maxS = 0;
		for(int i = 0 ; i < dim ; i++){
			minS += Math.min(vec1.get(i), vec2.get(i));
			maxS += Math.max(vec1.get(i), vec2.get(i));
		}
		return (minS/maxS);
	}

}
