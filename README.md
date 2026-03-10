# ForoHub API

## Descripción
API RESTful desarrollada como parte del Challenge ForoHub de Alura Latam. El proyecto implementa un foro de discusión donde los usuarios pueden gestionar tópicos, asegurando la integridad de los datos y una autenticación mediante JWT (JSON Web Token).

## Especificaciones Técnicas
* **Lenguaje:** Java 21+
* **Framework:** Spring Boot 4
* **Persistencia:** Spring Data JPA con MySQL
* **Seguridad:** Spring Security con JWT (Auth0)
* **Migraciones:** Flyway
* **Validaciones:** Bean Validation (Hibernate Validator)
* **Gestión de Errores:** `@RestControllerAdvice` global

## Arquitectura del Proyecto
La aplicación sigue un diseño de arquitectura en capas para garantizar la separación de responsabilidades:
* **Controller:** Exposición de endpoints y manejo de peticiones HTTP.
* **Service:** Lógica de negocio, orquestación de servicios y validación de tokens.
* **Repository:** Acceso a datos y persistencia.
* **Infra:** Configuración de seguridad, filtros, manejo global de excepciones y migraciones.

## Endpoints Principales
| Método | Endpoint | Descripción | Requiere Autenticación |
| :--- | :--- | :--- | :--- |
| POST | `/login` | Autenticación y obtención de JWT | No |
| GET | `/topicos` | Listado paginado de tópicos | Sí |
| POST | `/topicos` | Registro de nuevo tópico | Sí |
| GET | `/topicos/{id}` | Detalle de tópico | Sí |
| PUT | `/topicos/{id}` | Actualización de tópico | Sí |
| DELETE | `/topicos/{id}` | Eliminación de tópico | Sí |

### Variables de Entorno requeridas
Para asegurar la integridad de la configuración, el proyecto utiliza variables de entorno:
- `DB_URL`: URL de conexión a la base de datos MySQL.
- `DB_USER`: Usuario de base de datos.
- `DB_PASSWORD`: Password de base de datos.
- `JWT_SECRET`: Llave secreta para la firma de tokens.
