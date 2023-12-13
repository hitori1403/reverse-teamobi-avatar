import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gx {
   public static int b;
   public static Image c;
   public static g_ d;
   public static short[] e;
   public static short f;
   public static short g;
   public static short[] h;
   public static byte[] i;
   public static int j;
   public static byte k;
   public static byte l;
   public static Vector m;
   public static Vector n;
   public static Vector o;
   public static Vector p;
   private static int q;
   private cn[] r;
   private static Vector s;
   private static int[] t;
   public static ik u;
   public static ag v;
   public static Image w;
   private static g_ x;
   private static int[] y;
   public static int z;
   public static int A;
   private static int B;
   public static cn C;
   public static Vector D;
   public static Vector E;
   public static Vector F;
   public static int G;
   private static bq H;
   private boolean I;
   private static int J;
   private static int K;
   public static int L;
   private static int M;
   public static int N;
   public static int O;
   private ik P;
   private ik Q;
   private ik R;
   private int S;
   private int T;
   private int U;
   private static int V;
   private static byte W;
   public static int X;
   public static int Y;
   public static Vector Z;
   public static Vector aa;
   public static int ab;
   public static int ac;
   private static final String[] a;

   static {
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "-Ui{@\u0007(R\u007f.[(/\u0007\"TnkK}a\u00028\n\fdMojW./,\u0014z`T\u000edNcbV\u00034*bo C)&\u0007d^kzRh)\u0003/_d\u0005?ReoG\nd^kzRh%*Nk\u0005?ReoG";
      int var4 = "-Ui{@\u0007(R\u007f.[(/\u0007\"TnkK}a\u00028\n\fdMojW./,\u0014z`T\u000edNcbV\u00034*bo C)&\u0007d^kzRh)\u0003/_d\u0005?ReoG\nd^kzRh%*Nk\u0005?ReoG"
         .length();
      char var1 = 5;
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
                     b = -1;
                     i = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 3, 3, 3, 3, 3, 2, -1, -1, -1, 0, 0, 0, 2, 2};
                     j = 24;
                     k = 0;
                     l = -1;
                     m = new Vector();
                     n = new Vector();
                     o = new Vector();
                     q = 0;
                     s = new Vector();
                     t = new int[]{15853390, 15006199, 8183509, 12254198};
                     y = new int[]{6143735, 21};
                     A = -1;
                     B = -1;
                     G = -1;
                     H = new bq();
                     L = -1;
                     M = 3;
                     N = -1;
                     O = -1;
                     V = 0;
                     X = 0;
                     Y = -1;
                     ab = -1;
                     ac = -1;
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

                  var2 = "-Ui{@\bd[$m_&;1";
                  var4 = "-Ui{@\bd[$m_&;1".length();
                  var1 = 5;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public gx() {
      v = new ag(hq.bp, new g8());
      q = b2.e(3);
      j = 24;
      bp.c(hq.aw);
      String[] var1 = a;
      bp.b(var1[7]);
      w = bp.b(var1[3]);
      if (k4.M) {
         if (k4.ah == 0) {
            x = new g_(bp.b(var1[0]), 21 * ev.a, 15 * ev.a);
         } else {
            x = new g_(bp.b(a[11]), 32 * ev.a, 11 * ev.a);
         }

         C = new cn();
      }

      bp.b();
   }

   public final void b() {
      if (fb.g() != k4.u && k4.M) {
         if (k4.y != null || k4.D != null || k4.w != null) {
            return;
         }

         if (k4.e(0, 0, k4.o, k4.p)) {
            int var2 = k4.k();
            int var3 = k4.l();
            if (k4.i) {
               k4.i = false;
               J = cl.b().c;
               K = cl.b().d;
               this.I = true;
            }

            if (this.I) {
               if (k4.g && (b2.f(var2) > 20 || b2.f(var3) > 20)) {
                  cl.b().e = J + var2;
                  cl.b().f = K + var3;
                  cl.b().b(cl.b().e + k4.q, cl.b().f + k4.r);
                  cl.b().i = System.currentTimeMillis() / 100L;
               }

               if (k4.h) {
                  k4.h = false;
                  this.I = false;
                  if (b2.f(var2) < 10 && b2.f(var3) < 10 && !AutoController.V) {
                     C.b = k4.j + cl.b().c;
                     C.c = k4.k + cl.b().d;
                     if (C.c < 0) {
                        C.c = 0;
                     }

                     GameMidlet.k.aR = C;
                     GameMidlet.k.n();
                  }
               }
            }
         }
      }
   }

   public final void c() {
      try {
         cl.b().e();
         if ((k4.ah == 0 || k4.u != e_.g()) && n.size() > 0) {
            for(int var1 = 0; var1 < n.size(); ++var1) {
               ((ik)n.elementAt(var1)).a();
            }

            b(n);
         }

         if (o.size() > 0) {
            b(o);

            for(int var8 = 0; var8 < o.size(); ++var8) {
               ((ik)o.elementAt(var8)).a();
            }
         }

         if (m.size() > 0) {
            for(int var9 = 0; var9 < m.size(); ++var9) {
               ((ik)m.elementAt(var9)).a();
            }
         }

         gx var2 = this;
         if (this.r != null) {
            for(int var3 = 0; var3 < var2.r.length; ++var3) {
               --var2.r[var3].b;
               if (var2.r[var3].b < cl.b().c - 100) {
                  var2.r[var3].b = cl.b().c + k4.o + 30 + b2.e(10) * 50;
                  var2.r[var3].c = -110 - b2.e(6) * 10;
               }
            }
         }

         if (k4.n % 4 == 2 && !fj.aL && (b != 24 || k4.ah == 0) && fj.aj == -1 && !fj.ad && fe.z != k4.u && b != -1 && k4.u != e_.z && k4.w == null) {
            if (u == null) {
               int var13 = 0;

               while(var13 < n.size() && !a(var13)) {
                  ++var13;
               }
            } else if (b2.f(u.a - GameMidlet.k.a) / j >= (u.d == 7 ? M << 1 : M) || b2.f(u.b - GameMidlet.k.b) / j >= (u.d == 7 ? M << 1 : M)) {
               u = null;
               AutoController.J = null;
            }
         }

         if (bq.j) {
            H.b();
         }

         if (F != null) {
            for(int var10 = 0; var10 < F.size(); ++var10) {
               ju var14;
               if (f5.e((var14 = (ju)F.elementAt(var10)).b) != null) {
                  if (var14.l == 0) {
                     i3 var15;
                     if ((var15 = l(var14.k)) == null) {
                        F.removeElement(var14);
                        continue;
                     }

                     var14.f = (short)var15.a;
                     var14.g = (short)var15.b;
                  }

                  if (var14.h == var14.d) {
                     var14.h = 0;
                     i4 var16;
                     (var16 = new i4()).z = var14.b;
                     var16.C = var14.k;
                     var16.D = var14.l;
                     switch(var14.m) {
                        case 0:
                           var16.a = var14.f;
                           var16.b = var14.g;
                           break;
                        case 1:
                           int var4 = b2.e(var14.e);
                           int var5 = b2.e(360);
                           int var6 = var4 * b2.c(b2.d(var5)) >> 10;
                           var4 = -(var4 * b2.b(b2.d(var5))) >> 10;
                           var16.a = var14.f;
                           var16.b = var14.g;
                           var16.A = (short)var6;
                           var16.B = (short)var4;
                           break;
                        case 2:
                           var16.a = var14.f;
                           var16.b = var14.g;
                           if (var14.l == 0) {
                              var16.A = var14.n[var14.j];
                              var16.B = var14.o[var14.j];
                           } else {
                              var16.a += var14.n[var14.j];
                              var16.b += var14.o[var14.j];
                           }
                     }

                     ++var14.i;
                     ++var14.j;
                     if (var14.n != null && var14.j >= var14.n.length) {
                        var14.j = 0;
                     }

                     if (var14.c != -1 && var14.i >= var14.c) {
                        F.removeElement(var14);
                     }

                     switch(var14.l) {
                        case 0:
                           n.addElement(var16);
                           n = b(n);
                           break;
                        case 1:
                           m.addElement(var16);
                           m = b(m);
                           break;
                        case 2:
                           if (D == null) {
                              D = new Vector();
                           }

                           D.addElement(var16);
                           break;
                        case 3:
                           if (E == null) {
                              E = new Vector();
                           }

                           E.addElement(var16);
                     }
                  }

                  ++var14.h;
               }
            }
         }

         if (D != null) {
            for(int var11 = 0; var11 < D.size(); ++var11) {
               ((i4)D.elementAt(var11)).a();
            }
         }

         if (E != null) {
            for(int var12 = 0; var12 < E.size(); ++var12) {
               ((i4)E.elementAt(var12)).a();
            }
         }

         if (x != null && L != -1 && GameMidlet.k.aQ > 0) {
            ++C.d;
            if (C.d >= 10) {
               C.d = 0;
            }
         }

         if (++V >= 6) {
            V = 0;
            return;
         }
      } catch (Exception var7) {
      }
   }

   public static void d() {
      if (u != null) {
         int var0 = 0;
         int var1 = n.size();

         for(int var2 = 0; var2 < var1; ++var2) {
            ik var3;
            if ((var3 = (ik)n.elementAt(var2)).d != 4 && var3 == u) {
               var0 = var2;
               break;
            }
         }

         u = null;
         int var4 = var0 + 1;

         while(var4 < var1 && !a(var4)) {
            ++var4;
         }

         if (u == null) {
            var4 = 0;

            while(var4 <= var0 && !a(var4)) {
               ++var4;
            }
         }
      }
   }

   private static boolean a(int var0) {
      ik var1;
      if ((var1 = (ik)n.elementAt(var0)).d != 4
         && var1 != GameMidlet.k
         && var1.d != 6
         && Math.abs(var1.a - GameMidlet.k.a) / j < (var1.d == 7 ? M << 1 : M)
         && Math.abs(var1.b - GameMidlet.k.b) / j < (var1.d == 7 ? M << 1 : M)) {
         if (var1.d != 0 || !((i3)var1).t) {
            u = var1;
         }

         if (var1.d == 0 && !((i3)var1).t) {
            AutoController.J = (i3)n.elementAt(var0);
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean b(int var0) {
      if (var0 >= -125 && var0 < 0) {
         return true;
      } else {
         return var0 == -1
            || var0 == 108
            || var0 == 109
            || var0 == 57
            || var0 == 62
            || var0 == 0
            || var0 == 1
            || var0 == 2
            || var0 == 3
            || var0 == 4
            || var0 == 5
            || var0 == 6
            || var0 == 7
            || var0 == 8
            || var0 == 12
            || var0 == 11
            || var0 == 14
            || var0 == 15
            || var0 == 16
            || var0 == 13
            || var0 == 25
            || var0 == 24
            || var0 == 52
            || var0 == 53
            || var0 == 9
            || var0 == 58
            || var0 == 63
            || var0 == 59
            || var0 == 64
            || var0 == 56
            || var0 == 21
            || var0 == 68
            || var0 == 69
            || var0 == 70
            || var0 == 17
            || var0 == 18
            || var0 == 51
            || var0 == 71
            || var0 == 95
            || var0 == 96
            || var0 == 107
            || var0 == 10
            || var0 == 19;
      }
   }

   public static boolean c(int var0) {
      if (var0 >= -125 && var0 < 0) {
         return true;
      } else {
         return var0 == 55
            || var0 == 93
            || var0 == 78
            || var0 == 89
            || var0 == 27
            || var0 == 28
            || var0 == 29
            || var0 == 84
            || var0 == 85
            || var0 == 86
            || var0 == 83
            || var0 == 87
            || var0 == 54
            || var0 == 67
            || var0 == 81
            || var0 == 71
            || var0 == 79
            || var0 == 92
            || var0 == 52
            || var0 == 94
            || var0 == 95
            || var0 == 96
            || var0 == 97
            || var0 == 98
            || var0 == 100
            || var0 == 103
            || var0 == 101
            || var0 == 104
            || var0 == 23;
      }
   }

   public static boolean d(int var0) {
      if (var0 >= -125 && var0 < 0) {
         return true;
      } else {
         return var0 == 55
            || var0 == 93
            || var0 == 78
            || var0 == 89
            || var0 == 27
            || var0 == 28
            || var0 == 29
            || var0 == 84
            || var0 == 85
            || var0 == 86
            || var0 == 83
            || var0 == 87
            || var0 == 54
            || var0 == 71
            || var0 == 52
            || var0 == 94
            || var0 == 95
            || var0 == 96
            || var0 == 97
            || var0 == 98
            || var0 == 100
            || var0 == 103
            || var0 == 101
            || var0 == 104
            || var0 == 23;
      }
   }

   private void e() {
      k4.b(hq.Q, new g9());
   }

   public final boolean b(int var1, int var2) {
      int var3 = f(var1, var2);
      if ((k4.H == null || ew.c(var3)) && var3 != -2) {
         switch(var3) {
            case -1:
               AutoController.h();
               AutoController.s();
               if (b == 25) {
                  fj.g();
               }

               if (c != null) {
                  H.b((byte)-1);
               } else {
                  AutoController.h().j();
               }
               break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
               AutoController.h();
               AutoController.s();
               hv.b().b(var3, -1);
               break;
            case 9:
               this.e();
               break;
            case 10:
               k4.i();
               AutoController.h();
               AutoController.s();
               A = -1;
               hv.b().b(10, -1);
               break;
            case 12:
               this.e();
               break;
            case 17:
               this.e();
               break;
            case 19:
               k4.i();
               AutoController.h();
               AutoController.s();
               A = -1;
               hv.b().b(19, -1);
               break;
            case 20:
               hx.b().b((short)0);
               k4.i();
               break;
            case 21:
               fg.g().r();
               break;
            case 22:
            case 26:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 60:
            case 61:
            case 65:
            case 66:
            case 67:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 90:
            case 91:
            case 92:
            case 99:
            case 102:
            case 105:
            case 106:
            default:
               if (var3 >= -125 && var3 < 0) {
                  k4.i();
                  Y = var3;
                  hx.b().b((short)(var3 - -125));
                  break;
               }

               if (!GameMidlet.k.u && var2 / j == 0 && var3 == 88) {
                  if (AutoController.U) {
                     GameMidlet.k.u = true;
                  } else {
                     hv var14 = hv.b();
                     if (!AutoController.T) {
                        AutoController.T = true;
                        var14.a((byte)92);
                        var14.a();
                     }
                  }
               }

               return false;
            case 23:
               hx.b().g(9);
               k4.i();
               break;
            case 24:
               if (fj.C != null && fj.A == GameMidlet.k.f) {
                  fj.g().b(fj.A, fj.C, fj.J, fj.aR, fj.aS, fj.aX, fj.aW);
               } else {
                  k4.i();
                  fj.g().a(GameMidlet.k.f, true);
               }
               break;
            case 25:
               fj.g().B();
               break;
            case 27:
            case 56:
               if (b != 18 && b != 109 && b != 108) {
                  AutoController.h().C();
               }
               break;
            case 28:
               fj.g().z();
               break;
            case 29:
               k4.i();
               hv.b().b(AutoController.A);
               break;
            case 52:
               fj.g().w();
               break;
            case 53:
               fj.g();
               fj.E();
               break;
            case 54:
               return fs.g().c(var1, var2);
            case 55:
               k4.i();
               hx var13;
               (var13 = hx.b()).a((byte)-23);
               var13.a();
               break;
            case 57:
               AutoController.h();
               AutoController.s();
               AutoController.h().c((byte)1);
               break;
            case 58:
               AutoController.h().c((byte)2);
               break;
            case 59:
               AutoController.h().c((byte)3);
               break;
            case 62:
               AutoController.h();
               AutoController.s();
               AutoController.h().c((byte)6);
               break;
            case 63:
               AutoController.h().c((byte)7);
               break;
            case 64:
               AutoController.h().c((byte)8);
               break;
            case 68:
            case 69:
            case 70:
               AutoController.h();
               AutoController.g(var3 - 67);
               break;
            case 71:
               k4.i();
               hx.b().d((byte)-1);
               break;
            case 78:
               AutoController.h().b(hq.co, 5);
               break;
            case 83:
               int var10000 = var1 / j;
               var3 = var2 / j;
               var2 = var10000;
               if (f5.o != null) {
                  for(int var12 = 0; var12 < f5.o.size(); ++var12) {
                     g1 var4 = (g1)f5.o.elementAt(var12);

                     for(int var5 = 0; var5 < var4.h.size(); ++var5) {
                        cn var6;
                        if ((var6 = (cn)var4.h.elementAt(var5)).b == var2 && var6.c == var3 && b + 1 == var6.d) {
                           Vector var18;
                           (var18 = new Vector()).addElement(new ag(hq.A, new hc(var4)));
                           var18.addElement(new ag(hq.e, new hd()));
                           k4.b(var4.d, var18);
                           return true;
                        }
                     }
                  }
               }
               break;
            case 84:
               fj.g().b((byte)2);
               break;
            case 85:
               fj.g().b((byte)3);
               break;
            case 86:
               var1 = g(var1, var2);
               var2 = g(iv.R.b, iv.R.c);
               fj.g();
               fj.b(2, var1 - var2, fj.I);
               break;
            case 87:
               var1 = g(var1, var2);
               var2 = g(iz.T.b, iz.T.c);
               fj.g();
               fj.b(1, var1 - var2, fj.H);
               break;
            case 89:
               byte var9;
               if (b == 108 || b == 109) {
                  var9 = 1;
               } else if (b == 13) {
                  var9 = 2;
               } else {
                  var9 = 3;
               }

               hx.b().k(var9);
               k4.i();
               break;
            case 93:
               AutoController.h().b(hq.co, 4);
               break;
            case 94:
               hx.b().k(4);
               k4.i();
               break;
            case 95:
               k4.i();
               fj.aU = GameMidlet.k.a;
               fj.aV = GameMidlet.k.b;
               h2.b().g(0, 0);
               break;
            case 96:
               k4.i();
               fj.aU = GameMidlet.k.a;
               fj.aV = GameMidlet.k.b;
               h2.b().h(0, 0);
               break;
            case 97:
               fj.g().C();
               break;
            case 98:
               fj.g().D();
               break;
            case 100:
               AutoController.h();
               AutoController.i(5);
               break;
            case 101:
               AutoController.h();
               AutoController.i(6);
               break;
            case 103:
               AutoController.h();
               AutoController.i(3);
               break;
            case 104:
               AutoController.h();
               AutoController.i(4);
               break;
            case 107:
               k4.i();
               AutoController.O = b;
               hx.b().g(12);
               break;
            case 108:
            case 109:
               N = GameMidlet.k.a;
               O = GameMidlet.k.b;
               k4.i();
               AutoController.ah = 1;
               AutoController.ag = 0;
               hx.b().b((short)4);
               break;
            case 110:
               k4.i();
               h4.b().i(GameMidlet.k.f);
               break;
            case 111:
               k4.i();
               hx var8;
               (var8 = hx.b()).a((byte)-105);
               var8.a();
               break;
            case 112:
               if (GameMidlet.k.q != 14) {
                  fg.g().X = GameMidlet.k.b;
                  if ((var1 = var1 / j * j + j / 2 + 1) < GameMidlet.k.a) {
                     fg.g().W = var1 + j;
                  } else {
                     fg.g().W = var1 - j;
                  }

                  GameMidlet.k.b(var1, var2 / j * j + 5);
                  AutoController.h();
                  AutoController.b(GameMidlet.k.a, GameMidlet.k.b, GameMidlet.k.s, GameMidlet.k.al);
                  GameMidlet.k.b((byte)14);
                  h4.b().d(14);
               }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void b(Graphics var0) {
      if (E != null) {
         for(int var1 = 0; var1 < E.size(); ++var1) {
            ((i4)E.elementAt(var1)).b(var0);
         }
      }
   }

   public final void c(Graphics var1) {
      k4.d(var1);
      k4.d(var1);
      var1.translate(-cl.b().c, -cl.b().d);
      this.d(var1);
   }

   public final void d(Graphics var1) {
      Graphics var3 = var1;
      gx var2 = this;
      if (c == null) {
         var1.setColor(1);
         var1.fillRect(cl.b().c, cl.b().d, k4.o, k4.p);
      } else {
         var1.setColor(z);
         var1.fillRect(cl.b().c, cl.b().d, k4.o, k4.p);
         int var4 = cl.b().c * 30 / 210;
         int var5 = (cl.b().c - var4) / (96 * ev.a);
         int var6 = -(94 - j + j / 2) * ev.a;
         if (b == 107) {
            var6 += 41 * ev.a;
         }

         for(int var7 = var5; var7 <= var5 + k4.o / (96 * ev.a) + 1; ++var7) {
            var3.drawImage(c, var4 + var7 * 96 * ev.a, var6, 0);
         }

         if (p != null) {
            for(int var8 = 0; var8 < p.size(); ++var8) {
               cn var9 = (cn)p.elementAt(var8);
               int var15 = cl.b().c * (30 + var9.e * 3) / 210;
               f5.b(var3, var9.d, var9.b + var15, var9.c, 33);
            }
         }

         int var16;
         if ((var16 = s.size()) > 0) {
            for(int var18 = 0; var18 < var16; ++var18) {
               cn var23 = (cn)s.elementAt(var18);
               var3.setColor(t[var23.d]);
               var3.fillRect(var23.b + var4, var23.c, 1, 1);
            }
         }

         if (this.r != null) {
            for(int var19 = 0; var19 < var2.r.length; ++var19) {
               var3.drawImage(fc.aa[0], var2.r[var19].b, var2.r[var19].c, 0);
            }
         }

         if (k4.E.size() > 0) {
            for(int var20 = 0; var20 < k4.E.size(); ++var20) {
               k4.E.elementAt(var20);
            }
         }

         if (D != null) {
            for(int var21 = 0; var21 < D.size(); ++var21) {
               ((i4)D.elementAt(var21)).b(var3);
            }
         }

         if (k4.o > f * j) {
            var3.setColor(0);
            var3.fillRect(cl.b().c, cl.b().d, -cl.b().c, k4.p);
            var3.fillRect(f * j * ev.a, cl.b().d, -cl.b().c, k4.p);
         }
      }

      Graphics var10 = var1;
      int var12;
      if ((var12 = (cl.b().c + k4.o) / j + 1) > f) {
         var12 = f;
      }

      int var13;
      if ((var13 = (cl.b().d + k4.p) / j + 1) > g) {
         var13 = g;
      }

      int var14;
      if ((var14 = cl.b().c / (j * ev.a)) < 0) {
         var14 = 0;
      }

      for(int var24 = 0; var24 < var13; ++var24) {
         for(int var11 = var14; var11 < var12; ++var11) {
            short var17;
            if ((var17 = e[var24 * f + var11]) != -1) {
               int var22 = var17 / d.d;
               d.c(var22, var17 % d.d, var11 * j * ev.a, var24 * j * ev.a, var10);
            }
         }
      }

      if (x != null && L != -1 && GameMidlet.k.aQ > 0) {
         x.b(C.d / 2, C.b, C.c, L, 3, var1);
      }
   }

   public final void e(Graphics var1) {
      Graphics var3 = var1;
      gx var2 = this;
      this.S = 0;
      this.T = 0;
      this.U = 0;

      while(var2.S < n.size() || var2.T < m.size() || var2.U < o.size()) {
         var2.P = var2.Q = var2.R = null;
         if (var2.S < n.size()) {
            var2.P = (ik)n.elementAt(var2.S);
         }

         if (var2.T < m.size()) {
            var2.Q = (ik)m.elementAt(var2.T);
         }

         if (var2.U < o.size()) {
            var2.R = (is)o.elementAt(var2.U);
         }

         if (var2.P == null || var2.Q != null && var2.P.b >= var2.Q.b || var2.R != null && var2.P.b >= var2.R.b) {
            if (var2.Q == null || var2.R != null && var2.Q.b >= var2.R.b) {
               if (var2.R != null) {
                  var2.R.b(var3);
                  ++var2.U;
               }
            } else {
               var2.Q.b(var3);
               ++var2.T;
            }
         } else {
            var2.P.b(var3);
            ++var2.S;
         }
      }

      if (k4.ah == 0 && u != null) {
         var1.drawImage(AutoController.C, u.a * ev.a, (u.b - (u.d == 7 ? 10 : u.e)) * ev.a - V / 2, 3);
      }

      if (bq.j) {
         H.b(var1);
      }
   }

   private static void f() {
      s.removeAllElements();
      if (k != 0 && q != 0 && l == -1) {
         if (b != 9 && b != 12) {
            int var2 = b2.e(k4.o / 10);

            for(int var3 = 0; var3 < var2; ++var3) {
               s.addElement(new cn(b2.e(f * j), -(38 + b2.e(k4.r)), b2.e(4)));
            }
         } else {
            int var0 = b2.e(k4.o / 10);

            for(int var1 = 0; var1 < var0; ++var1) {
               s.addElement(new cn(b2.e(f * j), -(98 + b2.e(k4.r)), b2.e(4)));
            }
         }
      }
   }

   public static InputStream e(int var0) {
      bp.b = new bp(a[12]);
      String var4 = String.valueOf(var0);
      String var1 = var4;
      bp var5 = bp.b;
      int var2 = 0;

      byte[] var10000;
      while(true) {
         if (var2 >= var5.g) {
            var10000 = null;
            break;
         }

         if (var5.c[var2].compareTo(var1) == 0) {
            byte[] var7 = new byte[var5.e[var2]];
            System.arraycopy(var5.f, var5.d[var2], var7, 0, var5.e[var2]);
            var10000 = var7;
            break;
         }

         ++var2;
      }

      byte[] var6 = var10000;
      ByteArrayInputStream var8 = null;
      if (var6 != null) {
         try {
            var8 = new ByteArrayInputStream(var6);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

      return var8;
   }

   public final void f(int var1) {
      if (jp.b().g) {
         k4.O = 0;
         k4.h();
      }

      if (k4.H != null) {
         k4.H = null;
      }

      k4.b.c();
      GameMidlet.k.aQ = 0;
      G = -1;
      v.b = hq.bp;
      k4.E.removeAllElements();
      GameMidlet.k.t = false;
      bq.j = false;
      cl.p = false;
      byte var3 = 0;
      i3 var2 = GameMidlet.k;
      GameMidlet.k.q = var3;
      j();
      AutoController.N.removeAllElements();
      u = null;
      AutoController.J = null;
      int var10;
      if ((var10 = Calendar.getInstance().get(11)) < 18 && var10 >= 6) {
         k = 0;
      } else {
         k = 1;
      }

      z = y[k];
      int var11;
      if ((var11 = var1 - 1) == 107 || var11 >= 0 && var11 < i.length && i[var11] != -1) {
         if (var11 == 107 || B != i[var11] || A != k) {
            if (var11 == 107) {
               var3 = 0;
            } else {
               var3 = i[var11];
            }

            B = var3;
            bp.c(hq.at);
            Image var4 = bp.b(String.valueOf((int)var3) + k);
            Image var12 = bp.b(String.valueOf(k));
            Graphics var17 = (c = Image.createImage(96 * ev.a, 96 * ev.a)).getGraphics();
            ib.b(0, 0, 96 * ev.a, 10 * ev.a, y[k], var17);
            var17.drawImage(var12, 0, 69 * ev.a, 36);
            var17.drawImage(var4, 0, 96 * ev.a, 36);
            bp.b();
         }
      } else {
         B = -1;
         c = null;
      }

      if (A != k || d == null) {
         if (var1 - 1 == 19) {
            try {
               A = -1;
               StringBuffer var10002 = new StringBuffer(String.valueOf(hq.b()));
               String[] var5 = a;
               d = new g_(Image.createImage(var10002.append(var5[4]).toString()), j * ev.a, j * ev.a);
            } catch (IOException var8) {
               var8.printStackTrace();
            }
         } else if (var1 - 1 != 107) {
            j = 24;
            A = k;
            StringBuffer var10000 = new StringBuffer(String.valueOf(hq.b()));
            String[] var20 = a;
            InputStream var13 = b2.d(var10000.append(var20[6]).append(k).toString());
            InputStream var18 = b2.d(hq.b() + var20[9]);

            try {
               byte[] var19 = new byte[var13.available()];
               var13.read(var19);
               byte[] var14 = new byte[var18.available()];
               var18.read(var14);
               d = new g_(b2.b(var19, var14), j * ev.a, j * ev.a);
            } catch (IOException var7) {
               var7.printStackTrace();
            }
         } else {
            try {
               j = 12;
               A = -1;
               StringBuffer var22 = new StringBuffer(String.valueOf(hq.b()));
               String[] var21 = a;
               d = new g_(Image.createImage(var22.append(var21[5]).toString()), j * ev.a, j * ev.a);
            } catch (IOException var6) {
               var6.printStackTrace();
            }
         }
      }

      InputStream var15;
      if ((var15 = e(var1)) != null) {
         g = 8;
         switch(var1 - 1) {
            case 9:
               g = 8;
               break;
            case 10:
               g = 9;
            case 11:
            case 13:
            case 24:
            default:
               break;
            case 17:
               g = 6;
               break;
            case 18:
               g = 10;
               break;
            case 19:
               g = 13;
               break;
            case 20:
            case 57:
            case 58:
            case 59:
            case 62:
            case 63:
            case 64:
            case 100:
            case 101:
            case 103:
            case 104:
            case 109:
               g = 11;
               break;
            case 21:
               g = 7;
               break;
            case 25:
               g = 7;
               break;
            case 60:
            case 61:
            case 65:
               g = 5;
               break;
            case 107:
               g = 16;
               break;
            case 108:
               g = 8;
         }
      }

      b(var15, var1, true);
      b = var1 - 1;
      new StringBuffer(a[2]).append(b);
      if (l != -1 && b < i.length && i[b] != -1) {
         g0 var9 = new g0(l, 0);
         k4.E.addElement(var9);
      }

      this.i();
      f();
      if (jp.b().g && GameMidlet.k.E != null) {
         c(GameMidlet.k);
      }

      if (k4.O == 0) {
         k4.O = 1;
      }

      System.gc();
   }

   public static void b(InputStream var0, int var1, boolean var2) {
      short var3 = 0;
      byte var4 = 0;
      byte var5 = 0;
      byte var6 = 0;
      byte var7 = 0;
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      byte var11 = 0;
      byte var12 = 0;
      byte var13 = 0;
      byte var14 = 0;
      byte var15 = 0;
      byte var16 = 0;
      byte var17 = 0;
      byte var18 = 0;
      byte var19 = 0;
      byte var20 = 0;
      byte var21 = 0;
      byte var22 = 0;
      byte var23 = 0;
      byte var24 = 0;
      byte var25 = 0;
      byte var26 = 0;
      byte var27 = 0;
      byte var28 = 0;
      byte var29 = 0;
      byte var30 = 0;
      byte var31 = 0;
      byte var32 = 0;
      byte var33 = 0;
      byte var34 = 0;
      byte var35 = 0;
      byte var36 = 0;
      byte var37 = 0;
      byte var38 = 0;
      byte var39 = 0;
      byte var40 = 0;
      byte var41 = 0;
      byte var42 = 0;
      byte var43 = 0;
      W = 0;
      byte[] var44 = new byte[13];

      try {
         if (var0 != null) {
            f = (short)(var0.available() / g);
            e = new short[g * f];
         }

         if (var2) {
            h = new short[g * f];
         }

         for(int var45 = 0; var45 < g * f; ++var45) {
            if (var0 != null) {
               e[var45] = (short)var0.read();
               if (e[var45] == 255) {
                  e[var45] = -1;
               }
            }
         }

         if (var1 - 1 == 19) {
            AutoController.R = new Vector();

            for(int var55 = 0; var55 < e.length; ++var55) {
               if (e[var55] < 32) {
                  h[var55] = 80;
               } else {
                  h[var55] = 88;
               }

               if (e[var55] == 65) {
                  h[var55] = 10;
                  e[var55] = 1;
                  if (var42 == 1) {
                     e[var55] = 16;
                     GameMidlet.k.a = GameMidlet.k.l = h(var55) + j;
                     GameMidlet.k.b = GameMidlet.k.m = i(var55) + 12;
                     b(hq.ar, h(var55) + j / 2, i(var55) + 12);
                  }

                  ++var42;
               } else if (e[var55] == 27) {
                  cn var46;
                  (var46 = new cn()).b = h(var55);
                  var46.c = i(var55);
                  var46.f = (short)((5 - AutoController.R.size() % 6 << 1) + AutoController.R.size() / 6);
                  AutoController.R.addElement(var46);
               }
            }

            i3 var56;
            i3 var10000 = var56 = new i3();
            var10000.a = var10000.l = 26 * j;
            var56.b = var56.m = 8 * j + j / 2;
            var56.g = a[1];
            var56.f = -100;
            var56.b(new gl((short)2480));
            var56.s = var56.U = it.r;
            n.addElement(var56);
         } else if (var1 - 1 == 107) {
            for(int var57 = 0; var57 < g * f; ++var57) {
               if (e[var57] == 61 && b2.e(2) == 1) {
                  i3 var60 = new i3();
                  i3 var51 = (i3)fe.g().av.elementAt(b2.e(fe.g().av.size()));
                  var60.E = var51.E;
                  var60.a = var60.l = h(var57) + 12;
                  var60.b = var60.m = i(var57) + 12;
                  var60.q = 2;
                  var60.d = 9;
                  n.addElement(var60);
               }

               if (e[var57] == 59) {
                  ir var61 = new ir(1084, h(var57) + j, i(var57));
                  m.addElement(var61);
               } else if (e[var57] == 60) {
                  ir var62 = new ir(1085, h(var57) + j, i(var57));
                  m.addElement(var62);
               }
            }
         } else {
            for(int var58 = 0; var58 < g * f; ++var58) {
               label598: {
                  if (e[var58] != -4) {
                     if (e[var58] == -5) {
                        h[var58] = 88;
                        break label598;
                     }

                     if (e[var58] == -3 || e[var58] == -6) {
                        break label598;
                     }

                     if (e[var58] >= 120 && e[var58] <= 123) {
                        h[var58] = 80;
                     } else if (e[var58] >= 114 && e[var58] <= 119) {
                        h[var58] = 80;
                     } else if (e[var58] == 67 || e[var58] == 85) {
                        h[var58] = 92;
                     } else if (e[var58] >= 20 && e[var58] <= 23) {
                        h[var58] = 79;
                     } else if (e[var58] < 7) {
                        h[var58] = 80;
                     } else {
                        h[var58] = 88;
                     }

                     if (e[var58] >= 44 && e[var58] <= 55) {
                        h[var58] = 80;
                     }

                     if (e[var58] == 62 && var1 - 1 != 62 && var1 - 1 != 101 && var1 - 1 != 104 && var1 - 1 != 103 && var1 - 1 != 100 && var1 - 1 != 101) {
                        h[var58] = 56;
                     }

                     if (e[var58] != 111 && e[var58] != 112) {
                        break label598;
                     }
                  }

                  h[var58] = 80;
               }

               if (var0 != null || GameMidlet.f != 11) {
                  switch(e[var58]) {
                     case -1:
                        h[var58] = 88;
                        break;
                     case 0:
                     case 1:
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                     case 8:
                     case 9:
                     case 10:
                     case 11:
                     case 12:
                     case 13:
                     case 14:
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     case 19:
                     case 20:
                     case 21:
                     case 22:
                     case 23:
                     case 29:
                     case 30:
                     case 31:
                     case 32:
                     case 33:
                     case 34:
                     case 35:
                     case 36:
                     case 37:
                     case 38:
                     case 39:
                     case 40:
                     case 41:
                     case 42:
                     case 43:
                     case 44:
                     case 45:
                     case 46:
                     case 47:
                     case 48:
                     case 49:
                     case 50:
                     case 51:
                     case 52:
                     case 53:
                     case 54:
                     case 55:
                     case 56:
                     case 57:
                     case 58:
                     case 59:
                     case 60:
                     case 61:
                     case 62:
                     case 64:
                     case 66:
                     case 67:
                     case 68:
                     case 69:
                     case 70:
                     case 71:
                     case 72:
                     case 73:
                     case 74:
                     case 75:
                     case 76:
                     case 77:
                     case 78:
                     case 79:
                     case 80:
                     case 81:
                     case 82:
                     case 83:
                     case 84:
                     case 85:
                     case 86:
                     case 87:
                     case 88:
                     case 89:
                     case 90:
                     case 91:
                     case 92:
                     case 93:
                     case 94:
                     case 95:
                     case 96:
                     case 99:
                     case 100:
                     case 101:
                     case 103:
                     case 104:
                     case 105:
                     case 106:
                     case 107:
                     case 108:
                     case 109:
                     case 111:
                     case 112:
                     case 113:
                     case 114:
                     case 115:
                     case 116:
                     case 117:
                     case 118:
                     case 119:
                     case 120:
                     case 121:
                     case 122:
                     case 123:
                     case 124:
                     case 125:
                     case 126:
                     case 146:
                     case 154:
                     case 168:
                     case 169:
                     case 170:
                     case 171:
                     default:
                        var36 = 0;
                        var26 = 0;
                        break;
                     case 24:
                     case 25:
                     case 26:
                        if (var2) {
                           b(845, h(var58) + 11, i(var58));
                        }
                        break;
                     case 27:
                        if (var2) {
                           b(844, h(var58) + 11, i(var58) + 1);
                        }
                        break;
                     case 28:
                        if (var2) {
                           if (!jp.b().c()) {
                              e[var58] = 4;
                           } else {
                              b(0, h(var58) + j / 2, i(var58) + j - 2);
                           }
                        }
                        break;
                     case 63:
                     case 65:
                        if (var1 - 1 != 101 && var1 - 1 != 104 && var1 - 1 != 103 && var1 - 1 != 100 && var1 - 1 != 101) {
                           h[var58] = 56;
                           c(var58, var24++, 0);
                           if (var1 - 1 == 57 || var1 - 1 == 62) {
                              b(hq.ar, h(var58) - 12, i(var58) + 12);
                           } else if (var1 - 1 != 58 && var1 - 1 != 63) {
                              b(hq.ar, h(var58) - 12, i(var58) + 12);
                           } else {
                              b(hq.ar, h(var58) + 12, i(var58) + 36);
                           }
                        }
                        break;
                     case 97:
                        h[var58] = 54;
                        break;
                     case 98:
                        h[var58] = 29;
                        c(846, var58);
                        if (var1 - 1 == 108 || var1 - 1 == 109) {
                           e[var58] = 56;
                        }
                        break;
                     case 102:
                        h[var58] = 92;
                        ft.af.addElement(new cn(h(var58) + j / 2, i(var58) + j));
                        cn var53 = new cn(-20, i(var58) + j);
                        if (var27 % 2 == (var1 == 66 ? 0 : 1)) {
                           var53.b = (k4.o + 20) / ev.a;
                        }

                        ft.ag.addElement(var53);
                        ++var27;
                        break;
                     case 110:
                        fj.ag = new cn(h(var58) - j + 8, i(var58) - 2);
                        b(847, h(var58) + 11, i(var58));
                        break;
                     case 127:
                        if (var33 == 0) {
                           b(830, h(var58) + 36, i(var58) + j - 2);
                           c(var58, var33++, 2);
                        }

                        b(var58, (byte)108, 96);
                        break;
                     case 128:
                        if (var3 == 0) {
                           c(828, var58);
                           c(var58, var3++, 2);
                        }

                        b(var58, (byte)55, 5);
                        e[var58] = e[var58 + f];
                        break;
                     case 129:
                     case 160:
                        if (var4 == 0) {
                           if (var1 - 1 == 17) {
                              c(836, var58);
                           } else {
                              c(829, var58);
                           }

                           c(var58, var4++, 2);
                        }

                        b(var58, (byte)(e[var58] == 129 ? 57 : 62), 96);
                        break;
                     case 130:
                     case 131:
                     case 132:
                     case 133:
                     case 134:
                     case 135:
                     case 136:
                     case 137:
                     case 138:
                        int var63 = e[var58] - 130;
                        ++var44[var63];
                        c(var58, var44[var63], 0);
                        b(var58, (byte)var63);
                        break;
                     case 139:
                        h[var58] = -1;
                        c(var58, var26++, 0);
                        if (b == -1 && var1 != 21 && c != null) {
                           bq.i = new cn(h(var58) + j / 2, i(var58) - j / 2);
                           H.b((byte)1);
                        }

                        b(var58, e);
                        break;
                     case 140:
                        c(var58, var25++, 0);
                        b(var58, (byte)25, 55);
                        ++var25;
                        break;
                     case 141:
                        if (var6 == 0) {
                           c(840, var58);
                           c(var58, var6++, 0);
                        }

                        b(var58, (byte)24, 5);
                        e[var58] = e[var58 + f];
                        break;
                     case 142:
                        b(var58, (byte)80, 7);
                        int var10004 = var58 % f;
                        fj.g().W[var13] = new cn(var10004, var58 / f, 0);
                        ++var13;
                        break;
                     case 143:
                        if (var5 == 0) {
                           c(831, var58);
                           c(var58, var5++, 2);
                        }

                        b(var58, (byte)52, 51);
                        e[var58] = e[var58 + f];
                        break;
                     case 144:
                        if (var7 == 0) {
                           c(841, var58);
                           c(var58, var7++, 2);
                        }

                        b(var58, (byte)53, 5);
                        break;
                     case 145:
                        c(var58, W++, 0);
                        if (var1 - 1 != 109 && (var1 - 1 != 57 || b != 17)) {
                           if (b == 23) {
                              b(var58, (byte)23, -1);
                           } else {
                              b(var58, (byte)9, -1);
                              if (var1 - 1 == 100) {
                                 e[var58] = 47;
                              }
                           }
                        } else {
                           b(var58, (byte)17, -1);
                        }
                        break;
                     case 147:
                     case 161:
                        if (var8 == 0) {
                           c(832, var58);
                           c(var58, var8++, 2);
                        }

                        b(var58, (byte)(e[var58] == 147 ? 58 : 63), 96);
                        break;
                     case 148:
                     case 162:
                        if (var9 == 0) {
                           if (var1 == 18) {
                              b(836, h(var58) + 24, i(var58) + j - 2);
                           } else {
                              b(833, h(var58) + 48, i(var58) + j - 2);
                           }

                           c(var58, var9++, 2);
                        }

                        b(var58, (byte)(e[var58] == 148 ? 59 : 64), 96);
                        break;
                     case 149:
                        if (var10 == 0) {
                           c(834, var58);
                           if (GameMidlet.k.f == fj.A) {
                              c(var58, var10, 2);
                           }

                           ++var10;
                        }

                        b(var58, (byte)28, 4);
                        break;
                     case 150:
                        if (var32 == 0) {
                           c(842, var58);
                        }

                        b(var58, (byte)93, 0);
                        if (var1 == 26) {
                           e[var58] = 4;
                        }

                        ++var32;
                        break;
                     case 151:
                        if (var34 == 0) {
                           c(843, var58);
                        }

                        b(var58, (byte)78, 0);
                        ++var34;
                        break;
                     case 152:
                        if (var11 == 0) {
                           c(835, var58);
                        }

                        b(var58, (byte)81, var1 - 1 == 25 ? 55 : 0);
                        ++var11;
                        break;
                     case 153:
                        if (var28 == 0) {
                           c(var58, var28++, 0);
                        }

                        b(var58, (byte)11);
                        break;
                     case 155:
                        b(var58, (byte)80, 55);
                        if (iv.S > 0) {
                           b(var58, (byte)84, 112);
                           b(-5, h(var58) + j / 2, i(var58) + j / 2);
                           iv.Q = new cn(h(var58) + j / 2, i(var58) + j / 2);
                        }
                        break;
                     case 156:
                        b(var58, (byte)80, 5);
                        if (iw.R > 0) {
                           b(var58, (byte)85, 5);
                           b(-6, h(var58) + j / 2, i(var58) + j / 2);
                           iw.Q = new cn(h(var58) + j / 2, i(var58) + j / 2);
                        }
                        break;
                     case 157:
                        b(var58, (byte)80, 111);
                        iv.R = new cn(h(var58) + j / 2, i(var58) + j / 2);
                        break;
                     case 158:
                        b(var58, (byte)80, 5);
                        if (iz.S > 0) {
                           iz.T = new cn(h(var58) + j / 2, i(var58) + j / 2);
                        }
                        break;
                     case 159:
                        var42 = 4;
                        if (var1 - 1 == 25) {
                           var42 = 5;
                        } else if (var1 - 1 == 108 || var1 - 1 == 109) {
                           var42 = 47;
                        } else if (var1 - 1 == 13) {
                           var42 = 0;
                        }

                        b(var58, (byte)89, var42);
                        c(848, var58);
                        break;
                     case 163:
                        c(var58, W++, 0);
                        b(var58, (byte)12, -1);
                        break;
                     case 164:
                        c(var58, var44[9], 0);
                        ++var44[9];
                        b(var58, (byte)13, 6);
                        break;
                     case 165:
                        c(var58, var44[10], 0);
                        b(var58, (byte)14, 0);
                        ++var44[10];
                        break;
                     case 166:
                        c(var58, var44[11], 0);
                        b(var58, (byte)15, 0);
                        ++var44[11];
                        break;
                     case 167:
                        c(var58, var44[12], 0);
                        ++var44[12];
                        b(var58, (byte)16, 43);
                        break;
                     case 172:
                        b(var58, (byte)88, 96);
                        if (var29 % 3 == 0) {
                           b(836, h(var58) + 37, i(var58) + j);
                        }

                        ++var29;
                        break;
                     case 173:
                        b(var58, (byte)88, 96);
                        if (var30 % 4 == 0) {
                           b(837, h(var58) + 48, i(var58) + j);
                        }

                        ++var30;
                        break;
                     case 174:
                        b(var58, (byte)88, 96);
                        if (var31 % 4 == 0) {
                           b(838, h(var58) + 48, i(var58) + j);
                        }

                        ++var31;
                        break;
                     case 175:
                        c(var58, var14++, 0);
                        b(var58, (byte)68, 96);
                        break;
                     case 176:
                        c(var58, var15++, 0);
                        b(var58, (byte)69, 96);
                        break;
                     case 177:
                        c(var58, var16++, 0);
                        b(var58, (byte)70, 96);
                        break;
                     case 178:
                        if (var33 == 0) {
                           b(830, h(var58) + j, i(var58) + j - 2);
                           c(var58, var33++, 2);
                        }

                        b(var58, (byte)109, 96);
                        break;
                     case 179:
                        if (var16 == 0) {
                           c(var58, var16++, 2);
                           c(837, var58);
                        }

                        b(var58, (byte)18, 96);
                        break;
                     case 180:
                        c(var58, var16++, 0);
                        b(var58, (byte)17, 77);
                        if (var1 - 1 == 101) {
                           e[var58] = 0;
                        }
                        break;
                     case 181:
                        if (var1 - 1 != 101 && var1 - 1 != 104 && var1 - 1 != 103 && var1 - 1 != 100 && var1 - 1 != 101) {
                           if (var35 == 0) {
                              b(hq.ar, h(var58) + j / 2, i(var58) + j / 2);
                           }

                           ++var35;
                           b(var58, (byte)56, 46);
                        }
                        break;
                     case 182:
                        fj.ah = new cn(h(var58), i(var58));
                        b(var58, (byte)80, 39);
                        break;
                     case 183:
                        fj.ai = new cn(h(var58) + 24, i(var58) + 24);
                        b(var58, (byte)88, 13);
                     case 184:
                        break;
                     case 185:
                        if (var36 == 1 && var1 == 18) {
                           b(975, h(var58) + 24, i(var58) + 24);
                        }

                        if (var1 == 18) {
                           b(var58, (byte)71, 43);
                           if (var36 == 2) {
                              b(hq.ar, h(var58), i(var58) + 25);
                           }
                        } else {
                           c(var58, var36++, 0);
                           b(var58, (byte)71, 47);
                        }

                        ++var36;
                        break;
                     case 186:
                        if (++var37 == 3) {
                           b(hq.ar, h(var58), i(var58) + 24);
                        }

                        b(var58, (byte)94, 17);
                        if (var37 == 2) {
                           b(974, h(var58) + 24, i(var58) + 24);
                        }
                        break;
                     case 187:
                        if (var38 == 0 && fj.A == GameMidlet.k.f) {
                           m.addElement(new il(-10, h(var58) + 20, i(var58) + 20, fj.N.getWidth()));
                        }

                        ++var38;
                        b(var58, (byte)(fj.A == GameMidlet.k.f ? 95 : 80), 4);
                        break;
                     case 188:
                        if (fj.A == GameMidlet.k.f) {
                           m.addElement(new il(-10, h(var58) + 20, i(var58) + 20, fj.N.getWidth()));
                        }

                        b(var58, (byte)(fj.A == GameMidlet.k.f ? 96 : 80), 4);
                        break;
                     case 189:
                        fj.aC.a = h(var58) + 12;
                        fj.aC.b = i(var58) + 12;
                        if (GameMidlet.k.f == fj.A) {
                           h[var58] = 97;
                        }

                        e[var58] = 4;
                        m.addElement(fj.aC);
                        if (GameMidlet.k.f != fj.A) {
                        }
                        break;
                     case 190:
                        h[var58] = 98;
                        e[var58] = 4;
                        if (var39 == 0) {
                           b(1029, h(var58) + 36, i(var58) + 20);
                           fj.a0 = h(var58) + 26;
                           fj.a1 = i(var58) + 10;
                           if (fj.A == GameMidlet.k.f) {
                              b(hq.ar, h(var58) + 36, i(var58) + 24);
                           }
                        }

                        ++var39;
                        break;
                     case 191:
                        h[var58] = 23;
                        if (var1 - 1 == 104) {
                           e[var58] = 0;
                           if (var17 == 1) {
                              b(hq.ar, h(var58) + 12, i(var58) + 12);
                           }
                        } else {
                           if (var17 % 2 == 0) {
                              e[var58] = 46;
                           } else {
                              e[var58] = 44;
                           }

                           if (var17 == 1) {
                              b(hq.ar, h(var58) + 24, i(var58) + 12);
                           }
                        }

                        ++var17;
                        break;
                     case 192:
                        h[var58] = 99;
                        e[var58] = 4;
                        if (var22 == 0) {
                           b(1034, h(var58) + 36, i(var58) + 24);
                        }

                        ++var22;
                        break;
                     case 193:
                        h[var58] = 100;
                        e[var58] = 4;
                        if (var21 == 1) {
                           b(1032, h(var58) + 24, i(var58) + 24);
                           b(hq.ar, h(var58) + 24, i(var58) + 30);
                        }

                        ++var21;
                        break;
                     case 194:
                        h[var58] = 106;
                        e[var58] = 4;
                        if (var23 == 0) {
                           b(1030, h(var58) + 24, i(var58) + 24);
                        }

                        ++var23;
                        break;
                     case 195:
                        h[var58] = 102;
                        e[var58] = 4;
                        if (var19 == 1) {
                           b(1037, h(var58) + 24, i(var58) + 24);
                        }

                        ++var19;
                        break;
                     case 196:
                        h[var58] = 103;
                        e[var58] = 4;
                        if (var18 == 1) {
                           b(1035, h(var58) + 24, i(var58) + 24);
                           b(hq.ar, h(var58) + 24, i(var58) + 30);
                        }

                        ++var18;
                        break;
                     case 197:
                        h[var58] = 104;
                        e[var58] = 4;
                        if (var20 == 1) {
                           b(1033, h(var58) + 12, i(var58) + 24);
                           b(hq.ar, h(var58) + 24, i(var58) + 30);
                        }

                        ++var20;
                        break;
                     case 198:
                        h[var58] = 105;
                        e[var58] = 4;
                        b(1036, h(var58) + 12, i(var58) + 20);
                        break;
                     case 199:
                        h[var58] = 101;
                        e[var58] = 4;
                        if (var12 == 1) {
                           b(1031, h(var58) + 24, i(var58) + 24);
                           b(hq.ar, h(var58) + 24, i(var58) + 30);
                        }

                        ++var12;
                        break;
                     case 200:
                        h[var58] = 107;
                        if (var40 == 1) {
                           b(1075, h(var58) + 24, i(var58) + 24);
                           b(hq.ar, h(var58) + 24, i(var58) + 30);
                        }

                        ++var40;
                        e[var58] = 5;
                        break;
                     case 201:
                        h[var58] = 19;
                        e[var58] = 5;
                        if (var41 == 1) {
                           b(1094, h(var58) + 24, i(var58) + 20);
                           b(hq.ar, h(var58) + 24, i(var58) + 30);
                        }

                        ++var41;
                        break;
                     case 202:
                        b(var58, (byte)88, 96);
                        if (var43 % 4 == 0) {
                           b(4, h(var58) + (j << 1), i(var58) + j);
                        }

                        ++var43;
                        break;
                     case 203:
                        c(var58, var35++, 0);
                        b(var58, (byte)110, 96);
                        break;
                     case 204:
                        e[var58] = 43;
                        h[var58] = 10;
                        if (var41 == 1) {
                           b(hq.ar, h(var58), i(var58) + 30);
                        }

                        ++var41;
                  }
               }
            }
         }
      } catch (Exception var47) {
         var47.printStackTrace();
      }

      k(var1);
      b(m);
      if (b == 24 && fj.A != GameMidlet.k.f) {
         b = 53;
      }

      int var59 = b;
      if (b != -1 && G != -1) {
         var59 = X;
      }

      if (var1 - 1 != 19) {
         for(int var64 = 0; var64 < h.length; ++var64) {
            int var65 = var64 % f;
            int var87 = var64 / f;
            var3 = (short)var59;
            var2 = var87;
            int var48 = var65;
            if (h[var2 * f + var48] == var3) {
               cn var54;
               if ((var54 = g(var64)) != null) {
                  GameMidlet.k.a = var54.b;
                  GameMidlet.k.b = var54.c;
               }
               break;
            }
         }
      }

      if (var1 == 60) {
         GameMidlet.k.a = 150;
         GameMidlet.k.b = g * j - j;
      }

      if (Y != -1) {
         X = Y;
      }

      cl.b().r = GameMidlet.k;
      cl.b().c(var1);
      if (k4.M) {
         GameMidlet.k.p();
      }
   }

   private static cn g(int var0) {
      if (var0 + 1 < h.length && h[var0] == h[var0 + 1]) {
         for(int var3 = var0; var3 < h.length; ++var3) {
            if (h[var3] != h[var3 + 1]) {
               int var4 = j;
               if (var0 / f == g - 1) {
                  var4 = -j;
               }

               return new cn(h(var0) + (var3 - var0 + 1) * j / 2, i(var0) + j / 2 + var4);
            }
         }
      } else if (var0 + f < h.length && h[var0] == h[var0 + f]) {
         for(int var1 = var0; var1 < h.length; var1 += f) {
            if (h[var1] != h[var1 + f]) {
               int var2 = -j;
               if (var0 % f == 0) {
                  var2 = j;
               }

               return new cn(h(var0) + j / 2 + var2, i(var0) + ((var1 - var0) / f + 1) * j / 2);
            }
         }
      }

      return null;
   }

   public static void b(int var0, int var1, int var2) {
      if (G == -1) {
         Object var3;
         if (var0 > 0) {
            var3 = new ir(var0, var1, var2);
         } else {
            var3 = new il(var0, var1, var2, 0);
         }

         m.addElement(var3);
      }
   }

   private static void c(int var0, int var1) {
      if (G == -1) {
         ir var2 = new ir(var0, h(var1) + c(var1, e), i(var1) + j - 4);
         m.addElement(var2);
      }
   }

   private static int h(int var0) {
      return var0 % f * j;
   }

   private static int i(int var0) {
      return var0 / f * j;
   }

   private static void b(int var0, byte var1, int var2) {
      h[var0] = var1;
      e[var0] = (short)var2;
   }

   private static void b(int var0, byte var1) {
      h[var0] = var1;
      if (var0 / f == 0) {
         e[var0] = 43;
      } else {
         e[var0] = 6;
      }
   }

   public static void d(int var0, int var1) {
      h[var1 * f + var0] = 51;
   }

   private static void b(String var0, int var1, int var2) {
      if (jp.b().g) {
         m.addElement(new io(var0, var1, var2));
      }
   }

   public static s j(int var0) {
      int var1 = Z.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         s var3;
         if ((var3 = (s)Z.elementAt(var2)).b == var0) {
            return var3;
         }
      }

      return null;
   }

   public static void g() {
      if (aa != null && Z != null) {
         for(int var0 = 0; var0 < aa.size(); ++var0) {
            iq var1;
            s var2 = j((var1 = (iq)aa.elementAt(var0)).i);
            b(var1, var2);
            iq var3;
            (var3 = new iq(var1.f, var1.a * j, var1.b * j, var1.h, var1.i)).k = var1.k;
            m.addElement(var3);
         }

         b(m);
      }
   }

   private static void k(int var0) {
      for(int var1 = 0; var1 < f5.n.size(); ++var1) {
         iq var2;
         if ((var2 = (iq)f5.n.elementAt(var1)).f == var0) {
            s var3 = f5.c(var2.i);
            b(var2, var3);
            m.addElement(new iq(var2.f, var2.a * j, var2.b * j, var2.h, var2.i));
         }
      }

      if (f5.o != null) {
         for(int var5 = 0; var5 < f5.o.size(); ++var5) {
            g1 var6 = (g1)f5.o.elementAt(var5);

            for(int var7 = 0; var7 < var6.h.size(); ++var7) {
               cn var4;
               if ((var4 = (cn)var6.h.elementAt(var7)).d == var0) {
                  if (var4.c * f + var4.b >= 0 && var4.c * f + var4.b < h.length) {
                     h[var4.c * f + var4.b] = 83;
                  }

                  b(var6.c, var4.b * j + j / 2, var4.c * j + j / 2);
               }
            }
         }
      }
   }

   private void i() {
      this.r = null;
      if (k != 1) {
         this.r = new cn[4];

         for(int var1 = 0; var1 < this.r.length; ++var1) {
            int var2 = cl.b().c + b2.e(k4.o / 20 + 5) * 20;
            int var3 = -110 - b2.e(3) * 10;
            this.r[var1] = new cn(var2, var3);
         }

         b2.e();
      }
   }

   public static Vector b(Vector var0) {
      try {
         int var1 = var0.size();

         for(int var2 = 0; var2 < var1 - 1; ++var2) {
            ik var3 = (ik)var0.elementAt(var2);

            for(int var4 = var2 + 1; var4 < var1; ++var4) {
               ik var5 = (ik)var0.elementAt(var4);
               if (var3.b > var5.b) {
                  var0.setElementAt(var3, var4);
                  var0.setElementAt(var5, var2);
                  var3 = var5;
               }
            }
         }
      } catch (Exception var6) {
      }

      return var0;
   }

   private static void j() {
      k4.E.removeAllElements();
      m.removeAllElements();
      n.removeAllElements();
      o.removeAllElements();
      D = null;
      E = null;
      F = null;
      System.gc();
   }

   public static boolean e(int var0, int var1) {
      if ((var0 = f(var0, var1)) != true && var0 != true) {
         return GameMidlet.k.Z == -5 && (var0 == 79 || var0 == 81 || var0 == 92 || var0 == 67);
      } else {
         return true;
      }
   }

   public static int f(int var0, int var1) {
      return var0 >= 0 && var0 <= f * j && var1 / j * f + var0 / j >= 0 && var1 / j * f + var0 / j < h.length ? h[var1 / j * f + var0 / j] : -2;
   }

   public static int g(int var0, int var1) {
      return var0 >= 0 && var0 <= f * j && var1 / j * f + var0 / j < h.length ? var1 / j * f + var0 / j : -1;
   }

   public static i3 l(int var0) {
      for(int var1 = 0; var1 < n.size(); ++var1) {
         ik var2;
         if ((var2 = (ik)n.elementAt(var1)).d == 0 && ((it)var2).f == var0) {
            return (i3)var2;
         }
      }

      return null;
   }

   public static void b(byte var0) {
      for(int var1 = 0; var1 < k4.E.size(); ++var1) {
         ((gz)k4.E.elementAt(var1)).b = true;
      }

      if (var0 != -1) {
         g0 var2 = new g0(var0, 0);
         k4.E.addElement(var2);
      }

      l = var0;
   }

   public static void b(i3 var0) {
      if (var0.ah != -1) {
         ix var1 = new ix(var0);
         n.addElement(var1);
      }
   }

   public static ix m(int var0) {
      for(int var1 = 0; var1 < n.size(); ++var1) {
         ik var2;
         if ((var2 = (ik)n.elementAt(var1)).d == 4 && ((ix)var2).Q.f == var0) {
            return (ix)var2;
         }
      }

      return null;
   }

   public static void c(i3 var0) {
      n.addElement(var0);
      var0.k();
   }

   public static void d(i3 var0) {
      n.removeElement(var0);
      ix var1;
      if ((var1 = m(var0.f)) != null) {
         n.removeElement(var1);
      }
   }

   public static void b(ik var0) {
      if (u == var0) {
         u = null;
      }

      n.removeElement(var0);
   }

   public final void b(byte var1, byte[] var2) {
      G = var1;
      d = new g_(b2.c(var2), j * ev.a, ev.a * j);
      this.k();
      k4.O = 0;
   }

   private static void b(int var0, short[] var1) {
      if (var0 % f == 0) {
         var1[var0] = var1[var0 + 1];
      } else {
         var1[var0] = var1[var0 - 1];
      }
   }

   public final void k() {
      bq.j = false;
      j();
      c(GameMidlet.k);
      short[] var1 = new short[e.length];
      h = new short[e.length];
      byte[] var2 = new byte[100];
      byte var3 = 0;

      for(int var4 = 0; var4 < e.length; ++var4) {
         var1[var4] = e[var4];
      }

      for(int var7 = 0; var7 < e.length; ++var7) {
         if (e[var7] < d.d) {
            e[var7] = -4;
         } else if (e[var7] < d.d << 1) {
            e[var7] = -5;
         } else {
            int var5;
            switch(var5 = e[var7] - (d.d << 1)) {
               case 0:
                  e[var7] = 98;
                  ir var6 = new ir(846, h(var7) + j / 2, i(var7) + j / 2);
                  m.addElement(var6);
                  break;
               case 1:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               default:
                  c(var7, var2[var5], 0);
                  h[var7] = (byte)(var5 + -125);
                  e[var7] = -3;
                  break;
               case 2:
                  e[var7] = 139;
                  break;
               case 3:
                  e[var7] = 152;
                  break;
               case 12:
                  e[var7] = 150;
                  break;
               case 13:
                  e[var7] = 151;
                  break;
               case 14:
                  c(var7, var3, 0);
                  ++var3;
                  e[var7] = 184;
                  var1[var7] = 33;
                  break;
               case 15:
                  var1[var7] = 0;
                  e[var7] = 185;
            }

            if (var5 > 0 && var2[var5] == 0 && var5 - 1 < AutoController.ai.length && AutoController.ai[var5 - 1] != -1) {
               ir var8 = new ir(AutoController.ai[var5 - 1], h(var7) + c(var7, var1), i(var7) + j - 4);
               m.addElement(var8);
            }

            if (var5 != 14) {
               b(var7, var1);
            }

            ++var2[var5];
         }
      }

      cl.p = false;
      GameMidlet.k.q = 0;
      b(null, AutoController.A + 1, false);
      b = AutoController.A;
      e = var1;
      cl.b().c(AutoController.A + 1);
      k4.h();
      B = -1;
      A = -1;
      g();
      hv.b().b(AutoController.A, -1);
   }

   private static int c(int var0, short[] var1) {
      for(int var2 = var0; var2 < var1.length; ++var2) {
         if (var1[var2] != var1[var2 + 1]) {
            return (var2 - var0 + 1) * j / 2;
         }
      }

      return 0;
   }

   private static void c(int var0, byte var1, int var2) {
      if (var1 == 0) {
         if (var0 + 1 < e.length && e[var0] == e[var0 + 1]) {
            for(int var5 = var0; var5 < e.length; ++var5) {
               if (e[var5] != e[var5 + 1]) {
                  String var10000;
                  if (var2 != 1) {
                     var10000 = hq.ar;
                  } else {
                     String[] var3 = a;
                     var10000 = var3[8];
                  }

                  b(var10000, h(var0) + (var5 - var0 + 1) * j / 2, i(var0) + (G == -1 ? j / 2 : j) + (var2 == 2 ? j / 2 : 0));
                  return;
               }
            }
         } else {
            if (var0 + f < e.length && e[var0] == e[var0 + f]) {
               for(int var4 = var0; var4 < e.length; var4 += f) {
                  if (e[var4] != e[var4 + f]) {
                     b(var2 != 1 ? hq.ar : a[10], h(var0) + 3, i(var0) + ((var4 - var0) / f + 1) * j / 2);
                     return;
                  }
               }
            }
         }
      }
   }

   private static void b(iq var0, s var1) {
      byte var2 = 88;
      if (var1.d == 1) {
         var2 = 79;
      } else if (var1.d == 2) {
         var2 = 67;
      }

      for(int var3 = 0; var3 < var1.k.size(); ++var3) {
         cn var4 = (cn)var1.k.elementAt(var3);
         h[(var0.b + var4.c) * f + var0.a + var4.b] = var2;
      }
   }

   public static void b(byte var0, byte var1, int var2, int var3) {
      ab = var2;
      ac = var3;
      G = -1;
      k4.i();
      if (GameMidlet.f != 9) {
         hx.b().g(9);
      }

      hv.b().b(var0, var1);
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'A');
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
               var10005 = 58;
               break;
            case 2:
               var10005 = 10;
               break;
            case 3:
               var10005 = 14;
               break;
            case 4:
               var10005 = 51;
               break;
            case 5:
               var10005 = 71;
               break;
            default:
               var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
