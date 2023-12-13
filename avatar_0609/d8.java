import java.util.Vector;

final class d8 implements gq {
   final AutoController b;
   private final Vector c;
   private final int d;
   private final int e;

   d8(AutoController var1, Vector var2, int var3, int var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final void b() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < this.c.size(); ++var2) {
         gl var3;
         jv var4;
         if ((var4 = f5.b((var3 = (gl)this.c.elementAt(var2)).b)) != null && var4.e != 30 && var4.e != 40) {
            var1.addElement(var3);
         }
      }

      if (fb.T < var1.size()) {
         gl var5;
         jv var6;
         if (!f5.d((var6 = f5.b((var5 = (gl)var1.elementAt(fb.T)).b)).e) || this.d == 1) {
            k4.b(hq.b1, new d7(this, var6, this.d, var1, this.c, var5, this.e));
         }
      }
   }
}
