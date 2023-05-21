<%@page import="model.emp.Emp"%>
<%@page import="java.lang.reflect.Field"%>
<%
    Emp[] emps = (Emp[]) request.getAttribute("liste-employe");
    Field[] fields=(Field[]) request.getAttribute("attributs");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Liste des employes</h1>
    <table border="1">
        <% for(Field field : fields) { %>
            <th><%= field.getName()%></th>
        <% } %>
        <% for (Emp emp : emps) { %>
            <tr>
                <td><%= emp.getnom() %></td>
                <td><%= emp.getgrade() %></td>
            </tr>
        <% } %>
    </table>
</body>
</html>