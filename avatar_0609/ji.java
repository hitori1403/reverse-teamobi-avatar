import java.util.Enumeration;
import java.util.Hashtable;

public final class ji {
   public static final Boolean b;
   public static final Boolean c;
   private Hashtable d = new Hashtable();
   public static final Object e;
   private static final String[] a;

   static {
      String[] var5 = new String[25];
      int var3 = 0;
      String var2 = "P\r\u0005:\u0002x\u001d\tj\n\u001c3}H@]Q\u001aa\u0007\u0000:>W@@_\u0011\u007fz\u0019\u0002\u0004\u001e\u0016+8Q\u0005E_\u001b:$\u000bn,?\u0011\u0012AOA\u001c\u0004\u0004\u0002x\u0019\u0012y_\u0019,}MJP_\u0011\u007f3VHF\u001a\u0002q\u001df\u001e\u0014\u007f+BIQ\u001aP9/LH\u0004\u000b\u001f\u0015\u000elkw\u000b\u000263D\u001f\u0004\u0003\u0014O@\u0005B\u001e\u001c,8\u0015a\u0007\u0000:>W@@_\u0011\u007fz\u000f\u0002\u0004\u0010\u0002\u007fz^\u0002\u0004J\n\u001c3\u0002x\u000b%e_:\f\u0012mjF\u0015\u0015<)\u0003QA\u0007\u0004\u007f0VVP_\u0012::JK\u0004\b\u0019+5\u0003\u0002_X\u0012y_\u0019,}MJP_\u0011\u007f3VHF\u001a\u0002q\u0013y_\u0019,}MJP_\u0011\u007f\u001fLJH\u001a\u00111s\fj\n\u001c3}SJM\u0011\u0004:/\fy_\u001e0)\u0003CK\n\u001e;s#e_:\f\u0012mjF\u0015\u0015<)\u0003QA\u0007\u0004\u007f0VVP_\u001519\u0003RM\u000b\u0018\u007fz^\u0002\u0015y_\u0019,}MJP_\u0011\u007f\u0017pjj>\u0002-<Z\u000b\u0002\u0006]\u0002x\n\u000bn,?\u0011\u0012AOA\u001c\u0004\u0004";
      int var4 = "P\r\u0005:\u0002x\u001d\tj\n\u001c3}H@]Q\u001aa\u0007\u0000:>W@@_\u0011\u007fz\u0019\u0002\u0004\u001e\u0016+8Q\u0005E_\u001b:$\u000bn,?\u0011\u0012AOA\u001c\u0004\u0004\u0002x\u0019\u0012y_\u0019,}MJP_\u0011\u007f3VHF\u001a\u0002q\u001df\u001e\u0014\u007f+BIQ\u001aP9/LH\u0004\u000b\u001f\u0015\u000elkw\u000b\u000263D\u001f\u0004\u0003\u0014O@\u0005B\u001e\u001c,8\u0015a\u0007\u0000:>W@@_\u0011\u007fz\u000f\u0002\u0004\u0010\u0002\u007fz^\u0002\u0004J\n\u001c3\u0002x\u000b%e_:\f\u0012mjF\u0015\u0015<)\u0003QA\u0007\u0004\u007f0VVP_\u0012::JK\u0004\b\u0019+5\u0003\u0002_X\u0012y_\u0019,}MJP_\u0011\u007f3VHF\u001a\u0002q\u0013y_\u0019,}MJP_\u0011\u007f\u001fLJH\u001a\u00111s\fj\n\u001c3}SJM\u0011\u0004:/\fy_\u001e0)\u0003CK\n\u001e;s#e_:\f\u0012mjF\u0015\u0015<)\u0003QA\u0007\u0004\u007f0VVP_\u001519\u0003RM\u000b\u0018\u007fz^\u0002\u0015y_\u0019,}MJP_\u0011\u007f\u0017pjj>\u0002-<Z\u000b\u0002\u0006]\u0002x\n\u000bn,?\u0011\u0012AOA\u001c\u0004\u0004"
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
                     b = Boolean.TRUE;
                     c = Boolean.FALSE;
                     e = new jj((byte)0);
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

                  var2 = "x\r\u0002x\u0011";
                  var4 = "x\r\u0002x\u0011".length();
                  var1 = 2;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public ji() {
   }

   public ji(jl var1) {
      this();
      if (var1.e() != '{') {
         String[] var6 = a;
         throw var1.b(var6[13]);
      } else {
         while(true) {
            switch(var1.e()) {
               case '\u0000':
                  String[] var4 = a;
                  throw var1.b(var4[18]);
               case '}':
                  return;
            }

            var1.b();
            String var3 = var1.f().toString();
            char var2;
            if ((var2 = var1.e()) == true) {
               if (var1.d() != '>') {
                  var1.b();
               }
            } else if (var2 != ':') {
               String[] var5 = a;
               throw var1.b(var5[3]);
            }

            this.b(var3, var1.f());
            switch(var1.e()) {
               case ',':
               case ';':
                  if (var1.e() == '}') {
                     return;
                  }

                  var1.b();
                  break;
               case '}':
                  return;
               default:
                  throw var1.b(a[10]);
            }
         }
      }
   }

   public ji(String var1) {
      this(new jl(var1));
   }

   private Object b(String var1) {
      Object var10000 = var1 == null ? null : this.d.get(var1);
      Object var2 = var10000;
      if (var10000 == null) {
         String[] var4 = a;
         throw new d(var4[22] + h(var1) + var4[17]);
      } else {
         return var2;
      }
   }

   public final boolean c(String var1) {
      Object var2;
      if (!(var2 = this.b(var1)).equals(c)) {
         if (var2 instanceof String) {
            String var10000 = ((String)var2).toLowerCase();
            String[] var3 = a;
            if (var10000.equals(var3[9])) {
               return false;
            }
         }

         if (!var2.equals(b)) {
            if (var2 instanceof String) {
               String var6 = ((String)var2).toLowerCase();
               String[] var4 = a;
               if (var6.equals(var4[0])) {
                  return true;
               }
            }

            String[] var5 = a;
            throw new d(var5[22] + h(var1) + var5[15]);
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public final int d(String var1) {
      Object var2;
      if ((var2 = this.b(var1)) instanceof Byte) {
         return (Byte)var2;
      } else if (var2 instanceof Short) {
         return (Short)var2;
      } else if (var2 instanceof Integer) {
         return (Integer)var2;
      } else if (var2 instanceof Long) {
         return (int)((Long)var2).longValue();
      } else {
         String[] var3 = a;
         throw new d(var3[22] + h(var1) + var3[6]);
      }
   }

   public final jh e(String var1) {
      Object var2;
      if ((var2 = this.b(var1)) instanceof jh) {
         return (jh)var2;
      } else {
         String[] var3 = a;
         throw new d(var3[22] + h(var1) + var3[19]);
      }
   }

   public final long f(String var1) {
      Object var2;
      if ((var2 = this.b(var1)) instanceof Byte) {
         return (long)((Byte)var2).byteValue();
      } else if (var2 instanceof Short) {
         return (long)((Short)var2).shortValue();
      } else if (var2 instanceof Integer) {
         return (long)((Integer)var2).intValue();
      } else if (var2 instanceof Long) {
         return (Long)var2;
      } else {
         String[] var3 = a;
         throw new d(var3[4] + h(var1) + var3[14]);
      }
   }

   public final String g(String var1) {
      return this.b(var1).toString();
   }

   public final ji b(String var1, long var2) {
      this.b(var1, new Long(var2));
      return this;
   }

   public final ji b(String var1, Object var2) {
      if (var1 == null) {
         throw new d(a[2]);
      } else {
         if (var2 != null) {
            this.d.put(var1, var2);
         } else {
            this.i(var1);
         }

         return this;
      }
   }

   private static String h(String var0) {
      if (var0 != null && var0.length() != 0) {
         char var2 = 0;
         int var4 = var0.length();
         StringBuffer var5;
         (var5 = new StringBuffer(var4 + 4)).append('"');

         for(int var3 = 0; var3 < var4; ++var3) {
            char var1 = var2;
            switch(var2 = var0.charAt(var3)) {
               case '\b':
                  String[] var12 = a;
                  var5.append(var12[1]);
                  break;
               case '\t':
                  String[] var11 = a;
                  var5.append(var11[12]);
                  break;
               case '\n':
                  String[] var10 = a;
                  var5.append(var10[24]);
                  break;
               case '\f':
                  String[] var9 = a;
                  var5.append(var9[5]);
                  break;
               case '\r':
                  String[] var8 = a;
                  var5.append(var8[23]);
                  break;
               case '"':
               case '\\':
                  var5.append('\\');
                  var5.append(var2);
                  break;
               case '/':
                  if (var1 == '<') {
                     var5.append('\\');
                  }

                  var5.append(var2);
                  break;
               default:
                  if (var2 < ' ') {
                     String[] var13 = a;
                     String var7 = var13[8] + Integer.toHexString(var2);
                     var5.append(var13[21] + var7.substring(var7.length() - 4));
                  } else {
                     var5.append(var2);
                  }
            }
         }

         var5.append('"');
         return var5.toString();
      } else {
         String[] var6 = a;
         return var6[20];
      }
   }

   private Object i(String var1) {
      return this.d.remove(var1);
   }

   public final String toString() {
      try {
         Enumeration var1 = this.d.keys();
         StringBuffer var2 = new StringBuffer("{");

         while(var1.hasMoreElements()) {
            if (var2.length() > 1) {
               var2.append(',');
            }

            Object var3 = var1.nextElement();
            var2.append(h(var3.toString()));
            var2.append(':');
            var2.append(b(this.d.get(var3)));
         }

         var2.append('}');
         return var2.toString();
      } catch (Exception var4) {
         return null;
      }
   }

   static String b(Object var0) {
      if (var0 == null || var0.equals(null)) {
         String[] var5 = a;
         return var5[11];
      } else if (var0 instanceof jk) {
         try {
            var0 = ((jk)var0).b();
         } catch (Exception var2) {
            throw new d(var2);
         }

         if (var0 instanceof String) {
            return var0;
         } else {
            String[] var1 = a;
            throw new d(var1[7].concat(String.valueOf(var0)));
         }
      } else if (var0 instanceof Byte || var0 instanceof Short || var0 instanceof Integer || var0 instanceof Long) {
         if (var0 == null) {
            throw new d(a[16]);
         } else {
            if ((var0 = var0.toString()).indexOf(46) > 0 && var0.indexOf(101) < 0 && var0.indexOf(69) < 0) {
               while(var0.endsWith("0")) {
                  var0 = var0.substring(0, var0.length() - 1);
               }

               if (var0.endsWith(".")) {
                  var0 = var0.substring(0, var0.length() - 1);
               }
            }

            return var0;
         }
      } else {
         return !(var0 instanceof Boolean) && !(var0 instanceof ji) && !(var0 instanceof jh) ? h(var0.toString()) : var0.toString();
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '%');
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
               var10005 = 36;
               break;
            case 1:
               var10005 = 127;
               break;
            case 2:
               var10005 = 112;
               break;
            case 3:
               var10005 = 95;
               break;
            case 4:
               var10005 = 93;
               break;
            case 5:
               var10005 = 35;
               break;
            default:
               var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
