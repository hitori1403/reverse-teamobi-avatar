import javax.microedition.lcdui.Graphics;

public final class b3 {
   public byte b;
   public byte c;
   public int d;
   public int e;
   public int f;
   public boolean g;
   public boolean h;
   public int[] i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;

   public b3(byte var1, boolean var2) {
      this(var1);
      if (var2) {
         this.i = new int[]{11, 12, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      }
   }

   public b3(byte var1) {
      this.c = var1;
      this.b = 0;
      this.j = this.c % 4;
      this.k = this.c / 4;
      this.l = this.j < 2 ? 0 : 1;
      this.i = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
   }

   public final void b(Graphics var1) {
      k4.aa.b(var1, this);
   }

   public final void c(Graphics var1) {
      k4.aa.c(var1, this);
   }

   public final void d(Graphics var1) {
      k4.aa.d(var1, this);
   }

   public final void b(Graphics var1, boolean var2) {
      k4.aa.b(var1, this, var2);
   }

   public final int b() {
      if (this.d == this.n && this.e == this.m) {
         return -1;
      } else if (Math.abs((this.n - this.d) / 2) <= 1 && Math.abs((this.m - this.e) / 2) <= 1) {
         this.d = this.n;
         this.e = this.m;
         return 0;
      } else {
         if (this.d != this.n) {
            this.d += (this.n - this.d) / 2;
         }

         if (this.e != this.m) {
            this.e += (this.m - this.e) / 2;
         }

         return b2.b(this.d, this.e, this.n, this.m) <= this.f / 5 ? 2 : 1;
      }
   }
}
