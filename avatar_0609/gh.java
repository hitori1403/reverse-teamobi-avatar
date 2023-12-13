final class gh implements gq {
   final fg b;
   private final int c;
   private final String d;

   gh(fg var1, int var2, String var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final void b() {
      fg.b(this.b);
      if (fg.c(this.b) != -1) {
         fg.b(this.b, fg.c(this.b));
         fg.c(this.b, fg.d(this.b));
         GameMidlet.k.a = fg.c(this.b) * 24;
         GameMidlet.k.b = fg.d(this.b) * 24;
         cl.b().b(GameMidlet.k.a * ev.a, GameMidlet.k.b * ev.a);
      }

      fg.H = true;
      fg.N = true;
      fg.d(this.b, this.c);
      this.b.f = new ag(hq.ct, new gg(this, this.c, this.d));
      this.b.e = null;
      this.b.g = null;
   }
}
