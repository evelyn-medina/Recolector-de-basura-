# **README — Sistema de Optimización de Recolector de Basura**

Proyecto desarrollado en **Java (Swing) con NetBeans** para el municipio de **Salina Cruz, Oaxaca**, enfocado en optimizar, administrar y registrar rutas, unidades, operadores y actividades de recolección de basura.

---

#  **Descripción del proyecto**

Este sistema permite gestionar y optimizar la operación de camiones recolectores de basura mediante:

* Registro de **unidades** (camiones)
* Registro de **rutas**
* Registro de **operadores**
* Registro y seguimiento de **actividades** diarias
* Control de acceso mediante **usuarios tipo ADMIN y OPERADOR**
* Interfaz gráfica desarrollada con **Java Swing**
* Arquitectura basada en **Model – Service – Frame**
* Manejo de datos mediante base de datos **MySQL**

El objetivo es ofrecer una herramienta sencilla para mejorar los tiempos de recolección, controlar los recorridos y optimizar el uso de los camiones.

---

#  **Tecnologías utilizadas**

| Tecnología   | Descripción                             |
| ------------ | --------------------------------------- |
| Java 17+     | Lenguaje principal del sistema          |
| NetBeans 19+ | IDE para edición y diseño de interfaces |
| Swing        | Librería gráfica utilizada              |
| MySQL 8+     | Base de datos del sistema               |
| JDBC         | Conexión con MySQL                      |
| MVC          | Estructura del proyecto                 |

---

#  **Requisitos del sistema**

Antes de instalar, asegúrate de tener:

### Software necesario

* Java JDK **17 o superior**
* NetBeans **19 o superior**
* MySQL Server **8.0+**
* MySQL Workbench (opcional)
* Conector JDBC `mysql-connector-j-8.3.x.jar`


---

#  **Instalación**

Sigue estos pasos para instalar el sistema.

---

## ** Clonar o descargar el proyecto**

Desde GitHub:

```bash
git clone https://github.com/usuario/sistema-camiones-basura.git
```

O descargar el archivo `.zip` y extraerlo.

---

## **Abrir el proyecto en NetBeans**

1. Abrir **NetBeans**
2. Menú: **File → Open Project**
3. Seleccionar la carpeta del proyecto
4. Esperar a que cargue las dependencias

---

## ** Agregar el conector MySQL (JDBC)**

1. Clic derecho en el proyecto → **Properties**
2. Ir a **Libraries**
3. Clic en **Add JAR/Folder**
4. Seleccionar el archivo:

```
mysql-connector-j-8.x.x.jar
```

(Si no lo tienes, puedes descargarlo desde la página oficial de MySQL.)

---

## **Importar la base de datos**

1. Abrir **MySQL Workbench**
2. Menú **File → Open SQL Script**
3. Seleccionar el archivo:

```
database.sql
```

4. Ejecutar con el botón 

Esto creará tablas como:

* usuario
* operador
* unidad
* ruta
* actividad

Y registrará un usuario administrador por defecto.

---

## **Configurar las credenciales de la base de datos**

En el archivo:

```
src/com/mycompany/problematica2/database/Conexion.java
```

Modificar:

```java
private static final String URL = "jdbc:mysql://localhost:3306/camiones";
private static final String USER = "root";
private static final String PASSWORD = "TU_CONTRASEÑA";
```

---

#  **Ejecución del programa**

Para iniciar el sistema:

### Desde NetBeans:

1. Clic en el botón 
2. Se abrirá la ventana de **inicio de sesión**

###  Usuarios iniciales (por defecto)

```
Admin:
Correo: admin@admin.com
Contraseña: admin123

Operador:
Correo: operador@correo.com
Contraseña: 12345
```

---

#  **Flujo de uso**

##  1. Inicio de sesión

El sistema valida correo y contraseña con MySQL.

## 2. Menú ADMIN

Permite registrar:

* Usuarios
* Unidades
* Rutas
* Actividades

##  3. Menú OPERADOR

Puede registrar:

* Actividades asignadas
* Ruta que realizó
* Unidad que operó

---

#  **Estructura del proyecto**

```
src/
 └── com.mycompany.problematica2
      ├── frames/        # Interfaz gráfica (Swing)
      ├── model/         # Clases del sistema
      ├── service/       # Servicios y lógica
      ├── dao/           # Acceso a datos
      └── database/      # Conexión JDBC
```

---

#  **Pruebas**

* Se probaron los módulos de registro y consulta
* Validación de credenciales
* Apertura de interfaces según tipo de usuario
* Conexión a MySQL estable y persistente

---


Proyecto realizado por:

* *2,3 Trukos*

Para el concurso:
**Hackathon**

---



