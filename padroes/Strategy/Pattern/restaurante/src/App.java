public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Restaurante a = new Restaurante();
        a.setProjeto(new GanharPeso());
        a.criarProjeto(10);
        a.setProjeto(new PerderPeso());
        a.criarProjeto(10);

        a.setPedido(new Rejeitado());
        a.confirmarCompra();
        a.setPedido(new Aprovado());
        a.confirmarCompra();
    
    }
}
