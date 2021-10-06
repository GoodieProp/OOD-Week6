import java.util.Random;
/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: HandBagOptionsBuilder.java
 */
public class HandBagOptionsBuilder extends HandBagBuilder {
	// Initialized Random object and variables
	Random rand = new Random();
	String brandName;
	
	// Initialized list to be used as a random part of handbag, if user selects to let the program to create
	String[] brandl = {"Dior", "Versace", "Balenciaga", "Gucci", "Louis Vuitton"};
	String[] straps = {"Short", "Medium", "Long"};
	String[] material = {"Cotton", "Leather", "Wool", "Plastic"};
	String[] color = {"Blue", "Red", "Yellow", "Black", "White"};
	String[] decor = {"Anime Sticker", "Animal Crossing Sticker", "Key Chain"};
	String[] types = {"Shoulder Bag", "Crossbody", "Satchel", "Backpack Purse", "Tote Bag"};
	
	
	// sets brand name
	public HandBagOptionsBuilder() {
		this.brand = brandName;
	}
	
	// adds brand name to list of options
	public HandBagBuilder addBrand() {
		int r = rand.nextInt(brandl.length);
		this.options.add("Brand: " + brandl[r]);
		return this;
	}
	// adds brand name to list of options | user input
	public HandBagBuilder addBrand(String b) {
		if (b == "") {
			int r = rand.nextInt(brandl.length);
			this.options.add("Brand: " + brandl[r]);
		} else {
			this.options.add("Brand: " + b);
		}
		return this;
	}

	// adds strap to list of options
	public HandBagBuilder addStrap() {
		int r = rand.nextInt(straps.length);
		this.options.add("Strap Length: " + straps[r]);
		return this;
	}
	// adds strap to list of options | user input
	public HandBagBuilder addStrap(String s) {
		if (s == "") {
			int r = rand.nextInt(straps.length);
			this.options.add("Strap Length: " + straps[r]);
		} else {
			this.options.add("Strap Length: " + s);
		}
		return this;
	}
	// adds material to list of options
	public HandBagBuilder addMaterial() {
		int r = rand.nextInt(material.length);
		this.options.add("Material: " + material[r]);
		return this;
	}
	// adds material to list of options | user input
	public HandBagBuilder addMaterial(String m) {
		if (m == "") {
			int r = rand.nextInt(material.length);
			this.options.add("Material: " + material[r]);
		} else {
			this.options.add("Material: " + m);
		}
		return this;
	}
	// adds color to list of options
	public HandBagBuilder addColor() {
		int r = rand.nextInt(color.length);
		this.options.add("Color: " + color[r]);
		return this;
	}
	// adds color to list of options | user input
	public HandBagBuilder addColor(String c) {
		if (c == "") {
			int r = rand.nextInt(color.length);
			this.options.add("Color: " + color[r]);
		} else {
			this.options.add("Color: " + c);
		}
		return this;
	}
	// adds decorations to list of options
	public HandBagBuilder addDecorations() {
		int r = rand.nextInt(decor.length);
		this.options.add("Decorations: " + decor[r]);
		return this;
	}
	// adds decorations to list of options | user input
	public HandBagBuilder addDecorations(String d) {
		if (d == "") {
			int r = rand.nextInt(decor.length);
			this.options.add("Decorations: " + decor[r]);
		} else {
			this.options.add("Decorations: " + d);
		}
		return this;
	}
	// adds type to list of options
	public HandBagBuilder addType() {
		int r = rand.nextInt(types.length);
		this.options.add("Type: " + types[r]);
		return this;
	}
	// adds type to list of options | user input
	public HandBagBuilder addType(String t) {
		if (t == "") {
			int r = rand.nextInt(types.length);
			this.options.add("Type: " + types[r]);
		} else {
			this.options.add("Type: " + t);
		}
		return this;
	}

}
