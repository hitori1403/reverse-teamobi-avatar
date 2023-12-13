import java.util.Vector;

final class gm implements gq {
   final fd b;
   private final String c;
   private final String[] d;
   private final int e;
   private final byte f;
   private final byte[] g;

   gm(fd var1, String var2, String[] var3, int var4, byte var5, byte[] var6) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
   }

   public final void b() {
      Vector var1 = new Vector();
      if (!fd.b(this.b) && this.c.equals(fd.J)) {
         var1.addElement(new ag(hq.g, 50));
      }

      for(int var2 = 0; var2 < this.d.length; ++var2) {
         var1.addElement(new ag(this.d[var2], new gn(this, this.e, this.f, this.g, var2)));
      }

      f1.d().b(var1, 0);
   }
}
