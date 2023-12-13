import javax.microedition.lcdui.Graphics;

final class bb extends ag {
   private b5 g;

   public bb(String var1, gq var2, b5 var3) {
      super(var1, var2);
      this.g = var3;
   }

   public bb(String var1, int var2, b5 var3) {
      super(var1, 6, var2);
      this.g = var3;
   }

   public final void b(Graphics var1, int var2, int var3) {
      this.g.b(var1, var2, var3);
   }
}
