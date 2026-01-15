# WebClient Rick and Morty API (WebFlux)

Projeto de estudo usando **Spring WebFlux** e **WebClient** para consumir a **The Rick and Morty API** e expor endpoints locais para teste.

> API pública utilizada: https://rickandmortyapi.com/api :contentReference[oaicite:2]{index=2}

---

## 🎯 Objetivos de estudo

- Entender o **modelo reativo** do Spring WebFlux (Reactor: `Mono`/`Flux`)
- Consumir uma API externa com **WebClient**
- Praticar organização simples em camadas:
  - `controller` → expõe endpoint local
  - `client` → integra com API externa
  - `response` → DTOs de resposta

---

## 🧰 Tecnologias

- **Java 17**
- **Spring Boot + WebFlux**
- **WebClient (HTTP Client reativo)**
- **Project Reactor (Mono/Flux)**
- **Maven + Maven Wrapper**
- **Lombok (logs / boilerplate)**

---

## ✅ Pré-requisitos

- Java 17 instalado (JDK)
- (Opcional) Maven instalado  
  > Não é obrigatório, pois o projeto já contém **Maven Wrapper** (`mvnw` / `mvnw.cmd`)

---

## ▶️ Como rodar

### Usando Maven Wrapper (recomendado)

**Windows**
```bash
mvnw.cmd spring-boot:run
