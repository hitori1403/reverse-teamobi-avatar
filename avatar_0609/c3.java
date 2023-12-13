import javax.microedition.lcdui.Image;

public final class c3 {
   public String b = "";
   public int c;
   public int d;
   public int e;
   public int f;
   public boolean g = false;
   public Image h;
   public byte i;
   public byte j = -1;
   public short k = -1;
   public short l = -1;

   public c3(int var1, int var2, int var3, int var4, Image var5, int var6, int var7, int var8) {
      this.f = var6;
      this.i = -1;
      this.c = var1;
      this.d = var2;
      if (var3 > 0) {
         this.b = "+";
      }

      this.b = this.b + var3;
      if (var3 == 0) {
         this.b = "";
      }

      this.h = var5;
      this.g = false;
      this.j = -1;
      this.k = (short)var7;
      this.l = -1;
   }

   public c3(int var1, int var2, String var3, int var4, int var5, int var6) {
      this.f = var6;
      this.i = -1;
      this.c = var1;
      this.d = var2;
      this.b = var3;
      this.e = 0;
      this.g = true;
      this.j = (byte)var5;
      this.k = -1;
      this.l = -1;
   }
}
