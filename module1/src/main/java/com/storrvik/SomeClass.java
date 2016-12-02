package com.storrvik.module2;

import com.storrvik.module1.SomeService;

public class SomeClass {
	
	public int returnNumber() {
		return new SomeService().returnNumber();
	}
	public boolean returnFalse() {
		return new SomeService().returnFalse();
	}
	
	public boolean returnTrue() {
		return new SomeService().returnTrue();
	}
}