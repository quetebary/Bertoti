public class Fornecedor implements Usuarios{
    private String status;

    public void atualizaStatus(String status){
        this.status = status;
        System.out.println(this.status);
    }
    
}
