package Listas;

import java.util.ArrayList;
import java.util.List;

public class ClsArrayList {

    public void Ejemplo1(){
        List<String> tasklist = new ArrayList<String>();

//        tasklist.add("Hacer compras");
//        tasklist.add("Sacar al perro");
//        tasklist.add("Hacer la cama");
//        tasklist.add("Lavar el carro");
////
//        System.out.println(tasklist);
//        String primerTarea = tasklist.get(0);
//        System.out.println("Primero: " + primerTarea);
//        //remove  item
//        tasklist.remove(0);
//        primerTarea = tasklist.get(0);
//        System.out.println("Primero: " + primerTarea);
        int elementos = 0;
        for(String tarea : tasklist){//A esto se le llama interacion
            System.out.println(elementos+ "Tarea: "+tarea);
            elementos++;


        }
    }

    public void Ejercicio2(){
        List<Integer> listanum = new ArrayList<Integer>();

        listanum.add(500);
        listanum.add(100);
        listanum.add(1500);
        listanum.add(2000);
        listanum.add(2500);

        int elementos1 = 1;
        int Total = 0;
        for(int datos : listanum){
            System.out.println(elementos1 + " Numero: " +datos);
            elementos1++;
            Total = Total + datos;
            System.out.println("La suma total es de: " + Total);

        }

    }
    public void ListaTareas(){
        List<ClsTaskList> task = new ArrayList<>();
        ClsTaskList tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("Hacer compras");
        tareaIndividual.setTaskDescription("ir a la torre");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("Sacar al perro");
        tareaIndividual.setTaskDescription("Levarlo al parque");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("Hacer la cama");
        tareaIndividual.setTaskDescription("Si no me regañan");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("Ir a votar");
        tareaIndividual.setTaskDescription("Cumplir con mi país");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

 //       task.get(1).setDone(true);

        int tarea_numero = 1;
        for(ClsTaskList tl : task){

            if(!tl.isDone()){
                System.out.println(tarea_numero + " Tarea : "+tl.getTaskName()+ " Desc: " + tl.getTaskDescription());

            }
            tarea_numero++;
        }

    }
}
