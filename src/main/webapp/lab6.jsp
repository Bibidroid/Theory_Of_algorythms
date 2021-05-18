<%@page import="knu.fit.ist.ta.lab6.Progression"%>
<%@page import="knu.fit.ist.ta.lab6.BinaryTreePrinter"%>
<%@page import="knu.fit.ist.ta.lab6.BinaryTree"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laba6</title>

    </head>

    <body>
        <h1 class="text-center">Lab 6</h1>
            <%! BinaryTree tree = new BinaryTree();%>
            <%
                tree.add(7);
                tree.add(14);
                tree.add(1);
                tree.add(6);
                tree.add(10);
                tree.add(8);
                tree.add(3);
                tree.add(9);
            %>
        <pre>
                <p> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
        </pre>
        <%tree.mirrorTree(tree.getRoot());%>
        <pre>
                <p> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
        </pre>
    </div>
</div>
<a href="index.jsp">Home</a>
</body>
</html>