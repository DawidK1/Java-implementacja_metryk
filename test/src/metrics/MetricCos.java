package metrics;

import java.util.List;

public class MetricCos extends Metric {

	public MetricCos(List<Double> v1, List<Double> v2) {
		super(v1, v2);

	}

	@Override
	double distance() {
		double upSum = 0;
		double v1Sum = 0;
		double v2Sum = 0;
		for(int i = 0 ; i < dim ; i++)
		{
			upSum += vec1.get(i)*vec2.get(i);
			v1Sum += vec1.get(i)*vec1.get(i);
			v2Sum += vec2.get(i)*vec2.get(i);
		}
		upSum = Math.abs(upSum);
		return upSum/Math.sqrt(v1Sum*v2Sum);
	}

}
