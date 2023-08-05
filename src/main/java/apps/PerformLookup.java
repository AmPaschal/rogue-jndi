package apps;

import javax.el.ELProcessor;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class PerformLookup {

    public static void main(String[] args) {
        try {
            Object newObj = InitialContext.doLookup("ldap://localhost:1389/o=reference");
            System.out.println("Object classname: " + newObj.getClass().getName());
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}
