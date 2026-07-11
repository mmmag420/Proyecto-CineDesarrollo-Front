# Lujosam Cine Frontend

Aplicación de escritorio en Java Swing para la visualización de cartelera, venta de combos y gestión de clientes de un cine.

---

## Resumen técnico

| Componente | Tecnología |
| --- | --- |
| **Frontend** | Java 21 (Swing / AWT) |
| **Cliente HTTP** | Retrofit2 + Gson |
| **Gestor de paquetes**| Maven |

*(Nota: Esta aplicación actúa exclusivamente como cliente; la base de datos, autenticación y lógica de negocio residen en un servidor backend independiente).*

---

## Características

* Inicio de sesión para clientes y administradores.
* Visualización de cartelera de películas.
* Catálogo de confitería y combos.
* Carrito de compras y simulación de pasarela de pago.
* Gestión de perfil de usuario y obtención de membresías.
* Chatbot integrado en la interfaz.

---

## Arquitectura

La aplicación implementa una arquitectura en capas basada en el patrón Modelo-Vista-Controlador (MVC) adaptado para aplicaciones de escritorio:

* Las vistas (formularios Swing) capturan la interacción del usuario.
* Los servicios consumen las interfaces de Retrofit.
* Retrofit formatea y envía peticiones HTTP al servidor backend.
* El backend procesa, interactúa con la base de datos y retorna respuestas en formato JSON, que Gson convierte nuevamente a objetos Java.

---

## Flujo de la aplicación

1. El usuario inicia la aplicación (`VenLogin`) y envía sus credenciales.
2. Tras la validación, la API retorna los datos del cliente, los cuales se almacenan en sesión junto con una instancia vacía del carrito de compras (`Car`).
3. El usuario navega por las vistas (`VenPrincipal`, `VenCombos`, `VenPromo`), inyectando el estado de la sesión en cada nueva ventana.
4. Los productos seleccionados se añaden al carrito en memoria.
5. Al procesar el pago (`VenPago`), se envía la información consolidada al backend para generar las facturas y persistir la transacción.

---

## Tecnologías utilizadas

* Java 21
* Java Swing
* Maven
* Retrofit 2
* Gson

---

## Módulos principales

* **Autenticación**: Formularios de login y registro.
* **Cartelera y Películas**: Exploración de películas y detalles.
* **Confitería**: Selección de comida y combos.
* **Compras**: Carrito de compras y pasarela de pago.
* **Usuario**: Perfil del cliente y suscripción de membresías.
* **Administración**: Panel para gestión interna (acceso restringido).

---

## Buenas prácticas implementadas

* **Separación por capas**: División clara entre Vistas, Servicios, Modelos y Cliente API.
* **API Client**: Uso de Retrofit para abstraer y tipar estáticamente las llamadas de red.
* **Gestión de estado simple**: Inyección de dependencias básicas (usuario y carrito) entre vistas.
* **Gestión de dependencias**: Uso de Maven y `pom.xml`.

---

## Estructura del proyecto

```text
src/main/java/
├── api/             # Interfaces de Retrofit (endpoints)
├── com.mycompany/   # Archivos de configuración general
├── modelos/         # Entidades de dominio (POJOs)
├── Service/         # Clases intermediarias de lógica y red
└── vistas/          # Interfaz gráfica (archivos .java y .form)
```

---

## Requisitos previos

* Java Development Kit (JDK) 21
* Apache Maven
* Servidor backend en ejecución (`http://localhost:8080`)

---

## Instalación

1. Clona este repositorio en tu máquina local.
2. Navega a la raíz del proyecto.
3. Descarga las dependencias mediante Maven:

```bash
mvn clean install
```

---

## Ejecución

El proyecto puede ser ejecutado a través de un IDE (NetBeans, IntelliJ IDEA o Eclipse) compilando y corriendo la clase principal de la interfaz gráfica:

**Punto de entrada:** `src/main/java/vistas/VenLogin.java`

*Nota: Aunque el archivo `pom.xml` contiene un plugin `exec-maven-plugin` apuntando a `com.mycompany.cine2.Cine2`, la aplicación gráfica real se levanta desde el método `main` de `VenLogin.java`.*
