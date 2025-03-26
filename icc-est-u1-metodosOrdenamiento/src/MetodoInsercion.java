public class MetodoInsercion {
    public void ordenarAsendente(int[] arreglo, boolean pasos) {
        int tam = arreglo.length;
        for (int i = 1; i < tam; ++i) {
            int aux = arreglo[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("Paso " + i + ":");
                System.out.println("Valor a insertar: " + aux);
            }

            while (j >= 0 && aux < arreglo[j]) {
                if (pasos) {
                    System.out.println("Moviendo " + arreglo[j] + " a la posición " + (j + 1));
                }
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = aux;

            if (pasos) {
                printArray(arreglo);
                System.out.println();
            }
        }
    }
    public void printArray(int[] arreglo){
        System.out.println(" Arreglo Clase Insercion ");
        // for (int i= 0; i<arreglo.length; i++){
        //     System.out.print(arreglo[i]+ " - ");
        // }
        for (int elemento : arreglo) {
            System.out.print(elemento + ",");
        }
        System.out.println();
}
}


// int n = arreglo.length;
// for (int i = 1; i < n; i++) {
//     int clave = arreglo[i];
//     int j = i - 1;

//     while (j >= 0 && arreglo[j] > clave) {
//         arreglo[j + 1] = arreglo[j];
//         j--;
//     }
//     arreglo[j + 1] = clave;
//      }