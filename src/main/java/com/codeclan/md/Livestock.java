package com.codeclan.md;

import java.util.ArrayList;

public abstract class Livestock {
	
	protected String species;
	protected String breed;
	protected String tag;
	
	public Livestock(){
		
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	


	
}
