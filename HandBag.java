import java.util.*;
/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: HandBag.java
 */
public class HandBag {
	// Initialized Variables
	String brand;
	List<String> options;
	
	// function to set the list of options
	void setOptions(List<String> options) {
		this.options = options;
	}
	
	// function to set the brand name
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// function to simulate preparing the hand bag
	void prepare() {
		System.out.println("\nPreparing Hand Bag");
		System.out.println("Stiching...");
		System.out.println("Getting the correct length...");
		System.out.println("Almost done!");
	}
	
	// toString to display to user their customized handbag
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("\nHere is your perfect hand bag!\n");
		for (String option : options) {
			display.append(option + "\n");
		}
		options.clear();
		return display.toString();
	}
}
