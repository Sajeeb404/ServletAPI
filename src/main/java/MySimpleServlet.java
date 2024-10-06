import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MySimpleServlet implements Servlet {


    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");

    res.setContentType("text/html");
    PrintWriter printWriter = res.getWriter();
    printWriter.print("Hello world from Simple Servlet");
    printWriter.close();

    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
