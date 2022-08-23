package com.qf.wyg.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

@WebServlet("/kaptchaServlet")
public class KaptchaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // 从session中拿到验证码的值
        String attribute = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        // 清空session中保存的验证码
        request.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        // 从前端的请求中拿到用户输入的验证码
        String code = request.getParameter("code");
        if(code.equals(attribute)){
            response.getWriter().write("<script>alert('登陆成功');window.load.href='index.jsp';</script>");
        }else{
            System.out.println("验证码输入错误，请重新输入");
            response.sendRedirect("index.jsp");
        }
        ObjectMapper mapper = new ObjectMapper();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
