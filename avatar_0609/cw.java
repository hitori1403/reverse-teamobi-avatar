final class cw implements gq {
   private cu b;
   private static final String[] a;

   cw(cu var1) {
      this.b = var1;
   }

   public final void b() {
      ji var1 = new ji();
      long var2 = System.currentTimeMillis();

      try {
         Runtime var4 = Runtime.getRuntime();
         String[] var6 = a;
         var1.b(var6[4], var2);
         var1.b(var6[1], fi.g().A.o.trim());
         var1.b(var6[9], var4.totalMemory() / 1024L);
         var1.b(var6[2], fb.S + ":" + fc.X);
         String var10001 = var6[10];
         String var10002;
         if (System.getProperty(var6[3]) == null) {
            var10002 = var6[6];
         } else {
            var6 = a;
            var10002 = System.getProperty(var6[5]);
         }

         var1.b(var10001, var10002);
      } catch (d var8) {
         var8.printStackTrace();
      }

      try {
         String[] var10 = a;
         new Thread(new makeRequest(new c6(c8.b(var10[11])).b(var1.toString()), var10[8], var10[7], new dy(this, var2))).start();
      } catch (Exception var7) {
         k4.c(a[0]);
      }
   }

   static {
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "y\u009bPYỔy9Bị\t\u0015qq8\bO\u001b\u0015GMqt_\u0015J\u001a\u001fCjt|H)\u001eQ@|p_\u0006\u0004az`|\u0015W\u0001\u0013Glu}S\u001c\u0019Zm>iV\t\u0004Slbt\u0004N\u0001\u001dP\u0015W\u0001\u0013Glu}S\u001c\u0019Zm>iV\t\u0004Slbt\u0004T\u001d\u001cY\u0010]\r\u0004efbpU\f3TsdzR\t\u000fR\u001c\u0004E9?6O\u0018\b@-~|N\u0006W\r\u001dZqi";
      int var4 = "y\u009bPYỔy9Bị\t\u0015qq8\bO\u001b\u0015GMqt_\u0015J\u001a\u001fCjt|H)\u001eQ@|p_\u0006\u0004az`|\u0015W\u0001\u0013Glu}S\u001c\u0019Zm>iV\t\u0004Slbt\u0004N\u0001\u001dP\u0015W\u0001\u0013Glu}S\u001c\u0019Zm>iV\t\u0004Slbt\u0004T\u001d\u001cY\u0010]\r\u0004efbpU\f3TsdzR\t\u000fR\u001c\u0004E9?6O\u0018\b@-~|N\u0006W\r\u001dZqi"
         .length();
      char var1 = 14;
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

                  var2 = "J\u0004\u0011Ae\u007fkW\u0011e\u000f\u0015ASukS\u0007\u0014vb`mY\u0000\u0011";
                  var4 = "J\u0004\u0011Ae\u007fkW\u0011e\u000f\u0015ASukS\u0007\u0014vb`mY\u0000\u0011".length();
                  var1 = '\b';
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
         var10000[0] = (char)(var10000[0] ^ 25);
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
               var10005 = 58;
               break;
            case 1:
               var10005 = 104;
               break;
            case 2:
               var10005 = 112;
               break;
            case 3:
               var10005 = 53;
               break;
            case 4:
               var10005 = 3;
               break;
            case 5:
               var10005 = 16;
               break;
            default:
               var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
