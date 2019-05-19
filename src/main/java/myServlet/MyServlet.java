package myServlet;

import org.springframework.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = -4186928407001085733L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("to doGet...");

        resp.setContentType("text/html;charset=UTF-8");

        String name = req.getParameter("name");
        String age = req.getParameter("age");

        resp.getWriter().write("<h2>requestURI:"+req.getRequestURI()+"</h2>");
        resp.getWriter().write("<h2>requestURL:"+req.getRequestURL()+"</h2>");
        resp.getWriter().write("<h2>getMethod:"+req.getMethod()+"</h2>");
        resp.getWriter().write("<h2>web name:"+req.getContextPath()+"</h2>");
        resp.getWriter().write("<h2>query content:"+req.getQueryString()+"</h2>");
    }
}
