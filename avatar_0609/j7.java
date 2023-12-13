import java.util.Calendar;
import java.util.Vector;

public final class j7 implements Runnable {
   private static j7 b;
   public static boolean c;
   public static short d;
   public static long e;
   public static boolean f;
   public static boolean g;
   private static boolean h;
   private static Vector i;
   private Thread j;
   public static boolean k;
   public static boolean l;
   public static boolean m;
   public static boolean n;
   public static boolean o;
   public static long p;
   public static int q;
   public static ji r;
   public long s;
   private static final String[] a;

   static {
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "ČçSPẶe`hlẮQ)v)}jSZè\u007f`čå\nmq\u001a[b<#}v\u0016\tČe\u001d_)|5}$\u0012Hl\u001cÙ}10tö\u001d_)v!qa]\u0016\u0018\":M\u00067/~\":M\u0006)U\tOG<vGT\u0003HA7\fhl\u001c\u0016bx-2l\u001cYg\fxe\u001aTp<2yt\u001cJ}\u0013Če\u001d_)s¡r$\u0005ẕ}1.ið\u001a\u0016'\u0014Če\u001d_)g s$\u001dÌgv`hvỒQ'?\u00032*]\u0015Če\u001d_)g s$\u0003Pû\u007f'<c\u0012Ul?n\u001eČe\u001d_)p5hkSZè\u007f`wm\u001e\u0018jơǡrcS@h\u007f(2*\u0017ČçSPẶe`hlẮQ)v)}jSZè\u007f`čå\u0012mq\u001a[b<\"i}^H{~$ig\u0007KI]E\u0018^?(=zy5dTf\u0006Ka\u001fMo)tZS\u0005pgZ'w<(T2Z)y|5os+\u000b3c\u0018qRt3NO>V[+9pL\u0005D_F\u0011Q}\u0007\u0002re,W]8";
      int var4 = "ČçSPẶe`hlẮQ)v)}jSZè\u007f`čå\nmq\u001a[b<#}v\u0016\tČe\u001d_)|5}$\u0012Hl\u001cÙ}10tö\u001d_)v!qa]\u0016\u0018\":M\u00067/~\":M\u0006)U\tOG<vGT\u0003HA7\fhl\u001c\u0016bx-2l\u001cYg\fxe\u001aTp<2yt\u001cJ}\u0013Če\u001d_)s¡r$\u0005ẕ}1.ið\u001a\u0016'\u0014Če\u001d_)g s$\u001dÌgv`hvỒQ'?\u00032*]\u0015Če\u001d_)g s$\u0003Pû\u007f'<c\u0012Ul?n\u001eČe\u001d_)p5hkSZè\u007f`wm\u001e\u0018jơǡrcS@h\u007f(2*\u0017ČçSPẶe`hlẮQ)v)}jSZè\u007f`čå\u0012mq\u001a[b<\"i}^H{~$ig\u0007KI]E\u0018^?(=zy5dTf\u0006Ka\u001fMo)tZS\u0005pgZ'w<(T2Z)y|5os+\u000b3c\u0018qRt3NO>V[+9pL\u0005D_F\u0011Q}\u0007\u0002re,W]8"
         .length();
      char var1 = 23;
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
                     a = var5;
                     d = 30;
                     f = true;
                     g = true;
                     h = true;
                     i = new Vector();
                     k = false;
                     l = false;
                     m = true;
                     n = true;
                     o = false;
                     q = 30;
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

                  var2 = "]E6u0_\tQt%\u000eoY\u0006Kb\u000erxG+ O\u001b\rCX\raN8PeO\u001cIO\u001dČe\u001d_)p5hkSZè\u007f`rcẾ[)y5eễ\u001d\u0018kün2";
                  var4 = "]E6u0_\tQt%\u000eoY\u0006Kb\u000erxG+ O\u001b\rCX\raN8PeO\u001cIO\u001dČe\u001d_)p5hkSZè\u007f`rcẾ[)y5eễ\u001d\u0018kün2".length();
                  var1 = '%';
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static j7 b() {
      if (b == null) {
         b = new j7();
      }

      return b;
   }

   public final void b(boolean var1) {
      c = var1;
      if (var1) {
         e = 0L;
         this.j = new Thread(this);
         this.j.start();
      } else {
         this.c();

         try {
            kd.d.interrupt();
         } catch (Exception var2) {
         }
      }
   }

   public final void c() {
      try {
         this.j.interrupt();
      } catch (RuntimeException var1) {
      }
   }

   public static boolean d() {
      return System.currentTimeMillis() - e > (long)(d * 60 * 1000) && !eb.f;
   }

   public final void run() {
      long var1 = 0L;
      long var3 = 0L;
      int var5 = 0;
      e = 0L;
      o = false;
      eb.f = false;
      fj var9 = fj.g();
      Vector var10;
      Vector var10000 = var10 = new Vector();
      String[] var20 = a;
      var10000.addElement(e_.b(e_.d(e_.e(var20[15]))).concat(fj.G()));
      var10.addElement(e_.b(e_.d(e_.e(var20[14]))));
      Vector var6 = var10;

      try {
         for(; c; Thread.sleep(100L)) {
            if (d()) {
               if (n) {
                  if (k && GameMidlet.f == 3) {
                     var20 = a;
                     k4.d(var20[3]);
                     gx.b = -1;
                     fu.u().b(0);
                     hx.b().g(9);
                     fp.R = 1;
                     k4.B.w = false;
                     hx.b().g(10);
                     if (!b(25)) {
                        g();
                     }

                     Thread.sleep(2400L);
                  }

                  if (gx.b != -1 && gx.b != 24) {
                     hx.b().g(8);
                     if (!b(-1)) {
                        g();
                     }

                     Thread.sleep(2000L);
                  }

                  if (gx.b == -1) {
                     fc.g().L = 7;
                     hx.b().g(10);
                     var20 = a;
                     k4.d(var20[8]);
                     if (!b(25)) {
                        g();
                     }

                     Thread.sleep(3000L);
                  }

                  if (gx.b == 25) {
                     try {
                        if (fj.C != null && fj.A == GameMidlet.k.f) {
                           fj.g().b(fj.A, fj.C, fj.J, fj.aR, fj.aS, fj.aX, fj.aW);
                        } else {
                           k4.i();
                           fj.g().a(GameMidlet.k.f, true);
                        }
                     } catch (Exception var21) {
                     }

                     if (!b(24)) {
                        g();
                     }

                     Thread.sleep(3000L);
                  }

                  if (gx.b == 24) {
                     var20 = a;
                     jh var7 = r.e(var20[13]);
                     hx.b().b(Integer.parseInt(var7.d(0)), (byte)Integer.parseInt(var7.d(1)), Integer.parseInt(var7.d(2)));
                     var7 = r.e(var20[1]);
                     hv.b().c(Integer.parseInt(var7.d(0)), Integer.parseInt(var7.d(1)), Integer.parseInt(var7.d(2)));
                     h2.b().c(fj.A, 0, 100);
                     fj.g().a(12, -1);
                     Thread.sleep(1000L);

                     for(int var33 = 0; var33 < fj.C.size(); ++var33) {
                        im var14;
                        (var14 = (im)fj.C.elementAt(var33)).q = false;
                        if (var14.v == 5 && var14.j != -1) {
                           int var15 = var14.j;
                           kf.c = true;
                           h2.b().b(fj.A, var33);

                           for(long var16 = System.currentTimeMillis(); kf.c; Thread.sleep(100L)) {
                              if (System.currentTimeMillis() - var16 > 20000L) {
                                 kf.c = false;
                                 g();
                              }
                           }

                           fj.g().b(var14, 1);
                           var14.v = 0;
                           gx.e[var14.i * gx.f + var14.h] = var14.t;
                           if (var14.j != -1) {
                              h2.b().b(fj.A, var33, -1);
                           }

                           var14.j = -1;
                           fj.g();
                           if (fj.b((short)var15, fj.C.size())) {
                              kf.d = true;
                              h2.b().b(fj.A, var33, (short)var15);

                              for(long var18 = System.currentTimeMillis(); kf.d; Thread.sleep(100L)) {
                                 if (System.currentTimeMillis() - var18 > 20000L) {
                                    kf.d = false;
                                    g();
                                 }
                              }
                           }
                        }
                     }

                     label282:
                     if (fj.aX != 0) {
                        fj.g().D();
                        short var34 = fj.aX;
                        if (fj.aW == 0) {
                           fj.g().b(2);
                           Thread.sleep(1000L);
                           g3 var38 = f8.c(var34);

                           for(int var42 = 0; var42 < var38.f.length; ++var42) {
                              df var43;
                              if (var38.f[var42] < 100) {
                                 var43 = fj.l(var38.f[var42]);
                              } else {
                                 var43 = fj.k(var38.f[var42]);
                              }

                              if (var43 == null || var43.f < var38.g[var42]) {
                                 break label282;
                              }
                           }

                           h2.b().e(var34);
                        }

                        fb.g().e();
                     }

                     fj.g();
                     fj.o();
                     Vector var8 = new Vector();

                     for(int var26 = 0; var26 < fj.J.size(); ++var26) {
                        iu var30;
                        n var35 = f8.d((var30 = (iu)fj.J.elementAt(var26)).J);
                        if (10080 - var30.F < 360 + d && (var30.J == 50 || var30.J == 56)) {
                           var8.addElement(var30);
                        }

                        if ((var30.J == 52 || var30.J == 54 || var30.J == 59) && var30.F > var35.e * 60) {
                           var8.addElement(var30);
                        }
                     }

                     for(int var27 = 0; var27 < var8.size(); ++var27) {
                        iu var31 = (iu)var8.elementAt(var27);
                        var20 = a;
                        k4.d(var20[7]);
                        kf.e = true;
                        h2.b().b(fj.A, (byte)var31.f);

                        for(long var39 = System.currentTimeMillis(); kf.e; Thread.sleep(100L)) {
                           if (System.currentTimeMillis() - var39 > 20000L) {
                              kf.e = false;
                              g();
                           }
                        }

                        Thread.sleep(1000L);
                     }

                     Thread.sleep(1000L);
                     fj.g().B();
                     if (!b(25)) {
                        g();
                     }

                     Thread.sleep(2000L);

                     for(int var28 = 0; var28 < var8.size(); ++var28) {
                        iu var32 = (iu)var8.elementAt(var28);
                        byte var36 = var32.J;
                        kf.f = true;
                        var20 = a;
                        k4.d(var20[2] + f8.d(var36).m + var20[9]);
                        fj.g();
                        fj.e(var36);

                        for(long var40 = System.currentTimeMillis(); kf.f; Thread.sleep(100L)) {
                           if (System.currentTimeMillis() - var40 > 20000L) {
                              kf.f = false;
                              g();
                           }
                        }

                        Thread.sleep(1000L);
                     }

                     if (f) {
                        int var37;
                        if ((var37 = Calendar.getInstance().get(11)) < 5 && i.size() > 0) {
                           i.removeAllElements();
                        }

                        if (!i.contains(fi.g().A.o) && (var37 >= 5 || h)) {
                           h = false;
                           jh var41 = r.e(a[6]);
                           hx.b().b(Integer.parseInt(var41.d(0)), (byte)Integer.parseInt(var41.d(1)), Integer.parseInt(var41.d(2)));
                           i.addElement(fi.g().A.o);
                           Thread.sleep(2000L);
                        }
                     }
                  }
               }

               if (g && GameMidlet.k.am != -1) {
                  if (GameMidlet.f == 3) {
                     fu.u().b(0);
                     hx.b().g(8);
                     fp.R = 1;
                     k4.B.w = false;
                  }

                  if (gx.b != -1) {
                     hx.b().g(8);
                     if (!b(-1)) {
                        g();
                     }
                  }

                  Thread.sleep(2000L);
                  if (gx.b == -1) {
                     fc.g().L = 0;
                     hx.b().g(11);
                     if (!b(21)) {
                        g();
                     }

                     Thread.sleep(5000L);
                  }

                  if (gx.b == 21) {
                     h4.b().i(GameMidlet.k.f);
                     if (!b(110)) {
                        g();
                     }

                     Thread.sleep(3000L);
                  }

                  if (gx.b == 110) {
                     hx.b().p(0);
                     Thread.sleep(1000L);
                     hx.b().g(8);
                     if (!b(-1)) {
                        g();
                     }

                     Thread.sleep(2000L);
                  }

                  if (gx.b == -1) {
                     fc.g().L = 7;
                     hx.b().g(10);
                     if (!b(25)) {
                        g();
                     }

                     Thread.sleep(3000L);
                  }
               }

               if (k && GameMidlet.f != 3) {
                  this.e();
               }

               e = System.currentTimeMillis();
            } else {
               if (System.currentTimeMillis() - var1 > 5000L) {
                  GameMidlet.k.b(100, (String)var6.elementAt(var5), (byte)1);
                  var1 = System.currentTimeMillis();
                  var5 = ++var5 % var6.size();
               }

               if (System.currentTimeMillis() - var3 > 60000L && gx.b == 25) {
                  hv var49 = hv.b();
                  fj.g();
                  var49.b(fj.G());
                  var3 = System.currentTimeMillis();
               }

               if (k) {
                  if (l) {
                     l = false;
                     f();
                  } else if (o) {
                     k4.i();
                     fu.u().b(0);
                     Thread.sleep(5000L);
                     k4.i();
                     h1.b().d();
                     long var29 = System.currentTimeMillis();
                     this.s = System.currentTimeMillis();

                     do {
                        Thread.sleep(200L);
                        if (System.currentTimeMillis() - var29 > 10000L) {
                           k4.i();
                           h1.b().d();
                           var29 = System.currentTimeMillis();
                        }
                     } while((k4.u == null || k4.u != fu.u()) && GameMidlet.f == 3);

                     o = false;
                  }
               }
            }
         }
      } catch (InterruptedException var22) {
      } catch (RuntimeException var23) {
         var23.printStackTrace();
      } catch (d var24) {
         var24.printStackTrace();
      }

      eb.f = false;
      o = false;
   }

   static String b(long var0) {
      String var2 = "";
      long var3;
      long var5;
      long var7 = (var5 = (var3 = var0 / 1000L) / 60L) / 60L;
      var3 %= 60L;
      var5 %= 60L;
      var7 %= 60L;
      String var10 = String.valueOf(var3);
      String var1 = String.valueOf(var5);
      String var9 = String.valueOf(var7);
      if (var7 > 0L) {
         var2 = String.valueOf(var9) + ":" + var1 + ":" + var10;
      } else if (var5 > 0L) {
         var2 = String.valueOf(var1) + ":" + var10;
      } else if (var3 > 0L) {
         var2 = var10;
      }

      return var2;
   }

   private void e() {
      k4.d(a[10]);
      hv.b().c(3, 0, 0);
      long var1 = System.currentTimeMillis();

      do {
         Thread.sleep(200L);
         if (System.currentTimeMillis() - var1 > 30000L) {
            Thread.sleep(1000L);
            hu.b().c();
            return;
         }
      } while(k4.u == null || k4.u != fp.h());

      Thread.sleep(1000L);
      k4.i();
      hx.b().g(3);
      AutoController.K = 2;
      var1 = System.currentTimeMillis();

      do {
         Thread.sleep(200L);
         if (System.currentTimeMillis() - var1 > 30000L) {
            Thread.sleep(1000L);
            hu.b().c();
            return;
         }
      } while(k4.u == null || k4.u != fh.g());

      Thread.sleep(200L);
      k4.i();
      h1.b().d();
      System.currentTimeMillis();
      this.s = System.currentTimeMillis();

      do {
         Thread.sleep(200L);
         if (System.currentTimeMillis() - this.s > (long)(GameMidlet.k.aU ? '\uea60' : 10000)) {
            k4.i();
            h1.b().d();
            this.s = System.currentTimeMillis();
         }
      } while((k4.u == null || k4.u != fu.u()) && GameMidlet.f == 3);
   }

   private static i3 b(String var0) {
      for(int var1 = 0; var1 < gx.n.size(); ++var1) {
         ik var2;
         if ((var2 = (ik)gx.n.elementAt(var1)).d == 0 && ((it)var2).g.equals(var0)) {
            return (i3)var2;
         }
      }

      return null;
   }

   private static void f() {
      if (GameMidlet.f == 3) {
         gx.b = -1;
         fu.u().b(0);
         hx.b().g(9);
         fp.R = 1;
         k4.B.w = false;

         while(gx.b != 23) {
            k4.h();
            Thread.sleep(1000L);
            hv.b().b(23, h.b().b(40, 89));
            Thread.sleep(3000L);
         }

         Thread.sleep(2400L);
         GameMidlet.k.a = 685;
         GameMidlet.k.b = 56;
         AutoController.h();
         AutoController.s();
         Thread.sleep(2400L);
         String[] var3 = a;
         int var0 = b(var3[5]).f;
         k4.c(var3[11]);
         eb.f = true;
         long var1 = System.currentTimeMillis();

         while(eb.f) {
            if (System.currentTimeMillis() - var1 > (long)(q * 60 * 1000)) {
               var3 = a;
               k4.c(var3[0]);
               eb.f = false;
               break;
            }

            hv.b().d(var0, 0, 7);
            Thread.sleep(250L);
         }

         if (System.currentTimeMillis() - var1 < (long)(q * 60 * 1000)) {
            var3 = a;
            k4.c(var3[16]);
            eb.f = true;
            var1 = System.currentTimeMillis();

            while(eb.f) {
               if (System.currentTimeMillis() - var1 > (long)(q * 60 * 1000)) {
                  k4.c(a[12]);
                  eb.f = false;
                  break;
               }

               hv.b().d(var0, 0, 8);
               Thread.sleep(250L);
            }
         }

         Thread.sleep(3000L);
         e = 0L;
      }
   }

   private static void g() {
      hu.b().c();
      throw new RuntimeException(a[4]);
   }

   private static boolean b(int var0) {
      long var1 = System.currentTimeMillis();
      if (gx.b != var0) {
         while(true) {
            Thread.sleep(500L);
            if (gx.b == var0) {
               break;
            }

            if (System.currentTimeMillis() - var1 > 60000L) {
               return false;
            }
         }
      }

      return true;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '@');
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
               var10005 = 28;
               break;
            case 1:
               var10005 = 4;
               break;
            case 2:
               var10005 = 115;
               break;
            case 3:
               var10005 = 56;
               break;
            case 4:
               var10005 = 9;
               break;
            case 5:
               var10005 = 17;
               break;
            default:
               var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
