public class Restaurante {
    
    private Cliente cliente;
    private Pedido pedido;
    private Projeto projeto;

    public void setProjeto(Projeto projeto){
        this.projeto = projeto;
    }
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

    public void criarProjeto(int peso){
        projeto.criarProjeto(peso);
    }

    public void confirmarCompra(){
        pedido.verificarStatus();
    }


}

