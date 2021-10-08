/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Patricia
 */
public class DirectorioTelefonico {
    private TreeMap<String, Cliente> lista=new TreeMap<>();

    public boolean agregarCliente(String tel, Cliente c){
        if(lista.containsKey(tel)){
            return false;
        }else{
            lista.put(tel, c);
            return true;
        }        
    }
    
    public Cliente buscarCliente(String tel){
        return lista.get(tel);
    }
    
    public ArrayList<String> buscarTelefono(String apellido){
        ArrayList<String> devlista = new ArrayList<>();
        
        Set<String>telclave=lista.keySet();
        
        for(String it : telclave){
            Cliente c = lista.get(it);
            if (c.getApellido().equals(apellido)){
                devlista.add(it);
            }
        }
        return devlista;
    }
    
    public ArrayList<Cliente> buscarClientes(String ciudad){
        ArrayList<Cliente>devclientes = new ArrayList<>();
        
        Set<String>ciudclave=lista.keySet();
        
        for(String it : ciudclave){
            Cliente c = lista.get(it);
            if (c.getCiudad().equals(ciudad)){
                devclientes.add(c);
            }
        }
        return devclientes;
       
    }
    
    
    public TreeMap borrarCliente (long dni){
    
        TreeMap<String, Cliente>clienteB = new TreeMap<>();
        Set<String>claveDni=lista.keySet();
        
        for(String it:claveDni){
            Cliente c=lista.get(it);
            if(c.getDni()==dni){
                clienteB.put(it, c);
                lista.remove(it);
               
            }
             return clienteB;
            
        }
        return null;
    }
          
}