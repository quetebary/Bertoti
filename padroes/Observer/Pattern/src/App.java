public class App {
    public static void main(String[] args) throws Exception {
        
        Aplicativo app = new Aplicativo();

        app.setStatus("abc");
        Fornecedor f = new Fornecedor();
        app.addUsuario(f);

        app.addUsuario(new PrestadorServ());

        app.addUsuario(new Client());

        app.notificaStatus("bcd");
        
        System.out.println("Hello, World!");


    }
}
