import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ff extends e8 {
   public static ff z;
   public int A;
   private Image B;
   private boolean C = false;
   private static int D;
   private static int E;
   private static int F;
   private static int G;
   private static int H;
   private static int I;
   private static int J;
   private static int K;
   private int L = 0;
   private long M;
   private int N;
   private boolean O;
   private int P;
   private long Q;
   private long R;
   private int S;
   private static final String[] T;

   public static ff g() {
      return z == null ? (z = new ff()) : z;
   }

   public final void d() {
      super.d();
      this.h();
      this.L = 0;
      if (super.f == null) {
         this.a();
      }

      this.i();
   }

   public ff() {
      bp.c(hq.aw);
      this.B = bp.b(T[0]);
      bp.b();
      this.a();
      b2.d();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            if (this.C && super.t > 0) {
               k4.e(hq.O);
               fi.g().X = System.currentTimeMillis();
               fi.g().q();
               return;
            } else {
               if (!this.C) {
                  this.C = true;
                  this.h();
                  super.t = 1 + b2.e(GameMidlet.b[fa.g().D[4]][this.A].length - 1);
                  this.i();
                  return;
               }

               this.C = false;
               return;
            }
         case 1:
            ff var7 = this;

            while(true) {
               k4.e(hq.c);
               if (var7.L >= GameMidlet.e[fa.g().D[4]].length) {
                  k4.c(hq.cT);
                  var7.L = 0;
                  return;
               }

               String var8;
               if ((var8 = GameMidlet.b(GameMidlet.e[fa.g().D[4]][var7.L])) != null) {
                  String[] var9 = k4.S.b(var8, "*");
                  GameMidlet.d[fa.g().D[4]] = new int[var9.length - 1][];
                  GameMidlet.c[fa.g().D[4]] = new String[var9.length - 1][];
                  GameMidlet.b[fa.g().D[4]] = new String[var9.length - 1][];

                  for(int var3 = 1; var3 < var9.length; ++var3) {
                     String[] var4 = k4.S.b(var9[var3], "\n");
                     GameMidlet.b[fa.g().D[4]][var3 - 1] = new String[var4.length - 1];
                     GameMidlet.c[fa.g().D[4]][var3 - 1] = new String[var4.length - 2];
                     GameMidlet.d[fa.g().D[4]][var3 - 1] = new int[var4.length - 2];
                     GameMidlet.b[fa.g().D[4]][var3 - 1][0] = var4[0];

                     for(int var5 = 1; var5 < var4.length - 1; ++var5) {
                        String[] var6 = k4.S.b(var4[var5], ":");
                        GameMidlet.b[fa.g().D[4]][var3 - 1][var5] = var6[0];
                        GameMidlet.c[fa.g().D[4]][var3 - 1][var5 - 1] = var6[1];
                        var6[2] = var6[2].substring(0, var6[2].length() - 1);
                        GameMidlet.d[fa.g().D[4]][var3 - 1][var5 - 1] = Integer.parseInt(var6[2]);
                     }
                  }

                  f5.j();
                  k4.h();
                  var7.h();
                  return;
               }

               ++var7.L;
            }
         case 2:
            this.C = false;
            this.A = 0;
            super.t = 0;
            fi.g().d();
      }
   }

   public final void a() {
      if (hq.P != null) {
         if (k4.ah == 0) {
            super.f = new ag(hq.P, 0);
         }

         if (GameMidlet.g == 0) {
            super.e = new ag(hq.g, 1);
         }

         super.g = new ag(hq.cX, 2);
      }
   }

   public final void h() {
      if (k4.ah > 0) {
         super.l = true;
      }

      int var1 = 176;
      if (176 > k4.o) {
         var1 = k4.o;
      }

      ib.b().b(hq.bB, var1 * ev.a, e8.x * 6, 1);
      J = ib.b().h + 4;
      K = ib.b().i + ib.t + ev.b;
      I = ib.b().f - (ib.t + (ev.b << 1));
      H = GameMidlet.b[fa.g().D[4]].length * e8.x + (this.C ? GameMidlet.b[fa.g().D[4]][this.A].length * e8.x : 0) - I;
      D = 0;
      E = 0;
      if (H < 0) {
         H = 0;
      }
   }

   public final void b() {
      if (this.N != 0) {
         if (E < 0 || E > H) {
            this.N -= this.N / 4;
            E += this.N / 20;
            if (this.N / 10 <= 1) {
               this.N = 0;
            }
         }

         if (E < 0) {
            if (E < -I / 2) {
               E = -I / 2;
               D = 0;
               this.N = 0;
            }
         } else if (E > H) {
            if (E < H + I / 2) {
               E = H + I / 2;
               D = H;
               this.N = 0;
            }
         } else {
            E += this.N / 10;
         }

         D = E;
         this.N -= this.N / 10;
         if (this.N / 10 == 0) {
            this.N = 0;
         }
      } else if (E < 0) {
         D = 0;
      } else if (E > H) {
         D = H;
      }

      if (E != D) {
         G = D - E << 2;
         F += G;
         E += F >> 4;
         F &= 15;
      }

      k4.A.c();
   }

   private void c(int var1) {
      this.A = var1;
      if (this.A >= GameMidlet.b[fa.g().D[4]].length) {
         this.A = 0;
      }

      if (this.A < 0) {
         this.A = GameMidlet.b[fa.g().D[4]].length - 1;
      }
   }

   public final void b(int var1, boolean var2) {
      super.t = var1;
      if (super.t >= GameMidlet.b[fa.g().D[4]][this.A].length || super.t <= 0) {
         super.t = 0;
         if (var2) {
            this.C = false;
            this.h();
         }
      }
   }

   public final void c() {
      ++this.Q;
      boolean var1 = false;
      if (k4.d(8)) {
         var1 = true;
         if (!this.C) {
            this.c(this.A + 1);
         } else {
            this.b(super.t + 1, true);
         }
      } else if (k4.d(2)) {
         var1 = true;
         if (!this.C) {
            this.c(this.A - 1);
         } else {
            this.b(super.t - 1, true);
         }
      }

      if (k4.i && k4.e(J, K, ib.b().g, I)) {
         k4.i = false;
         this.P = E;
         this.O = true;
         this.M = System.currentTimeMillis() / 10L;
      }

      if (this.O) {
         long var2 = System.currentTimeMillis() / 10L - this.M;
         int var4 = k4.l();
         if (k4.g) {
            if (k4.n % 3 == 0) {
               this.S = k4.k;
               this.R = this.Q;
            }

            this.N = 0;
            int var5 = (D + k4.k - K) / e8.x;
            if (this.C) {
               super.t = var5 - this.A;
            } else if (var5 >= 0 && var5 < GameMidlet.b[fa.g().D[4]].length) {
               this.A = var5;
            }

            if (b2.f(var4) >= 20 * ev.a) {
               super.l = true;
            } else if (var2 > 10L && var2 < 20L) {
               super.l = false;
            }

            if ((D = this.P + var4) < 0 || D > H) {
               D = this.P + var4 / 2;
            }

            E = D;
         }

         if (k4.h && k4.e(J, K, ib.b().g, I)) {
            int var8 = (int)(this.Q - this.R);
            int var6;
            if (b2.f(var6 = this.S - k4.k) > 40 && var8 < 10 && D > 0 && D < H) {
               this.N = var6 / var8 * 10;
            }

            this.R = -1L;
            if (Math.abs(var4) < 20 * ev.a) {
               if (var2 <= 10L) {
                  super.l = false;
               }

               if (!super.l) {
                  int var7 = (D + k4.k - K) / e8.x;
                  if (this.C) {
                     if (var7 - this.A > 0 && var7 - this.A < GameMidlet.b[fa.g().D[4]][this.A].length) {
                        super.t = var7 - this.A;
                        this.b(0, -1);
                     } else {
                        if (var7 - this.A <= 0) {
                           this.C = false;
                           super.t = 0;
                           this.A = var7;
                           var1 = true;
                        }

                        if (var7 >= GameMidlet.b[fa.g().D[4]][this.A].length - this.A
                           && var7 < GameMidlet.b[fa.g().D[4]][this.A].length - 1 + GameMidlet.b[fa.g().D[4]].length) {
                           this.C = false;
                           super.t = 0;
                           this.A = var7 - GameMidlet.b[fa.g().D[4]][this.A].length + 1;
                           var1 = true;
                        }
                     }
                  } else if (var7 >= 0 && var7 < GameMidlet.b[fa.g().D[4]].length) {
                     this.A = var7;
                     this.b(0, -1);
                  }
               }
            }
         }
      }

      if (k4.h) {
         this.O = false;
      }

      if (var1) {
         this.i();
      }

      super.c();
   }

   private void i() {
      if ((D = (this.A + (this.C ? super.t : 0)) * e8.x - I / 2 + e8.x / 2) < 0) {
         D = 0;
      }

      if (D > H) {
         D = H;
      }
   }

   public final void b(Graphics var1) {
      k4.A.c(var1);
      k4.A.e(var1);
      k4.d(var1);
      ib.b().b(var1);
      if (GameMidlet.k != null && !GameMidlet.k.g.equals("")) {
         k4.T.b(var1, hq.c0 + T[1] + GameMidlet.k.g, ib.b().h + ib.b().g / 2, ib.b().i - ev.i, 2);
      }

      var1.translate(J, K);
      var1.setClip(0, 0, ib.b().g - 9, ib.b().f - (ib.t + (ev.b << 1)));
      var1.translate(0, -E);
      if (!super.l) {
         k4.aa.c(var1, 2 * ev.a, this.A * e8.x + (this.C ? super.t * e8.x : 0), ib.b().g - 8 - 4 * ev.a, e8.x);
      }

      int var2 = (e8.x - ev.j) / 2;

      for(int var3 = 0; var3 < GameMidlet.b[fa.g().D[4]].length; ++var3) {
         k4.S.b(var1, GameMidlet.b[fa.g().D[4]][var3][0], 24 * ev.a, var2, 0);
         ib.b.b(0, 14 * ev.a, var2 + ev.j / 2, 5, 3, var1);
         var2 += e8.x;
         if (this.C && this.A == var3) {
            for(int var4 = 1; var4 < GameMidlet.b[fa.g().D[4]][var3].length; ++var4) {
               k4.S.b(var1, GameMidlet.b[fa.g().D[4]][var3][var4], 36 * ev.a, var2, 0);
               var1.drawImage(this.B, 24 * ev.a, var2 + ev.j / 2, 3);
               var2 += e8.x;
            }
         }
      }

      super.b(var1);
      k4.b(var1);
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = ">9\u0002fi";
      int var4 = ">9\u0002fi".length();
      char var1 = 2;
      int var0 = -1;

      while(true) {
         String var10002 = c(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            T = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
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
               var10005 = 74;
               break;
            case 1:
               var10005 = 73;
               break;
            case 2:
               var10005 = 18;
               break;
            case 3:
               var10005 = 22;
               break;
            case 4:
               var10005 = 82;
               break;
            case 5:
               var10005 = 121;
               break;
            default:
               var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
