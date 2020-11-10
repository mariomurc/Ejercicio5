/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6alumnos;

import java.util.Scanner;

/**
 *
 * @author Jozzelu
 */
public class Ej6Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner teclado = new Scanner(System.in);
        int numAlumnos=1;
        String nombreAlumno="";
        float notaAlumno=0F;
        float sumaNotas=0F;
        float notaMedia=0F;
        int numAprobados=0;
        int numSuspensos=0;
        float aprobado=5F;
        float nota=0F;
        float siguienteNota=0F;
        String siguienteAlumno="";
        float mayorNota=0F;
        float menorNota=0F;
        float valor=0F;
        String nombreAlumno1="";
        
        System.out.println("INTRODUCE EL NÚMERO DE ALUMNOS: ");
        numAlumnos=teclado.nextInt();
        
        //Pido el Nº de alumnos y su nota y calculo su nota media
        for (int i=1;i<=numAlumnos;i++){
            System.out.println("INTRODUCE EL NOMBRE DEL ALUMNO: ");
            nombreAlumno = teclado.next();
            System.out.println("INTRODUCE LA NOTA ALUMNO: ");
            notaAlumno = teclado.nextFloat();
            
            sumaNotas=sumaNotas+notaAlumno;
            
        }
            
        notaMedia=sumaNotas/numAlumnos;
        
        //Calculo el número de aprobados y suspensos
        
        int numNotas = numAlumnos;
        
        for (int i=1; i <= numNotas; i++) {
            System.out.println("Introduce las notas de los alumnos");
            nota = teclado.nextFloat();
            
 /* MARIO ¿Porqué no metes este if-else en el for de arriba y usas notaAlumno en lugar de notas? */
        if (nota < aprobado) {
            numSuspensos++;
             }
        else if(nota >= aprobado){
            numAprobados++;
             }
        
        }
        
        //Calculo la mayor y nota junto a su nombre
        
    int nota1=1;
    
        System.out.println("Introduce el nombre del alumno");
            nombreAlumno1 = teclado.next();
        System.out.println("Introduce la nota " +nota1);
             valor = teclado.nextFloat();
             nota1++;
             mayorNota=valor;
             menorNota=valor;

     /* MARIO esto que viene debajo, no le veo el sentido...primero pides la nota, y luego si es menor o mayor, pides el nombre del alumno....
     ¿no ves mas claro pedir nombre y nota del tiron? */
        
        for (int i = 2; i <= numNotas; i++) {
            System.out.println("Introduce la nota " + nota1 + " de la clase: ");
            valor = teclado.nextFloat();
            sumaNotas=sumaNotas+valor;
            nota1++;
         
        if (valor < menorNota) {
            menorNota = valor;
                        System.out.println("Introduce el nombre del alumno");
            nombreAlumno1 = teclado.next();
             }
        else if(valor > mayorNota){
            mayorNota = valor;
            System.out.println("Introduce el nombre del alumno");
            nombreAlumno = teclado.next();    
             }
        notaMedia=sumaNotas/numAlumnos;
        }
        
        System.out.println("El número de alumnos matriculadoes es " + numAlumnos +".");
        System.out.println("La nota media del curso es " +notaMedia+ ".");
        System.out.println("La nota más baja la tiene " +nombreAlumno1+" con un "+menorNota);     
        System.out.println("La nota más baja la tiene " +nombreAlumno+" con un "+mayorNota);
        System.out.println("Hay "+numAprobados+" aprobados y " +numSuspensos+ " suspensos");
    }
}
    /* MARIO: en resumen, tienes que unificar el código pensando que cuando te digan el nombre del alumno, y su nota, ya puedes saber si es el que tiene la nota más alta, 
    si es el que tiene la nota más baja, si vas a sumar 1 a aprobados o a suspensos y que esa nota la vas a acumular en la suma total de las notas de todos los alumnos.
    Usar tres bucles cuando puedes usar uno, porque al final, lo que haces es repetir el proceso de pedir nombre+nota, no es una solución al programa....
    Piensalo con lo que hemos visto hoy de leer ficheros....si te llegan info en un fichero y tu tienes que tratarla, en tu caso leerias el fichero 3 veces, cuando 
    con leerlo una vez sería más que suficiente....*/
    
    
    
    */
