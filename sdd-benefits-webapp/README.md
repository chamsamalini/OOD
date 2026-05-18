# SDD Benefits Web App

This project is a simple Maven-based Java WAR web application for a workshop on Spec-Driven Development.

## Purpose

The application provides a static JSP page that explains the benefits of Spec-Driven Development, shows the basic workflow, and highlights how SDD improves consultant delivery.

## Project Structure

- `.specify/` contains the manual Spec Kit-style artifacts.
- `src/main/webapp/index.jsp` contains the learner-facing web page.
- `src/main/webapp/WEB-INF/web.xml` defines the welcome file.
- `Jenkinsfile` demonstrates a basic CI pipeline.
- `pom.xml` packages the project as a WAR file.

## Build

Run the following command from this folder:

```powershell
mvn clean package
```

The build output will be generated in `target/`.

## Run

Deploy the generated WAR file to Tomcat or another servlet container.

## Notes

This project is intentionally simple and workshop-friendly. It uses a static JSP page only and does not include databases, REST APIs, or authentication.