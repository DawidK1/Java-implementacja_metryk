package metrics;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class test_class{
	
	public static void main (String[] args){

		List<ArrayList<Double>> data ;
		List<Double> v1;
		List<Double> v2;
		Random rand = new Random();
		//obiekty mierzace odleglos
		metricEuklides euk;
		MetricTaxi taxi;
		MetricMinkowski mink;
		MetricCanberr can;
		metricMaximum max;
		MetricAbsExp absexp;
		MetricAritmMin armin;
		MetricCos cos;
		MetricGeoMin geo;
		MetricHumming humm;
		MetricJaccard jacc;
		MetricMinMax minmax;
		
		//statystyki do poszczegolnych obiektow
		Statistic eukS = new Statistic();
		Statistic taxiS = new Statistic();
		Statistic minkS = new Statistic();
		Statistic canS = new Statistic();
		Statistic maxS = new Statistic();

		Statistic absexpS = new Statistic();
		Statistic arminS = new Statistic();
		Statistic cosS = new Statistic();
		Statistic geoS = new Statistic();
		Statistic hummS = new Statistic();
		Statistic jaccS = new Statistic();
		Statistic minmaxS = new Statistic();
		int v1num;
		int v2num;
		int col = 0;
		int row = 0;
		int lrange = 0;
		int hrange = 1;
		int howMany = 1;
		int randomCols = 0;
		int coordinate;
		boolean incorrectData;
		
		Scanner input = new Scanner(System.in);
		do{
			incorrectData = false;
			System.out.print("Wprowadz liczbe wierszy do wygenerowania: ");
			col = input.nextInt();
			System.out.print("Wprowadz liczbe kolumn do wygenerowania: ");
			row = input.nextInt();
			System.out.print("Wprowadz dolny zakres generowania wartosci: ");
			lrange = input.nextInt();
			System.out.print("Wprowadz gorny zakres generowania wartosci: ");
			hrange = input.nextInt();
			System.out.print("Wprowadz liczbe pomiarow: ");
			howMany = input.nextInt();	
			System.out.print("Wprowadz liczbe elementow z jednego wiersza do porownania: ");
			randomCols = input.nextInt();	
			
			if(col < 2 || row < 1 || lrange >= hrange || howMany < 1 || randomCols < 1 || randomCols > col)
				{
				System.out.println("Niepoprawne dane, wprowadz jeszcze raz");
				incorrectData = true;
				}
		}while(incorrectData);
		
		input.close();
		
		//generujemy losowe dane
		gene(row, col, lrange, hrange, "data.txt");
		
		//wczytujemy dane do listy
		try{
			data = readFromFile(col, row, "data.txt");
		}
		catch (FileNotFoundException e){
			System.out.println("File not found");
			data = new ArrayList<ArrayList<Double>>();
			System.exit(-1);
		}
		
		
		for (int  i = 0; i < howMany ; i++)
		{
			//Losujemy dwa rozne wiersze
			v1num = rand.nextInt(col);
			
			do{
			v2num = rand.nextInt(col);
			}while(v1num == v2num);
			
			v1 = new ArrayList<Double>();
			v2 = new ArrayList<Double>();
			//po wybraniu dwoch roznych wierszy losujemy niektore ich elementy, w ilosci randomCols
			for(int j = 0 ; j < randomCols ; j++){
				coordinate = rand.nextInt(row);
			v1.add(data.get(v1num).get(coordinate));
			v2.add(data.get(v2num).get(coordinate));
			}


			//mierzymy je wszystkimi metrykami;
			euk = new metricEuklides(v1,v2);
			taxi = new MetricTaxi(v1,v2);
			mink = new MetricMinkowski(v1,v2);
			can = new MetricCanberr(v1,v2);
			max = new metricMaximum(v1,v2);			
			absexp = new MetricAbsExp(v1,v2);
			armin = new MetricAritmMin(v1,v2);
			cos = new MetricCos(v1,v2);
			geo = new MetricGeoMin(v1,v2);
			jacc = new MetricJaccard(v1,v2);
			minmax = new MetricMinMax(v1,v2);
			humm = new MetricHumming(v1,v2);
			

			// dodajemy kazdy wynik do statystyk
			maxS.add(max.distance(), v1num, v2num);
			eukS.add(euk.distance(), v1num, v2num);
			canS.add(can.distance(), v1num, v2num);
			minkS.add(mink.distance(), v1num, v2num);
			taxiS.add(taxi.distance(), v1num, v2num);
			absexpS.add(absexp.distance(), v1num, v2num);
			arminS.add(armin.distance(), v1num, v2num);
			cosS.add(cos.distance(), v1num, v2num);
			geoS.add(geo.distance(), v1num, v2num);
			hummS.add(humm.distance(), v1num, v2num);
			jaccS.add(jacc.distance(), v1num, v2num);
			minmaxS.add(minmax.distance(), v1num, v2num);
		}
System.out.println("Dane zbiorcze:");
System.out.println("----------------------");
System.out.print("Euklides\n");
eukS.Show();
System.out.print("Taxi\n");
taxiS.Show();
System.out.print("Minkowski\n");
minkS.Show();
System.out.print("Canberr\n");
canS.Show();
System.out.print("Maximum\n");
maxS.Show();
System.out.print("AbsExp\n");
absexpS.Show();
System.out.print("AritmMin\n");
arminS.Show();
System.out.print("Cos\n");
cosS.Show();
System.out.print("Geo\n");
geoS.Show();
System.out.print("Humming\n");
hummS.Show();
System.out.print("Jaccard\n");
jaccS.Show();
System.out.print("MinMax\n");
minmaxS.Show();




	}//////////////////////////Main
	static void gene(int row, int col,int min,int max, String dest) {
//Funkcja generuje pseudolosowe dane w ilosci row * col z zakresu od
//min do max i zapisuje je w pliku o naziw dest
		
		try {
			PrintWriter zapis = new PrintWriter(dest);
			Random gen = new Random();
			
			String dataToSave;
			int temp;
			
			for(int j = 0 ; j < row ; j++){
				dataToSave = "";
				
				for(int i = 0 ; i < col ; i++){
					temp = min + gen.nextInt(Math.abs(max - min));
					dataToSave = dataToSave + temp + " ";
					}	
				zapis.println(dataToSave + "\n");
				}
		zapis.close();	

		} catch (FileNotFoundException e) {
			System.exit(-1);
		}


}
	static List<ArrayList<Double>> readFromFile(int vecs, int length, String src) 
			throws FileNotFoundException{
		//Funkcja pobiera dane z pliku src i zapisuje je do tablicy tablic zlozonej z vecs tablic typu double
		// z ktorych kazda ma length elementow
		List<ArrayList<Double>> result = new ArrayList<ArrayList<Double>>();
		ArrayList<Double> temp;
		Scanner odczyt = new Scanner(new File(src));	
		
		for(int i = 0 ; i < vecs ; i++){
			temp = new ArrayList<Double>();
			
			for(int j = 0 ; j < length ; j++){
				{
					temp.add((double) odczyt.nextInt());
				} 
				
			}
			result.add(temp);
		}
		
		odczyt.close();
		return result;
		
	}
	
}


