import javax.swing.JOptionPane;

public class Muffins {

	private String muffType;
	private String muffSize;
	private int muffQuantity;
	private double muffPrice;
	
	
	//Methods and functions
	
	//contstructor
	public Muffins(String n, String size, int quantity) {
		muffType = n;
		muffSize = size;
		muffQuantity = quantity;
		setPrice();
		
	}
	
	public void setType (String t) {
		muffType = t;
	}
	
	
	public String getType() {
		return muffType;
	}
	
	public void setSize (String n) {
		muffSize = n;
	}
	
	
	public String getSize() {
		return muffSize;
	}
	
	public void setQuantity (int n) {
		muffQuantity = n;
	}
	
	
	public int getQuantity() {
		return muffQuantity;
	}
	
	public void setPrice() { 
		muffPrice = muffQuantity * 1.50;
		String input = JOptionPane.showInputDialog(null, "Enter the promo code MUFF to recieve 10% off of your order");
			if (input.contentEquals("MUFF")) {
				muffPrice *= 0.9;
	}		else {
		muffPrice = muffQuantity * 1.50;
	}}
	
	public double getPrice() {
		return muffPrice; 
	}

	
	
	
	//toString method
	public String toString() {
		return "Your order: " + '\n' + "Muffin Type: " + muffType + '\n' + "Muffin Size: " 
				+ muffSize + '\n' + "Muffin Quantity: " + muffQuantity + '\n' + "Total: $" + muffPrice; 
	}
	
	
}
