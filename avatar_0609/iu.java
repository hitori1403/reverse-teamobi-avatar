import javax.microedition.lcdui.Graphics;

public class iu extends it {
   public int z;
   public int A;
   public int B;
   public int C = 0;
   public int D;
   public boolean E = false;
   public int F;
   public int G;
   public boolean H;
   public boolean[] I = new boolean[2];
   public byte J;
   public byte K;
   public byte L;
   public cn M;
   public int N = 0;
   public boolean O = false;
   public int P = 0;
   private static final String[] ab;

   public iu() {
      super.d = 2;
   }

   public void c() {
   }

   public iu(int var1, int var2, int var3, byte var4) {
      n var5 = f8.d(var4);
      super.g = var5.m;
      super.d = 2;
      this.b(0, 0);
      super.s = 0;
      super.q = 0;
      super.f = var3;
      this.C = 0;
      super.i = 4;
      super.o = super.i;
      super.p = 1;
      this.J = var4;
      new b2();
      super.h = b2.e(12);
   }

   public void b(Graphics var1) {
      n var2;
      dm var3;
      if (super.a * ik.c + 30 >= cl.b().c && super.a * ik.c - 30 <= cl.b().c + k4.o && k4.u != e_.g() && (var3 = f5.d((var2 = f8.d(this.J)).k[this.C])).e != -1
         )
       {
         if (super.e == 0) {
            super.e = (short)(var3.d / var2.c);
         }

         if (super.d != 7) {
            this.L = var2.l[super.q][super.h];
         }

         var1.drawRegion(
            var3.b,
            0,
            this.L * super.e,
            var3.c,
            super.e,
            super.s,
            super.a * ik.c,
            super.b * ik.c + this.K - (var2.d == 4 ? super.e / 3 << 1 : 0),
            var2.d != 4 ? 33 : 17
         );
         super.b(var1);
         this.b(var1, super.e + 2, super.a * ik.c, super.b * ik.c);
      }
   }

   public final void b(Graphics var1, int var2, int var3, boolean var4) {
      n var5;
      dm var6;
      if ((var6 = f5.d((var5 = f8.d(this.J)).k[this.C])).e != -1) {
         if (super.e == 0) {
            super.e = (short)(var6.d / var5.c);
         }

         if (super.d != 7) {
            this.L = var5.l[super.q][super.h];
         }

         var1.drawRegion(var6.b, 0, this.L * super.e, var6.c, super.e, super.s, var2, var3 + this.K, var5.d != 4 ? 33 : 17);
         this.b(var1, super.e + 2, var2, var3);
      }
   }

   private void b(Graphics var1, int var2, int var3, int var4) {
      int var5 = f8.d(this.J).e * 60 - this.F;
      int var6 = this.C * 5;
      if (this.F > f8.d(this.J).e * 60) {
         ib.b(var3 - (var6 + 22) * ik.c / 2, var4 - (18 + this.K) * ik.c - var2, (var6 + 22) * ik.c, 4 * ik.c, 1, var1);
         ib.b(var3 - (var6 + 20) * ik.c / 2, var4 - (17 + this.K) * ik.c - var2, this.G * (var6 + 20) / 100 * ik.c, 2 * ik.c, 65280, var1);

         try {
            fj.g();
            String var10;
            if ((var5 = fj.c(this.J) * 24 * 60 - this.F) > 1440) {
               String[] var7 = ab;
               var10 = var7[1] + (var5 / 1440 + 1) + var7[0];
            } else {
               var10 = var5 / 60 + ":" + var5 % 60;
            }

            k4.T.b(var1, var10, var3, var4 - (13 + this.K) * ik.c - var2, 2);
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      } else {
         ib.b(var3 - (var6 + 22) * ik.c / 2, var4 - (18 + this.K) * ik.c - var2, (var6 + 22) * ik.c, 4 * ik.c, 1, var1);
         ib.b(var3 - (var6 + 20) * ik.c / 2, var4 - (17 + this.K) * ik.c - var2, this.G * (var6 + 20) / 100 * ik.c, 2 * ik.c, 65280, var1);
         k4.T.b(var1, var5 / 60 + ":" + var5 % 60, var3, var4 - (13 + this.K) * ik.c - var2, 2);
      }

      if (super.d == 7) {
         var2 = 10;
      }

      if (this.I[0]) {
         fj.V.b(0, var3 - 10 * ik.c, var4 - (22 + this.K) * ik.c - var2, 0, 3, var1);
      }

      if (this.I[1]) {
         fj.V.b(1, var3 + 10 * ik.c, var4 - (22 + this.K) * ik.c - var2, 0, 3, var1);
      }
   }

   public void a() {
      if (this.O) {
         if (k4.j() - this.P > 10) {
            this.O = false;
            return;
         }
      } else {
         ++super.h;
         if (super.h >= 12) {
            super.h = 0;
         }

         this.e();
         if (super.q != 1) {
            if (super.h == 0) {
               new b2();
               super.q = (byte)b2.e(5 + (this.J - 50) * 5);
               if (super.q != 2) {
                  super.q = 0;
               } else {
                  new b2();
                  super.s = (byte)b2.c(0, it.r);
               }
            }

            if (this.D > 0) {
               --this.D;
               return;
            }

            this.d();
            if (this.M.b > super.a) {
               super.s = 0;
            } else {
               super.s = it.r;
            }

            this.g();
            super.q = 1;
         } else {
            this.f();
         }

         super.a();
      }
   }

   public void d() {
   }

   public void e() {
   }

   public void f() {
      int var10000 = super.p;
      int var10001 = this.z;
      new b2();
      new b2();
      int var1 = var10000 * (var10001 * b2.c(b2.d(this.A)) >> 10);
      var10000 = -super.p * this.z;
      new b2();
      new b2();
      int var2 = var10000 * b2.b(b2.d(this.A)) >> 10;
      if (this.c(var1, var2)) {
         if (this.d(var1, var2)) {
            super.a += super.n;
            super.b += super.o;
         }

         this.i();
      } else {
         super.a = super.l + var1;
         super.b = super.m + var2;
         new b2();
         var1 = b2.b(super.l, super.m, super.a, super.b);
         ++this.z;
         if (var1 > this.B) {
            this.i();
         }
      }
   }

   public void g() {
      new b2();
      this.B = b2.b(super.a, super.b, this.M.b, this.M.c);
      new b2();
      this.A = b2.b(this.M.b - super.a, -(this.M.c - super.b));
   }

   public void h() {
      new b2();
      int var10002 = b2.e(gx.f * 6) << 2;
      new b2();
      cn var1 = new cn(var10002, b2.e(gx.g * 6) << 2);
      this.M = var1;
   }

   public void i() {
      super.q = 0;
      super.l = super.a;
      super.m = super.b;
      super.n = 0;
      super.o = 0;
      this.z = 0;
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0010CIå\u0014\u0004Sß@%";
      int var4 = "\u0010CIå\u0014\u0004Sß@%".length();
      char var1 = 5;
      int var0 = -1;

      while(true) {
         String var10002 = a(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            ab = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '^');
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
               var10005 = 48;
               break;
            case 1:
               var10005 = 45;
               break;
            case 2:
               var10005 = 46;
               break;
            case 3:
               var10005 = 5;
               break;
            case 4:
               var10005 = 109;
               break;
            case 5:
               var10005 = 81;
               break;
            default:
               var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
