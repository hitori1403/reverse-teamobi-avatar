import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ey extends ex {
   public Vector n;
   private static ey o;
   public int p = 0;
   public int q;
   public int r;
   public int s;
   public int t;
   private boolean u = false;
   public String v = "";

   public static ey d() {
      if (o == null) {
         o = new ey();
      }

      return o;
   }

   public final void b(int var1) {
      switch(var1) {
         case 0:
            k4.h();
            o = null;
      }
   }

   public ey() {
      super.f = new ag(hq.A, 0);
   }

   public final void b() {
   }

   public final void e() {
      if (this.n != null && this.n.size() > 0) {
         k4.y = this;
      }
   }

   public final void b(Graphics var1) {
      k4.aa.b(var1, this.r, this.p, this.s, this.q, 0);
      int var2 = this.p + ib.t + (5 + ev.b - ev.j / 2);

      for(int var3 = 0; var3 < this.n.size(); ++var3) {
         String var4;
         if ((var4 = (String)this.n.elementAt(var3)).substring(0, 1).equals("0")) {
            k4.Y.b(var1, var4.substring(1), this.r + this.s / 2, var2 + 3 + ev.j / 2 - ev.k / 2, 2);
         } else {
            k4.S.b(var1, var4, this.r + 15, var2 + 3, 0);
         }

         var2 += ev.j;
      }

      super.b(var1);
   }
}
