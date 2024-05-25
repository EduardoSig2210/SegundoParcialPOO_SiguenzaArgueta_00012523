package Builder;

public class EShop_builder {
    private String Usuario;
    private String Empresa;

    private String Proveedor;

    public String getUsuario() {
        return Usuario;
    }

    public EShop_builder Usuario(String usuario) {
        Usuario = usuario;
        return this;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public EShop_builder Empresa(String empresa) {
        Empresa = empresa;
        return this;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public EShop_builder Proveedor(String proveedor) {
        this.Proveedor = proveedor;
        return this;
    }

    @Override
    public String toString() {
        return Usuario +
                ":" + Empresa + "\n Proveedor: " + Proveedor;
    }
}
