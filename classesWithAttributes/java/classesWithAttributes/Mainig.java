package classesWithAttributes;

public class Mainig {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescripton("Acer Laptop");
		product.setPrice(8000);
		product.setStockAmount(120);

		ProdutManager productManager = new ProdutManager();
		productManager.Add(product);
		System.out.println("Urun kodu :"+product.getKod());

	}

}
