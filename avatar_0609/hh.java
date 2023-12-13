public final class hh {
   int b;
   int c;
   int[] d;
   int[] e;
   byte[] f;
   byte[] g;
   byte[] h;

   public hh(int var1, int var2) {
      this.b = var1;
      this.c = var2;
      this.d = new int[3];
      this.e = new int[3];
      this.f = new byte[3];
      this.g = new byte[3];
      this.h = new byte[3];

      for(int var3 = 0; var3 < 3; ++var3) {
         this.f[var3] = (byte)b2.e(8);
         this.e[var3] = -var3 * 20;
         this.g[var3] = (byte)(b2.e(2) == 0 ? 1 : -1);
         this.h[var3] = 6;
      }
   }
}
