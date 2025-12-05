import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SRegistTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("name");
        String food = req.getParameter("food");

        req.setAttribute("name", username);
        req.setAttribute("food", food);

        RequestDispatcher dispatcher =
                req.getRequestDispatcher("sregistresult");

        dispatcher.forward(req, res);
    }
}