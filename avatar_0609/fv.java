import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class fv extends ft {
   public static fv ai;
   Vector aj;
   byte[] ak;
   byte al;
   private Vector am;
   private byte[] an;
   private byte ao;
   Vector ap;
   ag aq;
   private ag ar;
   boolean as = false;
   private static int at;
   private static int au;
   private int av = -1;
   private int aw;
   private int ax;
   private boolean ay = false;
   private boolean az = false;
   private int aA = 0;
   boolean aB = false;
   public boolean aC = true;
   private static final String[] bb;

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Rx\u001c\u0002+-";
      int var4 = "Rx\u001c\u0002+-".length();
      char var1 = 3;
      int var0 = -1;

      while(true) {
         String var10002 = d(d(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            bb = var5;
            b2.b.setSeed(System.currentTimeMillis());
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public static fv u() {
      return ai == null ? (ai = new fv()) : ai;
   }

   public final void m() {
      this.aj = new Vector();
      this.al = -1;
      this.ak = new byte[0];
      super.F = -1;
      this.an = new byte[0];
      this.ao = -1;
      super.E = -1;
      this.am = new Vector();
      super.m();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 20:
            this.av = -1;
            break;
         case 21:
            k4.c(hq.R, 70);
            break;
         case 70:
            super.E = -1;
            this.aB = false;
            h1.b().f();
            k4.h();
      }

      super.b(var1, var2);
   }

   public fv() {
      this.ar = new ag(hq.G, 20);
      this.aq = new ag(hq.C, 21);
      this.v();
   }

   private void v() {
      this.ax = k4.p - k4.ab;
      if (k4.o < 150) {
         at = 26;
         au = 32;
         this.ax = k4.s - k4.ab - 10;
      } else {
         at = 54;
         au = 72;
      }

      if (ev.a == 2) {
         at = 144;
         au = 194;
      }

      String[] var10000 = new String[]{"3", "4", "5", "6", "7", "8", "9", null, null, null, null, null, null};
      String[] var1 = bb;
      var10000[7] = var1[1];
      var10000[8] = "J";
      var10000[9] = "Q";
      var10000[10] = "K";
      var10000[11] = "A";
      var10000[12] = var1[0];
   }

   public final void g() {
      super.g();
      this.v();
      if (ft.A) {
         this.c(false);
      }

      this.aj = null;
   }

   public final void o() {
      this.m();
      super.o();
   }

   private void w() {
      ((b3)this.ap.elementAt(super.F)).g = !((b3)this.ap.elementAt(super.F)).g;
      this.an = this.z();
      this.ao = db.c(this.an);
      if (this.ao != -1) {
         ft.b(hq.dU[this.ao], 10, -1);
      }

      this.c(false);
   }

   protected final void k() {
      super.k();
      if (this.aB) {
         boolean var1 = false;

         for(int var2 = 0; var2 < this.an.length; ++var2) {
            if (this.an[var2] == 0) {
               var1 = true;
            }
         }

         if (!var1) {
            ft.b(GameMidlet.k.f, hq.S);
            return;
         }

         this.aB = false;
      }

      if (this.aj != null && this.aj.size() != 0) {
         boolean var10000;
         label102: {
            byte var4 = this.al;
            byte[] var3 = this.ak;
            byte var6 = this.ao;
            byte[] var5 = this.an;
            switch(var4) {
               case -1:
                  if (var6 != -1) {
                     var10000 = true;
                     break label102;
                  }
               case 0:
                  if (var6 == 0 && var5[0] > var3[0]) {
                     var10000 = true;
                     break label102;
                  }

                  if (var3[0] / 4 == 12 && (var6 == 4 || var6 == 5 || var6 == 6)) {
                     var10000 = true;
                     break label102;
                  }
                  break;
               case 1:
                  if (var6 == 1 && var5.length == var3.length && var5[var5.length - 1] > var3[var3.length - 1]) {
                     var10000 = true;
                     break label102;
                  }
                  break;
               case 2:
                  if (var6 == 2 && var5[1] > var3[1]) {
                     var10000 = true;
                     break label102;
                  }

                  if (var3[0] / 4 == 12 && (var6 == 6 || var6 == 5)) {
                     var10000 = true;
                     break label102;
                  }
                  break;
               case 3:
                  if (var6 == 3 && var5[2] > var3[2]) {
                     var10000 = true;
                     break label102;
                  }
                  break;
               case 4:
                  if (var6 == 4 && var5[5] > var3[5] || var6 == 6 || var6 == 5) {
                     var10000 = true;
                     break label102;
                  }
                  break;
               case 5:
                  if (var6 == 5 && var5[7] > var3[7]) {
                     var10000 = true;
                     break label102;
                  }
                  break;
               case 6:
                  if (var6 == 6 && var5[3] > var3[3] || var6 == 5) {
                     var10000 = true;
                     break label102;
                  }
            }

            var10000 = false;
         }

         if (!var10000) {
            ft.b(GameMidlet.k.f, hq.T);
            return;
         }
      }

      h1.b().b(this.an);
      super.E = -1;
      super.g = null;
   }

   private void a(boolean var1) {
      ((b3)this.ap.elementAt(super.F)).g = var1;
      this.an = this.z();
      this.ao = db.c(this.an);
      this.c(false);
   }

   private void h(int var1) {
      if (this.av == -1) {
         super.F += var1;
         if (super.F >= this.ap.size()) {
            super.F = 0;
         }

         if (super.F < 0) {
            super.F = this.ap.size() - 1;
            return;
         }
      } else {
         if (this.av > 0 || this.av < this.ap.size() - 1) {
            b3 var2 = (b3)this.ap.elementAt(this.av + var1);
            this.ap.setElementAt(this.ap.elementAt(this.av), this.av + var1);
            this.ap.setElementAt(var2, this.av);
            this.av += var1;
            super.F = this.av;
         }

         this.c(true);
      }
   }

   public final void c() {
      super.c();
      if (ft.A) {
         int var1 = this.ap.size();
         if (this.ap != null && var1 > 0) {
            if (k4.i && k4.d(this.aw - at / 2, this.ax - au / 2 - 30, super.Q * (var1 - 1) + at, au + 15)) {
               this.az = true;
               k4.i = false;
               this.aA = (k4.l - (this.aw - at / 2)) / super.Q;
               this.ay = true;
               super.F = this.aA;
            }

            if (this.az) {
               var1 = k4.k();
               int var2 = k4.l();
               if (k4.g) {
                  if (var2 > 10) {
                     this.a(true);
                  } else if (var2 < -10) {
                     this.a(false);
                  } else if (b2.f(var1) > 10) {
                     if (this.ay) {
                        this.av = super.F;
                     }

                     this.ay = false;
                     int var3 = (k4.j - (this.aw - at / 2)) / super.Q;
                     if (super.F != var3) {
                        if (this.av != -1) {
                           if (var3 < this.av) {
                              this.h(-1);
                           } else if (var3 > this.av) {
                              this.h(1);
                           }

                           super.F = this.av;
                           this.ay = true;
                           return;
                        }

                        this.ay = false;
                     }

                     super.F = var3;
                     if (super.F < 0) {
                        super.F = 0;
                     }

                     if (super.F >= this.ap.size()) {
                        super.F = this.ap.size() - 1;
                     }

                     this.c(true);
                  }
               }

               if (k4.h) {
                  this.az = false;
                  this.av = -1;
                  if (b2.f(var1) <= 10 && b2.f(var2) <= 10) {
                     this.a(!((b3)this.ap.elementAt(super.F)).g);
                  }
               }
            }
         }

         if (k4.d(6)) {
            this.h(1);
         } else if (k4.d(4)) {
            this.h(-1);
         }

         if (k4.d(2)) {
            if (this.av != -1) {
               this.av = -1;
               this.c(true);
               return;
            }

            this.w();
            this.c(true);
         }

         if (k4.d(8)) {
            if (((b3)this.ap.elementAt(super.F)).g) {
               this.w();
               this.c(true);
               return;
            }

            this.av = super.F;
            this.c(true);
         }
      }
   }

   public final void b() {
      super.b();
      b3 var2;
      int var3;
      if (ft.A && this.ap != null && this.ap.size() > 0) {
         for(int var1 = this.ap.size() - 1; var1 >= 0 && (var3 = (var2 = (b3)this.ap.elementAt(var1)).b()) != 1; --var1) {
            if (var3 == -1) {
               var2.h = false;
            }
         }
      }

      if (ft.L != 0L && (ft.M = System.currentTimeMillis()) > ft.L) {
         if (super.E == GameMidlet.k.f) {
            h1.b().f();
            super.E = -1;
         }

         ft.L = 0L;
      }

      if (!ft.A && !ft.B) {
         this.p();
         super.g = null;
      } else if (this.av != -1) {
         super.e = null;
         super.g = null;
         if (k4.ah == 0) {
            super.f = this.ar;
         }
      } else {
         if (ft.C) {
            super.e = null;
            super.f = ft.W;
            super.g = null;
         } else if (super.E == GameMidlet.k.f) {
            super.g = this.aq;
            if (this.z().length > 0) {
               if (this.ao != -1) {
                  super.f = ft.X;
               } else {
                  super.f = null;
               }
            } else {
               super.f = null;
            }
         } else {
            super.g = null;
            super.f = null;
         }

         fv var4 = this;
         if (this.aj != null && this.as) {
            for(int var5 = 0; var5 < var4.aj.size(); ++var5) {
               b3 var6;
               if ((var6 = (b3)var4.aj.elementAt(var5)) != null) {
                  var3 = var6.b();
                  if (var5 == var4.aj.size() - 1 && var3 == 0) {
                     var4.as = false;
                  }
               }
            }
         }
      }
   }

   void c(boolean var1) {
      if (this.ap.size() > 0 && !var1) {
         int var2 = 12;
         if (k4.M && (var2 = (k4.o - at / 2) / this.ap.size()) > at / 3 << 1) {
            var2 = at / 3 << 1;
         }

         super.Q = (k4.o - 60) / this.ap.size() + 1;
         if (super.Q > var2) {
            super.Q = var2;
         }

         if (super.Q < 9) {
            super.Q = 9;
         }

         if (k4.M) {
            super.Q = var2;
         }

         this.aw = (k4.o - (super.Q * this.ap.size() + (at - super.Q)) >> 1) + at / 2;
         if (this.aw < at / 2) {
            this.aw = at / 2;
         }
      }

      int var9 = this.ap.size();
      int var3 = this.aw;

      for(int var4 = 0; var4 < var9; ++var4) {
         b3 var5 = (b3)this.ap.elementAt(var4);
         int var6 = 0;
         if (var5.g) {
            var6 = -8 * (k4.ah + 1);
         }

         int var8 = this.ax + var6;
         var5.n = var3;
         var5.m = var8;
         var5.f = b2.b(var5.d, var5.e, var5.n, var5.m);
         if (var4 == this.av && !k4.M) {
            var5.m += 8 * (k4.ah + 1);
         }

         var3 += super.Q;
         if (var1) {
            var5.d = var5.n;
            var5.e = var5.m;
         }
      }
   }

   public final void b(Graphics var1) {
      this.a(var1);
      super.b(var1);
   }

   public final void c(Graphics var1) {
      for(int var2 = 0; var2 < ft.ae; ++var2) {
         i3 var3;
         if ((var3 = (i3)ft.D.elementAt(var2)).f != -1) {
            if (var3.f != GameMidlet.k.f || !ft.A) {
               var3.b(var1, var3.a, var3.b, false);
            }

            var3.b(var1, var3.a, var3.b);
            ft.b(var1, var3.a, var3.b - 50, var3);
         }
      }
   }

   public final void a(Graphics var1) {
      super.a(var1);
      this.c(var1);
      if ((ft.A || ft.B) && this.aj != null && this.aj.size() != 0) {
         Graphics var5 = var1;
         fv var4 = this;
         int var6 = this.aj.size();

         for(int var7 = 0; var7 < var6; ++var7) {
            b3 var8 = (b3)var4.aj.elementAt(var7);
            if (k4.o < 150) {
               var8.b(var5, false);
            } else if (var7 == var6 - 1) {
               var8.d(var5);
            } else {
               var8.b(var5);
            }
         }

         if (!this.as) {
            this.as = true;
         }
      }

      if (ft.A || ft.B) {
         Graphics var3 = var1;
         fv var2 = this;

         for(int var11 = 0; var11 < 4; ++var11) {
            i3 var12;
            if ((var12 = (i3)ft.D.elementAt(var11)).f != -1) {
               byte var13 = 0;
               byte var14 = 0;
               if (ft.P[var11] == 2) {
                  var13 = -80;
               }

               if (ft.P[var11] == 1) {
                  var14 = -10;
               } else if (ft.P[var11] == 3) {
                  var14 = 10;
               }

               if (k4.o > 160) {
                  k4.Y.b(var3, var12.c() + " " + hq.l(), ft.ab[ft.P[var11]].b + var14, ft.ab[ft.P[var11]].c + 5 + var13, ft.ab[ft.P[var11]].d);
               }

               if (var12.f == var2.E && var2.f != ft.W) {
                  String var15 = "";
                  if (ft.L != 0L) {
                     long var9 = (ft.M - ft.L) / 1000L;
                     var15 = var15 + -var9;
                  }

                  int var16 = ft.ab[ft.P[var11]].b;
                  int var10 = ft.ab[ft.P[var11]].c + 13 * ev.a;
                  if (ft.P[var11] == 2) {
                     var10 = var2.ax - au / 2 - 20 * ev.a;
                  }

                  ib.b(var16 - 10 * ev.a, var10, 20 * ev.a, ev.h, 16776365, var3);
                  var3.setColor(332544);
                  var3.drawRect(var16 - 10 * ev.a, var10, 20 * ev.a, ev.h);
                  k4.V.b(var3, var15, var16, var10 + 1, 2);
               }
            }
         }
      }

      if (ft.A) {
         this.d(var1);
      }

      if (ft.A || ft.B) {
         this.g(var1);
      }

      ft.e(var1);
      k4.d(var1);
   }

   private void d(Graphics var1) {
      if (ft.A && this.ap != null && this.ap.size() > 0) {
         int var2 = this.ap.size();
         int var3 = 0;
         int var4 = 0;

         for(int var5 = 0; var5 < var2; ++var5) {
            b3 var6 = (b3)this.ap.elementAt(var5);
            b3 var7;
            (var7 = new b3((byte)-1, false)).d = var6.d;
            var7.e = var6.e;
            if (!var6.h) {
               var7 = (b3)this.ap.elementAt(var5);
            }

            if (k4.o < 150) {
               var7.b(var1, false);
            } else if (var5 != var2 - 1 && var5 != this.av && !var6.g && var5 != this.av - 1 && (var7 == null || !var7.g)) {
               if (super.Q <= 14 && var7.d == var7.n && var7.e == var7.m) {
                  var7.b(var1);
               } else {
                  var7.c(var1);
               }
            } else {
               var7.d(var1);
            }

            if (var5 == super.F) {
               var4 = var7.e - au / 2 - 2 + (k4.n % 10 > 4 ? 2 : 0);
               var3 = var7.d - at / 2 + 5 * ev.a;
            }

            if (k4.ah == 0 && var5 == this.av && k4.n % 10 > 6 && ev.a == 1) {
               ib.c.b(0, var6.d - 40, var6.e - 30, 0, var1);
               ib.c.b(0, var6.d - 10, var6.e - 30, 3, var1);
            }
         }

         if (k4.ah == 0) {
            fc.g().B.b(0, var3, var4, 0, 33, var1);
         }
      }
   }

   private void g(Graphics var1) {
      if (this.am != null && this.am.size() != 0) {
         int var2 = this.am.size();
         int var3;
         if ((var3 = (k4.o - 60) / var2 + 1) > 12) {
            var3 = 12;
         }

         int var4 = k4.q - (var3 * var2 >> 1) + 6;
         int var5 = (k4.p + k4.ab) / 2;

         for(int var6 = 0; var6 < var2; ++var6) {
            b3 var7;
            (var7 = (b3)this.am.elementAt(var6)).d = var4;
            var7.e = var5;
            var4 += var3 * ev.a;
            if (k4.o < 150) {
               var7.b(var1, false);
            } else if (var6 == var2 - 1) {
               var7.d(var1);
            } else {
               var7.b(var1);
            }
         }
      }
   }

   public final void b(int var1, byte var2, Vector var3) {
      e8.f();
      this.v();
      this.s();
      ft.A = true;
      this.aB = false;
      if (this.aC && var1 == GameMidlet.k.f) {
         for(int var4 = 0; var4 < var3.size(); ++var4) {
            if (((b3)var3.elementAt(var4)).c == 0) {
               this.aB = true;
               break;
            }
         }
      }

      this.am = null;
      this.aj = new Vector();
      this.al = -1;
      this.ak = new byte[0];
      ft.C = false;
      this.ap = var3;
      Vector var11;
      int var15 = (var11 = var3).size();

      for(int var5 = 0; var5 < var15 - 1; ++var5) {
         for(int var6 = var5 + 1; var6 < var15; ++var6) {
            b3 var7 = (b3)var11.elementAt(var5);
            b3 var8 = (b3)var11.elementAt(var6);
            if (var7.c > var8.c) {
               Object var10 = var11.elementAt(var6);
               var11.setElementAt(var11.elementAt(var5), var6);
               var11.setElementAt(var10, var5);
            }
         }
      }

      for(int var16 = 0; var16 < this.ap.size(); ++var16) {
         b3 var12;
         (var12 = (b3)this.ap.elementAt(var16)).d = k4.q;
         var12.e = (k4.p + k4.ab) / 2;
         var12.h = true;
      }

      for(int var13 = 0; var13 < ft.ae; ++var13) {
         ft.D.elementAt(var13);
      }

      ft.N = var2;
      ft.L = System.currentTimeMillis() + (long)(var2 * 1000);
      if (var1 == GameMidlet.k.f) {
         super.g = this.aq;
      }

      i3 var14 = ft.f(var1);
      ft.b(var14.g + hq.V, 20, var14.f);
      this.al = -1;
      this.ak = new byte[0];
      super.F = 2;
      super.E = var1;
      this.t();
      this.c(false);
   }

   public final void b(int var1, byte[] var2) {
      i3 var3 = ft.f(var1);
      db.b(var2);
      this.am = new Vector();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         this.am.addElement(new b3(var2[var4]));
      }

      if (var3 != null && var3.f == var1 && this.ap != null) {
         this.ap.removeAllElements();
      }
   }

   public static void b(int var0, byte var1, int var2, int var3) {
      i3 var4;
      if ((var4 = ft.f(var0)) != null) {
         var4.O = false;
         if ((var3 = var4.N + var3) < 0) {
            var3 = 0;
         }

         var4.e(var3);
         var4.c(var4.c() + var2);
         if (var4.f == GameMidlet.k.f) {
            GameMidlet.k.c(var4.c());
         }
      }

      ft.b(var0, hq.X + (var1 + 1));
   }

   public static void x() {
      ft.C = true;
   }

   public static void y() {
      e8.f();
      ft.A = false;
   }

   byte[] z() {
      Vector var1 = new Vector();
      int var2 = this.ap.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         b3 var4;
         if ((var4 = (b3)this.ap.elementAt(var3)).g) {
            var1.addElement(var4);
         }
      }

      int var6;
      byte[] var7 = new byte[var6 = var1.size()];

      for(int var5 = 0; var5 < var6; ++var5) {
         var7[var5] = ((b3)var1.elementAt(var5)).c;
      }

      db.b(var7);
      return var7;
   }

   private static char[] d(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   private static String d(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 26;
               break;
            case 1:
               var10005 = 29;
               break;
            case 2:
               var10005 = 115;
               break;
            case 3:
               var10005 = 50;
               break;
            case 4:
               var10005 = 83;
               break;
            case 5:
               var10005 = 89;
               break;
            default:
               var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
