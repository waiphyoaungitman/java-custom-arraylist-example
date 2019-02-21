package com.wai;

import java.util.ArrayList;

public class MyArrayList {
private static ArrayList<Contacts> arraylist;
public static void main(String[]args) {
	arraylist = new ArrayList<>();
	arraylist.add(new Contacts("Alexander",45,"ale@mail.com"));
	arraylist.add(new Contacts("Liu Bang",60,"liu@mail.com"));
	arraylist.add(new Contacts("Aung Aung",24,"aung@gmail.com"));
	for(int i=0;i<arraylist.size();i++) {
		System.out.println(arraylist.get(i).getName() + "   " + arraylist.get(i).getAge()+"   "+
				arraylist.get(i).getEmail());
	}
}
}
