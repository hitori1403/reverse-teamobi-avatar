import java.io.ByteArrayInputStream;
import java.util.Vector;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class jn {
   private int a;
   private Player b;
   public static jn c;
   private Vector d;
   Vector e;
   int f = -1;
   private static final String[] g;

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "W F\u000b\fxWn!^\f\u000eq\n`:N\u0017\u000e2yh+C\rW F\u000b\fxWn!^\f\u000eq";
      int var4 = "W F\u000b\fxWn!^\f\u000eq\n`:N\u0017\u000e2yh+C\rW F\u000b\fxWn!^\f\u000eq".length();
      char var1 = '\r';
      int var0 = -1;

      while(true) {
         String var10002 = a(a(var2.substring(++var0, var0 + var1)));
         boolean var10001 = true;
         var5[var3++] = var10002;
         if ((var0 += var1) >= var4) {
            g = var5;
            c = new jn();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public final void b(String var1, byte var2) {
      if (this.f != 0) {
         cc var4 = new cc(this, var2);
         if (this.f == 1) {
            var4.b();
         } else {
            Vector var3 = new Vector();
            if (AutoController.V) {
               fa.g().c(fa.g().E / 10);
               var4.b();
            } else {
               var3.addElement(new ag(hq.dF[1], new cb(var4)));
               var3.addElement(new ag(hq.dF[2], new b_(var4)));
               var3.addElement(new ag(hq.q, new ae(this)));
               var3.addElement(new ag(hq.dF[0], new ad(var4)));
               k4.b(var1, var3);
            }
         }
      }
   }

   public final void b(byte[] var1, byte var2) {
      if (this.d == null) {
         this.d = new Vector();
         this.e = new Vector();
      }

      try {
         this.e.addElement(String.valueOf((int)var2));
         this.d.addElement(var1);
         c.b(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public final void b() {
      if (this.b != null) {
         if (this.b.getState() == 400) {
            try {
               this.b.stop();
            } catch (MediaException var1) {
               var1.printStackTrace();
            }
         }

         this.b.close();
      }
   }

   public final void b(byte[] var1) {
      this.b();

      try {
         ByteArrayInputStream var4 = new ByteArrayInputStream(var1);
         String[] var2 = g;
         this.b = Manager.createPlayer(var4, var2[1]);
         this.b.setLoopCount(1);
         var4.close();
         if (this.a > 0) {
            this.b.start();
            ((VolumeControl)this.b.getControl(var2[0])).setLevel(this.a * 20);
            return;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public final void b(int var1) {
      if (this.b != null && this.b.getState() != 0) {
         try {
            if (var1 > 0) {
               this.b.start();
               ((VolumeControl)this.b.getControl(g[2])).setLevel(var1 * 20);
            } else {
               this.b.stop();
            }
         } catch (MediaException var2) {
            var2.printStackTrace();
         }
      }

      this.a = var1;
   }

   static Vector b(jn var0) {
      return var0.d;
   }

   private static char[] a(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
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
               var10005 = 1;
               break;
            case 1:
               var10005 = 79;
               break;
            case 2:
               var10005 = 42;
               break;
            case 3:
               var10005 = 126;
               break;
            case 4:
               var10005 = 97;
               break;
            case 5:
               var10005 = 29;
               break;
            default:
               var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
