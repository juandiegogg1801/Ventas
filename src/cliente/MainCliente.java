package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import RMI.RemoteInterface;

public class MainCliente {
    public static void main(String[]args) {
        try {
            System.out.println("Se ingresaran los valores del arreglo local");
            int[] arregloLocal = new int[2];
            arregloLocal[0] = 5;
            arregloLocal[1] = 9;

            Registry registroCliente = LocateRegistry.getRegistry("10.200.2.115",2029);
            RemoteInterface rmi = (RemoteInterface) registroCliente.lookup("Ventas");
            rmi.leerArreglo(arregloLocal);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
