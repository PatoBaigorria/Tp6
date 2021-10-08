/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author Familia
 */
public class Tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DirectorioTelefonico dir = new DirectorioTelefonico();
        
        Cliente c1 = new Cliente (27013989, "Juan", "López", "Córdoba", "Granada 2761");
        Cliente c2 = new Cliente (24120983, "Soledad", "Suárez", "Mendoza", "Vascongadas 5726");
        Cliente c3 = new Cliente (11249586, "Pablo", "Romero", "San Juan", "Galicia 1298");
        Cliente c4 = new Cliente (20749823, "Carla", "Toledo", "Jujuy", "Moreno 4417");
        
        dir.agregarCliente("0351-482813", c1);
        dir.agregarCliente("2664-258159", c2);
        dir.agregarCliente("0261-357486", c3);
        dir.agregarCliente("0388-173749", c4);
        
        
        
        System.out.println(dir.buscarCliente("2664-258159"));
        
        System.out.println(dir.buscarClientes("Córdoba"));
        
        System.out.println("El número de Teléfono de " + c3.getApellido()+" es: "+ dir.buscarTelefono("Romero"));
        
        System.out.println("El Cliente " + dir.borrarCliente(11249586)+" fue ELIMINAD@ CON ÉXITO");
        
        System.out.println("El Cliente no Existe"+dir.buscarTelefono("Romero"));
        
    }
    
}