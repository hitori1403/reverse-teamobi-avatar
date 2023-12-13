import java.io.IOException;
import javax.microedition.rms.RecordStore;

public final class hx extends hs {
   private static hx d;
   private static final String[] e;

   public static hx b() {
      if (d == null) {
         d = new hx();
      }

      return d;
   }

   public final void b(byte var1, String var2) {
      if (var2 == null) {
         var2 = "";
      }

      super.a((byte)-55);

      try {
         ij var3 = super.c;
         super.c.d.writeByte(var1);
         var3 = super.c;
         super.c.d.writeUTF(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      this.a();
   }

   public final void c() {
      super.a((byte)-1);
      this.b(GameMidlet.f);
      this.a();
      super.a((byte)-17);

      try {
         ij var2 = super.c;
         super.c.d.writeByte(GameMidlet.g);
         Runtime var1 = Runtime.getRuntime();
         var2 = super.c;
         super.c.d.writeInt((int)(var1.totalMemory() / 1024L));
         String[] var3 = e;
         String var6;
         if ((var6 = System.getProperty(var3[10])) == null) {
            var6 = var3[6];
         }

         var2 = super.c;
         super.c.d.writeUTF(var6);
         var2 = super.c;
         super.c.d.writeInt(d());
         var2 = super.c;
         super.c.d.writeInt(k4.o);
         var2 = super.c;
         super.c.d.writeInt(k4.p);
         var2 = super.c;
         super.c.d.writeBoolean(k4.M);
         var2 = super.c;
         super.c.d.writeByte(ev.a - 1);
         var2 = super.c;
         var3 = e;
         super.c.d.writeUTF(var3[7]);
         new StringBuffer(var3[14]).append(fb.S).append(var3[3]).append(fc.X).append(var3[3]).append(AutoController.L);
         var2 = super.c;
         super.c.d.writeUTF(fb.S);
         var2 = super.c;
         super.c.d.writeUTF(fc.X);
         var2 = super.c;
         super.c.d.writeUTF(AutoController.L);
      } catch (IOException var5) {
      }

      this.a();
      super.a((byte)-79);

      try {
         ij var18 = super.c;
         super.c.d.writeUTF(GameMidlet.h);
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      this.a();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static int d() {
      long var0 = 0L;
      RecordStore var2 = null;
      boolean var9 = false /* VF: Semaphore variable */;

      label80: {
         label79: {
            try {
               var9 = true;
               String[] var3 = e;
               var0 = (long)((var2 = RecordStore.openRecordStore(var3[8], true)).getSizeAvailable() + var2.getSize());
               var9 = false;
               break label79;
            } catch (Exception var13) {
               var9 = false;
            } finally {
               if (var9) {
                  try {
                     if (var2 != null) {
                        var2.closeRecordStore();
                     }

                     String[] var15 = e;
                     RecordStore.deleteRecordStore(var15[13]);
                  } catch (Exception var10) {
                  }
               }
            }

            try {
               if (var2 != null) {
                  var2.closeRecordStore();
               }

               String[] var16 = e;
               RecordStore.deleteRecordStore(var16[13]);
            } catch (Exception var12) {
            }
            break label80;
         }

         try {
            if (var2 != null) {
               var2.closeRecordStore();
            }

            RecordStore.deleteRecordStore(e[13]);
         } catch (Exception var11) {
         }
      }

      if (var0 > 0L) {
         var0 /= 1024L;
      }

      return (int)var0;
   }

   public final void d(int var1) {
      super.a((byte)34);
      this.a(var1);
      this.a();
   }

   public final void b(String var1, String var2, String var3) {
      super.a((byte)-2);

      try {
         String[] var5 = e;
         new StringBuffer(var5[4]).append(var1).append(var5[1]).append(var2);
         ij var4 = super.c;
         super.c.d.writeUTF(var1);
         var4 = super.c;
         super.c.d.writeUTF(var2);
         var4 = super.c;
         super.c.d.writeUTF(var3);
      } catch (IOException var6) {
      }

      this.a();
   }

   public final void e(int var1) {
      super.a((byte)61);
      this.b(var1);
      this.a();
   }

   public final void b(int var1, String var2) {
      super.a((byte)-6);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeUTF(var2);
      } catch (IOException var4) {
      }

      this.a();
   }

   public final void e() {
      super.a((byte)-35);

      try {
         ij var4 = super.c;
         super.c.d.writeByte(GameMidlet.k.D);
         int var1 = GameMidlet.k.E.size();
         var4 = super.c;
         super.c.d.writeByte(var1);

         for(int var2 = 0; var2 < var1; ++var2) {
            gl var3 = (gl)GameMidlet.k.E.elementAt(var2);
            var4 = super.c;
            super.c.d.writeShort(var3.b);
         }
      } catch (IOException var5) {
      }

      this.a();
   }

   public final void b(int var1, int var2) {
      super.a((byte)-36);

      try {
         ij var3 = super.c;
         super.c.d.writeShort(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (IOException var4) {
      }

      this.a();
   }

   public final void f(int var1) {
      super.a((byte)-47);
      this.a(var1);
      this.a();
   }

   public final void b(short var1, byte var2) {
      super.a((byte)-48);
      super.c = new ij((byte)-48);

      try {
         ij var3 = super.c;
         super.c.d.writeShort(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (IOException var4) {
      }

      this.a();
   }

   public final void g(int var1) {
      super.a((byte)-1);
      this.b(var1);
      this.a();
   }

   public final void b(byte var1) {
      super.a((byte)-51);
      this.b(var1);
      this.a();
   }

   public final void h(int var1) {
      super.a((byte)-49);
      e[12].concat(String.valueOf(var1));
      this.b(var1);
      this.a();
   }

   public final void i(int var1) {
      super.a((byte)-52);
      this.a(var1);
      this.a();
   }

   public final void j(int var1) {
      super.a((byte)-53);
      this.b(var1);
      this.a();
   }

   public final void b(int var1, byte var2, int var3) {
      super.a((byte)-59);

      try {
         ij var4 = super.c;
         super.c.d.writeInt(var1);
         var4 = super.c;
         super.c.d.writeByte(var2);
         var4 = super.c;
         super.c.d.writeByte(var3);
      } catch (IOException var5) {
      }

      this.a();
   }

   public final void b(int var1, byte var2, String var3) {
      super.a((byte)-60);

      try {
         ij var4 = super.c;
         super.c.d.writeInt(var1);
         var4 = super.c;
         super.c.d.writeByte(var2);
         var4 = super.c;
         super.c.d.writeUTF(var3);
      } catch (IOException var5) {
      }

      this.a();
   }

   public final void k(int var1) {
      e[0].concat(String.valueOf(var1));
      super.a((byte)-61);
      this.a(var1);
      this.a();
   }

   public final void c(String var1, String var2, String var3) {
      super.a((byte)-56);

      try {
         ij var4 = super.c;
         super.c.d.writeUTF(var1);
         var4 = super.c;
         super.c.d.writeUTF(var2);
         var4 = super.c;
         super.c.d.writeUTF(var3);
      } catch (IOException var5) {
      }

      this.a();
   }

   public final void b(String var1, String var2) {
      super.a((byte)-62);

      try {
         ij var3 = super.c;
         super.c.d.writeUTF(var1);
         var3 = super.c;
         super.c.d.writeUTF(var2);
      } catch (IOException var4) {
      }

      this.a();
   }

   public final void b(short var1, int var2) {
      super.a((byte)-64);

      try {
         ij var3 = super.c;
         super.c.d.writeShort(var1);
         var3 = super.c;
         super.c.d.writeShort(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void c(int var1, String var2) {
      super.a((byte)-72);

      try {
         ij var3 = super.c;
         super.c.d.writeInt(var1);
         var3 = super.c;
         super.c.d.writeUTF(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void b(int var1, byte var2, int var3, byte var4) {
      super.a((byte)-81);

      try {
         ij var5 = super.c;
         super.c.d.writeInt(var1);
         var5 = super.c;
         super.c.d.writeByte(var2);
         var5 = super.c;
         super.c.d.writeShort(var3);
         var5 = super.c;
         super.c.d.writeByte(var4);
      } catch (Exception var6) {
      }

      this.a();
   }

   public final void c(int var1, int var2) {
      e[2].concat(String.valueOf(var1));
      super.a((byte)-83);

      try {
         ij var3 = super.c;
         super.c.d.writeShort(var1);
         var3 = super.c;
         super.c.d.writeInt(var2);
      } catch (IOException var4) {
      }

      this.a();
   }

   public final void c(byte var1) {
      super.a((byte)-58);
      this.b(var1);
      this.a();
   }

   public final void b(String var1) {
      super.a((byte)-88);

      try {
         ij var2 = super.c;
         super.c.d.writeByte(0);
         var2 = super.c;
         super.c.d.writeUTF(var1);
      } catch (Exception var3) {
      }

      this.a();
   }

   public final void c(String var1, String var2) {
      super.a((byte)-88);

      try {
         ij var3 = super.c;
         super.c.d.writeByte(1);
         var3 = super.c;
         super.c.d.writeUTF(var1);
         var3 = super.c;
         super.c.d.writeUTF(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void l(int var1) {
      super.a((byte)-90);
      this.b(var1);
      this.a();
   }

   public final void b(int var1, int var2, short var3) {
      super.a((byte)-89);

      try {
         ij var4 = super.c;
         super.c.d.writeByte(var1);
         var4 = super.c;
         super.c.d.writeShort(var2);
         var4 = super.c;
         super.c.d.writeShort(var3);
      } catch (Exception var5) {
      }

      this.a();
   }

   public final void d(byte var1) {
      super.a((byte)-92);
      if (var1 != -1) {
         this.b(var1);
      }

      this.a();
   }

   public final void e(byte var1) {
      super.a((byte)-94);
      this.b(var1);
      this.a();
   }

   public final void b(short var1) {
      super.a((byte)-95);

      try {
         ij var2 = super.c;
         super.c.d.writeByte(AutoController.ah);
         var2 = super.c;
         super.c.d.writeByte(0);
         var2 = super.c;
         super.c.d.writeShort(var1);
      } catch (Exception var3) {
      }

      this.a();
   }

   public final void c(short var1) {
      super.a((byte)-97);
      this.c(var1);
      this.a();
   }

   public final void d(short var1) {
      super.a((byte)-98);
      this.c(var1);
      this.a();
   }

   public final void m(int var1) {
      k4.i();
      super.a((byte)-99);
      this.b(var1);
      this.a();
   }

   public final void d(int var1, int var2) {
      k4.i();
      super.a((byte)5);
      this.b(var1);
      this.a(var2);
      this.a();
   }

   public final void n(int var1) {
      super.a((byte)2);
      this.b(var1);
      this.a();
   }

   public final void o(int var1) {
      super.a((byte)-102);
      this.a(var1);
      this.a();
   }

   public final void p(int var1) {
      super.a((byte)-106);
      this.b(var1);
      this.a();
   }

   public final void b(byte var1, short var2) {
      super.a((byte)-107);

      try {
         ij var3 = super.c;
         super.c.d.writeByte(var1);
         var3 = super.c;
         super.c.d.writeShort(var2);
         this.a();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public final void d(String var1, String var2, String var3) {
      String[] var4 = e;
      new StringBuffer(var4[5]).append(var1).append(var4[9]).append(var2).append(var4[11]).append(var3);
      super.a((byte)-25);

      try {
         this.a(var1);
         this.a(var2);
         this.a(var3);
         this.b(0);
         this.a();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   static {
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = "Lnw4\u000b\u000f!FhW:\u0012\u0007n\b\u0004\b!\u0014{\u0014Lnf>\u0017\u00171[uw6\u00020;\\`@>\\B\u0004\b!\u0014{\u0015DnS2\b\u00035I`U:\u0007\u00035I`U:\u0007Xt\u0013Lnf>\u0001\u000b'\\dF\u0019\u001f'9IhXaF\u0004FtX7\u0005\u001a/\u0001u^\u0007\\dL/\u0014\u000f'\u0003\b!\u0014\u0015EhW)\t\u00070Au]4\bL$D`@=\t\u00109\u0003\b!\u0014\rZdE.\u0003\u0011 {i[+\\B";
      int var4 = "Lnw4\u000b\u000f!FhW:\u0012\u0007n\b\u0004\b!\u0014{\u0014Lnf>\u0017\u00171[uw6\u00020;\\`@>\\B\u0004\b!\u0014{\u0015DnS2\b\u00035I`U:\u0007\u00035I`U:\u0007Xt\u0013Lnf>\u0001\u000b'\\dF\u0019\u001f'9IhXaF\u0004FtX7\u0005\u001a/\u0001u^\u0007\\dL/\u0014\u000f'\u0003\b!\u0014\u0015EhW)\t\u00070Au]4\bL$D`@=\t\u00109\u0003\b!\u0014\rZdE.\u0003\u0011 {i[+\\B"
         .length();
      char var1 = 15;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = b(c(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     e = var5;
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

                  var2 = "\\dL/\u0014\u000f'\u001a[d@\u000b\u0014\r\"AeQ)'\f0km]>\b\u0016\u0000QqQaF";
                  var4 = "\\dL/\u0014\u000f'\u001a[d@\u000b\u0014\r\"AeQ)'\f0km]>\b\u0016\u0000QqQaF".length();
                  var1 = 7;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   private static char[] c(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'T');
      }

      return var10000;
   }

   private static String b(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 40;
               break;
            case 1:
               var10005 = 1;
               break;
            case 2:
               var10005 = 52;
               break;
            case 3:
               var10005 = 91;
               break;
            case 4:
               var10005 = 102;
               break;
            case 5:
               var10005 = 98;
               break;
            default:
               var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
