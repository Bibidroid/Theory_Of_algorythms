
<%@page import="knu.fit.ist.ta.exam.FormulaResults"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./formula" method="post" class="form-inline">
            <label for="x"><b>Enter x:</b></label>
            <div class="input-group">
                <input  class="form-control" id="x" type="text" name="x"/>
                <input class="btn btn-success" type="submit" value="Submit"/>
            </div>
            <p class="mt-3 mb-0"><b>f(x): </b><%=request.getAttribute("res")%></p>
            <p class="mt-3 mb-0"><b></b><%=request.getAttribute("result")%></p>
        </form>
        <%! FormulaResults fr = new FormulaResults(10); %>
        <p>Args: <%= fr.GetArgs()%> </p>
        <p>Results:<%= fr.Calculate() %></p>
        
        
    </body>
</html>
