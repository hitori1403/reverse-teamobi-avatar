public final class g5 {
   public int b;
   public int c;
   public int d;
   private int e;
   private int f;
   public int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   public int m;
   private int n;
   public int o;
   public int p;
   public int q;
   public static int r;
   public static int s;
   public static int t;
   public static int u;
   private int v;
   public boolean w = false;
   private boolean x = false;
   private long y;
   private long z = 0L;
   private boolean A;
   private int B = 0;
   private int C = 0;
   public int D;
   public int E;
   private int F;
   private int G;
   private int H;
   public boolean I = false;
   private boolean J = false;
   private long K = 0L;
   private long L = 0L;
   private int M;
   private int N;

   public final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.x = false;
      this.l = var1;
      this.m = var2;
      this.i = var6 / var4;
      this.h = var5 / var3;
      this.n = var9;
      this.j = var3;
      this.k = var4;
      this.e = var5;
      this.f = var8;
      this.g = var7;
      this.v = 0;
      s = 0;
      r = 0;
      this.d = var6 - this.f;
      if (this.d < 0) {
         this.d = 0;
      }

      u = 0;
      t = 0;
      this.q = var5 - this.g;
      if (this.q < 0) {
         this.q = 0;
      }

      this.w = true;
      this.z = 0L;
   }

   public final void b(int var1) {
      this.v = var1;
      this.c();
   }

   public final void b() {
      ++this.z;
      this.A = false;
      if (k4.d[8]) {
         this.v += this.h;
         if (this.v >= this.n) {
            this.v = 0;
         }
      } else if (k4.d[2]) {
         this.v -= this.h;
         if (this.v < 0) {
            this.v = this.n - 1;
         }
      } else if (k4.d[6]) {
         ++this.v;
         if (this.v >= this.n) {
            this.v = 0;
         }
      } else if (k4.d[4]) {
         --this.v;
         if (this.v < 0) {
            this.v = this.n - 1;
         }
      }

      if (k4.d[4] || k4.d[6] || k4.d[8] || k4.d[2]) {
         this.A = true;
         k4.u.b(this.v, false);
         k4.d[4] = false;
         k4.d[6] = false;
         k4.d[8] = false;
         k4.d[2] = false;
      }

      if (this.A) {
         this.c();
      }

      if (k4.w == null && k4.y == null) {
         if (this.H > 0) {
            --this.H;
            if (this.H == 0 && k4.u != fb.z) {
               k4.u.b(this.v, true);
            }
         } else {
            if (k4.i && k4.d(this.l, this.m, this.e, this.f)) {
               this.N = k4.m;
               this.M = k4.l;
               k4.i = false;
               this.y = this.z;
               this.B = r;
               this.C = t;
               this.I = true;
               this.D = 0;
               this.E = 0;
            }

            if (this.I) {
               long var1 = this.z - this.y;
               int var3 = this.N - k4.k;
               this.N = k4.k;
               int var4 = this.M - k4.j;
               this.M = k4.j;
               if (k4.g) {
                  if (this.z % 2L == 0L) {
                     this.F = k4.k;
                     this.G = k4.j;
                     this.K = this.z;
                     this.L = this.z;
                  }

                  this.D = 0;
                  this.E = 0;
                  if (s > 0 && s < this.d) {
                     s = this.B + var3;
                     this.B = s;
                  } else {
                     s = this.B + k4.l() / 2;
                  }

                  if (u > 0 && u < this.q) {
                     u = this.C + var4;
                     this.C = u;
                  } else {
                     u = this.C + k4.k() / 2;
                  }

                  r = s;
                  t = u;
                  if (var1 < 20L) {
                     var3 = (s + k4.k - this.m) / this.k;
                     var4 = (u + k4.j - this.l) / this.j;
                     this.v = var3 * this.h + var4;
                     if (this.v < 0) {
                        this.v = 0;
                     }

                     if (this.v >= this.i * this.h) {
                        this.v = this.i * this.h - 1;
                     }

                     k4.u.b(this.v, false);
                  }

                  if (b2.f(k4.l()) >= 10 * ev.a || b2.f(k4.k()) >= 10 * ev.a) {
                     k4.u.b(true);
                  } else if (var1 > 3L && var1 < 8L) {
                     this.J = false;
                     k4.u.b(false);
                  }
               }

               if (k4.h) {
                  this.I = false;
                  var3 = (int)(this.z - this.K);
                  var4 = this.F - k4.k;
                  int var5 = this.G - k4.j;
                  if (b2.f(var4) > 40 && var3 < 20 && s > 0 && s < this.d) {
                     this.D = var4 / var3 * 10;
                  }

                  var3 = (int)(this.z - this.L);
                  if (b2.f(var5) > 40 && var3 < 20 && u > 0 && u < this.q) {
                     this.E = var5 / var3 * 10;
                  }

                  this.K = -1L;
                  this.L = -1L;
                  if (b2.f(k4.l()) < 10 * ev.a && b2.f(k4.k()) < 10 * ev.a) {
                     if (var1 <= 4L) {
                        this.H = 5;
                        k4.u.b(false);
                     } else {
                        k4.u.b(this.v, true);
                        if (k4.u != fb.z) {
                           k4.u.b(true);
                        }
                     }

                     this.J = false;
                  }

                  k4.h = false;
               }
            }
         }
      }
   }

   private void c() {
      if (!k4.g) {
         if ((s = this.v / this.h * this.k - this.f / 2 + this.k / 2) < 0) {
            s = 0;
         }

         if (s > this.d) {
            s = this.d;
         }

         if (this.v / this.h > this.i - 1 || this.v / this.h == 0) {
            r = s;
         }

         if ((u = this.v % this.h * this.j - this.g / 2 + this.j / 2) < 0) {
            u = 0;
         }

         if (u > this.q) {
            u = this.q;
         }

         if (this.v % this.h > this.h - 1 || this.v % this.h == 0) {
            t = u;
         }
      }
   }
}
