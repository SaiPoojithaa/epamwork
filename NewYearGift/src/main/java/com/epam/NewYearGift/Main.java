package com.epam.NewYearGift;

public class Main {
public static void main(String args[]) {

	
	Sweet sweet=new Sweet();
	sweet.setInfo("Akshay", "Rishi", "Laddu");
	sweet.getInfo();
	
	System.out.println();

	System.out.println();
//Gift -> sweet -> Halva
	Halwa halva=new Halwa();
	halva.setSweetType("Dessert");
	halva.setInfo("Raam", "Carrot halva", 1000, 1500, 750);
	halva.getInfo();
	
	System.out.println();
//Gift -> sweet ->Laddu
	Badhusha laddu=new Badhusha();
	laddu.setInfo("SweetMagic", "Besan Laddu", 150, 756, 10);
	laddu.setSweetType("Starter");
	laddu.getInfo();
	
	
}
}