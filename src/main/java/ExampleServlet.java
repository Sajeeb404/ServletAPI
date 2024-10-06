import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleServlet implements Servlet {
ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet Initialized: ");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        res.setContentType("text/html");
//        PrintWriter printWriter = res.getWriter();
//        printWriter.print("<html> <body>");
//        printWriter.print("<h1> hello world from example servlet.");
//        printWriter.print("</body></html> ");


        req.setAttribute("Exampleattrivute:", "Hello name");
        req.setAttribute("Exampleattrivute", "new value");
        req.removeAttribute("Exampleattrivute");
        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.print("Servlet proccess requst");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroyed.");
    }
}
