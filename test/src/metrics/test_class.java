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
		//statystyki do poszczegolnych obiektow
		Statistic eukS = new Statistic();
		Statistic taxiS = new Statistic();
		Statistic minkS = new Statistic();
		Statistic canS = new Statistic();
		Statistic maxS = new Statistic();
		
		int v1num;
		int v2num;
		//generujemy losowe dane
		gene(100, 100, -1000, 1000, "data.txt");
		
		//wczytujemy dane do listy
		try{
			data = readFromFile(100, 100, "data.txt");
		}
		catch (FileNotFoundException e){
			System.out.println("File not found");
			data = new ArrayList<ArrayList<Double>>();
			System.exit(-1);
		}
		
		
		for (int  i = 0 ; i < 80 ; i++)
		{
			//Losujemy dwa rozne wektory 
			v1num = rand.nextInt(100);
			do{
			v2num = rand.nextInt(100);
			}while(v1num == v2num);

			v1 = data.get(v1num);
			v2 = data.get(v2num);

			//mierzymy je wszystkimi metrykami;
			euk = new metricEuklides(v1,v2);
			taxi = new MetricTaxi(v1,v2);
			mink = new MetricMinkowski(v1,v2);
			can = new MetricCanberr(v1,v2);
			max = new metricMaximum(v1,v2);

			// dodajemy kazdy wynik do statystyk
			maxS.add(max.distance());
			eukS.add(euk.distance());
			canS.add(can.distance());
			minkS.add(mink.distance());
			taxiS.add(taxi.distance());
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
			System.out.printf("catch");
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


