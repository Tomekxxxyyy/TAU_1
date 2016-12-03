package main;

import java.util.TreeMap;

public class LiczbaRzymska {
	int liczba;
	TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	
	public LiczbaRzymska(int liczba){
		this.liczba = liczba;
		
		map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
	}
	
	public String toString() {
		if(liczba < 1){
			return "Liczba musi być wieksza od zera";
		}
        int l =  map.floorKey(liczba);
        if ( liczba == l ) {
            return map.get(liczba);
        }
        return map.get(l) + new LiczbaRzymska(liczba - l).toString();
    }
}
