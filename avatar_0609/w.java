import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class w {
   public byte[] b;
   public hp[] c;
   public Image d;
   public ic[] e;
   public short f;

   public final void b(Graphics var1, int var2, int var3, int var4) {
      ic var9 = this.e[this.b[var4]];

      for(int var5 = 0; var5 < var9.c.length; ++var5) {
         byte var7 = var9.b[var5];
         w var6 = this;

         hp var10000;
         label23: {
            for(int var8 = 0; var8 < var6.c.length; ++var8) {
               if (var6.c[var8].b == var7) {
                  var10000 = var6.c[var8];
                  break label23;
               }
            }

            var10000 = null;
         }

         hp var10 = var10000;
         var1.drawRegion(
            this.d, var10.d * ev.a, var10.e * ev.a, var10.f * ev.a, var10.g * ev.a, 0, var2 * ev.a + var9.c[var5] * ev.a, var3 * ev.a + var9.d[var5] * ev.a, 0
         );
      }
   }
}
