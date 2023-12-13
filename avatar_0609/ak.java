import javax.microedition.lcdui.Graphics;

final class ak extends ag {
   private final short a;

   ak(String var1, ab var2, short var3) {
      super(var1, var2);
      this.a = var3;
   }

   public final void b(Graphics var1, int var2, int var3) {
      f5.b(var1, this.a, var2, var3, 3);
   }
}
