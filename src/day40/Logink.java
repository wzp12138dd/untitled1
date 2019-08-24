package day40;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Logink extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest requet, HttpServletResponse response)
            throws ServletException,IOException{
        requet.setCharacterEncoding("UTF-8");
        requet.setCharacterEncoding("UTF-8");
        String username=requet.getParameter("username");
        String password=requet.getParameter("password");
        System.out.println("用户名："+username+"，密码："+password);
        if ("admin".equals(username)){
            requet.setAttribute("username",username);
            requet.setAttribute("password",password);

            requet.getRequestDispatcher("login.jsp").forward(requet,response);
        }else{
            requet.getRequestDispatcher("asoop.jsp").forward(requet,response);
            //response.sendRedirect("asoop.jsp?msg=登入失败");
        }
    }
}































