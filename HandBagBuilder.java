import java.util.ArrayList;
import java.util.List;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * File: HandBagBuilder.java
 */
public abstract class HandBagBuilder {
	String brand;
	List<String> options = new ArrayList<String>();
	
	public abstract HandBagBuilder addBrand();
	public abstract HandBagBuilder addBrand(String b);
	public abstract HandBagBuilder addStrap();
	public abstract HandBagBuilder addStrap(String s);
	public abstract HandBagBuilder addMaterial();
	public abstract HandBagBuilder addMaterial(String m);
	public abstract HandBagBuilder addColor();
	public abstract HandBagBuilder addColor(String c);
	public abstract HandBagBuilder addDecorations();
	public abstract HandBagBuilder addDecorations(String d);
	public abstract HandBagBuilder addType();
	public abstract HandBagBuilder addType(String t);
	
	public HandBag hbBuilder() {
		HandBag hb = new HandBag();
		hb.setBrand(this.brand);
		hb.setOptions(options);
		return hb;
	}
}
