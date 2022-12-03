package laboratorio8_catalinayushan;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Laboratorio8_CatalinaYushan {

    public static void main(String[] args) {
        Scanner quaxly = new Scanner(System.in);
        System.out.println("---Bienvenido al menu!---");
        System.out.println("1. Pocket Monster");
        System.out.println("2. DC Vs. Marvel");
        System.out.println("3. Salir");
        System.out.print("-------------------------");
        System.out.print("Ingrese la opcion deseado: ");
        int choice = quaxly.nextInt();
        ArrayList<String> Pokemon = new ArrayList<String>();
        ArrayList<Integer> Status = new ArrayList<Integer>(); 
        do {
            switch (choice) {
                case 1:
                    System.out.println("Bienvenido a Pocket Monster!");
                    System.out.println("Es momento de probar los frutos de tu entrenamiento, Entrenador Pokemon! Vas a comenzar la primera batalla de tu carrera!");
                    System.out.println("Es momento de armar tu equipo con tus mejores pokemones y lanzarte a la batalla.");
                    System.out.println("Necesitas ingresar los datos de tu pokemon antes de empezar!");
                    System.out.println("Suerte en tus primeros pasos, Entrenador. Y hey! Quien sabe? Tal vez estoy viendo al proximo campeon de la Liga Pokemon! ANIMOS!!");
                  
                    
                        System.out.println("Ingrese el numero de pokemones que desea usar en su primera batalla,Entrenador 1: ");
                        int opcion = quaxly.nextInt();
                        System.out.println("Ingrese el nombre de su primer pokemon: ");
                        Pokemon.add(scanner.next());
                        System.out.println("Ingrese el numero de ataque de su pokemon: ");
                        int attack = quaxly.nextInt();
                        Status.add(scanner.next());
                        System.out.println("Ingrese el numero de vida de su pokemon: ");
                        Status.add(scanner.next());
                        int lives = quaxly.nextInt();
  
                        if(attack>100&&lives>300){
                            System.out.println("Entrenador,el pokemon es demasiado fuerte para ti! Intenta usar otro tipo de Pokemon!");
                        }
                        


                case 2:
                    System.out.println("Bienvenido a la base de datos de S.H.I.E.L.D, Agente Fury!");
                    System.out.println("Oh no! Parece que la pandilla de los Seis Siniestros han infiltrado la base de S.H.I.E.L.D y hemos perdido la informacion!");
                    System.out.println("Necesitamos de su ayuda, Agente Fury, para poder recuperar la informacion.");
                    System.out.println("Usted debera de buscar diferentes superheroes en la base de datos y ver si su identidad sigue dentro de nuestro sistma");
                    System.out.println("En caso de que no este, su conocimiento del multiverso nos ayudara a completar la informacion faltante!");
                    System.out.println("Solo usted puede hacerlo. Buena suerte, Agente!");
                    
                   SuperHeroe Daredevil = new SuperHeroe("Daredevil","Matt Murdock","Manhattan (Hell's Kitchen)","Marvel");
                   SuperHeroe IronMan = new SuperHeroe("Iron-Man","Matt Tony Stark","Manhattan","Marvel");
                   SuperHeroe SpiderMan = new SuperHeroe("Spider-Man","Peter Parker","Queens","Marvel");
                   
                   SuperHeroe Batman = new SuperHeroe("Batman","Bruce Wayne","Ciudad Gotica","DC");
                   SuperHeroe SuperMan = new SuperHeroe("Superman","Clark Kent o Kal-E","Krypton","DC");
                   SuperHeroe Nightwing = new SuperHeroe("Nightwing","Dick Grayson","Cuidad Gotica","DC");
                   
                   ArrayList<SuperHeroe> Marvel = new ArrayList<SuperHeroe>();
                   ArrayList<SuperHeroe> DC = new ArrayList<SuperHeroe>;
                        
                  
                    System.out.println("Ingrese si desea buscar o agregar el superheroe: ");
                    String opcion = quaxly.nextLine();
                    
                   if(opcion == buscar){
                       System.out.println("Ingrese el nombre del supeheroe que desea ver: ");
                       String supername = quaxly.nextLine();
                       if(supername.equalsIgnoreCase(Daredevil||Matt Murdock)){
                        System.out.println("Escogiste a" + Daredevil.getName());
                        System.out.println("Su verdadero nombre es:" + Daredevil.getRealname());
                        System.out.println("El vive en:" + Daredevil.getMacity());
                        System.out.println("Pertenece a:" + Daredevil.getMultiverse());
                        System.out.println("---Se encontrado a Daredevil!---");
                   }
                       if(supername.equalsIgnoreCase(Iron-Man||Tony Stark)){
                        System.out.println("Escogiste a" + IronMan.getName());
                        System.out.println("Su verdadero nombre es:" + IronMan.getRealname());
                        System.out.println("El vive en:" + IronMan.getMacity());
                        System.out.println("Pertenece a:" + IronMan.getMultiverse());
                        System.out.println("---Se encontrado a Iron Man!---");
                       }
                       
                       if(supername.equalsIgnoreCase(Spider-Man||Peter Parker)){
                        System.out.println("Escogiste a" + SpiderMan.getName());
                        System.out.println("Su verdadero nombre es:" + SpiderMan.getRealname());
                        System.out.println("El vive en:" + SpiderMan.getMacity());
                        System.out.println("Pertenece a:" + SpiderMan.getMultiverse());
                        System.out.println("---Se encontrado a Spider Man!---");
                       }
                       
                       if(supername.equalsIgnoreCase(Batman||Bruce Wayne)){
                        System.out.println("Escogiste a" + Batman.getName());
                        System.out.println("Su verdadero nombre es:" + Batman.getRealname());
                        System.out.println("El vive en:" + Batman.getMacity());
                        System.out.println("Pertenece a:" + Batman.getMultiverse());
                        System.out.println("---Se encontrado a Batman!---");
                       }
                       
                       if(supername.equalsIgnoreCase(Superman||Clark Kent)){
                        System.out.println("Escogiste a" + Superman.getName());
                        System.out.println("Su verdadero nombre es:" + Superman.getRealname());
                        System.out.println("El vive en:" + Superman.getMacity());
                        System.out.println("Pertenece a:" + Superman.getMultiverse());
                        System.out.println("---Se encontrado a Superman!---");
                       }
                       
                       if(supername.equalsIgnoreCase(Nightwing||Dick Grayson)){
                        System.out.println("Escogiste a" + Nightwing.getName());
                        System.out.println("Su verdadero nombre es:" + Nightwing.getRealname());
                        System.out.println("El vive en:" + Nightwing.getMacity());
                        System.out.println("Pertenece a:" + Nightwing.getMultiverse());
                        System.out.println("---Se encontrado a Nightwing!---");
                       }
                       
                       if(supername != Daredevil||Matt Murdock||Iron-Man||Tony Stark||Spider-Man||Peter Parker||Batman||Bruce Wayne||Superman||Clark Kent||Nightwing||Dick Grayson ){
                       System.out.println("Parece que su identidad ha sido robada! Intente agregarlo al programa, Agente Fury!");
                   }
                       
                       
                       
                    if (opcion == agregar){
                        System.out.println("Ingrese el nombre del superheroe: ");
                        String nombre = quaxly.nextLine();
                        System.out.println("Ingrese su nombre comun: ");
                        String nombreReal = quaxly.nextaLine();
                        System.out.println("Ingrese su lugar de origen: ");
                        String city= quaxly.nextLine():
                        System.out.println(Ingrese su multiverso: );
                        String multiverso = quaxly.nextLine();
                        if(multiverse == Marvel){
                            Marvel.add(scanner.nextLine());
                        }else
                            DC.add(scanner.nextLine());
                        for (int i = 0; i < Marvel.size; i++) {
                            for (int j = 0; j < DC.size; j++) {
                                System.out.println("Has ingresado a" +nombre+);
                                System.out.println("Su nombre real es" +nombreReal+);
                                System.out.println("Vive en" +city+);
                                System.out.println("Su multiverso es" +multiverso+);
                            }
                                
                            }
                        }
                           
                   }
                       
                   }

                    
                        
  
