import javax.microedition.lcdui.Graphics;

final class a7 extends ag {
   private final s g;
   private final int h;
   private final String i;
   private final String j;

   a7(String var1, gh var2, s var3, String var4, String var5) {
      super(var1, var2);
      this.g = var3;
      this.h = 90;
      this.i = var4;
      this.j = var5;
   }

   public final void b(Graphics var1, int var2, int var3) {
      f5.b(var1, this.g.c, var2, var3 + this.h / 2 - ev.h - ev.j - 5, 33);
      k4.V.b(var1, this.i, var2, var3 + this.h / 2 - ev.h, 2);
      k4.S.b(var1, this.j, var2, var3 + this.h / 2 - ev.h - ev.j, 2);
   }
}
