package metrics;

import static org.junit.Assert.*;


import java.util.*;
public class jUnitTests {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	@org.junit.Test
	public void checkEuklides(){
		List<Double> a = new ArrayList<Double>();
		a.add(3.0);
		a.add(0.0);
		List<Double> b = new ArrayList<Double>();
		b.add(0.0);
		b.add(4.0);		
		
		metricEuklides m = new metricEuklides(a,b);
		
		assertEquals(5.0, m.distance(), 0.0001);
		
		
	}
	@org.junit.Test
	public void checkTaxi()
	{
		List<Double> a = new ArrayList<Double>();
		a.add(3.0);
		a.add(0.0);
		List<Double> b = new ArrayList<Double>();
		b.add(0.0);
		b.add(4.0);	
		
		MetricTaxi m = new MetricTaxi(a,b);
		assertEquals(7.0, m.distance(), 0.0001);
		
	}
}
