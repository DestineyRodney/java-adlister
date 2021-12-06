import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String pizzaSize = request.getParameter("size");
        System.out.println("size " + pizzaSize);

        String pizzaCrust = request.getParameter("pizza-crust");
        System.out.println("crust " + pizzaCrust);

        String pizzaSauce = request.getParameter("sauce-type");
        System.out.println("sauce " +pizzaSauce);

        String[] toppings = request.getParameterValues("topping");
        for (String topping : toppings) {
            System.out.println(topping);
            System.out.println(" ");
        }

        response.sendRedirect("/pizza-order");
    }
}
