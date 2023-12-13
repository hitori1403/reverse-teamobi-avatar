import javax.microedition.lcdui.Graphics;

final class bk extends ag {
   private final byte[] g;
   private final int h;

   bk(String var1, int var2, byte[] var3, int var4) {
      super(var1, 19, var2);
      this.g = var3;
      this.h = var4;
   }

   public final void b(Graphics var1, int var2, int var3) {
      jw var4;
      (var4 = (jw)f5.b((short)0)).a(var1, var2 + 2 + var4.k[0] * ev.a, var3 + 21 + 20 * (ev.a - 1) + var4.l[0] * ev.a, 0);
      (var4 = (jw)f5.b(this.g[this.h])).a(var1, var2 + 2 + var4.k[0] * ev.a, var3 + 21 + 20 * (ev.a - 1) + var4.l[0] * ev.a, 0);
   }
}
