import java.util.Vector;

final class kh implements gq {
   private int b;

   kh(int var1) {
      this.b = var1;
   }

   public final void b() {
      short var1 = 0;
      int[] var2 = null;
      switch(this.b) {
         case 0:
            var1 = 2135;
            break;
         case 1:
            var1 = 2136;
            break;
         case 2:
            var2 = new int[]{443, 447, 448};
            break;
         case 3:
            var1 = 2396;
      }

      Vector var3 = GameMidlet.m;

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         gl var5 = (gl)var3.elementAt(var4);
         if (var1 != 0 && var5.b == var1) {
            hx.b().b(var1, 1);
            if (this.b == 0) {
               if (fu.aU > 0) {
                  --fu.aU;
               } else if (fs.U > 0) {
                  --fs.U;
               }
            } else if (this.b == 1 && fu.aT > 0) {
               --fu.aT;
            }
         }

         if (var2 != null) {
            for(int var6 = 0; var6 < var2.length; ++var6) {
               if (var5.b == var2[var6]) {
                  hx.b().b(var2[var6], 1);
               }
            }
         }
      }

      e_.g().a(6, -1);
   }
}
