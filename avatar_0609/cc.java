import java.util.Vector;

final class cc implements gq {
   private jn b;
   private final byte c;

   cc(jn var1, byte var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void b() {
      jn var10000 = jn.c;
      String var2 = "" + this.c;
      jn var1 = var10000;
      if (var10000.e == null) {
         var1.e = new Vector();
      }

      int var3 = 0;

      while(true) {
         if (var3 >= var1.e.size()) {
            var5 = -1;
            break;
         }

         if (((String)var1.e.elementAt(var3)).equals(var2)) {
            var5 = var3;
            break;
         }

         ++var3;
      }

      int var4 = var5;
      if (var5 == -1) {
         hx.b().b(this.c);
      } else {
         jn.c.b((byte[])jn.b(this.b).elementAt(var4));
      }

      this.b.f = 1;
   }
}
