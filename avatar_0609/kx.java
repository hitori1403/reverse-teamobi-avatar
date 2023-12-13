final class kx extends Thread {
   private eh b;
   private final int c;
   private final n d;

   kx(eh var1, int var2, n var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final void run() {
      try {
         for(int var1 = 0; var1 < this.c; ++var1) {
            fj.g();
            new kb(this.d).b();
            Thread.sleep(1300L);
         }
      } catch (InterruptedException var2) {
      }
   }
}
