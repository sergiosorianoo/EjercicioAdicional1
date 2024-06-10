# EjercicioAdicional1
Ejercicio Adicional 1. Recuperacion. Ficheros y Mapas

Realiza un par de clases, Main y KGen para resolver el siguiente problema.

Cuando tenemos información genética se almacena en ficheros FASTA https://es.wikipedia.org/wiki/Formato_FASTA que almacenan una línea de texto inicial con la descripción de lo almacenado más un número de líneas indeterminado (n líneas) de texto separadas por "\n" donde se leen los 4 caracteres típicos que representan las bases del ADN. Por ejemplo:

>PP854562.1 Severe acute respiratory syndrome coronavirus 2 isolate SARS-CoV-2/human/USA/355103/2024
ACCAACTTTCGATCTCTTGTAGATCTGTTCTCTAAACGAACGGTTCGCGACGTGCTCGTACGTGGC
ACCAACTTTCGATCTCTTGTAGATCTGTTCTCTAAACGAACGGTTCGCGACGTGCTCGTACGTGGC
ACCAACTTTCGATCTCTTGTAGATCTGTTCTCTAAACGAACGGTTCGCGACGTGCTCGTACGTGGC
TTTGGAGACTCCGTGGAGGAGGTCTT...

Nos piden que seamos capaces de abrir un fichero FASTA, leer su contenido genético, y que pongamos a funcionar objetos de la clase KGen, que tendría un string con la ruta del fichero abierto y otro String data con la información del fichero sin los "\n". Esta clase tendrá un método "public Map<String,Integer> getKgenMap(int size)" que devolverá un mápa con el conjunto de palabras de tamaño "size" y el número de veces que está cada palabra repetida en el atributo "data" de nuestro objeto Kgen.

Realiza la clase Kgen que lea del fichero FASTA y trabaje el método del Mapa y crea una clase Main con las opciones de menú:
- Abrir fichero FASTA (pedirá el nombre del fichero)
- Calcular y mostrar mapa de palabras de tamaño... (pedirá el tamaño de la palabra)
