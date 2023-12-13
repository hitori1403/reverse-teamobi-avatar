import javax.microedition.lcdui.Graphics;

public abstract class jv {
   public short a;
   public short b;
   public short c;
   public int[] d = new int[2];
   public byte e;
   public byte f;
   public String g;

   public final void a(Graphics var1, int var2, int var3, int var4) {
      if (this.b != -1) {
         if (this.b >= 2000) {
            short var7 = this.c;
            dm var8;
            if ((var8 = f5.c(var7)).e != -1 || this.b == -1) {
               var1.drawRegion(var8.b, 0, 0, var8.c, var8.d, 0, var2, var3, var4);
            }

            return;
         }

         f5.d[this.c].b(var1, var2, var3, var4);
      }
   }

   public void b(Graphics var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
   }

   public void b(Graphics var1, int var2, int var3, int var4, int var5) {
   }
}
