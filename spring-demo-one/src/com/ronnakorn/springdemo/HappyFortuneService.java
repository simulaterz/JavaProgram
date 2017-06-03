package com.ronnakorn.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		String fortune[] = {"One","Two","Three"};
		int rnd = new Random().nextInt(fortune.length);
		return fortune[rnd];
	}

}
