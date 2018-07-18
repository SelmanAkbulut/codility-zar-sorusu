package deneme;

import java.util.Arrays;

public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gelendizi = {1, 1, 6}; //dice number
		
		Arrays.sort(gelendizi);
		int toplambir = 0;
		int toplamiki = 0;
		int toplamuc = 0;
		int toplamdort = 0;
		int toplambes = 0;
		int toplamalti = 0;
		int enk=6;
		for (int i = 0; i < gelendizi.length; i++) { //Cost For 1
			if(gelendizi[i]==6) {
				toplambir +=2;
			}
			else if(gelendizi[i]!=1){
				toplambir++;
			}
		}
		for (int i = 0; i < gelendizi.length; i++) { //Cost For 2
			if(gelendizi[i]==5) {
				toplamiki +=2;
			}
			else if(gelendizi[i]!=2){
				toplamiki++;
			}
		}
		for (int i = 0; i < gelendizi.length; i++) { //Cost For 3
			if(gelendizi[i]==4) {
				toplamuc +=2;
			}
			else if(gelendizi[i]!=3){
				toplamuc++;
			}
		}
		for (int i = 0; i < gelendizi.length; i++) { //Cost For 4
			if(gelendizi[i]==3) {
				toplamdort +=2;
			}
			else if(gelendizi[i]!=4){
				toplamdort++;
			}

		}
		for (int i = 0; i < gelendizi.length; i++) { //Cost For 5
			if(gelendizi[i]==2) {
				toplambes +=2;
			}
			else if(gelendizi[i]!=5){
				toplambes++;
			}
		}
		for (int i = 0; i < gelendizi.length; i++) { //Cost For 6
			if(gelendizi[i]==1) {
				toplamalti +=2;
			}
			else if(gelendizi[i]!=6){
				toplamalti++;
			}
		}
		//lowest cost to equalize all dice Bütün zarlari ayni sayiya getirmek için en dusuk maliyet
		enk=toplambir;
		if(enk>toplamiki)enk=toplamiki;
		if(enk>toplamuc)enk=toplamuc;
		if(enk>toplamdort)enk=toplamdort;
		if(enk>toplambes)enk=toplambes;
		if(enk>toplamalti)enk=toplamalti;
		System.out.println("Lower Cost : " + enk);
		//
		}

}
