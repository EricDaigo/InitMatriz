class Main {
  
  public static void main(String[] args) {
    int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
    int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

    System.out.println("Valores do array1:");
    outputArray(array1);

    System.out.println();
    
    System.out.println("Valores do array2:");
    outputArray(array2);
  }

  public static void outputArray(int[][] array){
    for(int lin = 0; lin < array.length; lin++){//O metodo.length captura o comprimento da variavel
      for(int col = 0; col < array[lin].length; col++){
        System.out.printf("%d ", array[lin][col]);
      }
      System.out.println();
    }
  }
  
}