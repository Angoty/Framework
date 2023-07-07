<%@page import="model.emp.Emp"%>
<%@page import="model.emp.Citoyen"%>
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
        <% if (request.getAttribute("infos")!=null) { Citoyen[] cits=(Citoyen[]) request.getAttribute("infos");%>
            <% for(Field field : fields) { %>
                <th><%= field.getName()%></th>
            <% } %>
            <% for (Citoyen cit : cits) { %>
                <tr>
                    <td><%= cit.getNom() %></td>
                    <td><%= cit.getAge() %></td>
                    <td><%= cit.getTaille() %></td>
                </tr>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
                <% } %>
                <% } %>
                <% for(Field field : fields) { %>
                    <th><%= field.getName()%></th>
<<<<<<< HEAD
=======
=======
            <% } %>
        <% } %>
        <% for(Field field : fields) { %>
            <th><%= field.getName()%></th>
>>>>>>> main
>>>>>>> main
        <% } %>
        <% for (Emp emp : emps) { %>
            <tr>
                <td><%= emp.getnom() %></td>
                <td><%= emp.getgrade() %></td>
                <td><a href="detail/?id=0">Voir detail</a></td>
            </tr>
        <% } %>
    </table>
    <table border="1">
</body>
</html>