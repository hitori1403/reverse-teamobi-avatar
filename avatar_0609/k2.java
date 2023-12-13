import java.util.Random;

public final class k2 extends Thread {
   private int a = 0;
   private jh b;
   public static int[] c;
   private static Random d;
   static int e;
   private static final String[] f;

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\r[sW\u0000'G\u0003\u0004[w";
      int var4 = "\r[sW\u0000'G\u0003\u0004[w".length();
      char var1 = 7;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     f = var5;
                     d = new Random();
                     return;
                  }

                  var1 = var2.charAt(var7);
                  break;
               default:
                  var5[var3++] = var12;
                  if ((var7 += var1) < var4) {
                     var1 = var2.charAt(var7);
                     continue label24;
                  }

                  var2 = "\u0004[\u007fw?#V!'jD\u0016Ŝ'Y\u000e\u001aỘ\u001694X\u0007]']%3\u0017\u001fịd\u0016%/Ự\u0007\u001asẗ$";
                  var4 = "\u0004[\u007fw?#V!'jD\u0016Ŝ'Y\u000e\u001aỘ\u001694X\u0007]']%3\u0017\u001fịd\u0016%/Ự\u0007\u001asẗ$".length();
                  var1 = 7;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private int b() {
      int var1 = d.nextInt(this.b.b());
      ji var3;
      ji var10000 = var3 = this.b.c(var1);
      String[] var2 = f;
      e = var10000.d(var2[2]);
      return var3.d(var2[1]);
   }

   public final void run() {
      try {
         String[] var8 = f;
         this.b = fo.C.e(var8[0]);
         int var1 = 0;
         int var2 = this.b();
         long var3 = 0L;

         while(kj.g) {
            Thread.sleep(100L);
            int var6 = 0;

            boolean var10000;
            while(true) {
               if (var6 >= gx.n.size()) {
                  var10000 = false;
                  break;
               }

               ik var7;
               if ((var7 = (ik)gx.n.elementAt(var6)).d == 0 && ((it)var7).f > 2000000000 && kj.n.contains(((it)var7).g.toLowerCase())) {
                  this.a = ((it)var7).f;
                  var10000 = true;
                  break;
               }

               ++var6;
            }

            if (!var10000) {
               if (var1 > e) {
                  var2 = this.b();
                  var1 = 0;
               }

               if (gx.b != -1) {
                  gx.N = 300;
                  gx.O = 100;
                  hv.b().b(var2, var1);
               } else {
                  Thread.sleep(3000L);
                  hx.b().g(9);
               }

               long var5 = System.currentTimeMillis();
               kf.h = true;

               while(kf.h && kj.g) {
                  Thread.sleep(200L);
                  if (System.currentTimeMillis() - var5 > 7000L) {
                     kf.h = false;
                     break;
                  }
               }

               Thread.sleep((long)kj.k);
               var3 = 0L;
               ++var1;
            } else {
               if (kj.p) {
                  hx.b().c(kj.r, -1);
               }

               if (kj.o) {
                  hx.b().k(this.a);
               }

               if (System.currentTimeMillis() - var3 > 30000L) {
                  var3 = System.currentTimeMillis();
                  AutoController.h().c(f[3]);
               }
            }
         }
      } catch (InterruptedException var9) {
         kj.g = false;
      } catch (d var10) {
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '7');
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
               var10005 = 105;
               break;
            case 1:
               var10005 = 58;
               break;
            case 2:
               var10005 = 7;
               break;
            case 3:
               var10005 = 54;
               break;
            case 4:
               var10005 = 77;
               break;
            case 5:
               var10005 = 70;
               break;
            default:
               var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
