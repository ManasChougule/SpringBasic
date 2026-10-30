<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Spring Framework Activation Test</title>
</head>
<body>

    <h1>Hello ${not empty username ? username : 'Visitor'} ${message}</h1>

    <!-- This block ONLY renders if the request came from the root endpoint -->
    <c:if test="${not empty pageTitle}">
        <h2>Current Location: ${pageTitle}</h2>
    </c:if>

</body>
</html>