import model.Usuario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SingletonLoggerTest {

    @Test
    public void logVazioTest(){
        assertEquals("", SingletonLogger.getInstancia().getLog());
    }

    @Test
    public void appendTest(){
        SingletonLogger.getInstancia().appendLog("Teste");
        SingletonLogger.getInstancia().appendLog(" Teste2");
        assertEquals("Teste Teste2", SingletonLogger.getInstancia().getLog());
    }

    @Test
    public void usuarioLoginTest(){
        Usuario usuario = new Usuario("93138960","123");
        SingletonLogger.getInstancia().setUsuario(usuario);
        assertEquals("93138960",SingletonLogger.getInstancia().getUsuario().getLogin());
    }

    @Test
    public void usuarioSenhaTest(){
        Usuario usuario = new Usuario("93138960","123");
        SingletonLogger.getInstancia().setUsuario(usuario);
        assertEquals("123",SingletonLogger.getInstancia().getUsuario().getSenha());
    }

    @Test
    public void usuarioNullTest(){
        assertNull(SingletonLogger.getInstancia().getUsuario());
    }

}
