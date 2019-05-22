# Android Workshop

Vamos a armar una app con un login básico y una pantalla de bienvenida. La idea es aprender los conceptos básicos de android. 


### Parte 0 - Creación del Proyecto
Crear un proyecto nuevo en android vacío

### Parte 1 - Activities
Crear una launcher activity vacía llamada "LoginActivity". Las activities "launcher" son las que después aparecen en el menú de aplicaciones del dispositivo.<br>
Darle play y ver una pantalla en blanco

### Parte 2 - Layouts
Usar un LinearLayout en la vista y agregar 2 edit text y un botón que ocupen todo el ancho de la pantalla. 
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws2.png?raw=true

### Parte 3 - Dimens
Agregar un margen de 16dp a la pantalla<br>
Agregar un margen bottom de 24dp a los textos y un margen top de 24dp al botón.<br>
Extraer los valores al archivo dimens y reutilizar los valores iguales.<br>
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws3.png?raw=true

### Parte 4 - Colors & Strings
Agregar el texto "Continuar" en el botón<br>
Extraer el valor en el archivo dimens<br>
Agregar color blanco al texto del botón y extraerlo al archivo colors<br>
Agregar el color accent al fondo del botón y cambiarlo a celeste. Esto cambia también el color de resaltado de inputs.<br>
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws4.png?raw=true

### Parte 5 - Edit Text
Enchular los EditText. 
Le ponemos un hint para que se entienda qué representa cada campo. El primero es el nombre de usuario y el segundo la contraseña.<br>
MaxLines = 1 para que no pueda pasarse a varias líneas.<br>
Fading edge para cuando el texto es muy largo.<br>
Input type email para el usuario y number password para la contraseña. Esto nos modifica el teclado y la password se ofusca. <br>
Ime options para cambiar la acción del botón del teclado. 
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws5-1.png?raw=true
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws5-2.png?raw=true

### Parte 6 - Ids
Agregar un id a cada vista. <br>
Ir a la activity y obtener una referencia a las vistas. 

### Parte 7 - Listeners
Agregar un click listener al botón <br> 
Loggear el contenido de los inputs 

### Parte 8 - Intents
Crear una nueva activity vacía llamada "WelcomeActivity" <br>
En el click del botón, armar un intent e ir a la nueva pantalla. 
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws8.gif?raw=true

### Parte 9 - Text View
Agregar un text view en la nueva pantalla <br>
Desde código, settear el string de bienvenida
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws9.png?raw=true

### Parte 10 - Intent Extras
Desde la primer pantalla, pasar el nombre de usuario mediante un extra. <br>
Desde la segunda pantalla, obtener el extra y mostrarlo en el mensaje de bienvenida.
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws10.png?raw=true

### Parte 11 - Imágenes
Descargar [las imágenes](https://drive.google.com/drive/folders/1crIXLV7s0AlF0kPP5RmJXG3DbeTLaHzF?usp=sharing) y copiarlas al proyecto. <br>
Agregar el asset a la vista de bienvenida
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws11.png?raw=true

### Parte 12 - Localización
Agregar las traducciones para Inglés e Inglés de Nueva Zelanda. Por default usar Español
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws12-1.png?raw=true
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws12-2.png?raw=true
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws12-3.png?raw=true

### Parte 13 - Rotacióm
Cambiar los colores para cuando la pantalla está en modo landscape
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws13.png?raw=true




## Proximamente: 
- Jugar con el constraint layout para armar una ui de bienvenida más copada
- Armar una clase que valide que usuario y contraseña tengan data
- Armar un test de esa clase
- Si hay un error ir a otra activity de error pero mediante deeplink
- En la activity de error, agregar una imagen de fallo. 
- Demostrar el ciclo de vida. 



