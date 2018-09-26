/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.corredores.controlador;

import aplicacion.corredores.modelo.Corredor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class GestionCorredores {

    //atributos
    private ArrayList<Corredor> corredores = new ArrayList<>();

    public boolean addCorredorr(Corredor corredor) {
        if (corredores.contains(corredor) == false) {
            corredores.add(corredor);
            return true;
        }
        return false;
    }

    public boolean deleteCorredor(String dni) {
        for (Corredor corredor : corredores) {
            if (corredor.getDni().equals(dni)) {
                corredores.remove(corredor);
                return true;
            }
        }
        return false;
    }

    public void modifyCorredores() {
        String varString;
        String constante = "";
        Scanner sc = new Scanner(System.in);
        toString();
        System.out.println("Introduzca numero de corredor que desea modificar: ");
        varString = sc.nextLine();
        int numCorredor = Integer.parseInt(varString) - 1;
        Corredor corredor = corredores.get(numCorredor);

        varString = "";
        System.out.print("Nombre : " + corredor.getNombre() + "     ");
        System.out.print("Nuevo nombre : ");
        sc.reset();
        varString = sc.nextLine();
        if (!varString.equals(constante)) {
            corredor.setNombre(varString);
        }
        System.out.println("");

        System.out.print("Dni : " + corredor.getDni() + "     ");
        System.out.print("Nuevo dni : ");
        sc.reset();
        varString = sc.nextLine();
        if (!varString.equals(constante)) {
            corredor.setDni(varString);
        }
        System.out.println("");

        System.out.print("Direccion : " + corredor.getDireccion() + "     ");
        System.out.print("Nueva direccion : ");
        sc.reset();
        varString = sc.nextLine();
        if (!varString.equals(constante)) {
            corredor.setDireccion(varString);
        }
        System.out.println("");

        System.out.print("Telefono : " + corredor.getTelefono() + "     ");
        System.out.print("Nuevo telefono : ");
        sc.reset();
        corredor.setTelefono(sc.nextInt());
        System.out.println("");

        corredores.set(numCorredor, corredor);
    }

    public int buscarDni(String dni) {
        int var = 0;
        for (Corredor corredor : corredores) {
            var = var++;
            if (corredor.getDni() == dni) {
                return var;
            }
        }
        return 0;
    }

    

    @Override
    public String toString() {
        int var = 0;
        String cad = "";
        for (Corredor corredor : corredores) {
            var = var + 1;
            cad = cad + var + "      " + corredor.toString() + "\n";
        }
        return cad;
    }
}