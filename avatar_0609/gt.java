import javax.microedition.lcdui.Graphics;

public final class gt {
   private static gt b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private boolean i = false;

   public static gt b() {
      return b == null ? (b = new gt()) : b;
   }

   public final void b(int var1, int var2) {
      if (var1 < var2) {
         this.i = true;
      } else {
         this.i = false;
         this.d = var1;
         this.c = var2;
         this.e = var2 * var2 / var1;
         if (this.e <= 0) {
            this.e = 1;
         }
      }
   }

   public final void c(int var1, int var2) {
      this.g = var1;
      this.h = var2;
      if (!this.i && (b2.f(var2 - var1) > 5 || k4.B.D != 0 || k4.B.I)) {
         var2 = this.d * 100 / 100;
         var1 = var1 * 100 / var2;
         var2 = this.c * 100 / 100;
         this.f = var1 * var2;
      }
   }

   public final void b(Graphics var1, int var2) {
      if (!this.i && (b2.f(this.h - this.g) > 5 || k4.B.D != 0 || k4.B.I)) {
         var1.setColor(6201499);
         var1.setClip(var2 - 1, -1, 6, this.c + 2);
         var1.fillRect(var2, 0 + this.f / 100, 4, this.e);
      }
   }
}
