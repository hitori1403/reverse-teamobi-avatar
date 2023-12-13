import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class i3 extends it {
   private byte z;
   public int[] A = new int[]{0, -1, 0, 0};
   public int B;
   public String C = "";
   public byte D;
   public Vector E;
   public Vector F;
   public Vector G = new Vector();
   public byte H;
   public int I;
   public int J;
   public int K;
   public String L;
   public String M;
   public int N;
   public boolean O;
   public boolean P = false;
   public byte Q = -1;
   private byte R;
   public byte S;
   public byte T;
   public byte U;
   public short V;
   public short W;
   private boolean X = false;
   private boolean Y = false;
   public int Z = 0;
   public int aa = -1;
   private int ab = 0;
   public short ac = 4;
   public short ad = 0;
   public short ae;
   private short af;
   private short ag;
   public short ah = -1;
   public short ai;
   public short aj = -1;
   public short ak;
   public short al = 0;
   public short am = -1;
   public short an = -1;
   private int ao = 0;
   public byte ap = -1;
   public boolean aq;
   public static g_ ar;
   public byte as = 0;
   public byte at = -1;
   public short au = 1000;
   public short av = 300;
   public short aw = 0;
   public short ax = 0;
   public short ay = 1000;
   public short az = 1000;
   public short aA;
   private short aB;
   public i3 aC;
   public static g_ aD;
   public static g_ aE;
   private byte aF = 0;
   private hh aG;
   public String[] aH;
   private int aI;
   private static byte[][] aJ;
   private static byte[] aK;
   public short aL = 0;
   public boolean[][] aM;
   private short[] aN;
   private short[] aO;
   private short[] aP;
   public int aQ = 0;
   public cn aR;
   public boolean aS;
   public boolean aT;
   public boolean aU;
   public boolean enableAutoFish;
   public int[] aW;
   private static final String[] bb;
   // [xu,     , updateMoney: ,    , luong, luong, ..]

   static {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "w\n\u0004/_Em\rz\u000f\u0001,2l]`\u0011\u00004|)\u0003/_E\u0005c\n\n#!";
      int var4 = "w\n\u0004/_Em\rz\u000f\u0001,2l]`\u0011\u00004|)\u0003/_E\u0005c\n\n#!".length();
      char var1 = 2;
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
                     bb = var5;
                     aJ = new byte[][]{
                        {0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0, 2, 2, 2, 2, 2},
                        {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
                        {5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                        {6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                        {7, 7, 7, 7, 7, 7, 7, 7, 7, 7},
                        {8, 8, 8, 8, 8, 8, 8, 8, 8, 8},
                        {9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
                        {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                        {11, 11, 11, 11, 11, 11, 11, 11, 11, 11},
                        {12, 12, 12, 12, 12, 12, 12, 12, 12, 12},
                        {13, 13, 13, 13, 13, 13, 13, 13, -2, 13},
                        {14, 14, 14, 14, 14, 14, 14, 14, 14, 14},
                        {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}
                     };
                     aK = new byte[]{-3, 0, 1};
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

                  var2 = "c\n\n#!\u0002!Q";
                  var4 = "c\n\n#!\u0002!Q".length();
                  var1 = 5;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public i3() {
      super.d = 0;
      super.e = 42;
      new b2();
      this.z = (byte)b2.e(9);
      new b2();
      this.R = (byte)(b2.e(30) + 10);
   }

   public final void b(int var1) {
      this.A[0] = var1;
      this.C = k4.e(this.A[0]) + hq.U;
   }

   public final int c() {
      AutoController.h();
      return AutoController.W ? this.A[3] : this.A[0];
   }

   public final void c(int var1) {
      AutoController.h();
      if (AutoController.W) {
         this.A[3] = var1;
      } else {
         this.A[0] = var1;
      }
   }

   public final void d(int var1) {
      this.A[2] = var1;
   }

   public final void b(Graphics var1) {
      if ((super.a + 15) * ik.c >= cl.b().c && (super.a - 15) * ik.c <= cl.b().c + k4.o && !super.t && (k4.ah <= 0 || k4.u != e_.g())) {
         if (super.q != 14) {
            var1.drawImage(gx.w, (super.a + (super.s == it.r ? 2 : -2)) * ik.c, (super.b - 1) * ik.c, 3);
         }

         int var2 = this.E.size();
         boolean var3 = false;

         for(int var4 = 0; var4 < var2; ++var4) {
            jv var5;
            if ((var5 = f5.b(((gl)this.E.elementAt(var4)).b)) != null && (super.q != 14 || var5.e == 30 || var5.e == 40 || var5.e == 50)) {
               if (var5.e == 40) {
                  if (this.ac != 4) {
                     var5 = f5.b(this.ac);
                  } else if ((this.ac == 4 || this.ac == 6) && this.ag < 1 + this.D) {
                     var3 = true;
                  }
               }

               if (gx.b != 24 && gx.b != 53 || f5.d(var5.e) || var5.e == 52) {
                  var5.b(var1, super.h, super.a * ik.c, (super.b + super.k + this.H + super.v) * ik.c, super.s);
                  if (var3) {
                     var3 = false;
                     var5 = f5.b((short)606);
                     if (gx.b != 24 && gx.b != 53 || f5.d(var5.e) || var5.e == 52) {
                        var5.b(var1, super.h, super.a * ik.c, (super.b + super.k + this.H + super.v) * ik.c, super.s);
                     }
                  }
               }
            }
         }

         if ((fa.g().D[0] == 0 || this == gx.u) && gx.b != 24) {
            this.b(var1, super.a * ik.c, (super.b + super.v) * ik.c - ev.k);
         }

         if (this.aG != null) {
            Graphics var9 = var1;
            hh var6 = this.aG;

            for(int var7 = 0; var7 < 3; ++var7) {
               aE.b(var6.f[var7] / 3, (var6.b + var6.d[var7]) * ev.a, (var6.c + var6.e[var7]) * ev.a, 0, 3, var9);
            }
         }

         if (this.aF > 0 && this.Z == -2) {
            aD.b(k4.n % 6 >= 3 ? 0 : 1, super.a * ik.c, super.b * ik.c - super.e / 2, 0, 3, var1);
         }

         super.b(var1);
      }
   }

   public final void b(Graphics var1, int var2, int var3, boolean var4) {
      var1.drawImage(gx.w, var2 + (super.s == it.r ? 2 : -2), var3 - 1, 3);
      if (this.E != null) {
         int var5 = this.E.size();

         for(int var6 = 0; var6 < var5; ++var6) {
            jv var7;
            if ((var7 = f5.b(((gl)this.E.elementAt(var6)).b)) != null) {
               if (var7.e == 40 && this.ac != 4) {
                  var7 = f5.b(this.ac);
               }

               var7.b(var1, super.h, var2, var3, super.s);
            }
         }
      }

      if (var4) {
         this.b(var1, var2, var3 - ev.k);
      }

      super.b(var1);
   }

   public final void b(Graphics var1, int var2, int var3) {
      byte var4 = 0;
      var3 = var3 - super.e * ik.c + (super.k + this.H) * ik.c;
      if (this.aj != -1) {
         var4 = 7;
         f5.b(var1, this.aj, var2 + aK[super.s] * ik.c - this.af / 2, var3 + ev.k / 2, 3);
      }

      var2 += (aK[super.s] + var4) * ik.c;
      if (this.am != -1) {
         f5.b(var1, this.am, var2 + this.af / 2 + 6 * ik.c, var3 + ev.k / 2, 3);
      }

      if (this.ap != -1) {
         ar.b(this.ap, var2 + this.af / 2 + 7 * ik.c, var3 + 3, 0, 3, var1);
      }

      if (super.f == GameMidlet.k.f) {
         k4.X.b(var1, super.g, var2, var3, 2);
      } else {
         k4.Y.b(var1, super.g, var2, var3, 2);
      }
   }

   public final void e(int var1) {
      this.N = var1;
      int var2 = 1;

      while(true) {
         int var3 = var2 * 100;
         int var4 = var1;
         if ((var1 -= var3) < 0) {
            this.W = (byte)var2;
            this.S = (byte)(var4 * 100 / (var2 * 100));
            return;
         }

         ++var2;
      }
   }

   public final void b(gl var1) {
      if (this.E == null) {
         this.E = new Vector();
      }

      this.E.addElement(var1);
   }

   public final void b(String var1) {
      super.g = var1;
      if (var1.length() > 7) {
         this.L = var1.substring(0, 6) + bb[6];
      } else {
         this.L = var1;
      }

      this.af = (short)k4.X.b(var1);
   }

   public final void f(int var1) {
      this.ac = (short)var1;
   }

   public final void a() {
      if (this.aG != null) {
         hh var2 = this.aG;

         for(int var1 = 0; var1 < 3; ++var1) {
            var2.e[var1]--;
            if (var2.e[var1] < -60) {
               var2.e[var1] = 0;
               var2.h[var1] = 6;
            }

            ++var2.f[var1];
            if (var2.f[var1] == 6) {
               var2.f[var1] = 0;
            }

            int[] var3 = var2.d;
            var2.d[var1] += var2.g[var1] << 1;
            if (var2.g[var1] == 1) {
               int var10000 = var2.d[var1];
               new b2();
               if (var10000 > 10 - b2.f(var2.e[var1] / 10)) {
                  var2.g[var1] = -1;
                  if (var2.h[var1] > 0) {
                     --var2.h[var1];
                  }
               }
            } else {
               int var8 = var2.d[var1];
               new b2();
               if (var8 < -(10 - b2.f(var2.e[var1] / 10))) {
                  var2.g[var1] = 1;
               }

               if (var2.h[var1] > 0) {
                  --var2.h[var1];
               }
            }
         }
      }

      if (this.X && k4.n % 20 == 10) {
         this.i();
      }

      label104:
      if (this.P) {
         AutoController.h();
         if (AutoController.V) {
            int var9 = super.f;
            AutoController.h();
            if (var9 == AutoController.al) {
               break label104;
            }

            var9 = super.f;
            AutoController.h();
            if (var9 == AutoController.am) {
               break label104;
            }
         }

         if (this.G.size() == 0 && super.a == super.l && super.b == super.m) {
            gx.d(this);
            AutoController.h();
            if (AutoController.J != null) {
               AutoController.h();
               if (AutoController.J.f == super.f) {
                  AutoController.h();
                  AutoController.J = null;
                  gx.u = null;
               }
            }
         }
      }

      if (super.l == super.a && super.m == super.b && this.aQ >= 0) {
         --this.aQ;
         if (this.aQ < 0) {
            this.aQ = -1;
            this.Y = false;
            this.Z = 0;
            if (this == GameMidlet.k) {
               gx.L = -1;
            }
         } else {
            int var4 = (this.aP[this.aQ] & 255) * gx.j + gx.j / 2;
            int var6 = (this.aP[this.aQ] >> 8) * gx.j + gx.j / 2;
            if (this.aQ == 1) {
               GameMidlet.k.Y = true;
               var4 = this.aR.b / ev.a;
               var6 = this.aR.c / ev.a;
               this.aQ = 0;
            }

            if (this != GameMidlet.k) {
               super.q = 1;
               this.a(var4, var6);
            } else if (this.f(var4 - super.a, var6 - super.b) || this.g(var4 - super.a, var6 - super.b)) {
               this.aQ = 0;
               this.m();
               this.Y = false;
            } else if (!gx.d(gx.f(var4, var6))) {
               super.q = 1;
               this.a(var4, var6);
            }
         }
      }

      this.d();
      if (this.F != null) {
         for(int var7 = 0; var7 < this.F.size(); ++var7) {
            b7 var5;
            if ((var5 = (b7)this.F.elementAt(var7)).c == this.aL) {
               this.aL = 0;
               this.ac = var5.b;
               this.F.removeElement(var5);
               break;
            }
         }

         ++this.aL;
      }
   }

   public final void g(int var1) {
      if (var1 < 0) {
         super.h = aJ[0][this.z];
      } else {
         super.h = aJ[var1][this.z];
      }
   }

   public final void d() {
      if (this.ag <= 0) {
         kp.b();
         this.ag = (short)(10 + b2.e(70) / (this.D + 1));
      }

      --this.ag;
      ++this.z;
      if (this.z >= 10) {
         this.z = 0;
      }

      if (super.q < 0) {
         super.h = aJ[0][this.z];
      } else if (super.q < aJ.length) {
         super.h = aJ[super.q][this.z];
      }

      int var1;
      if (this.ad != 0 || this.ac == 11 || this.ac == 7 || this.ac == 9) {
         if (this.ad == 0) {
            this.ae = this.ac;
         }

         ++this.ad;
         if (this.ad % 10 > 5) {
            if (this.ad > 45) {
               this.ad = 0;
            }

            this.ac = 4;
         } else {
            var1 = this.ae;
            this.ac = (short)var1;
         }
      }

      if ((this != GameMidlet.k || this.Z != 0 || k4.u == ft.z) && super.q != 10) {
         kp.b();
         if (b2.b(super.a, super.b + super.v, super.l, super.m) <= super.p) {
            if (super.u && this.aB == 0) {
               this.aB = 0;
               super.u = false;
               super.v = 0;
            }

            if (this.aC != null && this.aF == 0) {
               if (this.Z == -2) {
                  this.aF = 20;
               } else if (this.Z == 11) {
                  this.aF = 30;
                  this.ac = 107;
                  this.aC.ac = 107;
                  this.aG = new hh(super.a, super.b);
               }
            }

            if (this.Z == -5) {
               this.U = super.s;
               super.a = super.l;
               super.b = super.m;
               if (this.aQ <= 0) {
                  this.Z = 0;
               }

               if (k4.y == null) {
                  kp.c();
                  kp.c();
                  AutoController.b(super.a, super.b, super.s, super.v);
               }

               kp.c();
               if (AutoController.V && GameMidlet.k.f == super.f) {
                  super.s = 0;
               }
            } else {
               if (super.f != GameMidlet.k.f) {
                  super.l = super.a;
                  super.m = super.b + super.v;
               }

               if (this.G.size() == 0) {
                  if (super.q == 1) {
                     super.q = 0;
                  }

                  super.s = this.U;
               } else {
                  cn var2 = (cn)this.G.elementAt(0);
                  this.a(var2.b, var2.c + var2.e);
                  this.aB = var2.e;
                  if (var2.e != 0) {
                     super.u = true;
                  }

                  if (super.l == -1 && super.m == -1) {
                     super.l = super.a;
                     super.m = super.b + super.v;
                     if (super.q == 14) {
                        gx.h[super.b / gx.j * gx.f + super.a / gx.j] = 112;
                     }

                     super.q = (byte)var2.d;
                     if (super.q == 14) {
                        super.b = super.m;
                        super.a = super.l;
                        gx.h[super.b / gx.j * gx.f + super.a / gx.j] = 90;
                     }

                     if ((super.q == 2 || super.q == 13 || super.q == 4) && (var1 = (super.b - gx.j) / gx.j * gx.f + super.a / gx.j) >= 0 && var1 < gx.h.length
                        )
                      {
                        if (super.q == 4 && gx.h[var1] == 67) {
                           this.H = -10;
                        }

                        int var3 = gx.g(super.a, super.b - 10);
                        super.m = super.b;
                        if (var3 != -1) {
                           short var4;
                           if ((var4 = gx.h[var3]) == 92) {
                              this.H = -10;
                           }

                           if (var4 == 79 || var4 == 92 || var4 == 90 || var4 == 54) {
                              gx.h[var3] = 90;
                           }
                        }
                     }
                  } else {
                     this.U = (byte)var2.d;
                     super.s = this.U;
                  }

                  this.G.removeElementAt(0);
               }
            }

            if (this.Z != 0 && this.Z != -5) {
               if (super.f == this.J && gx.l(this.I) == null) {
                  this.Z = 0;
                  this.I = -1;
               } else if (this.I != -1 && this.J != -1) {
                  i3 var7 = gx.l(this.I);
                  i3 var9;
                  if ((var9 = gx.l(this.J)) != null && var7 != null) {
                     if (var9.a > var7.a) {
                        var9.s = var9.U = it.r;
                        var7.s = var7.U = 0;
                     } else {
                        var9.s = var9.U = 0;
                        var7.s = var7.U = it.r;
                     }

                     if (super.f == this.I) {
                        if (this.ak > 0) {
                           --this.ak;
                        } else {
                           switch(this.Z) {
                              case -3:
                                 if (gx.l == -1) {
                                    g0 var5 = new g0(2, 0);
                                    k4.E.addElement(var5);
                                 }

                                 this.Z = 0;
                                 var9.Z = 0;
                                 break;
                              case 9:
                                 if (this == GameMidlet.k) {
                                    kp.c();
                                    kp.c();
                                    AutoController.b((byte)9);
                                 } else if (GameMidlet.k.Z == 8 && super.f == GameMidlet.k.I) {
                                    kp.c();
                                    kp.c();
                                    AutoController.b((byte)8);
                                    GameMidlet.k.Z = 0;
                                 }

                                 kp.c();
                                 kp.c();
                                 AutoController.d(var9);
                                 this.Z = 0;
                                 var9.Z = 0;
                                 break;
                              case 12:
                                 var9.Z = 0;
                                 this.Z = 0;
                           }

                           this.K = -1;
                           this.I = -1;
                           this.J = -1;
                        }
                     }
                  } else {
                     if (var7 != null) {
                        var7.Z = 0;
                        var7.t = false;
                     }

                     if (var9 != null) {
                        var9.Z = 0;
                        var9.t = false;
                     }
                  }
               }
            }
         } else {
            kp.b();
            this.ao = b2.b(super.l - super.a, -(super.m - (super.b + super.v)));
            int var10000 = super.p;
            kp.b();
            int var8 = var10000 * b2.c(this.ao) >> 10;
            var10000 = super.p;
            kp.b();
            var1 = -(var10000 * b2.b(this.ao)) >> 10;
            if (this.Y && this.Z == -5 && GameMidlet.k.h(super.a + var8, super.b + super.v + var1)) {
               this.m();
               super.n = super.o = 0;
            } else {
               super.n = var8;
               super.o = var1;
               super.j = 0;
               super.k = 0;
               this.H = 0;
               this.h(super.a + var8);
               if (super.a != super.l) {
                  this.f();
               }

               if (super.b + super.v != super.m) {
                  this.f();
               }

               super.q = 1;
            }
         }
      }

      if (super.u) {
         super.a += super.n;
         super.v = (short)(super.v + super.o);
         if (super.f == GameMidlet.k.f && super.v < -this.al) {
            super.v = (short)(-this.al);
         }
      } else {
         super.a += super.n;
         super.b += super.o;
      }

      super.k += super.j;
      if (super.q == 10) {
         ++super.j;
      }

      if (Math.abs(super.j) >= super.i || Math.abs(super.k) > 28) {
         super.q = 0;
         super.j = 0;
         super.k = 0;
      }

      if (this.aa != -1 && super.q == 0) {
         ++this.aa;
         if (this.aa > this.R) {
            this.aa = -1;
         } else if (this.aa % 6 == 0) {
            this.h();
         }
      }

      if (super.q == 0) {
         this.H = 0;
      }

      if (super.q == 1 && super.n == 0 && super.o == 0) {
         super.q = 0;
      }

      super.n = 0;
      super.o = 0;
      if (this.aF > 0) {
         --this.aF;
         if (this.aF == 0) {
            if (this.Z == -2) {
               this.aC.q = 4;
               this.aC.ac = 20;
               super.q = 4;
               this.ac = 20;
            } else if (this.Z == 11) {
               this.ac = 12;
               this.aC.ac = 12;
            }

            this.Z = 0;
            this.aC.Z = 0;
            this.aC = null;
            this.aG = null;
         }
      }

      if (this.aH != null) {
         super.w = new dq(100, this.aH[this.aI / 40], (byte)(this.I >= 2000000000 ? 1 : 0));
         ++this.aI;
         if (this.aI >= this.aH.length * 40) {
            if (super.f >= 2000000000) {
               this.aI = 0;
            } else {
               this.aH = null;
            }
         }
      }

      super.a();
   }

   public final void e() {
      if (super.q != -1 && !super.t && this.Z == 0) {
         AutoController.h();
         if (!AutoController.V) {
            super.n = 0;
            super.o = 0;
            if (k4.f[2]) {
               cl.b().i = 0L;
               this.aa = -1;
               this.g();
               if (super.u) {
                  super.o = -super.p;
               } else if (this.g(super.n, -(super.p - 1))) {
                  if (!this.f(super.n, -(super.p - 1))) {
                     this.h(super.a + super.n, super.b - (super.p - 1));
                  } else {
                     super.n = 0;
                     super.o = 0;
                  }
               }
            } else if (k4.f[8]) {
               cl.b().i = 0L;
               this.aa = -1;
               this.f();
               this.e(0, 1);
               if (super.u) {
                  super.o = super.p;
                  if (super.v + super.p >= 0) {
                     super.v = 0;
                     if (gx.f(super.a, super.b + gx.j / 2) == 80) {
                        super.u = false;
                     } else {
                        super.o = 0;
                     }
                  }
               } else if (!this.f(super.n, super.p - 1)) {
                  this.g(super.n, super.p - 1);
               } else {
                  super.n = 0;
                  super.o = 0;
               }
            }

            if (k4.f[4]) {
               cl.b().i = 0L;
               this.aa = -1;
               if (this.ab == 0 && super.s == it.r) {
                  this.ab = 3;
               }

               super.s = it.r;
               if (this.ab > 2) {
                  if (super.u) {
                     super.n = -super.p;
                  } else if (!this.f(-(super.p + 8), super.o)) {
                     this.g(-(super.p + 8), super.o);
                     this.e(-1, 0);
                  } else {
                     super.n = 0;
                     super.o = 0;
                  }
               }

               ++this.ab;
            } else if (k4.f[6]) {
               cl.b().i = 0L;
               this.aa = -1;
               if (this.ab == 0 && super.s == 0) {
                  this.ab = 3;
               }

               super.s = 0;
               if (this.ab > 2) {
                  if (super.u) {
                     super.n = super.p;
                  } else if (!this.f(super.p + 6, super.o)) {
                     this.g(super.p + 6, super.o);
                     this.e(1, 0);
                  } else {
                     super.n = 0;
                     super.o = 0;
                  }
               }

               ++this.ab;
            } else {
               this.ab = 0;
            }

            boolean var1 = false;
            if (k4.d[2]) {
               if (k4.f[4] || k4.f[6] || k4.f[8]) {
                  var1 = true;
               }
            } else if (k4.d[4]) {
               if (k4.f[2] || k4.f[6] || k4.f[8]) {
                  var1 = true;
               }
            } else if (k4.d[6]) {
               if (k4.f[4] || k4.f[2] || k4.f[8]) {
                  var1 = true;
               }
            } else if (k4.d[8] && (k4.f[4] || k4.f[6] || k4.f[2])) {
               var1 = true;
            }

            if (k4.e[2] || k4.e[4] || k4.e[6] || k4.e[8]) {
               var1 = true;
               k4.g();
            }

            if (var1 && super.q != 2 && super.q != 13 && super.q != 4 && !k4.e[2]) {
               AutoController.h();
               AutoController.h();
               AutoController.b(super.a, super.b, super.s, super.v);
            }

            if (super.n == 0 && super.o == 0 && super.q == 1) {
               super.q = 0;
            }

            if (super.u && (super.n != 0 || super.o != 0)) {
               super.q = 1;
            }

            k4.d[2] = k4.d[4] = k4.d[6] = k4.d[8] = false;
         }
      }
   }

   public final void b(byte var1) {
      if (super.q != 10) {
         if (var1 == 2 || var1 == 13 || var1 == 4) {
            short var2;
            if ((var2 = gx.h[(super.b - 15) / gx.j * gx.f + super.a / gx.j]) == 79 || var2 == 81 || var2 == 54) {
               this.H = -6;
               if (var2 == 81) {
                  this.H = (byte)(-6 * ik.c);
               }
            } else if (var2 == 92 || var2 == 67) {
               this.H = -10;
            }

            super.q = var1;
         } else if (super.q != 14) {
            super.q = 0;
         }

         if (var1 == 10) {
            this.h();
            return;
         }

         if (super.f != GameMidlet.k.f) {
            this.G.addElement(new cn(-1, -1, var1));
            return;
         }

         super.q = var1;
      }
   }

   public final void a(int var1, int var2) {
      super.l = var1;
      super.m = var2;
      this.h(var1);
   }

   private void h(int var1) {
      if (var1 > super.a) {
         super.s = 0;
      } else {
         if (var1 < super.a) {
            super.s = it.r;
         }
      }
   }

   public final void f() {
      if (super.q != 2 && super.q != 13) {
         this.g();
      } else {
         int var1;
         if ((var1 = gx.g(super.a, super.b - 18)) != -1) {
            super.q = 0;
            this.H = 0;
            if (gx.h[var1] == 90) {
               if (gx.e[var1] == 80) {
                  gx.h[var1] = 92;
               } else if (gx.e[var1] == 97) {
                  gx.h[var1] = 54;
               } else {
                  gx.h[var1] = 79;
               }
            }
         }
      }
   }

   private void g() {
      if (super.q == 14) {
         super.q = 0;
         this.b(fg.g().W, fg.g().X);
         h4.b().d(0);
         AutoController.h();
         AutoController.h();
         AutoController.b(GameMidlet.k.a, GameMidlet.k.b, GameMidlet.k.s, GameMidlet.k.al);
         k4.f[8] = false;
      }
   }

   private void e(int var1, int var2) {
      if (super.q == 4) {
         if (gx.g(super.a, super.b - 18) == -1) {
            return;
         }

         if (gx.f(super.a + var1 * 12, super.b + var2 * 12 - 10) == 80) {
            super.q = 0;
            this.H = 0;
         }
      }
   }

   private boolean f(int var1, int var2) {
      if (this != GameMidlet.k) {
         return false;
      } else if (super.q != -1 && k4.y == null) {
         boolean var3;
         if ((var3 = k4.A.b(super.a + var1, super.b + var2)) && super.q == 1) {
            super.q = 0;
         }

         return var3;
      } else {
         return false;
      }
   }

   private boolean g(int var1, int var2) {
      boolean var3;
      if (var3 = this.c(var1, var2)) {
         this.d(var1, var2);
      }

      return var3;
   }

   public final boolean h(int var1, int var2) {
      if ((super.q == 0 || super.q == 1) && (this.Z == 0 || this.Z == -5)) {
         short var3;
         if ((var3 = gx.h[var2 / gx.j * gx.f + var1 / gx.j]) == 79 || var3 == 81 || var3 == 54) {
            this.H = -6;
            super.a = var1 / gx.j * gx.j + gx.j / 2;
            super.b = var2 / gx.j * gx.j + gx.j - 1;
            AutoController.h();
            AutoController.h();
            AutoController.b(super.a, super.b, super.s, super.v);
            this.c((byte)2);
            return true;
         } else if (var3 == 92) {
            this.H = -10;
            super.a = var1 / gx.j * gx.j + gx.j / 2;
            super.b = var2 / gx.j * gx.j + gx.j - 1;
            AutoController.h();
            AutoController.h();
            AutoController.b(super.a, var2, super.s, super.v);
            this.c((byte)2);
            return true;
         } else if (var3 == 67) {
            this.H = -10;
            super.a = var1 / gx.j * gx.j + gx.j / 2;
            AutoController.h();
            AutoController.h();
            AutoController.b(super.a, var2, super.s, super.v);
            this.c((byte)4);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void c(byte var1) {
      super.q = var1;
      AutoController.h();
      AutoController.h();
      AutoController.b(var1);
   }

   public final void h() {
      if (super.q == 0 || super.q == 1) {
         super.q = 10;
         if (this.aa == -1) {
            this.aa = 0;
         }

         super.j = (byte)(-super.i);
      }
   }

   public final void i() {
      this.X = false;

      try {
         for(int var1 = 0; var1 < this.E.size() - 1; ++var1) {
            gl var2;
            if (f5.b((var2 = (gl)this.E.elementAt(var1)).b) != null) {
               for(int var3 = var1 + 1; var3 < this.E.size(); ++var3) {
                  gl var4;
                  if (f5.b((var4 = (gl)this.E.elementAt(var3)).b).b == -1) {
                     this.X = true;
                  }

                  if (f5.b(var4.b) != null && f5.b(var2.b).e > f5.b(var4.b).e) {
                     this.E.setElementAt(var2, var3);
                     this.E.setElementAt(var4, var1);
                     var2 = var4;
                  }
               }
            }
         }
      } catch (Exception var5) {
         this.X = true;
      }
   }

   public final void i(int var1, int var2) {
      for(int var3 = 0; var3 < this.E.size() - 1; ++var3) {
         gl var4;
         jv var5 = f5.b((var4 = (gl)this.E.elementAt(var3)).b);
         if (var2 == var5.e) {
            this.E.removeElement(var4);
            break;
         }
      }

      this.b(new gl((short)var1));
   }

   public final void j() {
      for(int var1 = 0; var1 < this.E.size(); ++var1) {
         gl var2;
         if (f5.b((var2 = (gl)this.E.elementAt(var1)).b).e == -1) {
            this.E.removeElement(var2);
            this.ah = var2.b;
         }
      }
   }

   public final void k() {
      this.j();
      gx.b(this);
   }

   public final void b(short var1) {
      this.ah = var1;
      ix var2;
      if ((var2 = gx.m(super.f)) != null) {
         gx.b(var2);
         this.ah = var1;
      }

      this.k();
   }

   public final void l() {
      super.j = 0;
      super.k = 0;
      super.q = 0;
   }

   private void m() {
      this.aQ = 0;
      this.Y = false;
      this.Z = 0;
      if (this == GameMidlet.k) {
         gx.L = -1;
      } else {
         this.aR = null;
         this.aN = null;
         this.aO = null;
         this.aP = null;
         this.aM = null;
      }
   }

   public final void n() {
      if (this.aM == null) {
         this.p();
      }

      short var1 = 88;
      int var2 = gx.j * ev.a;
      if (this.aR.c / var2 * gx.f + this.aR.b / var2 > 0 && this.aR.c / var2 * gx.f + this.aR.b / var2 < gx.h.length) {
         var1 = gx.h[this.aR.c / var2 * gx.f + this.aR.b / var2];
      }

      if (this != GameMidlet.k || var1 == 80 || gx.b == 24 || gx.b((int)var1) || gx.c(var1)) {
         this.aR.d = 0;
         if (this.Z == 0 || this.Z == -5) {
            this.Z = -5;
            this.aa = -1;
            super.l = super.a;
            super.m = super.b;
            if (this == GameMidlet.k) {
               if (super.a > this.aR.b / ev.a) {
                  gx.L = it.r;
               } else {
                  gx.L = 0;
               }
            }

            this.o();
         }
      }
   }

   public final void o() {
      int var1 = gx.j * ev.a;
      if (super.a / gx.j == this.aR.b / var1 && super.b / gx.j == this.aR.c / var1) {
         this.a(this.aR.b / var1 * gx.j + this.aR.b % var1 / 2, this.aR.c / var1 * gx.j + this.aR.c % var1 / 2);
      } else {
         int var2 = super.a / gx.j;
         int var3 = super.b / gx.j;
         int var4 = this.aR.b / var1;
         var1 = this.aR.c / var1;
         var4 = var4;
         i3 var5 = this;
         int var6 = 1;
         int var7 = 0;
         int[] var8 = new int[]{0, -1, 1, 0};
         int[] var9 = new int[]{-1, 0, 0, 1};
         boolean var10 = false;

         for(int var11 = 0; var11 < var5.aM.length * var5.aM[0].length; ++var11) {
            var5.aN[var11] = 0;
            var5.aO[var11] = 0;
            var5.aP[var11] = 0;
            if (gx.h[var11] != 80 && !gx.b(gx.h[var11])) {
               var5.aM[var11 % gx.f][var11 / gx.f] = true;
            } else {
               var5.aM[var11 % gx.f][var11 / gx.f] = false;
            }
         }

         if (gx.c(gx.f(var4 * gx.j, var1 * gx.j))) {
            var5.aM[var4][var1] = false;
         }

         for(var5.aN[0] = (short)((var3 << 8) + var2); !var10 && var7 < var6; ++var7) {
            var2 = var5.aN[var7] & 255;
            var3 = var5.aN[var7] >> 8;

            for(int var12 = 0; var12 < 4 && !var10; ++var12) {
               int var19 = var2 + var8[var12];
               int var13 = var3 + var9[var12];
               if (var19 >= 0 && var19 < var5.aM.length && var13 >= 0 && var13 < var5.aM[0].length && !var5.aM[var19][var13]) {
                  var5.aO[var6] = var5.aN[var7];
                  var5.aN[var6++] = (short)((var13 << 8) + var19);
                  var5.aM[var19][var13] = true;
                  if (var4 == var19 && var1 == var13) {
                     var10 = true;
                  }
               }

               if (var6 >= var5.aM.length * var5.aM[0].length) {
                  var10 = true;
                  break;
               }
            }
         }

         var5.aQ = 0;
         if (var10) {
            GameMidlet.k.l();
            int var20 = var6 - 1;
            var5.aP[var5.aQ++] = var5.aN[var20];

            while(var20 > 0) {
               for(int var16 = 0; var16 < var6; ++var16) {
                  if (var5.aN[var16] == var5.aO[var20]) {
                     var20 = var16;
                     var5.aP[var5.aQ++] = var5.aN[var16];
                     break;
                  }
               }
            }
         }

         --var5.aQ;
         if (!var10) {
            this.aQ = 0;
            if (this == GameMidlet.k) {
               gx.L = -1;
            }
         }
      }
   }

   public final void p() {
      short var1 = gx.f;
      short var2 = gx.g;
      this.aM = new boolean[var1][var2];
      this.aN = new short[var1 * var2];
      this.aO = new short[var1 * var2];
      this.aP = new short[var1 * var2];
   }

   public final void b(int var1, int var2, int var3) {
      String[] var4 = bb;
      new StringBuffer(var4[2]).append(var1).append(var4[1]).append(var2).append(var4[3]).append(var3);
      if (this.A[0] != var1) {
         String var10000 = var1 - this.A[0] + var4[0];
         int var10001 = super.a;
         int var10002 = super.b;
         new b2();
         k4.b(var10000, var10001, var10002 - b2.e(20), 0, -1);
         this.A[0] = var1;
      }

      if (this.A[2] != var2) {
         StringBuffer var6 = new StringBuffer(String.valueOf(var2 - this.A[2]));
         var4 = bb;
         String var7 = var6.append(var4[5]).toString();
         int var9 = super.a;
         int var11 = super.b;
         new b2();
         k4.b(var7, var9, var11 - b2.e(20), 0, -1);
         this.A[2] = var2;
      }

      if (this.B != var3) {
         String var8 = var3 - this.B + bb[4];
         int var10 = super.a;
         int var12 = super.b;
         new b2();
         k4.b(var8, var10, var12 - b2.e(20), 0, -1);
         this.B = var3;
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
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
               var10005 = 15;
               break;
            case 1:
               var10005 = 127;
               break;
            case 2:
               var10005 = 101;
               break;
            case 3:
               var10005 = 77;
               break;
            case 4:
               var10005 = 70;
               break;
            case 5:
               var10005 = 9;
               break;
            default:
               var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
