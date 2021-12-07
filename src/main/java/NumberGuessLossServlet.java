import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="NumberGuessLossServlet", urlPatterns ="/incorrect")
public class NumberGuessLossServlet extends HttpServlet {
    String output = "Loser";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/incorrect").forward(request, response);

    }
}

