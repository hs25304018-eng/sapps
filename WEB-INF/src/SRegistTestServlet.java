import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("name");
        String password = req.getParameter("pass");

        req.setAttribute("name", username);
        req.setAttribute("pass", password);

        RequestDispatcher dispatcher =
                req.getRequestDispatcher("registresult");

        dispatcher.forward(req, res);
    }
}