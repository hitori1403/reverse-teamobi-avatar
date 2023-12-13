import javax.microedition.lcdui.Graphics;

public final class de {
   private static int a = 10;
   private int b = 1;
   public byte c = 9;
   public i3 d;
   cn[] e;
   cn[] f;
   private cn[] g;
   private int h = 0;
   int i = a;
   private int j = -8;
   int k = 0;
   int l = -1;
   private int m = 25;
   int n = -1;
   private int o;
   boolean p = false;
   boolean q = false;
   boolean r = false;
   private boolean s = false;
   private cn[] t;
   private cn u;
   private cn v;
   private cn w;
   public static int[] x = new int[]{12577266, 10341591};
   private int y = 0;
   private int z = 0;
   private int A = 0;

   public de() {
      this.c = (byte)(7 + b2.e(4));
      this.t = new cn[2];

      for(int var1 = 0; var1 < 2; ++var1) {
         this.t[var1] = new cn(-10, 0, var1 * 15);
      }

      this.g = new cn[2];
      this.g[0] = new cn();
      this.g[1] = new cn();
      this.e = new cn[this.c];
      this.f = new cn[this.c];

      for(int var2 = 0; var2 < this.c; ++var2) {
         this.e[var2] = new cn();
         this.f[var2] = new cn();
      }

      this.u = new cn(0, 0, -1);
      this.v = new cn(0, 0, -1);
      this.w = new cn();
   }

   public final void b() {
      this.h = 0;
      this.k = 0;
      this.j = -(10 + b2.e(4));
      this.l = -1;
      this.p = false;
      this.q = false;
      this.s = false;
   }

   public final void b(i3 var1) {
      this.d = var1;
      if (var1.s == 0) {
         this.b = 1;
      } else {
         this.b = -1;
      }

      this.b();
      this.l = 0;
      this.n = 0;
      Object var4;
      if ((var4 = f5.b(var1.E, 70)).a >= 0) {
         var4 = f5.b(var4.a);
      }

      var4 = var4;
      hp var5 = f5.d[var4.j[3]];
      hp var6 = f5.d[var4.j[14]];
      int var7 = var1.a;
      int var3 = var1.b + var1.H;
      this.g[0].b = var7 + var4.k[3] * ev.a + var5.f * ev.a;
      this.g[0].c = var3 + var4.l[3] * ev.a - 5 * (ev.a - 1);
      this.g[1].b = var7 + var4.k[14] * ev.a + var6.f * ev.a;
      this.g[1].c = var3 + var4.l[14] * ev.a - 5 * (ev.a - 1);
      this.u.d = -1;
      if (var1.f == GameMidlet.k.f) {
         AutoController.h();
         AutoController.b((byte)13);
      }
   }

   public final void c() {
      ++this.h;
      this.i = a;

      for(int var1 = 0; var1 < this.c; ++var1) {
         this.e[var1].b = this.g[1].b;
         this.e[var1].c = this.g[1].c;
      }
   }

   public final void b(int var1) {
      this.e[0].b = this.g[var1].b;
      this.e[0].c = this.g[var1].c;
      if (var1 == 1) {
         this.d.q = 13;
      } else {
         this.d.q = 2;
      }
   }

   public final void d() {
      if (this.d != null) {
         ++this.A;
         if (this.A >= 6) {
            this.A = 0;
         }

         de var1 = this;
         if (this.h != 0) {
            if (this.k == 1) {
               for(int var2 = 1; var2 < var1.c - 2; ++var2) {
                  var1.e[var2].c += 6;
               }

               label275: {
                  de var12 = var1;
                  if (var1.s && var1.n > 0) {
                     ++var1.y;
                     if (var1.y < 2) {
                        int var18 = 1;

                        while(true) {
                           if (var18 >= var12.c) {
                              break label275;
                           }

                           var12.e[var18].b -= 6;
                           ++var18;
                        }
                     }

                     if (var1.y > 4 && var1.y < 8) {
                        int var3 = 1;

                        while(true) {
                           if (var3 >= var12.c) {
                              break label275;
                           }

                           var12.e[var3].b += 6;
                           ++var3;
                        }
                     }

                     if (var1.y <= 14) {
                        break label275;
                     }

                     --var1.z;
                     if (var1.z >= 0) {
                        break label275;
                     }

                     var1.y = 0;
                  }

                  var1.z = b2.e(20);
               }

               if (var1.i == a) {
                  var1.i = 7;
               }
            }

            boolean var13 = false;
            int var19 = var1.c - 1;
            byte var4 = 1;
            if (var1.q) {
               var4 = 0;
            }

            for(int var5 = 1; var5 < var1.c - var1.k * var4; ++var5) {
               int var6;
               if ((var6 = b2.b(var1.e[var5].b, var1.e[var5].c, var1.e[var5 - 1].b, var1.e[var5 - 1].c)) > var1.i + 1) {
                  var13 = true;
                  int var7 = var6 - var1.i;
                  var6 = b2.b(var1.e[var5 - 1].b - var1.e[var5].b, -(var1.e[var5 - 1].c - var1.e[var5].c));
                  int var8 = var7 * b2.c(b2.d(var6)) >> 10;
                  var6 = -(var7 * b2.b(b2.d(var6))) >> 10;
                  var1.e[var5].b += var8;
                  var1.e[var5].c += var6;
               }
            }

            if (var1.e[var19].c < var1.d.b + var1.d.H + 5) {
               var1.e[var19].b += 10;
               var1.e[var19].c += var1.j;
               ++var1.j;
            }

            if (!var1.q) {
               for(int var23 = var19 - 1; var23 > 0; --var23) {
                  int var27;
                  if ((var27 = b2.b(var1.e[var23].b, var1.e[var23].c, var1.e[var23 + 1].b, var1.e[var23 + 1].c)) > var1.i + 1) {
                     var13 = true;
                     int var30 = b2.b(var1.e[var23 + 1].b - var1.e[var23].b, -(var1.e[var23 + 1].c - var1.e[var23].c));
                     int var28;
                     int var31 = (var28 = var27 - var1.i) * b2.c(b2.d(var30)) >> 10;
                     var27 = -(var28 * b2.b(b2.d(var30))) >> 10;
                     var1.e[var23].b += var31;
                     var1.e[var23].c += var27;
                  }
               }
            }

            if (!var13) {
               var1.k = 1;
            }
         }

         if (this.l != -1) {
            ++this.l;
            if (k4.n % 4 == 2) {
               if (this.d.q == 2) {
                  this.d.q = 13;
                  if (this.l > 16) {
                     this.c();
                     this.l = -1;
                  }
               } else {
                  this.d.q = 2;
               }
            }
         }

         var1 = this;
         if (this.p) {
            if (this.i > 4 && k4.n % 6 == 3) {
               --this.i;
            }

            if (!this.q && k4.n % 6 == 3 && this.d != GameMidlet.k) {
               if (this.d.q == 2) {
                  this.b(1);
               } else {
                  this.b(0);
               }
            }

            if (this.q && this.i <= 4) {
               this.i = 2;
               int var14 = 0;
               if (!this.s) {
                  for(int var20 = 0; var20 < var1.c - 1; ++var20) {
                     cn var10000 = var1.e[var20];
                     int var24 = var1.e[var20 + 1].b;
                     cn var22 = var10000;
                     if (b2.f(var24 - var22.b) > 1) {
                        ++var14;
                     }
                  }
               }

               if (var14 == 0 && !var1.s) {
                  var1.u.d = -2;
                  var1.s = true;
               }
            }
         }

         if (this.r && (this.d.q == 2 || this.d.q == 13)) {
            this.b(this.d);
            this.r = false;
         }

         if (this.k != 0) {
            var1 = this;

            for(int var15 = 0; var15 < 2; ++var15) {
               if (var1.t[var15].d == 0 || var1.t[var15].b == -10) {
                  var1.t[var15].b = var1.f[var1.c - 2].b;
                  var1.t[var15].c = var1.f[var1.c - 2].c;
               }

               if (var1.p) {
                  var1.t[var15].d += 2;
               } else {
                  ++var1.t[var15].d;
               }

               if (var1.t[var15].d > var1.m + (var1.p ? 10 : 0)) {
                  var1.t[var15].d = 0;
               }
            }
         }

         if (!this.q && this.k == 1) {
            if (this.u.d == -1) {
               this.u.b = this.v.b = this.w.b = this.e[this.c - 1].b;
               this.u.c = this.v.c = this.w.c = this.e[this.c - 1].c;
               this.u.d = 0;
               this.o = -1;
            }

            int var16 = this.w.b - this.v.b;
            int var21 = this.w.c - this.v.c;
            if (this.o > 0) {
               --this.o;
            }

            if ((this.o <= 0 || this.p) && k4.n % 2 == 1) {
               if (b2.f(var16) > 0) {
                  if (var16 > 0) {
                     --this.w.b;
                  } else {
                     ++this.w.b;
                  }

                  this.e[this.c - 1].b = this.w.b;
               }

               if (b2.f(var21) > 0) {
                  if (var21 > 0) {
                     --this.w.c;
                  } else {
                     ++this.w.c;
                  }

                  this.e[this.c - 1].c = this.w.c;
               }
            }

            if (b2.f(var16) <= 0 && b2.f(var21) <= 0) {
               this.o = 50 + b2.e(100);
               this.v.b = this.u.b + 10 - b2.e(20);
               this.v.c = this.u.c + b2.e(6);
            }
         }

         if (this.d.s == 0) {
            this.b = 1;
         } else {
            this.b = -1;
         }

         for(int var11 = 0; var11 < this.c; ++var11) {
            int var17 = this.e[var11].b - this.d.a;
            if (var11 != this.c - 2 || b2.f(this.f[var11].b - (this.d.a + this.b * var17)) > 1) {
               this.f[var11].b = this.d.a * ev.a + this.b * var17;
            }

            this.f[var11].c = this.e[var11].c;
         }
      }
   }

   public final void b(Graphics var1) {
      if (!this.r && this.l == -1) {
         if (ev.a > 1) {
            var1.translate(0, this.d.b);
         }

         if (this.k != 0 && !this.q && this.t[0].b > 0 && this.t[0].b > cl.b().c && this.t[0].b < cl.b().c + k4.o) {
            var1.setColor(x[gx.k]);

            for(int var2 = 0; var2 < 2; ++var2) {
               var1.drawRoundRect(
                  this.t[var2].b - this.t[var2].d / 2, this.t[var2].c - this.t[var2].d / 4, this.t[var2].d, this.t[var2].d / 2, this.t[var2].d, this.t[var2].d
               );
            }
         }

         var1.setColor(8685448);
         if (this.f[0].b > cl.b().c && this.f[0].b < cl.b().c + k4.o || this.f[this.c - 1].b > cl.b().c && this.f[this.c - 1].b < cl.b().c + k4.o) {
            jx var3;
            for(var3 = 0; !(var3 >= this.c - 1 - this.k); ++var3) {
               if (this.f[var3 + 1].c < this.d.b + this.d.H + 20) {
                  var1.drawLine(this.f[var3].b, this.f[var3].c, this.f[var3 + 1].b, this.f[var3 + 1].c);
               }
            }

            if (this.k == 0 && this.f[this.c - 1].c < this.d.b + this.d.H + 10) {
               ib.b(this.f[this.c - 1].b, this.f[this.c - 1].c, 2, 2, 0, var1);
            }

            var1.drawImage(fs.g().D, this.f[this.c - 2].b, this.f[this.c - 2].c, 3);
            if (this.q && this.n > 0) {
               int var10001 = 0 + this.A / 3;
               int var10002 = this.f[this.c - 2].b + 2;
               int var10003 = this.f[this.c - 2].c + 4;
               fs.g().E.b(var10001, var10002, var10003, 0, 24, var1);
               if (k4.n % 10 > 5 && (var3 = (jx)f5.b((short)this.n)) != null) {
                  var3.a(var1, this.d.a * ev.a, this.d.b - 55 * ev.a, 3);
               }
            }
         }

         if (ev.a > 1) {
            var1.translate(0, -this.d.b);
         }
      }
   }
}
