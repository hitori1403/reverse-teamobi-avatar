import javax.microedition.lcdui.Graphics;

public final class iq extends il {
   public short h;
   public short i;
   public byte j;
   public boolean k = false;

   public iq() {
   }

   public iq(int var1, int var2, int var3, int var4, short var5) {
      super.f = (byte)var1;
      super.a = var2;
      super.b = var3;
      this.h = (short)var4;
      this.i = var5;
   }

   public final void b(Graphics var1) {
      s var2;
      if (this.k) {
         var2 = gx.j(this.i);
      } else {
         var2 = f5.c(this.i);
      }

      if (!this.k && gx.b != 68 && gx.b != 69 && gx.b != 70 && gx.b != 110) {
         hp var9 = f5.d[var2.c];
         if ((super.a + var2.f + var9.f) * ik.c >= cl.b().c
            && (super.a + var2.f - var9.f) * ik.c <= cl.b().c + k4.o
            && (super.b + var9.g) * ik.c >= cl.b().d
            && (super.b + var2.g - var9.g) * ik.c <= cl.b().d + k4.p) {
            int var10002 = (super.a + var2.f) * ik.c;
            int var14 = (super.b + var2.g) * ik.c;
            byte var12 = this.j;
            int var11 = var14;
            int var10 = var10002;
            var10002 = var9.d * ev.a;
            var14 = var9.e * ev.a;
            int var10004 = var9.f * ev.a;
            int var10005 = var9.g * ev.a;
            var1.drawRegion(f5.b(var9.c).f, var10002, var14, var10004, var10005, var12, var10, var11, 0);
         }
      } else {
         int var10003 = (super.a + var2.f) * ik.c;
         int var5 = (super.b + var2.g) * ik.c;
         int var4 = var10003;
         short var3 = var2.c;
         dm var8 = f5.d(var3);
         if (var4 + var8.c >= cl.b().c && var4 <= cl.b().c + k4.o && var5 + var8.d >= cl.b().d && var5 <= cl.b().d + k4.p) {
            if (var8.e != -1) {
               var1.drawRegion(var8.b, 0, 0, var8.c, var8.d, this.j, var4, var5, 0);
            }
         }
      }
   }

   public final void a() {
   }
}
