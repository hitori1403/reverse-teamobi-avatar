final class ky extends Thread {
   private ej b;
   private final int c;
   private final n d;

   ky(ej var1, int var2, n var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final void run() {
      try {
         for(int var1 = 0; var1 < this.c; ++var1) {
            fj.g();
            new u(this.d).b();
            Thread.sleep(1300L);
         }
      } catch (InterruptedException var2) {
      }
   }
}
