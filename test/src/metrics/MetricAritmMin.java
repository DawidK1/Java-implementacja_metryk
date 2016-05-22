package metrics;

import java.util.List;

public class MetricAritmMin extends Metric {

	public MetricAritmMin(List<Double> v1, List<Double> v2) {
		super(v1, v2);

	}

	@Override
	double distance() {
		double arSum = 0;
		double minSum = 0;
		for(int i = 0 ; i < dim ; i++)
			{
			arSum += vec1.get(i) + vec2.get(i);
			minSum += Math.min(vec1.get(i), vec2.get(i));
			}
		return 2*(minSum/arSum);
	}

}
