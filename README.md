# AluraHub

AluraHub es una API REST desarrollada con Java 17 y Spring Boot 3.5.4 que permite gestionar tópicos de discusión, con operaciones CRUD completas y persistencia en base de datos.

## 📦 Características principales

- Crear nuevos tópicos.
- Listar todos los tópicos registrados.
- Consultar un tópico por su ID.
- Actualizar un tópico existente.
- Eliminar un tópico por su ID.
- Respuestas en formato JSON listas para ser consumidas por un cliente o frontend.

## 🛠️ Tecnologías utilizadas

- Java 17
- Spring Boot 3.5.4
- Spring Web (para controladores REST)
- Spring Data JPA / Hibernate
- PostgreSQL 17
- Lombok (para reducir código repetitivo)
- Maven (gestión de dependencias y construcción del proyecto)

## ⚙️ Configuración necesaria

Antes de ejecutar la aplicación, asegúrate de tener configuradas las siguientes variables de entorno o valores en el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Nota: Reemplaza ${DB_HOST}, ${DB_NAME}, ${DB_USER} y ${DB_PASSWORD} por los datos de tu entorno.

```

## ▶️ Ejecución del proyecto

## Clona el repositorio:

```
git clone https://github.com/Yadir0795/AluraHub
cd AluraHub
```


## Ejecuta el proyecto con Maven:
```
./mvnw spring-boot:run
```

La API quedará disponible por defecto en:
http://localhost:8080/topicos

## 📂 Endpoints principales
Método	Endpoint	Descripción
GET	/topicos	Lista todos los tópicos
GET	/topicos/{id}	Busca un tópico por ID
POST	/topicos	Crea un nuevo tópico
PUT	/topicos/{id}	Actualiza un tópico existente
DELETE	/topicos/{id}	Elimina un tópico por ID

Ejemplo de JSON para creación/actualización:
```
{
  "titulo": "Mi primer tópico",
  "mensaje": "Este es el contenido del tópico",
  "fecha_creacion": "2025-08-13T20:00:00",
  "estatus": "activo",
  "autor": "Yadir",
  "curso": "Java Spring Boot"
}
```
## 📂 Estructura del proyecto

controladores → Controladores REST que gestionan las peticiones HTTP.

modelos → Clases que representan la estructura de datos.

repositorios → Interfaces para acceso a datos con Spring Data JPA.

servicios → Lógica de negocio y validaciones.

## 🧑‍💻 Autor

Desarrollado por Yadir Garcia Córdoba, como parte del aprendizaje en el programa Oracle ONE + Alura Latam.

📄 Licencia

Este proyecto es de uso libre bajo la licencia MIT.
Puedes usarlo, modificarlo y distribuirlo con o sin fines comerciales, siempre y cuando mantengas esta nota de atribución.
