package Demo1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/*
* 使用ServletContext获取资源路径
* */
public class CServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        * getRealPath()得到的是带盘符的路径
        * */
        String path = this.getServletContext().getRealPath("/WEB-INF/1111.html");
        System.out.println(path);
        //获取输入流
        InputStream input = this.getServletContext().getResourceAsStream("/index.jsp");
    }
}
