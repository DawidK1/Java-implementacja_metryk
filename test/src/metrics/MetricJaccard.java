package metrics;

import java.util.List;

public class MetricJaccard extends Metric {

	public MetricJaccard(List<Double> v1, List<Double> v2) {
		super(v1, v2);

	}

	@Override
	double distance() {
		double sum = 0;
		double a,b;
		for(int i = 0 ; i < dim ; i++)
			{
			for(int j = 0 ; j < dim ; j++)
				{
				a = vec1.get(i);
				b = vec2.get(j);
				if(a == b)
					{
					sum = sum + 1;
					break;
					}
				}
			}
		return (1.0 - (sum/dim));
	}

}
