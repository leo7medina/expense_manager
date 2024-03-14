# API EXPENSE MANAGER

 - Spring boot 3.2.2
 - Java 17


## Implementaciones
- Spring Data JPA
- OpenApi
- Swagger


### DATABASE
 - PostgresSQL 

docker run --name db-postgres -e POSTGRES_PASSWORD=postgres -v v_postgrest_data=/var/lib/postgresql/data -p 5432:5432 -d postgres


-e POSTGRES_USER=leo
-e POSTGRES_DB=name-db
-v v_postgrest_data=/var/lib/postgresql/data

#### Comandos psql
CREATE USER nuevo_usuario WITH PASSWORD 'mi_contraseña';
GRANT ALL PRIVILEGES ON DATABASE nombre_de_base_de_datos TO nuevo_usuario;

/Users/leonardo/.sdkman/candidates/gradle/8.5/bin