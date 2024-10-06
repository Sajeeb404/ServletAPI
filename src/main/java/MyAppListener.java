import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;



public class MyAppListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextInitialized.");
        sce.getServletContext().setAttribute("appConfig", "applicatoin is loaded.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ContextDestoryed.");
        String st = (String) sce.getServletContext().getAttribute("appConfig");
        System.out.println(st + " is shutting down");
    }

}

