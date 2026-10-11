import java.util.Random;

// aquí tengo los datos de una poción.
public class Pocion implements Runnable {
    private String nombre;
    private int fases;
    private int tiempoFase;
    private long tiempo;

    // al crearla, elijo las fases y lo que dura cada una.
    public Pocion(String nombre){
        this.nombre = nombre;
        Random azar = new Random();
        fases = azar.nextInt(5) + 4;
        tiempoFase = azar.nextInt(201) + 200;
    }

    // voy haciendo las fases y al final miro cuánto tardó.
    public void run(){
        long inicio = System.currentTimeMillis();
        System.out.println("[" + nombre + "] " + fases + " fases de " + tiempoFase + " ms");

        for(int i = 1; i <= fases; i = i + 1) {
            try {
                Thread.sleep(tiempoFase);
            } catch (InterruptedException e){
                System.out.println("[" + nombre + "] interrumpida");
                return;
            }
            System.out.println("[" + nombre + "] fase " + i + "/" + fases);
        }

        tiempo = System.currentTimeMillis() - inicio;
        System.out.println("[" + nombre + "] lista en " + tiempo + " ms");
    }

    // para saber el nombre de esta poción.
    public String getNombre(){
        return nombre;
    }

    // para saber cuánto tardó.
    public long getTiempo(){
        return tiempo;
    }
}
