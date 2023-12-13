final class k0 extends Thread {
   private en b;
   private final int c;
   private final int d;
   private final int e;

   k0(en var1, int var2, int var3, int var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final void run() {
      fj.b(fj.g(), this.c, this.d, this.e);
   }
}
