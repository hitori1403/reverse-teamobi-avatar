import java.util.Vector;

final class d7 implements gq {
   private d8 b;
   private final jv c;
   private final int d;
   private final Vector e;
   private final Vector f;
   private final gl g;
   private final int h;

   d7(d8 var1, jv var2, int var3, Vector var4, Vector var5, gl var6, int var7) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
      this.h = var7;
   }

   public final void b() {
      hx.b().b(this.c.b, this.d);
      this.e.removeElementAt(fb.T);
      this.f.removeElement(this.g);
      if (this.h == 0) {
         int var1 = fb.L;
         int var2 = fb.T;
         if (e_.g().M) {
            e_.g();
            e_.k();
         } else {
            this.b.b.v();
            fb.L = var1;
            fb.g().l();
            if (var2 >= fb.g().N[var1].size()) {
               var2 = 0;
            }

            fb.T = var2;
            fb.g().o();
            k4.B.b(fb.T);
         }
      } else {
         fg.g().t();
      }
   }
}
