package metrics;

import java.util.List;

public class MetricDiscrete extends Metric {

	public MetricDiscrete(List<Double> v1, List<Double> v2) {
		super(v1, v2);

	}

	@Override
	double distance() {
		int i;
		for(i = 0 ; i < dim ; i++){
			if(vec1.get(i) != vec2.get(i))	{return 1;}		
		}
	return 0;
	}

}
