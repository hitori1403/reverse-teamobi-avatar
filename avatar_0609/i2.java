import javax.microedition.lcdui.Graphics;

public final class i2 extends it {
   public short z;
   short A;
   public int B;
   public int C;
   public int D;
   byte E;
   private byte F;
   private byte G;
   private byte H = 1;
   public byte I;
   byte J;

   public i2() {
      super.d = 5;
   }

   public i2(byte var1, short var2, int var3) {
      this.D = var3;
      super.d = 5;
      this.I = var1;
      this.z = var2;
      this.F = 0;
      jv var4;
      if ((var4 = f5.b(this.z)).c < f5.d.length) {
         super.e = f5.d[var4.c].g;
      }

      this.G = (byte)b2.e(10);
   }

   public final void a() {
      switch(this.J) {
         case 0:
         case 1:
            super.a += (short)(this.B - super.a >> 2);
            super.b += (short)(this.C - super.b >> 2);
            if (this.E >= -6) {
               this.A = (short)(this.A + this.E);
               --this.E;
            }

            if ((b2.f(super.a - this.B) < 4 || b2.f(super.b - this.C) < 4) && this.A <= 1) {
               super.a = this.B;
               super.b = this.C;
               this.A = 0;
               this.E = 0;
               if (this.J == 1) {
                  gx.b(this);
               }

               this.J = 2;
               return;
            }
         case 2:
         default:
            break;
         case 3:
            this.A = (short)(this.A + 3);
            if (this.A > 50) {
               gx.b(this);
               return;
            }
            break;
         case 4:
            if (this.A > 0) {
               this.A = (short)(this.A - this.E);
               ++this.E;
               return;
            }

            this.A = 0;
            this.J = 2;
      }
   }

   public final void b(Graphics var1) {
      var1.drawImage(gx.w, super.a, super.b + 1, 33);
      if (this.I == 0) {
         f5.b(this.z).b(var1, super.a, super.b + this.G / 10 - this.A, 33);
      } else {
         super.e = (short)(f5.d(this.z).d + 10);
         f5.b(var1, this.z, super.a, super.b + this.G / 10 - this.A, 33);
      }

      this.G += this.H;
      if (b2.f(this.G) >= 10) {
         this.F = (byte)(-this.F);
      }
   }
}
