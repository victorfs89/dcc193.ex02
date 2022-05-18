<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exm02: Formulário</title>
</head>
<body>
    <h1>Editar Pessoa</h1>
    <form action="resultado2.html" method="post">
        <label>Nome:
        <input type="hidden" name ="id" value="${pessoa.id}"/>
        <input type="text" name ="nome" value="${pessoa.nome}"/>
        </label>
        <label>Idade:
        <input type="text" name ="idade" value="${pessoa.idade}"/>
        </label>
        <input type="submit"/>
    </form>
</body>
</html>