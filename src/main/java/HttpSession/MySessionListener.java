package HttpSession;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MySessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
            System.out.println("Session created: " + se.getSession().getId());
        System.out.println("Session creation time: " + new java.util.Date(se.getSession().getCreationTime()));
//        se.getSession().setMaxInactiveInterval(10);
        System.out.println("Session max inactive interval: " + se.getSession().getMaxInactiveInterval());


    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session Destroyed: "+ se.getSession().getId());
    }


}
