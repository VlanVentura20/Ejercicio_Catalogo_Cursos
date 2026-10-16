<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>


<jsp:include page="/WEB-INF/views/partials/header.jsp" />


<h1>Detalles del curso</h1>

<div class="detalle">

    <h2>
        <c:out value="${course.name}" />
    </h2>

    <p><strong>Profesor:</strong>
        <c:out value="${course.teacher}" />
    </p>

    <p><strong>Descripción:</strong>
        <c:out value="${course.description}" />
    </p>

    <p><strong>Capacidad:</strong> ${course.capacity}</p>

    <p><strong>Plazas libres:</strong> ${course.availableSeats}</p>

    <c:choose>
        <c:when test="${course.availableSeats > 0}">
            <p class="disponible">Disponible</p>
        </c:when>
        <c:otherwise>
            <p class="completo">Completo</p>
        </c:otherwise>
    </c:choose>

    <a class="volver" href="${pageContext.request.contextPath}/catalog">
        Volver al catálogo
    </a>

</div>


<jsp:include page="/WEB-INF/views/partials/footer.jsp" />