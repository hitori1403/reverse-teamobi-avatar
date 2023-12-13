import javax.microedition.lcdui.Graphics;

final class a1 extends ag {
   private final h_ g;

   a1(h_ var1) {
      super(null, null);
      this.g = var1;
   }

   public final void b(Graphics var1, int var2, int var3) {
      var2 = fb.D / 2 + 7;
      int var4 = (var3 = (fb.E - e8.v - (ev.b << 1)) / 7) / 2 - AutoController.M.getHeight() / 2;
      AutoController.b(var1, hq.dJ[0] + this.g.h, var2, var4, this.g.g);
      int var7;
      AutoController.b(var1, hq.dJ[1], var2, var7 = var4 + var3, this.g.b);
      AutoController.b(var1, hq.dJ[2], var2, var4 = var7 + var3, this.g.c);
      int var9;
      AutoController.b(var1, hq.dJ[3], var2, var9 = var4 + var3, this.g.f);
      AutoController.b(var1, hq.dJ[4], var2, var4 = var9 + var3, this.g.d);
      AutoController.b(var1, hq.dJ[5], var2, var4 + var3, this.g.e);
   }
}
