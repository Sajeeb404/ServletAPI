import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Second implements Servlet {

    ServletConfig config;


    @Override
    public void init(ServletConfig config) throws ServletException {
this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        RequestDispatcher header = req.getRequestDispatcher("/header.jsp");
        header.include(req,res);


    String  userName = (String) req.getAttribute("userName");
    String email = (String) req.getAttribute("email");
    String custom = (String) req.getAttribute("attribute");

    res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.write("<html><body>");
        printWriter.write("<h1>Hellow!</h1>");
        printWriter.write("<p> User Name "+ userName + "</p>");
        printWriter.write("<p> Email "+ email+ "</p>");
        printWriter.write("<p> Custom Attribue "+ custom + "</p>");
        printWriter.write("</body> </html>");

RequestDispatcher footer = req.getRequestDispatcher("/footer.jsp");
footer.include(req, res);
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
