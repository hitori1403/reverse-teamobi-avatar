import java.util.Vector;

final class kl implements gq {
   private kj b;

   kl(kj var1) {
      this.b = var1;
   }

   public final void b() {
      Vector var1 = new Vector();

      for(int var2 = 0; kj.h != null && var2 < kj.h.length; ++var2) {
         String[] var3 = kq.b(kj.h[var2], "-");
         var1.addElement(new ag(var3[0], new km(this.b, Integer.parseInt(var3[1]))));
      }

      f1.d().b(var1, 2);
   }
}
