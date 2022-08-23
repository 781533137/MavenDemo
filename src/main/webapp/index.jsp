<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <script>
            function reget() {
                document.getElementById("tp").src = "./kaptcha.jpg";
            }
        </script>
    </head>
    <body>

        <form action="kaptchaServlet" method="get">
            用户名：<input type="text" name="username" > <br>
            验证码：<input type="text" style="width: 80px;" name="code">
            <img src="kaptcha.jpg" onclick="reget()" id="tp" alt="" style="width: 100px; height: 28px;"> <br>
            <input type="submit" value="登录">
        </form>
        --->${sessionScope.KAPTCHA_SESSION_KEY } <br/>
    </body>
</html>