package Latihan2;

public class DemoKonversiSuhu {
	public static void main(String[] args) {
		KonversiSuhu2 konversiSuhu1 = new KonversiSuhu2();
		double celcius = 100;
		System.out.println("Celcius to Fahrenheit: " + konversiSuhu1.celciusToFahrenheit(celcius));
        System.out.println("Celcius to Reamur: " + konversiSuhu1.celciusToReamur(celcius));
		KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();
        double fahrenheit = 212;
        System.out.println("Fahrenheit to Reamur: " + konversiSuhu2.fahrenheitToReamur(fahrenheit));
	}
}
