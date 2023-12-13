public class iy extends iu {
   public int Q = 0;
   public byte R;

   public iy(int var1, byte var2) {
      super(0, 0, var1, var2);
   }

   public void a() {
      super.a();
   }

   public final void g() {
      super.g();
      if (!super.E && super.f == this.Q && super.B > 150) {
         super.B = 150;
      }
   }

   public void c() {
   }

   public is j() {
      return (is)fj.K[this.R].elementAt(b2.e(fj.K[this.R].size()));
   }

   public final void d() {
      if (!super.E && this.Q == super.f) {
         this.h();
      } else {
         cn var1 = new cn();
         if (super.E && fj.K[this.R].size() > 0) {
            is var5;
            if ((var5 = this.j()) != null) {
               var1.b = var5.a;
               var1.c = var5.b;
               super.p = 2;
               super.M = var1;
            } else {
               this.h();
            }
         } else {
            int var2 = gx.n.size();

            for(int var3 = 0; var3 < var2; ++var3) {
               it var4;
               if ((var4 = (it)gx.n.elementAt(var3)) instanceof iy && var4.f == this.Q) {
                  var1 = new cn(var4.a, var4.b);
                  break;
               }
            }

            if (this.R != 1 && !gx.e(super.a, super.b)) {
               this.h();
            } else {
               this.b(var1);
            }
         }
      }
   }

   public void b(cn var1) {
   }

   public final void i() {
      int var1 = fj.K[this.R].size();
      if (super.H && super.E && var1 > 0) {
         for(int var2 = 0; var2 < var1; ++var2) {
            is var3;
            if (b2.f((var3 = (is)fj.K[this.R].elementAt(var2)).a - super.a) <= 2 && b2.f(var3.b - super.b) <= 2) {
               fj.K[this.R].removeElement(var3);
               gx.o.removeElement(var3);
               super.H = false;
               super.E = false;
               super.p = 1;
               fj.g();
               fj.c(var3.o, super.f);
               break;
            }
         }
      }

      super.i();
      super.D = 100 - (this.Q != super.f ? this.R * b2.e(70) : 0);
   }

   public final void e() {
      if (fj.K[this.R].size() == 0) {
         super.E = false;
      } else if (super.H && !super.E) {
         super.E = true;
      }
   }
}
