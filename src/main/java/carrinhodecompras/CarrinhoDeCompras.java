package carrinhodecompras;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    public static void main(String[] args) {
        ArrayList<Item> listaItens = new ArrayList<>();
        Item i = new Item();
        i.adicionarItem("Coca", 5.5, 2);
        i.exibirItens();
        i.removerItem("coca");
        i.exibirItens();
    }
}