public class Test {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.accoda("A");
        lista.accoda("B");
        lista.accoda("C");
        lista.inserimento("D",3);
        lista.inserimento("E",4);
        lista.eliminazione(2);
        lista.ricerca("E");

        Nodo current = lista.getHead();
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}