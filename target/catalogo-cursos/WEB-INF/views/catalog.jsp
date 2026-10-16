<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>


<jsp:include page="/WEB-INF/views/partials/header.jsp" />


<h1>Catálogo de cursos</h1>

<c:choose>
    <c:when test="${empty courses}">
        <p>No hay cursos disponibles.</p>
    </c:when>

    <c:otherwise>
        <table>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Curso</th>
                    <th>Capacidad</th>
                    <th>Plazas libres</th>
                    <th>Estado</th>
                    <th>Detalles</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach items="${courses}" var="course" varStatus="status">
                    <tr>
                        <td>${status.count}</td>
                        <td>
                            <c:out value="${course.name}" />
                        </td>
                        <td>${course.capacity}</td>
                        <td>${course.availableSeats}</td>

                        <td>
                            <c:choose>
                                <c:when test="${course.availableSeats > 0}">
                                    <span class="disponible">Disponible</span>
                                </c:when>
                                <c:otherwise>
                                    <span class="completo">Completo</span>
                                </c:otherwise>
                            </c:choose>
                        </td>

                        <td>
                            <a href="${pageContext.request.contextPath}/course-detail?id=${course.id}">
                                Ver detalles
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>


<jsp:include page="/WEB-INF/views/partials/footer.jsp" />