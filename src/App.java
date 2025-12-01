import factory.*;
import adapter.*;
import strategy.*;

public class App {
    public static void main(String[] args) {

        System.out.println("=== 🏭 PADRÃO CRIACIONAL: FACTORY ===");

        Factory factory = new Factory("Fabrica Sape", "Sapezinho");
        Sneakers s1 = factory.createSneakers("Nike", "Air Jordan", "Vermelha", 42.5);

        System.out.println("Factory criou o tênis:");
        System.out.println("  - Marca: " + s1.getBrand());
        System.out.println("  - Modelo: " + s1.getModel());
        System.out.println("  - Cor: " + s1.getColor());
        System.out.println("  - Tamanho: " + s1.getSize());
        System.out.println();


        System.out.println("=== 🧩 PADRÃO ESTRUTURAL: ADAPTER ===");

        ExternalSupplier ext = new ExternalSupplier();
        ExternalSupplierAdapter adapter = new ExternalSupplierAdapter(ext);

        Sneakers imported = adapter.getSneakers();

        System.out.println("Fornecedor externo trouxe dados DESPADRONIZADOS (fetch...):");
        System.out.println("  - " + ext.fetchBrand());
        System.out.println("  - " + ext.fetchModel());
        System.out.println("  - " + ext.fetchColor());
        System.out.println("  - " + ext.fetchSize());

        System.out.println("Adapter CONVERTEU para objeto Sneaker compatível:");
        System.out.println("  - Marca: " + imported.getBrand());
        System.out.println("  - Modelo: " + imported.getModel());
        System.out.println("  - Cor: " + imported.getColor());
        System.out.println("  - Tamanho: " + imported.getSize());
        System.out.println();


        System.out.println("=== 🚚 PADRÃO COMPORTAMENTAL: STRATEGY ===");

        Purchase purchase = new Purchase(imported);

        purchase.setStrategy(new CheapShipping());
        double cheap = purchase.calculateFreight(100);

        purchase.setStrategy(new ExpressShipping());
        double express = purchase.calculateFreight(100);

        System.out.println("Simulação de frete com estratégias diferentes:");
        System.out.println("  - Frete Econômico: R$ " + cheap);
        System.out.println("  - Frete Expresso:  R$ " + express);
    }
}
