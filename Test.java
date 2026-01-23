public class Test {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.accoda("A");
        lista.accoda("B");
        lista.accoda("C");
        lista.accoda("A");
        lista.accoda("C");
        lista.accoda("B");
        lista.inserimento("D", 6);
        lista.eliminazione(2);
        lista.eliminaValore("A");


        lista.setCursor(lista.getHead());
        String val;
        System.out.println("Contenuto della lista:");
        while ((val = lista.visita()) != null) {
            System.out.println(val);
        }

        int pos = lista.ricerca("B");
        if (pos != -1) {
            System.out.println("Elemento 'B' trovato in posizione: " + pos);
        } else {
            System.out.println("Elemento 'B' non trovato");
        }
    }
}
