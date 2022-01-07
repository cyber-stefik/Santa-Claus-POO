package entities;

public final class Present {
	private final String productName;
	private final Double price;
	private final String category;

	public Present(String productName, Double price, String category) {
		this.productName = productName;
		this.price = price;
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public Double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Present{" +
				"productName='" + productName + '\'' +
				", price=" + price +
				", category='" + category + '\'' +
				'}';
	}
}
