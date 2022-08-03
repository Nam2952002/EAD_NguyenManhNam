<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html  xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Index</title>
</head>
<body>

<div>
    <c:forEach var="s" items="${stock}">
        <ul>
            <li>Id:${s.id}<br/>
                Symbol:${s.symbol}<br/>
                Name:${s.name}<br/>
                Price:${s.price}
            </li>
        </ul>
    </c:forEach>
</div>


</body>
</html>