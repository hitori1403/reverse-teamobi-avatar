import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class it extends ik {
   public int f;
   public String g = "";
   public int h;
   public byte i = 7;
   public byte j;
   public byte k;
   public int l;
   public int m;
   public int n = 0;
   public int o = 0;
   public int p = 4;
   public byte q = 0;
   public static byte r = 2;
   public byte s = r;
   public boolean t = false;
   public boolean u = false;
   public short v = 0;
   public dq w;
   public Vector x = new Vector();
   private static boolean y = false;

   public void b(Graphics var1) {
      if (this.w != null && k4.u != e_.g()) {
         this.w.b(var1);
      }
   }

   public final void b(int var1, int var2) {
      super.a = this.l = var1;
      super.b = this.m = var2;
   }

   public void a() {
      if (this.w != null) {
         this.w.b(super.a, super.b - super.e - 12);
         if (this.w.b()) {
            this.w = null;
            this.b();
         }
      }
   }

   private void b() {
      if (this.w == null && this.x.size() > 0) {
         this.w = (dq)this.x.elementAt(0);
         this.x.removeElementAt(0);
      }
   }

   public boolean c(int var1, int var2) {
      if (this.q != -1 && this.q != 14) {
         if (this.q != 10 && this.q != 2 && this.q != 4) {
            this.q = 0;
         }

         if (this.q != 0 && this.q != 1) {
            this.n = 0;
            this.o = 0;
            return true;
         } else {
            this.q = 1;
            int var3 = super.a;
            int var4 = super.b;
            if (super.d == 2) {
               var3 = this.l;
               var4 = this.m;
            }

            if (gx.e(var3 + var1, var4 + var2)) {
               if (var1 != 0) {
                  if (var1 > 0) {
                     this.n = this.p;
                  } else {
                     this.n = -this.p;
                  }
               }

               if (var2 != 0) {
                  if (var2 > 0) {
                     this.o = this.p;
                  } else {
                     this.o = -this.p;
                  }
               }

               return false;
            } else {
               this.n = 0;
               this.o = 0;
               return true;
            }
         }
      } else {
         this.n = 0;
         this.o = 0;
         return true;
      }
   }

   public final boolean d(int var1, int var2) {
      if (this.q != 0 && this.q != 1) {
         return false;
      } else if (gx.f(super.a + var1, super.b + var2) == 90) {
         return false;
      } else {
         int var3 = super.a;
         if (super.d == 0) {
            var3 += var1 < 0 ? -7 : 7;
         }

         if (var1 != 0) {
            int var4 = gx.f(var3 + var1, super.b - 24);
            int var5 = gx.f(var3, super.b - 24);
            if (var4 == 80 && var5 == 80) {
               this.o = -this.p;
               this.l = var3;
               AutoController.h();
               AutoController.s();
               return true;
            }

            var1 = gx.f(var3 + var1, super.b + 24);
            var2 = gx.f(var3, super.b + 24);
            if (var1 == 80 && var2 == 80) {
               this.o = this.p;
               this.l = var3;
               AutoController.h();
               AutoController.s();
               return true;
            }
         } else if (var2 != 0) {
            int var10 = gx.f(var3 - 24, super.b + var2);
            int var11 = gx.f(var3 - 24, super.b);
            if (var10 == 80 && var11 == 80) {
               this.n = -this.p;
               this.m = super.b;
               AutoController.h();
               AutoController.s();
               return true;
            }

            var1 = gx.f(var3 + 24, super.b + var2);
            var2 = gx.f(var3 + 24, super.b);
            if (var1 == 80 && var2 == 80) {
               this.n = this.p;
               this.m = super.b;
               AutoController.h();
               AutoController.s();
               return true;
            }
         }

         return false;
      }
   }

   public void b(Graphics var1, int var2, int var3, boolean var4) {
   }

   public final void b(int var1, String var2, byte var3) {
      this.x.addElement(new dq(var1, var2, var3));
      this.b();
   }
}
