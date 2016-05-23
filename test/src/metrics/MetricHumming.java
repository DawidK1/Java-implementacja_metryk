package metrics;

import java.util.List;

public class MetricHumming extends Metric {

	public MetricHumming(List<Double> v1, List<Double> v2) {
		super(v1, v2);

	}

	@Override
	double distance() {
		double diff = 0;
		double a,b;
		for(int i = 0; i < dim ; i++)
		{
			a = vec1.get(i);
			b = vec2.get(i);
			if(a != b)
				{
				diff = diff + 1;
				}
		}
		return  diff/dim;
	}
//

}
