final class hi implements ResponseHandler {
   private fo b;
   private final c6 c;
   private static final String[] a;

   hi(fo var1, c6 var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void handle(String msg) {
      try {
         ji var6 = fo.C = new ji(this.c.c(msg));
         String[] var4 = a;
         k4.b(var6.g(var4[10]));
         if (var6.g(var4[4]).equals(GameMidlet.j.getAppProperty(var4[11]))) {
            k4.c(var6.g(var4[12]), new hj(this, var6));
         } else {
            var4 = a;
            k4.c(var6.g(var4[3]));
         }

         var4 = a;
         if (var6.c(var4[5])) {
            kj.b = true;
            String[] var2 = kq.b(kj.i = var6.g(var4[0]).toLowerCase(), ";");

            for(int var3 = 0; var3 < var2.length; ++var3) {
               kj.n.addElement(var2[var3]);
            }

            var4 = a;
            kj.e = var6.g(var4[16]);
            kj.f = var6.g(var4[13]);
            kj.h = kq.b(var6.g(var4[18]), "|");
            kj.k = var6.d(var4[8]);
            kj.l = var6.g(var4[6]);
            kj.m = var6.c(var4[15]);
            String[] var9;
            k2.c = new int[(var9 = kq.b(var6.g(var4[14]), ",")).length];

            for(int var7 = 0; var7 < var9.length; ++var7) {
               k2.c[var7] = Integer.parseInt(var9[var7]);
            }

            var4 = a;
            var2 = kq.b(var6.g(var4[9]), ",");

            for(int var10 = 0; var10 < var2.length; ++var10) {
               String var10000 = var2[var10];
               DeCaptcha.g.addElement(var2[var10]);
            }

            var4 = a;
            kj.q = var6.g(var4[17]);
            kj.r = var6.d(var4[1]);
            k2.e = var6.d(var4[2]);
            return;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public final void handle() {
      k4.c(a[7]);
   }

   static {
      String[] var5 = new String[19];
      int var3 = 0;
      String var2 = "'\u001a7'yIX\n9\u001c02C|X$\u0017!\u0007&\u0012<\u0012E|z\n>\u0003 2C|U$\u0007-\u0007=\u00166 ^vu\u000e\"\u0000\u0001%Rwo\u0018\u00064#Xko\t.\u0005!=CZs*\u0007\u0016\u0000\u001b°=P9o#Ằd?Ẓ`;/ẜd?^Ởnj\u000b9\u001c%>^w|\u001f\u001a)6\u000e'\u001a7'uut(\u0018\u0011 Rkh\b#\u0016%7yvo\"\u000b\u0006\u001c ~a|i8\u001a+=\b&\u0012-=yvo\"\u0010-\u001a7;zxo(\u001b-=PWt?\u001a\u0007'\u001a7'zxk\u000b\"\u0000\u0005&CvW$\u0014-=\u0006\"\u0000\u0000!Vn";
      int var4 = "'\u001a7'yIX\n9\u001c02C|X$\u0017!\u0007&\u0012<\u0012E|z\n>\u0003 2C|U$\u0007-\u0007=\u00166 ^vu\u000e\"\u0000\u0001%Rwo\u0018\u00064#Xko\t.\u0005!=CZs*\u0007\u0016\u0000\u001b°=P9o#Ằd?Ẓ`;/ẜd?^Ởnj\u000b9\u001c%>^w|\u001f\u001a)6\u000e'\u001a7'uut(\u0018\u0011 Rkh\b#\u0016%7yvo\"\u000b\u0006\u001c ~a|i8\u001a+=\b&\u0012-=yvo\"\u0010-\u001a7;zxo(\u001b-=PWt?\u001a\u0007'\u001a7'zxk\u000b\"\u0000\u0005&CvW$\u0014-=\u0006\"\u0000\u0000!Vn"
         .length();
      char var1 = 7;
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
                     a = var5;
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

                  var2 = "9\u001c02C|U*\u001e!\b'\u001a7'z|u>";
                  var4 = "9\u001c02C|U*\u001e!\b'\u001a7'z|u>".length();
                  var1 = '\n';
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
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
               var10005 = 75;
               break;
            case 1:
               var10005 = 115;
               break;
            case 2:
               var10005 = 68;
               break;
            case 3:
               var10005 = 83;
               break;
            case 4:
               var10005 = 55;
               break;
            case 5:
               var10005 = 25;
               break;
            default:
               var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
