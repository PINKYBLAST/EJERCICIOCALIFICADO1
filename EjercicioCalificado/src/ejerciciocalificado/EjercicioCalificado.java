/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocalificado;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class EjercicioCalificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PREGUNTAS AL USER

        // Cantidad de empleados
        int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el numero de empleados: "));
        int salarioIndividual = 0;
        

        // Salarios Individuales Ingrese el salario de "N":
        for (int i = 0; i < numeroEmpleados; i++) {
            salarioIndividual = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el salario de cada colaborador"));
        }
        //Monto Total de Salarios
        int montoTotal = 0;
        montoTotal = numeroEmpleados * salarioIndividual;
        JOptionPane.showMessageDialog(null, "el monto total del salarios es: " + montoTotal);

        // Calculo de SEM
        double valorSEM = montoTotal * 0.0925;
        JOptionPane.showMessageDialog(null, "el total a pagar del SEM: " + valorSEM);
        
        // Calculo de IVM
        double valorIVM = montoTotal * 0.0925;
        JOptionPane.showMessageDialog(null, "el total a pagar del IVM: " + valorIVM);
        
        // FINAL
  
    
        
        
        

    
    
    
        
    }
    
}
