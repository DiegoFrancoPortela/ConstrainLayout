# ConstrainLayout

Esta pequeña aplicación es para practicar el diseño con ConstrainLayout.
Está formada por 4 EmptyActivity que a su vez tienen varios ejemplos de colocaciones de un Layout.

## MainActivity

* Contiene 3 ImageView que están enlazadas entre sí mediante Chains.
* Ejemplo de como usando CircleLayout podemos enlazar dos ImageView.

## SegundaActivity

* ImageView con valores horizontales fijos.
* **Figura 7**, Restricción Horizontal.
* **Figura 8**, Posición de Orden.
  * B y C dependen de A para su colocación.
 
## TerceraActivity

* **Figura 9**, Restricción de alineación horizontal.
  * El Margen horizontal de B depende del de A.
* **Figura 10**, Restricción de alineación horizontal con desplazamiento.
  *El Margen Horizontal de B depende del de A, además de que su margen superior depende del Inferior de A.
  
 ## CuartaActivity
 
 * Restricción sobre una guía.
    * El Margen de la imagen está sobre una guía, invisible para el usuario normal, que a su vez su separación se hace sobre la Activity.
 * Barriers.
    * Se crea una barrera debajo de la segunda imagen, las dos siguientes obtienen su separación a partir de esta.
