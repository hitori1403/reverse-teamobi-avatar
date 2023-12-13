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
import javax.microedition.rms.RecordStore;

public final class f5 {
   private static int a;
   private static int b;
   private static int c;
   public static hp[] d;
   public static jv[] e;
   public static Vector f;
   private static Vector g;
   private static Hashtable h;
   private static Hashtable i;
   public static int j;
   public static Vector k;
   private static int l;
   private static int m;
   public static Vector n;
   public static Vector o;
   public static Hashtable p;
   public static Hashtable q;
   public static Hashtable r;
   public static Vector s;
   public static String t;
   private static String u;
   private static final String[] v;

   static {
      String[] var5 = new String[22];
      int var3 = 0;
      String var2 = "t)LC\u001f]dt-Y\u0011t)LC\u001f]yt/dC\u001bB`l/H\rt)LC\u001f]}x8iV\nN\bt)LC\u001f]bf\u0005Y\u001e}e1\u0005Y\u001e}e1\u0011t)LC\u001f]yt/dC\u001bB`l/H\bt)LC\u001f]gC\rt)LC\u001f]yt/yN\u000eJ\u000et)LC\u001f]}a:@~\u0010I[\nt)LC\u001f]dt-Y\u000et)LC\u001f]}a:@~\u0010I[\ft)LC\u001f]}x8o^\u0019\rg:LS3ND\\+HZD\u000f\rt)LC\u001f]yt/yN\u000eJ\bt)LC\u001f]gC\bt)LC\u001f]bf\ft)LC\u001f]}x8o^\u0019\u000fe>_C7BUr:cX\fBUy\rt)LC\u001f]}x8iV\nN";
      int var4 = "t)LC\u001f]dt-Y\u0011t)LC\u001f]yt/dC\u001bB`l/H\rt)LC\u001f]}x8iV\nN\bt)LC\u001f]bf\u0005Y\u001e}e1\u0005Y\u001e}e1\u0011t)LC\u001f]yt/dC\u001bB`l/H\bt)LC\u001f]gC\rt)LC\u001f]yt/yN\u000eJ\u000et)LC\u001f]}a:@~\u0010I[\nt)LC\u001f]dt-Y\u000et)LC\u001f]}a:@~\u0010I[\ft)LC\u001f]}x8o^\u0019\rg:LS3ND\\+HZD\u000f\rt)LC\u001f]yt/yN\u000eJ\bt)LC\u001f]gC\bt)LC\u001f]bf\ft)LC\u001f]}x8o^\u0019\u000fe>_C7BUr:cX\fBUy\rt)LC\u001f]}x8iV\nN"
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
                     v = var5;
                     g = new Vector();
                     h = new Hashtable();
                     j = -1;
                     k = new Vector();
                     n = new Vector();
                     p = new Hashtable();
                     q = new Hashtable();
                     r = new Hashtable();
                     s = new Vector();
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

                  var2 = "t)LC\u001f]\u000fe>_C7BUr:cX\fBUy";
                  var4 = "t)LC\u001f]\u000fe>_C7BUr:cX\fBUy".length();
                  var1 = 6;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static void b() {
      try {
         String[] var0;
         if ((var0 = RecordStore.listRecordStores()) != null) {
            for(int var1 = 0; var1 < var0.length; ++var1) {
               RecordStore.deleteRecordStore(var0[var1]);
            }

            return;
         }
      } catch (Exception var2) {
      }
   }

   public static void b(Vector var0, int var1, int var2, int var3, int var4, int var5) {
      String[] var10 = v;
      b2.b(var10[20], var10[4]);

      try {
         j = 0;
         byte[] var6;
         if ((var6 = b2.b(var10[16])) != null) {
            ByteArrayInputStream var14 = new ByteArrayInputStream(var6);
            DataInputStream var7;
            b = (var7 = new DataInputStream(var14)).readInt();
            l = var7.readInt();
            a = var7.readInt();
            c = var7.readInt();
            m = var7.readInt();
         }

         if (!d()) {
            g = var0;
            int var8 = var0.size();

            for(int var15 = 0; var15 < var8; ++var15) {
               t var22 = (t)var0.elementAt(var15);
               h4.b().b(var22.b);
               ++j;
            }
         } else {
            int var26 = var0.size();

            for(int var16 = 0; var16 < var26; ++var16) {
               t var9;
               t var23;
               if ((var9 = a((var23 = (t)var0.elementAt(var16)).b)) == null) {
                  g.addElement(var23);
                  h4.b().b(var23.b);
                  ++j;
               } else if (var23.c != var9.c) {
                  h4.b().b(var23.b);
                  ++j;
               }
            }
         }

         var10 = v;
         var6 = b2.b(var10[2]);
         t = b2.c(var10[21]);
         boolean var28;
         if (var6 == null) {
            var28 = false;
         } else {
            d = e(var6);
            var28 = true;
         }

         if (!var28) {
            a = var1;
            h4.b().d();
            ++j;
         } else if (a != var1) {
            a = var1;
            h4.b().d();
            ++j;
         }

         var10 = v;
         byte[] var12 = b2.b(var10[0]);
         if (t == null) {
            char[] var13 = u.toCharArray();
            int var18 = 0;

            for(int var24 = 1; var24 < var13.length - 1; var24 += 2) {
               int var27 = Integer.parseInt(String.valueOf(var13[var24]));
               var18 += var27;
            }

            String var25 = String.valueOf(var18);
            t = var25.length() + u.substring(0, 5) + var18 + u.substring(5, u.length());
         }

         boolean var10000;
         if (var12 == null) {
            var10000 = false;
         } else {
            e = b(b(var12, false));
            var10000 = true;
         }

         if (!var10000) {
            b = var2;
            h4.b().e();
            ++j;
         } else if (b != var2) {
            b = var2;
            h4.b().e();
            ++j;
         } else {
            e();
         }

         var10 = v;
         if ((var6 = b2.b(var10[11])) == null) {
            var28 = false;
         } else {
            c(var6);
            var28 = true;
         }

         if (!var28) {
            c = var3;
            h4.b().f();
            ++j;
         } else if (c != var3) {
            c = var3;
            h4.b().f();
            ++j;
         }

         var10 = v;
         if ((var6 = b2.b(var10[1])) == null) {
            var28 = false;
         } else {
            k = g(var6);
            var28 = true;
         }

         if (!var28) {
            l = var4;
            h4.b().g();
            ++j;
         } else if (l != var4) {
            l = var4;
            h4.b().g();
            ++j;
         }

         if ((var6 = b2.b(v[14])) == null) {
            var28 = false;
         } else {
            i(var6);
            var28 = true;
         }

         if (!var28) {
            m = var5;
            h4.b().h();
            ++j;
         } else if (m != var5) {
            m = var5;
            h4.b().h();
            ++j;
         }

         g();
      } catch (Exception var11) {
         var11.printStackTrace();
      }
   }

   public static void b(t var0) {
      --j;
      int var1 = g.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         t var3;
         if ((var3 = (t)g.elementAt(var2)).b == var0.b) {
            var3.e = var0.e;
            var3.c = var0.c;
            var3.d = var0.d;
            break;
         }
      }

      g();
   }

   private static void c() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeShort(g.size());

         for(int var2 = 0; var2 < g.size(); ++var2) {
            t var3 = (t)g.elementAt(var2);
            var1.writeShort(var3.b);
            var1.writeShort(var3.d);
            var1.writeInt(var3.e.length);
            var1.write(var3.e);
            var1.writeShort(var3.c);
         }

         String[] var4 = v;
         b2.b(var4[12], var0.toByteArray());
         var1.close();
         b2.b(var4[18], t);
      } catch (Exception var5) {
      }
   }

   private static boolean d() {
      String[] var5 = v;
      DataInputStream var0 = b(var5[17]);
      String var1;
      String var2 = String.valueOf((var1 = String.valueOf((int)(System.currentTimeMillis() / 86400000L - 15340L))).length());
      u = var2 + System.currentTimeMillis() + var1;
      if (var0 == null) {
         return false;
      } else {
         try {
            short var7 = var0.readShort();
            g = new Vector();

            for(int var8 = 0; var8 < var7; ++var8) {
               t var3;
               (var3 = new t()).b = var0.readShort();
               var3.d = var0.readShort();
               int var4 = var0.readInt();
               var3.e = new byte[var4];
               var0.read(var3.e);
               var3.c = var0.readShort();
               g.addElement(var3);
            }

            var0.close();
         } catch (Exception var6) {
            c(v[12]);
         }

         return true;
      }
   }

   private static jv[] b(Vector var0) {
      short var1 = 0;

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         jv var3;
         if ((var3 = (jv)var0.elementAt(var2)).b > var1) {
            var1 = var3.b;
         }
      }

      jv[] var5 = new jv[var1 + 1];

      for(int var6 = 0; var6 < var0.size(); ++var6) {
         jv var4 = (jv)var0.elementAt(var6);
         var5[var4.b] = var4;
      }

      return var5;
   }

   public static Vector b(byte[] var0, boolean var1) {
      ByteArrayInputStream var10 = new ByteArrayInputStream(var0);
      DataInputStream var11 = new DataInputStream(var10);
      Vector var2 = new Vector();
      short var3 = 1;

      try {
         if (!var1) {
            var3 = var11.readShort();
         }

         for(int var12 = 0; var12 < var3; ++var12) {
            short var4 = var11.readShort();
            int var5 = var11.readInt();
            short var6 = var11.readShort();
            short var7;
            if ((var7 = var11.readShort()) == -2) {
               jx var15;
               (var15 = new jx()).b = var4;
               var15.d[0] = var5;
               var15.d[1] = var6;
               var15.a = var7;
               var15.g = var11.readUTF();
               var15.f = var11.readByte();
               var15.c = var11.readShort();
               var2.addElement(var15);
            } else if (var7 != -1) {
               jy var14;
               (var14 = new jy()).b = var4;
               var14.d[0] = var5;
               var14.d[1] = var6;
               var14.a = var7;
               var14.h = var11.readShort();
               var2.addElement(var14);
            } else {
               jw var8;
               (var8 = new jw()).b = var4;
               var8.d[0] = var5;
               var8.d[1] = var6;
               var8.a = var7;
               var8.g = var11.readUTF();
               var8.f = var11.readByte();
               var8.e = var11.readByte();
               var8.i = var11.readByte();
               var8.h = var11.readByte();
               var8.c = var11.readShort();
               var8.j = new short[15];
               var8.k = new byte[15];
               var8.l = new byte[15];

               for(int var13 = 0; var13 < 15; ++var13) {
                  var8.j[var13] = var11.readShort();
                  var8.k[var13] = var11.readByte();
                  var8.l[var13] = var11.readByte();
               }

               var2.addElement(var8);
            }
         }
      } catch (Exception var9) {
         var9.getMessage();
      }

      return var2;
   }

   public static void b(byte[] var0) {
      --j;
      e = b(b(var0, false));
      b2.b(v[10], var0);
      e();
      g();
   }

   private static void e() {
      for(int var0 = 0; var0 < e.length; ++var0) {
         if (e[var0].a >= 0) {
            jv var1 = e[e[var0].a];
            jv var2;
            (var2 = e[var0]).g = var1.g;
            var2.f = var1.f;
            var2.e = var1.e;
            var2.c = var1.c;
         }
      }
   }

   private static void c(byte[] var0) {
      ByteArrayInputStream var5 = new ByteArrayInputStream(var0);

      try {
         DataInputStream var6;
         short var1 = (var6 = new DataInputStream(var5)).readShort();
         f = new Vector();

         for(int var2 = 0; var2 < var1; ++var2) {
            df var3;
            (var3 = new df()).b = var6.readShort();
            var3.g = var6.readUTF();
            var6.readUTF();
            var3.e[0] = var6.readInt();
            var3.d = var6.readByte();
            var3.c = var6.readShort();
            f.addElement(var3);
         }
      } catch (Exception var4) {
         var4.getMessage();
      }
   }

   public static void d(byte[] var0) {
      --j;
      c(var0);
      b2.b(v[9], var0);
      g();
   }

   private static hp[] e(byte[] var0) {
      ByteArrayInputStream var8 = new ByteArrayInputStream(var0);
      hp[] var1 = null;

      try {
         DataInputStream var9;
         short var2 = (var9 = new DataInputStream(var8)).readShort();
         Vector var3 = new Vector();
         short var4 = 0;

         for(int var5 = 0; var5 < var2; ++var5) {
            hp var6;
            (var6 = new hp()).b = var9.readShort();
            if (var6.b > var4) {
               var4 = var6.b;
            }

            var6.c = var9.readShort();
            var6.d = (short)var9.readUnsignedByte();
            var6.e = (short)var9.readUnsignedByte();
            var6.f = var9.readByte();
            var6.g = var9.readByte();
            var3.addElement(var6);
         }

         var1 = new hp[var4 + 1];

         for(int var10 = 0; var10 < var3.size(); ++var10) {
            hp var11 = (hp)var3.elementAt(var10);
            var1[var11.b] = var11;
         }
      } catch (IOException var7) {
         var7.getMessage();
      }

      return var1;
   }

   public static void f() {
      b2.b(ib.m, GameMidlet.q + fj.M);
      b2.b(GameMidlet.p, b2.f + AutoController.L);
      b2.b(b2.f, GameMidlet.o + fc.X);
   }

   public static void f(byte[] var0) {
      --j;
      d = e(var0);
      b2.b(v[19], var0);
      g();
   }

   private static Vector g(byte[] var0) {
      try {
         ByteArrayInputStream var9 = new ByteArrayInputStream(var0);
         DataInputStream var10;
         short var1 = (var10 = new DataInputStream(var9)).readShort();
         Vector var2 = new Vector();

         for(byte var3 = 0; var3 < var1; ++var3) {
            s var4;
            (var4 = new s()).b = var10.readShort();
            var4.h = var10.readUTF();
            var10.readUTF();
            var4.c = var10.readShort();
            var4.d = var10.readShort();
            var4.f = var10.readByte();
            var4.g = var10.readByte();
            var4.i = var10.readShort();
            if (var4.i == 32767) {
               var4.i = -1;
            }

            if (var4.i >= 0) {
               var4.i *= 1000;
            }

            var4.e = var10.readShort();
            var4.j = var10.readByte();
            var4.k = new Vector();
            byte var5 = var10.readByte();

            for(byte var6 = 0; var6 < var5; ++var6) {
               cn var7;
               (var7 = new cn()).b = var10.readByte();
               var7.c = var10.readByte();
               var4.k.addElement(var7);
            }

            var2.addElement(var4);
         }

         return var2;
      } catch (IOException var8) {
         return new Vector();
      }
   }

   public static void h(byte[] var0) {
      --j;
      k.removeAllElements();
      k = g(var0);
      b2.b(v[6], var0);
      g();
   }

   private static void i(byte[] var0) {
      try {
         ByteArrayInputStream var5 = new ByteArrayInputStream(var0);
         DataInputStream var6 = new DataInputStream(var5);
         n = new Vector();
         short var1 = var6.readShort();
         v[13].concat(String.valueOf((int)var1));

         for(byte var2 = 0; var2 < var1; ++var2) {
            iq var3;
            (var3 = new iq()).h = var6.readShort();
            var3.i = var6.readShort();
            var3.f = var6.readByte();
            var3.a = var6.readByte();
            var3.b = var6.readByte();
            n.addElement(var3);
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   public static void j(byte[] var0) {
      --j;
      n.removeAllElements();
      i(var0);
      b2.b(v[8], var0);
      g();
   }

   private static void g() {
      if (j == 0) {
         ByteArrayOutputStream var0 = new ByteArrayOutputStream();
         DataOutputStream var1 = new DataOutputStream(var0);

         try {
            var1.writeInt(b);
            var1.writeInt(l);
            var1.writeInt(a);
            var1.writeInt(c);
            var1.writeInt(m);
            b2.b(v[3], var0.toByteArray());
            var1.close();
         } catch (Exception var4) {
         }

         c();
         int var5 = g.size();

         for(int var2 = 0; var2 < var5; ++var2) {
            t var6;
            if ((var6 = (t)g.elementAt(var2)).d != -1) {
               byte[] var3 = a(var6.d).e;
               System.arraycopy(var6.e, 0, var3, 0, var6.e.length);
               var6.e = var3;
            }

            var6.f = b2.c(var6.e);
         }

         if (k4.I || k4.K) {
            i = new Hashtable();
         }

         for(int var9 = 0; var9 < g.size(); ++var9) {
            t var7;
            (var7 = (t)g.elementAt(var9)).e = null;
            h.put("" + var7.b, var7);
         }

         for(int var10 = 0; var10 < g.size(); ++var10) {
            t var8 = (t)g.elementAt(var10);
            if (i != null) {
               c(var8);
            }
         }

         g.removeAllElements();
         g = null;
         GameMidlet.k.i();
         AutoController.h().y();
      }
   }

   private static void c(t var0) {
      Image var1;
      Graphics var2;
      (var2 = (var1 = Image.createImage(var0.f.getWidth(), var0.f.getHeight())).getGraphics()).setColor(16711935);
      var2.fillRect(0, 0, var1.getWidth(), var1.getHeight());

      for(int var3 = 0; var3 < d.length; ++var3) {
         if (var0.b == d[var3].c) {
            var2.drawRegion(var0.f, d[var3].d * ev.a, d[var3].e * ev.a, d[var3].f * ev.a, d[var3].g * ev.a, it.r, d[var3].d, d[var3].e, 0);
         }
      }

      for(int var12 = 0; var12 < e.length; ++var12) {
         if (e[var12] != null && e[var12].a >= 0 && e[var12].b < 2000) {
            jw var4 = (jw)b(e[var12].a);

            for(int var5 = 0; var5 < var4.j.length; ++var5) {
               hp var6 = d[var4.j[var5]];
               if (((jy)e[var12]).h == var0.b) {
                  int var7 = var6.d * ev.a;
                  int var8 = var6.e * ev.a;
                  int var9 = var6.f * ev.a;
                  int var10 = var6.g * ev.a;
                  var2.drawRegion(b(var0.b).f, var7, var8, var9, var10, it.r, var6.d, var6.e, 0);
               }
            }
         }
      }

      var1 = b2.b(var1, -65281);
      t var13;
      (var13 = new t()).d = var0.d;
      var13.b = var0.b;
      var13.f = var1;
      var13.c = var0.c;
      i.put("" + var13.b, var13);
   }

   public static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var8 == 0 || !k4.I && !k4.K) {
         var2 *= ev.a;
         var3 *= ev.a;
         var4 *= ev.a;
         var5 *= ev.a;
         var0.drawRegion(b(var1).f, var2, var3, var4, var5, var8, var6, var7, 0);
      } else {
         var2 *= ev.a;
         int var10003 = var3 * ev.a;
         int var10004 = var4 * ev.a;
         var0.drawRegion(((t)i.get(String.valueOf(var1))).f, var2, var10003, var10004, var5 * ev.a, 0, var6, var7, 0);
      }
   }

   public static DataInputStream b(String var0) {
      byte[] var1;
      if ((var1 = b2.b(var0)) == null) {
         return null;
      } else {
         ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
         return new DataInputStream(var2);
      }
   }

   public static void h() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeByte(GameMidlet.g);
         var1.writeUTF(GameMidlet.h);
         b2.b(v[7], var0.toByteArray());
         var1.close();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public static void i() {
      DataInputStream var0;
      if ((var0 = b(v[7])) != null) {
         try {
            GameMidlet.g = var0.readByte();
            GameMidlet.h = var0.readUTF();
            var0.close();
            return;
         } catch (Exception var1) {
            var1.printStackTrace();
         }
      }
   }

   public static void j() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeByte(fa.g().D[4]);
         var1.writeByte(GameMidlet.c[fa.g().D[4]].length);

         for(int var2 = 0; var2 < GameMidlet.c[fa.g().D[4]].length; ++var2) {
            var1.writeByte(GameMidlet.c[fa.g().D[4]][var2].length);
            var1.writeUTF(GameMidlet.b[fa.g().D[4]][var2][0]);

            for(int var3 = 0; var3 < GameMidlet.c[fa.g().D[4]][var2].length; ++var3) {
               var1.writeUTF(GameMidlet.b[fa.g().D[4]][var2][var3 + 1]);
               var1.writeUTF(GameMidlet.c[fa.g().D[4]][var2][var3]);
               var1.writeInt(GameMidlet.d[fa.g().D[4]][var2][var3]);
            }
         }

         b2.b(v[15], var0.toByteArray());
         var1.close();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static void k() {
      String[] var5 = v;
      DataInputStream var0;
      if ((var0 = b(var5[7])) != null) {
         try {
            if (var0.readByte() == fa.g().D[4]) {
               byte var1;
               if ((var1 = var0.readByte()) == 0) {
                  c(var5[7]);
                  return;
               }

               GameMidlet.b = new String[2][var1][];
               GameMidlet.c = new String[2][var1][];
               GameMidlet.d = new int[2][var1][];

               for(int var2 = 0; var2 < var1; ++var2) {
                  byte var3 = var0.readByte();
                  GameMidlet.b[fa.g().D[4]][var2] = new String[var3 + 1];
                  GameMidlet.b[fa.g().D[4]][var2][0] = var0.readUTF();
                  GameMidlet.c[fa.g().D[4]][var2] = new String[var3];
                  GameMidlet.d[fa.g().D[4]][var2] = new int[var3];

                  for(int var4 = 0; var4 < var3; ++var4) {
                     GameMidlet.b[fa.g().D[4]][var2][var4 + 1] = var0.readUTF();
                     GameMidlet.c[fa.g().D[4]][var2][var4] = var0.readUTF();
                     GameMidlet.d[fa.g().D[4]][var2][var4] = var0.readInt();
                  }
               }

               var0.close();
               return;
            }
         } catch (IOException var6) {
            var6.printStackTrace();
            c(v[7]);
         }
      }
   }

   private static t a(int var0) {
      int var1 = g.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         t var3;
         if ((var3 = (t)g.elementAt(var2)).b == var0) {
            return var3;
         }
      }

      return null;
   }

   public static t b(int var0) {
      return (t)h.get(String.valueOf(var0));
   }

   public static s c(int var0) {
      int var1 = k.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         if (((s)k.elementAt(var2)).b == var0) {
            return (s)k.elementAt(var2);
         }
      }

      return null;
   }

   public static void c(Vector var0) {
      o = var0;
   }

   public static boolean d(int var0) {
      return var0 == 10 || var0 == 20 || var0 == 30 || var0 == 40 || var0 == 50;
   }

   public static jw b(Vector var0, int var1) {
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.size(); ++var2) {
            gl var3;
            jv var4 = b((var3 = (gl)var0.elementAt(var2)).b);
            if (var3 != null && var4 instanceof jw && ((jw)var4).e == var1) {
               return (jw)var4;
            }
         }
      }

      return null;
   }

   public static gl c(Vector var0, int var1) {
      int var2 = var0.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         gl var4;
         if ((var4 = (gl)var0.elementAt(var3)).b == var1) {
            return var4;
         }
      }

      return null;
   }

   public static gl b(int var0, Vector var1) {
      int var2 = var1.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         gl var4;
         if (b((var4 = (gl)var1.elementAt(var3)).b).e == var0) {
            return var4;
         }
      }

      return null;
   }

   public static jv b(short var0) {
      if (var0 >= 2000) {
         Object var1;
         if ((var1 = (jv)r.get(String.valueOf((int)var0))) == null) {
            ((jv)(var1 = new jw())).b = -1;
            r.put(String.valueOf((int)var0), var1);
            hx.b().c(var0);
         }

         return (jv)var1;
      } else {
         return e[var0];
      }
   }

   public static String b(jv var0) {
      return var0.a >= 0 ? b(var0.a).g : var0.g;
   }

   public static void b(Graphics var0, int var1, int var2, int var3, int var4) {
      if (d((short)var1).e != -1) {
         var0.drawImage(d((short)var1).b, var2, var3, var4);
      }
   }

   public static dm c(short var0) {
      dm var1;
      if ((var1 = (dm)q.get(String.valueOf((int)var0))) == null) {
         var1 = new dm();
         q.put(String.valueOf((int)var0), var1);
         hx.b().d(var0);
      } else if (var1.e >= 0) {
         var1.e = (int)(System.currentTimeMillis() / 1000L);
      }

      return var1;
   }

   public static dm d(short var0) {
      dm var1;
      if ((var1 = (dm)p.get(String.valueOf((int)var0))) == null) {
         var1 = new dm();
         p.put(String.valueOf((int)var0), var1);
         h4.b().c(var0);
      } else if (var1.e >= 0) {
         var1.e = (int)(System.currentTimeMillis() / 1000L);
      }

      return var1;
   }

   public static void l() {
      if (p.size() > 50) {
         Enumeration var0 = p.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            dm var2;
            if ((var2 = (dm)p.get(var1)).e != -1 && System.currentTimeMillis() / 1000L - (long)var2.e > (long)k4.ae) {
               p.remove(var1);
            }
         }
      }

      if (q.size() > 50) {
         Enumeration var3 = q.keys();

         while(var3.hasMoreElements()) {
            String var4 = (String)var3.nextElement();
            dm var5;
            if ((var5 = (dm)q.get(var4)).e != -1 && System.currentTimeMillis() / 1000L - (long)var5.e > (long)k4.ae) {
               q.remove(var4);
            }
         }
      }
   }

   public static int c(jv var0) {
      byte var1;
      if (var0.a >= 0) {
         var1 = ((jw)b(var0.a)).h;
      } else {
         var1 = ((jw)var0).h;
      }

      return var1;
   }

   public static w e(short var0) {
      for(int var1 = 0; var1 < s.size(); ++var1) {
         w var2;
         if ((var2 = (w)s.elementAt(var1)).f == var0) {
            return var2;
         }
      }

      return null;
   }

   public static void c(String var0) {
      try {
         RecordStore.deleteRecordStore(v[5].concat(String.valueOf(var0)));
      } catch (Exception var1) {
      }
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ '4');
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
               var10005 = 21;
               break;
            case 1:
               var10005 = 95;
               break;
            case 2:
               var10005 = 45;
               break;
            case 3:
               var10005 = 55;
               break;
            case 4:
               var10005 = 126;
               break;
            case 5:
               var10005 = 47;
               break;
            default:
               var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
