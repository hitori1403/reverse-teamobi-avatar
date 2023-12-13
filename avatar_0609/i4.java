import javax.microedition.lcdui.Graphics;

public final class i4 extends it {
   public short z;
   public short A;
   public short B;
   public int C;
   public byte D;
   private byte E;

   public i4() {
      this.A = this.B = 0;
      super.d = 6;
      this.E = 0;
   }

   public final void a() {
      w var1;
      if ((var1 = f5.e(this.z)) != null) {
         ++this.E;
         if (this.E < var1.b.length) {
            return;
         }
      }

      this.c();
   }

   public final void b(Graphics var1) {
      if (k4.ah <= 0 || k4.u != e_.g()) {
         w var2;
         if ((var2 = f5.e(this.z)) != null) {
            if (this.D == 0) {
               i3 var3;
               if ((var3 = gx.l(this.C)) == null) {
                  this.c();
                  return;
               }

               super.a = var3.a + this.A;
               super.b = var3.b + this.B;
            }

            var2.b(var1, super.a, super.b, this.E);
         }
      }
   }

   private void c() {
      switch(this.D) {
         case 0:
            gx.n.removeElement(this);
            return;
         case 1:
            gx.m.removeElement(this);
            return;
         case 2:
            gx.D.removeElement(this);
            return;
         case 3:
            gx.E.removeElement(this);
      }
   }
}
