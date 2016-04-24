package com.codeclan.md;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FarmTest {

	Livestock livestock;
	Farm farm;
	Cow cow;
	Pig pig;
	Chicken chicken;

	@Before
	public void setup() {
		farm = new Farm();
		cow = new Cow("Shetland");
		pig = new Pig("duroc");
		chicken = new Chicken("Orpington Buff");
	}

	@Test
	public void testFarmCanBuyLivestock() {
		
		farm.buy(cow);
		farm.buy(pig);
		assertEquals(2, farm.getFarmyard().size());
//		System.out.println("Livestock on farm: " + farm.getFarmyard());
		System.out.println("Breeds on the farm: " + (cow.breed) + ", " + (pig.breed)+ ", "+ (chicken.breed));
	}
	
	@Test
	public void testFarmCanSellLivestock() {
		farm.buy(cow);
		farm.buy(chicken);
		farm.buy(pig);
		farm.sell(cow);
		assertEquals(2, farm.getFarmyard().size());
		int totallivestock = farm.getFarmyard().size();
		System.out.println("Total heads of livestock on farm :" + totallivestock );
		System.out.println(farm);
	}
	
	
		
		
	
}
	


