import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fw extends ft {
   public static fw ai;
   int[] aj = new int[4];
   b3[][] ak = new b3[4][4];
   cn al;
   cn am;
   public static cn[] an;
   public static cn[] ao;
   public static cn[] ap;
   private cn aq;
   private int[] ar = new int[10];
   boolean as;
   private b3 at;
   b3[] au = new b3[10];
   private b3[] av = new b3[3];
   int[][] aw = new int[4][12];
   private int[][] ax = new int[4][3];
   private int[] ay = new int[4];
   int[] az = new int[4];
   private int[][] aA = new int[4][11];
   private byte[] aB = new byte[4];
   byte[] aC = new byte[4];
   private int aD;
   private int aE;
   private int aF;
   int aG;
   int aH;
   int aI;
   b3 aJ;
   int aK;
   boolean aL;
   private int aM;
   boolean aN;
   boolean aO;
   private int[] aP = new int[4];
   private int aQ;
   boolean aR;
   boolean aS;
   private boolean aT;
   private cn aU;
   b3 aV;
   private b3 aW;
   private int aX = 473848;
   private int aY = 517368;
   private int aZ = 522270;
   static int a0 = 12;
   private static int a1 = 12;
   private ag a2;
   private ag a3;
   private ag a4;
   private int a5;
   private int a6 = 0;
   private boolean a7 = false;
   int a8 = -2;
   private int a9;
   private b3 a_ = null;
   private int[] ba = new int[5];
   int bb = 0;
   private static final String fb;

   static {
      String var10002 = d(d("Lw%sM.`\u00116$2"));
      boolean var10001 = true;
      fb = var10002;
   }

   public static fw u() {
      if (ai == null) {
         ai = new fw();
      }

      return ai;
   }

   public final void m() {
      this.v();
      super.m();
   }

   private void v() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.au[var1] = new b3((byte)-1, true);
         this.ar[var1] = -1;
         if (var1 < 3) {
            this.av[var1] = new b3((byte)-1, true);
         }
      }

      this.ak = new b3[4][4];
      super.F = 0;
      this.aH = -1;
      this.am = new cn();
      this.am.b = this.al.b;
      this.am.c = this.al.c;
      this.as = false;

      for(int var3 = 0; var3 < 4; ++var3) {
         for(int var2 = 0; var2 < 4; ++var2) {
            if (var2 < 3) {
               this.ax[var3][var2] = -1;
            }
         }

         for(int var4 = 0; var4 < 12; ++var4) {
            this.aw[var3][var4] = -1;
            if (var4 < 11) {
               this.aA[var3][var4] = -1;
            }
         }

         this.aP[var3] = -1;
         this.aj[var3] = 0;
         this.ay[var3] = 0;
         this.az[var3] = 0;
         this.aB[var3] = 0;
         this.aC[var3] = 0;
      }

      this.aD = 0;
      this.aE = 3;
      this.aF = 0;
      this.aJ = new b3((byte)-1, true);
      this.aK = -1;
      this.aQ = 1;
      this.aL = false;
      this.aM = -1;
      this.aN = false;
      this.aO = false;
      this.a8 = -2;
      this.aR = false;
      this.aI = -1;
      this.aS = false;
      this.aT = false;
      this.aU = new cn(k4.q, k4.r, 3);
      this.aV = new b3((byte)-1, true);
      this.aW = new b3((byte)-1, true);
   }

   public final void g() {
      super.g();
      this.w();
      if (ft.A) {
         this.a(false);
      }

      this.aU = new cn(k4.q, k4.r, 3);
      if (ft.ad == null) {
         try {
            ft.ad = Image.createImage(hq.b() + fb);
            return;
         } catch (IOException var1) {
            var1.printStackTrace();
         }
      }
   }

   private void w() {
      this.al = new cn();
      this.aq = new cn();
      this.al.b = k4.q - 27;
      this.al.c = k4.p - k4.ab;
      if (k4.o < 200) {
         this.al.c += 10;
      }

      this.aq.b = this.al.b - 24;
      this.aq.c = this.al.c - ft.S / 2 - 4;
      k4.aa.f();
   }

   public final void b(int var1, int var2) {
      label115:
      switch(var1) {
         case 30:
            fw var8 = this;
            this.D();
            this.C();

            for(int var9 = 0; var9 < var8.ba.length; ++var9) {
               var8.ba[var9] = -1;
            }

            int var10 = 0;

            for(int var12 = 0; var12 < 10; ++var12) {
               if (var8.ar[var12] == 0) {
                  if (var10 == 5) {
                     k4.c(hq.al);
                     break label115;
                  }

                  var8.ba[var10] = var8.au[var12].c;
                  ++var10;
               }
            }

            if (var10 < 2) {
               k4.c(hq.a0);
            } else {
               int[] var13 = new int[6];

               for(int var14 = 0; var14 < 5; ++var14) {
                  if (var8.ba[var14] != -1) {
                     var13[var14] = var8.ba[var14];
                  } else {
                     var13[var14] = -1;
                  }
               }

               var13[5] = var8.aH;
               byte var15 = -1;
               if (d(var13)) {
                  var15 = 1;
               }

               if (e(var13)) {
                  var15 = 0;
               }

               if (var15 == -1) {
                  k4.c(hq.am);
               } else {
                  for(int var11 = 0; var11 < var13.length; ++var11) {
                     if (var13[var11] != -1) {
                        for(int var7 = 0; var7 < 10; ++var7) {
                           if (var13[var11] == var8.au[var7].c) {
                              if (!var8.m(var7)) {
                                 k4.c(hq.am);
                                 break label115;
                              }
                              break;
                           }
                        }
                     }
                  }

                  var8.z();
                  ft.j();
                  h1.b().b(var8.ba, var15);
               }
            }
            break;
         case 31:
            this.K();
            break;
         case 32:
            fw var3 = this;
            this.D();
            if (GameMidlet.k.f != super.E) {
               k4.c(hq.aj);
            } else {
               this.C();
               int[] var4 = new int[12];
               byte var5 = -1;

               for(int var6 = 0; var6 < 10; ++var6) {
                  if (var3.au[var6].b == 0 || var5 != -1 && var5 != var3.au[var6].b) {
                     var4[var6] = -1;
                  } else {
                     var5 = var3.au[var6].b;
                     var4[var6] = var3.au[var6].c;
                  }
               }

               var3.z();
               ft.j();
               h1.b().b(var3.au);
            }
      }

      super.b(var1, var2);
   }

   public fw() {
      this.v();
      this.a2 = new ag(hq.ad, 30);
      this.a3 = new ag(hq.ae, 31);
      this.a4 = new ag(hq.af, 32);
      k4.aa.f();
   }

   void x() {
      super.f = this.a2;
      super.g = this.a3;
   }

   void y() {
      super.f = ft.X;
      super.g = null;
   }

   void z() {
      super.f = null;
      super.g = null;
   }

   private void A() {
      super.f = this.a4;
      super.g = null;
   }

   void B() {
      super.f = ft.W;
      super.g = null;
   }

   public final void o() {
      this.aL = false;
      this.m();
      super.o();
   }

   void C() {
      if (this.aK != -1 && this.aJ.c != -1) {
         if (k4.M) {
            this.j(super.F);
            this.i(this.aK);
            this.au[this.aK] = this.aJ;
            this.aJ = new b3((byte)-1, true);
         } else {
            this.j(super.F);
            this.i(this.aK);
            this.au[this.aK] = this.aJ;
            this.aJ = new b3((byte)-1, true);
         }
      }
   }

   void h(int var1) {
      this.au[var1] = new b3((byte)-1, true);
   }

   void D() {
      if (this.a7 && this.a6 == 2) {
         this.a6 = 0;
         this.a7 = false;
         if (this.aJ.c != -1) {
            this.F();
         }

         this.ar[super.F] = -1;
         k4.g = false;
      }
   }

   private void E() {
      for(int var1 = 0; var1 < 3; ++var1) {
         if (this.av[var1].c == this.au[super.F].c && this.av[var1].c != -1) {
            return;
         }
      }

      if (this.aQ < 2) {
         ++this.aQ;
      }

      if (this.aQ > 0 && this.aJ.c != -1) {
         this.F();
      }

      if (this.aQ == 2) {
         this.ar[super.F] = 0;
      }
   }

   public final void c() {
      super.c();
      if (!this.aR && !ft.B && ft.A && super.f != ft.Z && !this.as) {
         int var1;
         if ((var1 = this.L()) == -1) {
            var1 = 10;
         }

         if (k4.i && this.aJ.c != -1) {
            k4.i = false;
            this.a7 = true;
         }

         if (k4.i && k4.d(this.a5 - ft.R / 2, this.al.c - ft.S / 2 - 20, var1 * a0, ft.S)) {
            k4.i = false;
            if (this.aJ.c != -1) {
               this.E();
               this.a7 = false;
               return;
            }

            if ((var1 = this.L()) == -1) {
               var1 = 9;
            } else {
               --var1;
            }

            int var2 = (k4.j - (this.a5 - ft.R / 2)) / a0;
            this.a7 = true;
            if (var2 <= var1) {
               super.F = var2;
            }
         }

         if (this.a7) {
            var1 = k4.k();
            int var13 = k4.l();
            if (k4.g) {
               int var3 = (k4.j - (this.a5 - ft.R / 2)) / a0;
               if (this.a6 != 2 && var13 > 10) {
                  k4.d[2] = true;
                  if (this.ar[super.F] != -1) {
                     this.a6 = 1;
                  }
               } else if (this.a6 == 2 || var13 >= -10) {
                  if (b2.f(var1) > 10) {
                     if (this.a6 != 2) {
                        for(int var4 = 0; var4 < 3; ++var4) {
                           if (this.av[var4].c == this.au[super.F].c) {
                              return;
                           }
                        }

                        this.aJ = this.au[super.F];
                        this.h(super.F);
                        this.aK = super.F;
                     }

                     this.a6 = 2;
                     if (super.F - var3 > 0) {
                        if (this.aJ.c != -1 && var3 >= 0) {
                           this.au[super.F] = this.au[var3];
                           this.h(var3);
                           super.F = var3;
                        }
                     } else {
                        int var14;
                        if ((var14 = this.L()) == -1) {
                           var14 = 9;
                        } else {
                           --var14;
                        }

                        if (this.aJ.c != -1 && var3 <= var14) {
                           this.au[super.F] = this.au[var3];
                           this.h(var3);
                           super.F = var3;
                        }
                     }
                  }
               } else if (this.a6 == 1) {
                  this.a7 = false;
                  this.a6 = 0;
                  k4.d[8] = true;
               }

               this.a(true);
            }

            if (k4.h) {
               if (this.aJ.c != -1) {
                  this.D();
               } else if (b2.f(var1) <= 10 && b2.f(var13) <= 10) {
                  if (this.aQ == 1) {
                     this.aQ = 2;
                     this.ar[super.F] = -1;
                  } else if (this.aQ == 2) {
                     this.aQ = 1;
                     this.ar[super.F] = 0;
                  }
               }

               this.a(false);
            }
         }

         if (k4.d(2)) {
            this.E();
         } else {
            if (k4.d(8)) {
               if (this.aQ > 0) {
                  --this.aQ;
               }

               if (this.aQ < 2) {
                  this.ar[super.F] = -1;
               }

               if (this.aQ == 0 && this.aJ.c == -1) {
                  for(int var12 = 0; var12 < 3; ++var12) {
                     if (this.av[var12].c == this.au[super.F].c) {
                        return;
                     }
                  }

                  this.aJ = this.au[super.F];
                  this.h(super.F);
                  this.aK = super.F;
               }

               this.a(false);
               return;
            }

            if (k4.d(4)) {
               if ((var1 = this.L()) == -1) {
                  var1 = 9;
               } else {
                  --var1;
               }

               if (this.aJ.c != -1) {
                  if (super.F > 0) {
                     this.au[super.F] = this.au[super.F - 1];
                     this.h(super.F - 1);
                  } else {
                     this.j(0);
                  }
               }

               if (super.F > 0) {
                  --super.F;
               } else {
                  super.F = var1;
               }

               this.a(false);
               return;
            }

            if (!k4.d(6)) {
               return;
            }

            if ((var1 = this.L()) == -1) {
               var1 = 9;
            } else {
               --var1;
            }

            if (this.aJ.c != -1) {
               if (super.F < var1) {
                  this.au[super.F] = this.au[super.F + 1];
                  this.h(super.F + 1);
               } else {
                  this.i(0);
               }
            }

            if (super.F < var1) {
               ++super.F;
            } else {
               super.F = 0;
            }
         }

         this.a(false);
      }
   }

   public final void b() {
      super.b();
      if (!ft.A && !ft.B) {
         this.p();
      } else {
         if (ft.A && ft.A && this.au != null) {
            for(int var1 = this.au.length - 1; var1 >= 0; --var1) {
               if (this.au[var1].b() == -1) {
                  this.au[var1].h = false;
               }
            }
         }

         fw var8 = this;
         int var2;
         if (this.as && (var2 = ft.g(this.aG)) != -1) {
            var2 = ft.P[var2];
            int var3 = ao[var2].b;
            var2 = ao[var2].c;
            this.am.b += (var3 - this.am.b) / 2;
            this.am.c += (var2 - this.am.c) / 2;
            if (Math.abs(var3 - this.am.b) <= 1 && Math.abs(var2 - this.am.c) <= 1) {
               var3 = ft.g(this.aG);
               this.ak[var3][this.aC[var3]] = new b3((byte)this.aH, true);
               if (this.aG == GameMidlet.k.f) {
                  for(int var4 = 0; var4 < 10; ++var4) {
                     if (var8.au[var4].c == var8.aH) {
                        var8.j(var4);
                        break;
                     }
                  }

                  if (var8.au[var8.F].c == -1) {
                     var8.F = var8.L() - 1;
                  }
               }

               var8.as = false;
               var8.I();
            }

            var8.a(false);
         }

         if (this.aS) {
            var2 = this.al.b + this.bb * a0;
            int var18 = this.al.c;
            this.aU.b += (var2 - this.aU.b) / 2;
            this.aU.c += (var18 - this.aU.c) / 2;
            if (Math.abs((var2 - this.aU.b) / 2) <= 1 && Math.abs((var18 - this.aU.c) / 2) <= 1) {
               this.au[this.bb] = this.aV;
               if (b(this.ak[ft.K]) == 3) {
                  if (GameMidlet.k.f == super.E) {
                     this.A();
                  }
               } else if (GameMidlet.k.f == super.E) {
                  this.y();
               }

               if (!this.aO) {
                  this.H();
                  this.G();
               } else {
                  byte var19 = this.au[this.bb].c;
                  fw var13 = this;
                  int[] var22 = new int[6];

                  for(int var5 = 0; var5 < 5; ++var5) {
                     var22[var5] = -1;
                  }

                  int var23 = 0;

                  for(int var6 = 0; var6 < 12; ++var6) {
                     if (var13.aw[ft.K][var6] != -1) {
                        var22[var23] = var13.aw[ft.K][var6];
                        ++var23;
                     } else {
                        var23 = 0;
                        var22[5] = var19;
                        c(var22);
                        if (d(var22) || e(var22)) {
                           var13.D();
                           h1.b().b(var22);
                           break;
                        }

                        for(int var7 = 0; var7 < 6; ++var7) {
                           var22[var7] = -1;
                        }
                     }
                  }
               }

               this.bb = 0;
               this.aS = false;
               this.aU = new cn(k4.q, k4.r, 3);
               this.a(false);
            }
         }

         if (this.aT) {
            var2 = ft.g(super.E);
            int var20 = (ft.ab[ft.P[var2]].b - this.aW.d) / 2;
            var2 = (ft.ab[ft.P[var2]].c - this.aW.e) / 2;
            this.aW.d += var20;
            this.aW.e += var2;
            if (Math.abs(var20) <= 1 && Math.abs(var2) <= 1) {
               this.aT = false;
            }
         }

         var8 = this;
         ft.L = (long)((int)((long)k4.j() - ft.M));
         if ((long)ft.N - ft.L < 0L) {
            if (super.f == this.a2 && super.g == this.a3) {
               this.K();
               this.z();
               return;
            }

            if (super.f == ft.X) {
               var2 = 0;

               for(int var21 = 1; var21 < 10; ++var21) {
                  if (var8.au[var21].b == 0 && var8.au[var21].c > var8.au[var2].c) {
                     var2 = var21;
                  }
               }

               var8.C();
               h1.b().d(var8.au[var2].c);
               return;
            }

            if (super.f == this.a4) {
               this.C();
               this.a4.a();
            }
         }
      }
   }

   void a(boolean var1) {
      if (!var1) {
         int var2;
         if ((var2 = this.L()) == -1) {
            var2 = 10;
         }

         if (k4.M && ft.A && var2 != 0 && (a0 = (k4.o - ft.R / 2) / var2) > ft.R / 3 << 1) {
            a0 = ft.R / 3 << 1;
         }

         if ((a1 = a0) > ft.R / 4) {
            a1 = ft.R / 4;
         }

         if (k4.o < 160) {
            a1 = 10;
         }

         this.a5 = (k4.o - (a0 * var2 + (ft.R - a0)) >> 1) + ft.R / 2;
         if (this.a5 < ft.R / 2) {
            this.a5 = ft.R / 2;
         }
      }

      for(int var4 = 0; var4 < 10; ++var4) {
         int var3 = 0;
         if (this.ar[var4] == 0) {
            var3 = 10 * (k4.ah + 1);
         }

         this.au[var4].n = this.a5 + var4 * a0;
         this.au[var4].m = this.al.c - var3;
         if (var1) {
            this.au[var4].d = this.au[var4].n;
            this.au[var4].e = this.au[var4].m;
         }
      }
   }

   private void F() {
      byte var1 = -1;

      for(int var2 = 0; var2 < 3; ++var2) {
         if (this.aJ.b == this.av[var2].b) {
            var1 = this.av[var2].c;
         }
      }

      this.au[super.F] = this.aJ;
      if (var1 != -1) {
         if (!this.m(super.F)) {
            this.aJ = this.au[super.F];
            this.h(super.F);
            this.C();
            return;
         }

         this.h(super.F);
      }

      if (this.aJ.b == 0 || (super.F <= 0 || this.au[super.F - 1].b != this.aJ.b) && (super.F >= 9 || this.au[super.F + 1].b != this.aJ.b)) {
         if (var1 != -1 && this.aJ.b != 0) {
            if (var1 != -1) {
               this.a8 = -1;
               if (this.aK != super.F) {
                  this.b(this.aJ, var1);
               }
            }
         } else {
            if (super.F < 9) {
               for(int var8 = 0; var8 < 3; ++var8) {
                  if (this.av[var8].b != 0 && this.au[super.F + 1].b == this.av[var8].b) {
                     int[] var5 = new int[10];
                     boolean var3 = false;

                     for(int var4 = 0; var4 < 10; ++var4) {
                        if (this.au[var4].b == this.av[var8].b) {
                           var5[var4] = this.au[var4].c;
                        } else {
                           var5[var4] = -1;
                           if (!var3) {
                              var3 = true;
                              var5[var4] = this.aJ.c;
                           }
                        }
                     }

                     int[] var6;
                     if (!e(var6 = c(var5)) && !d(var6)) {
                        this.C();
                        return;
                     }

                     this.a8 = this.aJ.b;
                     this.aJ.b = this.av[var8].b;
                     this.au[super.F] = this.aJ;
                     if (this.aK != super.F) {
                        this.b(this.av[var8], this.av[var8].c);
                     }

                     return;
                  }
               }
            }

            fw var7 = this;
            int var9 = 0;

            int var10000;
            while(true) {
               if (var9 >= 10) {
                  var10000 = -1;
                  break;
               }

               if (var7.au[var9].c == -1) {
                  var10000 = var9;
                  break;
               }

               if (var7.k(var7.au[var9].b)) {
                  var10000 = var9;
                  break;
               }

               ++var9;
            }

            var9 = var10000;
            if (super.F >= var9 && var9 != -1) {
               this.C();
            } else {
               this.au[super.F] = this.aJ;
               this.aJ = new b3((byte)-1, true);
               if (this.aK != super.F) {
                  this.au[super.F].b = 0;
                  this.H();
                  this.G();
               }
            }
         }
      } else {
         this.au[super.F] = this.aJ;
         this.aJ = new b3((byte)-1, true);
      }
   }

   private void b(b3 var1, int var2) {
      this.D();
      this.aR = true;
      int[] var3 = new int[5];

      for(int var4 = 0; var4 < 5; ++var4) {
         var3[var4] = -1;
      }

      int[] var10 = new int[6];

      for(int var5 = 0; var5 < 6; ++var5) {
         var10[var5] = -1;
      }

      int var11 = 0;

      for(int var6 = 0; var6 < 10; ++var6) {
         if (this.au[var6].b == var1.b) {
            var10[var11] = this.au[var6].c;
            ++var11;
         }
      }

      if (var10[5] != -1) {
         c(var10);
         int var15 = 0;

         for(int var12 = 0; var12 < var10.length; ++var12) {
            if (var10[var12] == var2) {
               var15 = var12;
            }
         }

         var11 = 0;
         if (var15 < 3) {
            for(int var8 = 0; var8 < var10.length; ++var8) {
               if (var8 > 2) {
                  for(int var17 = 0; var17 < 10; ++var17) {
                     if (var10[var8] == this.au[var17].c) {
                        this.au[var17].b = 0;
                     }
                  }
               } else {
                  var3[var11] = var10[var8];
                  ++var11;

                  for(int var16 = 0; var16 < 10; ++var16) {
                     if (var10[var8] == this.au[var16].c) {
                        b3 var7 = this.au[var16];
                        this.j(var16);
                        this.au[this.L()] = var7;
                     }
                  }
               }
            }
         } else {
            for(int var9 = 0; var9 < var10.length; ++var9) {
               if (var9 < 3) {
                  for(int var19 = 0; var19 < 10; ++var19) {
                     if (var10[var9] == this.au[var19].c) {
                        this.au[var19].b = 0;
                     }
                  }
               } else {
                  var3[var11] = var10[var9];
                  ++var11;

                  for(int var18 = 0; var18 < 10; ++var18) {
                     if (var10[var9] == this.au[var18].c) {
                        b3 var21 = this.au[var18];
                        this.j(var18);
                        this.au[this.L()] = var21;
                     }
                  }
               }
            }
         }
      } else {
         int var20 = 0;

         for(int var14 = 0; var14 < 10; ++var14) {
            if (this.au[var14].b == var1.b) {
               var3[var20] = this.au[var14].c;
               ++var20;
            }
         }
      }

      c(var3);
      h1.b().b(var3, var2);
   }

   private void i(int var1) {
      for(int var2 = 9; var2 > var1; --var2) {
         this.au[var2] = this.au[var2 - 1];
      }

      this.h(var1);
   }

   private void j(int var1) {
      for(int var2 = var1; var2 < 9; ++var2) {
         this.au[var2] = this.au[var2 + 1];
      }

      this.h(9);
      this.ar[var1] = -1;
   }

   public final void b(Graphics var1) {
      this.a(var1);
      super.b(var1);
   }

   public final void c(Graphics var1) {
      int var2 = ev.a;
      if (ft.A || ft.B) {
         var2 = 1;
      }

      for(int var3 = 0; var3 < ft.ae; ++var3) {
         i3 var4;
         if ((var4 = (i3)ft.D.elementAt(var3)).f != -1) {
            if (var4.f != GameMidlet.k.f || !ft.A) {
               var4.b(var1, var4.a * var2, var4.b * var2, false);
            }

            var4.b(var1, var4.a * var2, var4.b * var2);
            ft.b(var1, var4.a * var2, (var4.b - 50) * var2 - 10 * (var2 - 1), var4);
         }
      }
   }

   public final void a(Graphics var1) {
      super.a(var1);
      this.c(var1);
      long var4;
      if (ft.A && !ft.C && (var4 = (long)ft.N - ft.L) > 0L && an != null && an[0] != null) {
         k4.W.b(var1, String.valueOf(var4), k4.q, an[0].c + ev.k + 10, 2);
      }

      if (ft.A) {
         this.d(var1);
         this.g(var1);
         if (this.aS) {
            this.aV.d = this.aU.b;
            this.aV.e = this.aU.c;
            if (k4.o > 176) {
               this.aV.d(var1);
            } else {
               this.aV.b(var1, false);
            }
         }

         if (this.aT) {
            if (k4.o > 176) {
               this.aW.d(var1);
            } else {
               this.aW.b(var1, false);
            }
         }

         if (this.as) {
            b3 var6;
            (var6 = new b3((byte)this.aH, true)).d = this.am.b;
            var6.e = this.am.c;
            if (k4.o > 176) {
               var6.d(var1);
            } else {
               var6.b(var1, false);
            }
         }

         if (k4.ah == 0 && super.F != -1 && !ft.B && !this.aL) {
            if (this.a9 == 4) {
               this.aq.c += 2;
            }

            if (this.a9 == 8) {
               this.aq.c -= 2;
               this.a9 = 0;
            }

            ++this.a9;
            int var7 = 0;
            if (this.ar[super.F] == 0) {
               var7 = 10 * (k4.ah + 1);
            }

            if (this.aJ.c != -1) {
               var7 = -10;
            }

            if (this.au[super.F] != null) {
               fc.g().B.b(0, this.a5 - ft.R / 2 + super.F * a0 + fc.g().B.b / 2, this.al.c - ft.S / 2 - 4 - var7, 0, 33, var1);
            }
         }

         if (!this.aL) {
            int var2 = ft.g(this.aI);
            var1.drawImage(ft.ad, an[ft.P[var2]].b, an[ft.P[var2]].c - 8, 3);
         }
      }

      ft.e(var1);
   }

   private void d(Graphics var1) {
      for(int var2 = 0; var2 < 4; ++var2) {
         i3 var3;
         if ((var3 = (i3)ft.D.elementAt(var2)).f != -1 && (k4.o >= 160 || var3.f == super.E)) {
            int var4 = ft.g(super.E);
            if (var2 != var4 || k4.n % 20 > 5 && var2 == var4 || this.aL) {
               k4.Y.b(var1, var3.c() + " " + hq.l(), an[ft.P[var2]].b, an[ft.P[var2]].c, an[ft.P[var2]].d);
            }
         }
      }
   }

   private void g(Graphics var1) {
      this.at = new b3((byte)-1, true);
      int var2 = a1;
      if (a1 <= 12 && k4.o > 200) {
         var2 = 20;
      }

      byte var3 = 2;
      if (k4.ah == 0 && k4.o > 200) {
         var3 = 1;
      }

      Graphics var5 = var1;
      fw var4 = this;
      int var6 = a1;
      if (a1 <= 12 && k4.o > 200) {
         var6 = 20;
      }

      if (!this.aL) {
         for(int var7 = 0; var7 < 4; ++var7) {
            i3 var8;
            if ((var8 = (i3)ft.D.elementAt(var7)) != null && var8.f != -1) {
               int var9 = 3;
               if (var4.ak[var7] != null) {
                  for(int var36 = 0; var36 < 4; ++var36) {
                     if (var4.ak[var7][var36] == null) {
                        var9 = var36;
                        break;
                     }
                  }
               }

               if (ft.P[var7] != 0 && ft.P[var7] != 2) {
                  for(int var38 = 0; var38 < 4 && var4.ak[var7][var38] != null; ++var38) {
                     var4.ak[var7][var38].d = ao[ft.P[var7]].b;
                     var4.ak[var7][var38].e = ao[ft.P[var7]].c + (var38 * var6 << 1) - (var9 * var6 << 1) / 2;
                     if (k4.o > 176) {
                        var4.ak[var7][var38].d(var5);
                     } else {
                        var4.ak[var7][var38].b(var5, true);
                     }
                  }
               } else {
                  for(int var37 = 0; var37 < 4 && var4.ak[var7] != null && var4.ak[var7][var37] != null; ++var37) {
                     var4.ak[var7][var37].d = ao[ft.P[var7]].b + var37 * a1 - (var9 * a1 + (ft.R - a1)) / 2 + ft.R / 2;
                     var4.ak[var7][var37].e = ao[ft.P[var7]].c;
                     if (ft.P[var7] == 2) {
                        if (k4.o > 176) {
                           if (var37 >= 3 || var4.ak[var7][var37 + 1] == null) {
                              var4.ak[var7][var37].d(var5);
                           } else if (a0 > 13) {
                              var4.ak[var7][var37].d(var5);
                           } else {
                              var4.ak[var7][var37].d(var5);
                           }
                        } else {
                           var4.ak[var7][var37].b(var5, false);
                        }
                     } else if (k4.o > 176) {
                        var4.ak[var7][var37].d = ao[ft.P[var7]].b - var37 * a1 + (var4.aj[var7] * a1 + (ft.R - a1)) / 2 - ft.R / 2;
                        var4.ak[var7][var37].d(var5);
                     } else {
                        var4.ak[var7][var37].b(var5, false);
                     }
                  }
               }
            }
         }
      }

      for(int var10 = 0; var10 < 4; ++var10) {
         i3 var17;
         if ((var17 = (i3)ft.D.elementAt(var10)) != null && var17.f != -1) {
            if (ft.P[var10] == 1 || ft.P[var10] == 3) {
               for(int var18 = 0; var18 < 11 && this.aA[var10][var18] != -1; ++var18) {
                  this.at = new b3((byte)this.aA[var10][var18], true);
                  this.at.d = ao[ft.P[var10]].b;
                  this.at.e = ao[ft.P[var10]].c + var18 * (var2 << 1) - this.aB[var10] * (var2 << 1) / 2;
                  if (k4.o > 176) {
                     this.at.d(var1);
                  } else {
                     this.at.b(var1, true);
                  }
               }
            }

            if (ft.P[var10] == 0) {
               for(int var19 = 0; var19 < 11 && this.aA[var10][var19] != -1; ++var19) {
                  this.at = new b3((byte)this.aA[var10][var19], true);
                  this.at.d = ao[ft.P[var10]].b - var19 * a1 + (this.aB[var10] * a1 + (ft.R - a1)) / 2 - ft.R / 2;
                  this.at.e = ao[ft.P[var10]].c;
                  if (k4.o > 176) {
                     this.at.d(var1);
                  } else {
                     this.at.d = ao[ft.P[var10]].b + var19 * a1 - (this.aB[var10] * a1 + (ft.R - a1)) / 2 + ft.R / 2;
                     this.at.b(var1, false);
                  }
               }
            }
         }
      }

      for(int var11 = 0; var11 < 4; ++var11) {
         i3 var20;
         if ((var20 = (i3)ft.D.elementAt(var11)) != null && var20.f != -1) {
            if (ft.P[var11] == 1) {
               for(int var22 = 0; var22 < 3 && this.ax[var11][var22] != -1; ++var22) {
                  b3 var32;
                  (var32 = new b3((byte)this.ax[var11][var22], true)).d = ap[ft.P[var11]].b;
                  var32.e = ap[ft.P[var11]].c + var22 * (var2 << 1) - this.ay[var11] * (var2 << 1) / 2;
                  var32.b = 1;
                  if (k4.o > 176) {
                     var32.d(var1);
                  } else {
                     var32.b(var1, true);
                  }

                  this.b(1, var32.d, var32.e, var1);
               }
            } else if (ft.P[var11] == 0) {
               for(int var21 = 0; var21 < 3 && this.ax[var11][var21] != -1; ++var21) {
                  b3 var31;
                  (var31 = new b3((byte)this.ax[var11][var21], true)).e = ap[ft.P[var11]].c;
                  var31.d = ap[ft.P[var11]].b + var21 * a1 - (this.ay[var11] * a1 + (ft.R - a1)) / 2 + ft.R / 2;
                  var31.b = 1;
                  if (k4.o > 176) {
                     var31.d(var1);
                  } else {
                     var31.b(var1, false);
                  }

                  this.b(1, var31.d, var31.e, var1);
               }
            }
         }
      }

      for(int var12 = 0; var12 < 4; ++var12) {
         if (ft.P[var12] == 1) {
            for(int var23 = 0; var23 < 12 && this.aw[var12][0] != -1; ++var23) {
               if (this.aw[var12][var23] != -1) {
                  this.at = new b3((byte)this.aw[var12][var23], true);
                  this.at.d = ap[ft.P[var12]].b;
                  if (k4.o > 176) {
                     this.at.e = ap[ft.P[var12]].c + var23 * var2 * var3 - this.az[var12] * var2 * var3 / 2;
                     this.at.d(var1);
                  } else {
                     this.at.e = ap[ft.P[var12]].c + var23 * var2 - this.az[var12] * var2 / 2;
                     this.at.b(var1, true);
                  }
               }
            }
         } else if (ft.P[var12] == 0) {
            if (this.aw[var12][0] == -1) {
               break;
            }

            for(int var24 = 0; var24 < 12; ++var24) {
               if (this.aw[var12][var24] != -1) {
                  this.at = new b3((byte)this.aw[var12][var24], true);
                  this.at.d = ap[ft.P[var12]].b - var24 * a1 + (this.az[var12] * a1 + (ft.R - a1)) / 2 - ft.R / 2;
                  this.at.e = ap[ft.P[var12]].c;
                  if (k4.o > 176) {
                     this.at.d(var1);
                  }
               }
            }
         }
      }

      for(int var13 = 0; var13 < 4; ++var13) {
         i3 var25;
         if ((var25 = (i3)ft.D.elementAt(var13)) != null && var25.f != -1 && ft.P[var13] == 3) {
            for(int var26 = 0; var26 < 3 && this.ax[var13][var26] != -1; ++var26) {
               b3 var33;
               (var33 = new b3((byte)this.ax[var13][var26], true)).b = 1;
               var33.d = ap[ft.P[var13]].b;
               var33.e = ap[ft.P[var13]].c + var26 * (var2 << 1) - this.ay[var13] * (var2 << 1) / 2;
               if (k4.o > 176) {
                  var33.d(var1);
               } else {
                  var33.b(var1, true);
               }

               this.b(1, var33.d, var33.e, var1);
            }
         }
      }

      for(int var14 = 0; var14 < 4; ++var14) {
         i3 var27;
         if ((var27 = (i3)ft.D.elementAt(var14)) != null && var27.f != -1 && ft.P[var14] == 3) {
            for(int var28 = 0; var28 < 12 && this.aw[var14][0] != -1; ++var28) {
               if (this.aw[var14][var28] != -1) {
                  this.at = new b3((byte)this.aw[var14][var28], true);
                  this.at.d = ap[ft.P[var14]].b;
                  if (k4.o > 176) {
                     this.at.e = ap[ft.P[var14]].c + var28 * var2 * var3 - this.az[var14] * var2 * var3 / 2;
                     this.at.d(var1);
                  } else {
                     this.at.e = ap[ft.P[var14]].c + var28 * var2 - this.az[var14] * var2 / 2;
                     this.at.b(var1, true);
                  }
               }
            }
         }
      }

      for(int var15 = 0; var15 < 4; ++var15) {
         if (ft.P[var15] == 2) {
            for(int var29 = 0; var29 < 12 && this.aw[var15][0] != -1; ++var29) {
               if (this.aw[var15][var29] != -1) {
                  this.at = new b3((byte)this.aw[var15][var29], true);
                  this.at.d = ap[ft.P[var15]].b + var29 * a1 - (this.az[var15] * a1 + (ft.R - a1)) / 2 + ft.R / 2;
                  this.at.e = ap[ft.P[var15]].c;
                  if (k4.o > 176) {
                     if (var29 >= 11 || this.aw[var15][var29 + 1] == -1) {
                        this.at.d(var1);
                     } else if (a0 > 13) {
                        this.at.d(var1);
                     } else {
                        this.at.d(var1);
                     }
                  } else {
                     this.at.b(var1, false);
                  }
               }
            }
         }
      }

      var5 = var1;
      var4 = this;

      for(int var34 = 0; var34 < 10; ++var34) {
         byte var35 = 0;
         if (var4.au[var34] != null && var4.au[var34].c != -1) {
            if (var4.ar[var34] == 0) {
               var35 = 5;
            }

            var4.a_ = new b3((byte)-1, true);
            var4.a_.d = var4.au[var34].d;
            var4.a_.e = var4.au[var34].e;
            if (!var4.au[var34].h) {
               var4.a_ = var4.au[var34];
            }

            if (k4.o > 176) {
               if (var35 == 0 && var34 < 9 && var4.au[var34 + 1].c != -1 && var34 != var4.F) {
                  if (a0 <= 14 && var4.au[var34 + 1].d == var4.au[var34 + 1].n) {
                     var4.a_.b(var5);
                  } else {
                     var4.a_.c(var5);
                  }

                  if (var4.au[var34].b != 0) {
                     var4.b(var4.au[var34].b, var4.au[var34].d, var4.au[var34].e, var5);
                  }
               } else {
                  var4.a_.d(var5);
                  if (var4.au[var34].b != 0) {
                     var4.b(var4.au[var34].b, var4.au[var34].d, var4.au[var34].e, var5);
                  }
               }
            } else {
               var4.a_.b(var5, false);
               if (var4.au[var34].b != 0) {
                  var4.b(var4.au[var34].b, var4.au[var34].d, var4.au[var34].e, var5);
               }
            }
         }

         if (var34 == var4.F && var4.aJ.c != -1) {
            var4.aJ.d = var4.a5 + var4.F * a0;
            var4.aJ.e = var4.al.c + (var4.a7 ? -5 : 10);
            if (k4.o > 176) {
               if (var4.F < 9) {
                  if (var4.au[var4.F + 1].c != -1 && !k4.M) {
                     var4.aJ.b(var5);
                  } else {
                     var4.aJ.d(var5);
                  }
               } else {
                  var4.aJ.d(var5);
               }
            } else {
               var4.aJ.b(var5, false);
            }

            if (k4.n % 10 > 6 && ev.a == 1 && k4.ah == 0) {
               ib.c.b(0, var4.aJ.d - 40, var4.aJ.e - 30, 0, var5);
               ib.c.b(0, var4.aJ.d - 10, var4.aJ.e - 30, 3, var5);
            }
         }
      }
   }

   private void b(int var1, int var2, int var3, Graphics var4) {
      int var5 = 0;
      switch(var1) {
         case 1:
         case 4:
            var5 = this.aX;
            break;
         case 2:
         case 5:
            var5 = this.aY;
            break;
         case 3:
         case 6:
            var5 = this.aZ;
      }

      var4.setColor(var5);
      var4.fillRect(var2 - ft.R / 2 + 2, var3 - ft.S / 2 + 22, 7, 2);
   }

   void G() {
      this.aE = 3;
      fw var2 = this;

      label148:
      for(int var4 = 0; var4 < 8 && !var2.k(var2.au[var4].b); ++var4) {
         int[] var5 = new int[6];

         for(int var6 = 0; var6 < 6; ++var6) {
            var5[var6] = -1;
         }

         for(int var11 = 0; var11 < 3; ++var11) {
            if (var2.au[var4 + var11].b != 0) {
               break label148;
            }

            var5[var11] = var2.au[var4 + var11].c;
         }

         if (d(var5) || e(var5)) {
            ++var2.aE;

            for(int var12 = 0; var12 < 3; ++var12) {
               var2.au[var4 + var12].b = (byte)var2.aE;
            }

            var4 += 2;
         }
      }

      for(int var1 = 0; var1 < 10; ++var1) {
         if (!this.k(this.au[var1].b) && this.au[var1].b == 0 && this.au[var1].c != -1) {
            int var3 = var1;
            var2 = this;
            if (this.au[var1].b == 0 && this.au[var1].c != -1) {
               int var9 = 0;
               int var10 = 0;
               if (var1 > 0 && this.au[var1 - 1].b != 0 && this.au[var1 - 1].c != -1) {
                  int[] var13 = new int[10];

                  for(int var7 = 0; var7 < 10; ++var7) {
                     if (var2.au[var7].b == var2.au[var3 - 1].b) {
                        var13[var7] = var2.au[var7].c;
                        var9 += var13[var7] / 4 + 1;
                     } else {
                        var13[var7] = -1;
                     }
                  }

                  int[] var14;
                  (var14 = c(var13))[9] = var2.au[var3].c;
                  if (!d(var13 = c(var14)) && !e(var13)) {
                     var9 = 0;
                  }
               }

               if (var3 < 9 && (var3 == 0 || var3 != 0 && var2.au[var3 + 1].b != var2.au[var3 - 1].b) && var2.au[var3 + 1].b != 0 && var2.au[var3 + 1].c != -1) {
                  int[] var16 = new int[10];

                  for(int var19 = 0; var19 < 10; ++var19) {
                     if (var2.au[var19].b == var2.au[var3 + 1].b) {
                        var16[var19] = var2.au[var19].c;
                        var10 += var16[var19] / 4 + 1;
                     } else {
                        var16[var19] = -1;
                     }
                  }

                  int[] var17;
                  (var17 = c(var16))[9] = var2.au[var3].c;
                  if (!d(var16 = c(var17)) && !e(var16)) {
                     var10 = 0;
                  }
               }

               if (var9 < var10) {
                  var2.au[var3].b = var2.au[var3 + 1].b;
               } else if (var9 > 0) {
                  var2.au[var3].b = var2.au[var3 - 1].b;
               }
            }
         }
      }

      if (this.aD + (this.aE - 3) == 3) {
         super.f = this.a4;
      }
   }

   void H() {
      byte var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.k(this.au[var2].b)) {
            return;
         }

         if (this.au[var2].b != 0 && var1 != this.au[var2].b) {
            var1 = this.au[var2].b;
            --this.aE;
         }

         this.au[var2].b = 0;
      }
   }

   boolean k(int var1) {
      for(int var2 = 0; var2 < 3; ++var2) {
         if (this.av[var2].b == 0) {
            return false;
         }

         if (this.av[var2].b == var1) {
            return true;
         }
      }

      return false;
   }

   public final void b(byte var1, Vector var2, int var3, int var4) {
      this.s();
      this.w();
      this.v();
      ft.M = (long)k4.j();
      super.E = var3;
      this.aG = super.E;
      ft.N = var1;
      this.aI = var4;
      ft.A = true;
      var1 = var2.size();

      for(int var7 = 0; var7 < var1; ++var7) {
         b3 var8 = (b3)var2.elementAt(var7);
         this.au[var7] = new b3(var8.c, true);
         this.au[var7].d = k4.q;
         this.au[var7].e = k4.r;
         this.au[var7].h = true;
      }

      c(this.au);
      this.G();
      if (super.E != GameMidlet.k.f) {
         this.z();
      }

      this.t();
      this.a(false);
   }

   public final void k() {
      this.D();
      super.k();
      this.C();
      int var1 = 0;
      int var2 = -1;

      for(int var3 = 0; var3 < 10; ++var3) {
         if (this.ar[var3] == 0) {
            ++var1;
            var2 = var3;
         }
      }

      if (var1 > 1) {
         k4.c(hq.ag);
      } else if (var2 == -1) {
         k4.c(hq.ah);
      } else {
         boolean var10000;
         if (this.au[var2].b != 0 && !this.m(var2)) {
            k4.c(hq.ai);
            var10000 = false;
         } else {
            var10000 = true;
         }

         if (var10000) {
            this.z();
            ft.j();
            h1.b().d(this.au[var2].c);
         }
      }
   }

   void I() {
      for(int var1 = 0; var1 < this.ar.length; ++var1) {
         this.ar[var1] = -1;
      }
   }

   public final void b(int[] var1, int[][] var2) {
      this.D();
      int var3 = 1000;

      for(int var4 = 0; var4 < 4; ++var4) {
         if (var1[var4] >= 0 && var1[var4] < var3) {
            var3 = var1[var4];
            this.aM = var4;
         }

         this.aP[var4] = var1[var4];
      }

      this.aA = var2;

      for(int var6 = 0; var6 < 4; ++var6) {
         this.aB[var6] = (byte)b(var2[var6]);
      }

      this.aL = true;
      this.B();

      for(int var7 = 0; var7 < 4; ++var7) {
         i3 var5;
         if ((var5 = (i3)ft.D.elementAt(var7)) != null && var5.f != -1 && this.aP[var7] != -1) {
            if (this.aP[var7] == -2) {
               ft.b(var5.f, hq.cN);
            } else if (var7 == this.aM) {
               ft.b(var5.f, hq.aQ);
            } else {
               ft.b(var5.f, hq.aR);
            }

            var5.O = false;
         }
      }

      GameMidlet.k.O = false;
      this.a(false);
   }

   public final void J() {
      this.aL = true;
      this.B();
      if (!ft.B) {
         this.aM = ft.K;
         ft.b(((i3)ft.D.elementAt(this.aM)).f, hq.aQ);
      }

      ft.A = true;
   }

   public final void l(int var1) {
      this.aL = true;
      this.B();
      this.aM = var1;
      this.aN = true;
      ft.b(this.aM, hq.cO);
      ft.b(this.aG, hq.cP);
   }

   private boolean m(int var1) {
      int var2 = -1;

      for(int var3 = 0; var3 < 3; ++var3) {
         if (this.av[var3].b != 0 && this.av[var3].b == this.au[var1].b) {
            var2 = var3;
            break;
         }
      }

      if (var2 == -1) {
         if (this.au[var1].b != 0) {
            int[] var15 = new int[10];

            for(int var18 = 0; var18 < 10; ++var18) {
               if (this.au[var18].b == this.au[var1].b && this.ar[var18] == -1 && var18 != var1) {
                  var15[var18] = this.au[var18].c;
               } else {
                  var15[var18] = -1;
               }
            }

            if (!d(var15 = c(var15)) && !e(var15)) {
               for(int var19 = 0; var19 < 10; ++var19) {
                  if (var19 != var1 && this.au[var19].b == this.au[var1].b) {
                     this.au[var19].b = 0;
                  }
               }

               this.au[var1].b = 0;
            }
         }

         return true;
      } else {
         int[] var12 = new int[10];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.au[var4].b == this.av[var2].b && this.ar[var4] == -1 && var4 != var1) {
               var12[var4] = this.au[var4].c;
            } else {
               var12[var4] = -1;
            }
         }

         var12 = c(var12);
         int var17 = -1;
         var1 = 0;

         for(int var5 = 0; var5 < 10; ++var5) {
            if (var12[var5] == this.av[var2].c) {
               var17 = var5;
            }
         }

         for(int var20 = 0;
            var20 < 9
               && var12[var20 + 1] != -1
               && (var12[var20 + 1] / 4 == var12[var20] / 4 || var12[var20 + 1] / 4 - var12[var20] / 4 == 1 && var12[var20] % 4 == var12[var20 + 1] % 4);
            ++var20
         ) {
            var1 = var20 + 1;
         }

         if (var17 > var1 && var1 > 1) {
            return false;
         } else if (var1 > 1) {
            for(int var22 = var1 + 1; var22 < 10; ++var22) {
               for(int var11 = 0; var11 < 10; ++var11) {
                  if (var12[var22] == this.au[var11].c) {
                     this.au[var11].b = 0;
                  }
               }
            }

            return true;
         } else {
            int[] var21 = new int[3];

            for(int var8 = 0; var8 < 3; ++var8) {
               var21[var8] = -1;
            }

            for(int var9 = 0; var9 <= var1; ++var9) {
               var21[var9] = var12[var9];
               var12[var9] = -1;
            }

            if (!d(var12 = c(var12)) && !e(var12)) {
               return false;
            } else {
               for(int var10 = 0; var10 < 3; ++var10) {
                  for(int var7 = 0; var7 < 10; ++var7) {
                     if (var21[var10] == this.au[var7].c) {
                        this.au[var7].b = 0;
                     }
                  }
               }

               return true;
            }
         }
      }
   }

   public final void b(boolean var1, int var2, int var3, byte var4) {
      int var5;
      if ((var5 = ft.g(super.E)) != -1) {
         if (super.E == GameMidlet.k.f) {
            this.D();
         }

         if (var1) {
            this.aT = true;
            this.aW = new b3((byte)this.aH, true);
            int var6 = ft.g(this.aG);
            this.aW.d = ft.ab[ft.P[var6]].b;
            this.aW.e = ft.ab[ft.P[var6]].c;
            if ((var1 = ft.g(this.aG)) != -1) {
               var6 = ft.g(this.aI);
               if (var1 != var6) {
                  this.ak[var1][this.aC[var1]] = this.ak[var6][this.aC[var6]];
               }

               this.ak[var6][this.aC[var6]] = null;
               this.aI = var3;
               this.aC[var6] = var4;
               this.aj[var5] = this.aC[var5];
               this.aj[var6] = this.aC[var6];
            }

            this.ay[var5]++;
            if (super.E == GameMidlet.k.f) {
               ++this.aD;
               if (b(this.ak[ft.K]) == 3) {
                  this.A();
               } else {
                  this.y();
               }

               for(int var11 = var2 - 1; var11 >= 0; --var11) {
                  for(int var8 = 0; var8 < 10; ++var8) {
                     if (this.au[var8].c == this.ba[var11]) {
                        this.au[var8].b = (byte)this.aD;
                        this.au[this.L()] = this.au[var8];
                        this.j(var8);
                     }
                  }
               }

               var6 = this.L();
               this.au[var6] = new b3((byte)this.aH, true);
               this.au[var6].b = (byte)this.aD;

               for(int var9 = 0; var9 < 3; ++var9) {
                  if (this.av[var9].c == -1) {
                     this.av[var9] = this.au[var6];
                     break;
                  }
               }

               this.H();
               this.G();
            }

            this.ax[var5][b(this.ax[var5])] = this.aH;
            this.I();
         } else if (super.E == GameMidlet.k.f) {
            k4.c(hq.am);
            this.x();
         }

         if (GameMidlet.k.f == super.E || GameMidlet.k.f == this.aG) {
            this.a(false);
         }
      }
   }

   private void K() {
      this.D();
      this.C();
      this.z();
      ft.j();
      h1.b().g();
   }

   public final void b(boolean var1, byte var2) {
      int var3;
      if ((var3 = ft.g(super.E)) != -1) {
         if (super.E == GameMidlet.k.f) {
            this.D();
         }

         if (var1) {
            if (GameMidlet.k.f == super.E) {
               for(int var7 = 0; var7 < 10 && this.au[var7].c != -1; ++var7) {
                  if (var2 == this.au[var7].c) {
                     this.h(var7);
                     break;
                  }
               }

               this.a(false);
            }

            var1 = 0;
            int[] var4 = new int[6];

            for(int var5 = 0; var5 < 6; ++var5) {
               var4[var5] = -1;
            }

            for(int var9 = 0; var9 < this.aw[var3].length; ++var9) {
               if (this.aw[var3][var9] != -1) {
                  var4[var1] = this.aw[var3][var9];
                  ++var1;
               } else {
                  var1 = 0;
                  var4[5] = var2;
                  c(var4);
                  if (d(var4) || e(var4)) {
                     for(int var6 = 11; var6 > var9; --var6) {
                        if (var6 - 1 >= 0) {
                           this.aw[var3][var6] = this.aw[var3][var6 - 1];
                        }
                     }

                     this.aw[var3][var9] = var2;
                  }

                  for(int var10 = 0; var10 < 6; ++var10) {
                     var4[var10] = -1;
                  }
               }
            }
         }
      }
   }

   int L() {
      for(int var1 = 0; var1 < 10; ++var1) {
         if ((this.aJ.c == -1 || var1 != super.F) && this.au[var1].c == -1) {
            return var1;
         }
      }

      return -1;
   }

   static int b(b3[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (var0[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   private static int b(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (var0[var1] == -1) {
            return var1;
         }
      }

      return -1;
   }

   public final void b(byte var1, byte var2, int var3, int var4, Vector var5) {
      super.b(var1, var2, var3, var4, var5);
      GameMidlet.k.O = false;
      ft.O = 0;
   }

   private static int[] c(int[] var0) {
      for(int var1 = 0; var1 < var0.length - 1; ++var1) {
         for(int var2 = var1 + 1; var2 < var0.length; ++var2) {
            int var3;
            if (var0[var2] != -1 && ((var3 = var0[var1]) > var0[var2] || var3 == true)) {
               var0[var1] = var0[var2];
               var0[var2] = var3;
            }
         }
      }

      return var0;
   }

   static b3[] c(b3[] var0) {
      for(int var1 = 0; var1 < var0.length - 1; ++var1) {
         for(int var2 = var1 + 1; var2 < var0.length; ++var2) {
            b3 var3;
            if (var0[var2].c != -1 && ((var3 = var0[var1]).c > var0[var2].c || var3.c == -1)) {
               var0[var1] = var0[var2];
               var0[var2] = var3;
            }
         }
      }

      return var0;
   }

   private static boolean d(int[] var0) {
      var0 = c(var0);
      int var1 = 0;

      for(int var2 = 0; var2 < var0.length - 1 && var0[var2 + 1] != -1; ++var2) {
         if (var0[var2] - var0[var2 + 1] == 0 || var0[var2 + 1] / 4 - var0[var2] / 4 != 1 || var0[var2] % 4 - var0[var2 + 1] % 4 != 0) {
            return false;
         }

         ++var1;
      }

      return var1 > 1;
   }

   private static boolean e(int[] var0) {
      var0 = c(var0);
      int var1 = 0;

      for(int var2 = 0; var2 < var0.length - 1 && var0[var2 + 1] != -1; ++var2) {
         if (var0[var2] / 4 - var0[var2 + 1] / 4 != 0 || var0[var2] - var0[var2 + 1] == 0) {
            return false;
         }

         ++var1;
      }

      return var1 > 1;
   }

   public final void b(int var1, int var2, int var3, int[][] var4, int[][] var5, int var6) {
      this.v();
      ft.B = true;
      ft.M = (long)k4.j();

      for(int var7 = 0; var7 < var4.length; ++var7) {
         for(int var8 = 0; var8 < var5[var7].length; ++var8) {
            if (var4[var7][var8] != -1) {
               this.ak[var7][var8] = new b3((byte)var4[var7][var8], true);
            }
         }
      }

      this.ax = var5;
      ft.N = var1;
      super.E = var2;
      this.aG = var3;
      this.aI = var6;
      ft.A = true;

      for(int var9 = 0; var9 < 4; ++var9) {
         this.ak[ft.K][var9] = null;
      }

      for(int var10 = 0; var10 < 3; ++var10) {
         this.ax[ft.K][var10] = -1;
      }

      for(int var11 = 0; var11 < this.aw.length; ++var11) {
         this.aw[ft.K][var11] = -1;
      }

      for(int var12 = 0; var12 < this.aA.length; ++var12) {
         this.aA[ft.K][var12] = -1;
      }

      this.t();
      e8.f();
      if (k4.M && (a0 = (k4.o - ft.R / 2) / 10) > ft.R / 3 << 1) {
         a0 = ft.R / 3 << 1;
      }
   }

   private static char[] d(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
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
               var10005 = 99;
               break;
            case 1:
               var10005 = 24;
               break;
            case 2:
               var10005 = 75;
               break;
            case 3:
               var10005 = 92;
               break;
            case 4:
               var10005 = 62;
               break;
            case 5:
               var10005 = 90;
               break;
            default:
               var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
