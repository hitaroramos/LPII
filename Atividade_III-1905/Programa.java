public class Programa 
{    public static void main(String[] args)
    {
        System.out.println("Loja virtual");
        Produto p1 = new Produto("Roupa");
        Produto p2 = new Produto("Sapato");
        Produto p3 = new Produto("Meia");

        System.out.println("Nome produto: " + p1.getNome());
        p1.setPreco(12);
        p1.setEstoque(10);
        System.out.println("Preço do estoque: " + p1.calcularValorEstoque());

        System.out.println("Nome produto: " + p2.getNome());
        p2.setPreco(20);
        p2.setEstoque(20);
        System.out.println("Preço do estoque: " + p2.calcularValorEstoque());

        System.out.println("Nome produto: " + p3.getNome());
        p3.setPreco(-1);
        p3.setEstoque(-1);
        System.out.println("Preço do estoque: " + p3.calcularValorEstoque());

        System.out.println("Quantidade de produtos: " + Produto.getCount());
    }
}
