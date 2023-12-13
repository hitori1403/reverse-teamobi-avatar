import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class fu extends ft {
   public static fu ai;
   is[][] aj = new is[8][8];
   private int ak;
   private int al;
   private int am;
   int an;
   private int ao = -1;
   private int ap;
   private int aq;
   private byte ar = -1;
   private Vector as = new Vector();
   boolean at = false;
   boolean au = false;
   ag av;
   ag aw;
   private g_ ax;
   private byte ay;
   int az = 0;
   public int aA = -1;
   boolean aB = false;
   public boolean aC = false;
   boolean aD = false;
   private int[][] aE = new int[][]{
      {1, -2}, {1, -1}, {1, -1}, {1, 3}, {1, 2}, {1, 2}, new int[2], {0, -1}, {0, 1}, new int[2], {0, -1}, {0, 1}, {-1, 1}, {-1, 1}, {-1, -1}, {1, 1}
   };
   private int[][] aF = new int[][]{
      new int[2], {0, -1}, {0, 1}, new int[2], {0, -1}, {0, 1}, {1, 3}, {1, 2}, {1, 2}, {1, -2}, {1, -1}, {1, -1}, {-1, -1}, {1, 1}, {-1, 1}, {-1, 1}
   };
   private int[][] aG = new int[][]{{-1, -2}, new int[2], {1, 2}, new int[2], {-1, 1}, new int[2]};
   private int[][] aH = new int[][]{new int[2], {-1, -2}, new int[2], {1, 2}, new int[2], {-1, 1}};
   private boolean aI = false;
   private int aJ;
   Vector aK = new Vector();
   boolean aL = false;
   boolean aM = false;
   i5 aN;
   private boolean aO;
   private long aP;
   public static int aQ;
   static boolean aR;
   static boolean aS;
   static int aT;
   static int aU;
   static boolean aV;
   private static final String[] bb;

   static {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "X\u0013ỳ\u001eU'ēu\u001c:\u001c\u0000=\u007f;\u0010s\u0010U*Ơƺ\u0015}]\u0016!ộ;\u0010÷\u001e\u001dixtỚn]Ťǹỳx[ễ]\u0016 db[w\u001c\u0005i8x\u0013ọ]Ťẜy;\u0016ặ\tU\"xẲ\u000e3QU+eo\u000fu\u0013U=b~\u0014:\u001a\u0014$u\u0002h\u000f\fIǋƻ\u0013\u0012iāø[ċỚ\f\b;V:3=\u000b*;\u0006;\u0018u\u0014\u001b:\u0005P8BGU";
      int var4 = "X\u0013ỳ\u001eU'ēu\u001c:\u001c\u0000=\u007f;\u0010s\u0010U*Ơƺ\u0015}]\u0016!ộ;\u0010÷\u001e\u001dixtỚn]Ťǹỳx[ễ]\u0016 db[w\u001c\u0005i8x\u0013ọ]Ťẜy;\u0016ặ\tU\"xẲ\u000e3QU+eo\u000fu\u0013U=b~\u0014:\u001a\u0014$u\u0002h\u000f\fIǋƻ\u0013\u0012iāø[ċỚ\f\b;V:3=\u000b*;\u0006;\u0018u\u0014\u001b:\u0005P8BGU"
         .length();
      char var1 = '[';
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = d(d(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     bb = var5;
                     aQ = 0;
                     aS = true;
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

                  var2 = "Y\u009at]Ť¨0u\u001c{\u0004\u000eZ\u000en\u0012U\"yv[yǍǔ'w";
                  var4 = "Y\u009at]Ť¨0u\u001c{\u0004\u000eZ\u000en\u0012U\"yv[yǍǔ'w".length();
                  var1 = 11;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static fu u() {
      return ai == null ? (ai = new fu()) : ai;
   }

   public fu() {
      this.av = new ag(hq.P, 20);
      this.aw = new ag(hq.C, 21);
      bp.c(hq.ay);
      this.ax = g_.b(bb[1], 11 * ev.a, 11 * ev.a);
      bp.b();
   }

   public final void b(int var1, int var2) {
      switch(var1) {
         case 0:
            ag var6 = new ag(hq.ac, 1);
            ag var7 = new ag(hq.w, 2);
            int var3 = 0;

            for(int var4 = 0; var4 < ft.ae; ++var4) {
               if (((i3)ft.D.elementAt(var4)).f != -1) {
                  ++var3;
               }
            }

            Vector var8 = new Vector();
            if (!j7.c) {
               String[] var5 = bb;
               var8.addElement(new ag(var5[7], 24));
            } else {
               j7.b();
               if (!j7.d()) {
                  var8.addElement(new ag(bb[6], 22));
               }
            }

            var8.addElement(new ag(kq.w[2], 18));
            var8.addElement(new ag(kq.w[3], new gk(2)));
            if (ft.I == GameMidlet.k.f && !ft.A) {
               var8.addElement(var6);
               if (var3 > 1) {
                  var8.addElement(var7);
               }
            }

            if (var3 > 1) {
               var8.addElement(new ag(hq.z, 3));
            }

            var8.addElement(new ag(hq.r, 4));
            var8.addElement(new ag(hq.v, 5));
            f1.d().b(var8, 0);
            return;
         case 20:
            if (!this.at) {
               if (this.an == -1 && super.f == this.av && super.T == GameMidlet.k.f && !this.au) {
                  this.an = this.az;
               } else {
                  this.an = -1;
               }
            }
         default:
            super.b(var1, var2);
            return;
         case 21:
            this.v();
            return;
         case 22:
      }
   }

   void v() {
      h1 var1 = h1.b();

      try {
         var1.c((byte)49);
      } catch (Exception var2) {
      }

      var1.a();
      super.T = -1;
      super.f = ft.Z;
      super.g = null;
   }

   public final void a(int var1, int var2) {
      switch(var1) {
         case 16:
            i5.b = !i5.b;
            return;
         case 17:
            this.b(0);
            hx.b().g(9);
            fp.R = 1;
            k4.B.w = false;
            gx.N = 685;
            gx.O = 56;
            hv.b().b(23, h.b().b(20, 40));
            return;
         case 18:
            e_.g().a(6, -1);
            return;
         case 19:
            Vector var3;
            (var3 = new Vector()).addElement(new ag(kq.x[0] + kq.b(aR), 20));
            var3.addElement(new ag(kq.x[1] + kq.b(aS), 21));
            f1.d().b(var3, 0);
            return;
         case 20:
            aR = !aR;
            return;
         case 21:
            aS = !aS;
            return;
         case 22:
            j7.l = true;
            return;
         case 23:
            j7.m = !j7.m;
            return;
         case 24:
            k4.c(bb[0]);
            return;
         default:
            super.a(var1, var2);
      }
   }

   public final void g() {
      super.g();
      if (k4.s > 250) {
         this.am = 24 * ev.a;
         this.ay = (byte)(24 * ev.a);
      } else {
         this.am = 16;
         this.ay = 16;
      }

      this.aJ = 40 * ev.a;
      if (this.ar == -1 || !ft.A) {
         this.ak = (k4.o - (this.am << 3)) / 2;
      }

      this.al = this.am / 2 + 2;
      if (k4.o < 160) {
         this.al = 0;
      }
   }

   public final void b(int var1, int var2, byte[][] var3) {
      e8.f();
      this.s();
      this.aB = false;
      super.T = var1;
      ft.N = var2;
      super.f = null;
      super.g = null;
      this.aA = -1;
      ft.L = System.currentTimeMillis() + (long)(ft.N * 1000);
      this.aP = System.currentTimeMillis();
      if (GameMidlet.k.f == super.T) {
         this.aD = true;
      }

      this.g();
      this.t();
      ft.A = true;
      this.an = -1;
      this.b(var3);
      k4.h();
   }

   public final void t() {
      cl.b().d();
      int var1 = this.ak;
      int var2 = this.am << 3;
      if (k4.s < 250) {
         var2 = k4.o - 50;
         var1 = 25;
      }

      for(int var3 = 0; var3 < ft.ae; ++var3) {
         i3 var4;
         if ((var4 = (i3)ft.D.elementAt(var3)).f != -1) {
            if (var4.f != GameMidlet.k.f) {
               gx.c(var4);
            }

            var4.m = var4.b = k4.s - k4.ab - ev.k / 2;
            if (var4.b < this.am << 3 && (var1 = this.ak - this.aJ - 15 * ev.a) < 0) {
               var1 = 0;
            }

            if (k4.o < 160) {
               var4.m = var4.b = k4.s - 10;
            }

            if (k4.ah == 0 && k4.o > 200) {
               var4.m = var4.b -= 10;
            }

            if (var4.f == GameMidlet.k.f) {
               this.ap = var1 + 15 * ev.a + this.aJ;
               var4.l = var4.a = this.ap;
               var4.s = var4.U = 0;
            } else {
               this.aq = var1 + var2 - 15 * ev.a - this.aJ;
               var4.l = var4.a = this.aq;
               var4.s = var4.U = it.r;
            }

            var4.H = 0;
            byte var6 = 0;
            var4.q = var6;
            var4.g(var4.q);
         }
      }
   }

   void b(byte[][] var1) {
      this.au = true;

      for(int var2 = 7; var2 >= 0; --var2) {
         int var3 = 20;

         for(int var4 = 7; var4 >= 0; --var4) {
            this.aj[var2][var4] = new is(var4 * this.am, var2 * this.am, var1[var2][var4]);
            this.aj[var2][var4].k = this.aj[var2][var4].b;
            this.aj[var2][var4].j = -var3;
            --var3;
            this.aj[var2][var4].p = true;
            this.aj[var2][var4].b = -(var4 * this.am + 24);
         }
      }
   }

   public final void b() {
      super.b();
      if (!ft.A && !ft.B) {
         if (j7.p == 0L) {
            j7.p = System.currentTimeMillis();
         }

         if (j7.c && i5.b && j7.p != 0L && System.currentTimeMillis() - j7.p > 60000L && !j7.o) {
            j7.o = true;
         }

         this.p();
      } else {
         j7.p = System.currentTimeMillis();
         if (ft.L != 0L && (ft.M = System.currentTimeMillis()) > ft.L) {
            ft.L = 0L;
            if (super.T == GameMidlet.k.f && super.f == this.av) {
               this.v();
            }
         }

         boolean var1 = false;
         int var2 = 0;

         for(int var3 = 63; var3 >= 0; --var3) {
            if (this.aj[var3 / 8][var3 % 8] != null && this.aj[var3 / 8][var3 % 8].d == 1) {
               is var4;
               int var10000;
               if ((var4 = this.aj[var3 / 8][var3 % 8]).a == var4.s && var4.b == var4.r) {
                  var10000 = -1;
               } else if (Math.abs((var4.s - var4.a) / 2) <= 1 && Math.abs((var4.r - var4.b) / 2) <= 1) {
                  var4.a = var4.s;
                  var4.b = var4.r;
                  var10000 = 0;
               } else {
                  if (var4.a != var4.s) {
                     var4.a += (var4.s - var4.a) / 2;
                  }

                  if (var4.b != var4.r) {
                     var4.b += (var4.r - var4.b) / 2;
                  }

                  kp.b();
                  var10000 = b2.b(var4.a, var4.b, var4.s, var4.r) <= var4.t / 5 ? 2 : 1;
               }

               if (var10000 == -1) {
                  this.aj[var3 / 8][var3 % 8].d = 0;
                  var2 = 1;
               } else {
                  var1 = true;
               }
            }
         }

         if (var2 && this.at) {
            if (!this.h(this.az) && !this.h(this.an)) {
               int var12 = this.az;
               this.az = this.an;
               this.an = var12;
               this.x();
               super.f = this.av;
               super.g = this.aw;
            } else if (super.T == GameMidlet.k.f) {
               h1.b().b(this.an, this.az);
            }

            this.at = false;
            this.an = -1;
         }

         if (!var1) {
            boolean var5 = false;

            for(int var16 = 63; var16 >= 0; --var16) {
               if (this.aj[var16 / 8][var16 % 8] != null && this.aj[var16 / 8][var16 % 8].p) {
                  this.aj[var16 / 8][var16 % 8].a += this.aj[var16 / 8][var16 % 8].g;
                  if (this.aj[var16 / 8][var16 % 8].g > 1 || this.aj[var16 / 8][var16 % 8].g < -1) {
                     is var26 = this.aj[var16 / 8][var16 % 8];
                     int var10001 = this.aj[var16 / 8][var16 % 8].g;
                     int var10002 = this.aj[var16 / 8][var16 % 8].g;
                     kp.b();
                     var26.g = var10001 - var10002 / b2.f(this.aj[var16 / 8][var16 % 8].g);
                  }

                  this.aj[var16 / 8][var16 % 8].b += this.aj[var16 / 8][var16 % 8].j;
                  this.aj[var16 / 8][var16 % 8].j += 2;
                  if (this.aj[var16 / 8][var16 % 8].b >= this.aj[var16 / 8][var16 % 8].k) {
                     this.aj[var16 / 8][var16 % 8].b = this.aj[var16 / 8][var16 % 8].k;
                     this.aj[var16 / 8][var16 % 8].p = false;
                  } else {
                     var5 = true;
                  }
               }
            }

            if (!var5 && this.au) {
               if (super.T == GameMidlet.k.f) {
                  if (!this.aD) {
                     if (this.aM) {
                        this.y();
                     }
                  } else if (this.w()) {
                     super.f = this.av;
                     super.g = this.aw;
                     this.aO = true;
                  } else {
                     h1.b().j();
                  }

                  this.aD = false;
               }

               this.au = false;
            }
         }

         if (this.ao != -1) {
            if (this.ao % 10 == 0) {
               fu var6 = this;

               for(int var17 = 4 - this.ao / 10; var17 < 4 + var6.ao / 10; ++var17) {
                  for(int var18 = 4 - var6.ao / 10; var18 < 4 + var6.ao / 10; ++var18) {
                     var6.b(var6.aj[var17][var18].a + 12, var6.aj[var17][var18].b + 12, var6.aj[var17][var18].o);
                     var6.aj[var17][var18].o = -1;
                  }
               }
            }

            this.ao += 2;
            if (this.ao >= 50) {
               this.z();
               this.ao = -1;
            }
         }

         for(int var13 = 0; var13 < this.as.size(); ++var13) {
            is var7;
            if ((var7 = (is)this.as.elementAt(var13)).l > 0) {
               ++var7.l;
               if (var7.l == 3) {
                  this.as.removeElement(var7);
                  continue;
               }
            }

            if (!var7.p) {
               kp.b();
               kp.b();
               int var19;
               if (b2.f((var19 = b2.b(var7.s - var7.a, -(var7.r - var7.b))) - var7.j) > 10) {
                  var7.j -= var7.e * var7.d;
                  kp.b();
                  var7.j = b2.d(var7.j);
               } else {
                  var7.j = var19;
                  var7.n = (byte)(var7.n + 2);
               }

               if (var7.k >= 4) {
                  var7.k = 0;
               }

               ++var7.k;
               byte var27 = var7.n;
               kp.b();
               var2 = var27 * b2.c(var7.j) >> 10;
               var27 = var7.n;
               kp.b();
               var19 = -(var27 * b2.b(var7.j)) >> 10;
               kp.b();
               if (b2.b(var7.a, var7.b, var7.s, var7.r) >= var7.n) {
                  var7.a += var2;
                  var7.b += var19;
               } else {
                  this.as.removeElement(var7);
               }
            } else {
               var7.a += var7.g;
               if (var7.g > 1 || var7.g < -1) {
                  int var30 = var7.g;
                  int var31 = var7.g;
                  kp.b();
                  var7.g = var30 - var31 / b2.f(var7.g);
               }

               var7.b += var7.j;
               ++var7.j;
               if (var7.d == 1 && var7.k < 19) {
                  ++var7.k;
               }

               if (var7.b + this.al > k4.p) {
                  this.as.removeElement(var7);
               }
            }
         }

         for(int var14 = 0; var14 < 2; ++var14) {
            i3 var11;
            if ((var11 = (i3)ft.D.elementAt(var14)).Z == -1) {
               kp.b();
               if (b2.f(var11.l - var11.a) < 10) {
                  if (this.ar == -2) {
                     this.ar = -1;
                     var11.Z = 0;
                     if (var11.f == this.aA) {
                        var11.b((byte)10);
                        var11.f(10);
                     } else {
                        var11.q = 0;
                        if (this.aA != -1) {
                           var11.f(9);
                        }
                     }

                     this.aC = false;
                     if (var11.f == GameMidlet.k.f) {
                        var11.s = 0;
                     }
                  } else if (var11.Z == -1) {
                     if (var11.aq && k4.n % 6 == 3) {
                        this.c(var11.a, var11.b - var11.e, 0);
                     }

                     if (this.ar != -1) {
                        if (this.ar >= 0) {
                           --this.ar;
                           if (this.ar == -1) {
                              this.ar = -2;
                              if (var11.f == GameMidlet.k.f) {
                                 var11.l = this.ap;
                              } else {
                                 var11.l = this.aq;
                              }
                           }
                        }
                     } else {
                        for(int var21 = 0; var21 < 2; ++var21) {
                           i3 var8;
                           if ((var8 = (i3)ft.D.elementAt(var21)).f != var11.f) {
                              var8.f(20);
                              var8.q = 4;
                              var8.t = true;
                              var11.t = true;
                           }
                        }

                        this.ar = 20;
                        if (this.aC) {
                           this.ar = 30;
                        }
                     }
                  }
               }
            }

            if (var11.aw > 0) {
               int var22 = var11.ay / 100 + 1;
               if (var11.aw - var22 < 0) {
                  var22 = var11.aw;
               }

               var11.aw = (short)(var11.aw - var22);
               var11.au = (short)(var11.au + var22);
            } else if (var11.aw < 0) {
               int var23 = var11.ay / 100 + 1;
               if (var11.aw + var23 > 0) {
                  var23 = -var11.aw;
               }

               var11.au = (short)(var11.au - var23);
               var11.aw = (short)(var11.aw + var23);
            }

            if (var11.ax > 0) {
               int var24 = var11.ay / 100 + 1;
               if (var11.ax - var24 < 0) {
                  var24 = var11.ax;
               }

               var11.ax = (short)(var11.ax - var24);
               var11.av = (short)(var11.av + var24);
            } else if (var11.ax < 0) {
               int var25 = var11.ay / 100 + 1;
               if (var11.ax + var25 > 0) {
                  var25 = -var11.ax;
               }

               var11.av = (short)(var11.av - var25);
               var11.ax = (short)(var11.ax + var25);
            }
         }

         for(int var15 = 0; var15 < this.aK.size(); ++var15) {
            is var9;
            --(var9 = (is)this.aK.elementAt(var15)).l;
            if (var9.l <= 0) {
               this.aK.removeElement(var9);
            }
         }

         if (i5.b && this.aO) {
            this.aN = new i5(this.aj);
            if (this.aN.d() != -1) {
               this.az = this.aN.c();
               this.an = this.aN.d();
               this.au = false;
               this.x();
            } else {
               this.v();
            }

            this.aO = false;
            this.aP = 0L;
         }
      }
   }

   boolean w() {
      for(int var1 = 0; var1 < 8; ++var1) {
         for(int var2 = 0; var2 < 8; ++var2) {
            for(int var3 = 0; var3 < this.aE.length; ++var3) {
               if (var1 + this.aF[var3][0] >= 0
                  && var1 + this.aF[var3][0] < 8
                  && var1 + this.aF[var3][1] >= 0
                  && var1 + this.aF[var3][1] < 8
                  && var2 + this.aE[var3][0] >= 0
                  && var2 + this.aE[var3][0] < 8
                  && var2 + this.aE[var3][1] >= 0
                  && var2 + this.aE[var3][1] < 8
                  && this.aj[var1][var2].o == this.aj[var1 + this.aF[var3][0]][var2 + this.aE[var3][0]].o
                  && this.aj[var1][var2].o == this.aj[var1 + this.aF[var3][1]][var2 + this.aE[var3][1]].o) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   void b(int var1, int var2, int var3) {
      i3 var4;
      if (var3 != -1 && (var4 = ft.f(super.T)) != null) {
         int var5 = 0;
         int var6 = 0;
         switch(var3) {
            case 0:
               this.c(var1 + this.ak, var2 + this.al, 0);
               return;
            case 1:
               var5 = var4.a;
               var6 = var4.b - var4.e / 2;
               if (var4.aA > 0) {
                  if (var4.f == GameMidlet.k.f) {
                     var5 = this.ap - 20 - 7;
                  } else {
                     var5 = this.aq + 7 + 20;
                  }

                  var6 = var4.b - 22;
               }
               break;
            case 2:
               if (var4.f == GameMidlet.k.f) {
                  var5 = this.ap - 20 - this.aJ + var4.au * this.aJ / var4.ay;
               } else {
                  var5 = this.aq + (this.aJ - var4.au * this.aJ / var4.ay) + 20 - var4.au * this.aJ / var4.ay;
               }

               var6 = var4.b - 2 - 10 * ev.a;
               break;
            case 3:
               if (var4.f == GameMidlet.k.f) {
                  var5 = this.ap - 20 - this.aJ + var4.av * this.aJ / var4.az;
               } else {
                  var5 = this.aq + (this.aJ - var4.av * this.aJ / var4.az) + 20 - var4.au * this.aJ / var4.ay;
               }

               var6 = var4.b - 5 * ev.a;
               break;
            case 4:
               this.c(var1 + this.ak, var2 + this.al, 4);
               return;
            case 5:
               return;
         }

         is var10;
         (var10 = new is(var1 + this.ak, var2 + this.al)).l = 1;
         this.as.addElement(var10);

         for(int var11 = 0; var11 < (var3 != 1 ? 3 : 1); ++var11) {
            is var7;
            (var7 = new is(var1 + this.ak, var2 + this.al)).t = (short)var3;
            new b2();
            var7.k = b2.e(3);
            new b2();
            int var8 = b2.b(var5 - var1, -(var6 - var2));
            var7.g = var8;
            new b2();
            var7.d = (byte)b2.c(-1, 1);
            new b2();
            var7.j = b2.d(var7.g + var7.d * 90);
            new b2();
            var8 = 10 * b2.c(var7.j) >> 10;
            new b2();
            int var9 = -(10 * b2.b(var7.j)) >> 10;
            var7.s = (short)var5;
            var7.r = (short)var6;
            var7.a += var8;
            var7.b += var9;
            var7.k = 0;
            new b2();
            var7.n = (byte)(b2.e(4) + 4);
            new b2();
            var7.e = (short)(10 + b2.e(5));
            this.as.addElement(var7);
         }
      }
   }

   private void c(int var1, int var2, int var3) {
      if (var3 != -1) {
         is var4;
         (var4 = new is(var1, var2)).l = 1;
         this.as.addElement(var4);

         for(int var7 = 0; var7 < 3; ++var7) {
            new b2();
            int var5 = b2.c(-1, 1);
            is var6;
            (var6 = new is(var1, var2)).p = true;
            new b2();
            var6.k = b2.e(3);
            new b2();
            var6.g = var5 * (b2.e(100) / 10);
            new b2();
            var6.j = -b2.e(100) / 10;
            var6.n = (byte)var3;
            var6.d = 1;
            var6.l = 0;
            this.as.addElement(var6);
         }
      }
   }

   private boolean h(int var1) {
      if (this.an != -1 && !this.au) {
         for(int var2 = 0; var2 < this.aG.length; ++var2) {
            if (var1 / 8 + this.aH[var2][0] >= 0
               && var1 / 8 + this.aH[var2][0] < 8
               && var1 / 8 + this.aH[var2][1] >= 0
               && var1 / 8 + this.aH[var2][1] < 8
               && var1 % 8 + this.aG[var2][0] >= 0
               && var1 % 8 + this.aG[var2][0] < 8
               && var1 % 8 + this.aG[var2][1] >= 0
               && var1 % 8 + this.aG[var2][1] < 8
               && this.aj[var1 / 8][var1 % 8].o == this.aj[var1 / 8 + this.aH[var2][0]][var1 % 8 + this.aG[var2][0]].o
               && this.aj[var1 / 8][var1 % 8].o == this.aj[var1 / 8 + this.aH[var2][1]][var1 % 8 + this.aG[var2][1]].o) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public final void c() {
      super.c();
      if (k4.i && k4.d(this.ak, this.al, this.am << 3, this.am << 3) && this.an == -1) {
         k4.i = false;
         this.aI = true;
         int var1 = (k4.j - this.ak) / this.am;
         int var2 = (k4.k - this.al) / this.am;
         this.az = (var2 << 3) + var1;
      }

      if (!this.at && !this.au && super.f == this.av && super.f != ft.Z && this.aI) {
         if (k4.g) {
            int var3 = k4.k();
            int var4 = k4.l();
            if (var3 < -this.am / 2) {
               if (this.az % 8 < 7) {
                  this.an = this.az++;
                  this.aI = false;
                  this.x();
               }
            } else if (var3 > this.am / 2) {
               if (this.az % 8 > 0) {
                  this.an = this.az--;
                  this.aI = false;
                  this.x();
               }
            } else if (var4 < -this.am / 2) {
               if (this.az / 8 < 7) {
                  this.an = this.az;
                  this.az += 8;
                  this.aI = false;
                  this.x();
               }
            } else if (var4 > this.am / 2 && this.az >= 8) {
               this.an = this.az;
               this.az -= 8;
               this.aI = false;
               this.x();
            }
         }

         if (k4.h) {
            k4.h = false;
            this.aI = false;
         }
      }

      if (ft.A && super.f != ft.Z) {
         if (k4.d(2)) {
            if (!this.at && !this.au) {
               if (this.az >= 8) {
                  this.az -= 8;
               }

               this.x();
               return;
            }
         } else if (k4.d(4)) {
            if (!this.at && !this.au) {
               if (this.az % 8 > 0) {
                  --this.az;
               }

               this.x();
               return;
            }
         } else if (k4.d(6)) {
            if (!this.at && !this.au) {
               if (this.az % 8 < 7) {
                  ++this.az;
               }

               this.x();
               return;
            }
         } else if (k4.d(8) && !this.at && !this.au) {
            if (this.az / 8 < 7) {
               this.az += 8;
            }

            this.x();
         }
      }
   }

   void x() {
      if (this.an != -1 && !this.au) {
         super.f = ft.Z;
         super.g = null;
         this.at = true;
         this.aI = false;
         is var1 = this.aj[this.az / 8][this.az % 8];
         is var2 = this.aj[this.an / 8][this.an % 8];
         int var3 = var1.a;
         int var4 = var1.b;
         short var5 = var1.o;
         var1.a = var2.a;
         var1.b = var2.b;
         var1.o = var2.o;
         var2.a = var3;
         var2.b = var4;
         var2.o = var5;
         var2.d = 1;
         var1.d = 1;
      }
   }

   void y() {
      boolean var1 = false;

      for(int var2 = 0; var2 < 64; ++var2) {
         if (this.aj[var2 / 8][var2 % 8].o != -2) {
            int var3 = 0;

            for(int var4 = var2 + 1;
               var4 % 8 < 8 && var4 < 64 && var4 / 8 == var2 / 8 && this.aj[var2 / 8][var2 % 8].o == this.aj[var4 / 8][var4 % 8].o;
               ++var4
            ) {
               ++var3;
            }

            if (var3 > 1) {
               for(int var6 = var2; var6 < var2 + var3 + 1; ++var6) {
                  this.aj[var6 / 8][var6 % 8].q = true;
                  var1 = true;
               }
            }

            var3 = 0;

            for(int var7 = var2 + 8; var7 < 64 && var7 % 8 == var2 % 8 && this.aj[var2 / 8][var2 % 8].o == this.aj[var7 / 8][var7 % 8].o; var7 += 8) {
               ++var3;
            }

            if (var3 > 1) {
               for(int var8 = var2; var8 < var2 + (var3 + 1 << 3); var8 += 8) {
                  this.aj[var8 / 8][var8 % 8].q = true;
                  var1 = true;
               }
            }
         }
      }

      if (var1) {
         h1.b().b(this.aj);
      } else {
         if (this.aL) {
            this.aL = false;
            this.v();
         }
      }
   }

   void z() {
      for(int var1 = 0; var1 < 8; ++var1) {
         for(int var2 = 7; var2 >= 0; --var2) {
            if (this.aj[((var2 << 3) + var1) / 8][((var2 << 3) + var1) % 8].o == -1) {
               int var3 = (var2 << 3) + var1;
               int var4 = 4;
               fu var5 = this;
               this.au = true;

               for(int var6 = var3; var6 / 8 > 0; var6 -= 8) {
                  var5.aj[var6 / 8][var6 % 8].o = var5.aj[(var6 - 8) / 8][(var6 - 8) % 8].o;
                  var5.aj[var6 / 8][var6 % 8].k = var6 / 8 * var5.am;
                  if (!var5.aj[var6 / 8][var6 % 8].p) {
                     var5.aj[var6 / 8][var6 % 8].j = -var4;
                     ++var4;
                     var5.aj[var6 / 8][var6 % 8].p = true;
                  }

                  var5.aj[var6 / 8][var6 % 8].b = var5.aj[(var6 - 8) / 8][(var6 - 8) % 8].b;
               }

               var5.aj[0][var3 % 8].o = -2;
               var5.aj[0][var3 % 8].k = 0;
               if (!var5.aj[0][var3 % 8].p) {
                  var5.aj[0][var3 % 8].j = -var4;
                  var5.aj[0][var3 % 8].p = true;
                  var5.aj[0][var3 % 8].b = 0;
               }

               var5.aj[0][var3 % 8].b -= 24;
               ++var2;
            }
         }
      }
   }

   public final void b(Graphics var1) {
      this.a(var1);
      super.b(var1);
   }

   public final void a(Graphics var1) {
      super.a(var1);
      if (!ft.A) {
         this.c(var1);
      } else {
         k4.d(var1);
         Graphics var2 = var1;
         fu var3 = this;
         var1.translate(this.ak, this.al);
         Object var5;
         if (f5.d((short)876).e != -1) {
            for(int var4 = 0; var4 < var3.aK.size(); ++var4) {
               var5 = (is)var3.aK.elementAt(var4);
               int var6 = var4 * 17 - var3.am / 2 + 8;
               if (((is)var5).k != GameMidlet.k.f) {
                  var6 = (var3.am << 3) - var4 * 17 + var3.am / 2 - 8;
               }

               int var7 = ((is)var5).o << 4;
               int var8 = (var3.am << 3) + var3.am;
               var2.drawRegion(f5.d((short)876).b, 0, var7, 16, 16, 0, var6, var8, 3);
               k4.Y.b(var2, String.valueOf(((is)var5).n), var6, (var3.am << 3) + var3.am - ev.k / 2, 2);
            }
         }

         var2.setClip(-var3.am / 2, -var3.am / 2, (var3.am << 3) + var3.am, (var3.am << 3) + var3.am);
         if (var3.az >= 0
            && var3.aj[var3.az / 8][var3.az % 8] != null
            && (var3.T != GameMidlet.k.f || k4.n % 10 != 5)
            && ((dm)(var5 = f5.d((short)(k4.s > 250 ? 878 : 879)))).e != -1) {
            var2.drawRegion(
               ((dm)var5).b,
               0,
               (var3.an != -1 && k4.n % 6 < 3 ? 1 : 0) * var3.am,
               var3.am,
               var3.am,
               0,
               var3.aj[var3.az / 8][var3.az % 8].a,
               var3.aj[var3.az / 8][var3.az % 8].b,
               0
            );
         }

         dm var11;
         if ((var11 = f5.d((short)(k4.s > 250 ? 875 : 876))).e != -1) {
            for(int var10 = 0; var10 < 8; ++var10) {
               for(int var12 = 0; var12 < 8; ++var12) {
                  if (var3.aj[var10][var12] != null && var3.aj[var10][var12].o >= 0) {
                     var2.drawRegion(var11.b, 0, var3.aj[var10][var12].o * var3.ay, var3.ay, var3.ay, 0, var3.aj[var10][var12].a, var3.aj[var10][var12].b, 0);
                  }
               }
            }
         }

         k4.d(var1);
         if (k4.o > 160) {
            this.c(var1);
         }

         this.g(var1);
         k4.d(var1);
         String var13 = "";
         if (ft.L != 0L) {
            long var14 = (ft.M - ft.L) / 1000L;
            var13 = var13 + -var14;
         }

         if (!aV) {
            String[] var9 = bb;
            k4.T.b(var1, var9[5] + aU + var9[3] + aT, this.ak + (this.am << 3) / 2, this.al + (this.am << 3) + k4.W.b() - 15, 2);
         } else {
            String[] var15 = bb;
            k4.T.b(var1, var15[2], this.ak + (this.am << 3) / 2, this.al + (this.am << 3) + k4.W.b() - 15, 2);
         }

         k4.W.b(var1, var13, this.ak + (this.am << 3) / 2, this.al + (this.am << 3) + k4.W.b() + 2, 2);
         this.h(var1);
         k4.T.b(var1, k4.b.av, this.ak + (this.am << 3) / 2, 1, 2);
         k4.T.b(var1, k4.e(GameMidlet.k.A[0]) + bb[4], this.ak + (this.am << 3) / 2, 13, 2);
      }
   }

   public final void d(Graphics var1) {
      var1.setClip(this.ak - this.am / 2, this.al - this.am / 2, (this.am << 3) + this.am + 1, (this.am << 3) + this.am + 1);

      for(int var2 = 0; var2 < 10; ++var2) {
         for(int var3 = 0; var3 < 10; ++var3) {
            if (var3 % 2 == var2 % 2) {
               var1.setColor(5197647);
            } else {
               var1.setColor(2697513);
            }

            var1.fillRect(this.ak - this.am + var2 * this.am, this.al + var3 * this.am - this.am, this.am, this.am);
         }
      }

      var1.setColor(0);
      var1.drawRect(this.ak - this.am / 2, this.al - this.am / 2, (this.am << 3) + this.am, (this.am << 3) + this.am);
      var1.drawRect(this.ak - this.am / 2 + 1, this.al - this.am / 2 + 1, (this.am << 3) + this.am - 2, (this.am << 3) + this.am - 2);
   }

   private void g(Graphics var1) {
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < 2; ++var4) {
         i3 var5 = (i3)ft.D.elementAt(var4);
         dm var6;
         if (this.ar != -1 && var5.Z == -1 && var5.q == 0 && (var6 = f5.d((short)(this.aC ? 882 : 881))).e != -1) {
            var1.drawRegion(var6.b, 0, 48 * ev.a * (k4.n % 6 < 3 ? 0 : 1), 48 * ev.a, 48 * ev.a, 0, var5.a, var5.b - var5.e / 2, 3);
         }

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var5.f == GameMidlet.k.f) {
            var12 = this.ap - (10 + 10 * ev.a + this.aJ);
            var2 = 0;
            var10 = 0;
            var11 = 0;
            var3 = 0;
            var7 = -2;
            var6 = true;
            var8 = this.aJ - 7;
            var9 = this.aJ - 16 * ev.a;
            if (k4.o > 160) {
               k4.Y.b(var1, var5.c() + " " + hq.l(), var12 + this.aJ, var5.b, 1);
            }
         } else {
            var12 = this.aq + 10 + 10 * ev.a;
            var2 += this.aJ - var5.au * this.aJ / var5.ay;
            var3 += this.aJ - var5.av * this.aJ / var5.az;
            var11 = this.aJ - (var5.au + var5.aw) * this.aJ / var5.ay;
            var10 = this.aJ - (var5.av + var5.ax) * this.aJ / var5.az;
            var7 = this.aJ + 2;
            var8 = 8;
            var6 = false;
            var9 = 16 * ev.a;
            if (k4.o > 160) {
               k4.Y.b(var1, var5.c() + " " + hq.l(), var12, var5.b, 0);
            }
         }

         k4.Y.b(var1, String.valueOf(var5.au), var12 + var7, var5.b - (ev.k << 1) + 3 * ev.a - ev.k / 2, (int)var6);
         k4.Y.b(var1, String.valueOf(var5.av), var12 + var7, var5.b - ev.k + 3 * ev.a - ev.k / 2, (int)var6);
         if (var5.aA > 0 && var5.at <= 0 || var5.at > 0 && k4.n % 6 < 3) {
            f5.b(var1, 880, var12 + var8, var5.b - ev.k * 3, 3);
            k4.Y.b(var1, String.valueOf(var5.aA), var12 + var9, var5.b - ev.k * 3 - ev.k / 2, (int)var6);
            if (var5.at > 0) {
               --var5.at;
            }
         }

         if (var5.aw != 0 && k4.n % 6 >= 3) {
            var1.setColor(1908254);
         } else {
            var1.setColor(0);
         }

         var1.fillRect(var12, var5.b - (ev.k << 1), this.aJ, 6 * ev.a);
         var1.fillRect(var12, var5.b - ev.k, this.aJ, 6 * ev.a);
         if (var5.aw > 0) {
            var1.setColor(16583178);
            var1.fillRect(var12 + var11, var5.b - 4 - 10 * ev.a, (var5.au + var5.aw) * this.aJ / var5.ay, 6 * ev.a);
         }

         if (var5.aw != 0 && k4.n % 6 >= 3) {
            var1.setColor(16734553);
         } else {
            var1.setColor(16711680);
         }

         var1.fillRect(var12 + var2, var5.b - (ev.k << 1), var5.au * this.aJ / var5.ay, 6 * ev.a);
         var1.setColor(14137273);
         var1.drawRect(var12, var5.b - (ev.k << 1), this.aJ, 6 * ev.a);
         var1.drawRect(var12, var5.b - ev.k, this.aJ, 6 * ev.a);
         if (var5.ax > 0) {
            var1.setColor(3771903);
            var1.fillRect(var12 + var10, var5.b - ev.k + 1, (var5.av + var5.ax) * this.aJ / var5.az, 6 * ev.a - 1);
         }

         if ((var5.ax != 0 || var5.aq) && k4.n % 6 >= 3) {
            var1.setColor(6799871);
         } else {
            var1.setColor(299247);
         }

         var1.fillRect(var12 + var3, var5.b - ev.k + 1, var5.av * this.aJ / var5.az, 6 * ev.a - 1);
      }
   }

   private void h(Graphics var1) {
      for(int var2 = 0; var2 < this.as.size(); ++var2) {
         is var3;
         if ((var3 = (is)this.as.elementAt(var2)).l > 0) {
            f5.b(var1, 877, var3.a, var3.b, 3);
         } else if (var3.p) {
            this.ax.b(var3.k / 5, var3.a, var3.b, 0, 3, var1);
         } else if (var3.n >= 0) {
            this.ax.b(var3.k / 2 + 1, var3.a, var3.b, 0, 3, var1);
         }
      }
   }

   public final void o() {
      super.o();
      ft.A = false;
      this.aB = false;
      ey.d().e();
      this.aA = -1;

      for(int var1 = 0; var1 < ft.D.size(); ++var1) {
         i3 var2;
         (var2 = (i3)ft.D.elementAt(var1)).l();
         byte var3 = 4;
         var2.ac = (short)var3;
      }
   }

   public final void b(Vector var1) {
      ey var2 = ey.d();
      String var3 = "";
      ey var4 = var2;
      var2.v = var3;
      var2.t = k4.S.b(var2.v) + 20 * ev.a;
      if (var2.t < 50 + 20 * ev.a) {
         var2.t = 50 + 20 * ev.a;
      }

      var2.n = var1;
      var2.q = var2.n.size() * ev.h + (ev.b << 1) + 10 + ib.t;
      var2.s = 0;

      for(int var5 = 0; var5 < var4.n.size(); ++var5) {
         var3 = (String)var4.n.elementAt(var5);
         if (k4.S.b(var3) + 20 > var4.s) {
            var4.s = k4.S.b(var3) + 20;
         }
      }

      if (var4.s < 176) {
         var4.s = 176;
      }

      if (k4.o >= 240 && var4.s < 240 * ev.a) {
         var4.s = 240 * ev.a;
      }

      var4.r = (k4.o - var4.s) / 2;
      var4.p = k4.p - k4.ab - var4.q - 10;
      ey.d().f = new ag(hq.A, -1, this);
      super.f = ft.W;
      super.g = null;
      super.T = -1;
      ft.r();
      super.e = null;
      this.aB = true;
      if (i5.b) {
         fj.m(2000);
         i5.c = 0L;
         this.o();
      }
   }

   private static char[] d(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
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
               var10005 = 27;
               break;
            case 1:
               var10005 = 123;
               break;
            case 2:
               var10005 = 26;
               break;
            case 3:
               var10005 = 125;
               break;
            case 4:
               var10005 = 117;
               break;
            case 5:
               var10005 = 73;
               break;
            default:
               var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
