# Personaje_Hilos2 - Aplicación de Equipamiento de Personaje

## Descripción
Esta es una aplicación Android que simula un sistema de equipamiento de personaje estilo Minecraft. La aplicación permite al usuario equipar y desequipar diferentes piezas de armadura (casco, pechera, pantalón, botas) en un personaje llamado Steve.

## Características

### 🎮 **Interfaz de Usuario**
- **Lado Izquierdo**: Personaje Steve centrado con fondo de mundo Minecraft y slots circulares para equipar armadura
- **Slots Circulares**: 4 slots circulares a la derecha de Steve para equipar cada pieza de armadura
- **Lado Derecho**: Panel de inventario con armadura de diamante y progress bars
- **Diseño Minecraft**: Estilo pixelado y blocky característico del juego

### ⚡ **Funcionalidades**
- **Equipamiento**: Click en los slots circulares para equipar/desequipar piezas
- **Visualización en Tiempo Real**: Las piezas se muestran sobrepuestas al personaje
- **Progress Bars**: Indicadores visuales del estado de cada pieza con color de diamante
- **Botón Reset**: Remueve todo el equipamiento de una vez
- **Feedback Visual**: Toast messages para confirmar acciones

### 🎨 **Diseño**
- **Orientación**: Landscape (horizontal) para mejor aprovechamiento del espacio
- **Fondo Minecraft**: Mundo pixelado con árboles, pasto y cielo
- **Slots Circulares**: Diseño circular con bordes azules para equipar armadura
- **Panel de Inventario**: Panel gris oscuro con slots de diamante
- **Colores**: Esquema de colores Minecraft con acentos de diamante azul

## Estructura del Proyecto

```
app/src/main/
├── java/com/example/personaje_hilos2/
│   └── MainActivity.java          # Lógica principal de la aplicación
├── res/
│   ├── drawable/
│   │   ├── steve.png             # Personaje principal
│   │   ├── casco.png             # Pieza de armadura - cabeza
│   │   ├── pechera.png           # Pieza de armadura - torso
│   │   ├── pantalon.png          # Pieza de armadura - piernas
│   │   ├── botas.png             # Pieza de armadura - pies
│   │   ├── inventario.png        # Fondo del inventario
│   │   ├── background.png        # Fondo principal (mundo Minecraft)
│   │   ├── circular_slot_background.xml # Fondo de slots circulares
│   │   ├── circular_button_background.xml # Botones circulares
│   │   ├── diamond_slot_background.xml # Slots de diamante
│   │   ├── inventory_panel_background.xml # Panel de inventario
│   │   ├── button_background.xml # Estilo de botones
│   │   ├── slot_background.xml   # Estilo de slots
│   │   └── reset_button_background.xml # Estilo del botón reset
│   ├── layout/
│   │   └── activity_main.xml     # Layout principal reorganizado
│   ├── values/
│   │   ├── colors.xml            # Definición de colores incluyendo diamante
│   │   └── themes.xml            # Temas de la aplicación
│   └── values-night/
│       └── themes.xml            # Tema nocturno
```

## Cómo Usar

1. **Equipar Pieza**: Toca el slot circular correspondiente a la derecha de Steve
2. **Desequipar Pieza**: Toca nuevamente el mismo slot circular
3. **Ver Estado**: Los progress bars azules muestran si la pieza está equipada (100%) o no (0%)
4. **Reset Completo**: Usa el botón "RESET EQUIPAMIENTO" para remover todo

## Layout Reorganizado

### **Lado Izquierdo - Steve y Slots Circulares**
- **Steve centrado** con fondo de mundo Minecraft
- **4 slots circulares** a la derecha de Steve para equipar armadura
- **Diseño circular** con bordes azules y centro blanco
- **Posicionamiento vertical** alineado con las partes del cuerpo

### **Lado Derecho - Panel de Inventario**
- **Panel gris oscuro** con bordes redondeados
- **Slots de diamante** para cada pieza de armadura
- **Progress bars azules** con color de diamante
- **Títulos descriptivos** para cada pieza
- **Botón de reset** en la parte inferior

## Tecnologías Utilizadas

- **Android SDK**: API 24+ (Android 7.0+)
- **Java 11**: Lenguaje de programación
- **ConstraintLayout**: Layout principal
- **LinearLayout**: Organización de elementos
- **FrameLayout**: Superposición de capas de armadura
- **Material Design 3**: Componentes de UI modernos
- **Drawables XML**: Slots circulares y paneles personalizados

## Requisitos del Sistema

- **Android**: 7.0 (API 24) o superior
- **Orientación**: Landscape (horizontal) recomendada
- **Memoria**: Mínimo 2GB RAM
- **Pantalla**: Mínimo 4.5" para mejor experiencia

## Instalación

1. Clona el repositorio
2. Abre el proyecto en Android Studio
3. Sincroniza las dependencias de Gradle
4. Conecta un dispositivo Android o usa el emulador
5. Presiona "Run" para compilar y ejecutar

## Próximas Mejoras

- [ ] Implementación de sistema de hilos para animaciones
- [ ] Efectos de sonido al equipar/desequipar
- [ ] Animaciones de transición suaves
- [ ] Sistema de guardado de estado
- [ ] Más tipos de armadura y equipamiento
- [ ] Modo de juego con objetivos
- [ ] Efectos visuales de partículas al equipar

## Autor
Desarrollado como proyecto educativo para la Universidad del Valle - Programación Móvil

## Licencia
Este proyecto es de uso educativo y demostrativo.
