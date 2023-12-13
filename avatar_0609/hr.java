final class hr implements Runnable {
   private ct b;

   hr(ct var1) {
      this.b = var1;
   }

   public final void run() {
      try {
         Thread.sleep(20000L);
      } catch (InterruptedException var3) {
      }

      if (this.b.c.h) {
         try {
            jp.b(this.b.c).close();
            jp.c(this.b.c).b.removeAllElements();
         } catch (Exception var2) {
         }

         jp.t = true;
         this.b.c.h = false;
         this.b.c.g = false;
         this.b.c.e.b();
      }
   }
}
