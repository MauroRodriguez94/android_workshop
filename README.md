# Android Workshop

Vamos a armar una app con un login básico y una pantalla de bienvenida. La idea es aprender los conceptos básicos de android. 


### Parte 0 
Crear un proyecto nuevo en android vacío

### Parte 1
Crear una launcher activity vacía llamada "LoginActivity". Las activities "launcher" son las que después aparecen en el menú de aplicaciones del dispositivo.
Darle play y ver una pantalla en blanco

### Parte 2 
Usar un LinearLayout en la vista y agregar 2 edit text y un botón que ocupen todo el ancho de la pantalla. 
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws2.png?raw=true

### Parte 3
Agregar un margen de 16dp a la pantalla
Agregar un margen bottom de 24dp a los textos y un margen top de 24dp al botón.
Extraer los valores al archivo dimens y reutilizar los valores iguales.
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws3.png?raw=true

### Parte 4
Agregar el texto "Continuar" en el botón
Extraer el valor en el archivo dimens
Agregar color blanco al texto del botón y extraerlo al archivo colors
Agregar el color accent al fondo del botón y cambiarlo a celeste. Esto cambia también el color de resaltado de inputs.
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws4.png?raw=true

### Parte 5
Enchular los EditText. 
Le ponemos un hint para que se entienda qué representa cada campo. El primero es el nombre de usuario y el segundo la contraseña.
MaxLines = 1 para que no pueda pasarse a varias líneas.
Fading edge para cuando el texto es muy largo.
Input type email para el usuario y number password para la contraseña. Esto nos modifica el teclado y la password se ofusca. 
Ime options para cambiar la acción del botón del teclado. 
https://github.com/lugarbarini/android_workshop/blob/master/workshop_screenshots/ws5.png?raw=true
