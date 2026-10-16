package org.cuatrovientos;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/catalog")
public class ProductCatalogServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Course> courses = List.of(
                new Course(1, "Cocina Mediterránea", 25, 10, "Juan García",
                        "En este curso aprenderás a preparar una gran variedad de platos tradicionales de la cocina mediterránea. Conocerás los ingredientes más utilizados, las técnicas de elaboración y los secretos para conseguir recetas saludables y sabrosas. Además, practicarás la preparación de entrantes, platos principales y postres típicos de diferentes regiones."),

                new Course(2, "Fotografía Profesional", 30, 0, "María López",
                        "Descubre el mundo de la fotografía y aprende a utilizar una cámara de forma profesional. Durante el curso conocerás los fundamentos de la iluminación, el encuadre, la composición y la exposición. También realizarás prácticas de fotografía de paisajes, retratos y objetos, además de aprender técnicas básicas de edición digital."),

                new Course(3, "Pintura al Óleo", 20, 5, "Carlos Martínez",
                        "Aprende las principales técnicas de pintura al óleo y desarrolla tus habilidades artísticas desde cero. Conocerás los materiales necesarios, la mezcla de colores, el uso de pinceles y la creación de diferentes texturas. A lo largo del curso realizarás tus propias obras, trabajando paisajes, bodegones y composiciones originales."),

                new Course(4, "Guitarra Española", 25, 12, "Ana Fernández",
                        "Iníciate en el mundo de la música aprendiendo a tocar la guitarra española. Durante las clases conocerás las partes del instrumento, las notas musicales, los acordes básicos y diferentes técnicas de interpretación. Practicarás canciones populares y ejercicios de ritmo para mejorar progresivamente tu coordinación y habilidad musical."),

                new Course(5, "Yoga y Meditación", 15, 0, "Laura Sánchez",
                        "Mejora tu bienestar físico y mental mediante la práctica del yoga y la meditación. Aprenderás diferentes posturas, ejercicios de respiración y técnicas de relajación que ayudan a reducir el estrés y mejorar la concentración. Las sesiones estarán adaptadas a distintos niveles y combinarán ejercicios físicos con momentos de meditación guiada."),

                new Course(6, "Jardinería y Botánica", 20, 8, "Pedro Rodríguez",
                        "Descubre cómo cuidar diferentes tipos de plantas y mantener jardines saludables durante todo el año. Aprenderás sobre las características de las especies vegetales, los tipos de suelo, los sistemas de riego y las técnicas de poda. También realizarás actividades prácticas de plantación, mantenimiento de jardines y prevención de enfermedades en las plantas."),

                new Course(7, "Repostería Creativa", 15, 3, "Lucía Gómez",
                        "Aprende a elaborar deliciosos postres y descubre las técnicas más utilizadas en la repostería creativa. Durante el curso prepararás tartas, galletas, cupcakes y otros dulces, utilizando diferentes ingredientes y métodos de decoración. También conocerás técnicas de presentación, elaboración de cremas y coberturas para conseguir resultados originales y profesionales."),

                new Course(8, "Baile de Salón", 30, 0, "David Pérez",
                        "Aprende a bailar diferentes estilos de baile de salón en un ambiente divertido y participativo. Conocerás los pasos básicos, las posiciones y los movimientos característicos de bailes como el vals, el tango, la salsa y el chachachá. A través de ejercicios individuales y en pareja mejorarás tu coordinación, ritmo y expresión corporal."),

                new Course(9, "Cerámica Artesanal", 20, 7, "Elena Ruiz",
                        "Descubre el arte de la cerámica y aprende a crear piezas únicas utilizando diferentes técnicas artesanales. Trabajarás con arcilla para elaborar objetos decorativos y funcionales, como cuencos, platos y figuras. También aprenderás técnicas de modelado, decoración, esmaltado y cocción, desarrollando tu creatividad mediante proyectos prácticos."),

                new Course(10, "Primeros Auxilios", 15, 4, "Miguel Torres",
                        "Adquiere los conocimientos básicos necesarios para actuar correctamente ante situaciones de emergencia. Aprenderás a reconocer diferentes tipos de lesiones, realizar maniobras de reanimación cardiopulmonar y aplicar técnicas de primeros auxilios ante heridas, quemaduras, atragantamientos y desmayos. El curso incluye ejercicios prácticos y simulaciones para mejorar tu capacidad de respuesta ante accidentes."));

        request.setAttribute("courses", courses);

        request.getRequestDispatcher("/WEB-INF/views/catalog.jsp")
                .forward(request, response);
    }
}