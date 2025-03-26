public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] listado = {64, 25, 12, 22, 11};
        // int[] listado = new int[10000];
        // for (int i = 0; i < listado.length;i++){
        //     listado[i] = (int) (Math.random()* 10000) + 1;
        // }
        
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja();
        System.out.println("Arreglo original:");
        metodoBurbuja.imprimirArreglo(listado);
        metodoBurbuja.ordenar(listado, true);
        System.out.println("Arreglo ordenado en orden descendente:");
        metodoBurbuja.imprimirArreglo(listado);
        metodoBurbuja.ordenar(listado, false);
        System.out.println("Arreglo ordenado en orden ascendente:");
        metodoBurbuja.imprimirArreglo(listado);

        MetodoSeleccion mS = new MetodoSeleccion();
        System.out.println("METODO SELECCION ");
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


        MetodoInsercion mI = new MetodoInsercion();
        System.out.println("METODO INSERCION");
        System.out.println("Metodo original");
        System.out.println("(64, 25, 12, 22, 11)");
        System.out.println("Metodo Arreglado de las maneras que pedian");
        mI.printArray(listado);
        mI.ordenarAsendente(listado, false);
        mI.printArray(listado);
        mI.ordenarAsendente(listado, true);
        mI.printArray(listado);
        System.out.println("SE ACABO");
    }
}