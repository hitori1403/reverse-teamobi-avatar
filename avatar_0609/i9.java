public abstract class i9 implements i8 {
   private byte[] b = new byte[4];
   private int c = 0;
   private long d;

   protected i9() {
   }

   public final void b(byte var1) {
      this.b[this.c++] = var1;
      if (this.c == this.b.length) {
         this.b(this.b, 0);
         this.c = 0;
      }

      ++this.d;
   }

   public final void b(byte[] var1, int var2, int var3) {
      while(this.c != 0 && var3 > 0) {
         this.b(var1[var2]);
         ++var2;
         --var3;
      }

      while(var3 > this.b.length) {
         this.b(var1, var2);
         var2 += this.b.length;
         var3 -= this.b.length;
         this.d += (long)this.b.length;
      }

      while(var3 > 0) {
         this.b(var1[var2]);
         ++var2;
         --var3;
      }
   }

   public final void b() {
      long var1 = this.d << 3;
      this.b((byte)-128);

      while(this.c != 0) {
         this.b((byte)0);
      }

      this.b(var1);
      this.d();
   }

   public void c() {
      this.d = 0L;
      this.c = 0;

      for(int var1 = 0; var1 < this.b.length; ++var1) {
         this.b[var1] = 0;
      }
   }

   protected abstract void b(byte[] var1, int var2);

   protected abstract void b(long var1);

   protected abstract void d();
}
