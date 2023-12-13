import javax.microedition.lcdui.Graphics;

public final class br {
   public String b;
   public short c;
   public short[] d;
   public byte[] e;
   public short f;
   public short g = -1;
   public short[] h = new short[2];
   public short i;
   public short j;
   public short k;
   public String l;
   public boolean m = false;
   public byte n = 1;

   public final void b(Graphics var1, int var2, int var3, int var4, int var5) {
      if (this.m) {
         f8.b(var1, this.d[var2], var3, var4, var5);
      } else {
         hp var6 = f8.f[this.d[var2]];
         var1.drawRegion(f8.h[var6.c], var6.d * ev.a, var6.e * ev.a, var6.f * ev.a, var6.g * ev.a, 0, var3, var4, var5);
      }
   }
}
