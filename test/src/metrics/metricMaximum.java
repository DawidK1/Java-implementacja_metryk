package metrics;

import java.util.List;

public class metricMaximum extends Metric{

	public metricMaximum(List<Double> v1, List<Double> v2) {
		super(v1, v2);
		
	}

	public double distance(){//metryka maksimum
		double result=0;
		double p=0;
		int i=0;
		for (i=0;i<dim;i++){
			p=Math.abs(vec1.get(i) - vec2.get(i));
			if(p>result){result=p;}
			}
		return result;
	}	
}
