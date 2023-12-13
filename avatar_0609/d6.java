import javax.microedition.lcdui.Graphics;

public final class d6 {
   private int a;
   private int b;
   int c;
   private int e;

   public d6(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
   }

   public final void b(Graphics var1) {
      dm var2;
      if ((var2 = f5.d((short)(k4.o > 200 ? 870 : 871))).e != -1) {
         var1.drawRegion(var2.b, 0, this.e * fx.aA, fx.az, fx.aA, 0, this.a, this.b, 3);
         c9 var3 = k4.W;
         if (k4.o <= 200) {
            var3 = k4.Y;
         }

         if (k4.ah > 0) {
            var3 = k4.S;
         }

         var3.b(var1, String.valueOf(this.c), this.a, this.b - ev.j / 2, 2);
      }
   }
}
