import javax.microedition.lcdui.Graphics;

public final class i1 extends it {
   public byte z;
   public byte A;
   private byte B = 10;
   private byte C = -1;
   private byte D = -1;
   private byte E;
   private byte F = 6;
   public short G;
   public short H;
   public short[] I;
   public short[] J;
   public int K;
   private int L = 0;

   public final void a() {
      ++this.E;
      if (this.E >= 10) {
         this.E = 0;
      }

      if (this.F < 9) {
         ++this.F;
      }

      ++this.L;
      if (this.L >= 6) {
         this.L = 0;
      }

      ++super.h;
      if (super.h == 12) {
         super.h = 0;
      }

      if (super.a < (gx.f + 1) * gx.j) {
         if (this.I != null && this.A < this.I.length && fe.g().M <= 0) {
            super.a += this.J[this.A];
            if (this.J[this.A] == 0) {
               super.q = 2;
            } else {
               super.q = 1;
            }

            --this.I[this.A];
            if (this.I[this.A] <= 0) {
               ++this.A;
               if (this.A < this.J.length) {
                  if (this.F == 9 && this.J[this.A] == 0) {
                     this.F = 0;
                  } else if (this.C == -1 && this.J[this.A] == 2) {
                     this.C = 20;
                  } else if (this.D == -1 && this.J[this.A] == 5) {
                     this.D = 20;
                  }
               }
            }
         } else {
            super.q = 0;
            if (this.J != null && fe.g().M <= 0) {
               super.a += this.J[this.J.length - 1];
            }

            if (this.B == 10 && this.I != null && this.A >= this.I.length) {
               this.B = fe.g().N++;
            }
         }

         if (this.C >= 0) {
            --this.C;
         }

         if (this.D >= 0) {
            --this.D;
         }
      }
   }

   public final void b(Graphics var1) {
      dm var2;
      if ((var2 = f5.d(this.G)).e != -1) {
         int var3 = var2.d / 5;
         var1.drawRegion(var2.b, 0, fe.V[super.q][super.h] * var3, var2.c, var3, 0, super.a * ik.c, super.b * ik.c, 33);
         if (fe.g().J && this.K > 0) {
            k4.U.b(var1, "" + this.K, super.a * ik.c - var2.c / 2 - 8 * ik.c, super.b * ik.c - ev.h / 2 - 3 * ik.c, 1);
         }

         if (this.C >= 0) {
            var1.drawImage(fe.P, super.a * ik.c + var2.c / 2, super.b * ik.c - var3, 33);
         }

         if (this.F < 9) {
            var1.drawImage(fe.S[this.F / 3], super.a * ik.c, super.b * ik.c, 3);
         }

         if (this.D >= 0) {
            var1.drawImage(fe.Q, super.a * ik.c + var2.c / 2, super.b * ik.c - var3, 33);
            var1.drawImage(fe.R[this.E / 2], super.a * ik.c - var2.c / 2, super.b * ik.c, 3);
         }

         if (super.f == cl.b().r.f) {
            var1.drawImage(AutoController.C, super.a * ik.c, super.b * ik.c - var3 - this.L / 2 - 10 * ik.c, 3);
         }
      }
   }
}
