//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }     /** encontrar en número apropriado


         }import java.util.Scanner;

         public class SumaNumerosConEscape {

         pub


         public static void main(String[] args) {

         Scanner scann

         Scanner

         Sc

         Scanner scanner = new Scanner(System.in);

         i
         int suma = 0;

         in
         int contador = 0;


         while (contador < 10) {
         System.out.print(
         System.out.p

         System


         "Introduce un número (999 para terminar): ");
         int numero = scanner.nextInt();



         if (numero == 999) {


         break; // Finaliza el bucle sin sumar 999
         }

         suma += numero;
         }

         suma +=


         // Suma el número si no es 999
         contador++;
         }

         System.out.println(
         contador++;
         }

         System.ou

         contador++;
         }

         System.

         contador++;
         }

         conta

         "La suma de los números introducidos es: " + suma);




         importación de java java.util.Scanner; public class ContadorNumeros { public static void main(String[] args) { Scanner scanner = new Scanner(System.in); int positivos = 0; int negativos = 0; int ceros = 0; // Leer 10 números del usuario for (int i = 0; i < 10; i++) { System.out.print("Introduce un número entero: "); int numero = scanner.nextInt(); if (numero > 0) { positivos++; } else if (numero < 0) { negativos++; } más { ceros++; } } // Mostrar resultados System.out.println("Cantidad de números positivos: " + positivos); System.out.println("Cantidad de números negativos: " + negativos); System.out.println("Cantidad de ceros: " + ceros); } } ``` ### Explicación del Código 1. **Variables de Cont

         public static void main (string []args){
         saudos nome estudante=obtenernome();
         system.out.pintln("otras tarefas no meio");
         saudos((veces5);
         sistem.out.println; ("welcome Mr, Mss:"+nomeestudante););
         saudos (veses2);

         static void saudos (int veces, string idioma){
         for( int i=0; i <veces; i++){
         if (idioma.equals("gl") sistem.out.println("ola");
         else if (idioma .equals("es"))sistem.out.print("Hola");
         else if (idioma .equals("en"))sistem.out.print("Hello");

         }static string obterNome (){no usages
         scaner sc= new escaner(sistem.in);
         sistem.out.println; ("escribe tu nombre:")
         string nome =sc.next();
         //sc close();
         }returr nome;







         import java.util.ArrayList;
         import java.util.List;

         public class NumerosEntre {

         public static List<Integer> numerosEntre(int num1, int num2) {
         List<Integer> numeros = new ArrayList<>();

         // Intercambiar valores si el primer número es mayor que el segundo
         if (num1 > num2) {
         int temp = num1;
         num1 = num2;
         num2 = temp;
         }
         // Añadir números comprendidos entre num1 y num2, excluyendo los límites
         for (int i = num1 + 1; i < num2; i++) {
         numeros.add(i);
         }
         return numeros;
         }
         public static void main(String[] args) {
         // Ejemplo de uso
         List<Integer> resultado = numerosEntre(5, 10);
         System.out.println("Números comprendidos entre 5 y 10: " + resultado);
         }






         public class NumerosEntre {

         public static void mostrarNumerosEntre(int num1, int num2) {
         // Si el primer número es mayor que el segundo, intercambiamos los valores
         if (num1 > num2) {
         int aux= num1;
         num1 = num2;
         num2 = aux;
         }






         System.out.println("Números comprendidos entre " + num1 + " y " + num2 + ":");

         // Bucle para mostrar los números comprendidos entre los dos enteros
         for (int i = num1 + 1; i < num2; i++) {
         System.out.print(i + " ");
         }
         }


         public static void main(String[] args) {
         mostrarNumerosEntre(5, 10);  // Ejemplo: mostrará 6 7 8 9





         /**pruba y documentación de funciones
         * @since v1.0
         * @autor Adriana
         * versión 1.0



         */
       /** public static void numeroscomprendidos ( int num1, int num2){
         for (int i = num1 + i < num2; i++) {
         system.out.println(i)

        public class main {

           /** Metodo principal, entrada
            de la
            aplicación args


             /** cuenta la totalidad de las letras de dos palavras
             *
         *@param a palavra a contar caracteres

         * @param b palavra a contar caracteres

         * @return numero de caracteres totales

        private static void (string[] args

        static in cuentaletras(String palabra1, String palabra2 ){

        }
        int totales=palabra1.length() +palabra2.length

        return 0;{
        }







Static void numeroscomprendidos(int num1, int num2){
        if (num1>num2)}
            int aux=num1;
            num1=num2;
            num2=aux;
            for (int i = num1+1; i <num2; i++))
            system.out.println(i);
         static void numeroscomprendidos (double num1, doublen um2){
         int num1Int=(int)math. round (num1);
         int num2Int=(int) math.round(num2);
         numeroscomprendidos (num1Int,num2Int);

         }






        }ublic class Main {
                    static void numerosComprendidos(int num1, int num2) {
                        // Se num1 é maior que num2, intercambiámolos
                        if (num1 > num2) {
                            int aux = num1;
                            num1 = num2;
                            num2 = aux;
                        }

                        // Mostramos todos os números entre num1 e num2
                        for (int i = num1 + 1; i < num2; i++) {
                            System.out.println(i);
                        }
                    }

                    public static void main(String[] args) {
                        numerosComprendidos(5, 10);
                    })
            ublic class Main {
                static void numeroscomprendidos(int num1, int num2) {


                    if (num1 > num2) {




                        int aux = num1;
                        num1 = num2;
                        num2 = aux;
                    }


                    num1 = num2;
                    num2 = aux;
                }


                num1 = num2;
                num2 = aux;
            }


            num1 = num2;
            num2 = aux;
        }

        num1 = num2;
        num2

                num1 = num2;
        n

                num1 = num2;


        num1 = num2;


        num1 = num2;


        num1 = num2;

        num
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }
    }


            System.out.println(i);
}

        System.out.println







        static void numeroscomprendidos(double num1, double num2) {




            int num1Int = (int) Math.round(num1);
            int num2Int = (int) Math.round(num2);

            numeroscomprendidos(num1Int, num2Int);
        }



        numeroscomprendidos(num1Int, num2Int);
    }


        numeroscomprendidos(num1Int, num2Int);



        numeroscomprendidos(num1Int,


                            numeroscomprendidos


                                    n

public static void main(String[] args) {
            numeroscomprendidos(
                    numeroscomprendidos(

                            n


                            5, 10);
            numeroscomprendidos(
                    nume

            public class Main {
                static void eco(int n) {
                    for (int i = 0; i < n; i++) {
                        System.out.println("Ecoo...");
                    }
                }

                public static void main(String[] args) {
                    eco(5); // Exemplo de uso: mostra "Ecoo..." 5 veces


                //funcion recursiva para o cálculo do factorial

                long res>;
                if (N==0){
                res= 1;
                else
                res=función recursiva (n-1);
                retur res;
                5! = 5x4x3x2x1

                            !=0!

                    public class Main {
                        static long factorial(int n) {
                            if (n == 0) {
                                return 1; // Caso base: o factorial de 0 é 1
                            } else {
                                return n * factorial(n - 1); // Chamada recursiva
                            }
                        }

                        public static void main(String[] args) {
                            int n = 5; // Exemplo: calcular o factorial de 5
                            System.out.println(n + "! = " + factorial(n)); // Imprime o resultado
                        }



                }public class Main {
                        static long potencia(int m, int n) {
                            // Caso base: calquera número elevado a 0 é 1
                            if (n == 0) {
                                return 1;
                            } else {
                                return m * potencia(m, n - 1); // Chamada recursiva
                            }
                        }

                        public static void main(String[] args) {
                            int m = 2; // Base
                            int n = 5; // Expoñente
                            System.out.println(m + "^" + n + " = " + potencia(m, n)); // Imprime o resultado
                        }
                }

                int fibonacci(int a, int b){
return a+b;


            Public start void main (String{args){

            int [] edades;
            edades= new int[5]
            edades[0] =31;
            edades[1]=23;
            edades[2]=56;
            edades[3]= 12;
            edades[4]= 32;
            system.out.println (edades[3]);
            string[] nomes={"Manuel", "José", "Rosa"," Ana"};
            systen.out.println(nome[3]);
            int mínimo=edades[0];
            for(int i= 0; i<edades.length; i++)
            if (mínimo > edades [i] mínimo =edades[i];
            system.out.print("0 valor mínimo de edades é: "+ mínimo);
            for (int edad: edades)
            System.out.println (edades),




public start void main (String{args){

            }
             Float precio =50F
             Float dinero;
             Float vuelta;

             /**
             * café
             * chocolate
             * té
             * /

             Integrar opción;
             integrar azúcar;

             System.out.println ("opciónes: 1 (café) 2 (chocolate) 3 (té)");

             System.out.println (precio);
             dinero 70F;
             while ((dinero >precio) ("falta dinero");
             dinero = dinero +20F;

             if(dinero >precio)
             colocar vaso ();
             bolean opición_azúcar= true;
             if (opición de azúcar)
             azúcar=3;
             Colocar azúcar (azúcar);
             Colocar producto (opición);
             System.out.println (colocando vaso)









            def buscar_elemento(matriz, valor):
            # Iterar sobre las filas de la matriz
            for i, fila in enumerate(matriz):
            # Iterar sobre los elementos de cada fila
            for j, elemento in enumerate(fila):
            # Si el elemento es igual al valor buscado, devolver la tupla (índice de fila, índice de columna)
            if elemento == valor:
            return (i, j)
            # Si no se encuentra el elemento, devolver -1
            return -1

            matriz = [
            [1, 2, 3],
            [4, 5, 6],
            [7, 8, 9]
            ]

            # Buscar el valor 5
            resultado = buscar_elemento(matriz, 5)
            print(resultado)  # Salida: (1, 1)

            # Buscar el valor 10
            resultado = buscar_elemento(matriz, 10)
            print(resultado)






            import bisect  # Importa el módulo bisect para trabajar con búsqueda binaria

            class TablaOrdenada:
            def __init__(self):
            self.tabla = []

            # Búsqueda de un elemento en la tabla ordenada
            def buscar(self, valor):
            # Utilizamos bisect.bisect_left para encontrar la posición donde estaría el valor
            pos = bisect.bisect_left(self.tabla, valor)
            if pos < len(self.tabla) and self.tabla[pos] == valor:
            return pos  # El valor fue encontrado, retornamos su posición
            return -1  # El valor no fue encontrado

            # Inserción de un elemento en la tabla de forma ordenada
            def insertar(self, valor):
            # Utilizamos bisect.bisect_left para encontrar la posición de inserción
            pos = bisect.bisect_left(self.tabla, valor)
            self.tabla.insert(pos, valor)  # Insertamos el valor en la posición encontrada







            # Método para mostrar la tabla ordenada
            def mostrar(self):
            return self.tabla

            tabla = TablaOrdenada()

            # Insertamos algunos valores
            tabla.insertar(10)
            tabla.insertar(5)
            tabla.insertar(15)
            tabla.insertar(7)

            # Mostramos la tabla ordenada
            print("Tabla ordenada:", tabla.mostrar())

            # Buscamos un valor
            valor = 7
            pos = tabla.buscar(valor)
            if pos != -1:
            print(f"El valor {valor} se encuentra en la posición {pos}.")
            else:
            print(f"El valor {valor} no se encuentra en la tabla.")}





            def dividir_lista_en_dos(lista):
            # Calcular el índice de la mitad de la lista
            mitad = len(lista) // 2

            # Dividir la lista en dos partes
            primera_mitad = lista[:mitad]
            segunda_mitad = lista[mitad:]

            return primera_mitad, segunda_mitad

            mi_lista = [1, 2, 3, 4, 5, 6, 7, 8]
            mitad1, mitad2 = dividir_lista_en_dos(mi_lista)

            print("Primera mitad:", mitad1)
            print("Segunda mitad:", mitad2)





             # Crear un array llamado "numeros" con 6 números aleatorios en el rango de 1 a 50
             numeros = [random.randint(1, 50) for _ in range(6)]

             # Visualizar el array original
             print("Array orixinal:", numeros)
             # Visualizar el array al revés
             print("Array ao revés:", numeros[::-1])
             Array original : [12, 45, 7, 23, 36, 50]
             Array ao revés: [50, 36, 23, 7, 45, 12]




             # Generar notas aleatorias entre 0 y 10 para 30 alumnos
             notas = [random.randint(0, 10) for _ in range(30)]

             # Calcular el número de aprobados y suspensos
             aprobados = len([nota for nota in notas if nota >= 5])
             suspensos = len([nota for nota in notas if nota < 5])

             # Calcular la nota media de la clase
             nota_media = sum(notas) / len(notas)

             # Calcular la nota más alta
             nota_maxima = max(notas)

             # Visualizar los resultados
             print("Notas dos alumnos:", notas)
             print("Número de aprobados:", aprobados)
             print("Número de suspensos:", suspensos)
             print("Nota media da clase:", round(nota_media, 2))
             print("Nota máis alta:", nota_maxima)



             # Tabla de correspondencia entre restos y letras
             tabla_letras = "TRWAGMYFPDXBNJZSQVHLCKE"

             # Solicitar el número de DNI al usuario
             dni = int(input("Introduce o número do DNI (sen letra): "))

             # Calcular el resto de dividir el DNI entre 23
             resto = dni % 23

             # Obtener la letra correspondiente
             letra = tabla_letras[resto]

             # Mostrar el resultado
             print(f"O NIF completo é: {dni}{letra}")






             Busca un elemento nunha matriz e devolve o índice da súa posición.
             Se o elemento non está na matriz, devolve -1.

             Parámetros:
             matriz (list): A lista onde buscar o elemento.
             elemento (any): O elemento a buscar.

             Retorno:
             int: O índice do elemento ou -1 se non se atopa.
             """
             try:
             # Usa o método index para atopar o índice do elemento
             return matriz.index(elemento)
             except ValueError:
             # Se o elemento non está, devolve -1
             return -1

             # Exemplo de uso
             matriz = [10, 20, 30, 40, 50]
             elemento = 30
             resultado = buscar_elemento(matriz, elemento)
             print(f"O elemento {elemento} está na posición: {resultado}")

             # Proba cun elemento que non está na lista
             elemento = 60
             resultado = buscar_elemento(matriz, elemento)
             print(f"O elemento {elemento} non está na matriz, devolve: {resultado}")





             copiar_matriz(matriz):
             """
             Crea unha copia dunha matriz pasada como parámetro.

             Parámetros:
             matriz (list): A matriz a copiar.

             Retorno:
             list: Unha nova matriz que é unha copia exacta da orixinal.
             """
             return copy.deepcopy(matriz)

             # Exemplo de uso
             matriz_original = [
             [1, 2, 3],
             [4, 5, 6],
             [7, 8, 9]
             ]

             # Facer a copia
             matriz_copiada = copiar_matriz(matriz_original)

             # Modificar a copia para comprobar que son independentes
             matriz_copiada[0][0] = 99

             print("Matriz orixinal:")
             print(matriz_original)

             print("\nMatriz copiada:")
             print(matriz_copiada)



             import static java.util.Arrays.binarysearch;
             Elimina os valores duplicados dunha táboa unidimensional.

             Parámetros:
             taboa (list): A táboa unidimensional de entrada.

             Retorno:
             list: Unha nova táboa cos valores únicos.
             """
             return list(set(taboa))

             # Exemplo de uso
             taboa_orixinal = [1, 2, 2, 3, 4, 4, 5, 6, 6, 7]
             taboa_sen_duplicados = eliminar_duplicados(taboa_orixinal)

             print("Táboa orixinal:")
             print(taboa_orixinal)

             print("\nTáboa sen duplicados:")
             print(taboa_sen_duplicados)







             public static int encontrarMaximo(int[] array) {
             // Verifica que el array tenga exactamente 5 elementos
             if (array.length != 5) {
             throw new IllegalArgumentException("El array debe tener exactamente 5 elementos.");
             }

             Inicializa el máximo con el primer elemento
             int maximo = array[0];

              Recorre el array para encontrar el máximo
             for (int i = 1; i < array.length; i++) {
             if (array[i] > maximo) {
             maximo = array[i];
             }

             return maximo;
             }
             public static void main(String[] args) {
              Ejemplo de uso
             int[] array = {10, 22, 5, 8, 14};
             int maximo = encontrarMaximo(array);

             System.out.println("El máximo elemento del array es: " + maximo);
             }



              (0,0): "Nave exploradora",
             (1,2): "Nave  combate",
             (3,4): "Nave carga",
             (5,6): "Nave Espacial",

              private static final Map<string > Mapanaves= new Hash Map <> () ;

              static {
             Mapanaves.put ("0,0, "Nave de exploración");
             Mapanaves.put ("1,2", "Nave de combate");
             Mapanaves.put ("3,4", "Nave de carga");
             Mapanaves.put ("5,6", "Nave Estación espacial");

              public start  bolean
              cordenada (int X, int Y){
              string clave= X + ", " + Y;
              if (Mapanaves. containskey (clave))
             }
              string tipo nave = MapaNaves. get (clave);
              system.out.println( "En la cordenada("+X+ ", "+Y+") hay una"+ tiponave
              return true;
             { else }
              system.out.println( no hay ninguna nave en la cordenada("+X+", +Y+" return false;
              public stact void main (string[] args){
              cordenada(1,2; deve inprimir "Nave combate y devolver true)
             cordenada(0,0; deve inprimir "Nave de Exploración y devolver true)
             cordenada(7,8; deve inprimir "que no hay nave y devolver false)




             import java.util.Scanner;

             public class ContarNumeros {

             public static void main(String[] args) {
             // Crear un escáner para entrada do usuario
             Scanner scanner = new Scanner(System.in);

             // Inicializar contadores
             int positivos = 0;
             int negativos = 0;
             int ceros = 0;

             // Solicitar ao usuario que introduza 10 números
             System.out.println("Introduce 10 números enteiros:");

             for (int i = 0; i < 10; i++) {
             System.out.print("Número " + (i + 1) + ": ");
             int numero = scanner.nextInt();

             // Clasificar o número
             if (numero > 0) {
             positivos++;
             } else if (numero < 0) {
             negativos++;
             } else {
             ceros++;
             }
             }

             // Pechar o escáner
             scanner.close();

             // Mostrar os resultados
             System.out.println("\nResultados:");
             System.out.println("Números positivos: " + positivos);
             System.out.println("Números negativos: " + negativos);
             System.out.println("Ceros: " + ceros);
             }
             }




             import java.util.Scanner;

             public class AreaRectangulo {

             public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             double base = 0;
             double altura = 0;

             // Solicitar a base
             do {
             System.out.print("Introduce a base do rectángulo (valor positivo): ");
             base = scanner.nextDouble();
             if (base <= 0) {
             System.out.println("Erro: A base debe ser un valor positivo.");
             }
             } while (base <= 0);

             // Solicitar a altura
             do {
             System.out.print("Introduce a altura do rectángulo (valor positivo): ");
             altura = scanner.nextDouble();
             if (altura <= 0) {
             System.out.println("Erro: A altura debe ser un valor positivo.");
             }
             } while (altura <= 0);

             // Calcular a área
             double area = base * altura;

             // Mostrar o resultado
             System.out.println("A área do rectángulo é: " + area);

             scanner.close();
             }
             }
             Explicación do código






             import java.util.Scanner;

             public class TaboaMultiplicar {

             public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             int numero;

             do {
             // Solicitar un número ao usuario
             System.out.print("Introduce un número para ver a súa táboa de multiplicar (0 para saír): ");
             numero = scanner.nextInt();

             if (numero != 0) {
             // Mostrar a táboa de multiplicar
             System.out.println("Táboa de multiplicar de " + numero + ":");
             for (int i = 1; i <= 10; i++) {
             System.out.println(numero + " x " + i + " = " + (numero * i));
             }
             System.out.println(); // Liña en branco para separar táboas
             }

             } while (numero != 0);

             System.out.println("Saíndo do programa. Grazas!");
             scanner.close();
             }
             }




             import java.util.Scanner;

             public class AnaliseSoldos {

             public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             int traballadoresTotal = 0;
             int gananEntre1000e1750 = 0;
             int gananMenosDe1000 = 0;

             System.out.println("Introduce os soldos dos traballadores (introduce 0 para finalizar):");

             while (true) {
             System.out.print("Soldo do traballador: ");
             double soldo = scanner.nextDouble();

             // Finaliza o programa se se introduce un soldo de 0
             if (soldo == 0) {
             break;
             }

             // Validar que o soldo non sexa negativo
             if (soldo < 0) {
             System.out.println("Erro: O soldo non pode ser negativo. Volve a introducilo.");
             continue;
             }

             // Incrementar o total de traballadores
             traballadoresTotal++;

             // Contar os traballadores segundo os criterios
             if (soldo >= 1000 && soldo <= 1750) {
             gananEntre1000e1750++;
             } else if (soldo < 1000) {
             gananMenosDe1000++;
             }
             }

             // Calcular a porcentaxe de traballadores que ganan menos de 1000 €
             double porcentaxeMenosDe1000 = 0;
             if (traballadoresTotal > 0) {
             porcentaxeMenosDe1000 = (gananMenosDe1000 / (double) traballadoresTotal) * 100;
             }

             // Mostrar os resultados
             System.out.println("\nResultados:");
             System.out.println("Número de traballadores que ganan entre 1000 e 1750 €: " + gananEntre1000e1750);
             System.out.printf("Porcentaxe de traballadores que ganan menos de 1000 €: %.2f%%\n", porcentaxeMenosDe1000);

             scanner.close();
             }
             }






             import java.util.Scanner;

             public class Factorial {

             public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             // Pedir un número ao usuario
             System.out.print("Introduce un número enteiro para calcular o seu factorial: ");
             int numero = scanner.nextInt();

             // Validar que o número é positivo ou cero
             if (numero < 0) {
             System.out.println("Erro: O factorial só se pode calcular para números non negativos.");
             } else {
             // Calcular o factorial
             long factorial = 1;
             for (int i = 1; i <= numero; i++) {
             factorial *= i;
             }

             // Mostrar o resultado
             System.out.println("O factorial de " + numero + " é: " + factorial);
             }

             scanner.close();
             }
             }









             import java.util.Scanner;

             public class TrianguloBaseAltura {

             public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             // Solicitar ao usuario o valor de n
             System.out.print("Introduce a base e altura do triángulo (n): ");
             int n = scanner.nextInt();

             // Validar que o número é positivo
             if (n <= 0) {
             System.out.println("Erro: O número debe ser positivo.");
             } else {
             // Debuxar o triángulo
             for (int i = 1; i <= n; i++) {
             // Espazos antes das estrelas (para centrar o triángulo)
             for (int j = 1; j <= n - i; j++) {
             System.out.print(" ");
             }

             // Estrelas na liña actual
             for (int j = 1; j <= (2 * i - 1); j++) {
             System.out.print("*");
             }

             // Saltar á seguinte liña
             System.out.println();
             }
             }

             scanner.close();
             }
             }







             import java.util.Scanner;

             public class SumaNumeros {

             public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             int suma = 0; // Variable para almacenar a suma
             int contador = 0; // Contador de números introducidos

             System.out.println("Introduce ata 10 números. Se introduces 999, o programa deterase.");

             while (contador < 10) {
             System.out.print("Introduce o número " + (contador + 1) + ": ");
             int numero = scanner.nextInt();

             // Comprobar se o número é 999
             if (numero == 999) {
             System.out.println("Detección de 999: Interrupción da entrada.");
             break;
             }

             // Engadir o número á suma
             suma += numero;
             contador++;
             }

             // Mostrar a suma total
             System.out.println("A suma total dos números introducidos é: " + suma);

             scanner.close();
             }
             }






             import java.util.Random;

             public class ArrayReves {
             public static void main(String[] args) {
             // Crear un array para almacenar 6 números
             int[] numeros = new int[6];

             // Generar números aleatorios y llenar el array
             Random random = new Random();
             for (int i = 0; i < numeros.length; i++) {
             numeros[i] = random.nextInt(50) + 1; // Aleatorios entre 1 y 50
             }

             // Mostrar el array original
             System.out.println("Array original:");
             for (int num : numeros) {
             System.out.print(num + " ");
             }
             System.out.println();

             // Mostrar el array al revés
             System.out.println("Array al revés:");
             for (int i = numeros.length - 1; i >= 0; i--) {
             System.out.print(numeros[i] + " ");
             }
             System.out.println();
             }
             }





             import java.util.Scanner;

             public class NotasClase {
             public static void main(String[] args) {
             // Constantes
             final int NUM_ALUMNOS = 30;
             final int NOTA_APROBADO = 5;

             // Declaración del array
             int[] notas = new int[NUM_ALUMNOS];

             // Scanner para leer las notas
             Scanner scanner = new Scanner(System.in);

             // Cargar las notas en el array
             System.out.println("Introduce las notas de los 30 alumnos:");
             for (int i = 0; i < NUM_ALUMNOS; i++) {
             System.out.print("Nota del alumno " + (i + 1) + ": ");
             notas[i] = scanner.nextInt();
             }

             // Variables para los cálculos
             int aprobados = 0;
             int suspensos = 0;
             int sumaNotas = 0;
             int notaMaxima = Integer.MIN_VALUE;

             // Procesar las notas
             for (int nota : notas) {
             // Contar aprobados y suspensos
             if (nota >= NOTA_APROBADO) {
             aprobados++;
             } else {
             suspensos++;
             }

             // Calcular suma de notas
             sumaNotas += nota;

             // Determinar la nota más alta
             if (nota > notaMaxima) {
             notaMaxima = nota;
             }
             }

             // Calcular la nota media
             double notaMedia = (double) sumaNotas / NUM_ALUMNOS;

             // Resultados
             System.out.println("\nResultados:");
             System.out.println("Número de aprobados: " + aprobados);
             System.out.println("Número de suspensos: " + suspensos);
             System.out.printf("Nota media de la clase: %.2f%n", notaMedia);
             System.out.println("Nota más alta: " + notaMaxima);
             }






             public static void main(String[] args) {
             // Crear un array para almacenar las notas de 30 alumnos
             int[] notas = new int[30];

             // Generar notas aleatorias entre 0 y 10
             Random random = new Random();
             for (int i = 0; i < notas.length; i++) {
             notas[i] = random.nextInt(11); // Genera números entre 0 y 10
             }

             // Variables para los cálculos
             int aprobados = 0;
             int suspensos = 0;
             int sumaNotas = 0;
             int notaMasAlta = 0;

             // Recorrer el array para calcular aprobados, suspensos, suma de notas y nota más alta
             for (int nota : notas) {
             if (nota >= 5) {
             aprobados++;
             } else {
             suspensos++;
             }
             sumaNotas += nota;
             if (nota > notaMasAlta) {
             notaMasAlta = nota;
             }
             }

             // Calcular la nota media
             double notaMedia = (double) sumaNotas / notas.length;

             // Visualizar resultados
             System.out.println("Notas de los alumnos:");
             for (int nota : notas) {
             System.out.print(nota + " ");
             }
             System.out.println();
             System.out.println("Número de aprobados: " + aprobados);
             System.out.println("Número de suspensos: " + suspensos);
             System.out.println("Nota media de la clase: " + notaMedia);
             System.out.println("Nota más alta: " + notaMasAlta);
             }
             }







             import java.util.Arrays;
             import java.util.Scanner;

             public class NotasClaseConNombres {
             public static void main(String[] args) {
             // Constantes
             final int NUM_ALUMNOS = 30;
             final int NOTA_APROBADO = 5;

             // Arrays para nombres y notas
             String[] nombres = new String[NUM_ALUMNOS];
             int[] notas = new int[NUM_ALUMNOS];

             // Scanner para leer los datos
             Scanner scanner = new Scanner(System.in);

             // Cargar los nombres y las notas en los arrays
             System.out.println("Introduce los nombres y notas de los alumnos:");
             for (int i = 0; i < NUM_ALUMNOS; i++) {
             System.out.print("Nombre del alumno " + (i + 1) + ": ");
             nombres[i] = scanner.nextLine();
             System.out.print("Nota de " + nombres[i] + ": ");
             notas[i] = scanner.nextInt();
             scanner.nextLine(); // Consumir el salto de línea
             }

             // Menú de opciones
             while (true) {
             System.out.println("\nMenú:");
             System.out.println("1. Ver la nota de un alumno específico");
             System.out.println("2. Ver la lista de alumnos aprobados");
             System.out.println("3. Ver la lista de alumnos ordenada por nota (ascendente)");
             System.out.println("4. Salir");
             System.out.print("Elige una opción: ");
             int opcion = scanner.nextInt();
             scanner.nextLine(); // Consumir el salto de línea

             switch (opcion) {
             case 1:
             // Ver la nota de un alumno específico
             System.out.print("Introduce el nombre del alumno: ");
             String nombreAlumno = scanner.nextLine();
             boolean encontrado = false;
             for (int i = 0; i < NUM_ALUMNOS; i++) {
             if (nombres[i].equalsIgnoreCase(nombreAlumno)) {
             System.out.println("La nota de " + nombres[i] + " es: " + notas[i]);
             encontrado = true;
             break;
             }
             }
             if (!encontrado) {
             System.out.println("Alumno no encontrado.");
             }
             break;

             case 2:
             // Ver la lista de alumnos aprobados
             System.out.println("Lista de alumnos aprobados:");
             for (int i = 0; i < NUM_ALUMNOS; i++) {
             if (notas[i] >= NOTA_APROBADO) {
             System.out.println(nombres[i] + " - Nota: " + notas[i]);
             }
             }
             break;

             case 3:
             // Ver la lista de alumnos ordenada por nota
             System.out.println("Lista de alumnos ordenada por nota:");
             int[] notasCopia = Arrays.copyOf(notas, NUM_ALUMNOS);
             String[] nombresCopia = Arrays.copyOf(nombres, NUM_ALUMNOS);

             // Ordenar las notas y nombres asociados (método burbuja modificado)
             for (int i = 0; i < NUM_ALUMNOS - 1; i++) {
             for (int j = 0; j < NUM_ALUMNOS - i - 1; j++) {
             if (notasCopia[j] > notasCopia[j + 1]) {
             // Intercambiar notas
             int tempNota = notasCopia[j];
             notasCopia[j] = notasCopia[j + 1];
             notasCopia[j + 1] = tempNota;

             // Intercambiar nombres
             String tempNombre = nombresCopia[j];
             nombresCopia[j] = nombresCopia[j + 1];
             nombresCopia[j + 1] = tempNombre;
             }
             }
             }

             // Mostrar lista ordenada
             for (int i = 0; i < NUM_ALUMNOS; i++) {
             System.out.println(nombresCopia[i] + " - Nota: " + notasCopia[i]);
             }
             break;

             case 4:
             // Salir del programa
             System.out.println("Saliendo del programa...");
             return;

             default:
             System.out.println("Opción no válida. Intenta de nuevo.");
             break;
             }
             }
             }
             }





             import java.util.Scanner;

             public class CalcularNIF {
             public static void main(String[] args) {
             // Tabla de letras del NIF asociada al resto de la división
             char[] tablaLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
             'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

             // Scanner para leer el DNI
             Scanner scanner = new Scanner(System.in);

             // Leer el número del DNI
             System.out.print("Introduce el número del DNI (sin letra): ");
             int dni = scanner.nextInt();

             // Calcular el resto de la división entre 23
             int resto = dni % 23;

             // Obtener la letra correspondiente
             char letraNIF = tablaLetras[resto];

             // Mostrar el resultado
             System.out.println("El NIF completo es: " + dni + letraNIF);
             }






             public class BuscarElementoEnMatriz {

             // Función genérica para buscar un elemento en una matriz
             public static <T> int buscarElemento(T[] matriz, T valor) {
             for (int i = 0; i < matriz.length; i++) {
             if (matriz[i].equals(valor)) { // Compara elementos
             return i; // Devuelve el índice si encuentra el elemento
             }
             }
             return -1; // Devuelve -1 si no se encuentra
             }

             public static void main(String[] args) {
             // Ejemplo 1: Buscar en una matriz de enteros
             Integer[] numeros = {10, 20, 30, 40, 50};
             int indice1 = buscarElemento(numeros, 30);
             System.out.println("Índice de 30 en numeros: " + indice1);

             // Ejemplo 2: Buscar en una matriz de Strings
             String[] nombres = {"Ana", "Luis", "Carlos", "María"};
             int indice2 = buscarElemento(nombres, "Carlos");
             System.out.println("Índice de 'Carlos' en nombres: " + indice2);

             // Ejemplo 3: Elemento no encontrado
             int indice3 = buscarElemento(nombres, "Pedro");
             System.out.println("Índice de 'Pedro' en nombres: " + indice3);
             }
             }







             import java.util.Comparator;

             public class BuscarElementoBinario {

             // Función genérica para búsqueda binaria
             public static <T> int buscarElementoBinario(T[] matriz, T valor, Comparator<T> comparator) {
             int inicio = 0;
             int fin = matriz.length - 1;

             while (inicio <= fin) {
             int medio = (inicio + fin) / 2; // Calcular el índice medio

             // Comparar el valor en la posición "medio" con el valor buscado
             int comparacion = comparator.compare(matriz[medio], valor);

             if (comparacion == 0) {
             return medio; // El valor se encontró
             } else if (comparacion < 0) {
             inicio = medio + 1; // Buscar en la mitad derecha
             } else {
             fin = medio - 1; // Buscar en la mitad izquierda
             }
             }

             return -1; // El valor no se encontró
             }

             public static void main(String[] args) {
             // Ejemplo 1: Búsqueda binaria en una matriz de enteros
             Integer[] numeros = {10, 20, 30, 40, 50, 60, 70};
             int indice1 = buscarElementoBinario(numeros, 40, Integer::compare);
             System.out.println("Índice de 40 en numeros: " + indice1);

             // Ejemplo 2: Búsqueda binaria en una matriz de Strings
             String[] nombres = {"Ana", "Carlos", "Luis", "María", "Pedro"};
             int indice2 = buscarElementoBinario(nombres, "María", String::compareTo);
             System.out.println("Índice de 'María' en nombres: " + indice2);

             // Ejemplo 3: Elemento no encontrado
             int indice3 = buscarElementoBinario(nombres, "Roberto", String::compareTo);
             System.out.println("Índice de 'Roberto' en nombres: " + indice3);
             }
             }



             public class CopiarMatriz {
             // Función para copiar una matriz unidimensional
             public static <T> T[] copiarMatriz(T[] matriz) {
             // Crear una nueva matriz del mismo tamaño
             T[] copia = matriz.clone();
             return copia; // Devolver la copia
             }

             public static void main(String[] args) {
             // Ejemplo: Copiar una matriz de enteros
             Integer[] numeros = {10, 20, 30, 40, 50};
             Integer[] copiaNumeros = copiarMatriz(numeros);

             // Mostrar la matriz original y la copia
             System.out.println("Matriz original: ");
             for (Integer num : numeros) {
             System.out.print(num + " ");
             }
             System.out.println();

             System.out.println("Copia de la matriz: ");
             for (Integer num : copiaNumeros) {
             System.out.print(num + " ");
             }
             }
             }







             import java.util.ArrayList;

             public class FiltrarPares {

             // Función para filtrar los elementos pares de un vector
             public static int[] obtenerPares(int[] vector) {
             // Crear una lista para almacenar los elementos pares
             ArrayList<Integer> pares = new ArrayList<>();

             // Recorrer el vector y agregar los números pares a la lista
             for (int num : vector) {
             if (num % 2 == 0) {  // Verifica si el número es par
             pares.add(num);
             }
             }

             // Convertir la lista de pares en un array de enteros
             int[] resultado = new int[pares.size()];
             for (int i = 0; i < pares.size(); i++) {
             resultado[i] = pares.get(i);
             }

             return resultado;  // Devolver el array de números pares
             }

             public static void main(String[] args) {
             // Ejemplo de uso de la función
             int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
             int[] pares = obtenerPares(numeros);

             // Mostrar el vector original
             System.out.print("Vector original: ");
             for (int num : numeros) {
             System.out.print(num + " ");
             }
             System.out.println();

             // Mostrar el vector con los números pares
             System.out.print("Elementos pares: ");
             for (int num : pares) {
             System.out.print(num + " ");
             }
             }
             }







             import java.util.HashSet;

             public class EliminarRepetidos {

             // Función que elimina los valores repetidos de la tabla y devuelve una nueva tabla sin duplicados
             public static int[] eliminarRepetidos(int[] tabla) {
             // Usamos un HashSet para almacenar los elementos únicos
             HashSet<Integer> set = new HashSet<>();

             // Añadir todos los elementos del array original al HashSet
             for (int num : tabla) {
             set.add(num);
             }

             // Convertir el HashSet de vuelta a un array
             int[] resultado = new int[set.size()];
             int index = 0;
             for (int num : set) {
             resultado[index++] = num;
             }

             return resultado; // Devolver la nueva tabla sin repetidos
             }

             public static void main(String[] args) {
             // Ejemplo de uso de la función
             int[] tablaOriginal = {1, 2, 2, 3, 4, 4, 5, 5, 6};
             int[] tablaSinRepetidos = eliminarRepetidos(tablaOriginal);

             // Mostrar la tabla original
             System.out.print("Tabla original: ");
             for (int num : tablaOriginal) {
             System.out.print(num + " ");
             }
             System.out.println();

             // Mostrar la tabla sin valores repetidos
             System.out.print("Tabla sin repetidos: ");
             for (int num : tablaSinRepetidos) {
             System.out.print(num + " ");
             }
             }
             }






             import java.util.Arrays;

             public class BorrarElemento {

             // Función que elimina un elemento de una tabla desordenada
             public static int[] borrarElemento(int[] tabla, int valor) {
             // Buscar el índice del valor a eliminar
             int indice = -1;
             for (int i = 0; i < tabla.length; i++) {
             if (tabla[i] == valor) {
             indice = i;
             break;
             }
             }

             // Si el valor no se encuentra, devolver la tabla original
             if (indice == -1) {
             System.out.println("Valor no encontrado en la tabla.");
             return tabla;
             }

             // Mover los elementos a la izquierda para "eliminar" el valor
             for (int i = indice; i < tabla.length - 1; i++) {
             tabla[i] = tabla[i + 1];
             }

             // Rellenar el último valor con un valor "nulo" (por ejemplo, -1 si estamos trabajando con enteros)
             // En un array de enteros no podemos "eliminar" el espacio, pero podemos "vaciarlo".
             tabla[tabla.length - 1] = -1;  // Usamos -1 como valor de "vacío" o "eliminado"

             return tabla;
             }




             public class TablaBidimensional {
             public static void main(String[] args) {
             // Declaramos 't' como una tabla bidimensional
             int[][] t;

             // Creamos la tabla de 5x5
             t = new int[5][5];

             // Llenamos la tabla usando bucles anidados
             for (int i = 0; i < 5; i++) { // 'i' para la primera dimensión
             for (int j = 0; j < 5; j++) { // 'j' para la segunda dimensión
             t[i][j] = 10 * i + j; // Asignación de valores
             }
             }

             // Mostramos la tabla en consola
             System.out.println("Tabla bidimensional:");
             for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
             System.out.print(t[i][j] + "\t"); // Imprime el valor con tabulación
             }
             System.out.println(); // Salto de línea al final de cada fila
             }
             }
             }
             public class TablaBidimensional {
             public static void main(String[] args) {
             // 1. Declarar la matriz bidimensional
             int[][] t = new int[5][5];

             // 2. Llenar la matriz
             for (int i = 0; i < 5; i++) { // Iterar sobre filas






             import java.util.Scanner;

             public class AxendaOrganizador {
             // Definimos os días da semana e horas do día
             private static final String[] DIAS_SEMANA = {"Luns", "Martes", "Mércores", "Xoves", "Venres", "Sábado", "Domingo"};
             private static final String[] HORAS_DIA = {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00"};

             // Táboa bidimensional para almacenar as tarefas
             private static String[][] axenda = new String[DIAS_SEMANA.length][HORAS_DIA.length];

             public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             boolean continuar = true;

             inicializarAxenda();

             while (continuar) {
             System.out.println("\nMenú:");
             System.out.println("1. Engadir tarefa");
             System.out.println("2. Ver axenda");
             System.out.println("3. Sair");
             System.out.print("Selecciona unha opción: ");
             int opcion = scanner.nextInt();
             scanner.nextLine(); // Limpar o buffer

             switch (opcion) {
             case 1:
             engadirTarefa(scanner);
             break;
             case 2:
             verAxenda();
             break;
             case 3:
             continuar = false;
             System.out.println("Saíndo do programa.");
             break;
             default:
             System.out.println("Opción non válida.");
             }
             }

             scanner.close();
             }

             // Inicializa a axenda con cadeas baleiras
             private static void inicializarAxenda() {
             for (int i = 0; i < DIAS_SEMANA.length; i++) {
             for (int j = 0; j < HORAS_DIA.length; j++) {
             axenda[i][j] = "Libre";
             }
             }
             }

             // Engade unha tarefa a un día e hora específicos
             private static void engadirTarefa(Scanner scanner) {
             System.out.println("\nEngadir Tarefa:");
             for (int i = 0; i < DIAS_SEMANA.length; i++) {
             System.out.println(i + 1 + ". " + DIAS_SEMANA[i]);
             }
             System.out.print("Selecciona un día (1-7): ");
             int dia = scanner.nextInt() - 1;

             if (dia < 0 || dia >= DIAS_SEMANA.length) {
             System.out.println("Día non válido.");
             return;
             }

             for (int i = 0; i < HORAS_DIA.length; i++) {
             System.out.println(i + 1 + ". " + HORAS_DIA[i]);
             }
             System.out.print("Selecciona unha hora (1-10): ");
             int hora = scanner.nextInt() - 1;

             if (hora < 0 || hora >= HORAS_DIA.length) {
             System.out.println("Hora non válida.");
             return;
             }

             scanner.nextLine(); // Limpar o buffer
             System.out.print("Introduce a tarefa: ");
             String tarefa = scanner.nextLine();

             axenda[dia][hora] = tarefa;
             System.out.println("Tarefa engadida con éxito.");
             }

             // Mostra a axenda completa
             private static void verAxenda() {
             System.out.println("\nAxenda:");
             System.out.print("Hora/Día");
             for (String dia : DIAS_SEMANA) {
             System.out.printf("%15s", dia);
             }
             System.out.println();

             for (int i = 0; i < HORAS_DIA.length; i++) {
             System.out.printf("%-10s", HORAS_DIA[i]);
             for (int j = 0; j < DIAS_SEMANA.length; j++) {
             System.out.printf("%15s", axenda[j][i]);
             }
             System.out.println();
             }
             }




             import java.util.Random;

             public class AxendaActividades {
             // Días da semana e horas do día
             private static final String[] DIAS_SEMANA = {"Luns", "Martes", "Mércores", "Xoves", "Venres", "Sábado", "Domingo"};
             private static final String[] HORAS_DIA = {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00"};

             // Lista de actividades
             private static final String[] ACTIVIDADES = {"Matemáticas", "Historia", "Deporte", "Compra", "Piscina", "Libre"};

             // Táboa bidimensional para a axenda
             private static String[][] axenda = new String[DIAS_SEMANA.length][HORAS_DIA.length];

             public static void main(String[] args) {
             inicializarAxenda();
             mostrarAxenda();
             }

             // Inicializa a axenda con actividades aleatorias
             private static void inicializarAxenda() {
             Random random = new Random();

             for (int i = 0; i < DIAS_SEMANA.length; i++) {
             for (int j = 0; j < HORAS_DIA.length; j++) {
             // Engade unha actividade aleatoria da lista
             axenda[i][j] = ACTIVIDADES[random.nextInt(ACTIVIDADES.length)];
             }
             }
             }

             // Mostra a axenda completa
             private static void mostrarAxenda() {
             System.out.println("\nAxenda con Actividades:");
             System.out.print("Hora/Día");
             for (String dia : DIAS_SEMANA) {
             System.out.printf("%15s", dia);
             }
             System.out.println();

             for (int i = 0; i < HORAS_DIA.length; i++) {
             System.out.printf("%-10s", HORAS_DIA[i]);
             for (int j = 0; j < DIAS_SEMANA.length; j++) {
             System.out.printf("%15s", axenda[j][i]);
             }
             System.out.println();
             }
             }


             import java.util.Random;

             public class HorarioInicial {
             // Días da semana e horas do día
             private static final String[] DIAS_SEMANA = {"Luns", "Martes", "Mércores", "Xoves", "Venres", "Sábado", "Domingo"};
             private static final String[] HORAS_DIA = {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00"};

             // Lista de actividades
             private static final String[] ACTIVIDADES = {"Matemáticas", "Historia", "Deporte", "Compra", "Piscina", "Libre"};

             // Táboa bidimensional para a axenda
             private static String[][] horario = new String[DIAS_SEMANA.length][HORAS_DIA.length];

             public static void main(String[] args) {
             // Inicializar o horario con actividades
             inicializarHorario();

             // Mostrar o horario inicial ao usuario
             mostrarHorarioInicial();
             }

             // Inicializa o horario con actividades aleatorias
             private static void inicializarHorario() {
             Random random = new Random();

             for (int i = 0; i < DIAS_SEMANA.length; i++) {
             for (int j = 0; j < HORAS_DIA.length; j++) {
             // Asignar unha actividade aleatoria
             horario[i][j] = ACTIVIDADES[random.nextInt(ACTIVIDADES.length)];
             }
             }
             }




             // Mostra o horario inicial ao usuario
             private static void mostrarHorarioInicial() {
             System.out.println("\nHorario Inicial:");
             System.out.print("Hora/Día");
             for (String dia : DIAS_SEMANA) {
             System.out.printf("%15s", dia);
             }
             System.out.println();

             for (int i = 0; i < HORAS_DIA.length; i++) {
             System.out.printf("%-10s", HORAS_DIA[i]);
             for (int j = 0; j < DIAS_SEMANA.length; j++) {
             System.out.printf("%15s", horario[j][i]);
             }
             System.out.println();
             }
             }
             }




             import java.util.Scanner;
             import java.util.Random;

             public class HorarioInteractivo {
             // Días da semana e horas do día
             private static final String[] DIAS_SEMANA = {"Luns", "Martes", "Mércores", "Xoves", "Venres", "Sábado", "Domingo"};
             private static final String[] HORAS_DIA = {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00"};

             // Lista de actividades
             private static final String[] ACTIVIDADES = {"Matemáticas", "Historia", "Deporte", "Compra", "Piscina", "Libre"};

             // Táboa bidimensional para o horario
             private static String[][] horario = new String[DIAS_SEMANA.length][HORAS_DIA.length];

             public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             inicializarHorario();
             boolean continuar = true;

             while (continuar) {
             System.out.println("\nMenú:");
             System.out.println("1. Ver horario");
             System.out.println("2. Cambiar unha actividade");
             System.out.println("3. Engadir unha actividade nunha posición baleira");
             System.out.println("4. Sair");
             System.out.print("Selecciona unha opción: ");
             int opcion = scanner.nextInt();
             scanner.nextLine(); // Limpar o buffer

             switch (opcion) {
             case 1:
             mostrarHorario();
             break;
             case 2:
             cambiarActividade(scanner);
             break;
             case 3:
             engadirActividade(scanner);
             break;
             case 4:
             continuar = false;
             System.out.println("Saíndo do programa.");
             break;
             default:
             System.out.println("Opción non válida.");
             }
             }

             scanner.close();
             }

             // Inicializa o horario con actividades aleatorias
             private static void inicializarHorario() {
             Random random = new Random();

             for (int i = 0; i < DIAS_SEMANA.length; i++) {
             for (int j = 0; j < HORAS_DIA.length; j++) {
             horario[i][j] = ACTIVIDADES[random.nextInt(ACTIVIDADES.length)];
             }
             }
             }



             

             // Mostra o horario completo
             private static void mostrarHorario() {
             System.out.println("\nHorario:");
             System.out.print("Hora/Día");
             for (String dia : DIAS_SEMANA) {
             System.out.printf("%15s", dia);
             }
             System.out.println();

             for (int i = 0; i < HORAS_DIA.length; i++) {
             System.out.printf("%-10s", HORAS_DIA[i]);
             for (int j = 0; j < DIAS_SEMANA.length; j++) {
             System.out.printf("%15s", horario[j][i]);
             }
             System.out.println();
             }
             }

             // Permite cambiar unha actividade
             private static void cambiarActividade(Scanner scanner) {
             System.out.println("\nCambiar unha actividade:");
             int dia = seleccionarDia(scanner);
             int hora = seleccionarHora(scanner);

             System.out.println("Actividade actual: " + horario[dia][hora]);
             System.out.print("Introduce a nova actividade: ");
             String novaActividade = scanner.nextLine();

             horario[dia][hora] = novaActividade;
             System.out.println("Actividade actualizada con éxito.");
             }

             // Permite engadir unha actividade nunha posición baleira
             private static void engadirActividade(Scanner scanner) {
             System.out.println("\nEngadir unha actividade nunha posición baleira:");
             int dia = seleccionarDia(scanner);
             int hora = seleccionarHora(scanner);

             if (!"Libre".equals(horario[dia][hora])) {
             System.out.println("A posición seleccionada xa está ocupada. Por favor selecciona outra.");
             } else {
             System.out.print("Introduce a actividade a engadir: ");
             String actividade = scanner.nextLine();
             horario[dia][hora] = actividade;
             System.out.println("Actividade engadida con éxito.");
             }
             }

             // Permite seleccionar un día
             private static int seleccionarDia(Scanner scanner) {
             for (int i = 0; i < DIAS_SEMANA.length; i++) {
             System.out.println(i + 1 + ". " + DIAS_SEMANA[i]);
             }
             System.out.print("Selecciona un día (1-7): ");
             int dia = scanner.nextInt() - 1;

             if (dia < 0 || dia >= DIAS_SEMANA.length) {
             System.out.println("Día non válido. Selecciona de novo.");
             return seleccionarDia(scanner);
             }
             return dia;
             }

             // Permite seleccionar unha hora
             private static int seleccionarHora(Scanner scanner) {
             for (int i = 0; i < HORAS_DIA.length; i++) {
             System.out.println(i + 1 + ". " + HORAS_DIA[i]);
             }
             System.out.print("Selecciona unha hora (1-10): ");
             int hora = scanner.nextInt() - 1;

             if (hora < 0 || hora >= HORAS_DIA.length) {
             System.out.println("Hora non válida. Selecciona de novo.");
             return seleccionarHora(scanner);
             }
             return hora;
             }
             }





             import java.util.Scanner;

             public class HotelManager {
             private static final int FILAS = 4; // Número de pisos
             private static final int COLUMNAS = 6; // Habitaciones por piso
             private static String[][] hotel = new String[FILAS][COLUMNAS];

             public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             int opcion;

             // Inicializar todas las habitaciones como vacías
             for (int i = 0; i < FILAS; i++) {
             for (int j = 0; j < COLUMNAS; j++) {
             hotel[i][j] = null; // null indica que está vacía
             }
             }

             do {
             // Menú principal
             System.out.println("\n--- Gestión del Hotel ---");
             System.out.println("1. Registrar usuario");
             System.out.println("2. Dejar habitación");
             System.out.println("3. Ver habitaciones vacías");
             System.out.println("4. Salir");
             System.out.print("Seleccione una opción: ");
             opcion = scanner.nextInt();
             scanner.nextLine(); // Consumir el salto de línea

             switch (opcion) {
             case 1:
             registrarUsuario(scanner);
             break;
             case 2:
             dejarHabitacion(scanner);
             break;
             case 3:
             mostrarHabitacionesVacias();
             break;
             case 4:
             System.out.println("Saliendo del programa...");
             break;
             default:
             System.out.println("Opción inválida. Intente de nuevo.");
             }
             } while (opcion != 4);

             scanner.close();
             }

             // Registrar un usuario en una habitación específica
             private static void registrarUsuario(Scanner scanner) {
             System.out.print("Ingrese el nombre del usuario: ");
             String nombre = scanner.nextLine();
             System.out.print("Ingrese el número de piso (1 a 4): ");
             int piso = scanner.nextInt() - 1;
             System.out.print("Ingrese el número de habitación (1 a 6): ");
             int habitacion = scanner.nextInt() - 1;

             if (piso < 0 || piso >= FILAS || habitacion < 0 || habitacion >= COLUMNAS) {
             System.out.println("Número de piso o habitación inválido.");
             } else if (hotel[piso][habitacion] != null) {
             System.out.println("La habitación ya está ocupada.");
             } else {
             hotel[piso][habitacion] = nombre;
             System.out.println("Usuario registrado exitosamente en la habitación " + (habitacion + 1) + " del piso " + (piso + 1) + ".");
             }
             }

             // Dejar una habitación (liberarla)
             private static void dejarHabitacion(Scanner scanner) {
             System.out.print("Ingrese el número de piso (1 a 4): ");
             int piso = scanner.nextInt() - 1;
             System.out.print("Ingrese el número de habitación (1 a 6): ");
             int habitacion = scanner.nextInt() - 1;

             if (piso < 0 || piso >= FILAS || habitacion < 0 || habitacion >= COLUMNAS) {
             System.out.println("Número de piso o habitación inválido.");
             } else if (hotel[piso][habitacion] == null) {
             System.out.println("La habitación ya está vacía.");
             } else {
             hotel[piso][habitacion] = null;
             System.out.println("La habitación " + (habitacion + 1) + " del piso " + (piso + 1) + " ahora está vacía.");
             }
             }

             // Mostrar todas las habitaciones vacías
             private static void mostrarHabitacionesVacias() {
             System.out.println("\n--- Habitaciones Vacías ---");
             boolean hayVacias = false;
             for (int i = 0; i < FILAS; i++) {
             for (int j = 0; j < COLUMNAS; j++) {
             if (hotel[i][j] == null) {
             System.out.println("Piso " + (i + 1) + ", Habitación " + (j + 1) + ": Vacía");
             hayVacias = true;
             }
             }
             }
             if (!hayVacias) {
             System.out.println("No hay habitaciones vacías.");
             }
             }
             }







        public static void mostrarsocios (string[]) {
       for (string socios){
       if (socios = null) sYstenn.out.print (socios);
       else systenn.out.println ("Baleiro");





       }
       }
       }
