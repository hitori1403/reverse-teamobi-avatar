import javax.microedition.lcdui.Graphics;

final class bg extends ag {
   private final int g;

   bg(String var1, int var2, int var3) {
      super(var1, var2);
      this.g = var3;
   }

   public final void b(Graphics var1, int var2, int var3) {
      f1.x.c(this.g / f1.x.d, this.g % f1.x.d, var2, var3, 3, var1);
   }
}
