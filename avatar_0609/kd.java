public final class kd implements Runnable {
   public static boolean b;
   private static boolean[] c = new boolean[2];
   public static Thread d;
   public static k2 e;
   private static final String a;

   static {
      String var10002 = a(a("F5%Ẓ-8\u0013Ỏ}Łĸ-\u007fQk5ỽKctỐl}#Z68"));
      boolean var10001 = true;
      a = var10002;
   }

   public final void run() {
      try {
         eb.f = false;
         long var1 = System.currentTimeMillis();
         long var3 = 0L;
         Thread.sleep(1000L);

         try {
            k4.ah = 0;
            AutoController.A();
            fa.g().i();
         } catch (Exception var5) {
         }

         kj.g = false;
         kf.h = false;
         b = true;

         while(b) {
            Thread.sleep(1000L);
            if (System.currentTimeMillis() - var1 >= 60000L) {
               if (gx.b != -1) {
                  k4.e(hq.O);
                  fi.g().X = System.currentTimeMillis();
                  fi.g().q();
                  var3 = System.currentTimeMillis();
               }

               while(System.currentTimeMillis() - var3 <= 40000L) {
                  Thread.sleep(1000L);
                  if (k4.u instanceof fc) {
                     Thread.sleep(1000L);
                     if (c[0]) {
                        j7.b().b(true);
                     } else if (c[1]) {
                        kj.g = true;
                        (e = new k2()).setPriority(4);
                        e.start();
                     }

                     b = false;
                     return;
                  }
               }

               var1 = System.currentTimeMillis();
            } else {
               k4.c(a + (20L - (System.currentTimeMillis() - var1) / 1000L));
            }
         }
      } catch (InterruptedException var6) {
      }
   }

   public static void b() {
      try {
         d.interrupt();
      } catch (Exception var1) {
      }

      try {
         e.interrupt();
      } catch (Exception var0) {
      }

      b = false;
      if (j7.c) {
         j7.b().c();
         c[0] = true;
         (d = new Thread(new kd())).start();
      } else {
         if (kj.m && kj.g) {
            c[1] = true;
            kj.g = false;
            (d = new Thread(new kd())).start();
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'q');
      }

      return var10000;
   }

   private static String a(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 5;
               break;
            case 1:
               var10005 = 93;
               break;
            case 2:
               var10005 = 80;
               break;
            case 3:
               var10005 = 59;
               break;
            case 4:
               var10005 = 67;
               break;
            case 5:
               var10005 = 24;
               break;
            default:
               var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
