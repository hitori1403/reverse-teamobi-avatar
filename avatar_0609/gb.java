import java.util.Vector;

final class gb implements gq {
   final gl b;
   private final int d;
   final int e;
   final int f;
   private static final String[] a;

   gb(gl var1, int var2, int var3, int var4) {
      this.b = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
   }

   public final void b() {
      jv var1 = f5.b(this.b.b);
      if (this.d == GameMidlet.k.f && (!f5.d(var1.e) || this.e != 0)) {
         if (this.e == 1) {
            Vector var3;
            Vector var10000 = var3 = new Vector();
            String[] var2 = a;
            var10000.addElement(new ag(var2[2], new gc(this)));
            var3.addElement(new ag(var2[1], new gd(this)));
            var3.addElement(k4.ar);
            k4.b(var2[0], var3);
            return;
         }

         k4.b(hq.dH[this.e], new f_(this.e, this.f, this.b));
      }
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "7Ỽu%PYỼ\u001b}hỨ\u001dHỈ\u001b:;sẐX\r\u00055Ẳh\u001dBÍ\fb\u0011%~ß\r\u00015Ộ%QờLU>sỈS\fI\u008c3|%\f\fAỒ3;mRẛNU3slỼY\r\u0019Ỻu+\u000b;5Ặu\u001d_ỼU1Ẽk\n1¤ub\u001d\u001d\r\u0019Ỻu";
      int var4 = "7Ỽu%PYỼ\u001b}hỨ\u001dHỈ\u001b:;sẐX\r\u00055Ẳh\u001dBÍ\fb\u0011%~ß\r\u00015Ộ%QờLU>sỈS\fI\u008c3|%\f\fAỒ3;mRẛNU3slỼY\r\u0019Ỻu+\u000b;5Ặu\u001d_ỼU1Ẽk\n1¤ub\u001d\u001d\r\u0019Ỻu"
         .length();
      char var1 = 'J';
      int var0 = -1;

      while(true) {
         String var10002 = a(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            a = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '-');
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
               var10005 = 117;
               break;
            case 1:
               var10005 = 93;
               break;
            case 2:
               var10005 = 27;
               break;
            case 3:
               var10005 = 5;
               break;
            case 4:
               var10005 = 61;
               break;
            case 5:
               var10005 = 44;
               break;
            default:
               var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
