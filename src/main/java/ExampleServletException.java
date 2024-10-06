import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet("/Exce")
public class ExampleServletException extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {


        try {
            if (true){
            throw new ServletException("an error while processing the request.");
            }

        }catch (Exception e){
            throw new ServletException("Servlet processing error"+ e);
        }
    }



}
