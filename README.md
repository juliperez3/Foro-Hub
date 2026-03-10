# 🏛️ ForoHub - Challenge Alura Latam

¡Bienvenido a mi solución para el desafío **ForoHub**! Este proyecto consiste en el desarrollo de una API REST robusta diseñada para gestionar un foro de discusiones técnicas, aplicando conceptos avanzados de **Java 17**, **Spring Boot 3** y seguridad informática.

---

## 🎯 Objetivo del Desafío
El reto principal fue replicar la lógica de negocio de un foro real (como el de Alura), donde la persistencia de datos y la seguridad son los pilares. Se implementó un sistema donde solo usuarios autenticados pueden interactuar con los tópicos, garantizando la integridad de la información.

## ✨ Funcionalidades Clave

* **Gestión de Tópicos (CRUD):** Implementación completa para crear, consultar, actualizar y eliminar dudas o sugerencias.
* **Seguridad Blindada:** Uso de **Spring Security** y **Stateless Authentication** mediante **JWT (JSON Web Tokens)**.
* **Validaciones Inteligentes:** El sistema impide automáticamente la creación de tópicos con el mismo título y mensaje (evitando spam).
* **Arquitectura Limpia:** Uso de **DTOs (Records)** para una transferencia de datos eficiente y segura entre el cliente y el servidor.
* **Persistencia Profesional:** Base de datos **MySQL** con control de versiones mediante **Flyway Migrations**.

---

## 🛠️ Stack Tecnológico

* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3
* **Acceso a Datos:** Spring Data JPA / Hibernate
* **Seguridad:** Spring Security & Auth0 JWT
* **Base de Datos:** MySQL 8
* **Utilidades:** Lombok y Bean Validation

---

## 📂 Estructura del Proyecto

El código está organizado siguiendo las mejores prácticas de la industria:
* `controller`: Puntos de entrada de la API.
* `domain`: Entidades de negocio, repositorios y lógica de validación.
* `infra`: Configuraciones de seguridad, filtros JWT y tratamiento de errores.

---

## 🚀 Instalación y Uso

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/tu-usuario/ForoHub.git](https://github.com/tu-usuario/ForoHub.git)
    ```
2.  **Configurar Base de Datos:**
    Crea un esquema en MySQL llamado `forohub_api` y ajusta el `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/forohub_api
    spring.datasource.username=root
    spring.datasource.password=tu_contraseña
    ```
3.  **Ejecución:**
    Lanza el proyecto desde tu IDE o usa `./mvnw spring-boot:run`.

---

## 🛡️ Documentación de la API (Endpoints)

| Método | Endpoint | Descripción | Acceso |
| :--- | :--- | :--- | :--- |
| POST | `/login` | Autenticación y generación de Token | Público |
| GET | `/topicos` | Listar todos los tópicos | Privado |
| POST | `/topicos` | Registrar un nuevo tópico | Privado |
| GET | `/topicos/{id}` | Ver detalle de un tópico específico | Privado |
| PUT | `/topicos/{id}` | Actualizar datos de un tópico | Privado |
| DELETE | `/topicos/{id}`| Eliminar un tópico | Privado |

---

## 🏆 Desafío Finalizado
Proyecto desarrollado como parte del programa **Oracle Next Education (ONE)**. Se aplicaron buenas prácticas como el manejo de códigos de estado HTTP (201 Created, 204 No Content, 404 Not Found, etc.).

**Desarrollado por Juliana Perez**
