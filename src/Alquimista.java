// desde aquí preparo las cuatro pociones y saco los tiempos.
public class Alquimista {
    public static void main(String[] args) throws InterruptedException {
        Pocion[] pociones = {new Pocion("aprobado"), new Pocion("honestidad"),
                new Pocion("esfuerzo"), new Pocion("trabajo")};
        Thread[] calderos = new Thread[pociones.length];

        for (int i = 0; i < pociones.length; i = i + 1) {
            calderos[i] = new Thread(pociones[i], "Caldero-" + pociones[i].getNombre());
        }

        int encendidos = 0;
        for (Thread caldero : calderos) {
            if (caldero.isAlive()) {
                encendidos = encendidos + 1;
            }
        }
        System.out.println("[Alquimista] Calderos al fuego: " + encendidos);

        long inicio = System.currentTimeMillis();
        for (Thread caldero : calderos) {
            caldero.start();
        }

        encendidos = 0;
        for (Thread caldero : calderos) {
            if (caldero.isAlive()) {
                encendidos = encendidos + 1;
            }
        }
        System.out.println("[Alquimista] Calderos al fuego: " + encendidos);

        for (Thread caldero : calderos) {
            caldero.join();
        }
        long tiempoReal = System.currentTimeMillis() - inicio;

        encendidos = 0;
        for (Thread caldero : calderos) {
            if (caldero.isAlive()) {
                encendidos = encendidos + 1;
            }
        }
        System.out.println("[Alquimista] Calderos al fuego: " + encendidos);

        long suma = 0;
        Pocion masLenta = pociones[0];
        for (Pocion pocion : pociones) {
            suma = suma + pocion.getTiempo();
            if (pocion.getTiempo() > masLenta.getTiempo()) {
                masLenta = pocion;
            }
        }

        System.out.println("Todas las pociones están listas.");
        System.out.println("Tiempo real: " + tiempoReal + " ms");
        System.out.println("Una detrás de otra: " + suma + " ms");
        System.out.println("La más lenta: " + masLenta.getNombre() + " (" + masLenta.getTiempo() + " ms)");
    }
}
