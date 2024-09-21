package Latihan1;

public class MatematikaInheritance {
	public static void main(String[] args) {
		Matematika2 soal1 = new Matematika2();
		soal1.pertambahan(20,10);
		System.out.println("Pertambahan: " + soal1.getpertambahan());
		Matematika2 soal2 = new Matematika2();
		soal2.pengurangan(10,5);
		System.out.println("Pengurangan: " + soal2.getpengurangan());
		Matematika2 soal3 = new Matematika2();
		soal3.perkalian(10,3);
		System.out.println("Perkalian: " + soal3.getperkalian());
		Matematika2 soal4 = new Matematika2();
		soal4.pembagian(21,2);
		System.out.println("Pembagiann: " + soal4.getpembagian());
		Matematika2 soal5 = new Matematika2();
		soal5.modulus(23,3);
		System.out.println("Modulus: " + soal5.getmodulus());
		}
}
