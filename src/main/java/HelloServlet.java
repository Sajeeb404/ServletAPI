import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet init");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println(" \n Servlet services");
        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.print("<h1> Welcome to hello servlet!</h1>");

    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
