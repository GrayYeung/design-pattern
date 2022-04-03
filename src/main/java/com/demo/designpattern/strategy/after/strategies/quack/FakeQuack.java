package com.demo.designpattern.strategy.after.strategies.quack;

public class FakeQuack implements QuackBehavior {

	public void quack() {
		System.out.println("FakeQuack");
	}

}
