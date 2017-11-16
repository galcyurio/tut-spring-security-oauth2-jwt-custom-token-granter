# Environment
- Spring Boot 1.5.8.RELEASE
- Spring Cloud Dalston.SR4

- spring boot security
- spring cloud starter oauth2

# Getting Started

__Run Auth and Resource Server__
````bash
cd auth
mvn spring-boot:run

cd resource
mvn spring-boot:run
````

__request access token__
````bash
curl -s -X POST localhost:8081/oauth/token --user custom-client: -d grant_type=custom -d email=test@test.com
````
````json
{
  "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiY3VzdG9tLXJlc291cmNlIl0sInVzZXJfbmFtZSI6InRlc3RAdGVzdC5jb20iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiLCJ0cnVzdCJdLCJleHAiOjE1MTA4NDYxODEsImF1dGhvcml0aWVzIjpbIlVTRVIiXSwianRpIjoiMTIwMzZiMDItMmVjYy00NWRmLTg2ZTAtMjcxOTdlOTJmMTRmIiwiY2xpZW50X2lkIjoiY3VzdG9tLWNsaWVudCJ9.1BI5OeU70z1Ug8W62IuI2bTIbZfBTvE8V7dWr5wGsOQ",
  "token_type": "bearer",
  "expires_in": 43199,
  "scope": "read write trust",
  "jti": "12036b02-2ecc-45df-86e0-27197e92f14f"
}
````

__Save access token to TOKEN vaiable.__
````bash
TOKEN=yJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiY3VzdG9tLXJlc291cmNlIl0sInVzZXJfbmFtZSI6InRlc3RAdGVzdC5jb20iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiLCJ0cnVzdCJdLCJleHAiOjE1MTA4NDYxODEsImF1dGhvcml0aWVzIjpbIlVTRVIiXSwianRpIjoiMTIwMzZiMDItMmVjYy00NWRmLTg2ZTAtMjcxOTdlOTJmMTRmIiwiY2xpZW50X2lkIjoiY3VzdG9tLWNsaWVudCJ9.1BI5OeU70z1Ug8W62IuI2bTIbZfBTvE8V7dWr5wGsOQ
````

__get resource from Resource Server__
````bash
curl -s localhost:8080/ -H "Authorization: Bearer $TOKEN"

Hello, resource!
````