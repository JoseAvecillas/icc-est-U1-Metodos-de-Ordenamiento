import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] listado = {10,9 , 21, 5, 15, 2, -1, 0};
        // int[] listado = new int[10000];
        // for (int i = 0; i < listado.length;i++){
        //     listado[i] = (int) (Math.random()* 10000) + 1;
        // }
        

        //Instancias
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja();
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();
        MetodoBurbujaMejorado mBB = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        boolean continuar =true;
        while (continuar) {
            System.out.println("Metodos Ordenamiento");
            System.out.println("1-> Burbuja ");
            System.out.println("2-> Seleccion");
            System.out.println("3-> Inserccion");
            System.out.println("4-> Burbuja Mejorado");
            System.out.println("5-> Salir ");




            //INGRESAMOS UN ENTERO INT
            //int metodo = scanner.nextInt();
            int metodo = getPositive(scanner, "Ingrese la opcion: ");
            if (metodo== 5) {
                System.out.println("Adios");
                continuar= false;
                break;
            }

            System.out.println("Desea ver los pasos?(true/false):");
            String conPasos= ejecutarMetodos(scanner, new String[]{"True", "False"}, "Desea ver los?");

    

            String orden = getValidString(scanner, new String[]{"A", "D"}, "Desea ordenar ascendentemente (A) o descendentemente (D)?:");
            boolean ascendente= orden.equalsIgnoreCase("A");

            switch (metodo) {
                case 1:
                    System.out.println("Metodo Burbuja");
                    metodoBurbuja.imprimirArreglo(listado);
                    metodoBurbuja.ordenar(listado, true);
                    System.out.println("Arreglo ordenado en orden descendente:");
                    metodoBurbuja.imprimirArreglo(listado);
                    metodoBurbuja.ordenar(listado, false);
                    System.out.println("Arreglo ordenado en orden ascendente:");
                    metodoBurbuja.imprimirArreglo(listado);
                    break;
                case 2:
                    System.out.println("Metodo Seleccion");
                    System.out.println("Metodo original");
                    System.out.println("(64, 25, 12, 22, 11)");
                    mS.printArray(listado);
                    mS.ordernar(listado, false);
                    System.out.println("Arreglo ordenado de una descendente");
                    mS.printArray(listado);
                    mS.ordernar(listado,  true);
                    System.out.println("Arreglo ordenado de manera ascendente");
                    mS.printArray(listado);
                    System.out.println("SE ACABO");
                    break;
                case 3:
                    System.out.println("Metodo Inserccion");
                    System.out.println("Metodo original");
                    System.out.println("(64, 25, 12, 22, 11)");
                    System.out.println("Metodo Arreglado de las maneras que pedian");
                    mI.printArray(listado);
                    mI.ordenarAsendente(listado, false);
                    mI.printArray(listado);
                    mI.ordenarAsendente(listado, true);
                    mI.printArray(listado);
                    System.out.println("SE ACABO");
                    break;
                case 4:
                    System.out.println("Metodo Burbuja Mejorado");
                    int[] resultados;
                    mBB.printArray(listado);
                    resultados= mBB.ordenarAscendete(listado);
                    mBB.printArray(listado);
                    System.out.println("Comparaciones ->" + resultados[0]);
                    System.out.println("Cambios ->" + resultados[1]);
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }
    public static int getPositive(Scanner scanner, String message){
        int input;
        do {
            System.out.print(message + "");
            input= scanner.nextInt();
            if(input<= 0){
                System.out.println("El numero debe ser positivo. Intente Nuevamente");
            }

        } while(input <= 0);
        return input;
    }

    public static String getValidString(Scanner scanner, String[] posibles, String message){
        String input;
        boolean valido;
        do {
            System.out.print(message + ": ");
            input = scanner.next();
            valido= false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido= true;
                    break;
                }
            }
        } while (!valido);
        return input;
    }
    public static String ejecutarMetodos(Scanner scanner, String[] posibildades, String message) {
        String input;
        boolean valido;
        do {
            System.out.print(message + ": ");
            input = scanner.next();
            valido= false;
            for (String mensajes : posibildades) {
                if (input.equalsIgnoreCase(mensajes)) {
                    valido= true;
                    break;
                }
            }
        } while (!valido);
        return input;
        
    }
}


        //METODO BURBUJA
        // System.out.println("Arreglo original:");
        // metodoBurbuja.imprimirArreglo(listado);
        // metodoBurbuja.ordenar(listado, true);
        // System.out.println("Arreglo ordenado en orden descendente:");
        // metodoBurbuja.imprimirArreglo(listado);
        // metodoBurbuja.ordenar(listado, false);
        // System.out.println("Arreglo ordenado en orden ascendente:");
        // metodoBurbuja.imprimirArreglo(listado);

        //METODO SELECCION
        // System.out.println("METODO SELECCION ");
        // System.out.println("Metodo original");
        // System.out.println("(64, 25, 12, 22, 11)");
        // mS.printArray(listado);
        // mS.ordernar(listado, false);
        // System.out.println("Arreglo ordenado de una descendente");
        // mS.printArray(listado);
        // mS.ordernar(listado,  true);
        // System.out.println("Arreglo ordenado de manera ascendente");
        // mS.printArray(listado);
        // System.out.println("SE ACABO");

        //METODO INSERCION
        // System.out.println("METODO INSERCION");
        // System.out.println("Metodo original");
        // System.out.println("(64, 25, 12, 22, 11)");
        // System.out.println("Metodo Arreglado de las maneras que pedian");
        // mI.printArray(listado);
        // mI.ordenarAsendente(listado, false);
        // mI.printArray(listado);
        // mI.ordenarAsendente(listado, true);
        // mI.printArray(listado);
        // System.out.println("SE ACABO");

        
        //METODO BURBUJAMEJORADO
        // int resultadoComparaciones;
        // mBB.printArray(listado);
        // resultadoComparaciones= mBB.ordenarAscendete(listado);
        // mBB.printArray(listado);
        // System.out.println("Comparaciones ->" + resultadoComparaciones);

        
        // System.out.println("Desea ordenar ascendentemente (A) o descendentemente (D)?:");
        // String orden = scanner.next();