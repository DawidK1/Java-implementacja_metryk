package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

//import org.junit.Test;
import metrics.*;
public class MainTest {


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
		@org.junit.Test
		public void checkCanberr()
		{
			List<Double> a = new ArrayList<Double>();
			a.add(3.0);
			a.add(0.0);
			List<Double> b = new ArrayList<Double>();
			b.add(0.0);
			b.add(4.0);	
			
			MetricCanberr m = new MetricCanberr(a,b);
			assertEquals(2.0, m.distance(), 0.0001);
			
	}
		@org.junit.Test
		public void checkCos()
		{
			List<Double> a = new ArrayList<Double>();
			a.add(3.0);
			a.add(0.0);
			List<Double> b = new ArrayList<Double>();
			b.add(0.0);
			b.add(4.0);	
			
			MetricCos m = new MetricCos(a,b);
			assertEquals(0.0, m.distance(), 0.0001);
			
	}
		@org.junit.Test
		public void checkGeoMin()
		{
			List<Double> a = new ArrayList<Double>();
			a.add(3.0);
			a.add(1.0);
			List<Double> b = new ArrayList<Double>();
			b.add(1.0);
			b.add(4.0);	
			
			MetricGeoMin m = new MetricGeoMin(a,b);
			assertEquals(0.53589, m.distance(), 0.0001);
			
	}
		@org.junit.Test
		public void checkHumming()
		{
			List<Double> a = new ArrayList<Double>();
			a.add(3.0);
			a.add(1.0);
			List<Double> b = new ArrayList<Double>();
			b.add(1.0);
			b.add(4.0);	
			
			MetricHumming m = new MetricHumming(a,b);
			assertEquals(1.0, m.distance(), 0.0001);
			
	}
		@org.junit.Test
		public void checkJaccard()
		{
			List<Double> a = new ArrayList<Double>();
			a.add(3.0);
			a.add(1.0);
			List<Double> b = new ArrayList<Double>();
			b.add(1.0);
			b.add(4.0);	
			
			MetricJaccard m = new MetricJaccard(a,b);
			assertEquals(0.5, m.distance(), 0.0001);
			
	}
		@org.junit.Test
		public void checkMaximum()
		{
			List<Double> a = new ArrayList<Double>();
			a.add(3.0);
			a.add(1.0);
			List<Double> b = new ArrayList<Double>();
			b.add(1.0);
			b.add(4.0);	
			
			metricMaximum m = new metricMaximum(a,b);
			assertEquals(3.0, m.distance(), 0.0001);
			
	}

		@org.junit.Test
		public void checkMinMax()
		{
			List<Double> a = new ArrayList<Double>();
			a.add(3.0);
			a.add(1.0);
			List<Double> b = new ArrayList<Double>();
			b.add(1.0);
			b.add(4.0);	
			
			MetricMinMax m = new MetricMinMax(a,b);
			assertEquals(0.28571, m.distance(), 0.0001);
			
	}
		public void checkMinkowski()
		{
			List<Double> a = new ArrayList<Double>();
			a.add(3.0);
			a.add(1.0);
			List<Double> b = new ArrayList<Double>();
			b.add(1.0);
			b.add(4.0);	
			
			MetricMinkowski m = new MetricMinkowski(a,b);
			assertEquals(3.00516, m.distance(), 0.0001);
			
	}
}
