import javax.microedition.lcdui.Graphics;

final class bo extends ag {
   private final df g;

   bo(String var1, int var2, df var3) {
      super(var1, 26, var2);
      this.g = var3;
   }

   public final void b(Graphics var1, int var2, int var3) {
      f8.c(this.g.b).b(var1, 7, var2, var3, 3);
   }
}
