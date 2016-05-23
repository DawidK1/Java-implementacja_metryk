package metrics;

import java.util.ArrayList;
import java.util.List;

public class Statistic {
	private List<Double> measures;
	private double min;
	private double max;
	public double average;
	public Statistic() {
		measures = new ArrayList<Double>();
		max = -1;
		min = -1;
	}
	public void add(double val)
	{
		measures.add(val);
		if (val < min || min == -1)
			min = val;
		if (val > max|| max == -1)
			max = val;
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
		System.out.printf("min: %.4f\n", min);
		System.out.printf("Srednia: %.4f\n", getAverage());
		System.out.printf("max: %.4f\n-------------------\n", max);
	}
}
