/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola;

/**
 *
 * @author medin
 */
public class QueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> miQueue = new Queue<>(4);
        System.out.println("La cola esta vacia? " + miQueue.isEmpty());
        miQueue.enQueue("Turno 1");
        miQueue.enQueue("Turno 2");
        miQueue.enQueue("Turno 3");
        System.out.println("La Cola esta vacia? " + miQueue.isEmpty());
        System.out.println("El tamano de la Cola " + miQueue.size());

        int i = 0;
        for (String s : miQueue) {
            if (i < miQueue.size()) {
                System.out.println(s);
                i++;
            } else {
                break;
            }
        }
        System.out.println("Atender");
    }

}
