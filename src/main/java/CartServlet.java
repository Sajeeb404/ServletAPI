import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<String> cart = (List<String>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Your Shopping Cart</h1>");
        for (String item : cart) {
            out.println("<p>" + item + "</p>");
        }
        out.println("<form action='addItem' method='post'>");
        out.println("<input type='text' name='item' placeholder='Add item' required>");
        out.println("<input type='submit' value='Add to Cart'>");
        out.println("</form>");
    }
}

