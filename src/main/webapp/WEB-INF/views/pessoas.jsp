<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exm03: Lista Pessoas</title>
</head>
<body>
    <h1>Exemplo 03: Lista de Pessoas</h1>
    
    <ul>
        <c:forEach var="pessoa" items="${pessoas}">
            <li>[${pessoa.id}] Nome: ${pessoa.nome} - ${pessoa.idade} anos.</li>
        </c:forEach>
    </ul>
</body>
</html>