import java.util.Vector;

final class d5 implements gq {
   private final ag b;

   d5(ag var1) {
      this.b = var1;
   }

   public final void b() {
      Vector var1;
      (var1 = new Vector()).addElement(this.b);

      for(int var2 = 0; var2 < kq.u.length; ++var2) {
         var1.addElement(new ag(kq.u[var2], new kh(var2)));
      }

      var1.addElement(new ag(hq.cL, new d4()));
      f1.d().b(var1, 0);
   }
}
