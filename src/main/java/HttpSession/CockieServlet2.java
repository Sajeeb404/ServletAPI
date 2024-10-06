package HttpSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/coockie2")
public class CockieServlet2 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        Cookie ck[] = req.getCookies();

        printWriter.println("Hello : "+ ck[0].getValue());
        printWriter.close();

    }
}
