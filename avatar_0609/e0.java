import javax.microedition.lcdui.Graphics;

public final class e0 extends ex {
   private short[] n;
   private String[] o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u;
   private int v;
   private int w;
   private int x = 0;
   private boolean y = false;
   private int z;
   private int A;
   private int B;
   private int C;
   private static final String D;

   public e0(short[] var1, String[] var2) {
      this.n = var1;
      this.o = var2;
      super.f = new ag(hq.A, null);
      this.q = 150 * ev.a;
      this.p = 200 * ev.a;
      this.p = 0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4;
         if ((var4 = k4.S.b(var2[var3]) + 40 * ev.a) > this.p) {
            this.p = var4;
         }
      }

      this.r = ev.i + 5 * ev.a;
      this.w = var1.length * this.r - (this.q - 10 * ev.a);
      if (this.w < 0) {
         this.w = 0;
      }
   }

   public final void c() {
      ++this.A;
      boolean var1 = false;
      if (k4.i && k4.d((k4.o - this.p) / 2, (k4.p - this.q) / 2, this.p, this.q) && !this.y) {
         this.x = this.t;
         this.y = true;
         this.z = 0;
      }

      if (this.y) {
         int var2 = k4.l();
         if (k4.g) {
            if (k4.n % 3 == 0) {
               this.C = k4.k;
               this.B = this.A;
            }

            this.s = this.x + var2;
            this.z = 0;
            if (this.s < 0 || this.s > this.w) {
               this.s = this.x + var2 / 2;
            }

            this.t = this.s;
         }

         if (k4.h) {
            this.y = false;
            int var3 = this.A - this.B;
            int var4;
            if (b2.f(var4 = this.C - k4.k) > 40 && var3 < 10 && this.s > 0 && this.s < this.w) {
               this.z = var4 / var3 * 10;
            }

            this.B = -1;
            if (Math.abs(var2) < 10) {
               this.s = this.x + var2;
            }
         }
      }

      if (k4.f[2]) {
         this.s -= ev.i;
         var1 = true;
      } else if (k4.f[8]) {
         var1 = true;
         this.s += ev.i;
      }

      if (var1) {
         if (this.s < 0) {
            this.s = 0;
         }

         if (this.s > this.w) {
            this.s = this.w;
         }
      }

      if (this.z != 0) {
         if (this.t < 0 || this.t > this.w) {
            this.z -= this.z / 4;
            this.t += this.z / 20;
            if (this.z / 10 <= 1) {
               this.z = 0;
            }
         }

         if (this.t < 0) {
            if (this.t < -this.q / 2) {
               this.t = -this.q / 2;
               this.s = 0;
               this.z = 0;
            }
         } else if (this.t > this.w) {
            if (this.t < this.w + this.q / 2) {
               this.t = this.w + this.q / 2;
               this.s = this.w;
               this.z = 0;
            }
         } else {
            this.t += this.z / 10;
         }

         this.s = this.t;
         this.z -= this.z / 10;
         if (this.z / 10 == 0) {
            this.z = 0;
         }
      } else if (this.t < 0) {
         this.s = 0;
      } else if (this.t > this.w) {
         this.s = this.w;
      }

      if (this.t != this.s) {
         this.v = this.s - this.t << 2;
         this.u += this.v;
         this.t += this.u >> 4;
         this.u &= 15;
      }

      super.c();
   }

   public final void b(Graphics var1) {
      k4.aa
         .b(
            var1,
            (k4.o - this.p) / 2,
            (k4.s - this.q) / 2 - (ib.t + 3 * ev.a),
            this.q + ib.t + 3 * ev.a,
            this.p,
            0,
            0,
            ib.b().l,
            ib.b().k,
            ib.t,
            1,
            1,
            ib.b().r,
            ib.b().q,
            D
         );
      k4.d(var1);
      var1.translate((k4.o - this.p) / 2, (k4.s - this.q) / 2);
      var1.setClip(0, 5 * ev.a, this.p, this.q - 10 * ev.a);
      var1.translate(0, -this.t);

      for(int var2 = 0; var2 < this.n.length; ++var2) {
         f5.b(var1, this.n[var2], 15 * ev.a, 15 * ev.a + var2 * this.r, 3);
         k4.S.b(var1, this.o[var2], 35 * ev.a, 15 * ev.a + var2 * this.r - ev.i / 2, 0);
      }

      super.b(var1);
   }

   static {
      String var10002 = b(a("gẎvfm ẗ"));
      boolean var10001 = true;
      D = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'z');
      }

      return var10000;
   }

   private static String b(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 43;
               break;
            case 1:
               var10005 = 69;
               break;
            case 2:
               var10005 = 21;
               break;
            case 3:
               var10005 = 14;
               break;
            case 4:
               var10005 = 77;
               break;
            case 5:
               var10005 = 83;
               break;
            default:
               var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
