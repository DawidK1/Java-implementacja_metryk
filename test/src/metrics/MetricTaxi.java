package metrics;

import java.util.List;

public class MetricTaxi extends Metric {

	public MetricTaxi(List<Double> v1, List<Double> v2) {
		super(v1, v2);
	}

	@Override
	public
	double distance() {
		double result = 0;
		double temp;
		int i;
		for(i = 0 ; i < dim ; i++)
			{
			temp = vec1.get(i) - vec2.get(i);
			if(temp < 0)
				{temp = -temp;}
			
			result = result + temp;
		
			}	
		
		return result;
	}

}
