package com.fatih.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1. dik kenar giriniz: ");
		int birinciDikKenar = scan.nextInt();
		
		System.out.print("2. dik kenar giriniz: ");
		int ikinciDikKenar = scan.nextInt();
				
		int sonuc = (birinciDikKenar*birinciDikKenar)+(ikinciDikKenar*ikinciDikKenar);
		double hipotenus = Math.sqrt(sonuc);
		System.out.println("hipotenus: "+hipotenus);
		
		double ucgenCevre = (birinciDikKenar+ikinciDikKenar+hipotenus);
		System.out.println("Ucgenin cevresi: "+ucgenCevre);
		
		double u = ucgenCevre/2;		
		double sonuc2 = u * (u-birinciDikKenar) * (u-ikinciDikKenar) * (u-hipotenus);
		double ucgenAlan = Math.sqrt(sonuc2);
		
		System.out.println("Ucgenin Alani: "+ucgenAlan);
		
	}

}
