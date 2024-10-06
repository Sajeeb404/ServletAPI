import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomResponseWrapper extends ServletResponseWrapper {





    public CustomResponseWrapper(ServletResponse response) {

        super(response);
    }


    @Override
    public PrintWriter getWriter() throws IOException {

        PrintWriter printWriterOrginal = super.getWriter();

        return new PrintWriter(printWriterOrginal){
            @Override
            public void write(String s) {

                super.write(s);
            }
        };
    }
}
