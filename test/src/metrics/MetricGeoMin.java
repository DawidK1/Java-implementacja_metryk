package metrics;

import java.util.List;

public class MetricGeoMin extends Metric {

	public MetricGeoMin(List<Double> v1, List<Double> v2) {
		super(v1, v2);
	}

	@Override
	double distance() {
		double minS = 0;
		double geoS = 0;
		for(int i = 0; i < dim ; i++)
		{
			minS += Math.min(vec1.get(i), vec2.get(i));
			geoS += Math.sqrt(Math.abs(vec1.get(i)* vec2.get(i)));
			
		}
		return (minS/geoS);
	}

}
