import java.util.Vector;

public final class kj implements gq, Runnable {
   public static boolean b;
   private int c;
   static int d;
   static String e;
   static String f;
   static boolean g;
   static String[] h;
   static String i;
   static boolean j;
   static int k;
   static String l;
   static boolean m;
   static Vector n;
   public static boolean o;
   public static boolean p;
   public static String q;
   public static int r;
   private static final String[] s;

   static {
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "bẚ\u000e\u000eũÿ\u000bKSếGXčỲN\\@M\u0010ỵH\u0000Uţ@\u001f<JUO\u000f\u000eũýEH\u001b\u0002A\u000bo\u0005\u0000z\u0015Z\u0017<EÀB@]ễ<HHẌ\u000e\u000e\u0010ả_\u0000OễZX\u007fẈ\u0000O\bÚ\u0016{\u000bBÚ\u000f\u000e\u001btD\u0000Īở@XwCI\u001b\u0002ẏ\u0016<_ẏO@O\rhD\u0000O\u008cCXr[C\u001aN\u000e:ẽE\u0000U\u008a@XhẄT\u001b\u0001[\fs\u000bT×\r\u000e\u0016lH\u0000O\u0012ƞả\u007f\u000bKS\t\u000e\ftỚC\u001b\bGếr\u000bCÚ\u0003\u000e\ftJO\u001b\u0014Ï\u001b<@HÚ\u0003\u000e\u0016tÂ\rvÛ\u000f\u000e\u0013t^\u0000O\u0012ỿ\u0016{\fnk#\u000e+tDRO\u0003[\f\ba_\u0016O\u0016\u007fND¶bẚ\u000e\u000eũÿ\u000bKSếGXčỲN\\@M\u0010ỵH\u0000Uţ@\u001f<JUO\u000f\u000eũýEH\u001b\u0002A\u000bo\u0005\u0000z\u0015Z\u0017<EÀB@]ễ<HHẌ\u000e\u000e\u0010ả_\u0000OễZX\u007fẈ\u0000O\bÚ\u0016{\u000bBÚ\u000f\u000e\u001btD\u0000Īở@XwCI\u001b\u0002ẏ\u0016<_ẏO@O\rhD\u0000O\u008cCXr[C\u001aN\u000e:ẽE\u0000U\u008a@XhẄT\u001b\u0001[\fs\u000bT×\r\u000e\u0016lH\u0000O\u0012ƞả\u007f\u000bKS\t\u000e\ftỚC\u001b\bGếr\u000bCÚ\u0003\u000e\ftJO\u001b\u0014Ï\u001b<@HÚ\u0003\u000e\u0016tÂ\u0005\u001a\u001b/h>¼bẚ\u000e\u000eũÿ\u000bKSếGXčỲN\\@M\u0010ỵH\u0000Uţ@\u001f<JUO\u000f\u000e\roN\u0000I\u000fZ\u0019hN\u0000X\u000fJ\u001d2\u000baN\u0014AXrËY\u001b\u0013ẓX\u007fCẗU@Fệh\u000bTẞ\u0014\u000e\u001bế\u000bTS\u0094@\u001f<IÁT@M\u0010s\u000bıẄ\u000e\u000e\u0013tB\u0000Yề@XhẄT\u001b\u0001[\fs\u000bT×\r\u000e\u0016lH\u0001\u0015@lộr\u000bNÑ\u000e\u000e\fẳ_\u0000Z\u0015Z\u0017<_ÌV@@\b\u007f\u000bTIǐỵ\u001b<@HR@Z\u0010ửH\u0000S\tứ\u0016<HÁX@Z\u0010}D\u0000O\u0081MXwCÁX@@\u0010õBbẚ\u000e\u000e\u0016öE\u0000OỏZX}^TT@Z\u0094q\u000bNK\u0003\u000e\fnƛỻX@E\u0010u\u000bTSẑMXtBủU@M\u0099\u007f\u000bTS\u0001AXhÊC\u001b\u000bF\u0099\u007f\u000bNS\u0089\u0004\u001a\u001b/`";
      int var4 = "bẚ\u000e\u000eũÿ\u000bKSếGXčỲN\\@M\u0010ỵH\u0000Uţ@\u001f<JUO\u000f\u000eũýEH\u001b\u0002A\u000bo\u0005\u0000z\u0015Z\u0017<EÀB@]ễ<HHẌ\u000e\u000e\u0010ả_\u0000OễZX\u007fẈ\u0000O\bÚ\u0016{\u000bBÚ\u000f\u000e\u001btD\u0000Īở@XwCI\u001b\u0002ẏ\u0016<_ẏO@O\rhD\u0000O\u008cCXr[C\u001aN\u000e:ẽE\u0000U\u008a@XhẄT\u001b\u0001[\fs\u000bT×\r\u000e\u0016lH\u0000O\u0012ƞả\u007f\u000bKS\t\u000e\ftỚC\u001b\bGếr\u000bCÚ\u0003\u000e\ftJO\u001b\u0014Ï\u001b<@HÚ\u0003\u000e\u0016tÂ\rvÛ\u000f\u000e\u0013t^\u0000O\u0012ỿ\u0016{\fnk#\u000e+tDRO\u0003[\f\ba_\u0016O\u0016\u007fND¶bẚ\u000e\u000eũÿ\u000bKSếGXčỲN\\@M\u0010ỵH\u0000Uţ@\u001f<JUO\u000f\u000eũýEH\u001b\u0002A\u000bo\u0005\u0000z\u0015Z\u0017<EÀB@]ễ<HHẌ\u000e\u000e\u0010ả_\u0000OễZX\u007fẈ\u0000O\bÚ\u0016{\u000bBÚ\u000f\u000e\u001btD\u0000Īở@XwCI\u001b\u0002ẏ\u0016<_ẏO@O\rhD\u0000O\u008cCXr[C\u001aN\u000e:ẽE\u0000U\u008a@XhẄT\u001b\u0001[\fs\u000bT×\r\u000e\u0016lH\u0000O\u0012ƞả\u007f\u000bKS\t\u000e\ftỚC\u001b\bGếr\u000bCÚ\u0003\u000e\ftJO\u001b\u0014Ï\u001b<@HÚ\u0003\u000e\u0016tÂ\u0005\u001a\u001b/h>¼bẚ\u000e\u000eũÿ\u000bKSếGXčỲN\\@M\u0010ỵH\u0000Uţ@\u001f<JUO\u000f\u000e\roN\u0000I\u000fZ\u0019hN\u0000X\u000fJ\u001d2\u000baN\u0014AXrËY\u001b\u0013ẓX\u007fCẗU@Fệh\u000bTẞ\u0014\u000e\u001bế\u000bTS\u0094@\u001f<IÁT@M\u0010s\u000bıẄ\u000e\u000e\u0013tB\u0000Yề@XhẄT\u001b\u0001[\fs\u000bT×\r\u000e\u0016lH\u0001\u0015@lộr\u000bNÑ\u000e\u000e\fẳ_\u0000Z\u0015Z\u0017<_ÌV@@\b\u007f\u000bTIǐỵ\u001b<@HR@Z\u0010ửH\u0000S\tứ\u0016<HÁX@Z\u0010}D\u0000O\u0081MXwCÁX@@\u0010õBbẚ\u000e\u000e\u0016öE\u0000OỏZX}^TT@Z\u0094q\u000bNK\u0003\u000e\fnƛỻX@E\u0010u\u000bTSẑMXtBủU@M\u0099\u007f\u000bTS\u0001AXhÊC\u001b\u000bF\u0099\u007f\u000bNS\u0089\u0004\u001a\u001b/`"
         .length();
      char var1 = 182;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = a(a(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     s = var5;
                     n = new Vector();
                     o = false;
                     p = false;
                     r = 0;
                     return;
                  }

                  var1 = var2.charAt(var7);
                  break;
               default:
                  var5[var3++] = var12;
                  if ((var7 += var1) < var4) {
                     var1 = var2.charAt(var7);
                     continue label24;
                  }

                  var2 = "bÚ\u000f\u000e\u001c}EH\u001b\u0013ởXwBủU¼bẚ\u000e\u000eũÿ\u000bKSếGXčỲN\\@M\u0010ỵH\u0000Uţ@\u001f<JUO\u000f\u000e\roN\u0000I\u000fZ\u0019hN\u0000X\u000fJ\u001d2\u000baN\u0014AXrËY\u001b\u0013ẓX\u007fCẗU@Fệh\u000bTẞ\u0014\u000e\u001bế\u000bTS\u0094@\u001f<IÁT@M\u0010s\u000bıẄ\u000e\u000e\u0013tB\u0000Yề@XhẄT\u001b\u0001[\fs\u000bT×\r\u000e\u0016lH\u0001\u0015@lộr\u000bNÑ\u000e\u000e\fẳ_\u0000Z\u0015Z\u0017<_ÌV@@\b\u007f\u000bTIǐỵ\u001b<@HR@Z\u0010ửH\u0000S\tứ\u0016<HÁX@Z\u0010}D\u0000O\u0081MXwCÁX@@\u0010õ";
                  var4 = "bÚ\u000f\u000e\u001c}EH\u001b\u0013ởXwBủU¼bẚ\u000e\u000eũÿ\u000bKSếGXčỲN\\@M\u0010ỵH\u0000Uţ@\u001f<JUO\u000f\u000e\roN\u0000I\u000fZ\u0019hN\u0000X\u000fJ\u001d2\u000baN\u0014AXrËY\u001b\u0013ẓX\u007fCẗU@Fệh\u000bTẞ\u0014\u000e\u001bế\u000bTS\u0094@\u001f<IÁT@M\u0010s\u000bıẄ\u000e\u000e\u0013tB\u0000Yề@XhẄT\u001b\u0001[\fs\u000bT×\r\u000e\u0016lH\u0001\u0015@lộr\u000bNÑ\u000e\u000e\fẳ_\u0000Z\u0015Z\u0017<_ÌV@@\b\u007f\u000bTIǐỵ\u001b<@HR@Z\u0010ửH\u0000S\tứ\u0016<HÁX@Z\u0010}D\u0000O\u0081MXwCÁX@@\u0010õ"
                     .length();
                  var1 = 16;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   kj(int var1) {
      this.c = var1;
   }

   public final void b() {
      switch(this.c) {
         case 1:
            Vector var9;
            Vector var10000 = var9 = new Vector();
            String[] var18 = s;
            var10000.addElement(new ag(var18[3], new kk(this)));
            var9.addElement(new ag(var18[2], new kl(this)));
            var9.addElement(new ag(var18[1], new kj(3)));
            var9.addElement(new ag(var18[9], new kj(4)));
            f1.d().b(var9, 2);
            return;
         case 2:
            String[] var17 = s;
            k4.b(var17[7]);
            if (g = !g) {
               (kd.e = new k2()).setPriority(4);
               kd.e.start();
               return;
            } else {
               try {
                  kd.e.interrupt();
                  return;
               } catch (Exception var8) {
                  return;
               }
            }
         case 3:
            gx.N = 300;
            gx.O = 100;
            hv.b().b(12, -1);
            return;
         case 4:
            if (gx.b == 0) {
               hv.b().b(l);
               return;
            }

            if (GameMidlet.f == 9) {
               gx.N = 300;
               gx.O = 100;
               hv.b().b(0, -1);
            } else {
               fc.g().L = 0;
               gx.N = 300;
               gx.O = 100;
               hx.b().g(9);
            }

            j = !gk.b;
            return;
         case 5:
            Vector var1 = new Vector();
            h.b();
            String var3 = ";";
            String var2 = i;
            Vector var4 = new Vector();
            var3 = var3;
            if (!var2.endsWith(var3)) {
               var2 = var2 + var3;
            }

            int var5 = 0;

            for(int var6 = var2.indexOf(var3); var6 != -1; var6 = var2.indexOf(var3, var5)) {
               var4.addElement(var2.substring(var5, var6));
               var5 = var6 + var3.length();
            }

            String[] var10 = new String[var4.size()];
            var4.copyInto(var10);
            String[] var11 = var10;

            for(int var13 = 0; var13 < var11.length; ++var13) {
               ag var10001 = new ag;
               StringBuffer var10003 = new StringBuffer(String.valueOf(var11[var13]));
               String var10004;
               if (n.contains(var11[var13])) {
                  String[] var15 = s;
                  var10004 = var15[8];
               } else {
                  String[] var16 = s;
                  var10004 = var16[5];
               }

               var10001./* $VF: Unable to resugar constructor */<init>(var10003.append(var10004).toString(), new kn(this, var11[var13]));
               var1.addElement(var10001);
            }

            f1.d().b(var1, 2);
            return;
         case 6:
            if (o = !o) {
               String[] var14 = s;
               k4.b(var14[4]);
               k4.c(var14[0]);
            }

            return;
         case 7:
            if (p = !p) {
               String[] var7 = s;
               k4.b(var7[10]);
               k4.c(var7[6]);
            }

            return;
      }
   }

   public final void run() {
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '+');
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
               var10005 = 32;
               break;
            case 1:
               var10005 = 59;
               break;
            case 2:
               var10005 = 96;
               break;
            case 3:
               var10005 = 46;
               break;
            case 4:
               var10005 = 120;
               break;
            case 5:
               var10005 = 28;
               break;
            default:
               var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
