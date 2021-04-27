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

        <p><%= "4) First three unique words : " + lab4.FirstThreeUniqueWords() + '\n'%></p>

        <p><%= "5) Words without Z : " + lab4.WordsWithoutZ() + '\n'%></p>

        <p><%= "6) Words with two letters : " + lab4.WordsWithTwoLetters() + '\n'%></p>

        <p><%= "7) Most popular sequences : " + lab4.MostPopularSequences(7, 3) + '\n'%></p>

        <p></p>
        <p></p>
        <a href="index.jsp">Home</a>
    </body>
</html>
