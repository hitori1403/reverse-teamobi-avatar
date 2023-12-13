import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fj extends e8 {
   public static fj z;
   public static int A;
   private String B;
   public static Vector C;
   private static Vector D;
   public static Vector E;
   public static Vector F;
   public static Vector G;
   public static Vector H;
   public static Vector I;
   public static Vector J;
   public static Vector[] K;
   public static Image[] L;
   public static String M;
   public static Image N;
   public static Image O;
   public static Image P;
   public static g_ Q;
   public static g_ R;
   public static g_ S;
   public static g_ T;
   public static g_ U;
   public static g_ V;
   public cn[] W;
   private Vector X;
   public static int Y;
   public static int Z;
   private byte[] aa = new byte[]{33, 34, 35, 36, 37};
   private byte[] ab = new byte[]{33, 120, 121, 122, 123};
   private Vector ac = new Vector();
   public static boolean ad;
   public static boolean ae;
   public static cn af;
   public static cn ag;
   public static cn ah;
   public static cn ai;
   public static byte aj;
   public static byte ak;
   private cn al;
   private int am;
   private static int an;
   private static int ao;
   public static int ap;
   public static int aq;
   private int ar;
   private long as;
   private long at;
   private static int au;
   private static final byte[][] av;
   private static ag aw;
   private static ag ax;
   private static ag ay;
   private static ag az;
   private static ag aA;
   private static ag aB;
   public static ip aC;
   private ag aD;
   private ag aE;
   public Vector aF = new Vector();
   private boolean aG = false;
   private boolean aH = false;
   public static int aI;
   iu aJ;
   private long aK = -1L;
   public static boolean aL;
   private boolean aM;
   private Vector aN = new Vector();
   private boolean aO = false;
   private int aP = 0;
   public static byte aQ;
   public static byte aR;
   public static byte aS;
   public static boolean aT;
   public static int aU;
   public static int aV;
   public static int aW;
   public static short aX;
   private boolean aY = true;
   private int aZ = 0;
   public static int a0;
   public static int a1;
   public static int a2;
   private static final String[] bb;

   static {
      String[] var5 = new String[50];
      int var3 = 0;
      String var2 = ">\f\u00042\fii\u000eFờiŘỨ\u001322NẆi\u007f5\u0017\u000fzI=iE\u0015 }Oi*P\u000e0/\u00062O(:T]\u0018YD½'V]!zữi$D\u001cuzẍ=iV\u0014Ẅ|Kg\u000eFờiŘỨ\u001322NẆiz>\r\u0010QD<0Ỳ\u0013ufÌ iZ\u0015:ằB\f}B\u00069T\u0013\u0019sB-s\u0011\u000bF^ẚ'V]!ỹ\f½s\u0011ĂÏi*Yž82_º*\u0011\u0005:|Kg\u0019SC\u0015!|;(OX0/\t(\u0002Ca0!D\u00049B`\u0013\u0002\u00042\fii\u0006Qm\u0007\nt1\ncY *ZP6s^,=YD½'V]!zữi:Ờ]1ỷB.iR\u0015Ẽq\f'Ŋ_\u001au|Ì0iEỜ<2B½'V]!`ẍ iRẚ42B.ǹỬ\u0014uyD¨*\u001f\u0015YD½'V]6á\f? Ỷ\u001euuÀi%Ñ\u0010{\u000eQßi%Ủ\u0014ujẏ0iC\u001c{\u0007pY0\u0005P\u00131\u0012cY *ZP7gUd9C\u00121gO=:=YD½'V]!zữi:Ờ]1ỷB.iR\u0015Ẽq\f'Ŋ_\u001au|Ì0iEỜ<2B½'V]!`ẍ iRẚ42B.ǹỬ\u0014uyD¨*\u001f\tFƜẒ \u0011\u0013ǥỉO\u0013SY=&\u0011\u0019<sA&'U]6}B/ V\u0002]g\u0010FDẔ \u0011\u001a<sBi:Ỡ\u00132(\f\u000fQDŊ$\u0011\u001e=}\f+Ứ_]7ú\u0013WAi*YǍ42@Ẓ'\u0011\u0010µ2M'!\u001f\u0015YD½'V]6á\f? Ỷ\u001euuÀi%Ñ\u0010{\nPÍ&iU\u001c;z\u0016i\fsM((P\u001c4sM(s\u0011\u0004qC '\u001aĂM'.\u0011\u001e=đAi:Â\u001euqÎ0iE\u000fẆ|Kgg\u001f\u0003qY=\tĂį'.\u0011\u0005 ặX\tFD<iE\u00148(\f\nCYỪ'V];uDẀ\u0019ĂM'.\u0011\u001e=đAi:Â\u001eudẁ=i_\b¡{\u0002gg\u00052B.©H\b{Hi*P\u000f0/\fQDŊ$\u0011\u000e¦q\f!ỶE\u0002fO\u0002>\f\u0002eK\u0002{n\u0002d\\\u0014ĂM'.\u0011\u0010 s\f?ỤE]%zẅ$g\u001fS\u000eQßi%Ủ\u0014ujẏ0iC\u001c{\u000bF^ẚ'V]!ỹ\f½s";
      int var4 = ">\f\u00042\fii\u000eFờiŘỨ\u001322NẆi\u007f5\u0017\u000fzI=iE\u0015 }Oi*P\u000e0/\u00062O(:T]\u0018YD½'V]!zữi$D\u001cuzẍ=iV\u0014Ẅ|Kg\u000eFờiŘỨ\u001322NẆiz>\r\u0010QD<0Ỳ\u0013ufÌ iZ\u0015:ằB\f}B\u00069T\u0013\u0019sB-s\u0011\u000bF^ẚ'V]!ỹ\f½s\u0011ĂÏi*Yž82_º*\u0011\u0005:|Kg\u0019SC\u0015!|;(OX0/\t(\u0002Ca0!D\u00049B`\u0013\u0002\u00042\fii\u0006Qm\u0007\nt1\ncY *ZP6s^,=YD½'V]!zữi:Ờ]1ỷB.iR\u0015Ẽq\f'Ŋ_\u001au|Ì0iEỜ<2B½'V]!`ẍ iRẚ42B.ǹỬ\u0014uyD¨*\u001f\u0015YD½'V]6á\f? Ỷ\u001euuÀi%Ñ\u0010{\u000eQßi%Ủ\u0014ujẏ0iC\u001c{\u0007pY0\u0005P\u00131\u0012cY *ZP7gUd9C\u00121gO=:=YD½'V]!zữi:Ờ]1ỷB.iR\u0015Ẽq\f'Ŋ_\u001au|Ì0iEỜ<2B½'V]!`ẍ iRẚ42B.ǹỬ\u0014uyD¨*\u001f\tFƜẒ \u0011\u0013ǥỉO\u0013SY=&\u0011\u0019<sA&'U]6}B/ V\u0002]g\u0010FDẔ \u0011\u001a<sBi:Ỡ\u00132(\f\u000fQDŊ$\u0011\u001e=}\f+Ứ_]7ú\u0013WAi*YǍ42@Ẓ'\u0011\u0010µ2M'!\u001f\u0015YD½'V]6á\f? Ỷ\u001euuÀi%Ñ\u0010{\nPÍ&iU\u001c;z\u0016i\fsM((P\u001c4sM(s\u0011\u0004qC '\u001aĂM'.\u0011\u001e=đAi:Â\u001euqÎ0iE\u000fẆ|Kgg\u001f\u0003qY=\tĂį'.\u0011\u0005 ặX\tFD<iE\u00148(\f\nCYỪ'V];uDẀ\u0019ĂM'.\u0011\u001e=đAi:Â\u001eudẁ=i_\b¡{\u0002gg\u00052B.©H\b{Hi*P\u000f0/\fQDŊ$\u0011\u000e¦q\f!ỶE\u0002fO\u0002>\f\u0002eK\u0002{n\u0002d\\\u0014ĂM'.\u0011\u0010 s\f?ỤE]%zẅ$g\u001fS\u000eQßi%Ủ\u0014ujẏ0iC\u001c{\u000bF^ẚ'V]!ỹ\f½s"
         .length();
      char var1 = 2;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = c(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     bb = var5;
                     D = new Vector();
                     E = new Vector();
                     F = new Vector();
                     J = new Vector();
                     K = new Vector[2];
                     ad = false;
                     ae = false;
                     aj = -1;
                     an = 12;
                     ao = 4;
                     ap = -1;
                     aq = -1;
                     au = 0;
                     av = new byte[][]{
                        {0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                        {2, 2, 2, 2, 2, 3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4, 5, 5, 5, 5, 5},
                        {6, 6, 6, 6, 6, 7, 7, 7, 7, 7},
                        {8, 8, 8, 8, 8, 9, 9, 9, 9, 9}
                     };
                     aI = -1;
                     aL = false;
                     aT = false;
                     aU = -1;
                     aV = -1;
                     aX = 0;
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

                  var2 = "tC*<B\u0011FờiŘỨ\u001322Ľ iS\u009c;2Ľ¨";
                  var4 = "tC*<B\u0011FờiŘỨ\u001322Ľ iS\u009c;2Ľ¨".length();
                  var1 = 5;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static fj g() {
      if (z == null) {
         z = new fj();
      }

      return z;
   }

   public final void d() {
      super.d();
   }

   public static void h() {
      if (U == null) {
         bp.c(hq.av);
         String[] var0 = bb;
         N = bp.b(var0[18]);
         U = g_.b(var0[32], 24 * ev.a, 24 * ev.a);
         Q = g_.b(var0[44], 16 * ev.a, 16 * ev.a);
         (L = new Image[2])[0] = bp.b("w");
         L[1] = bp.b("g");
         R = g_.b(var0[42], 13 * ev.a, 9 * ev.a);
         S = g_.b("m", 27 * ev.a, 17 * ev.a);
         T = g_.b(var0[40], 13 * ev.a, 13 * ev.a);
         P = bp.b(var0[48]);
         bp.b();
      }
   }

   public final void a() {
      aw = new ag(hq.P, 0);
      ax = new ag(hq.d, 7);
      ay = new ag(null, 2);
      az = new ag(null, 3);
      super.e = ax;
   }

   public fj() {
      K[0] = new Vector();
      K[1] = new Vector();
      this.a();
      bp.c(hq.av);
      String[] var1 = bb;
      O = bp.b(var1[30]);
      V = g_.b(var1[43], 9 * ev.a, 13 * ev.a);
      bp.b();
      this.j();
      h();
      aA = new ag(hq.b_, 8);
      aB = new ag(hq.bp, 9);
      this.aD = new ag(hq.bp, 16, this);
      this.aE = new ag(hq.e, 18, this);
   }

   public static int c(int var0) {
      for(int var1 = 1; var1 <= 60; ++var1) {
         String[] var2 = bb;
         if (f8.d(var0).n.indexOf(var2[24] + var1 + var2[37]) != -1) {
            return var1;
         }
      }

      return 0;
   }

   private void i() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < E.size(); ++var2) {
         df var3;
         b5 var4;
         if ((var4 = g((var3 = (df)E.elementAt(var2)).b)).f == 5 && (var4.e == 4 || var4.e == 101)) {
            var1.addElement(new bb(var4.g, new af(this, var3), var4));
         }
      }

      b(var1);
   }

   private void j() {
      this.aF.addElement(AutoController.h().F);
      ag var1 = new ag(hq.y, 20);
      this.aF.addElement(var1);
   }

   private void k() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < D.size(); ++var2) {
         df var3;
         if (f8.c((var3 = (df)D.elementAt(var2)).b) != null) {
            var1.addElement(new am(var3.g + "(" + var3.f + ")", var2, var3));
         }
      }

      b(var1);
   }

   public final void e() {
      k4.i();
      hx.b().g(8);
   }

   private void l() {
      int var1;
      if ((var1 = this.f(af.b, af.c)) - C.size() == 0) {
         k4.i();
         h2.b().e(A);
      } else {
         if (var1 >= 0 && var1 < C.size()) {
            im var7;
            if ((var7 = (im)C.elementAt(var1)).v == 5) {
               this.p();
               return;
            }

            if (var7.j == -1 && (var7.u == 1 && var7.t == this.aa[1] || var7.u == 2 && var7.t == this.ab[1])) {
               if (D.size() == 0) {
                  k4.c(hq.c6);
                  return;
               }

               if (aj == -1) {
                  Vector var10 = new Vector();
                  int var11 = this.f(af.b, af.c);
                  im var15 = (im)C.elementAt(var11);
                  im var18 = null;
                  if (var11 > 0) {
                     var18 = (im)C.elementAt(var11 - 1);
                  }

                  for(int var20 = 0; var20 < D.size(); ++var20) {
                     df var21;
                     if (f8.c((var21 = (df)D.elementAt(var20)).b) != null) {
                        var10.addElement(new ar(var21.g + "(" + var21.f + ")", var20, var21));
                     }
                  }

                  if (A == GameMidlet.k.f && (var15.u == 1 && var11 == 0 || var11 > 0 && var15.u < var18.u)) {
                     var10.addElement(new aj(hq.h));
                  }

                  b(var10);
               }

               return;
            }

            im var2 = var7;
            int var3 = this.f(af.b, af.c);
            im var4 = (im)C.elementAt(var3);
            im var5 = null;
            if (var3 > 0) {
               var5 = (im)C.elementAt(var3 - 1);
            }

            al var6 = null;
            if (A == GameMidlet.k.f && (var4.u == 1 && var3 == 0 || var3 > 0 && var4.u < var5.u)) {
               var6 = new al(hq.h);
            }

            if (var7.j != -1 && var7.v < 6 && var7.t == 36) {
               this.b(new b9(this));
            }

            if (var7.j == -1 || var7.v >= 6) {
               ca var16 = new ca(this, var7);
               if (var6 != null) {
                  Vector var14;
                  (var14 = new Vector()).addElement(new aq(hq.a5, var16));
                  var14.addElement(var6);
                  b(var14);
                  return;
               }

               this.b(var16);
            }

            if (var7.j != -1 && var7.v < 6 && var3 < C.size() && E.size() > 0) {
               if (var7.o) {
                  this.c(var3, 7);
               } else if (var7.p) {
                  this.c(var3, 3);
               } else if (var7.s < 80) {
                  this.c(var3, 2);
               }
            }

            if (aj == -1) {
               Vector var17 = new Vector();
               a3 var12 = new a3(hq.a4);
               var17.addElement(var12);
               if (A == GameMidlet.k.f) {
                  var17.addElement(new au(hq.a5, new d_(this, var7)));
               }

               if (var6 != null) {
                  var17.addElement(var6);
               }

               for(int var13 = 0; var13 < E.size(); ++var13) {
                  df var8;
                  b5 var19;
                  if ((var19 = g((var8 = (df)E.elementAt(var13)).b)).e == 0
                     && (var19.f == 3 && var2.p || var19.f == 7 && var2.o || var19.f != 3 && var19.f != 7)) {
                     String var9 = var19.g + "(" + var8.f + ")";
                     var17.addElement(new bb(var9, var13, var19));
                  }
               }

               b(var17);
            }
         }
      }
   }

   public static void b(String var0) {
      Vector var1;
      (var1 = new Vector()).addElement(new ag(hq.D, 51));
      var1.addElement(new ag(hq.E, 52));
      var1.addElement(k4.ar);
      k4.b(var0, var1);
   }

   private void b(gq var1) {
      if (aj != -1) {
         this.ac.addElement(var1);
      } else {
         var1.b();
      }
   }

   private boolean c(int var1, int var2) {
      boolean var3 = false;

      for(int var4 = 0; var4 < E.size(); ++var4) {
         b5 var5;
         if ((var5 = g(((df)E.elementAt(var4)).b)).e == 0 && var5.f == var2) {
            this.b(new ac(this, var5, var1));
            var3 = true;
            break;
         }
      }

      if (!var3) {
         k4.c(hq.c7);
      }

      return var3;
   }

   public static void b(Vector var0) {
      int var1 = gx.j * ev.a;
      if (k4.M) {
         var1 += var1 / 3;
      }

      f1.d().b(var0, k4.q, var1, var1);
   }

   public final void b(int var1) {
      switch(var1) {
         case 0:
            k4.b(hq.dy, 1, this);
            return;
         case 1:
            h2.b().e((short)-1);
            fb.g().e();
            return;
         case 2:
            fb.g().e();
            if (aW == 0) {
               h2 var4;
               (var4 = h2.b()).a((byte)92);
               var4.a();
               return;
            }

            h2.b().h(0);
            return;
         case 3:
            h2.b().g(1, 0);
            return;
         case 4:
            h2.b().g(1, 1);
            return;
         case 5:
            h2.b().h(1, 0);
            return;
         case 6:
            h2.b().h(1, 1);
            return;
         case 7:
            h2.b().f(1);
            return;
         case 8:
            h2.b().g(1);
            return;
         case 9:
            h2.b().i(1, 1);
            return;
         case 10:
            h2.b().i(1, 2);
            return;
         case 11:
            h2.b().h(1);
            return;
         case 12:
            k4.b(hq.c8, new dj());
            return;
         case 13:
            h2.b().j(1, 1);
            return;
         case 14:
            h2.b().j(1, 2);
            return;
         case 15:
            fd.g().a(true);
            return;
         case 16:
            h2.b().f();
            return;
         case 17:
            h2 var3;
            (var3 = h2.b()).a((byte)95);
            var3.a();
            return;
         case 18:
            g().B();
            return;
         case 19:
            h2 var2;
            (var2 = h2.b()).a((byte)98);
            var2.a();
            return;
         case 20:
            super.e = null;
            return;
         case 21:
            j7.b().b(!j7.c);
            return;
         case 22:
            this.D();
            return;
      }
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 1:
            this.b((byte)1, ap);
            return;
         case 2:
            if (gx.u != null) {
               k4.h();
               h2.b().e(A, ((it)gx.u).f);
               return;
            }
            break;
         case 3:
            if (gx.u != null) {
               n var31 = f8.d(i(((it)gx.u).f).J);

               for(int var27 = 0; var27 < E.size(); ++var27) {
                  if (var2 == var27) {
                     df var19 = (df)E.elementAt(var27);
                     this.b(var19, var31.d == 1 ? 0 : 1);
                  }
               }

               return;
            }
            break;
         case 4:
            if (gx.u != null) {
               for(int var18 = 0; var18 < E.size(); ++var18) {
                  if (var2 == var18) {
                     df var26;
                     b5 var22 = g((var26 = (df)E.elementAt(var18)).b);
                     this.b(var22, var26.b, (iu)gx.u);
                  }
               }

               return;
            }
            break;
         case 5:
            for(int var17 = 0; var17 < D.size(); ++var17) {
               if (var17 == var2) {
                  int var30;
                  if ((var30 = this.f(af.b, af.c)) >= C.size()) {
                     return;
                  }

                  e(var17, var30);
               }
            }

            return;
         case 6:
            for(int var16 = 0; var16 < E.size(); ++var16) {
               if (var16 == var2) {
                  df var24;
                  if ((var24 = (df)E.elementAt(var16)).f > 0) {
                     int var29;
                     if ((var29 = this.f(af.b, af.c)) < C.size() && E.size() != 0) {
                        b5 var21;
                        byte var25;
                        if ((var25 = (var21 = g(var24.b)).f) != 7) {
                           if (var25 == 1) {
                              this.b((byte)2, var21.b);
                           } else {
                              this.b(var25, var21.b);
                           }
                        }

                        h2.b().c(A, var29, var21.b);
                     }
                  } else {
                     k4.c(hq.a6 + var24.g);
                  }
               }
            }

            return;
         case 7:
            this.f(var2);
            return;
         case 8:
            this.b(5, -1);
            this.k();
            return;
         case 9:
            this.aH = true;
            this.f(0);
            return;
         case 10:
            ad = true;

            for(int var15 = this.aZ; var15 < J.size(); ++var15) {
               boolean var23;
               iu var28;
               if ((var28 = (iu)J.elementAt(var15)).I[1]) {
                  gx.u = var28;
                  ko.b().b(var28.a * ev.a, var28.b * ev.a);
                  ko.b();
                  cl.q = true;
                  super.f = new ag(hq.dj, new j8(this, var28));
                  super.e = aA;
                  super.g = aB;
                  var23 = true;
               } else if (var28.I[0]) {
                  gx.u = var28;
                  ko.b().b(var28.a * ev.a, var28.b * ev.a);
                  ko.b();
                  cl.q = true;
                  super.f = new ag(hq.dj, new kc(this, var28));
                  super.e = aA;
                  super.g = aB;
                  var23 = true;
               } else if (var28.H && !(var28 instanceof iw) && !(var28 instanceof iv)) {
                  gx.u = var28;
                  ko.b().b(var28.a * ev.a, var28.b * ev.a);
                  ko.b();
                  cl.q = true;
                  super.f = new ag(hq.dm, new l(this, var28));
                  super.e = aA;
                  super.g = aB;
                  var23 = true;
               } else if (var28.G < 50) {
                  gx.u = var28;
                  ko.b().b(var28.a * ev.a, var28.b * ev.a);
                  ko.b();
                  cl.q = true;
                  super.f = new ag(hq.dp, new ka(this, var28));
                  super.e = aA;
                  super.g = aB;
                  var23 = true;
               } else {
                  var23 = false;
               }

               if (var23) {
                  return;
               }

               ++this.aZ;
            }

            this.b(8, -1);
            k4.c(hq.c9);
            return;
         case 11:
            h2.b().i(0, 0);
            return;
         case 12:
            h2 var14;
            (var14 = h2.b()).a((byte)85);
            var14.a();
            return;
         case 13:
            if (aC.l > 0) {
               h2.b().g(0);
               return;
            }

            h2.b().f(0);
            return;
         case 14:
            h2 var13;
            (var13 = h2.b()).a((byte)87);
            var13.a();
            return;
         case 15:
            Vector var5;
            (var5 = new Vector()).addElement(new ag(hq.dg, 10));
            var5.addElement(new ag(hq.dh, 8));
            var5.addElement(new ag(hq.di, 9));
            f1.d().b(var5, 2);
            return;
         case 16:
            new kw(this).start();
            return;
         case 17:
            Vector var4;
            (var4 = new Vector()).addElement(new ag(hq.d4, 22));
            var4.addElement(new ag(hq.dh, 23));
            var4.addElement(new ag(hq.a5, 25));
            f1.d().b(var4, 2);
            return;
         case 18:
            this.z();
            return;
         case 19:
            this.w();
            return;
         case 20:
            this.e();
            return;
         case 21:
            Vector var12;
            (var12 = new Vector()).addElement(new ag(kq.i[0], 24));
            var12.addElement(new ag(kq.i[1], 29));
            f1.d().b(var12, 2);
            return;
         case 22:
            n();
            return;
         case 23:
            this.m();
            return;
         case 24:
            Vector var11;
            (var11 = new Vector()).addElement(new ag(kq.h[0], 28, 54));
            var11.addElement(new ag(kq.h[1], 28, 50));
            var11.addElement(new ag(kq.h[2], 28, 56));
            var11.addElement(new ag(kq.h[3], 28, 51));
            var11.addElement(new ag(kq.h[4], 28, 52));
            var11.addElement(new ag(kq.h[5], 28, 54));
            var11.addElement(new ag(kq.h[6], 28, 57));
            var11.addElement(new ag(kq.h[8], 28, 59));
            var11.addElement(new ag(kq.h[7], 28, -1));
            f1.d().b(var11, 1);
            return;
         case 25:
            String[] var35 = bb;
            k4.x.b(var35[47], new ek(this), 1);
            k4.x.o.b(true);
            k4.x.o.b("1");
            return;
         case 26:
            for(int var10 = 0; var10 < D.size(); ++var10) {
               if (var10 == var2) {
                  String[] var34 = bb;
                  k4.x.b(var34[9], new em(this, var10), 1);
                  k4.x.o.b(true);
                  k4.x.o.b("1");
               }
            }

            return;
         case 27:
            Vector var3;
            (var3 = new Vector()).addElement(new ag(!j7.c ? kq.c[1] : kq.c[2], 21, this));
            var3.addElement(new ag(kq.c[3], 30));
            f1.d().b(var3, 2);
            return;
         case 28:
            d(var2);
            return;
         case 29:
            o();
            return;
         case 30:
            Vector var9;
            Vector var36 = var9 = new Vector();
            String[] var33 = bb;
            var36.addElement(new ag(var33[35], 31));
            var9.addElement(new ag(var33[28] + kq.b(j7.f), 32));
            var9.addElement(new ag(var33[34] + kq.b(j7.g), 33));
            f1.d().b(var9, 1);
            return;
         case 31:
            k4.x.b(kq.c[7], 34, 1);
            k4.x.o.b(String.valueOf(j7.d));
            return;
         case 32:
            j7.f = !j7.f;
            this.a(30, -1);
            f1.d().p = 1;
            f1.d().l = false;
            return;
         case 33:
            j7.g = !j7.g;
            this.a(30, -1);
            f1.d().p = 2;
            f1.d().l = false;
            f1.d().g();
            return;
         case 34:
            Vector var8;
            Vector var10000 = var8 = new Vector();
            String[] var32 = bb;
            var10000.addElement(new ag(var32[21], 35));
            var8.addElement(new ag(var32[39], 36));
            f1.d().b(var8, 2);
            return;
         case 35:
            new Thread(new eq(this, 1)).start();
            return;
         case 36:
            new Thread(new eq(this, 2)).start();
            return;
         case 37:
            i5.b = j7.k = !j7.k;
            this.a(30, -1);
            f1.d().p = 3;
            f1.d().l = false;
            f1.d().g();
            return;
         case 38:
            String[] var6 = bb;
            Form var7 = new Form(var6[22]);
            ChoiceGroup var20;
            (var20 = new ChoiceGroup("", 2)).append(var6[49], null);
            var20.append(var6[6], null);
            var20.append(var6[2], null);
            var20.setSelectedIndex(0, j7.m);
            var20.setSelectedIndex(1, fu.aR);
            var20.setSelectedIndex(2, fu.aS);
            var7.append(var20);
            var7.addCommand(new Command(var6[23], 4, 0));
            var7.addCommand(new Command(var6[13], 3, 0));
            var7.setCommandListener(new eo(this, var20));
            Display.getDisplay(GameMidlet.j).setCurrent(var7);
            return;
      }
   }

   public final void b(iu var1, int var2) {
      while(true) {
         boolean var3 = false;

         for(int var4 = 0; var4 < E.size(); ++var4) {
            df var5;
            g((var5 = (df)E.elementAt(var4)).b);
            if (var5.b == var2) {
               kf.i = true;
               String[] var8 = bb;
               k4.d(var8[36]);
               h2.b().c(A, var1.f, var5.b);
               var3 = true;
               long var6 = System.currentTimeMillis();

               while(kf.i) {
                  if (System.currentTimeMillis() - var6 > 20000L) {
                     kf.i = false;
                     m(1000);
                     var8 = bb;
                     k4.c(var8[17]);
                     return;
                  }

                  m(10);
               }

               m(550);
               break;
            }
         }

         if (var3) {
            return;
         }

         kf.b = true;
         h2.b().b((short)var2, (byte)50, 1);
         long var9 = System.currentTimeMillis();

         while(kf.b) {
            if (System.currentTimeMillis() - var9 > 15000L) {
               kf.b = false;
               k4.c(bb[17]);
               return;
            }

            m(10);
         }

         m(550);
         var1 = var1;
         this = this;
      }
   }

   public final void d(int var1, int var2) {
      while(true) {
         boolean var3 = false;

         for(int var4 = 0; var4 < E.size(); ++var4) {
            b5 var5;
            if ((var5 = g(((df)E.elementAt(var4)).b)).e == 0 && var5.f == var2) {
               kf.i = true;
               String[] var8 = bb;
               k4.d(var8[31]);
               h2.b().c(A, var1, var5.b);
               new StringBuffer(var8[38]).append(var5.b).append(var8[4]).append(var2);
               var3 = true;
               long var6 = System.currentTimeMillis();

               while(kf.i) {
                  if (System.currentTimeMillis() - var6 > 20000L) {
                     kf.i = false;
                     m(1000);
                     var8 = bb;
                     k4.c(var8[46]);
                     return;
                  }

                  m(10);
               }

               m(550);
               break;
            }
         }

         if (var3) {
            return;
         }

         String[] var11 = bb;
         var11[3].concat(String.valueOf(var2));
         kf.b = true;
         k4.d(var11[45]);
         switch(var2) {
            case 2:
               h2.b().b((short)112, (byte)50, 1);
               break;
            case 3:
               h2.b().b((short)123, (byte)50, 1);
            case 4:
            case 5:
            case 6:
            default:
               break;
            case 7:
               h2.b().b((short)124, (byte)50, 1);
         }

         long var9 = System.currentTimeMillis();

         while(kf.b) {
            if (System.currentTimeMillis() - var9 > 15000L) {
               kf.b = false;
               k4.c(bb[17]);
               return;
            }

            m(10);
         }

         m(550);
         var1 = var1;
         this = this;
      }
   }

   private void m() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < D.size(); ++var2) {
         df var3;
         if (f8.c((var3 = (df)D.elementAt(var2)).b) != null) {
            var1.addElement(new bo(var3.g + "(" + var3.f + ")", var2, var3));
         }
      }

      b(var1);
   }

   public static boolean b(short var0, int var1) {
      df var2;
      int var10000 = (var2 = df.b(D, var0)) != null ? var2.f : 0;
      int var7 = var10000;
      if (var10000 < var1 && (var1 = f8.c((int)var0)) != null) {
         kf.b = true;
         h2.b().b(var0, (byte)(99 - var7), var1.h[0] > 0 ? 1 : 2);
         long var5 = System.currentTimeMillis();

         while(kf.b) {
            if (System.currentTimeMillis() - var5 > 10000L) {
               kf.b = false;
               return false;
            }

            m(100);
         }

         m(1000);
      }

      return true;
   }

   private static void n() {
      if (GameMidlet.k.f != A) {
         String[] var3 = bb;
         k4.c(var3[15]);
      } else {
         boolean var0 = false;

         for(int var1 = 0; var1 < C.size(); ++var1) {
            im var2;
            (var2 = (im)C.elementAt(var1)).q = false;
            if (var2.v == 5) {
               var0 = true;
               h2.b().b(A, var1);
            }

            if (!var0) {
               k4.c(bb[16]);
            }
         }
      }
   }

   public static void o() {
      for(int var0 = 0; var0 < J.size(); ++var0) {
         iu var1;
         n var2 = f8.d((var1 = (iu)J.elementAt(var0)).J);
         if (var1.N > 0) {
            var1.N = 0;
            if (var2.d == 1) {
               b(var1);
               j(-50);
            }

            if (var2.d == 2) {
               b(var1);
               j(-51);
            }
         }
      }
   }

   private static void d(int var0) {
      for(int var1 = 0; var1 < J.size(); ++var1) {
         iu var2;
         n var3 = f8.d((var2 = (iu)J.elementAt(var1)).J);
         if (var2.F <= var3.e * 60 || var2.J != var0 && var0 != -1) {
            if (var2.F < var3.e * 60 && (var2.J == var0 || var0 == -1)) {
               var2.b(100, bb[26], (byte)0);
            }
         } else {
            h2.b().b(A, (byte)var2.f);
         }
      }
   }

   public static void e(int var0) {
      for(int var1 = 0; var1 < f8.j.size(); ++var1) {
         n var2;
         if ((var2 = (n)f8.j.elementAt(var1)).b == var0) {
            if (var2.f[0] > 0) {
               h2.b().b(var2, 1);
               return;
            }

            h2.b().b(var2, 2);
            return;
         }
      }
   }

   private void f(int var1) {
      aq = 0;
      super.e = new ag(hq.b_, 5);
      super.g = null;
      cl.b();
      cl.q = true;
      super.f = null;
      this.aG = true;
      aI = var1;
   }

   private void b(b5 var1, short var2, iu var3) {
      this.b(new ea(this, var1, var2, var3));
   }

   protected final void b(df var1, int var2) {
      int var3 = GameMidlet.k.s == 0 ? 1 : -1;
      int var4 = K[var2].size();
      if (var1.f - var4 <= 0) {
         k4.c(hq.bm);
      } else {
         for(int var5 = 0; var5 < 3 && var5 < var1.f - var4; ++var5) {
            is var6 = new is(GameMidlet.k.a, GameMidlet.k.b - 40);
            b5 var7 = g(var1.b);
            var6.o = var1.b;
            var6.i = var6.j = 2;
            new b2();
            var6.g = -(4 + b2.e(3));
            new b2();
            var6.h = var3 * (2 + b2.e(3));
            int var10001 = GameMidlet.k.b - 20;
            new b2();
            var6.l = var10001 + b2.e(4) * 5;
            if (var7.e == 4) {
               int var8 = gx.g(GameMidlet.k.a, GameMidlet.k.b + 23);
               if (gx.e[var8] == 14) {
                  new b2();
                  var6.l = 50 + b2.e(50);
                  new b2();
                  var6.h = var3 * b2.e(3);
               }
            }

            var6.f = new hg(var6);
            K[var2].addElement(var6);
            gx.o.addElement(var6);
         }
      }
   }

   public static void b(int var0, int var1, im var2, iu var3) {
      if (gx.b != 25 && var0 != var1) {
         String var4 = "";
         if (var1 - var0 > 0) {
            var4 = var4 + "+";
         }

         int var5;
         int var6;
         if (var2 != null) {
            var5 = var2.h * gx.j + gx.j / 2;
            var6 = var2.i * gx.j - gx.j / 2;
         } else {
            var5 = var3.a;
            var6 = var3.b - 30;
         }

         k4.b(var4 + (var1 - var0), var5, var6, 0, -1);
      }
   }

   private void p() {
      if (GameMidlet.k.f == A) {
         int var1 = this.f(af.b, af.c);
         GameMidlet.k.getClass();
         h2.b().b(A, var1);
      }
   }

   private static void e(int var0, int var1) {
      if (k4.N) {
         new ew();
         ew.l();
      }

      df var2 = (df)D.elementAt(var0);
      h2.b().b(A, var1, var2.b);
   }

   private int f(int var1, int var2) {
      for(int var3 = 0; var3 < this.W.length; ++var3) {
         for(int var4 = 0; var4 < an; ++var4) {
            int var5 = this.W[var3].b + var4 / ao;
            int var6 = this.W[var3].c + var4 % ao;
            if (var1 == var5 && var2 == var6) {
               return var3 * an + var4;
            }
         }
      }

      return -1;
   }

   private void b(byte var1, int var2) {
      ap = var2;
      aj = var1;
      GameMidlet.k.Z = -1;
      GameMidlet.k.I = -1;
      GameMidlet.k.J = -1;
      if (aj == 4) {
         this.al = new cn(gx.u.a / gx.j, gx.u.b / gx.j);
      } else {
         this.al = new cn(af.b, af.c);
      }

      GameMidlet.k.m = this.al.c * gx.j + gx.j / 2;
      GameMidlet.k.l = this.al.b * gx.j;
      if (GameMidlet.k.s == it.r) {
         i3 var3 = GameMidlet.k;
         GameMidlet.k.l += gx.j;
      }
   }

   private void q() {
      for(int var1 = 0; var1 < this.W.length; ++var1) {
         for(int var2 = 0; var2 < an; ++var2) {
            int var3 = this.W[var1].b + var2 / ao;
            int var4 = this.W[var1].c + var2 % ao;
            if (var1 * an + var2 < C.size()) {
               gx.d(var3, var4);
               im var5;
               (var5 = (im)C.elementAt(var1 * an + var2)).l = (short)(var1 * an + var2);
               var5.h = var3;
               var5.i = var4;
               var5.a = var3 * gx.j + gx.j / 2;
               var5.b = var4 * gx.j + 18;
               this.h(var1 * an + var2);
               gx.m.addElement(var5);
            } else {
               if (var1 * an + var2 == C.size()) {
                  gx.m.addElement(new il(-3, var3 * gx.j + 20, var4 * gx.j + 20, N.getWidth()));
                  gx.d(var3, var4);
                  gx.b(gx.m);
               }

               if (gx.e[var4 * gx.f + var3] == this.aa[0]) {
                  gx.b(gx.m);
                  return;
               }

               if (var3 == this.W[var1].b && var4 == this.W[var1].c) {
                  gx.e[var4 * gx.f + var3] = 4;
               }
            }
         }
      }

      gx.b(gx.m);
   }

   public final void b() {
      this.am += 2;
      if (this.am >= 10) {
         this.am = 0;
      }

      if (aj != -1) {
         ak = av[aj][this.am];
         ++this.ar;
         if (this.ar > 10) {
            this.ar = 0;
            this.r();
         }
      }

      if (gx.b == 24 && gx.b == 53 && (System.currentTimeMillis() - this.as) / 1000L > 300L) {
         this.as = System.currentTimeMillis();
         this.a(A, true);
      }

      k4.A.c();
      if (!ad && !aL && aI == -1) {
         this.t();
      }

      label152: {
         if (aj != -1 && this.aK == -1L && GameMidlet.k.q == 0) {
            this.aK = System.currentTimeMillis() / 100L;
            int var1 = -1;
            if (this.al != null) {
               var1 = this.f(this.al.b, this.al.c);
            }

            if (aj == 4) {
               var1 = 0;
            }

            if (this.al.b * gx.j < GameMidlet.k.a) {
               GameMidlet.k.s = it.r;
            } else {
               GameMidlet.k.s = 0;
            }

            GameMidlet.k.U = GameMidlet.k.s;
            if (this.aJ != null) {
               this.aJ.O = false;
               this.aJ = null;
            }

            if (var1 == -1) {
               this.r();
               break label152;
            }

            il var5 = new il(-2, GameMidlet.k.a, GameMidlet.k.b - 5, U.b);
            gx.m.addElement(var5);
            byte var2 = 0;
            if (aj == 0) {
               var2 = 5;
               var5.b = GameMidlet.k.b - 8;
            }

            if (GameMidlet.k.s == 0) {
               var5.a = GameMidlet.k.a + 10 + var2;
            } else {
               var5.a = GameMidlet.k.a - 10 - var2;
            }
         }

         if (this.aK != -1L && (aj == 1 || aj == 0 || aj == 2) && System.currentTimeMillis() / 100L - this.aK > 2L) {
            this.aK = System.currentTimeMillis() / 100L;
            if (GameMidlet.k.q == 6) {
               byte var11 = 0;
               i3 var6 = GameMidlet.k;
               GameMidlet.k.q = var11;
            } else {
               byte var12 = 6;
               i3 var7 = GameMidlet.k;
               GameMidlet.k.q = var12;
            }
         }
      }

      if ((gx.b == 24 || gx.b == 53) && J.size() > 0 && ++au > 250) {
         au = 0;
         new b2();
         int var8 = b2.e(J.size());
         iu var9 = (iu)J.elementAt(var8);
         String var13 = "";
         if (var9.I[0]) {
            var13 = var13 + hq.a9;
         }

         if (var9.I[1]) {
            if (!var13.equals("")) {
               StringBuffer var10000 = new StringBuffer(String.valueOf(var13));
               String[] var3 = bb;
               var13 = var10000.append(var3[0]).toString();
            }

            var13 = var13 + hq.a_;
         }

         if (var9.H) {
            if (!var13.equals("")) {
               StringBuffer var16 = new StringBuffer(String.valueOf(var13));
               String[] var15 = bb;
               var13 = var16.append(var15[41]).toString();
            }

            var13 = var13 + hq.ba;
         }

         if (var9.G < 20) {
            if (!var13.equals("")) {
               var13 = var13 + bb[41];
            }

            var13 = var13 + hq.bb;
         }

         if (!var13.equals("")) {
            var9.w = new dq(25, var13, (byte)0);
            var9.w.b(var9.a, var9.b - 45);
         }
      }

      if (System.currentTimeMillis() / 1000L - this.at / 1000L >= 1L) {
         if (aW > 0) {
            --aW;
         }

         this.at = System.currentTimeMillis();

         try {
            for(int var10 = 0; var10 < C.size(); ++var10) {
               im var14;
               if ((var14 = (im)C.elementAt(var10)).j != -1 && var14.v < 5) {
                  ++var14.m;
                  if ((long)(f8.c(var14.j).f * 60 * 60) - var14.m <= 0L) {
                     var14.v = 5;
                  }
               }
            }

            return;
         } catch (Exception var4) {
         }
      }
   }

   private void r() {
      for(int var1 = 0; var1 < gx.m.size(); ++var1) {
         if (((il)gx.m.elementAt(var1)).f == -2) {
            gx.m.removeElementAt(var1);
            if (var1 > 0) {
               --var1;
            }
         }
      }

      this.aK = -1L;
      int var6 = -1;
      if (this.al != null) {
         int var2 = this.al.c;
         var6 = this.al.b;
         int var3 = C.size();
         int var4 = 0;

         while(true) {
            if (var4 >= var3) {
               var6 = -1;
               break;
            }

            im var5;
            if ((var5 = (im)C.elementAt(var4)).h == var6 && var5.i == var2) {
               var6 = var4;
               break;
            }

            ++var4;
         }

         var6 = var6;
      }

      if (var6 == -1) {
         aj = -1;
         GameMidlet.k.q = 0;
         GameMidlet.k.Z = 0;
         this.s();
      } else {
         if (ap == -1) {
            im var9 = (im)C.elementAt(var6);
            switch(aj) {
               case 0:
                  this.b(var9, 1);
                  var9.v = 0;
                  gx.e[var9.i * gx.f + var9.h] = var9.t;
                  if (var9.j != -1) {
                     h2.b().b(A, var6, -1);
                  }

                  var9.j = -1;
                  if (k4.N) {
                     new ew();
                     ew.l();
                  }
                  break;
               case 1:
                  this.b(var9, 4);
                  var9.n = false;
                  gx.e[var9.i * gx.f + var9.h] = var9.t;
                  h2.b().c(A, var6, 100);
            }
         }

         ap = -1;
         this.al = null;
         aj = -1;
         GameMidlet.k.Z = 0;
         GameMidlet.k.q = 0;
         this.s();
      }
   }

   private void s() {
      if (ad) {
         this.a(10, -1);
      } else if (this.ac.size() > 0) {
         gq var1;
         (var1 = (gq)this.ac.elementAt(0)).b();
         this.ac.removeElement(var1);
      } else {
         if (this.aH) {
            this.u();
         }
      }
   }

   private void t() {
      if (gx.b != 25) {
         int var1;
         if (GameMidlet.k.s == it.r) {
            var1 = GameMidlet.k.a - 23;
         } else {
            var1 = GameMidlet.k.a + 23;
         }

         var1 /= gx.j;
         int var2 = GameMidlet.k.b / gx.j;
         short var3 = gx.h[var2 * gx.f + var1];
         int var4 = this.f(var1, var2);
         if (var3 == 51 && var4 <= C.size()) {
            af.b = var1;
            af.c = var2;
            if (aj != 0 && aj != 1) {
               super.f = aw;
               return;
            }

            super.f = null;
            return;
         }

         if (super.f == aw || super.f == az) {
            super.f = null;
         }

         af.b = -1;
         af.c = -1;
         if (gx.u == null) {
            var2 = gx.g(GameMidlet.k.a + 12, GameMidlet.k.b);
            var1 = gx.g(GameMidlet.k.a, GameMidlet.k.b + 12);
            boolean var7;
            if ((gx.e[var2] != 100 || GameMidlet.k.s != 0) && gx.e[var1] != 14) {
               super.f = null;
               var7 = false;
            } else {
               super.f = az;
               var7 = true;
            }

            if (var7) {
               return;
            }
         }

         if (gx.u != null && super.f == null) {
            if (super.g == null) {
               super.g = gx.v;
            }

            super.f = ay;
         }

         if (gx.u == null) {
            super.g = null;
         }

         if (gx.u == null && super.f == ay) {
            super.f = null;
         }
      }
   }

   public final void c() {
      try {
         if (this.aM && GameMidlet.k.q == 0 && GameMidlet.k.Z == 0 && GameMidlet.k.a == GameMidlet.k.l && GameMidlet.k.b == GameMidlet.k.m) {
            this.aM = false;
            GameMidlet.k.s = 0;
            this.t();
            if (aj == -1) {
               if (aI != -1) {
                  label218:
                  if (this.aN.size() > 0 && aI != -1) {
                     cn var1 = (cn)this.aN.elementAt(0);
                     im var2;
                     (var2 = (im)C.elementAt(var1.d)).q = false;
                     af.b = var2.a / gx.j;
                     af.c = var2.b / gx.j;
                     if (this.aH) {
                        if (var2.v == 5) {
                           this.p();
                           this.u();
                        } else {
                           boolean var3 = false;
                           if (var2.j != -1 && var2.v < 6 && var2.t == 36) {
                              this.b(new dv(this, var2));
                              var3 = true;
                           }

                           if (var2.j != -1 && var2.v < 6) {
                              if (var1.d >= C.size()) {
                                 break label218;
                              }

                              if (var2.o && this.c(var1.d, 7)) {
                                 var3 = true;
                              }

                              if (var2.p && this.c(var1.d, 3)) {
                                 var3 = true;
                              }

                              if (var2.s < 80) {
                                 boolean var4 = false;

                                 for(int var16 = 0; var16 < E.size(); ++var16) {
                                    b5 var5;
                                    if ((var5 = g(((df)E.elementAt(var16)).b)).f == 2 && (var5.b == 111 || var5.b == 112)) {
                                       var4 = true;
                                       h2.b().c(A, var1.d, var5.b);
                                       break;
                                    }
                                 }

                                 if (!var4) {
                                    k4.c(hq.dc);
                                 }
                              }
                           }

                           if (!var3) {
                              this.u();
                           }
                        }
                     } else if (var2.v == 5) {
                        this.p();
                        this.u();
                     } else {
                        this.b(new dw(this, var2));
                        this.b(new f9(this, var1));
                     }

                     this.aN.removeElement(var1);
                  }
               } else {
                  aI = -1;
                  this.l();
               }
            }
         }

         if (aq != -1) {
            if (k4.d(2)) {
               k4.f[2] = false;
               int var7 = aq;
               if (aq % 12 % 4 != 0) {
                  --var7;
               }

               if (var7 >= 0) {
                  aq = var7;
               }
            } else if (k4.d(4)) {
               k4.f[4] = false;
               int var8 = aq;
               var8 -= 4;
               if (var8 >= 0) {
                  aq = var8;
               }
            } else if (k4.d(6)) {
               k4.f[6] = false;
               int var10 = aq;
               var10 += 4;
               if (var10 < C.size()) {
                  aq = var10;
               }
            } else if (k4.d(8)) {
               k4.f[8] = false;
               int var12 = aq;
               if (aq % 12 % 4 != 3) {
                  ++var12;
               }

               if (var12 < C.size()) {
                  aq = var12;
               }
            } else {
               label207:
               if (k4.d(5)) {
                  int var13 = gx.j;
                  im var17;
                  if ((var17 = (im)C.elementAt(aq)).j != -1 && var17.v < 6) {
                     if (this.aH) {
                        if (!var17.q) {
                           this.aN.addElement(new cn(var17.a / var13, var17.b / var13, aq));
                        }

                        var17.q = true;
                        this.u();
                        break label207;
                     }
                  } else if (!this.aH) {
                     if (!var17.q) {
                        this.aN.addElement(new cn(var17.a / var13, var17.b / var13, aq));
                     }

                     var17.q = true;
                     this.u();
                     break label207;
                  }

                  k4.c(hq.c_);
               }
            }

            if (k4.ah == 0) {
               im var18 = (im)C.elementAt(aq);
               cl.b().b(var18.a, var18.b);
            }
         }

         if (k4.i) {
            int var14 = k4.j + cl.b().c;
            int var19 = k4.k + cl.b().d;
            int var21 = gx.j * ev.a;
            if (var19 / var21 * gx.f + var14 / var21 >= 0
               && var19 / var21 * gx.f + var14 / var21 <= gx.h.length
               && gx.h[var19 / var21 * gx.f + var14 / var21] == 51) {
               this.aO = true;
               aL = true;
               var21 = this.f(var14 / var21, var19 / var21);
               im var25 = (im)C.elementAt(var21);
               af.b = var25.a / gx.j;
               af.c = var25.b / gx.j;
            }
         }

         if (this.aO && k4.h) {
            this.aO = false;
            aL = false;
            int var15 = k4.j + cl.b().c;
            int var20 = k4.k + cl.b().d;
            int var23 = gx.j * ev.a;
            if (!this.aG && super.f != null && af != null && var15 / var23 == af.b && var20 / var23 == af.c) {
               super.f.a();
            } else if (var20 / var23 * gx.f + var15 / var23 >= 0
               && var20 / var23 * gx.f + var15 / var23 <= gx.h.length
               && gx.h[var20 / var23 * gx.f + var15 / var23] == 51) {
               var23 = this.f(var15 / var23, var20 / var23);
               im var26 = (im)C.elementAt(var23);
               af.b = var26.a / gx.j;
               af.c = var26.b / gx.j;
               if (this.aG && var23 >= 0 && var23 < C.size()) {
                  aq = var23;
                  if (var26.j != -1 && var26.v != 5 && var26.v < 6) {
                     k4.h = false;
                     if (this.aH) {
                        if (!var26.q) {
                           this.aN.addElement(new cn(var15 / gx.j, var20 / gx.j, var23));
                        }

                        var26.q = true;
                        this.u();
                     } else if (var26.v != 5) {
                        k4.c(hq.db);
                     }
                  } else {
                     k4.h = false;
                     if (this.aH && var26.v != 5) {
                        k4.c(hq.da);
                     } else {
                        if (!var26.q) {
                           this.aN.addElement(new cn(var15 / gx.j, var20 / gx.j, var23));
                        }

                        var26.q = true;
                        this.u();
                     }
                  }
               } else {
                  k4.l = k4.j -= gx.j * ev.a;
                  this.aM = true;
               }
            }
         }

         if (k4.d[5] && (gx.b == 24 || gx.b == 53) && super.e != null && super.f == null) {
            super.e.a();
         }

         super.c();
         k4.A.b();
         if (aj == -1) {
            GameMidlet.k.e();
            return;
         }
      } catch (Exception var6) {
      }
   }

   private void u() {
      if (this.aN.size() > 0 && aI != -1) {
         this.aM = true;
         cn var1 = (cn)this.aN.elementAt(0);
         if (GameMidlet.k.aM == null) {
            gx.C = new cn();
            GameMidlet.k.p();
         }

         gx.C.b = var1.b * 24 - 24;
         gx.C.c = var1.c * 24 + 12;
         GameMidlet.k.Z = -5;
         GameMidlet.k.aa = -1;
         GameMidlet.k.l = GameMidlet.k.a;
         GameMidlet.k.m = GameMidlet.k.b;
         GameMidlet.k.aR = gx.C;
         GameMidlet.k.o();
      }
   }

   public final void b(Graphics var1) {
      label11: {
         this.a(var1);
         if (k4.H != null) {
            new ew();
            if (ew.y) {
               break label11;
            }
         }

         super.b(var1);
      }

      k4.b(var1);
   }

   public final void a(Graphics var1) {
      k4.A.c(var1);
      k4.A.e(var1);
      if (aq >= 0) {
         if (this.aP >= 8) {
            this.aP = 0;
         }

         im var2 = (im)C.elementAt(aq);
         AutoController.h();
         var1.drawImage(AutoController.C, var2.a * ev.a, (var2.b - 24 + this.aP / 2) * ev.a, 3);
         ++this.aP;
      } else if (k4.ah == 0 && af != null && af.b != -1 && gx.b != 25) {
         if (this.aP >= 8) {
            this.aP = 0;
         }

         AutoController.h();
         var1.drawImage(AutoController.C, (af.b * gx.j + gx.j / 2) * ev.a, (af.c * gx.j - 4 + this.aP / 2) * ev.a, 3);
         ++this.aP;
      }

      if (gx.b != 25) {
         k4.V.b(var1, this.B, (ag.b + 26) * ev.a, (ag.c - 14) * ev.a + (ev.a - 1) * 7, 2);
      }

      k4.d(var1);
      gx.b(var1);
   }

   public static void b(Vector var0, Vector var1, Vector var2, Vector var3, byte var4, boolean var5) {
      D = var0;
      ae = var5;
      aQ = var4;
      int var7 = D.size();

      for(int var8 = 0; var8 < var7; ++var8) {
         br var6;
         df var10;
         if ((var6 = f8.c((var10 = (df)D.elementAt(var8)).b)) != null) {
            var10.g = var6.b;
         }
      }

      G = var1;

      for(int var9 = 0; var9 < G.size(); ++var9) {
         b((df)G.elementAt(var9));
      }

      E = var2;
      F = var3;
   }

   private static void b(df var0) {
      if (var0.b < 50) {
         var0.e[0] = f8.c(var0.b).i;
         var0.g = f8.c(var0.b).b;
      } else {
         if (var0.b < 100) {
            var0.e[0] = f8.d(var0.b).g;
            if (f8.d(var0.b).d == 1) {
               var0.g = hq.bd + " " + f8.d(var0.b).m;
               return;
            }

            if (f8.d(var0.b).d == 2) {
               if (var0.b == 55) {
                  var0.g = hq.dd + " " + f8.d(var0.b).m;
                  return;
               }

               var0.g = hq.bc + " " + f8.d(var0.b).m;
            }
         }
      }
   }

   public static b5 g(int var0) {
      for(int var1 = 0; var1 < f8.k.size(); ++var1) {
         b5 var2;
         if ((var2 = (b5)f8.k.elementAt(var1)).b == var0) {
            return var2;
         }
      }

      return null;
   }

   public static void b(df var0, int var1, int var2, int var3) {
      GameMidlet.k.b(var1, var2, var3);
      fb.ac = true;
      if (var0.b >= 50 && var0.b <= 100) {
         C = null;
      }

      if (var0.f > 0) {
         if (var0.b >= 111) {
            df var5;
            if ((var5 = df.b(E, var0.b)) != null) {
               var5.f += var0.f;
               return;
            }

            b5 var6 = g(var0.b);
            var0.g = var6.g;
            E.addElement(var0);
            return;
         }

         if (var0.b <= 100 && var0.b < 50) {
            df var4;
            if ((var4 = df.b(D, var0.b)) != null) {
               var4.f += var0.f;
            } else {
               D.addElement(var0);
               var0.g = f8.c(var0.b).b;
            }

            if (D.size() == 0) {
               D.addElement(var0);
            }
         }
      }
   }

   public final void b(int var1, Vector var2, Vector var3, byte var4, byte var5, short var6, int var7) {
      aR = (byte)var4;
      aS = var5;
      aX = var6;
      aW = var7;
      A = var1;
      if (var1 != GameMidlet.k.f) {
         i3 var21;
         if ((var21 = fd.c(var1)) == null) {
            k4.c(hq.be);
            return;
         }

         if (var21.L == null) {
            var21.b(var21.g);
         }

         this.B = var21.L;
         K[0].removeAllElements();
         K[1].removeAllElements();
      } else {
         this.B = GameMidlet.k.L;
      }

      C = var2;
      if (gx.b != 24 && gx.b != 53 && J.size() == 0) {
         J = var3;
      }

      v();
      if (this.aY) {
         if (aT || gx.b != 24 && gx.b != 53) {
            aT = false;
            af = new cn();
            aj = -1;
            this.ar = 0;
            iv.U = -1;
            iw.S = -1;
            this.W = new cn[4];
            k4.A.f(25);
            k4.O = 0;
            byte var22 = var5;
            int var10 = var4;

            try {
               Z = i0.S + var22;
               Y = iv.T + var10;
               int var13 = ai.b / 24;
               int var15 = ah.b / 24 + 2;
               InputStream var17;
               gx.e = new short[(var17 = gx.e(25)).available()];

               for(int var19 = 0; var19 < gx.e.length; ++var19) {
                  gx.e[var19] = (short)var17.read();
               }

               short[] var20 = new short[gx.e.length + gx.g * (var22 + var10)];
               var4 = 0;

               for(int var24 = 0; var24 < gx.e.length; ++var24) {
                  var20[var4] = gx.e[var24];
                  ++var4;
                  if (var24 % gx.f == var13) {
                     for(int var8 = 0; var8 < var22; ++var8) {
                        var20[var4] = gx.e[var24];
                        ++var4;
                     }
                  }

                  if (var24 % gx.f == var15) {
                     for(int var25 = 0; var25 < var10; ++var25) {
                        var20[var4] = gx.e[var24];
                        ++var4;
                     }
                  }
               }

               gx.f = (short)(gx.f + var22 + var10);
               gx.e = var20;
               gx.m.removeAllElements();
               gx.b(null, gx.b + 1, true);
               i3 var26 = GameMidlet.k;
               GameMidlet.k.a += var10 * 24;
               int var10001 = ai.b + 12;
               new b2();
               var10001 += b2.e(Z - 2) * 24;
               int var10002 = ai.c + 12;
               new b2();
               gx.b(849, var10001, var10002 + b2.e(3) * 24);
            } catch (Exception var9) {
               var9.printStackTrace();
            }

            H = new Vector();
            I = new Vector();
            b(1, iz.T, (byte)87, -8, H);
            b(2, iv.R, (byte)86, -7, I);
            var10 = J.size();

            for(int var14 = 0; var14 < var10; ++var14) {
               iu var16;
               if ((var16 = (iu)J.elementAt(var14)) instanceof i0) {
                  ((i0)var16).c();
               } else if (var16 instanceof iz) {
                  ((iz)var16).c();
               } else if (var16 instanceof iw) {
                  ((iw)var16).c();
               } else if (var16 instanceof iv) {
                  ((iv)var16).c();
               } else {
                  var16.c();
               }

               gx.n.addElement(var16);
            }

            k4.O = 1;
            k4.h();
         }

         for(int var12 = 0; var12 < gx.m.size(); ++var12) {
            il var23;
            if ((var23 = (il)gx.m.elementAt(var12)).f < 800 && var23.f >= 100 || var23.f == -3 || var23 instanceof im) {
               gx.m.removeElement(var23);
               --var12;
            }
         }

         this.q();
         this.as = System.currentTimeMillis();
         this.at = System.currentTimeMillis();
         if (k4.u != this) {
            super.d();
         }

         if (k4.N) {
            new ew();
            ew.l();
         }

         GameMidlet.k.l = GameMidlet.k.a;
         GameMidlet.k.m = GameMidlet.k.b;
      }

      this.aY = true;
      if (aU != -1) {
         GameMidlet.k.a = GameMidlet.k.l = aU;
         GameMidlet.k.b = GameMidlet.k.m = aV;
         aU = -1;
         aV = -1;
      }

      super.e = ax;
      super.g = null;
      super.f = null;
   }

   private static void b(int var0, cn var1, byte var2, int var3, Vector var4) {
      int var5 = 0;

      for(int var6 = 0; var6 < J.size(); ++var6) {
         iu var7;
         n var8;
         if ((var8 = f8.d((var7 = (iu)J.elementAt(var6)).J)).d == var0 && var8.i != -1) {
            boolean var11 = false;

            for(int var9 = 0; var9 < var4.size(); ++var9) {
               if (((cn)var4.elementAt(var9)).d == var7.J) {
                  var11 = true;
                  break;
               }
            }

            if (!var11) {
               int var12 = var1.b + var5 * 24;
               var4.addElement(new cn(var12, var1.c, var7.J));
               int var10 = gx.g(var12, var1.c);
               gx.h[var10] = var2;
               gx.b(var3, var12, var1.c);
               ++var5;
            }
         }
      }
   }

   public static void v() {
      Vector var0 = new Vector();

      for(int var1 = 0; var1 < J.size(); ++var1) {
         iu var2;
         n var3 = f8.d((var2 = (iu)J.elementAt(var1)).J);
         if (var2 instanceof iy) {
            boolean var4 = false;

            for(int var5 = 0; var5 < var0.size(); ++var5) {
               cn var6;
               if ((var6 = (cn)var0.elementAt(var5)).d == var2.J) {
                  ((iy)var2).Q = var6.b;
                  var4 = true;
                  break;
               }
            }

            if (!var4) {
               ((iy)var2).Q = var2.f;
               var0.addElement(new cn(var2.f, 0, var2.J));
            }
         }

         int var7;
         if ((var7 = var3.e * 60 / 3) > 0) {
            var2.C = var2.F / var7;
         }

         if (var2.C > 2) {
            var2.C = 2;
         }

         if (var2.F == -1 || var3.d == 3) {
            var2.C = 0;
         }
      }
   }

   public final void g(int var1, int var2) {
      df var3;
      if ((gx.b == 24 || gx.b == 53) && (var3 = df.b(D, var2)) != null) {
         im var4;
         (var4 = (im)C.elementAt(var1)).j = var2;
         this.b(var4, 4);
         gx.e[var4.i * gx.f + var4.h] = var4.t;
         var4.v = 0;
         var4.p = false;
         var4.o = false;
         var4.k = 0;
         var4.m = 0L;
         var4.s = 100;
         var4.r = 0;
         --var3.f;
         if (var3.f <= 0) {
            D.removeElement(var3);
         }
      }
   }

   public final void h(int var1) {
      im var4;
      if ((var4 = (im)C.elementAt(var1)).j == -1) {
         this.b(var4, 2);
      } else {
         br var2;
         int var3 = (var2 = f8.e(var4.j)).f * 60 / 5;
         var4.v = var4.k / var3;
         if (var4.v >= 5) {
            var4.v = 5;
         }

         if (var4.k < 0 || var2.g != -1 && var4.k - var2.f * 60 > var2.g * 60 || var4.r == 100 || var4.v < 0) {
            var4.v = 6;
         }

         if (var4.n) {
            this.b(var4, 3);
         } else {
            this.b(var4, 4);
         }
      }

      gx.e[var4.i * gx.f + var4.h] = var4.t;
   }

   public final void b(im var1, int var2) {
      if (var1.u == 2) {
         var1.t = this.ab[var2];
      } else {
         var1.t = this.aa[var2];
      }
   }

   public static void h(int var0, int var1) {
      im var4 = (im)C.elementAt(var0);
      if (var1 > 0) {
         br var2;
         if ((var2 = f8.c(var4.j)).m) {
            k4.c(var1, var4.h * gx.j + 11, var4.i * gx.j, var2.d[var4.v]);
         } else {
            hp var3 = f8.f[var2.d[var4.v]];
            int var10001 = var4.h * gx.j + 11;
            int var10002 = var4.i * gx.j;
            new b2();
            k4.b(var1, var10001, var10002, b2.b(var3.d * ev.a, var3.e * ev.a, var3.f * ev.a, var3.g * ev.a, f8.h[var3.c]), -1);
         }
      }

      if (A == GameMidlet.k.f) {
         var4.v = 6;
         var4.r = 100;
         var4.p = false;
         var4.o = false;
      }

      br var5;
      if ((var5 = f8.c(var4.j)).m) {
         df var8;
         if ((var8 = k(var5.k)) != null) {
            var8.f += var1;
         } else {
            (var8 = new df()).b = var5.k;
            var8.f = var1;
            var8.e[0] = var5.i;
            var8.g = var5.b;
            F.addElement(var8);
         }
      } else {
         df var6;
         if ((var6 = df.b(G, var5.c)) != null) {
            var6.f += var1;
         } else {
            (var6 = new df()).b = var5.c;
            var6.f = var1;
            var6.e[0] = f8.c(var5.c).i;
            var6.g = f8.c(var5.c).b;
            G.addElement(var6);
         }
      }
   }

   public static void i(int var0, int var1) {
      iu var5 = i(var0);
      if (var1 > 0 && var5 != null) {
         n var2;
         n var3 = var2 = f8.d(var5.J);
         df var4;
         if ((var4 = df.b(G, var3.b)) != null) {
            var4.f += var1;
         } else {
            (var4 = new df()).b = (short)var3.b;
            var4.f = var1;
            var4.g = var3.m;
            var4.e[0] = var3.g;
            b(var4);
            G.addElement(var4);
         }

         if (f5.d(var2.i) != null) {
            cn var6 = null;
            if (var2.d == 1) {
               var6 = b(H, var5.J);
            } else if (var2.d == 2) {
               var6 = b(I, var5.J);
            }

            if (var6 != null) {
               k4.b(var1, var6.b, var6.c - 25, f5.d(var2.i).b, -1);
            }
         }
      }
   }

   private static cn b(Vector var0, int var1) {
      for(int var2 = 0; var2 < var0.size(); ++var2) {
         cn var3;
         if ((var3 = (cn)var0.elementAt(var2)).d == var1) {
            return var3;
         }
      }

      return null;
   }

   public static void b(int var0, int var1, byte var2, String var3, int var4, int var5, int var6) {
      if (var0 == A) {
         String[] var7 = bb;
         new StringBuffer(var7[8]).append(var1).append(var7[12]).append((int)var2);
         GameMidlet.k.b(var4, var5, var6);
         k4.c(var3);
      }
   }

   public final void a(int var1, boolean var2) {
      this.aY = var2;
      h2.b().d(var1);
   }

   public final void b(int var1, String var2) {
      k4.b(hq.bf + " " + var2 + "?", new ga(var1));
   }

   public final void w() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < f8.g.length; ++var2) {
         a4 var3 = new a4(hq.P, f8.g[var2].c, var2);
         var1.addElement(var3);
      }

      int var5 = f8.j.size();

      for(int var6 = 0; var6 < var5; ++var6) {
         n var4 = (n)f8.j.elementAt(var6);
         a5 var7 = new a5(hq.P, var6, var4, var6);
         var1.addElement(var7);
      }

      fb.g().d();
      fb.g().b(new String[]{hq.bh, hq.bi, hq.aO}, new Vector[]{var1, this.x(), this.y()}, null);
      if (k4.N) {
         new ew();
         if (!ew.O) {
            (k4.H = new ew()).b(fb.z);
         }
      }
   }

   private Vector x() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < f8.k.size(); ++var2) {
         b5 var3;
         if ((var3 = (b5)f8.k.elementAt(var2)).d && (var3.i > 0 || var3.h > 0)) {
            var1.addElement(new ba(hq.P, var2, var3, var2));
         }
      }

      return var1;
   }

   private Vector y() {
      Vector var1 = new Vector();
      int var2 = G.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         df var4;
         if (f8.c((var4 = (df)G.elementAt(var3)).b) != null || var4.b >= 50) {
            bd var5 = new bd(hq.a7, new dx(var3), var3, var4);
            var1.addElement(var5);
         }
      }

      for(int var7 = 0; var7 < F.size(); ++var7) {
         df var8;
         b5 var9 = g((var8 = (df)F.elementAt(var7)).b);
         String[] var6 = bb;
         new StringBuffer(var6[29]).append(var9).append(var6[1]).append(var8.b);
         var1.addElement(new bh("", var7, var9, var7, var8));
      }

      return var1;
   }

   public final void z() {
      if (GameMidlet.k.f != A) {
         k4.c(hq.bj);
      } else {
         Vector var1 = new Vector();

         for(int var2 = 0; var2 < D.size(); ++var2) {
            df var3;
            if (f8.c((var3 = (df)D.elementAt(var2)).b) != null) {
               at var5 = new at("", var2, var3, var2);
               var1.addElement(var5);
            }
         }

         for(int var4 = 0; var4 < E.size(); ++var4) {
            bm var6 = new bm("", var4, var4);
            var1.addElement(var6);
         }

         fb.g().d();
         fb.g().b(new String[]{hq.aO, hq.bk}, new Vector[]{this.y(), var1}, null);

         for(int var7 = 0; var7 < G.size(); ++var7) {
            G.elementAt(var7);
         }
      }
   }

   public final void j(int var1, int var2) {
      if (var2 != 3 && !fb.k()) {
         fb.j();
         if (k4.N) {
            k4.H = new ew();
            new ew();
            if (ew.H > 2) {
               new ew();
               --ew.H;
            }

            k4.H.b(fb.z);
            return;
         }
      } else {
         int var3 = fb.i();
         int var4 = 0;
         int var5 = 0;
         if (var2 == 0) {
            br var6;
            var4 = (var6 = f8.e(var1)).h[0];
            var5 = var6.h[1];
         } else if (var2 == 2) {
            var4 = f8.b(var1).e[0];
            var5 = f8.b(var1).e[1];
         } else if (var2 == 4 && (var2 = g(var1)) != null) {
            var4 = var2.h;
            var5 = var2.i;
         }

         k4.b(var4 * var3, var5 * var3, new j9(var1, var3, var4), new jo(var1, var3, var5), null);
      }
   }

   public final void b(int var1, int var2) {
      label127: {
         switch(var1) {
            case 0:
               this.l();
               return;
            case 1:
               if (k4.H == null) {
                  break label127;
               }

               new ew();
               if (ew.y) {
                  break label127;
               }
               break;
            case 2:
               fj var16 = this;
               Vector var17 = new Vector();
               iu var3;
               n var4 = f8.d((var3 = i(((it)gx.u).f)).J);

               for(int var5 = 0; var5 < E.size(); ++var5) {
                  df var6;
                  b5 var7;
                  if ((var7 = g((var6 = (df)E.elementAt(var5)).b)).e == var4.d && var7.f == 5 && (var4.d == 4 || var4.d == 1)) {
                     int var21 = var6.f;
                     if (var4.d == 4) {
                        var21 -= K[1].size();
                     } else if (var4.d == 1) {
                        var21 -= K[0].size();
                     }

                     var17.addElement(new az(var7.g + "(" + var21 + ")", new ef(var16, var6, var4), var7));
                  }
               }

               for(int var18 = 0; var18 < E.size(); ++var18) {
                  df var19;
                  b5 var20;
                  if ((var20 = g((var19 = (df)E.elementAt(var18)).b)).f != 5
                     && var20.e != 0
                     && (var20.e == var4.d || var20.e == 101 || var20.e == 100 && var4.d != 4)
                     && (var20.f != 4 || var3.I[0] || var3.I[1])
                     && (var20.f != 6 || var3.G < 100)) {
                     var17.addElement(new aw(var20.g + "(" + var19.f + ")", new dr(var16, var20, var19), var20));
                  }
               }

               if (A == GameMidlet.k.f) {
                  var17.addElement(new ax(hq.a7));
               }

               b(var17);
               return;
            case 3:
               this.i();
               return;
            case 4:
               this.j();
               return;
            case 5:
               super.e = ax;
               super.g = null;
               this.aG = false;
               cl.b();
               cl.q = false;
               this.aH = false;
               this.aN.removeAllElements();

               for(int var15 = 0; var15 < C.size(); ++var15) {
                  ((im)C.elementAt(var15)).q = false;
               }

               aq = -1;
               aI = -1;
               aL = false;
               return;
            case 6:
               this.k();
               return;
            case 7:
               Vector var8 = new Vector();
               if (A != GameMidlet.k.f) {
                  String[] var9 = bb;
                  var8.addElement(new ag(var9[25], 34));
               } else {
                  var8.addElement(new ag(kq.b[0], 16));
                  var8.addElement(new ag(kq.b[1], 17));
                  var8.addElement(new ag(kq.b[2], 21));
                  var8.addElement(new ag(kq.c[0], 27));
                  var8.addElement(new ag(hq.aO, 18));
                  var8.addElement(new ag(kq.b[4], 22, this));
                  var8.addElement(new ag(kq.b[3], 19));
               }

               String[] var22 = bb;
               var8.addElement(new ag(var22[7], new ke()));
               String var10003 = var22[33];
               AutoController.h();
               var8.addElement(new ag(var10003, 9, AutoController.h()));
               var8.addElement(new ag(hq.y, 20));
               f1.d().b(var8, 0);
               return;
            case 8:
               ad = false;
               super.g = null;
               super.f = null;
               super.e = ax;
               this.aZ = 0;
               cl.b();
               cl.q = false;
               return;
            case 9:
               ++this.aZ;
               this.a(10, -1);
               return;
            case 34:
               try {
                  e1 var11 = k4.x;
                  cs var12 = k4.x.o;
                  if (k4.x.o.o.equals("")) {
                     return;
                  }

                  e1 var13 = k4.x;
                  cs var14 = k4.x.o;
                  j7.d = Short.parseShort(k4.x.o.o);
                  return;
               } catch (Exception var10) {
                  return;
               }
            case 51:
               h2.b().c(A, 1);
               this.as = System.currentTimeMillis();
               this.a(A, true);
               return;
            case 52:
               h2.b().c(A, 2);
               this.as = System.currentTimeMillis();
               this.a(A, true);
               return;
            case 53:
               this.b((byte)0, -1);
               k4.h();
               return;
            case 54:
               this.B();
         }

         return;
      }

      f1.d().b(this.aF, 0);
   }

   public static void A() {
      if (gx.b == 24 || gx.b == 53) {
         k4.w = null;
         k4.b(hq.bl, 54, null);
      }
   }

   public static boolean c(short var0, int var1) {
      if (df.b(E, var0) == null) {
         return false;
      } else {
         h2.b().c(A, var1, var0);
         return false;
      }
   }

   public final void b(byte var1) {
      Vector var2 = new Vector();

      for(int var3 = 0; var3 < E.size(); ++var3) {
         df var4;
         b5 var5;
         if (((var5 = g((var4 = (df)E.elementAt(var3)).b)).e == var1 || var5.e == 101) && var5.f == 5) {
            var2.addElement(new bb(var5.g + "(" + var4.f + ")", new v(var1, var4), var5));
         }
      }

      f1.d().b(var2, k4.q, gx.j * ev.a, gx.j * ev.a);
   }

   private static void b(iu var0) {
      h2.b().d(A, var0.f);
   }

   public static void b(int var0, int var1, Vector var2) {
      if (GameMidlet.k.f == A && var1 >= 0 && var1 < var2.size()) {
         cn var5 = (cn)var2.elementAt(var1);

         for(int var6 = 0; var6 < J.size(); ++var6) {
            iu var3;
            n var4 = f8.d((var3 = (iu)J.elementAt(var6)).J);
            if (var3.N > 0 && var5.d == var3.J) {
               var3.N = 0;
               if (var0 == 1 && var4.d == var0) {
                  b(var3);
                  j(-50);
               }

               if (var0 == 2 && var4.d == var0) {
                  b(var3);
                  j(-51);
               }
            }
         }
      }
   }

   public final void b(int var1, int var2, short var3) {
      GameMidlet.k.A[0] = var2;
      fb.ac = true;
      k4.c(hq.bn + var1 + hq.U);
      df var4;
      if ((var4 = df.b(G, var3)) == null) {
         df var5 = df.b(F, var3);
         F.removeElement(var5);
      } else {
         G.removeElement(var4);
      }

      if (k4.u == fb.g()) {
         fb.g().e();
         if (gx.b == 25) {
            this.w();
            fb.g().e(2);
         } else {
            this.z();
         }
      }

      k4.h();
   }

   public static void k(int var0, int var1) {
      iu var4;
      if ((var4 = i(var0)) != null) {
         int var2 = var1 - GameMidlet.k.A[0];
         gx.u = null;
         Image var3 = f5.d(f8.d(var4.J).k[var4.C]).b;
         int var10001 = var4.a;
         int var10002 = var4.b - 7;
         new b2();
         k4.b(var2, var10001, var10002, b2.b(0, var4.L * var4.e, var3.getWidth(), var4.e, var3), -1);
         J.removeElement(var4);
         gx.n.removeElement(var4);
      }

      fb.ac = true;
      GameMidlet.k.A[0] = var1;
   }

   public final void b(byte var1, String var2) {
      k4.b(var2, new b1(var1));
   }

   public final void B() {
      iv.U = -1;
      iw.S = -1;
      this.X = null;
      super.g = null;
      hv.b().b(25, 0);
   }

   public static iu i(int var0) {
      for(int var1 = 0; var1 < J.size(); ++var1) {
         iu var2;
         if ((var2 = (iu)J.elementAt(var1)).f == var0) {
            return var2;
         }
      }

      return null;
   }

   public final void C() {
      if (GameMidlet.k.f == A) {
         Vector var1 = new Vector();
         if (aC.k > 0) {
            var1.addElement(new ai(hq.d4 + "(" + aC.k + ")"));
         }

         var1.addElement(new an(aC.l > 0 ? hq.d3 : hq.h));
         var1.addElement(new ah(hq.b8));
         b(var1);
      }
   }

   private static void j(int var0) {
      for(int var1 = 0; var1 < gx.m.size(); ++var1) {
         il var2;
         if ((var2 = (il)gx.m.elementAt(var1)).d == 8 && var2.f == var0) {
            gx.m.removeElement(var2);
            return;
         }
      }
   }

   public final void D() {
      if (A == GameMidlet.k.f) {
         Vector var1 = new Vector();
         Vector var2 = new Vector();

         for(int var3 = 0; var3 < f8.l.size(); ++var3) {
            if (!var2.contains(f8.l.elementAt(var3))) {
               var2.addElement(f8.l.elementAt(var3));
            }
         }

         f8.l = var2;

         for(int var7 = 0; var7 < f8.l.size(); ++var7) {
            g3 var4 = (g3)f8.l.elementAt(var7);
            var1.addElement(new ao(hq.n, new x(var4), var4, var7));
         }

         Vector var8 = new Vector();
         if (aX > 0) {
            var8.addElement(null);
            ap var5 = new ap(aW == 0 ? hq.d1 : hq.i, this);
            var8.addElement(var5);
         }

         fb.g().d();
         fb.g().ab = true;
         if (aX > 0) {
            fb.g().b(new String[]{hq.n, hq.c4}, new Vector[]{var1, null}, var8);
            fb var10000 = fb.g();
            ag var10001 = new ag(hq.bY, 0, this);
            byte var9 = 1;
            ag var6 = var10001;
            var10000.P[var9] = var6;
            fb.L = 1;
            fb.g().l();
            fb.g().o();
            return;
         }

         fb.g().b(new String[]{hq.n}, new Vector[]{var1}, null);
      }
   }

   public static void b(short var0, short var1) {
      try {
         for(int var2 = 0; var2 < aC.p.length; ++var2) {
            k4.c(0, aC.a + aC.p[var2], aC.b - 45 + aC.q[var2], aC.j);
         }

         k4.b(var1, GameMidlet.k.a, GameMidlet.k.b - GameMidlet.k.e, 10);
         aC.k = 0;
         df var4;
         if ((var4 = k(var0)) != null) {
            var4.f += var1;
         } else {
            (var4 = new df()).b = var0;
            var4.f = var1;
            F.addElement(var4);
         }

         k4.h();
      } catch (Exception var3) {
      }
   }

   public static df k(int var0) {
      for(int var1 = 0; var1 < F.size(); ++var1) {
         df var2;
         if ((var2 = (df)F.elementAt(var1)).b == var0) {
            return var2;
         }
      }

      return null;
   }

   public static df l(int var0) {
      for(int var1 = 0; var1 < G.size(); ++var1) {
         df var2;
         if ((var2 = (df)G.elementAt(var1)).b == var0) {
            return var2;
         }
      }

      return null;
   }

   public static void E() {
      fd.g().a(true);
   }

   static void b(fj var0, byte var1, int var2) {
      var0.b(var1, var2);
   }

   static void b(fj var0, im var1) {
      if (var1.j != -1 && var1.v < 6) {
         k4.c(hq.a8, 53);
      } else {
         var0.b((byte)0, -1);
         k4.h();
      }
   }

   static void l(int var0, int var1) {
      e(var0, var1);
   }

   static void b(fj var0) {
      var0.u();
   }

   static Vector F() {
      return D;
   }

   static void b(fj var0, b5 var1, short var2, iu var3) {
      var0.b(var1, var2, var3);
   }

   public static String G() {
      return e_.b(e_.d(e_.e(bb[11])));
   }

   static void m(int var0) {
      try {
         Thread.sleep((long)var0);
      } catch (InterruptedException var1) {
         var1.printStackTrace();
      }
   }

   static void c(fj var0) {
      if (GameMidlet.k.f != A) {
         String[] var12 = bb;
         k4.c(var12[20]);
      } else {
         try {
            String[] var6 = bb;
            jh var1 = j7.r.e(var6[19]);
            hx.b().b(Integer.parseInt(var1.d(0)), (byte)Integer.parseInt(var1.d(1)), Integer.parseInt(var1.d(2)));
            var1 = j7.r.e(var6[14]);
            hv.b().c(Integer.parseInt(var1.d(0)), Integer.parseInt(var1.d(1)), Integer.parseInt(var1.d(2)));
         } catch (NumberFormatException var7) {
            var7.printStackTrace();
         } catch (d var8) {
            var8.printStackTrace();
         }

         h2.b().c(A, 0, 100);
         var0.a(12, -1);

         for(int var10 = 0; var10 < C.size(); ++var10) {
            im var2;
            (var2 = (im)C.elementAt(var10)).q = false;
            if (var2.v == 5 && var2.j != -1) {
               kf.c = true;
               h2.b().b(A, var10);
               long var4 = System.currentTimeMillis();

               while(kf.c) {
                  if (System.currentTimeMillis() - var4 > 20000L) {
                     kf.c = false;
                     String[] var11 = bb;
                     k4.c(var11[17]);
                     return;
                  }

                  m(100);
               }
            }
         }

         if (aX != 0) {
            var0.D();
            if (aW == 0) {
               var0.b(2);
               m(500);
            }

            fb.g().e();
         }

         o();
         m(1000);
         k4.c(bb[10]);
      }
   }

   static void b(fj var0, int var1, int var2) {
      var0 = var0;
      --var1;
      --var2;
      if (GameMidlet.k.f != A) {
         k4.c(bb[20]);
      } else {
         for(int var3 = 0; var3 < C.size(); ++var3) {
            if (var3 >= var1 && var3 <= var2) {
               im var4;
               (var4 = (im)C.elementAt(var3)).q = false;
               var0.b(var4, 1);
               var4.v = 0;
               gx.e[var4.i * gx.f + var4.h] = var4.t;
               if (var4.j != -1) {
                  h2.b().b(A, var3, -1);
               }

               var4.j = -1;
            }
         }
      }
   }

   static void b(fj var0, int var1, int var2, int var3) {
      var0 = var0;
      --var2;
      --var3;
      if (GameMidlet.k.f != A) {
         String[] var12 = bb;
         k4.c(var12[20]);
      } else {
         df var9;
         if (!b((var9 = (df)D.elementAt(var1)).b, C.size())) {
            String[] var7 = bb;
            k4.c(var7[5]);
         } else {
            for(int var4 = 0; var4 < C.size(); ++var4) {
               if (var4 >= var2 && var4 <= var3) {
                  boolean var6 = false;
                  im var5;
                  (var5 = (im)C.elementAt(var4)).q = false;
                  if (var5.j == -1 || var5.v >= 6) {
                     var0.b(var5, 1);
                     var5.v = 0;
                     gx.e[var5.i * gx.f + var5.h] = var5.t;
                     if (var5.j != -1) {
                        h2.b().b(A, var4, -1);
                     }

                     var5.j = -1;
                     var6 = true;
                     h2.b().b(A, var4, var9.b);
                  }

                  if (!var6) {
                     k4.c(bb[27]);
                  }
               }
            }
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'U');
      }

      return var10000;
   }

   private static String c(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 18;
               break;
            case 1:
               var10005 = 44;
               break;
            case 2:
               var10005 = 73;
               break;
            case 3:
               var10005 = 73;
               break;
            case 4:
               var10005 = 49;
               break;
            case 5:
               var10005 = 125;
               break;
            default:
               var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
