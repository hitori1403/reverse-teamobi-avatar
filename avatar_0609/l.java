final class l implements gq {
   private fj b;
   private final iu c;

   l(fj var1, iu var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void b() {
      boolean var1 = false;
      n var2 = f8.d(this.c.J);

      for(int var3 = 0; var3 < fj.E.size(); ++var3) {
         df var4;
         b5 var5;
         if ((var5 = fj.g((var4 = (df)fj.E.elementAt(var3)).b)).e == var2.d && var5.f == 5 && var4.f > 0) {
            var1 = true;
            this.c.H = false;
            fj.g();
            fj.c(var5.b, this.c.f);
            this.b.a(10, -1);
         }
      }

      if (!var1) {
         k4.c(hq.dn);
         this.b.b(8, -1);
      }
   }
}
