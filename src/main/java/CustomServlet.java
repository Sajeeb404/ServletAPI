import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomServlet extends GenericServlet {



    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        CustomRequestWrapper customRequestWrapper = new CustomRequestWrapper(req);

        CustomResponseWrapper customResponseWrapper = new CustomResponseWrapper(res);


        String newAttributeValue = (String) customRequestWrapper.getAttribute("newAttribute");
        String modifiedPassword = customRequestWrapper.getParameter("password");


        res.setContentType("text/html");


        PrintWriter printWriter = res.getWriter();
        printWriter.write("<html> <body>");
        printWriter.write("CustromAttribue value : "+ newAttributeValue +" <br>");
        printWriter.write("Modified Password : "+ modifiedPassword+ "<br>");
        printWriter.write("</body></html> ");


    }

}
