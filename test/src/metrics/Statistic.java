package metrics;

import java.util.ArrayList;
import java.util.List;

public class Statistic {
	private List<Double> measures;
	private double min;
	private double max;

	private int maxv1;
	private int maxv2;
	private int minv1;
	private int minv2;
	public double average;
	public Statistic() {
		measures = new ArrayList<Double>();
		max = -1;
		min = -1;
	}
	public void add(double val, int v1, int v2)
	{
		measures.add(val);
		if (val < min || min == -1){
			min = val;
			minv1 = v1;
			minv2 = v2;
		}

		if (val > max|| max == -1){
			max = val;
			maxv1 = v1;
			maxv2 = v2;
		}

	}
	public double getAverage(){
		double result = 0;
		if(measures.size() != 0)
		{
			for(int i = 0 ; i < measures.size(); i++ )
			{
				result = result + measures.get(i)*(1.0/measures.size());
			}
		}
		return result;
	}
	public double getMin(){
		return min;
	}
	public double getMax(){
		return max;
	}
	public void Show()
	{
		System.out.printf("min: %.4f, pomiedzy elementami wierszy nr. %d i nr. %d\n", min, minv1, minv2);
		System.out.printf("Srednia: %.4f\n", getAverage());
		System.out.printf("max: %.4f, pomiedzy elementami wierszy nr. %d oraz nr. %d\n\n-------------------\n", max, maxv1, maxv2);
	}
}
