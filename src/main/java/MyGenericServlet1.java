import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class MyGenericServlet1 extends GenericServlet {

    private static final Logger logger = Logger.getLogger(MyGenericServlet1.class.getName());


    @Override
    public void init() throws ServletException {
        super.init();
        logger.info("MygenericServlet initialized");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {


    
        res.setContentType("text/plain");
        InputStream inputStream = req.getInputStream();
        byte[] buffer = new byte[1024];
        int byeRead;
        StringBuilder data = new StringBuilder();
        while ((byeRead = inputStream.read(buffer)) != -1){
            data.append(new String(buffer, 0, byeRead));

        }
        res.getWriter().write("Data received: " + data.toString());


    }

    @Override
    public void destroy() {
        logger.info("my generic Servlet destroyed");
        super.destroy();
    }
}
