import model.Usuario;

public class SingletonLogger {

    private static SingletonLogger instancia = new SingletonLogger();
    public static SingletonLogger getInstancia() {
        return instancia;
    }

    private SingletonLogger(){
        this.log = "";
    }

    private String log;

    private Usuario usuario;

    public String getLog() {
        return log;
    }

    public void appendLog(String log) {
        this.log = this.log.concat(log);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
