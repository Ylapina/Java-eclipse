import java.text.NumberFormat;

public class Product {
	private String code;
	private String description;
	private String price;
	protected static int count = 0;
	
	public Product() {
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description;
	}
	public static int getCount() {
		return count;
	}
    
}
