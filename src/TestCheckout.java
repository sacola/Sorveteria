public class TestCheckout {
	public static void main(String[] args) {

		Checkout checkout = new Checkout();

		checkout.insereItem(new Doce("Caramelo de manteiga de amendoim", 0.35, 399));
		checkout.insereItem(new Sorvete("Sorvete de Baunilha", 105));
		checkout.insereItem(new Sundae("Sorvete de flocos", 145, "Calda de caramelo", 50));
		checkout.insereItem(new Cookie("Cookies com passas e aveia", 4, 399));

		System.out.println("\nN�mero de �tens: " + checkout.numeroDeItens());
		System.out.println("\nCusto total: " + checkout.custoTotal());
		System.out.println("\nTotal de impostos: " + checkout.impostoTotal());
		System.out.println("\nCusto + Impostos: " + (checkout.custoTotal() + checkout.impostoTotal()));
		System.out.println(checkout);

		checkout.esvazia();

		checkout.insereItem(new Sorvete("Sorvete de Morango", 145));
		checkout.insereItem(new Sundae("Sorvete de Baunilha", 105, "Caramelo", 50));
		checkout.insereItem(new Doce("Jujuba", 0.83, 89));
		checkout.insereItem(new Cookie("Cookies com chocolate", 4, 399));
		checkout.insereItem(new Doce("Bala puxa-puxa", 0.5, 209));
		checkout.insereItem(new Doce("Delicado", 1.2, 109));

		System.out.println("\nN�mero de �tens: " + checkout.numeroDeItens());
		System.out.println("\nCusto total: " + checkout.custoTotal());
		System.out.println("\nTotal de impostos: " + checkout.impostoTotal());
		System.out.println("\nCusto + Impostos: " + (checkout.custoTotal() + checkout.impostoTotal()));
		System.out.println(checkout);
	}
}
