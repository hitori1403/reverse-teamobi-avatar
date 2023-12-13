import javax.microedition.lcdui.Graphics;

public final class io extends il {
   private String h;
   private byte i;
   private byte j = 0;

   public io(String var1, int var2, int var3) {
      super.d = 8;
      super.a = var2;
      super.b = var3;
      this.h = var1;
      this.i = (byte)b2.e(8);
   }

   public final void a() {
      ++this.i;
      if (this.i >= 8) {
         this.i = 0;
      }
   }

   public final void b(Graphics var1) {
      if (fa.g().D[1] != 1 && k4.H == null) {
         if (super.a * ik.c >= cl.b().c
            && super.a * ik.c <= cl.b().c + k4.o
            && super.b * ik.c >= cl.b().d
            && super.b * ik.c <= cl.b().d + k4.p + 10
            && k4.u != e_.g()) {
            var1.drawImage(gx.w, super.a * ik.c, super.b * ik.c, 3);
            if (fc.g().B != null) {
               int var10002 = super.a * ik.c;
               int var10003 = (super.b - 10 + this.i / 2) * ik.c;
               fc.g().B.b(0, var10002, var10003, 0, 33, var1);
            }

            k4.Y.b(var1, this.h, super.a * ik.c, (super.b - 32 + this.i / 2) * ik.c, 2);
         }
      }
   }
}
