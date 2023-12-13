public final class in extends il {
   public String h;
   public String i;
   public int j;
   private int k = 1;
   public int l = 0;
   public int m = 0;

   public in() {
   }

   public in(String var1, int var2) {
      this.h = var1;
      this.j = var2;
   }

   public in(int var1, int var2, String var3) {
      super.a = var1;
      super.b = var2;
      this.h = var3;
   }

   public final void b(int var1) {
      this.l += this.k;
      if (this.l > this.j - var1) {
         this.l = -20;
      }
   }

   public final int hashCode() {
      return 31;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         var1 = var1;
         if (this.h == null && var1.h != null) {
            return false;
         } else {
            return this.m == var1.m;
         }
      }
   }
}
