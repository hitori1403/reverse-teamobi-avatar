import java.io.IOException;
import java.util.Vector;

final class b0 implements Runnable {
   final Vector b;
   private jp c;

   public b0(jp var1) {
      this.c = var1;
      this.b = new Vector();
   }

   public final void run() {
      try {
         while(this.c.g) {
            if (this.c.n) {
               while(this.b.size() > 0) {
                  ij var1 = (ij)this.b.elementAt(0);
                  this.b.removeElementAt(0);
                  jp.b(this.c, var1);
               }
            }

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var2) {
            }
         }
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }
}
