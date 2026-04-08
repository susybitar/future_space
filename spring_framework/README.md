# Spring Framework - Ejercicios de Introducción

Este repositorio contiene la resolución de los ejercicios prácticos de introducción a Spring Framework. El proyecto ha sido desarrollado siguiendo las convenciones de nomenclatura de Java (CamelCase para clases y minúsculas para paquetes).

## Estructura del Proyecto

El código está organizado en paquetes según la funcionalidad de cada ejercicio:
- **Ejercicio 1 (GET)**: Servicio REST que devuelve un JSON con los datos de una persona (nombre, apellidos, nombre completo, fecha de nacimiento y sexo) gestionados mediante un Bean.
- **Ejercicio 2 (POST)**: Servicio que recibe datos por URL mediante parámetros (`@RequestParam`) y los muestra de forma estructurada en la consola del servidor.
- **Ejercicio 3 (PUT)**: Gestión de una lista de 10 personas en memoria. Permite la consulta por DNI y la actualización de datos mediante `@RequestBody`. Incluye validaciones personalizadas de formato.

## Ejercicios Opcionales Implementados
Para enriquecer la API y cumplir con los requisitos extra, se han completado los 4 ejercicios opcionales propuestos:
- **Opcional 1 (JavaDoc)**: Documentación completa del código siguiendo el estándar, generada y disponible para su consulta (archivo `index.html`).
- **Opcional 2 (Logs)**: Implementación de trazas en consola para registrar la actividad de los usuarios (guardado y actualización de datos) con el formato exacto requerido.
- **Opcional 3 (Validaciones)**: Uso de **Bean Validation** (Jakarta) con etiquetas como `@Valid`, `@Validated`, `@NotBlank`, `@Size` y `@Pattern` para blindar la entrada de datos (ej: control estricto del formato del DNI y fechas).
- **Opcional 4 (Manejo Global de Excepciones)**: Creación de un `GlobalExceptionsHandler` (`@ControllerAdvice`) que captura errores de validación (400) o búsquedas fallidas (404) y devuelve al cliente una respuesta JSON limpia y controlada en lugar de la página de error por defecto del servidor.

## Tecnologías y Estándares
- **Java 17 / Spring Boot 3**: Uso de anotaciones estándar para servicios REST.
- **Maven**: Gestión de dependencias y construcción del proyecto.
- **Validación de Datos**: Control de formatos para DNI, fechas y longitud de campos.

## Pruebas y Evidencias
De acuerdo con los requisitos de entrega:
- **Postman**: La colección de pruebas `.json` se encuentra en la carpeta `/postman` lista para importar.
- **Capturas**: Las evidencias de funcionamiento (datos enviados y resultados) están organizadas en la carpeta `/screenshots`.

## Instrucciones de Ejecución
1. **Compilar**: Ejecutar `mvn clean install -Dmaven.test.skip=true` en la terminal para generar el archivo ejecutable.
2. **Arrancar**: Ejecutar el archivo `.jar` generado en la carpeta `target` o iniciar la aplicación desde la clase principal en IntelliJ.

---
Desarrollado por: Susana Bitar
