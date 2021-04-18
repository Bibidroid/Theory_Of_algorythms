<%@page contentType="text/html" pageEncoding="UTF-8" import="knu.fit.ist.ta.FirstJava"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laba1</title>
    </head>
    <body>
        <h3>Laba1</h3>
        <br>

        <%! FirstJava FirstClas = new FirstJava();
            FirstJava SecondClas = new FirstJava(7);%>



        <% FirstClas.SetExample(7);
            int prois = FirstClas.GetExample() * SecondClas.GetExample();%>

        <p><%= "1) Get : " + FirstClas.GetExample() + '\n'%></p>

        <p><%= FirstClas.toString() + '\n'%></p>

        <p><%= "2) Get : " + SecondClas.GetExample() + '\n'%></p>

        <p><%= SecondClas.toString() + '\n'%></p>



        <p><%= "prois = " + prois + '\n'%></p>

        <p></p>
        <p></p>
        <a href="index.jsp">Home</a>
    </body>
</html>