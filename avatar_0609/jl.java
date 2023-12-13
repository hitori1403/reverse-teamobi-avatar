public final class jl {
   private int b = 0;
   private String c;
   private static final String[] a;

   public jl(String var1) {
      this.c = var1;
   }

   public final void b() {
      if (this.b > 0) {
         --this.b;
      }
   }

   private boolean c() {
      return this.b < this.c.length();
   }

   public final char d() {
      if (this.c()) {
         char var1 = this.c.charAt(this.b);
         ++this.b;
         return var1;
      } else {
         return '\u0000';
      }
   }

   private String b(int var1) {
      int var2 = this.b;
      int var3;
      if ((var3 = this.b + var1) >= this.c.length()) {
         throw this.b(a[5]);
      } else {
         this.b += var1;
         return this.c.substring(var2, var3);
      }
   }

   public final char e() {
      label50:
      while(true) {
         char var1;
         if ((var1 = this.d()) == '/') {
            switch(this.d()) {
               case '*':
                  while((var1 = this.d()) != false) {
                     if (var1 == '*') {
                        if (this.d() == '/') {
                           continue label50;
                        }

                        this.b();
                     }
                  }

                  throw this.b(a[4]);
               case '/':
                  while((var1 = this.d()) != true && var1 != true && var1 != false) {
                  }
                  break;
               default:
                  this.b();
                  return '/';
            }
         } else if (var1 == '#') {
            while((var1 = this.d()) != true && var1 != true && var1 != false) {
            }
         } else if (var1 == 0 || var1 > ' ') {
            return var1;
         }
      }
   }

   public final Object f() {
      char var1;
      switch(var1 = this.e()) {
         case '"':
         case '\'':
            char var2 = var1;
            jl var10 = this;
            StringBuffer var4 = new StringBuffer();

            while(true) {
               char var3;
               switch(var3 = var10.d()) {
                  case '\u0000':
                  case '\n':
                  case '\r':
                     String[] var5 = a;
                     throw var10.b(var5[9]);
                  case '\\':
                     switch(var3 = var10.d()) {
                        case 'b':
                           var4.append('\b');
                           continue;
                        case 'f':
                           var4.append('\f');
                           continue;
                        case 'n':
                           var4.append('\n');
                           continue;
                        case 'r':
                           var4.append('\r');
                           continue;
                        case 't':
                           var4.append('\t');
                           continue;
                        case 'u':
                           var4.append((char)Integer.parseInt(var10.b(4), 16));
                           continue;
                        case 'x':
                           var4.append((char)Integer.parseInt(var10.b(2), 16));
                           continue;
                        default:
                           var4.append(var3);
                           continue;
                     }
                  default:
                     if (var3 == var2) {
                        return var4.toString();
                     }

                     var4.append(var3);
               }
            }
         case '[':
            this.b();
            return new jh(this);
         case '{':
            this.b();
            return new ji(this);
         default:
            StringBuffer var12 = new StringBuffer();

            char var14;
            for(var14 = var1; var1 >= ' '; var1 = this.d()) {
               String[] var15 = a;
               if (var15[7].indexOf(var1) >= 0) {
                  break;
               }

               var12.append(var1);
            }

            this.b();
            String var11;
            if ((var11 = var12.toString().trim()).equals("")) {
               String[] var18 = a;
               throw this.b(var18[1]);
            } else {
               String var10000 = var11.toLowerCase();
               String[] var16 = a;
               if (var10000.equals(var16[0])) {
                  return ji.b;
               } else {
                  var10000 = var11.toLowerCase();
                  var16 = a;
                  if (var10000.equals(var16[2])) {
                     return ji.c;
                  } else if (var11.toLowerCase().equals(a[8])) {
                     return ji.e;
                  } else if ((var14 < '0' || var14 > '9') && var14 != '.' && var14 != '-' && var14 != '+') {
                     return var11;
                  } else {
                     label92:
                     if (var14 != '0') {
                        try {
                           return Integer.valueOf(var11);
                        } catch (Exception var7) {
                           try {
                              return new Long(Long.parseLong(var11));
                           } catch (Exception var6) {
                              return var11;
                           }
                        }
                     } else if (var11.length() > 2 && (var11.charAt(1) == 'x' || var11.charAt(1) == 'X')) {
                        try {
                           return new Integer(Integer.parseInt(var11.substring(2), 16));
                        } catch (Exception var9) {
                           break label92;
                        }
                     } else {
                        try {
                           return new Integer(Integer.parseInt(var11, 8));
                        } catch (Exception var8) {
                           break label92;
                        }
                     }
                  }
               }
            }
      }
   }

   public final d b(String var1) {
      return new d(var1 + this.toString());
   }

   public final String toString() {
      String[] var1 = a;
      return var1[6] + this.b + var1[3] + this.c;
   }

   static {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "NiQ\u0006\u000ewrW\u0010Ojx\u001amE\u000fSa1\u0005\\zH\u0010C\u0004\u001atBC\u0011ouG\u000fIwz^;G\fKizTo\n\u0016inF\u0010RvvT|\u0004\u0001Iqq^h\u0004\u0006TvpH\u000e\u001azPCEl~HzG\u0017Cv?\f\u0016!y\u001e\tX=a`\u001f^\u0005";
      int var4 = "NiQ\u0006\u000ewrW\u0010Ojx\u001amE\u000fSa1\u0005\\zH\u0010C\u0004\u001atBC\u0011ouG\u000fIwz^;G\fKizTo\n\u0016inF\u0010RvvT|\u0004\u0001Iqq^h\u0004\u0006TvpH\u000e\u001azPCEl~HzG\u0017Cv?\f\u0016!y\u001e\tX=a`\u001f^\u0005"
         .length();
      char var1 = 4;
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

                  var2 = "TnH\u000f\u0013ouP\u0006TivTzP\u0006B$lNiM\rA";
                  var4 = "TnH\u000f\u0013ouP\u0006TivTzP\u0006B$lNiM\rA".length();
                  var1 = 4;
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
               var10005 = 58;
               break;
            case 1:
               var10005 = 27;
               break;
            case 2:
               var10005 = 36;
               break;
            case 3:
               var10005 = 99;
               break;
            case 4:
               var10005 = 38;
               break;
            case 5:
               var10005 = 4;
               break;
            default:
               var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
