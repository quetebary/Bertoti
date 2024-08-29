import java.util.ArrayList;

public class Aplicativo {

    private String status;

    ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();

    public void setStatus (String status){
        this.status = status;
    }

    public void addUsuario (Usuarios usuario){
        listaUsuarios.add(usuario);
    }

    public void removeUsuario (Usuarios usuario){
        listaUsuarios.remove(usuario);
    }

    public void notificaStatus (String status){
        
        for (Usuarios tipoUsuarios : listaUsuarios){
            tipoUsuarios.atualizaStatus(status);
        }

    }

}
