package org.netpod.utility;

public class Utility {
	public void print(String text) {
		System.out.println("Print: " + text);
	}
	
	public String getStatus(int x) {
		if (x == 1) {
			return "10";
		} else if (x == 2) {
			return "20";
		} else if (x == 3) {
			return "30";
		}
		return "Yikes";
	}
}
