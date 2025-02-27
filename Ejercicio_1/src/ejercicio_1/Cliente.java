package ejercicio_1;

import javax.swing.JOptionPane;

public class Cliente {

    private String NombrePersona;
    private int CedulaCliente;
    private int CodigodeFacrura;
    private int Monto;
    private int ProductElecrico;
    private int ProductConstruccion;
    private int ProductAutomotrices;

    public String getNombrePersona() {
        return NombrePersona;
    }

    public void setNombrePersona(String NombrePersona) {
        this.NombrePersona = NombrePersona;
    }

    public int getCedulaCliente() {

        return CedulaCliente;
    }

    public void setCedulaCliente(int CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public int getCodigodeFacrura() {
        return CodigodeFacrura;
    }

    public void setCodigodeFacrura(int CodigodeFacrura) {
        this.CodigodeFacrura = CodigodeFacrura;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public int getProductElecrico() {
        return ProductElecrico;
    }

    public void setProductElecrico(int ProductElecrico) {
        this.ProductElecrico = ProductElecrico;
    }

    public int getProductConstruccion() {
        return ProductConstruccion;
    }

    public void setProductConstruccion(int ProductConstruccion) {
        this.ProductConstruccion = ProductConstruccion;
    }

    public int getProductAutomotrices() {
        return ProductAutomotrices;
    }

    public void setProductAutomotrices(int ProductAutomotrices) {
        this.ProductAutomotrices = ProductAutomotrices;
    }

}
