package ua.org.shaddy.cardsgame.testutil;

import java.util.UUID;

public class Generators {
	public static String genNewName(){
		return UUID.randomUUID().toString();
	}

	public static String genNewDescription() {
		return "Description:" + UUID.randomUUID().toString();
	}

	public static String genNewString() {
		return UUID.randomUUID().toString();
	}
}
