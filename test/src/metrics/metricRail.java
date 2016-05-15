package metrics;

import java.util.List;

public class metricRail extends Metric{
	metricRail(List<Double> v1, List<Double> v2) {
		super(v1, v2);
	}
	public double distance(){//metryka kolejowa
		double p, q;
		p=Math.sqrt(vec1.get(0)*vec1.get(0)+vec1.get(1)*vec1.get(1));
		q=Math.sqrt(vec2.get(0)*vec2.get(0)+vec2.get(1)*vec2.get(1));
		return p+q;
	}
}
