import javax.microedition.lcdui.Graphics;

public class ag {
   public String b;
   public gq c;
   public byte d;
   public ev e;
   public short f = -1;

   public ag(String var1, gq var2) {
      this.b = var1;
      this.c = var2;
   }

   public ag(String var1, int var2) {
      this.b = var1;
      this.d = (byte)var2;
   }

   public ag(String var1, int var2, ev var3) {
      this.b = var1;
      this.d = (byte)var2;
      this.e = var3;
   }

   public ag(String var1, int var2, int var3) {
      this.b = var1;
      this.d = (byte)var2;
      this.f = (byte)var3;
   }

   public final void a() {
      if (this.c != null) {
         this.c.b();
      } else if (this.e != null) {
         this.e.b(this.d);
      } else if (e3.p) {
         e3.e().b(this.d, this.f);
      } else {
         k4.u.b(this.d, this.f);
      }
   }

   public void b() {
   }

   public void b(Graphics var1, int var2, int var3) {
      k4.T.b(var1, this.b, var2, var3, 2);
   }
}
