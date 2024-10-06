import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestLiseners implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request destroyed: "+ sre.getServletRequest().getRemoteAddr());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request initialized: "+ sre.getServletRequest().getRemoteAddr());
    }


}
