public class ArrayPlay  {
   public static void main(String[] args) {
   
   int[] array = new int[6];
   
   Die dice = new Die();
   
   double[] array1 = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
   double[] array2 = new double[10];
   
   
   // Part 2
   for (int i = 0; i < array.length; i++) {
      array[i] = -1;
   }
   for (int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "] = " + array[i]);
   }
   for (int i = 0; i < array.length; i++) {
      array[i] = 0;
   }  
   for (int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "] = " + array[i]);
   }
   
   
   // Part 3
   for (int i = 0; i < 100; i++) {
      int face = dice.roll(); 
      array[face - 1]++;
   }
   for (int i = 0; i < array.length; i++) {
      System.out.println((i + 1) + " was rolled " + array[i] + " times.");
   }
   
   
   // Part 4
   System.out.println("Before Copy:");
   System.out.println("First Array\tSecond Array");
   
   for (int i = 0; i < array1.length; i++) {
      System.out.println(array1[i] + "\t\t" + array2[i]);
   }
   
   for (int i = 0; i < array1.length; i++) {
      array2[i] = array1[i];
   }
   
   System.out.println("\nAfter Copy:");
   System.out.println("First Array\tSecond Array");
   
   for (int i = 0; i < array1.length; i++) {
      System.out.println(array1[i] + "\t\t" + array2[i]);
   }
                    
   array1[3] = 4.5;
   array2[7] = 3.2;
   
   System.out.println("\nAfter Change:");
   System.out.println("First Array\tSecond Array");
   for (int i = 0; i < array1.length; i++) {
      System.out.println(array1[i] + "\t\t" + array2[i]);
   }












}
}