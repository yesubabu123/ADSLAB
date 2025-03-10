import java.util.Arrays;

public class GraphColoring {
   public GraphColoring() {
   }

   public static void greedyColoring(int[][] var0, int var1) {
      int[] var2 = new int[var1];
      Arrays.fill(var2, -1);
      var2[0] = 0;
      boolean[] var3 = new boolean[var1];

      int var4;
      for(var4 = 1; var4 < var1; ++var4) {
         Arrays.fill(var3, true);

         int var5;
         for(var5 = 0; var5 < var1; ++var5) {
            if (var0[var4][var5] == 1 && var2[var5] != -1) {
               var3[var2[var5]] = false;
            }
         }

         for(var5 = 0; var5 < var1 && !var3[var5]; ++var5) {
         }

         var2[var4] = var5;
      }

      System.out.println("Vertex Colors:");

      for(var4 = 0; var4 < var1; ++var4) {
         System.out.println("Vertex " + var4 + " -> Color " + var2[var4]);
      }

   }

   public static void main(String[] var0) {
      int[][] var1 = new int[][]{{0, 1, 1, 0}, {1, 0, 1, 1}, {1, 1, 0, 1}, {0, 1, 1, 0}};
      byte var2 = 4;
      greedyColoring(var1, var2);
   }
}
