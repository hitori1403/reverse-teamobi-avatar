import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class ct implements Runnable {
   private final String b;
   final jp c;

   public ct(jp var1, String var2) {
      this.c = var1;
      this.b = var2;
   }

   public final void run() {
      jp.t = false;
      new Thread(new hr(this)).start();
      this.c.h = true;
      this.c.g = true;

      try {
         String var4 = this.b;
         jp.b(this.c, (SocketConnection)Connector.open(var4));
         jp.b(this.c, jp.b(this.c).openDataOutputStream());
         this.c.d = jp.b(this.c).openDataInputStream();
         new Thread(jp.c(this.c)).start();
         this.c.k = new Thread(new et(this.c));
         this.c.k.start();
         this.c.r = System.currentTimeMillis();
         jp.b(this.c, new ij((byte)-27));
         this.c.h = false;
      } catch (Exception var3) {
         try {
            Thread.sleep(500L);
         } catch (InterruptedException var2) {
         }

         if (!jp.t && this.c.e != null) {
            jp var1 = this.c;
            this.c.d();
            this.c.e.b();
         }
      }
   }
}
