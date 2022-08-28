<%-- 
    Document   : header
    Created on : Aug 27, 2022, 9:15:20 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav">
        <li class="nav-item active">
            <a class="nav-link" href="<c:url value="/" />">Trang Chu</a>
        </li>
        <c:forEach var="cat" items="${categories}">
            <li class="nav-item">
                <a class="nav-link" href="#">${cat.name}</a>
            </li>
        </c:forEach>
            <li class="nav-item active">
            <a class="nav-link text-danger" href="<c:url value="/login" />">Dang Nhap</a>
        </li>
    </ul>
</nav>
