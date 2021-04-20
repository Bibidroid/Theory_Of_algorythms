<%@page contentType="text/html" pageEncoding="UTF-8" import="knu.fit.ist.ta.lab4.Lab4Text"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h3>Laba4</h3>
        <br>

        <%! Lab4Text lab4 = new Lab4Text();%>


        <p><%= "1) Text : " + lab4.GetText() + '\n'%></p>

        <p><%= "2) Number of words : " + lab4.GetWords() + '\n'%></p>  

        <p><%= "3) Number of unique words : " + lab4.GetUniqueWords() + '\n'%></p>  



        <p></p>
        <p></p>
        <a href="index.jsp">Home</a>
    </body>
</html>
