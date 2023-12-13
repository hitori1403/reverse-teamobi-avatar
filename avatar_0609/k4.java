import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

// handle hardware info and http connection
public final class k4 extends k3 implements Runnable, CommandListener {
   public static k4 b;
   private static boolean c;
   public static boolean[] d;
   public static boolean[] e;
   public static boolean[] f;
   public static boolean g;
   public static boolean h;
   public static boolean i;
   public static int j;
   public static int k;
   public static int l;
   public static int m;
   public static int n;
   public static int o;
   public static int p;
   public static int q;
   public static int r;
   public static int s;
   private static boolean t;
   public static e8 u;
   public static e2 v;
   public static fz w;
   public static e1 x;
   public static ex y;
   private static int z;
   public static gx A;
   public static g5 B;
   public static b6 C;
   public static e4 D;
   public static Vector E;
   private static long[] F;
   public static Vector G;
   public static ew H;
   public static boolean I;
   private static boolean J;
   public static boolean K;
   public static boolean L;
   public static boolean M;
   public static boolean N;
   public static int O;
   private static Command P;
   private static Command Q;
   private static Object R;
   public static c9 S;
   public static c9 T;
   public static c9 U;
   public static c9 V;
   public static c9 W;
   public static c9 X;
   public static c9 Y;
   public static c9 Z;
   public static dl aa;
   public static int ab;
   public static int ac;
   private static int ad;
   public static int ae;
   public static int af;
   public static Image ag;
   public static int ah;
   private int ai;
   public static boolean aj;
   public static Image ak;
   public static byte al;
   private long am = 0L;
   public static Vector an;
   private int ao;
   private int ap;
   private static Vector aq;
   public static ag ar;
   public static cn[] as;
   public static cn at;
   public static in au;
   public String av;
   private String aw;
   private static final String[] a;
   // [BlackBerry, NokiaN7, Ao\hMF}]tyf8UWQMyhuylPLZK, 9V\eyZ\fx=6Uk<oYUJIXkEWPko\hMF}]tyf8UWQMyhuylPLZK, BlackBerry,  - , ;deviceside=true,
   //, .000, icon_chat, ABC, microedition.platform, 9V\eyZ\fx=6Uk<oYUJIXkEWPko\hMF}]tyf8UWQMyhuylPLZK, bpa, RIM, .0, ;interface=wifi, .00, NX,  - , đăng nhập quá nhanh, socket://,  ?]

   static {
      String[] var5 = new String[23];
      int var3 = 0;
      String var2 = "0w3F\u001dhz\u0000i+\u0007<t9L\u0017d(\u00193t\u000eM;lb/o+CN\u007fH#V+M\u0003Ss\"W\bn1KM\u000e@\u000fpC\u0014co\u0013#A#\u001dB\u0007o?rt7L\u0002N\u0019vw?]/x\u0002SyJN\u0005t;Sw\u0007b>u:pT\n0w3F\u001dhz\u0000i+\u0003R6r\u0010I\u007f7S\u001fIz\u0001r6@K^m\u0007~\u0002R\u0011\u0004\\+b\u0015\t\u001bx=K)Iw\u0013o\u00033Y\u0011\u0015\u001fr1W\u0019O{\u001bo;J\u0018\u0004o\u001ez&C\u0019Xr1KM\u000e@\u000fpC\u0014co\u0013#A#\u001dB\u0007o?rt7L\u0002N\u0019vw?]/x\u0002SyJN\u0005t;Sw\u0007b>u:pT\u0003\u0010k3\u0003 R\u001f\u0002\\+\u000fIr<Q\u0013Xy\u0013x7\u0018\u0001Cy\u001b\u0003\\+b\u0002<C\u0003R6r\u0013ţĘ<BVDwởkrT\u0003Ë?\u001cs3K\u001e";
      int var4 = "0w3F\u001dhz\u0000i+\u0007<t9L\u0017d(\u00193t\u000eM;lb/o+CN\u007fH#V+M\u0003Ss\"W\bn1KM\u000e@\u000fpC\u0014co\u0013#A#\u001dB\u0007o?rt7L\u0002N\u0019vw?]/x\u0002SyJN\u0005t;Sw\u0007b>u:pT\n0w3F\u001dhz\u0000i+\u0003R6r\u0010I\u007f7S\u001fIz\u0001r6@K^m\u0007~\u0002R\u0011\u0004\\+b\u0015\t\u001bx=K)Iw\u0013o\u00033Y\u0011\u0015\u001fr1W\u0019O{\u001bo;J\u0018\u0004o\u001ez&C\u0019Xr1KM\u000e@\u000fpC\u0014co\u0013#A#\u001dB\u0007o?rt7L\u0002N\u0019vw?]/x\u0002SyJN\u0005t;Sw\u0007b>u:pT\u0003\u0010k3\u0003 R\u001f\u0002\\+\u000fIr<Q\u0013Xy\u0013x7\u0018\u0001Cy\u001b\u0003\\+b\u0002<C\u0003R6r\u0013ţĘ<BVDwởkrT\u0003Ë?\u001cs3K\u001e"
         .length();
      char var1 = '\n';
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
                     d = new boolean[14];
                     e = new boolean[14];
                     f = new boolean[14];
                     o = 0;
                     E = new Vector();
                     G = new Vector();
                     M = false;
                     N = false;
                     O = -1;
                     R = new Object();
                     ab = 0;
                     ah = 1;
                     aj = false;
                     al = 0;
                     an = new Vector();
                     as = new cn[3];
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

                  var2 = "\u0001t1N\u0013^%]4\u0002R$";
                  var4 = "\u0001t1N\u0013^%]4\u0002R$".length();
                  var1 = '\t';
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public k4() {
      this.setFullScreenMode(true);
      o = this.getWidth();
      s = p = this.getHeight();
      kq.b();
      new hq();
      ev.a = 1;
      if (b2.c(GameMidlet.p) == null) {
         f8.d();
      }

      ah = 0;
      S = new cg(0);
      T = new cg(1);
      U = new cg(2);
      V = new cg(3);
      W = new cg(4);
      X = new cg(5);
      Y = new cg(6);
      Z = new cg(7);
      aa = new eu();
      e8.n = S.b() + 6;
      String[] var2 = a;
      au = new in(e_.b(e_.d(e_.e(var2[12]))), T.b(e_.b(e_.d(e_.e(var2[3])))));
      this.aw = e_.b(
         e_.d(
            e_.e(
               new String(
                  new byte[]{
                     65,
                     52,
                     88,
                     94,
                     120,
                     74,
                     113,
                     102,
                     51,
                     69,
                     76,
                     101,
                     123,
                     57,
                     125,
                     94,
                     121,
                     112,
                     75,
                     101,
                     126,
                     112,
                     113,
                     94,
                     122,
                     77,
                     92,
                     93,
                     52,
                     74,
                     113,
                     104,
                     70,
                     61,
                     87,
                     102,
                     122,
                     82,
                     113,
                     80,
                     57,
                     120,
                     91,
                     104,
                     112,
                     112,
                     75,
                     94,
                     122,
                     108,
                     75,
                     103,
                     115,
                     57,
                     91,
                     93,
                     115,
                     86,
                     55,
                     80,
                     122,
                     115,
                     72,
                     103,
                     52,
                     86,
                     76,
                     101,
                     75
                  }
               )
            )
         )
      );
      ev.h = (byte)V.b();
      ev.i = (byte)T.b();
      ev.j = (byte)S.b();
      ev.k = (byte)X.b();
      this.c();
      q = o / 2;
      r = p / 2;
      b = this;
      System.gc();
      cs.b(0);
      if (t = this.getKeyCode(8) == -20) {
         cs.b(1);
      }

      var2 = a;
      String var1;
      I = (var1 = System.getProperty(var2[11])).indexOf(var2[14]) == 0 || var1.indexOf(var2[0]) == 0;
      var2 = a;
      J = var1.indexOf(var2[18]) == 0;
      var2 = a;
      K = var1.indexOf(var2[1]) == 0;
      var2 = a;
      this.av = e_.b(e_.d(e_.e(var2[2])));
      M = this.hasPointerEvents();
      if (I) {
         z = 5;
         if (var1.indexOf(var2[4]) == 0) {
            z = 1;
         }

         cs.b(3);
         this.setCommandListener(this);
         Q = new Command(hq.e, 2, 1);
         P = new Command(hq.d, 1, 1);
         this.addCommand(P);
         this.addCommand(Q);
      }

      if (J) {
         z = 2;
      }

      if (I || J) {
         F = new long[4];
      }

      cs.c(
         b.getGameAction(48) == 0
            && b.getGameAction(49) == 0
            && b.getGameAction(50) == 0
            && b.getGameAction(51) == 0
            && b.getGameAction(52) == 0
            && b.getGameAction(53) == 0
            && b.getGameAction(54) == 0
            && b.getGameAction(55) == 0
            && b.getGameAction(56) == 0
            && b.getGameAction(57) == 0
      );
      b2.b();
      w = new f1();
      v = new e2();
      new f5();
      x = new e1();
      A = new gx();
      B = new g5();
      fa.g().h();
      aa.d();
      if (this.hasPointerEvents()) {
         aq = new Vector();
      }

      b();
      if ((ae = (ad = (int)(Runtime.getRuntime().totalMemory() / 1024L)) / 17) < 60) {
         ae = 60;
      }
   }

   public static void b() {
      ar = new ag(hq.q, -1);
      f1.d().a();
      if (u != null) {
         u.a();
      }
   }

   public final void sizeChanged(int var1, int var2) {
      this.setFullScreenMode(true);
      this.c();
   }

   public final void c() {
      o = this.getWidth();
      p = this.getHeight();
      ev.c = 20;
      if (o < 176) {
         ev.c = 4;
      }

      if (fa.I && M) {
         C = new b6();
      } else {
         L = false;
         C = null;
      }

      s = p;
      q = o / 2;
      aa.d();
      r = p / 2;
      aa.b();
      if (w != null) {
         w = null;
      }

      if (fi.z != null) {
         fi.g().i();
      }

      int var1 = gx.b;
      cl.b().c(var1);
      if (fb.z != null) {
         fb.h();
      }

      if (ib.d != null) {
         ib.b().c();
      }

      if (v != null) {
         v.d();
         v.b(v.v);
      }

      if (u != null) {
         if (u == fe.z) {
            fe.g();
         }

         if (ft.z == u) {
            ft.z.g();
         }

         if (fm.E != null) {
            fm.E.i();
         }

         if (fc.z != null) {
            fc.g().h();
         }

         if (fh.z == u) {
            fh.z.h();
         }

         if (fr.z == u) {
            fr.z.k();
         }
      }

      if (x != null) {
         x.e();
      }

      if (e3.n != null) {
         e3.e().d();
      }

      if (e7.n != null) {
         e7.e().g();
      }

      if (M && e8.r == null) {
         bp.c(hq.ax);
         String[] var2 = a;
         e8.r = bp.b(var2[13]);
         e8.s = bp.b(var2[9]);
         bp.b();
      }

      if (u != null) {
         if (u == ff.z) {
            ff.g().h();
         }

         if (u == fa.z) {
            fa.g().h();
         }

         if (u == fd.g()) {
            fd.g().i();
         }

         if (u == fq.g()) {
            fq.g().h();
         }

         if (D != null) {
            D = null;
         }
      }
   }

   public static void b(String var0) {
      if (!fp.O && !var0.equals("")) {
         in var1;
         (var1 = new in(var0, -S.b(var0))).a = o + 10;
         G.addElement(var1);
         if (al == 0) {
            al = 1;
         }

         if (var0.indexOf(a[20]) != -1 && !kd.b) {
            int var2 = Integer.parseInt(kq.b(var0));
            if (GameMidlet.j.r != null) {
               GameMidlet.j.r.interrupt();
               GameMidlet.j.r = null;
            }

            GameMidlet.j.r = new k1(var2);
            GameMidlet.j.r.start();
         }
      }
   }

   public static void d() {
      if (!jp.b().g) {
         int var0;
         if ((var0 = ff.g().t - 1) < 0) {
            var0 = 0;
         }

         String[] var2 = a;
         String var3 = var2[21] + GameMidlet.c[fa.g().D[4]][ff.g().A][var0] + ":" + GameMidlet.d[fa.g().D[4]][ff.g().A][var0];
         if (I) {
            var3 = fa.J ? String.valueOf(var3) + var2[16] : String.valueOf(var3) + a[6];
         }

         jp var4;
         if (!(var4 = jp.b()).g && !var4.h) {
            var4.n = false;
            var4.f = null;
            var4.j = new Thread(new ct(var4, var3));
            var4.j.start();
         }

         hx.b().c();
      }
   }

   public final void run() {
      c = true;

      while(c) {
         try {
            if (this.ai > 0) {
               --this.ai;
               if (this.ai == 0) {
                  Display.getDisplay(GameMidlet.j).vibrate(0);
               }
            }

            long var3 = System.currentTimeMillis();
            if (++n > 10000) {
               if (System.currentTimeMillis() - this.am < -5L && u == fi.z) {
                  GameMidlet.j.notifyDestroyed();
               }

               n = 0;
            }

            if (O != -1) {
               if (O == 1) {
                  this.ao += 15;
               } else {
                  ++this.ap;
                  if (this.ap >= 8) {
                     this.ap = 0;
                  }
               }

               if (this.ao >= r) {
                  this.ao = 0;
                  O = -1;
               }
            }

            if (O != 0) {
               if (C != null) {
                  C.b();
               }

               if (H != null && y == null) {
                  H.c();
               }

               if (E.size() > 0) {
                  for(int var5 = 0; var5 < E.size(); ++var5) {
                     ((gz)E.elementAt(var5)).a();
                  }
               }

               if (u != null) {
                  if (e3.p) {
                     e3.e().c();
                  }

                  if (G.size() <= 0) {
                     if (al > 0) {
                        --al;
                     }
                  } else {
                     if (al < ev.i) {
                        ++al;
                     }

                     in var1;
                     ik var10000 = var1 = (in)G.elementAt(0);
                     var10000.a -= 2;
                     if (var1.a < var1.j) {
                        G.removeElementAt(0);
                     }
                  }

                  u.b();
                  if (B.w) {
                     g5 var11 = B;
                     if (w == null && y == null) {
                        if (var11.D == 0) {
                           if (g5.r < 0) {
                              g5.s = 0;
                           } else if (g5.r > var11.d) {
                              g5.s = var11.d;
                           }
                        } else {
                           if (g5.r < 0 || g5.r > var11.d) {
                              if (var11.D > 500) {
                                 var11.D = 500;
                              } else if (var11.D < -500) {
                                 var11.D = -500;
                              }

                              var11.D -= var11.D / 5;
                              if (b2.f(var11.D / 10) <= 10) {
                                 var11.D = 0;
                              }
                           }

                           g5.s = g5.r += var11.D / 15;
                           var11.D -= var11.D / 20;
                        }

                        if (var11.E == 0) {
                           if (g5.t < 0) {
                              g5.u = 0;
                           } else if (g5.t > var11.q) {
                              g5.u = var11.q;
                           }
                        } else {
                           if (g5.t < 0 || g5.t > var11.q) {
                              if (var11.E > 500) {
                                 var11.E = 500;
                              } else if (var11.E < -500) {
                                 var11.E = -500;
                              }

                              var11.E -= var11.E / 5;
                              if (b2.f(var11.E / 10) <= 10) {
                                 var11.E = 0;
                              }
                           }

                           g5.u = g5.t += var11.E / 15;
                           var11.E -= var11.E / 20;
                        }

                        if (g5.r != g5.s) {
                           var11.c = g5.s - g5.r << 2;
                           var11.b += var11.c;
                           g5.r += var11.b >> 4;
                           var11.b &= 15;
                        }

                        if (g5.t != g5.u) {
                           var11.p = g5.u - g5.t << 2;
                           var11.o += var11.p;
                           g5.t += var11.o >> 4;
                           var11.o &= 15;
                        }
                     }
                  }

                  if (y != null) {
                     y.c();
                  } else if (D != null) {
                     if (H == null) {
                        D.c();
                     }
                  } else if (w != null) {
                     w.c();
                     if (w != null) {
                        w.b();
                     }
                  } else {
                     if (D == null && !e3.p) {
                        u.c();
                     }

                     if (B.w && D == null) {
                        B.b();
                     }
                  }

                  if (n % 20 == 10) {
                     f5.l();
                     f8.h();
                     if ((byte)((int)(Runtime.getRuntime().freeMemory() / 1024L)) < 100) {
                        System.gc();
                     }
                  }
               }

               if (H != null) {
                  H.b();
               }

               i = false;
               h = false;

               for(int var14 = 0; var14 < an.size(); ++var14) {
                  c3 var12;
                  if ((var12 = (c3)an.elementAt(var14)).f > 0) {
                     --var12.f;
                  } else {
                     ++var12.e;
                     if (var12.e > 40) {
                        var12.h = null;
                        an.removeElement(var12);
                     }

                     if (var12.e < 3) {
                        var12.d += -2 * var12.i;
                     } else {
                        var12.d += var12.i;
                     }
                  }
               }

               if (I || J) {
                  for(int var15 = 0; var15 < 4; ++var15) {
                     if (f[(var15 << 1) + 2] && System.currentTimeMillis() / 100L - F[var15] > (long)z) {
                        f[(var15 << 1) + 2] = false;
                     }
                  }
               }
            }

            this.repaint();
            if (I) {
               Object var16 = R;
               synchronized(R) {
                  try {
                     R.wait(1000L);
                  } catch (InterruptedException var8) {
                     var8.printStackTrace();
                  }
               }
            }

            this.serviceRepaints();
            long var17 = System.currentTimeMillis() - var3;

            try {
               if (var17 < (long)f.b) {
                  Thread.sleep((long)f.b - var17);
               } else {
                  Thread.sleep(1L);
               }
            } catch (InterruptedException var7) {
            }
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }
   }

   public final void c(int var1) {
      if (O == -1) {
         this.am = System.currentTimeMillis();
         if (t) {
            switch(this.getGameAction(var1)) {
               case 1:
                  f[2] = true;
                  d[2] = true;
                  return;
               case 2:
                  f[4] = true;
                  d[4] = true;
                  return;
               case 3:
               case 4:
               case 7:
               default:
                  if (var1 == -21) {
                     var1 = -6;
                  } else if (var1 == -22) {
                     var1 = -7;
                  }
                  break;
               case 5:
                  f[6] = true;
                  d[6] = true;
                  return;
               case 6:
                  f[8] = true;
                  d[8] = true;
                  return;
               case 8:
                  f[5] = true;
                  d[5] = true;
                  return;
            }
         } else if (I) {
            long var2 = System.currentTimeMillis() / 100L;
            switch(var1) {
               case -8:
                  f[5] = true;
                  d[5] = true;
                  return;
               case 1:
                  F[0] = var2;
                  f[2] = true;
                  d[2] = true;
                  return;
               case 2:
                  F[1] = var2;
                  f[4] = true;
                  d[4] = true;
                  return;
               case 5:
                  F[2] = var2;
                  f[6] = true;
                  d[6] = true;
                  return;
               case 6:
                  F[3] = var2;
                  f[8] = true;
                  d[8] = true;
                  return;
            }
         }

         if (y != null) {
            y.a(var1);
         } else if (D != null) {
            D.a(var1);
         } else if (w == null) {
            if (e3.p) {
               e3 var10000 = e3.e();
               int var3 = var1;
               e3 var4 = var10000;
               if (e3.p) {
                  if (i.d == 1 && var1 == 432) {
                     var3 = 119;
                  }

                  var4.o.f(var3);
                  if (i.d > 0) {
                     cs var5;
                     var4.o.b(i.b((var5 = var4.o).o));
                  }
               }
            } else {
               u.a(var1);
            }
         }

         if (J) {
            long var6 = System.currentTimeMillis() / 100L;
            switch(var1) {
               case -39:
               case -2:
                  F[3] = var6;
                  break;
               case -38:
               case -1:
                  F[0] = var6;
                  break;
               case -4:
                  F[2] = var6;
                  break;
               case -3:
                  F[1] = var6;
            }
         }

         switch(var1) {
            case -39:
            case -2:
               f[8] = true;
               d[8] = true;
               return;
            case -38:
            case -1:
               f[2] = true;
               d[2] = true;
               return;
            case -22:
            case -7:
               f[13] = true;
               d[13] = true;
               return;
            case -21:
            case -6:
               f[12] = true;
               d[12] = true;
               return;
            case -5:
            case 10:
               f[5] = true;
               d[5] = true;
               return;
            case -4:
               f[6] = true;
               d[6] = true;
            default:
               return;
            case -3:
               f[4] = true;
               d[4] = true;
               return;
            case 35:
               f[11] = true;
               d[11] = true;
               return;
            case 42:
               f[10] = true;
               d[10] = true;
         }
      }
   }

   public static boolean d(int var0) {
      if (d[var0]) {
         d[var0] = false;
         return true;
      } else {
         return false;
      }
   }

   public final void b(int var1) {
      if (t) {
         switch(this.getGameAction(var1)) {
            case 1:
               f[2] = false;
               return;
            case 2:
               f[4] = false;
               return;
            case 3:
            case 4:
            case 7:
            default:
               if (var1 == -21) {
                  var1 = -6;
               } else if (var1 == -22) {
                  var1 = -7;
               }
               break;
            case 5:
               f[6] = false;
               return;
            case 6:
               f[8] = false;
               return;
            case 8:
               f[5] = false;
               return;
         }
      } else if (I && var1 == 27) {
         var1 = -7;
      }

      switch(var1) {
         case -39:
         case -2:
            if (!J && !I) {
               f[8] = false;
            }

            e[8] = true;
            return;
         case -38:
         case -1:
            if (!J && !I) {
               f[2] = false;
            }

            e[2] = true;
            return;
         case -22:
         case -7:
            f[13] = false;
            e[13] = true;
            return;
         case -21:
         case -6:
            f[12] = false;
            e[12] = true;
            return;
         case -5:
         case 10:
            f[5] = false;
            e[5] = true;
            return;
         case -4:
            if (!J && !I) {
               f[6] = false;
            }

            e[6] = true;
         default:
            return;
         case -3:
            if (!J && !I) {
               f[4] = false;
            }

            e[4] = true;
            return;
         case 35:
            f[11] = false;
            e[11] = true;
            return;
         case 42:
            f[10] = false;
            e[10] = true;
      }
   }

   protected final void pointerDragged(int var1, int var2) {
      aq.addElement(new cn(var1, var2));
      j = var1;
      k = var2;
   }

   protected final void pointerPressed(int var1, int var2) {
      i = true;
      g = true;
      l = var1;
      m = var2;
      j = var1;
      k = var2;
   }

   protected final void pointerReleased(int var1, int var2) {
      g = false;
      h = true;
      j = var1;
      k = var2;
   }

   public static void e() {
      h = false;

      for(int var0 = 0; var0 < 14; ++var0) {
         d[var0] = false;
      }
   }

   public static void f() {
      h = false;
      g = false;

      for(int var0 = 0; var0 < 14; ++var0) {
         f[var0] = false;
      }
   }

   public static void g() {
      g = false;

      for(int var0 = 0; var0 < 14; ++var0) {
         e[var0] = false;
      }
   }

   public static String b(String var0, int var1) {
      String var2 = "";

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         var2 = String.valueOf(var2) + (char)(var0.charAt(var3) + var1);
      }

      return var2;
   }

   public static void b(int var0, int var1, int var2, int var3) {
      an.addElement(new c3(var1, var2, var0, -1, null, var3, -1, -1));
   }

   public static void c(int var0, int var1, int var2, int var3) {
      an.addElement(new c3(var1, var2, var0, -1, null, 0, var3, -1));
   }

   public static void b(int var0, int var1, int var2, Image var3, int var4) {
      an.addElement(new c3(var1, var2, var0, -1, var3, var4, -1, -1));
   }

   public static void b(String var0, int var1, int var2, int var3, int var4) {
      an.addElement(new c3(var1, var2, var0, -1, var3, var4));
   }

   public static void b(Graphics var0) {
      var0.drawImage(ag, 0, 1, 0);
   }

   public static void c(Graphics var0) {
      var0.drawImage(ag, 0, 1, 0);
   }

   public final void paint(Graphics var1) {
      var1.translate(0, 0);
      if (O != 0) {
         if (u != null) {
            u.b(var1);
         }

         if (E.size() > 0 && u != fh.z && u != fr.z) {
            for(int var4 = 0; var4 < E.size(); ++var4) {
               ((gz)E.elementAt(var4)).b(var1);
            }
         }

         if (e3.p) {
            e3.e().b(var1);
         }

         if (D != null) {
            D.b(var1);
         }

         if (y != null) {
            y.b(var1);
         } else if (w != null) {
            w.b(var1);
         }

         if (H != null) {
            H.b(var1);
         }

         Graphics var2 = var1;
         d(var1);
         var1.translate(-ko.b().c, -ko.b().d);

         for(int var22 = 0; var22 < an.size(); ++var22) {
            c3 var10000 = (c3)an.elementAt(var22);
            Graphics var5 = var2;
            c3 var3 = var10000;
            if (u == fe.z) {
               d(var5);
            }

            if (var3.f <= 0) {
               int var6 = ev.a;
               if (u == ft.z && (ft.A || ft.B) || u == fe.z) {
                  var6 = 1;
               }

               c9 var7 = W;
               if (var3.g) {
                  if (var3.j == 0) {
                     var7 = X;
                  } else {
                     var7 = T;
                  }
               }

               var7.b(var5, var3.b, var3.c * var6, var3.d * var6, 2);
               if (var3.h == null) {
                  if (var3.k != -1) {
                     f8.b(var5, var3.k, var3.c * var6, (var3.d - 5) * var6, 33);
                  } else if (var3.l != -1) {
                     f5.b(var5, var3.l, var3.c * var6, (var3.d - 5) * var6, 33);
                  }
               } else if (!var3.g) {
                  var5.drawImage(var3.h, var3.c * var6, var3.d * var6, 33);
               }
            }
         }

         if (al > 0) {
            var2 = var1;
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
            var1.setClip(0, 0, o, p);
            var1.setColor(0);

            for(int var23 = 0; var23 < o / 30 + 1; ++var23) {
               var2.drawImage(ak, var23 * 30, al - 30, 0);
            }

            var2.fillRect(0, al, o, 1);
            if (G.size() > 0) {
               d(var2);
               int var24 = al / 2 - ev.i / 2;
               var2.setClip(0, var24, o, ev.i + 2);
               in var19 = (in)G.elementAt(0);
               T.b(var2, var19.h, var19.a, var24, 0);
               d(var2);
            }
         }
      }

      if (O != -1) {
         d(var1);
         var1.setColor(1);
         var1.fillRect(0, 0, o, r - this.ao);
         var1.fillRect(0, r + this.ao, o, r - this.ao + 2 + ab);
         if (O != 1) {
            e2.D.b(this.ap, q, r, 0, 3, var1);
         }
      }

      if (C != null) {
         b6 var20 = C;
         var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
         var1.setClip(var20.b - 4, var20.c - 4, var20.d + 4, var20.e + 4);
         if (var20.w) {
            Graphics var30 = var1;
            b6 var28 = var20;
            var1.setClip(var20.b, var20.c, var20.d, var20.e);
            ib.b(var20.h, var20.i, var20.d, var20.e, 8705740, var1);
            var1.setColor(1);
            var1.drawRect(var20.h, var20.i, var20.d - 1, var20.e - 1);

            for(int var15 = 1; var15 < var28.n; ++var15) {
               var30.fillRect(var28.h + var15 * var28.k, var28.i, 1, var28.e);
            }

            for(int var16 = 1; var16 < var28.o; ++var16) {
               var30.fillRect(var28.h, var28.i + var16 * var28.j, var28.d, 1);
            }

            for(int var17 = 0; var17 < var28.r.length; ++var17) {
               int var26 = var28.i + var17 / var28.n * var28.j;
               var30.setClip(var28.h + var17 % var28.n * var28.k, var26 - 5, var28.k, var28.j + 5);
               if (var28.v == var17) {
                  var30.setColor(14279153);
                  var30.fillRect(var28.h + var17 % var28.n * var28.k + 1, var26 + 1, var28.k - 2, var28.j - 2);
               }

               S.b(var30, var28.t[var17], var28.h + var17 % var28.n * var28.k + var28.k / 2, var26 - 5 + var28.j / 2, 2);
            }
         } else {
            Graphics var29 = var1;
            b6 var27 = var20;
            var1.setClip(var20.b - 4, var20.c - 4, var20.d + 4, var20.e + 4);
            ib.b(var20.b, var20.c, var20.d, var20.e, 8705740, var1);
            var1.setColor(0);
            var1.drawRect(var20.b, var20.c, var20.d - 1, var20.e - 1);

            for(int var12 = 1; var12 < var27.l + 1; ++var12) {
               var29.fillRect(var27.b + var12 * var27.f, var27.c, 1, var27.e);
            }

            for(int var13 = 1; var13 < var27.m; ++var13) {
               var29.fillRect(var27.b, var27.c + var13 * var27.g, var27.d, 1);
            }

            for(int var14 = 0; var14 < var27.p.length; ++var14) {
               if (var27.v == var14) {
                  var29.setColor(14279153);
                  var29.fillRect(var27.b + var14 % var27.l * var27.f + 1, var27.c + var14 / var27.l * var27.g + 1, var27.f - 2, var27.g - 2);
               }

               int var25 = var27.b + var14 % var27.l * var27.f + var27.f / 2;
               int var8 = var27.c + var14 / var27.l * var27.g + var27.g / 2;
               if (var27.p[var14].equals(a[10])) {
                  S.b(var29, cs.D[cs.B], var25, var8 - 5, 2);
               } else {
                  for(int var9 = 0; var9 < 4; ++var9) {
                     if (var27.p[var14].equals(var27.z[var9])) {
                        ib.c.b(0, var25, var8, var27.A[var9], 3, var29);
                     }
                  }
               }
            }
         }

         var1.setClip(var20.b - 4, var20.c - 4, var20.d + 4, var20.e + 4);
         var1.setColor(2378578);
         if (L) {
            var1.drawRect(var20.b - 4, var20.c, 4, var20.e);
            var1.setColor(6201499);
            var1.fillRect(var20.b - 4 + 1, var20.c + 1, 3, var20.e - 2);
            var1.setColor(2716523);
            var1.fillRect(var20.b - 4 + 3, var20.c + 1, 1, var20.e - 1);
         } else {
            var1.drawRect(var20.b, var20.c - 4, var20.d, 4);
            var1.setColor(6201499);
            var1.fillRect(var20.b + 1, var20.c - 4 + 1, var20.d - 2, 3);
            var1.setColor(2716523);
            var1.fillRect(var20.b + 1, var20.c - 4 + 3, var20.d - 1, 1);
         }
      }

      d(var1);
      if (I) {
         Object var21 = R;
         synchronized(R) {
            R.notify();
         }
      }
   }

   public static void d(Graphics var0) {
      var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
      var0.translate(0, 0);
      var0.setClip(0, 0, o, s);
   }

   public static void h() {
      v.b(false);
      y = null;
   }

   public static void c(String var0) {
      v.b(var0, new ag(hq.A, -1), null);
   }

   public static void b(String var0, Vector var1) {
      if (fp.O) {
         v.b(var0, null, var1);
      } else {
         v.b(var0, new ag("", -1), var1);
      }
   }

   public static void b(String var0, gq var1) {
      Vector var2;
      (var2 = new Vector()).addElement(new ag(hq.p, var1));
      var2.addElement(ar);
      b(var0, var2);
   }

   public static void b(String var0, int var1, e8 var2) {
      Vector var3;
      (var3 = new Vector()).addElement(new ag(hq.p, var1, var2));
      var3.addElement(ar);
      b(var0, var3);
   }

   public static void c(String var0, gq var1) {
      Vector var2;
      (var2 = new Vector()).addElement(new ag(hq.A, var1));
      b(var0, var2);
   }

   public static void c(String var0, int var1) {
      Vector var2;
      (var2 = new Vector()).addElement(new ag(hq.p, var1));
      var2.addElement(ar);
      b(var0, var2);
   }

   public static void b(String var0, int var1, ev var2) {
      Vector var3;
      (var3 = new Vector()).addElement(new ag(hq.A, var1, var2));
      b(var0, var3);
   }

   public static void d(String var0) {
      v.b(var0, null, null);
      v.b(true);
   }

   public static void e(String var0) {
      v.b(var0, new ag(hq.bY, -1), null);
   }

   public static void i() {
      d(hq.c);
   }

   public static String b(int var0, int var1, int var2) {
      String var3 = "";
      if (var0 > 0) {
         var3 = String.valueOf(var3) + e(var0) + hq.D;
      }

      if (var1 > 0) {
         if (var0 > 0) {
            StringBuffer var10000 = new StringBuffer(String.valueOf(String.valueOf(var3)));
            String[] var4 = a;
            var3 = var10000.append(var4[19]).toString();
         }

         var3 = String.valueOf(var3) + e(var1) + hq.E;
      }

      if (var2 >= 0) {
         if (!var3.equals("")) {
            var3 = String.valueOf(var3) + a[5];
         }

         var3 = String.valueOf(var3) + e(var2) + hq.F;
      }

      return var3;
   }

   public static String b(int var0, int var1, boolean var2) {
      String var3 = "";
      if (var0 > 0) {
         var3 = String.valueOf(var3) + e(var0) + (var2 ? hq.D : hq.U);
      }

      if (var1 > 0) {
         if (var0 > 0) {
            var3 = String.valueOf(var3) + a[5];
         }

         var3 = String.valueOf(var3) + e(var1) + hq.E;
      }

      return var3;
   }

   public static String e(int var0) {
      String var1 = "";
      int var2 = var0 / 1000 + 1;

      for(int var3 = 0; var3 < var2; ++var3) {
         if (var0 < 1000) {
            var1 = String.valueOf(var0) + var1;
            break;
         }

         int var4;
         String var10000;
         if ((var4 = var0 % 1000) == 0) {
            String[] var5 = a;
            var10000 = var5[8].concat(String.valueOf(var1));
         } else if (var4 < 10) {
            String[] var6 = a;
            var10000 = var6[17] + var4 + var1;
         } else {
            var10000 = var4 < 100 ? a[15] + var4 + var1 : "." + var4 + var1;
         }

         var1 = var10000;
         var0 /= 1000;
      }

      return var1;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == null || var1 == List.SELECT_COMMAND) {
         if (null.getSelectedIndex() != 0) {
            fp.O = true;
            fp.h().d();
         }

         fy.C = false;
         Display.getDisplay(GameMidlet.j).setCurrent(this);
         this.setFullScreenMode(true);
      } else if (var1 == null) {
         if (u == fo.z) {
            fp.h().d();
         } else {
            AutoController.h().d();
         }

         Display.getDisplay(GameMidlet.j).setCurrent(this);
         this.setFullScreenMode(true);
         fy.C = false;
      }

      if (var1 == P) {
         d[12] = true;
      } else {
         if (var1 == Q) {
            d[13] = true;
         }
      }
   }

   public static boolean d(int var0, int var1, int var2, int var3) {
      return !g && !h ? false : e(var0, var1, var2, var3);
   }

   public static boolean e(int var0, int var1, int var2, int var3) {
      return j >= var0 && j <= var0 + var2 && k >= var1 && k <= var1 + var3;
   }

   public static void b(int var0, int var1, gq var2, gq var3, gq var4) {
      String var5 = "";
      Vector var6 = new Vector();
      if (var0 > 0) {
         var6.addElement(new ag(var1 <= 0 ? hq.p : hq.D, var2));
         var5 = " " + var0 + hq.D;
      }

      if (var1 > 0) {
         var6.addElement(new ag(var0 <= 0 ? hq.p : hq.E, var3));
         var5 = " " + var1 + hq.E;
      }

      String var10;
      if (var6.size() == 1) {
         StringBuffer var10000 = new StringBuffer(String.valueOf(String.valueOf(hq.cs))).append(var5).append(" ").append(hq.q);
         String[] var7 = a;
         var10 = var10000.append(var7[22]).toString();
      } else {
         StringBuffer var11 = new StringBuffer(String.valueOf(String.valueOf(hq.aH)));
         String[] var9 = a;
         var10 = var11.append(var9[7]).append(var0).append(hq.D).append(var9[5]).append(var1).append(" ").append(hq.E).toString();
      }

      var5 = var10;
      if (var4 == null) {
         var6.addElement(ar);
      } else {
         var6.addElement(new ag(hq.q, var4));
      }

      b(var5, var6);
   }

   public static int j() {
      return (int)(System.currentTimeMillis() / 1000L);
   }

   public static int k() {
      return l - j;
   }

   public static int l() {
      return m - k;
   }

   public static boolean m() {
      return y == null
         && w == null
         && u != fm.E
         && u != fb.g()
         && u != fd.z
         && u != fh.z
         && u != fr.z
         && u != e_.z
         && u != fp.z
         && u != fc.z
         && u != fq.z
         && !fg.N
         && !fg.H
         && u != fn.z
         && (u != fu.ai || !ft.A);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
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
               var10005 = 114;
               break;
            case 1:
               var10005 = 27;
               break;
            case 2:
               var10005 = 82;
               break;
            case 3:
               var10005 = 37;
               break;
            case 4:
               var10005 = 118;
               break;
            case 5:
               var10005 = 42;
               break;
            default:
               var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
