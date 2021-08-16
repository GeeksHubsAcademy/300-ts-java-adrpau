<p align="center">
    <img src="https://github.com/GeeksHubsAcademy/2020-geekshubs-media/blob/master/image/logo.png" >	
</p>


    Considere el siguiente problema:

	Dada una secuencia de caráctes formados por tres elementos se pide la reducción de los mismos 
	hasta llegar a la última secuencia.
	La reducción de la fila se hace a través del empareamiento de dos de ellos en cada fila.
	Si el emparejamiento contiene los mismos elementos, el resultado es el mismo elemento en la siguiente fila.
	Si los elementos son diferentes, el resultado es el elemento que falta en la siguiente fila.
	El algortimo finaliza cuando la reducción llega a un solo elemento.

	Elementos: X Y Z

	Ejemplo:

		Z X X 
		 Y X
		  Z

    En la carpeta 'src/main/java/es/geekshubs/academy/Reduce.java' se encuentra el fichero con la 
    definición de nuestro método vacío.
    En la carpeta 'src/test/java/es/geekshubs/academy/ReduceTest.java' se encuentra el fichero con 
    la suite de test.

    El modus operandi de trabajo es el siguiente:
    
    Debes 'forkear' el proyecto a tu cuenta.
    Puedes hacer PR's ilimitadas e ir validando poco a poco la solución contra nuestro respositorio con CI.
    Puedes trabajar en local y subir la solución haciendo un PR a nuestro repositorio.
    Cuando se envíe la PR final, debes indicar el tiempo de dedicación y los intentos que has hecho.
    También puedes añadir un comentario para dar cualquier tipo de feedback.
    
    En caso de duda, revisa en el apartado de 'Referencias'.

    [INFO] -------------------------------------------------------
    [INFO]  T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running es.geekshubs.academy.ReduceTest
    [INFO] Tests run: 25, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.121 s - in es.geekshubs.academy.ReduceTest
    [INFO]
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 25, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  6.576 s
    [INFO] Finished at: 2021-05-20T17:15:18+02:00
    [INFO] ------------------------------------------------------------------------
 
    Process finished with exit code 0 

## Referencias

* [Tutorial - Testing Automatizado](https://github.com/GeeksHubsAcademy/2020-js-vanilla-testing-FFFF/blob/master/README.md)
