package ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio_1 {
  

    

    public static void main(String[] args) {

        Cliente Persona1 = new Cliente();
        Agente Agente1 = new Agente();

        Persona1.setNombrePersona(JOptionPane.showInputDialog("Digite el nombre: "));
        Persona1.setCedulaCliente(Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del Cliente")));
        Persona1.setCodigodeFacrura(Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de factura del Cliente")));
        Persona1.setProductAutomotrices(Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos productos Automotrices lleva: ")));
        Persona1.setProductElecrico(Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos productos Elecricos lleva: ")));
        Persona1.setProductConstruccion(Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos productos de Construccion lleva: ")));
        Persona1.setMonto(Integer.parseInt(JOptionPane.showInputDialog("Digite el monto total: ")));

        JOptionPane.showMessageDialog(null, "Cliente: " + Persona1.getNombrePersona() + "\n"
                + "cedula:" + Persona1.getCedulaCliente() + "\n"
                + "Codigo Factura: " + Persona1.getCodigodeFacrura() + "\n"
                + "Productos electricos: " + Persona1.getProductElecrico() + "\n"
                + "Productos Automotrices: " + Persona1.getProductAutomotrices() + "\n"
                + "Productos Construccion: " + Persona1.getProductConstruccion() + "\n"
                + "Monto total es de: " + Persona1.getMonto());

        Agente1.setNombredeAgente(JOptionPane.showInputDialog("DDigite el nombre del Agente: "));
        if (Persona1.getProductAutomotrices() >= 4) {
            JOptionPane.showMessageDialog(null, "Usted tiene un bono del 4%");

        } else {
            JOptionPane.showMessageDialog(null, "Usted tiene un 2%  de bono");

        }
        if (Persona1.getProductConstruccion() >= 1) {
            JOptionPane.showMessageDialog(null, "usted tiene un bono del 8% y dos puntos de vendedor");
        }
        if (Persona1.getProductConstruccion() + Persona1.getProductAutomotrices() + Persona1.getProductElecrico() >= 1) {
            JOptionPane.showMessageDialog(null, "Usted tiene un bono del 10% y se le suman 3 puntos de vendedor ");
        }
        JOptionPane.showMessageDialog(null, "el nombre del agente es: " + Agente1.getNombredeAgente());
        


            
        
            
            
        
        
                
            
        }
        
       

    }


