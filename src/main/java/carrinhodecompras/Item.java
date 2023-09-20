package carrinhodecompras;
import java.util.ArrayList;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;
    
    ArrayList<Item> listaItens = new ArrayList<>();

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Item() {}
    
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        if(nome.isEmpty()){
            System.out.println("Nome precisa ser preenchido!");
        }else if(preco <= 0){
            System.out.println("O preco digitado deve ser maior que zero");
        }else if(quantidade < 0){
            System.out.println("A quantidade digitada deve ser maior que zero");
        }else{
            listaItens.add(new Item(nome, preco, quantidade));
        }
    }
    
    public void removerItem(String nome){
        ArrayList<Item> itensParaRemover = new ArrayList<>();
        if(!listaItens.isEmpty()){
            for(Item i : listaItens){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            listaItens.removeAll(itensParaRemover);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
    
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!listaItens.isEmpty()){
            for(Item i : listaItens){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
        }else{
            System.out.println("A lista esta vazia!");
        }
        return valorTotal;
    }
    
    public void exibirItens(){
        if(!listaItens.isEmpty()){
            System.out.println(listaItens);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }

    @Override
    public String toString() {
        return "\nNome: " + this.getNome() +
               "\nPreco: " + this.getPreco() +
               "\nQuantidade: " + this.getQuantidade() +
               "\nValor: " + this.getPreco() * this.getQuantidade() + "\n";
    }    
}