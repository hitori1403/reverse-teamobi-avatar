import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class g_ {
   public int b;
   public int c;
   public int d;
   public Image e;

   public g_(Image var1, int var2, int var3) {
      this.e = var1;
      this.b = var2;
      this.c = var3;
      this.d = var1.getHeight() / var3;
   }

   public static g_ b(String var0, int var1, int var2) {
      return new g_(bp.b(var0), var1, var2);
   }

   public final void b(int var1, int var2, int var3, int var4, int var5, Graphics var6) {
      if (var1 >= 0 && var1 < this.d) {
         var6.drawRegion(this.e, 0, var1 * this.c, this.b, this.c, var4, var2, var3, var5);
      }
   }

   public final void b(int var1, int var2, int var3, int var4, Graphics var5) {
      var5.drawRegion(this.e, 0, var1 * this.c, this.b, this.c, var4, var2, var3, 0);
   }

   public final void c(int var1, int var2, int var3, int var4, Graphics var5) {
      if (var1 >= 0 && var1 < this.d) {
         var5.drawRegion(this.e, var1 * this.b, var2 * this.c, this.b, this.c, 0, var3, var4, 0);
      }
   }

   public final void c(int var1, int var2, int var3, int var4, int var5, Graphics var6) {
      if (var1 >= 0 && var1 < this.d) {
         var6.drawRegion(this.e, var1 * this.b, var2 * this.c, this.b, this.c, 0, var3, var4, var5);
      }
   }
}
