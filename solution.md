* Primeramente analicé el ejercicio.
* Del análisis noté que sería más fácil de entender y de escalar aplicando un patrón de diseño.
* Apliqué el patrón de diseño estrategia.
* Implementé la lógica para cada estrategia verificando los caminos que tienen en la función principal.
* Implementé también la clase Sulfuras como una estrategia, cuyo comportamiento explícito es no modificar nada
* Modifiqué el updateQuality del archivo principal, para llamar a las estrategias verificando que el nombre del ítem coincida con la estrategia correspondiente.
* Consideré usar un factory de estrategias para evitar el uso de múltiples condicionales
* Descomenté las pruebas.
* Realicé las pruebas verificando que la nueva funcionalidad esté correctamente aplicada y que cumpla con el comportamiento original.