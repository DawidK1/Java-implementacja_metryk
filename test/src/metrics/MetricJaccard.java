package metrics;

import java.util.List;

public class MetricJaccard extends Metric {

	public MetricJaccard(List<Double> v1, List<Double> v2) {
		super(v1, v2);

	}

	@Override
	double distance() {
		double sum = 0;
		for(int i = 0 ; i < dim ; i++)
			{
			for(int j = 0 ; j < dim ; j++)
				{
				if(vec1.get(i) == vec2.get(j))
					{
					sum = sum + 1;
					continue;
					}
				}
			}
		return 1.0 - sum/(double)dim;
	}

}
