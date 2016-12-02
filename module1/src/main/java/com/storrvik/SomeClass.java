package com.storrvik.module2;

import com.storrvik.module1.SomeService;

public class SomeClass {
	public boolean returnTrue() {
		return new SomeService().returnTrue();
	}
}