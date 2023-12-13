import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class f8 {
   private static byte b;
   private static short[] c;
   private static int d;
   private static int e;
   public static hp[] f;
   public static br[] g;
   public static Image[] h;
   private static df[] i;
   public static Vector j;
   public static Vector k;
   public static Vector l;
   public static Hashtable m;
   public static int n;
   private static final String[] a;

   static {
      String[] var5 = new String[25];
      int var3 = 0;
      String var2 = "|a?_\u0014)1or;b\u001b=\n[v,F\u0010|a?_\u0014),pp\u001cB\u0012\u001d\u0004oz\r,&l\u0018F)Vdei\u0013Fb\u0004i%k\u001b\u000e|a?_\u0014)!|c?m\u0014)\b\u0003ev=\u0002x~\u0002ie\u0005.\"k\u001e\u0011\u0002ed\u0004i%k\u001a\u0003tp\u0001\u0004i%k\u0019\u0010|a?_\u0014),pp\u001cB\u0012\u001d\u0004oz\r|a?_\u0014),pp\u0018J\u00076\f|a?_\u0014)3NQ?Y\u0018\f|a?_\u0014)3NQ?Y\u0018\u0006%%jOMl\n,&l\u0018F)]ys:\u0003ne9\r|a?_\u0014),pp\u0018J\u00076\u0004i%k\u001a\u000e|a?_\u0014)!|c?m\u0014)\b";
      int var4 = "|a?_\u0014)1or;b\u001b=\n[v,F\u0010|a?_\u0014),pp\u001cB\u0012\u001d\u0004oz\r,&l\u0018F)Vdei\u0013Fb\u0004i%k\u001b\u000e|a?_\u0014)!|c?m\u0014)\b\u0003ev=\u0002x~\u0002ie\u0005.\"k\u001e\u0011\u0002ed\u0004i%k\u001a\u0003tp\u0001\u0004i%k\u0019\u0010|a?_\u0014),pp\u001cB\u0012\u001d\u0004oz\r|a?_\u0014),pp\u0018J\u00076\f|a?_\u0014)3NQ?Y\u0018\f|a?_\u0014)3NQ?Y\u0018\u0006%%jOMl\n,&l\u0018F)]ys:\u0003ne9\r|a?_\u0014),pp\u0018J\u00076\u0004i%k\u001a\u000e|a?_\u0014)!|c?m\u0014)\b"
         .length();
      char var1 = 18;
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
                     j = new Vector();
                     k = new Vector();
                     l = new Vector();
                     m = new Hashtable();
                     n = -1;
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

                  var2 = "|a?_\u0014)1or;b\u001b=\n[v,F\u0002{a";
                  var4 = "|a?_\u0014)1or;b\u001b=\n[v,F\u0002{a".length();
                  var1 = 18;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static void b() {
      n = -1;
   }

   public static void b(byte var0, short[] var1, int var2, int var3) {
      String[] var6 = a;
      byte[] var5;
      if ((var5 = b2.b(var6[16])) != null) {
         ByteArrayInputStream var4 = new ByteArrayInputStream(var5);
         DataInputStream var10 = new DataInputStream(var4);

         try {
            e = var10.readInt();
            d = var10.readInt();
         } catch (IOException var7) {
            var6 = a;
            f5.c(var6[16]);
         }
      }

      n = 0;
      h = new Image[var0];
      if (!g()) {
         b = var0;
         c = var1;
         d = -1;
         e = -1;

         for(int var11 = 0; var11 < var0; ++var11) {
            h2.b().b((short)var11);
            ++n;
         }
      } else if (b > 0) {
         for(int var12 = 0; var12 < b; ++var12) {
            var5 = b2.b(a[13].concat(String.valueOf(var12)));
            h[var12] = b2.c(var5);
         }
      }

      for(int var13 = 0; var13 < b; ++var13) {
         if (var1[var13] != c[var13]) {
            h2.b().b((short)var13);
            ++n;
         }
      }

      if (var0 - b > 0) {
         short[] var15 = c;
         c = new short[var1.length];

         for(int var8 = 0; var8 < var15.length; ++var8) {
            c[var8] = var15[var8];
         }

         for(int var9 = b; var9 < var0; ++var9) {
            h2.b().b((short)var9);
            ++n;
         }
      }

      if (!f()) {
         d = var2;
         h2.b().c();
         ++n;
      } else if (d != var2) {
         d = var2;
         h2.b().c();
         ++n;
      }

      if (!e()) {
         e = var3;
         h2.b().d();
         ++n;
      } else if (e != var3) {
         e = var3;
         h2.b().d();
         ++n;
      }

      if (n == 0) {
         h2.b().e();
      }

      b2.e();
   }

   public static void b(short var0, short var1, byte[] var2) {
      --n;
      c[var0] = var1;
      h[var0] = b2.c(var2);
      var1 = var0;
      byte[] var9 = var2;

      try {
         String[] var6 = a;
         b2.b(var6[1].concat(String.valueOf((int)var1)), var9);
      } catch (Exception var7) {
      }

      int var3 = e;
      int var13 = d;
      short[] var12 = c;
      byte var10 = b;
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      DataOutputStream var5 = new DataOutputStream(var4);

      try {
         var5.writeByte(var10);
         var5.writeInt(var13);
         var5.writeInt(var3);

         for(int var14 = 0; var14 < var10; ++var14) {
            var5.writeShort(var12[var14]);
         }

         var2 = var4.toByteArray();
         b2.b(a[4], var2);
         var5.close();
      } catch (Exception var8) {
      }

      if (n == 0) {
         h2.b().e();
      }
   }

   public static void c() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeInt(e);
         var1.writeInt(d);
         b2.b(a[15], var0.toByteArray());
         var1.close();
      } catch (Exception var2) {
      }
   }

   private static void a(byte[] var0) {
      ByteArrayInputStream var10 = new ByteArrayInputStream(var0);
      short var1;
      DataInputStream var11;
      br[] var2 = new br[var1 = (var11 = new DataInputStream(var10)).readShort()];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = new br();
         var2[var3].c = var11.readByte();
         var2[var3].b = var11.readUTF();
         var2[var3].l = var2[var3].b.toLowerCase();
         var2[var3].e = new byte[2];
         var2[var3].e[0] = var11.readByte();
         var2[var3].e[1] = var11.readByte();
         var2[var3].f = var11.readShort();
         var2[var3].g = var11.readShort();
         var2[var3].h[0] = var11.readShort();
         var2[var3].i = var11.readShort();
         var2[var3].j = var11.readShort();
         var2[var3].d = new short[8];

         for(int var4 = 0; var4 < var2[var3].d.length; ++var4) {
            var2[var3].d[var4] = var11.readShort();
         }
      }

      short var12;
      i = new df[var12 = var11.readShort()];

      for(int var17 = 0; var17 < var12; ++var17) {
         i[var17] = new df();
         i[var17].b = var11.readByte();
         i[var17].e[0] = var11.readShort();
      }

      for(int var18 = 0; var18 < var1; ++var18) {
         var2[var18].h[1] = var11.readShort();
      }

      for(int var19 = 0; var19 < var12; ++var19) {
         i[var19].e[1] = var11.readShort();
      }

      short var20 = var11.readShort();
      j = new Vector();

      for(int var13 = 0; var13 < var20; ++var13) {
         n var5;
         (var5 = new n()).b = var11.readByte();
         var5.m = var11.readUTF();
         var5.n = var11.readUTF();
         var5.f[0] = var11.readInt();
         var5.f[1] = var11.readShort();
         var5.e = var11.readShort();
         var5.g = var11.readShort();

         for(int var6 = 0; var6 < 3; ++var6) {
            var5.k[var6] = var11.readShort();
         }

         var5.c = var11.readByte();

         for(int var30 = 0; var30 < 3; ++var30) {
            for(int var7 = 0; var7 < 12; ++var7) {
               var5.l[var30][var7] = var11.readByte();
            }
         }

         var5.d = var11.readByte();
         var5.h = var11.readShort();
         var5.i = var11.readShort();
         var5.j = var11.readShort();
         j.addElement(var5);
      }

      k = new Vector();
      short var14 = var11.readByte();

      for(int var24 = 0; var24 < var14; ++var24) {
         b5 var31;
         (var31 = new b5()).d = true;
         var31.b = var11.readShort();
         var31.c = var11.readShort();
         var31.e = var11.readByte();
         var31.f = var11.readByte();
         var31.g = var11.readUTF();
         var31.h = var11.readShort();
         var31.i = var11.readShort();
         k.addElement(var31);
      }

      byte var25 = var11.readByte();

      for(int var32 = 0; var32 < var25; ++var32) {
         b5 var34;
         (var34 = new b5()).d = false;
         var34.b = var11.readShort();
         var34.c = var11.readShort();
         var34.g = var11.readUTF();
         var34.h = var11.readShort();
         var34.i = var11.readShort();
      }

      byte var33;
      br[] var35 = new br[var33 = var11.readByte()];

      for(int var15 = 0; var15 < var33; ++var15) {
         var35[var15] = new br();
         var35[var15].m = true;
         var35[var15].c = var11.readShort();
         var35[var15].b = var11.readUTF();
         var35[var15].l = var35[var15].b.toLowerCase();
         var35[var15].f = var11.readShort();
         var35[var15].h[0] = var11.readShort();
         var35[var15].h[1] = var11.readShort();
         var35[var15].k = var11.readShort();
         var35[var15].j = var11.readShort();
         var35[var15].n = var11.readByte();
         var35[var15].d = new short[8];

         for(int var21 = 0; var21 < var35[var15].d.length; ++var21) {
            var35[var15].d[var21] = var11.readShort();
         }
      }

      var14 = var11.readShort();

      for(int var22 = 0; var22 < var14; ++var22) {
         g3 var26;
         (var26 = new g3()).b = var11.readShort();
         var26.e = var11.readUTF();
         var26.c = var11.readShort();
         var26.d = var11.readShort();
         short var8 = var11.readShort();
         var26.f = new short[var8];
         var26.g = new short[var8];

         for(int var9 = 0; var9 < var8; ++var9) {
            var26.f[var9] = var11.readShort();
            var26.g[var9] = var11.readShort();
         }

         l.addElement(var26);
      }

      byte var23 = var11.readByte();

      for(int var27 = 0; var27 < var23; ++var27) {
         b5 var36;
         (var36 = new b5()).d = false;
         var36.b = var11.readShort();
         var36.c = var11.readShort();
         var36.g = var11.readUTF();
         var36.h = var11.readInt();
         var36.i = var11.readInt();
         k.addElement(var36);
      }

      g = new br[var1 + var33];

      for(int var28 = 0; var28 < var1; ++var28) {
         g[var28] = var2[var28];
      }

      for(int var29 = var1; var29 < var33 + var1; ++var29) {
         g[var29] = var35[var29 - var1];
      }
   }

   public static void d() {
      GameMidlet.o = (int)(System.currentTimeMillis() % 6L);
      fb.m();
      ib.d();
      fc.i();
      String var0 = k4.b(fj.M, 8);
      String[] var3 = a;
      fj.M = var3[5].concat(String.valueOf(var0));
      AutoController.L = fj.M + GameMidlet.q + fc.X + k4.b(GameMidlet.p, -3);

      for(int var4 = 0; var4 < GameMidlet.p.length() + GameMidlet.q.length(); ++var4) {
         StringBuffer var10002 = new StringBuffer(String.valueOf(AutoController.L));
         String var10001 = k4.b(GameMidlet.p, -3) + k4.b(GameMidlet.q, 2) + k4.b(ib.m + (var4 - 7) + "l", -3);
         int var2 = var4 - GameMidlet.o;
         String var1 = var10001;
         StringBuffer var11 = new StringBuffer(String.valueOf(var1)).append(fj.M.substring(3));
         var3 = a;
         if ((var1 = System.getProperty(var11.append(var3[6]).toString())) == null) {
            if (var2 % 2 == 0) {
               var1 = GameMidlet.q + var3[7] + GameMidlet.p + var3[8] + GameMidlet.o * 82 + var3[17] + var2 + var3[3];
            } else if (var2 % 3 == 0) {
               StringBuffer var12 = new StringBuffer(String.valueOf(GameMidlet.q));
               var3 = a;
               var1 = var12.append(var3[9])
                  .append(GameMidlet.o)
                  .append(GameMidlet.p)
                  .append(var3[2])
                  .append(GameMidlet.o * 93)
                  .append(var2)
                  .append(var3[10])
                  .toString();
            } else {
               StringBuffer var13 = new StringBuffer(String.valueOf(GameMidlet.q));
               var3 = a;
               var1 = var13.append(var3[24])
                  .append(GameMidlet.p)
                  .append(GameMidlet.o)
                  .append(var3[18])
                  .append(GameMidlet.o * 121)
                  .append(var3[19])
                  .append(var2)
                  .append(var3[12])
                  .toString();
            }

            fi.Z = fi.Z + GameMidlet.p;
            var10001 = var1;
         } else {
            fi.Z = fi.Z + ib.m;
            var3 = a;
            var10001 = var3[11] + GameMidlet.p + "y" + k4.b(var1, GameMidlet.o) + var2 + var3[21];
         }

         AutoController.L = var10002.append(var10001).toString();
         fc.X = fc.X + AutoController.L.substring(0, 2);
      }

      ib.d();
   }

   public static void b(byte[] var0) {
      --n;
      a(var0);
      b2.b(a[23], var0);
      if (n == 0) {
         h2.b().e();
      }
   }

   private static boolean e() {
      String[] var1 = a;
      byte[] var0;
      if ((var0 = b2.b(var1[0])) == null) {
         return false;
      } else {
         try {
            a(var0);
         } catch (Exception var2) {
            f5.c(a[0]);
         }

         return true;
      }
   }

   private static void c(byte[] var0) {
      ByteArrayInputStream var6 = new ByteArrayInputStream(var0);
      DataInputStream var7;
      short var1 = (var7 = new DataInputStream(var6)).readShort();
      Vector var2 = new Vector();
      short var3 = 0;

      for(int var4 = 0; var4 < var1; ++var4) {
         hp var5;
         (var5 = new hp()).b = var7.readShort();
         if (var5.b > var3) {
            var3 = var5.b;
         }

         var5.c = var7.readShort();
         var5.d = var7.readByte();
         var5.e = var7.readByte();
         var5.f = var7.readByte();
         var5.g = var7.readByte();
         var2.addElement(var5);
      }

      f = new hp[var3 + 1];

      for(int var8 = 0; var8 < var1; ++var8) {
         hp var9 = (hp)var2.elementAt(var8);
         f[var9.b] = var9;
      }
   }

   public static void d(byte[] var0) {
      --n;
      c(var0);
      b2.b(a[14], var0);
      if (n == 0) {
         h2.b().e();
      }
   }

   private static boolean f() {
      String[] var1 = a;
      byte[] var0;
      if ((var0 = b2.b(var1[20])) == null) {
         return false;
      } else {
         try {
            c(var0);
         } catch (Exception var2) {
            f5.c(a[14]);
         }

         return true;
      }
   }

   private static boolean g() {
      String[] var2 = a;
      DataInputStream var0;
      if ((var0 = f5.b(var2[22])) == null) {
         return false;
      } else {
         try {
            b = var0.readByte();
            d = var0.readInt();
            e = var0.readInt();
            c = new short[b];

            for(int var1 = 0; var1 < b; ++var1) {
               c[var1] = var0.readShort();
            }

            var0.close();
         } catch (IOException var3) {
            f5.c(a[4]);
         }

         return true;
      }
   }

   public static df b(int var0) {
      for(int var1 = 0; var1 < i.length; ++var1) {
         if (i[var1].b == var0) {
            return i[var1];
         }
      }

      return null;
   }

   public static br c(int var0) {
      for(int var1 = 0; var1 < g.length; ++var1) {
         if (var0 == g[var1].c) {
            return g[var1];
         }
      }

      return null;
   }

   public static n d(int var0) {
      int var1 = j.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         n var3;
         if ((var3 = (n)j.elementAt(var2)).b == var0) {
            return var3;
         }
      }

      return null;
   }

   public static br e(int var0) {
      for(int var1 = 0; var1 < g.length; ++var1) {
         if (g[var1].c == var0) {
            return g[var1];
         }
      }

      return null;
   }

   public static void b(Graphics var0, int var1, int var2, int var3, int var4) {
      if (b((short)var1).e != -1) {
         var0.drawImage(b((short)var1).b, var2, var3, var4);
      }
   }

   public static dm b(short var0) {
      dm var1;
      if ((var1 = (dm)m.get(String.valueOf((int)var0))) == null) {
         var1 = new dm();
         m.put(String.valueOf((int)var0), var1);
         h2.b().d(var0);
      } else if (var1.e >= 0) {
         var1.e = (int)(System.currentTimeMillis() / 1000L);
      }

      return var1;
   }

   public static void h() {
      if (m.size() > 50) {
         Enumeration var0 = m.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            dm var2;
            if ((var2 = (dm)m.get(var1)).e != -1 && System.currentTimeMillis() / 1000L - (long)var2.e > (long)k4.ae) {
               m.remove(var1);
            }
         }
      }
   }

   public static g3 c(short var0) {
      for(int var1 = 0; var1 < l.size(); ++var1) {
         g3 var2;
         if ((var2 = (g3)l.elementAt(var1)).b == var0) {
            return var2;
         }
      }

      return null;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'e');
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
               var10005 = 29;
               break;
            case 1:
               var10005 = 23;
               break;
            case 2:
               var10005 = 94;
               break;
            case 3:
               var10005 = 43;
               break;
            case 4:
               var10005 = 117;
               break;
            case 5:
               var10005 = 91;
               break;
            default:
               var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
