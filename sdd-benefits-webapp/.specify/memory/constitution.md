# Project Constitution - SDD Benefits Java Web App

## Purpose

This project demonstrates Spec-Driven Development by building a simple Java JSP web application that explains the benefits of SDD.

## Principles

1. Keep the application simple and understandable for workshop learners.
2. The web page must clearly explain the benefits of Spec-Driven Development.
3. The implementation must use a Java web application structure with index.jsp.
4. The project must be buildable using Maven.
5. The project must include a Jenkinsfile to demonstrate CI/CD readiness.
6. The page must be static; no database, login, or backend business logic is required.
7. The build should produce a WAR file.
8. The project should be easy to inspect in VS Code.

## Quality Rules

- Use meaningful headings and readable content.
- Avoid unnecessary dependencies.
- Keep styling inside index.jsp for simplicity.
- The Jenkinsfile should run Maven build and archive the WAR artifact.
- Any change must be traceable back to this constitution and the specification.