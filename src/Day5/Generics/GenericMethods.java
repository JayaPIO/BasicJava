package Day5.Generics;



public class GenericMethods {
    public static <T> void printArray(T[] array){
        for(T element:array){
            System.out.print(element +" ");
            System.out.println();
        }
    }
    public static void main(String[] args){
      GenericMethods obj = new GenericMethods();
      Integer[] arr = {1,2,3,4};
      printArray(arr);
    }
}
