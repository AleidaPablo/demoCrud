# Actividad 3: Despliegue de Aplicación Spring Boot CRUD con MySQL en VPS

Aplicación web desarrollada con **Spring Boot** que implementa un sistema CRUD (Crear, Leer, Actualizar, Eliminar) para la gestión de productos y categorías con persistencia en **MySQL**. El proyecto cuenta con arquitectura en capas (`Controller`, `Service`, `Repository`), relación `@ManyToOne` entre entidades y despliegue en producción dentro de un servidor **VPS Linux (Ubuntu)**.

---

## Enlaces Públicos de Despliegue (VPS)

* **Vista Web Principal (Interfaz Thymeleaf):**  
  `http://178.128.155.105:8084/vista-productos`

* **API REST - Endpoint de Productos (JSON):**  
  `http://178.128.155.105:8084/api/productos`

* **API REST - Endpoint de Categorías (JSON):**  
  `http://178.128.155.105:8084/api/categorias`
  ----

## Tecnologías y Herramientas Utilizadas

### **Backend & Base de Datos**
* **Java:** 21 (LTS)[cite: 3]
* **Framework:** Spring Boot 4.1.2[cite: 3]
  * Spring Data JPA (Hibernate)
  * Spring Web (MVC / Controller)
  * Thymeleaf (Motor de plantillas HTML)
* **Base de Datos:** MySQL 8.0 / 9.5[cite: 3]
* **Gestor de Dependencias:** Apache Maven[cite: 3]

### **Infraestructura & Despliegue**
* **Servidor VPS:** DigitalOcean Droplet
* **Sistema Operativo:** Ubuntu 24.04 LTS (64-bit)[cite: 3]
* **Dirección IP del Servidor:** `178.128.155.105`[cite: 3]
* **Puerto de Servicio:** `8084`[cite: 3]
---

