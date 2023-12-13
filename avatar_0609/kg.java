import javax.microedition.lcdui.Image;

public final class kg {
   private Image b;
   private int c;
   private int d;
   private int[][] e;
   private String f;

   public kg(Image var1) {
      this.b = var1;
   }

   public final String b() {
      kg var1 = this;
      this.c = this.b.getWidth();
      this.d = this.b.getHeight();
      int[] var2 = new int[this.c * this.d];
      this.b.getRGB(var2, 0, this.c, 0, 0, this.c, this.d);
      this.e = new int[this.d][this.c];

      for(int var4 = 0; var4 < var1.d; ++var4) {
         for(int var5 = 0; var5 < var1.c; ++var5) {
            int var6 = var2[var4 * var1.c + var5];
            byte var3 = 1;
            if (var6 != -1 && var6 != 0) {
               var3 = 0;
            }

            var1.e[var4][var5] = var3;
         }
      }

      String var8 = "";

      for(int var9 = 0; var9 < var1.d; ++var9) {
         for(int var7 = 0; var7 < var1.c; ++var7) {
            var8 = var8 + var1.e[var9][var7];
         }
      }

      var1.f = var8;
      return this.f;
   }
}
