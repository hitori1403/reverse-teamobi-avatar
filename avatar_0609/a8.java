import javax.microedition.lcdui.Graphics;

final class a8 extends ag {
   private final int g;

   a8(String var1, int var2, int var3) {
      super(var1, 17, var2);
      this.g = var3;
   }

   public final void b(Graphics var1, int var2, int var3) {
      gx.d.b(this.g, var2 + 1, var3 + 1, 0, 3, var1);
   }
}
