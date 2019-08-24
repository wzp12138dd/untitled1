package day39;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Tlount extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,IOException{
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println("账号："+username+"密码："+password);
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>登录成功页面</title>");
        out.println("<body>");
        out.print("账号："+username+",密码："+password);
        out.println("</body>");
        out.println("</head>");
        out.println("</html>");
    }
}
