

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ExServletRequestAttributeListener implements ServletRequestAttributeListener {



    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute added: "+ srae.getName() +" = "+ srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute removed: "+ srae.getName());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("Attribue replaced: "+ srae.getName() + " new value = "+ srae.getValue());
    }




}
