import javax.servlet.*;
import java.io.IOException;


public class ExServlet implements Servlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("This is INt method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
