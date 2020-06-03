package Demo1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 从ServletContext保存数据
* */
public class AServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        * 1.获取ServletContext对象
        * 2.调用setAttribute方法完成保存数据
        * */
        ServletContext application = this.getServletContext();
        application.setAttribute("name","张三");
    }
}
