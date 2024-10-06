import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExGenericServlet extends GenericServlet {


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();

        printWriter.print("<html> <body>");
        printWriter.print("<h1> Hello generic serlet </h1>");
        printWriter.print("</body></html> ");
        printWriter.close();

    }


}
