package com.codeclan.md;
 
import java.util.ArrayList;

public class Farm {
	
	 protected ArrayList farmyard;
	
	 
	public void setFarmyard(ArrayList farmyard) {
		this.farmyard = farmyard;
	}
	
	public ArrayList getFarmyard() {
		return farmyard;
	}

	public Farm(){
		this.farmyard = new ArrayList<Livestock>();
	}
	
	public boolean buy(Livestock species){
		return farmyard.add(species);
	}
	
	public boolean sell(Livestock species){
		return farmyard.remove(species);
	}
	

	}


