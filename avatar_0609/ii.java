import java.util.Hashtable;
import java.util.Vector;

final class ii implements gq {
   private int b;
   private ih c;
   private static final String a;

   ii(ih var1, int var2) {
      this.c = var1;
      this.b = var2;
   }

   private static void b(int var0) {
      f1.d().p = var0;
      f1.d().l = false;
      f1.d().g();
   }

   public final void b() {
      switch(this.b) {
         case 1:
            Vector var1;
            (var1 = new Vector()).addElement(new ag(kq.q[1] + kq.b(GameMidlet.k.aS), new ii(this.c, 2)));
            var1.addElement(new ag(a + kq.b(e8.y), new ii(this.c, 5)));
            var1.addElement(new ag(kq.r[0], new ii(this.c, 4)));
            f1.d().b(var1, 2);
            return;
         case 2:
            GameMidlet.k.aS = !GameMidlet.k.aS;
            this.b = 1;
            this.b();
            b(0);
            return;
         case 3:
         default:
            return;
         case 4:
            e7.n = null;
            e7.e().b(new Hashtable(), kq.r[0], kq.r[1], (byte)-1);
            k4.D = e7.e();
            return;
         case 5:
            e8.y = !e8.y;
            this.b = 1;
            this.b();
            b(1);
            return;
         case 6:
            fk.ag = !fk.ag;
            return;
         case 7:
            fk.af = !fk.af;
      }
   }

   static {
      String var10002 = a(a("(\u001aỾ\u000bB\u001dw\u0094\u001d^E\u0016\u0000qZS"));
      boolean var10001 = true;
      a = var10002;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   private static String a(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 96;
               break;
            case 1:
               var10005 = 115;
               break;
            case 2:
               var10005 = 57;
               break;
            case 3:
               var10005 = 101;
               break;
            case 4:
               var10005 = 98;
               break;
            case 5:
               var10005 = 105;
               break;
            default:
               var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
