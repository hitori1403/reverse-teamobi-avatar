import javax.microedition.lcdui.Graphics;

public final class jy extends jv {
   public short h;

   public final void b(Graphics var1, int var2, int var3, int var4) {
      jw var5 = (jw)f5.b(super.a);
      if (super.c == var5.j[0]) {
         hp var6 = f5.d[var5.j[0]];
         int var10002 = var6.d * ev.a;
         int var10003 = var6.e * ev.a;
         int var10004 = var6.f * ev.a;
         int var10005 = var6.g * ev.a;
         var1.drawRegion(f5.b(this.h).f, var10002, var10003, var10004, var10005, 0, var2, var3, var4);
      } else {
         var5.a(var1, var2, var3, var4);
      }
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5) {
      jw var6 = (jw)f5.b(super.a);
      hp var7 = f5.d[var6.j[var2]];
      f5.b(
         var1,
         this.h,
         var7.d,
         var7.e,
         var7.f,
         var7.g,
         var3 + var6.k[var2] * ev.a - (var5 == it.r ? (var6.k[var2] * ev.a << 1) + var7.f * ev.a : 0),
         var4 + var6.l[var2] * ev.a,
         var5
      );
   }
}
