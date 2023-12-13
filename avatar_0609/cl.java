public final class cl {
   private static cl b;
   public int c;
   public int d;
   public int e;
   public int f;
   private int g;
   private int h;
   public long i;
   private int j;
   private int k;
   private int l;
   private int m;
   private static int n;
   private static int o;
   public static boolean p = false;
   public static boolean q;
   public it r;

   public static cl b() {
      if (b == null) {
         b = new cl();
      }

      return b;
   }

   public static void b(int var0) {
      n = var0;
   }

   public final void c(int var1) {
      if (this.r != null) {
         label58: {
            q = false;
            o = gx.j * ev.a;
            n = k4.o / 10;
            if (this.r.a * ev.a > k4.q) {
               if (this.r.a * ev.a < gx.f * o - k4.q - o) {
                  this.e = this.r.a * ev.a - k4.q;
                  break label58;
               }

               this.e = gx.f * o - k4.o;
               if (this.e >= 0) {
                  break label58;
               }
            }

            this.e = 0;
         }

         if (k4.o > gx.f * o) {
            this.e = -(k4.o - gx.f * o) / 2;
         }

         if (k4.p <= gx.g * o || var1 - 1 != 57 && var1 - 1 != 58 && var1 - 1 != 59 && var1 - 1 != 108) {
            this.f = gx.g * o - k4.p;
         } else {
            this.f = -(k4.p - gx.g * o) / 2;
         }

         this.g = gx.f * o - k4.o;
         this.h = gx.g * o - k4.p;
         this.c = this.e;
         if (this.c < 0) {
            this.c = 0;
         }

         if (this.c > this.g) {
            this.c = this.g;
         }

         if (this.d > this.h) {
            this.d = this.h;
         }

         if (this.f > this.h) {
            this.f = this.h;
         }
      }
   }

   public final void c() {
      if (!p) {
         if (this.c != this.e) {
            this.j = this.e - this.c << 1;
            this.k += this.j;
            this.c += this.k >> 4;
            this.k &= 15;
            if (this.c < 0) {
               this.c = 0;
            }

            if (this.c > this.g) {
               this.c = this.g;
            }
         }
      } else {
         if (this.c < 0) {
            this.c = 0;
         }

         if (this.c > gx.f * gx.j * ev.a - k4.o) {
            this.c = gx.f * gx.j * ev.a - k4.o;
         }
      }

      if (this.d != this.f) {
         this.l = this.f - this.d << 1;
         this.m += this.l;
         this.d += this.m >> 4;
         this.m &= 15;
         if (this.d > this.h) {
            this.d = this.h;
         }
      }
   }

   public final void b(int var1, int var2) {
      this.i = 0L;
      this.e = var1 - k4.q;
      this.f = var2 - k4.r;
      if (this.e < 0) {
         this.e = 0;
      }

      if (this.e > gx.f * o - k4.o) {
         this.e = gx.f * o - k4.o;
      }

      if (this.f > gx.g * o - k4.p) {
         this.f = gx.g * o - k4.p;
      }

      this.f();
   }

   public final void d() {
      this.c = this.e = 0;
      this.d = this.f = 0;
   }

   public final void e() {
      this.c();
      if (System.currentTimeMillis() / 100L - this.i >= 20L && !q) {
         int var1;
         if (this.r.s == 0) {
            var1 = this.r.a * ev.a + n;
         } else {
            var1 = this.r.a * ev.a - n;
         }

         this.e = var1 - k4.q;
         this.f = (this.r.b + this.r.v) * ev.a - (k4.p - (k4.r - o));
         if (this.r.s == it.r) {
            if (this.r.a * ev.a < k4.q) {
               this.e = 0;
            }
         } else if (this.r.a * ev.a > gx.f * o - k4.q) {
            this.e = gx.f * o - k4.o;
         }

         this.f();
      }
   }

   private void f() {
      if (gx.b >= 0 && gx.b < gx.i.length && gx.i[gx.b] == -1 && gx.c == null && k4.p > gx.g * o) {
         this.d = this.f = -(k4.p - gx.g * o) / 2;
      }

      if (k4.o > gx.f * o) {
         this.c = this.e = -(k4.o - gx.f * o) / 2;
      }
   }
}
