<%@page contentType="text/html" pageEncoding="UTF-8" import="knu.fit.ist.ta.lab3.Lab3Arr"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h3>Laba3</h3>
        <br>

        <%! Lab3Arr lab3 = new Lab3Arr();%>

        <p><%= "1) Array : " + lab3.ShowArray() + '\n'%></p>

        <p><%= "2) Max : " + lab3.GetMax() + '\n'%></p>  
        
        <p><%= "3) Min : " + lab3.GetMin() + '\n'%></p>

        <p><%= "4) Get : " + lab3.CalculateMaxMin() + '\n'%></p>




        <p></p>
        <p></p>
        <a href="index.jsp">Home</a>
    </body>
</html>
