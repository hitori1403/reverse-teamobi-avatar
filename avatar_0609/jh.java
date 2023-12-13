import java.util.Vector;

public final class jh {
   private Vector b = new Vector();
   private static final String[] a;

   public jh() {
   }

   public jh(jl var1) {
      this();
      if (var1.e() != '[') {
         String[] var2 = a;
         throw var1.b(var2[3]);
      } else if (var1.e() != ']') {
         var1.b();

         while(true) {
            if (var1.e() == ',') {
               var1.b();
               this.b.addElement(null);
            } else {
               var1.b();
               this.b.addElement(var1.f());
            }

            switch(var1.e()) {
               case ',':
               case ';':
                  if (var1.e() == ']') {
                     return;
                  }

                  var1.b();
                  break;
               case ']':
                  return;
               default:
                  throw var1.b(a[2]);
            }
         }
      }
   }

   public final Object b(int var1) {
      Object var10000 = var1 >= 0 && var1 < this.b.size() ? this.b.elementAt(var1) : null;
      Object var2 = var10000;
      if (var10000 == null) {
         String[] var5 = a;
         throw new d(var5[0] + var1 + var5[1]);
      } else {
         return var2;
      }
   }

   public final ji c(int var1) {
      Object var2;
      if ((var2 = this.b(var1)) instanceof ji) {
         return (ji)var2;
      } else {
         String[] var3 = a;
         throw new d(var3[5] + var1 + var3[4]);
      }
   }

   public final String d(int var1) {
      return this.b(var1).toString();
   }

   public final int b() {
      return this.b.size();
   }

   public final String toString() {
      try {
         StringBuffer var10000 = new StringBuffer("[");
         String var2 = ",";
         jh var1 = this;
         int var3 = this.b.size();
         StringBuffer var4 = new StringBuffer();

         for(int var5 = 0; var5 < var3; ++var5) {
            if (var5 > 0) {
               var4.append(var2);
            }

            var4.append(ji.b(var1.b.elementAt(var5)));
         }

         return var10000.append(var4.toString()).append(']').toString();
      } catch (Exception var6) {
         return null;
      }
   }

   static {
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = ")\u0000js\"`a\u0002*~\f>sKR\u00172u\f&KYM\u0015&+UX\u0000fv\u0007sD\u001dD>4C<W\u001dDO4$\"son,\\R\u0011!DDCfv\u001b'\u0005P\u0016agC Q\\\u0011f3\u0014:QUC5HD";
      int var4 = ")\u0000js\"`a\u0002*~\f>sKR\u00172u\f&KYM\u0015&+UX\u0000fv\u0007sD\u001dD>4C<W\u001dDO4$\"son,\\R\u0011!DDCfv\u001b'\u0005P\u0016agC Q\\\u0011f3\u0014:QUC5HD"
         .length();
      char var1 = '\n';
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

                  var2 = ">sLNC||\u0017sD\u001d)A\\-\u001cGW\u0006qgM\n)\u0000js\"`a\u0002*~";
                  var4 = ">sLNC||\u0017sD\u001d)A\\-\u001cGW\u0006qgM\n)\u0000js\"`a\u0002*~".length();
                  var1 = 22;
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
         var10000[0] = (char)(var10000[0] ^ 19);
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
               var10005 = 99;
               break;
            case 1:
               var10005 = 83;
               break;
            case 2:
               var10005 = 37;
               break;
            case 3:
               var10005 = 61;
               break;
            case 4:
               var10005 = 99;
               break;
            case 5:
               var10005 = 18;
               break;
            default:
               var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
