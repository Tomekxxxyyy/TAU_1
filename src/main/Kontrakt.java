package main;

import java.util.ArrayList;

public class Kontrakt implements Psikus{

	@Override
	public Integer cyfrokrad(Integer liczba) {
		String liczba_str = liczba.toString();
		int iloscBitow = liczba_str.length();
		if(iloscBitow == 1){
			return null;
		}
		else{
			String[] tablica = liczba_str.split("");
			ArrayList<String> lista = new ArrayList<String>();
			for(int x = 0; x < tablica.length; x++){
				lista.add(tablica[x]);
			}
			int losowaLiczba = (int) (Math.random() * iloscBitow);
			lista.remove(losowaLiczba);
			liczba_str  = "";
			for(String s : lista){
				liczba_str += s;
			}
			return Integer.parseInt(liczba_str);
		}
		
	}

	@Override
	public Integer hultajchochla(Integer liczba) throws NieduanyPsikusException {
		String liczba_str = liczba.toString();
		int iloscBitow = liczba_str.length();
		if(iloscBitow == 1){
			throw new NieduanyPsikusException();
		}
		else{
			String[] tablica = liczba_str.split("");
			int losowaLiczba = (int) (Math.random() * iloscBitow);
			int losowaLiczba2 = 0;
			do{
				losowaLiczba2 = (int) (Math.random() * iloscBitow);
			}while(losowaLiczba == losowaLiczba2);
			System.out.println(losowaLiczba + " " + losowaLiczba2);
			String tmp = tablica[losowaLiczba];
			tablica[losowaLiczba] = tablica[losowaLiczba2];
			tablica[losowaLiczba2] = tmp;
			String wynik = "";
			for(String element: tablica){
				wynik += element;
			}
			return Integer.parseInt(wynik);
		}
	}

	@Override
	public Integer nieksztaltek(Integer liczba) {
		String liczba_str = liczba.toString();
		String[] tablica = liczba_str.split("");
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> listaIndexowDoZmiany = new ArrayList<Integer>();
		for(int x = 0; x < tablica.length; x++){
			if(Integer.parseInt(tablica[x]) == 3 || Integer.parseInt(tablica[x]) == 7 || Integer.parseInt(tablica[x]) == 6){
				listaIndexowDoZmiany.add(x);
			}
			lista.add(Integer.parseInt(tablica[x]));
		}
		if(listaIndexowDoZmiany.isEmpty()){
			return liczba;
		}
		else{
			int losowaLiczba = (int) (Math.random() * listaIndexowDoZmiany.size());
			int indexDoZmiany = listaIndexowDoZmiany.get(losowaLiczba);
			int liczbaDoZmiany = lista.get(indexDoZmiany);
			switch(liczbaDoZmiany){
			case 3:
				lista.set(indexDoZmiany, 8);
				break;
			case 6:
				lista.set(indexDoZmiany, 9);
				break;
			
			case 7:
				lista.set(indexDoZmiany, 1);
				break;
			}
			String wynik = "";
			for(int element : lista){
				wynik += Integer.toString(element);
			}
			return Integer.parseInt(wynik);
		}
	}

}
