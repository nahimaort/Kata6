# Kata6
### Trabajo práctico "Kata 6" Ingeniería del Software II
Ejercicio para trabajar con patrones de diseño de tipo creacional, como es el método factoría. Se emplean también otros principios, como el principio abierto/cerrado.

Se trata de reflejar la evolución del código para una empresa juguetera, acorde con la evolución que va presentando ésta: nuevos juguetes, nuevas fábricas, filiales, etc.

### Versiones :wrench:
* **Versión 1**: 

   * Creamos una clase para que cada objeto tenga un número de serie único: `SerialNumberGenerator`
   * Solo se venden coches, por lo que solo se tiene la clase `Car`
   * Los métodos `pack()` y `label()` indican el proceso de empaquetado y etiquetado, respectivamente, de los juguetes
* **Versión 2**: 
   
   * Aparece un nuevo juguete, el helicóptero: `Helicopter`
   
* **Versión 3**: 

   * Se añade la clase `ToyBusiness`, que será la encargda de crear los juguetes.
   
* **Versión 4**: 

   * Se crea la interfaz `Toy` para abstraer los procesos de empaquetado y etiquetado. 
   * Aparece el método factoría `createToy()`.
   
* **Versión 5**: 
   
   * Aparece una nueva filial americana, por lo que se crean dos modelos distintos para cada juguete (asiático y americano).
   * Todas los juguetes implementan la interfaz `Toy`.
   * Las filiales extienden ahora de `ToyBusiness`, que pasa a ser una interfaz. Cada una de ellas crea un tipo de juguete diferente.
   
* **Versión 6**: 

   * Se impide que la filial americana modifique procesos estándares mediante la creación de la interfaz `Toy Factory`.
   
* **Versión 7**: 

   * Se añade el principio abierto/cerrado para incluir nuevos modelos, como el submarino.
   * Cada fábrica crea uno de los modelos disponibles, se incluye el método factoría `createToy()`.

* **Versión 8**: 

   * Se emplea el patrón de diseño Singleton sobre el generador de número de serie.
   * La empresa asume la creación de los componentes de cada juguete.
     * Se añaden las clases correspondientes a cada componente del juguete (`Wheel`, `RotorBlade`, `Engine`).
     * Se añaden las clases correspondientes a las fábricas de componentes.
     * Se adapta el código para añadir el proceso de preparación de cada juguete.
