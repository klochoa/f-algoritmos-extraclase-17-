/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaextraclase1;

/**
 *
 * @author Karla
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Docente d1 = new Docente("Luis V\n", "Perez J\n","Licenciado en Físico Matemáticas - Universidad Politécnica\n ","Magister en Docencia Matemática - Universidad Valenciana\n","Matematicas con numero de creditos 8\n","Fisica con numero de creditos 6\n");
       
        System.out.println("Caso 1 :\n");
       
       System.out.println(d1.toString());
       
        System.out.println("Caso 2 :\n");
        
       Docente d2 = new Docente("Ana M.\n", "Velez P.\n","Licenciado en Ciencias Sociales - Universidad Salesiana\n ","Magister en Docencia Social - Universidad Cataluña\n","Sociales con numero de creditos 9\n","Literatura con numero de creditos 10\n");
        System.out.println(d2.toString()); 
        
    }
    
}
