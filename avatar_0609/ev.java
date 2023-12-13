import javax.microedition.lcdui.Graphics;

public class ev {
   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public ag e;
   public ag f;
   public ag g;
   public static byte h;
   public static byte i;
   public static byte j;
   public static byte k;
   public boolean l;
   public static boolean m;
   private static final String[] cb;

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0000\\3Y\u0000m\f%W3JTg\f%\u0002dW";
      int var4 = "\u0000\\3Y\u0000m\f%W3JTg\f%\u0002dW".length();
      char var1 = 15;
      int var0 = -1;

      while(true) {
         String var10002 = a(f(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            cb = var5;
            a = 1;
            m = false;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public void a() {
   }

   public void a(int var1) {
   }

   public void b(Graphics var1) {
      k4.d(var1);
      k4.aa.b(var1, this.e, this.f, this.g);
   }

   public void a(int var1, int var2) {
   }

   public void b(int var1) {
   }

   public void b(int var1, int var2) {
   }

   private void a(ag var1) {
      if (var1 != null) {
         k4.i = false;
         k4.h = false;
         k4.h();
         this.b(var1);
      }
   }

   public void b() {
   }

   public void c() {
      if (GameMidlet.f != 8 && System.currentTimeMillis() - kr.b > 90000L) {
         hx var10000 = hx.b();
         String[] var2 = cb;
         var10000.b(GameMidlet.k.f, var2[0]);
         kr.b = System.currentTimeMillis();
      }

      AutoController.h();
      if (AutoController.ao || fg.p() && (fg.ah || fg.ag)) {
         long var3 = System.currentTimeMillis();
         AutoController.h();
         if (var3 - AutoController.ap > (long)(fg.p() ? 500 : 3500)) {
            AutoController.h();
            if (AutoController.J != null) {
               AutoController.h();
               AutoController.f(fg.ah ? 100 : 101);
               AutoController.h();
               AutoController.ap = System.currentTimeMillis();
            }
         }
      }

      if (fk.aa && System.currentTimeMillis() - fk.ad > 1200L && !kf.g) {
         kf.g = true;
         hx.b().b(fk.ab, fk.ac);
         fk.ac = b2.b.nextInt(90);
      }

      if (gk.b && System.currentTimeMillis() - gk.d > (long)(gk.f * 1000)) {
         String[] var1 = kq.b(kj.j ? kj.l : gk.c, cb[1]);
         if (k4.u == ft.z) {
            ft.z.b(var1[gk.e]);
         } else {
            hv.b().b(var1[gk.e]);
         }

         if (kj.j) {
            kj.j = false;
            gk.b = false;
         }

         gk.d = System.currentTimeMillis();
         gk.e = ++gk.e % var1.length;
      }

      if (k4.h) {
         if (k4.e(0, k4.as[0].c, k4.o - 1, k4.ab)) {
            switch(k4.aa.e()) {
               case 0:
                  if (k4.ah == 0) {
                     this.a(this.e);
                  }
                  break;
               case 1:
                  if (k4.ah == 0) {
                     this.a(this.f);
                  }
                  break;
               case 2:
                  if (k4.ah == 0) {
                     this.a(this.g);
                  }
            }
         }

         if (k4.m()) {
            if (k4.d(0, 0, 50 * a, 50 * a)) {
               if (!fa.I) {
                  if (cs.A) {
                     m = true;
                     cs.A = false;
                  }
               } else if (m) {
                  cs.A = true;
               }

               fa.I = !fa.I;
               k4.b.sizeChanged(0, 0);
               k4.h = false;
            }

            if (GameMidlet.f == 9 && k4.d(50, 0, 50 * a, 50 * a)) {
               if (!fa.I) {
                  fa.I = true;
                  fa.g().D[4] = 1;
                  k4.b.c();
                  k4.C.w = true;
                  if (k4.u == AutoController.h()) {
                     e3.e().q = AutoController.h();
                     e3.p = true;
                  }
               } else {
                  fa.I = false;
                  fa.g().D[4] = 0;
                  k4.b.c();
                  if (k4.u == AutoController.h()) {
                     e3.p = false;
                  }
               }

               k4.h = false;
            }
         }
      }

      if (k4.d(5)) {
         if (this.f != null) {
            k4.h();
            this.b(this.f);
            return;
         }

         if (k4.w == this) {
            this.b(this.e);
            return;
         }
      } else {
         if (k4.d(12)) {
            this.b(this.e);
            return;
         }

         if (k4.I) {
            if (k4.d(13) || k4.e[13]) {
               k4.e[13] = false;
               this.b(this.g);
               return;
            }
         } else if (k4.d(13)) {
            this.b(this.g);
         }
      }
   }

   public final void b(ag var1) {
      if (var1 != null) {
         if (var1.c != null) {
            var1.c.b();
            return;
         }

         if (var1.e != null) {
            var1.e.b(var1.d);
            return;
         }

         if (e3.p) {
            e3.e().b(var1.d, var1.f);
            return;
         }

         this.b(var1.d, var1.f);
      }
   }

   private static char[] f(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'c');
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
               var10005 = 75;
               break;
            case 1:
               var10005 = 57;
               break;
            case 2:
               var10005 = 86;
               break;
            case 3:
               var10005 = 41;
               break;
            case 4:
               var10005 = 32;
               break;
            case 5:
               var10005 = 14;
               break;
            default:
               var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
