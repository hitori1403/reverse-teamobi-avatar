final class kc implements gq {
   private fj b;
   private final iu c;

   kc(fj var1, iu var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void b() {
      boolean var1 = false;

      for(int var2 = 0; var2 < fj.E.size(); ++var2) {
         df var3;
         if ((var3 = (df)fj.E.elementAt(var2)).b == 121) {
            b5 var4 = fj.g(var3.b);
            fj.b(this.b, var4, var3.b, this.c);
            var1 = true;
            break;
         }
      }

      if (!var1) {
         k4.c(hq.dl);
         fj.g().b(8, -1);
      }
   }
}
