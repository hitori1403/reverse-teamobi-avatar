public final class ki implements Runnable {
   private int b;
   private int c;
   private int d;
   private int e;

   ki(int var1, int var2, int var3, int var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final void run() {
      if (GameMidlet.k.enableAutoFish) {
         fs.R = true;
         if (this.b(13, -1) == 0) {
            fs.R = false;
            k4.c(kq.t[3]);
            return;
         }

         fj.m(2000);
         short var1 = 448;
         switch(fs.aa) {
            case 0:
               var1 = 443;
               break;
            case 1:
               var1 = 447;
         }

         while(fs.R) {
            if (!jp.b().g) {
               fs.R = false;
               k4.c(kq.t[3]);
               return;
            }

            h4.b().b(var1, 1);
            fj.m(30);
         }

         hx.b().b(var1, 1);
         fj.m(2000);
         fs.R = false;
         if (this.b(this.b, this.c) == 0) {
            k4.c(kq.t[3]);
            return;
         }

         fj.m(2500);
         fs.g().c(this.d, this.e);
      }
   }

   private static boolean b(int var0) {
      long var1 = System.currentTimeMillis();
      if (gx.b != 13) {
         while(true) {
            fj.m(100);
            if (gx.b == 13) {
               break;
            }

            if (System.currentTimeMillis() - var1 > 40000L) {
               return false;
            }
         }
      }

      return true;
   }

   private int b(int var1, int var2) {
      long var3 = System.currentTimeMillis();
      long var5 = System.currentTimeMillis() - 6000L;

      while(true) {
         if (System.currentTimeMillis() - var3 >= 40000L) {
            return 0;
         }

         fj.m(100);
         if (!jp.b().g) {
            return 0;
         }

         if (gx.b == var1) {
            AutoController.h();
            if (AutoController.B == var2) {
               break;
            }
         }

         if (gx.b == var1 && var2 == -1) {
            break;
         }

         if (System.currentTimeMillis() - var5 > 7000L && gx.b != -1) {
            hv.b().b(var1, var2);
         } else {
            if (gx.b != -1) {
               continue;
            }

            fj.m(2500);
            fc.g().L = 1;
            hx.b().g(9);
            if (!b(13)) {
               return 0;
            }
         }

         var5 = System.currentTimeMillis();
      }

      return 1;
   }
}
