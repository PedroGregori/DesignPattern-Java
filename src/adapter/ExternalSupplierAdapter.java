package adapter;

import factory.Sneakers;

public class ExternalSupplierAdapter implements SupplierAdapter {

    private ExternalSupplier external;

    public ExternalSupplierAdapter(ExternalSupplier external){
        this.external = external;
    }

    @Override
    public Sneakers getSneakers() {
        return new Sneakers(
            external.fetchBrand(),
            external.fetchModel(),
            external.fetchColor(),
            external.fetchSize()
        );
    }
}
