public class Test {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.inserimentoOrdinato("A");
        lista.inserimentoOrdinato("B");
        lista.inserimentoOrdinato("C");
        lista.inserimentoOrdinato("A");
        lista.inserimentoOrdinato("C");
        lista.inserimentoOrdinato("B");

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

        lista.inserimentoOrdinato("ananas");
        lista.inserimentoOrdinato("spinoso");
        lista.inserimentoOrdinato("zampa");

        lista.setCursor(lista.getHead());
        System.out.println("\nLista finale ordinata:");
        while ((val = lista.visita()) != null) {
            System.out.println(val);
        }
    }
}
