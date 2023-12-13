import javax.microedition.lcdui.Graphics;

final class hg extends hf {
   private final is b;

   hg(is var1) {
      this.b = var1;
   }

   public final void b(Graphics var1) {
      ib.b(this.b.a * ev.a, this.b.b * ev.a, this.b.i, this.b.j, 5921542, var1);
   }

   public final void b() {
      if (this.b.b < this.b.l) {
         this.b.a += this.b.h;
         this.b.b += this.b.g;
         ++this.b.g;
      } else {
         this.b.h = 0;
         this.b.g = 0;
      }
   }
}
