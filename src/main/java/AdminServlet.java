import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminServlet implements Servlet {
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
        PrintWriter printWriter = res.getWriter();
        printWriter.print("<html> <body>");
        printWriter.print("<h1> Welcome to admin page </h1>");
        printWriter.print(" </body> </html>");

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
