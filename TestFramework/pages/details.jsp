<%@ page import="model.Personne" %>
<%
    Emp employe = (Emp) request.getAttribute("details");
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
    <h1>Informations: <%= pers.getnom() %></h1>
    <ul>
        <li><%= pers.getgrade() %></li>
        <li><%= pers.getid() %></li>
    </ul>
</body>
</html>