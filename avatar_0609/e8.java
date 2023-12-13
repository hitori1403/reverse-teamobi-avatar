import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class e8 extends ev {
   public static int n;
   public static Image o;
   public static Image p;
   public static Image q;
   public static Image r;
   public static Image s;
   public int t = 0;
   public static int u;
   public static int v;
   public static int w;
   public static int x;
   public static boolean y;
   private static final String[] db;

   static {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "OTavVx\u0002Wv\rHỬ,p\u008e-cĊÇbtVx\rHỬ,p\u008e-cĊÇbtVx\u0003;Ey";
      int var4 = "OTavVx\u0002Wv\rHỬ,p\u008e-cĊÇbtVx\rHỬ,p\u008e-cĊÇbtVx\u0003;Ey".length();
      char var1 = 6;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = b(g(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     db = var5;
                     n = 20;
                     u = 0;
                     v = 20;
                     y = true;
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

                  var2 = "W|\\A#\u0004W\u001d!3";
                  var4 = "W|\\A#\u0004W\u001d!3".length();
                  var1 = 5;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public void b(int var1, boolean var2) {
      this.t = var1;
   }

   public void b(boolean var1) {
      super.l = var1;
   }

   public void d() {
      k4.e();
      k4.u = this;
      k4.b.setFullScreenMode(true);
   }

   public void b(Graphics var1) {
      if (k4.w == null && k4.y == null && k4.D == null && !e3.p) {
         super.b(var1);
      } else {
         k4.d(var1);
      }

      if (!jp.b().g) {
         String[] var5 = db;
         k4.U.b(var1, var5[5], k4.at.b, k4.at.c, k4.at.d);
      } else if (k4.u == ff.z || k4.u == fc.z) {
         k4.U.b(var1, jp.b().s, k4.at.b, k4.at.c, k4.at.d);
      }

      k4.aa.b(var1);
      k4.b(var1);
      if (k4.m() || k4.u == ft.z) {
         e.c = r != null ? 34 : 15;
         e.b = k4.T;
         if (y) {
            int var2 = e.c;
            k4.b(var1);
            var1.setClip(2, e.c, 90, 20);
            int var4 = 0;
            if (k4.au.j > 125) {
               k4.au.b(80);
               if (k4.au.l >= 0) {
                  var4 = k4.au.l;
               }
            }

            e.b.b(var1, k4.au.h, 2 - var4, e.c, 0);
            var1.setClip(0, 0, k4.o, k4.p);
            var2 += 14;
            c9 var10000 = e.b;
            StringBuffer var10002 = new StringBuffer(String.valueOf(k4.e(GameMidlet.k.A[0])));
            String[] var9 = db;
            var10000.b(var1, var10002.append(var9[4]).toString(), 2, var2, 0);
            var2 += 14;
            e.b.b(var1, k4.e(GameMidlet.k.A[2]) + var9[6] + k4.e(GameMidlet.k.B) + var9[1], 2, var2, 0);
            var2 += 14;
            if (kj.b) {
               k4.T.b(var1, kj.e + kj.d, 2, var2, 0);
            }

            if (j7.c && System.currentTimeMillis() - j7.e < (long)(j7.d * 60 * 1000) && gx.b != 6) {
               var9 = db;
               e.b.b(var1, var9[0] + j7.b((long)(j7.d * 60 * 1000) - (System.currentTimeMillis() - j7.e)), k4.at.b, k4.at.c + 12, k4.at.d);
               return;
            }

            if (gx.b == 6) {
               var10000 = e.b;
               var9 = db;
               var10002 = new StringBuffer(var9[3]);
               AutoController.h();
               var10000.b(var1, var10002.append(AutoController.B % 2 == 0 ? String.valueOf(ce.c) : String.valueOf(ce.d)).toString(), k4.at.b, k4.at.c + 12, k4.at.d);
               return;
            }

            if (gx.b == 58) {
               e.b.b(var1, db[2] + y.e, k4.at.b, k4.at.c + 12, k4.at.d);
            }
         }
      }
   }

   public void a(Graphics var1) {
   }

   public void a(int var1) {
   }

   public void e() {
   }

   public static void f() {
      int var0 = k4.p + k4.ab;
      if (p == null) {
         p = Image.createImage(k4.o, var0);
      }

      Graphics var1 = p.getGraphics();
      if (k4.u == fu.ai) {
         fu.ai.d(var1);
      } else {
         if (k4.u == fv.ai || k4.u == fw.ai) {
            int var2;
            if (k4.o < var0) {
               var2 = var0 / 10;
            } else {
               var2 = k4.o / 10;
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               var1.setColor(6629892);
               var1.drawRect(k4.q - var3 * var2 - 1, var0 / 2 - var3 * var2, var3 * var2 << 1, var3 * var2 << 1);
               var1.setColor(13399567);
               var1.drawRect(k4.q - var3 * var2, var0 / 2 - var3 * var2 + 1, var3 * var2 << 1, var3 * var2 << 1);
            }
         }
      }
   }

   private static char[] g(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'C');
      }

      return var10000;
   }

   private static String b(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 27;
               break;
            case 1:
               var10005 = 61;
               break;
            case 2:
               var10005 = 12;
               break;
            case 3:
               var10005 = 19;
               break;
            case 4:
               var10005 = 108;
               break;
            case 5:
               var10005 = 88;
               break;
            default:
               var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
