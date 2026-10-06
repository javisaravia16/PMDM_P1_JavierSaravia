# ⚽ NowFootball

**Resultados de fútbol al minuto.** Práctica 1 de *Programación Multimedia y Dispositivos Móviles* (MEDAC) · Javier Saravia.

NowFootball es una app Android para consultar de un vistazo los partidos del día: cuáles están en directo y en qué minuto van, cuáles han terminado y a qué hora empiezan los siguientes. Desde cada partido se abre un detalle con el marcador, el estadio y los momentos clave.

> En esta práctica solo se diseña la **interfaz**. Los datos son de ejemplo. Lo que se trabaja es el análisis, el entorno y la **gestión de recursos**: textos, imágenes, colores, estilos, tema e icono.

## Capturas

| Partidos de hoy | Detalle del partido | Versión en inglés |
|:---:|:---:|:---:|
| ![Pantalla principal](docs/capturas/03_movil_es.png) | ![Detalle](docs/capturas/06_detalle_es.png) | ![Inglés](docs/capturas/05_movil_en.png) |

| Tablet | Modo oscuro | Horizontal | Icono en el lanzador |
|:---:|:---:|:---:|:---:|
| ![Tablet](docs/capturas/04_tablet_es.png) | ![Oscuro](docs/capturas/09_modo_oscuro.png) | ![Horizontal](docs/capturas/10_horizontal.png) | ![Icono](docs/capturas/07_lanzador_icono.png) |

## Características

- **Java + vistas XML**, plantilla *Empty Views Activity*, `minSdk 24` (Android 7.0) y `targetSdk 36`.
- Dos pantallas: `activity_main.xml` (partidos de hoy) y `activity_detalle.xml` (detalle), con partes reutilizables mediante `<include>`.
- **Ningún texto, color ni tamaño escrito a mano** en los layouts: todo está en `res/values`.
  - `strings.xml`: 28 cadenas, 2 `string-array` (competiciones y eventos), 1 `plurals` y textos con parámetros (`%1$s`, `%1$d`, `%2$d`).
  - `colors.xml`: paleta con nombres de función (`color_primario`, `color_secundario`, `color_en_directo`…).
  - `dimens.xml`: medidas en `dp` y textos en `sp`.
  - `styles.xml` y `themes.xml`: 11 estilos propios reutilizados y el tema `Theme.NowFootball` (Material 3) con la paleta propia.
- **Internacionalización:** español (por defecto) e inglés (`values-en`).
- **Imágenes:** vectorial `drawable/ic_balon.xml` (Vector Asset) y mapa de bits `drawable-nodpi/img_estadio.jpg`.
- **Icono adaptativo propio** (`mipmap-anydpi-v26` + `mipmap-*dpi`) aplicado en el Manifest.
- **Ampliación:** tema oscuro (`values-night`) y diseño horizontal en dos columnas (`layout-land`).

## Cómo ejecutarla

**Requisitos:** una versión reciente de Android Studio (el proyecto usa Android Gradle Plugin 9.3), con el SDK de Android 36 y un emulador o un móvil con Android 7.0 o superior.

1. Clona el repositorio:
   ```bash
   git clone https://github.com/javisaravia16/PMDM_P1_JavierSaravia.git
   ```
2. Ábrelo en Android Studio con **File › Open** y espera a que termine la sincronización de Gradle.
3. Elige un dispositivo virtual en **Device Manager** (por ejemplo, Pixel 7 · API 36) y pulsa **Run ▶**.

También se puede compilar desde la terminal:

```bash
./gradlew assembleDebug
```

Para ver la app en inglés, cambia el idioma del emulador en *Settings › System › Languages* a *English*. Para el modo oscuro, activa *Dark theme* en los ajustes rápidos.

## Estructura

```
app/src/main/
├── AndroidManifest.xml
├── java/es/medac/javier/app/   MainActivity.java · DetalleActivity.java
└── res/
    ├── layout/ · layout-land/
    ├── values/ · values-en/ · values-night/
    ├── drawable/ · drawable-nodpi/
    └── mipmap-anydpi-v26/ · mipmap-mdpi … mipmap-xxxhdpi/
docs/
├── memoria.pdf                 Memoria de la práctica (partes A-D)
├── capturas/                   Capturas de la app
└── fuente/                     Fuente HTML de la memoria
```

## Memoria

La memoria completa está en [`docs/memoria.pdf`](docs/memoria.pdf): análisis del desarrollo móvil, especificación (requisitos y casos de uso), entorno de desarrollo, recursos y conclusión.

---
Javier Saravia · MEDAC · 2026/2027
