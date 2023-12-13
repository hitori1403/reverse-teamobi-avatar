final class er implements gq {
   private jv b;
   private short c;
   private int d;
   private String e;
   private int f;
   private int g;
   private AutoController h;

   public er(AutoController var1, jv var2, short var3, int var4, String var5, int var6, int var7) {
      this.h = var1;
      this.b = var2;
      this.c = var3;
      this.f = var4;
      this.e = var5;
      this.d = var6;
      this.g = var7;
   }

   public final void b() {
      if (this.f == 100) {
         k4.b(hq.cq, new jr(this.c));
      } else if (this.f == 26) {
         k4.h();
         AutoController.h();
         short var2 = this.c;
         if (AutoController.J != null) {
            jw var3;
            k4.b((var3 = (jw)f5.b((short)var2)).d[0], var3.d[1], new gr(var3), new gs(var3), null);
         }

         fb.g().e();
      } else {
         jv var1 = this.b;
         if (this.b.b == -1) {
            var1 = f5.b(this.c);
         }

         if (this.d != -1 && this.f != 17 && this.f != 18) {
            k4.b(this.e, new eb(this.e, this.d, this.f, this.g));
         } else {
            AutoController.c(var1);
         }
      }
   }
}
