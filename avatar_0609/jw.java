import javax.microedition.lcdui.Graphics;

public final class jw extends jv {
   public byte h;
   public byte i;
   public short[] j;
   public byte[] k;
   public byte[] l;

   public final void b(Graphics var1, int var2, int var3, int var4, int var5) {
      if (super.b != -1) {
         if (super.b >= 2000) {
            dm var6;
            if ((var6 = f5.c(this.j[var2])).e != -1) {
               var1.drawRegion(
                  var6.b,
                  0,
                  0,
                  var6.c,
                  var6.d,
                  var5,
                  var3 + this.k[var2] * ev.a - (var5 == it.r ? (this.k[var2] * ev.a << 1) + var6.c : 0),
                  var4 + this.l[var2] * ev.a,
                  0
               );
               return;
            }
         } else {
            hp var7 = f5.d[this.j[var2]];
            f5.b(
               var1,
               var7.c,
               var7.d,
               var7.e,
               var7.f,
               var7.g,
               var3 + this.k[var2] * ev.a - (var5 == it.r ? (this.k[var2] * ev.a << 1) + var7.f * ev.a : 0),
               var4 + this.l[var2] * ev.a,
               var5
            );
         }
      }
   }
}
