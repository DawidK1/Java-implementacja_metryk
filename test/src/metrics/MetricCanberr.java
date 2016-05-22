
package metrics;

import java.util.List;

public class MetricCanberr extends Metric {

	public MetricCanberr(List<Double> v1, List<Double> v2) {
		super(v1, v2);

	}

	@Override
	double distance() {
	double result=0;
		int i;
		for(i = 0 ; i < dim ; i++){
			if(Math.abs(vec1.get(i)+vec2.get(i)) > 0)
			result=result+Math.abs(vec1.get(i)-vec2.get(i))/Math.abs(vec1.get(i)+vec2.get(i));
		}
	return result;
	}

}
