import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fs extends e8 {
   private static fs z;
   ag A;
   ag B;
   ag C;
   public Image D;
   public g_ E;
   de F = new de();
   int G;
   int H;
   private int I;
   Image[] J;
   int K = 0;
   byte[] L;
   long M;
   short N;
   int O;
   private int P;
   private int Q;
   public static boolean R;
   public static int S;
   static boolean T;
   static int U;
   private static long V;
   private static boolean W;
   private static String[] X;
   private static String[] Y;
   static int Z;
   static int aa;
   static boolean ab;
   static int[] ac;
   private static final String[] bb;

   static {
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "gN\u0004IJG`\np]Ề{KzAmẐG\u0005IỼ@/\f\u0005oGÝ{K\u0007iỼ@5OǻG\u0007gZJeD;E\u000bPỞ\twÍ4\ngÎ\u00135\bHỢJ5O»\u0010$\fgÎ\tvD³Z$YÉ{K";
      int var4 = "gN\u0004IJG`\np]Ề{KzAmẐG\u0005IỼ@/\f\u0005oGÝ{K\u0007iỼ@5OǻG\u0007gZJeD;E\u000bPỞ\twÍ4\ngÎ\u00135\bHỢJ5O»\u0010$\fgÎ\tvD³Z$YÉ{K".length();
      char var1 = 2;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var14 = c(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var14;
                  if ((var7 += var1) >= var4) {
                     bb = var5;
                     W = true;
                     String[] var10 = new String[3];
                     String[] var8 = bb;
                     var10[0] = var8[5];
                     var10[1] = var8[10];
                     var10[2] = var8[2];
                     X = var10;
                     Y = new String[]{var8[4], var8[9]};
                     Z = 0;
                     aa = 2;
                     ab = true;
                     ac = new int[]{444, 449};
                     return;
                  }

                  var1 = var2.charAt(var7);
                  break;
               default:
                  var5[var3++] = var14;
                  if ((var7 += var1) < var4) {
                     var1 = var2.charAt(var7);
                     continue label24;
                  }

                  var2 = "iỼ@5X(ÓjH2ĔỬ\tqÕ4M$LAỼOzDćAN5BºS(\u000fKẴBz\\qF\tyÞ4M$[Ẇa\f.ớ$MÈ{\f9Ë%";
                  var4 = "iỼ@5X(ÓjH2ĔỬ\tqÕ4M$LAỼOzDćAN5BºS(\u000fKẴBz\\qF\tyÞ4M$[Ẇa\f.ớ$MÈ{\f9Ë%".length();
                  var1 = '\t';
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static fs g() {
      return z == null ? (z = new fs()) : z;
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            if (GameMidlet.k.q != 2 && GameMidlet.k.q != 13) {
               AutoController.h().d();
            }

            hv var5;
            (var5 = hv.b()).a((byte)82);
            var5.a();
            k4.i();
            super.f = null;
            return;
         case 1:
            hv.b().c();
            k4.i();
            return;
         case 2:
            this.h();
            hv.b().c();
            return;
         case 3:
            Vector var4;
            Vector var10000 = var4 = new Vector();
            String[] var3 = bb;
            var10000.addElement(new ag(var3[7] + kq.b(ab), 5));
            var4.addElement(new ag(kq.t[6] + kq.b(!T), 4));
            var3 = bb;
            var4.addElement(new ag(var3[3] + X[aa], 6));
            var4.addElement(new ag(var3[8] + Y[Z], 7));
            f1.d().b(var4, 0);
            return;
      }
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 4:
            T = !T;
            this.b(3, -1);
            f1.d().p = 1;
            f1.d().l = false;
            f1.d().g();
            return;
         case 5:
            ab = !ab;
            this.b(3, -1);
            f1.d().p = 0;
            f1.d().l = false;
            f1.d().g();
            return;
         case 6:
            aa = ++aa % X.length;
            this.b(3, -1);
            f1.d().p = 2;
            f1.d().l = false;
            f1.d().g();
            return;
         case 7:
            if (ab) {
               k4.c(bb[11]);
               return;
            }

            Z = ++Z % Y.length;
            this.b(3, -1);
            f1.d().p = 3;
            f1.d().l = false;
            f1.d().g();
            return;
      }
   }

   public fs() {
      this.A = new ag(hq.ca, 0);
      this.C = new ag(hq.b_, 1);
      this.B = new ag(hq.e, 2);
      super.f = this.A;
      String[] var1 = bb;
      super.e = new ag(var1[1], 3);
      bp.c(hq.aw);
      this.D = bp.b(var1[6]);
      this.E = g_.b(var1[0], 14 * ev.a, 14 * ev.a);
      bp.b();
      this.I = 530;
   }

   private void h() {
      GameMidlet.k.f();
      if (GameMidlet.k.s == 0) {
         i3 var1 = GameMidlet.k;
         GameMidlet.k.a -= 18;
      } else {
         i3 var2 = GameMidlet.k;
         GameMidlet.k.a += 18;
      }

      i3 var3 = GameMidlet.k;
      GameMidlet.k.b -= 10;
      cl.b();
      cl.b(k4.o / 10);
      AutoController.h();
      AutoController.N.removeElement(this.F);
      AutoController.h().d();
   }

   public final boolean c(int var1, int var2) {
      this.Q = k4.p - k4.p / 4;
      if (this.Q > k4.p - 70 * ev.a) {
         this.Q = k4.p - 70 * ev.a;
      }

      this.P = 60;
      if (this.P < (k4.o - gx.f * 24) / 2 + 50 * ev.a) {
         this.P = (k4.o - gx.f * 24) / 2 + 50 * ev.a;
      }

      this.K = 0;
      int var3 = gx.g(var1, var2);
      if (gx.e[var3 + 1] != 100 && gx.e[var3 + 1] != 16 && gx.e[var3 + 1] != 13) {
         GameMidlet.k.s = it.r;
      } else {
         GameMidlet.k.s = 0;
         this.P = k4.o - this.P;
      }

      GameMidlet.k.h(var1, var2);
      hv var4;
      (var4 = hv.b()).a((byte)86);
      var4.a();
      k4.i();
      super.g = this.B;
      k4.f();
      return true;
   }

   public final void b() {
      AutoController.h().b();
      if (this.F.p && !this.F.q) {
         if (this.K < this.L.length && System.currentTimeMillis() - this.M > (long)this.N && !W) {
            this.c(0);
         }

         if (GameMidlet.k.q == 2) {
            --this.O;
            if (this.O < 0) {
               this.O = 0;
               this.F.b(1);
            }
         }
      }
   }

   public final void a(int var1) {
      if (this.F.p && !this.F.q) {
         switch(var1) {
            case 50:
            case 52:
            case 54:
            case 56:
               k4.d[var1 - 48] = true;
            case 51:
            case 53:
            case 55:
         }
      } else {
         AutoController.h().a(var1);
      }
   }

   public final void c() {
      if (this.F.p && !this.F.q) {
         if (k4.d(2)) {
            this.c(2);
         } else if (k4.d(4)) {
            this.c(1);
         } else if (k4.d(6)) {
            this.c(3);
         } else if (k4.d(8)) {
            this.c(4);
         }
      }

      super.c();
   }

   private void c(int var1) {
      this.M = System.currentTimeMillis();
      if (this.K < this.L.length) {
         this.L[this.K] = (byte)var1;
      }

      ++this.K;
      if (GameMidlet.k.q != 2) {
         this.F.b(0);
         this.O = 2;
      }

      if (this.K >= this.L.length) {
         this.F.b(0);
         this.F.q = true;
         hv.b().b(this.L);
         k4.i();
      }
   }

   private static boolean d(int var0, int var1) {
      if (var0 == var1) {
         return true;
      } else {
         return Math.abs((var0 & 0xFF0000) - (var1 & 0xFF0000)) < GameMidlet.k.aW[0]
            && Math.abs((var0 & 0xFF00) - (var1 & 0xFF00)) < GameMidlet.k.aW[1]
            && Math.abs((var0 & 0xFF) - (var1 & 0xFF)) < GameMidlet.k.aW[2];
      }
   }

   void b(Image[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         Image var3;
         int var4 = (var3 = var1[var2]).getWidth();
         int var5 = var3.getHeight();
         int[] var6 = new int[var4 * var5];
         var3.getRGB(var6, 0, var4, 0, 0, var4, var5);
         int var21 = -1;
         int var7 = -1;
         int var8 = -1;
         int var9 = -1;
         int var10 = -1;
         int var11 = -1;
         int var12 = -1;
         int var13 = -1;

         for(int var14 = 0; var14 < 10; ++var14) {
            for(int var15 = var4 / 2; var15 >= var4 / 2 - 10; --var15) {
               var10 = 0;
               int var16 = 0;
               int var17 = var15;

               for(int var18 = var14 + 1; var18 < var5; ++var18) {
                  int var19 = -1;

                  for(int var20 = 0; var20 < var4 / 2; ++var20) {
                     if (d(var6[var18 * var4 + var20], var6[var14 * var4 + var15]) && (var6[var18 * var4 + var20 + 1] & 16777215) != 0) {
                        var19 = var20;
                        break;
                     }
                  }

                  if (var19 == -1 || var19 > var17 + 3 || var19 < var17 - 3) {
                     break;
                  }

                  if (var19 < var17) {
                     ++var10;
                     var16 = 0;
                     var17 = var19;
                  }

                  if (++var16 > 3) {
                     break;
                  }
               }

               if (var10 > 3) {
                  var21 = var15;
                  break;
               }
            }
         }

         for(int var22 = 0; var22 < 10; ++var22) {
            for(int var26 = var4 / 2; var26 < var4 / 2 + 10; ++var26) {
               var11 = 0;
               int var29 = 0;
               int var32 = var26;

               for(int var35 = var22 + 1; var35 < var5; ++var35) {
                  int var38 = -1;

                  for(int var41 = var4 - 1; var41 >= var4 / 2; --var41) {
                     if (d(var6[var35 * var4 + var41], var6[var22 * var4 + var26]) && (var6[var35 * var4 + var41 - 1] & 16777215) != 0) {
                        var38 = var41;
                        break;
                     }
                  }

                  if (var38 == -1 || var38 < var32 - 3 || var38 > var32 + 3) {
                     break;
                  }

                  if (var38 > var32) {
                     ++var11;
                     var29 = 0;
                     var32 = var38;
                  }

                  if (++var29 > 3) {
                     break;
                  }
               }

               if (var11 > 3) {
                  var7 = var26;
                  break;
               }
            }
         }

         for(int var23 = var5 - 1; var23 >= var5 - 10; --var23) {
            for(int var27 = var4 / 2; var27 >= var4 / 2 - 10; --var27) {
               var12 = 0;
               int var30 = 0;
               int var33 = var27;

               for(int var36 = var23 - 1; var36 >= 0; --var36) {
                  int var39 = -1;

                  for(int var42 = 0; var42 < var4 / 2; ++var42) {
                     if (d(var6[var36 * var4 + var42], var6[var23 * var4 + var27]) && (var6[var36 * var4 + var42 + 1] & 16777215) != 0) {
                        var39 = var42;
                        break;
                     }
                  }

                  if (var39 == -1 || var39 > var33 + 3 || var39 < var33 - 3) {
                     break;
                  }

                  if (var39 < var33) {
                     ++var12;
                     var30 = 0;
                     var33 = var39;
                  }

                  if (++var30 > 3) {
                     break;
                  }
               }

               if (var12 > 3) {
                  var8 = var27;
                  break;
               }
            }
         }

         for(int var24 = var5 - 1; var24 >= var5 - 10; --var24) {
            for(int var28 = var4 / 2; var28 < var4 / 2 + 10; ++var28) {
               var13 = 0;
               int var31 = 0;
               int var34 = var28;

               for(int var37 = var24 - 1; var37 >= 0; --var37) {
                  int var40 = -1;

                  for(int var43 = var4 - 1; var43 >= var4 / 2; --var43) {
                     if (d(var6[var37 * var4 + var43], var6[var24 * var4 + var28]) && (var6[var37 * var4 + var43 - 1] & 16777215) != 0) {
                        var40 = var43;
                        break;
                     }
                  }

                  if (var40 == -1 || var40 < var34 - 3 || var40 > var34 + 3) {
                     break;
                  }

                  if (var40 > var34) {
                     ++var13;
                     var31 = 0;
                     var34 = var40;
                  }

                  if (++var31 > 3) {
                     break;
                  }
               }

               if (var13 > 3) {
                  var9 = var28;
                  break;
               }
            }
         }

         if (var21 > 0 && var7 > 0 && var8 > 0) {
            if (var10 < var11 && var10 < var12) {
               var21 = -1;
            } else if (var11 < var10 && var11 < var12) {
               var7 = -1;
            } else {
               var8 = -1;
            }
         }

         if (var21 > 0 && var7 > 0 && var9 > 0) {
            if (var10 < var11 && var10 < var13) {
               var21 = -1;
            } else if (var11 < var10 && var11 < var13) {
               var7 = -1;
            } else {
               var9 = -1;
            }
         }

         if (var21 > 0 && var8 > 0 && var9 > 0) {
            if (var10 < var12 && var10 < var13) {
               var21 = -1;
            } else if (var12 < var10 && var12 < var13) {
               var8 = -1;
            } else {
               var9 = -1;
            }
         }

         if (var7 > 0 && var8 > 0 && var9 > 0) {
            if (var11 < var12 && var11 < var13) {
               var7 = -1;
            } else if (var12 < var11 && var12 < var13) {
               var8 = -1;
            } else {
               var9 = -1;
            }
         }

         int var25 = 0;
         if (var21 > 0 && var7 > 0) {
            var25 = GameMidlet.k.enableAutoFish ? 2 : 0;
         } else if (var8 > 0 && var9 > 0) {
            var25 = GameMidlet.k.enableAutoFish ? 4 : 0;
         } else if (var21 > 0 && var8 > 0) {
            var25 = GameMidlet.k.enableAutoFish ? 1 : 0;
         } else if (var7 > 0 && var9 > 0) {
            var25 = GameMidlet.k.enableAutoFish ? 3 : 0;
         }

         if (var25 == 0) {
            break;
         }

         this.L[var2] = (byte)var25;
      }

      if (this.N > 0) {
         this.F.b(0);
         this.F.q = true;
         hv.b().b(this.L);
         k4.i();
      } else {
         this.c(0);
      }
   }

   public final void b(Graphics var1) {
      AutoController.h().a(var1);
      if (this.F.p && !this.F.q && this.N != -1) {
         k4.d(var1);
         var1.translate(-cl.b().c, -cl.b().d);
         var1.setColor(8575990);
         if (this.J != null && this.K < this.J.length) {
            if (System.currentTimeMillis() - this.M > 50L) {
               var1.setColor(1423411);
            } else {
               var1.setColor(15612731);
            }

            var1.fillRoundRect(this.G - 1, this.H * ev.a - 1, this.J[this.K].getWidth() + 2, this.J[this.K].getHeight() + 2, 5, 5);
            var1.drawImage(this.J[this.K], this.G, this.H * ev.a, 0);
         }
      }

      k4.T.b(var1, kq.t[0] + k4.e(S), k4.q, 14, 2);
      if (T) {
         k4.T.b(var1, kq.t[5] + k4.e(U), k4.q, 26, 2);
      }

      super.b(var1);
   }

   public static de d(int var0) {
      int var1 = 0;

      while(true) {
         AutoController.h();
         if (var1 >= AutoController.N.size()) {
            return null;
         }

         AutoController.h();
         de var2;
         if ((var2 = (de) AutoController.N.elementAt(var1)).d.f == var0) {
            return var2;
         }

         ++var1;
      }
   }

   public final void b(boolean var1, String var2) {
      if (var1) {
         this.F.b();
         super.f = this.A;
         this.d();
         cl.b();
         cl.b(k4.o / 3);
         k4.h();
         this.b(0, -1);
      } else if (var2.indexOf(kq.t[4]) != -1 && System.currentTimeMillis() - V > 3000L) {
         hx.b().b(448, 1);
         V = System.currentTimeMillis();
         this.c(GameMidlet.k.a, GameMidlet.k.b);
      } else {
         k4.b(var2, 0, this);
         if (var2.indexOf(kq.t[1]) != -1) {
            AutoController.h();
            byte var10004 = AutoController.A;
            AutoController.h();
            new Thread(new ki(var10004, AutoController.B, GameMidlet.k.a, GameMidlet.k.b)).start();
         }
      }
   }

   public final void b(int var1) {
      switch(var1) {
         case 0:
            this.h();
      }
   }

   public static void e(int var0, int var1) {
      i3 var3;
      if ((var3 = gx.l(var0)) != null && (var3.q == 2 || var3.q == 13)) {
         de var2 = new de();
         AutoController.h();
         AutoController.N.addElement(var2);
         var2.b(var3);
         var2.c();
         cn var10000 = var2.e[var2.c - 1];
         int var10001 = var3.a + 70 + (ev.a - 1) * 35;
         new b2();
         var10000.b = var10001 + b2.e(25);
         var2.e[var2.c - 1].c = var3.b;
         var2.k = 1;
         var2.l = -1;
         var2.b(1);
         if (var1 == 2) {
            var2.p = true;
            return;
         }

         if (var1 == 3) {
            var2.p = true;
            var2.q = true;
            var2.i = 2;
         }
      }
   }

   public final void b(int var1, byte var2, byte var3, int var4, short var5) {
      i3 var6;
      if ((var6 = gx.l(var1)) == null && fd.C != null) {
         for(int var7 = 0; var7 < fd.C.size(); ++var7) {
            i3 var8;
            if ((var8 = (i3)fd.C.elementAt(var7)).f == var1) {
               var6 = var8;
            }
         }

         if (var6 != null) {
            Vector var9;
            (var9 = new Vector()).addElement(new bl(var6, var2, var3, var4, var5));
            fb.g().b(new String[]{hq.b8}, new Vector[1], var9);
            fb.g().d();
         }

         k4.h();
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '*');
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
               var10005 = 4;
               break;
            case 1:
               var10005 = 47;
               break;
            case 2:
               var10005 = 41;
               break;
            case 3:
               var10005 = 21;
               break;
            case 4:
               var10005 = 44;
               break;
            case 5:
               var10005 = 90;
               break;
            default:
               var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
