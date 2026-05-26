import entidades.Paciente;
import estatica.FilaComPrioridadeHeap;

public class Main {

    public static void main(String[] args) {

        FilaComPrioridadeHeap<Paciente> fila =
                new FilaComPrioridadeHeap<>(10);

        Paciente p1 = new Paciente("Carlos", 2, 45, false);
        Paciente p2 = new Paciente("Maria", 5, 5, false);
        Paciente p3 = new Paciente("João", 3, 20, false);
        Paciente p4 = new Paciente("Beatriz", 3, 35, true);
        Paciente p5 = new Paciente("Pedro", 5, 2, false);
        Paciente p6 = new Paciente("Helena", 2, 45, true);

        fila.enfileirar(p1);
        System.out.println(fila);

        fila.enfileirar(p2);
        System.out.println(fila);

        fila.enfileirar(p3);
        System.out.println(fila);

        fila.enfileirar(p4);
        System.out.println(fila);

        fila.enfileirar(p5);
        System.out.println(fila);

        fila.enfileirar(p6);
        System.out.println(fila);

        System.out.println("\nORDEM DE ATENDIMENTO:\n");

        while (!fila.estaVazia()) {
            System.out.println(fila.desenfileirar());
        }
    }
}