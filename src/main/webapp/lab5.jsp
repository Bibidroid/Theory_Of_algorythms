<%@page contentType="text/html" pageEncoding="UTF-8" import="knu.fit.ist.ta.lab5.Lab5Task"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h3>Laba5</h3>
        <br>

        <%! Lab5Task lab5 = new Lab5Task();%>

        <div>
            <form action="./lab5" method="post"> 
                <input type="text" name="find" id="find" placeholder="enter number to find"/>
                <input type="submit" value="Ok"/>
                <p ><b>position of element: </b><%=request.getAttribute("result")%></p>
            </form> 
        </div>

        <p><%= "1) Entities : " + lab5.ShowEntities() + '\n'%></p>






        <p></p>
        <p></p>
        <a href="index.jsp">Home</a>
    </body>
</html>
