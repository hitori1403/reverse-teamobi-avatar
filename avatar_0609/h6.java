import java.util.Vector;

public final class h6 extends hs implements h7 {
   private static h6 d = new h6();

   public static void b() {
      DeCaptcha.b().f = d;
   }

   public final void b(ij var1) {
      try {
         switch(var1.b) {
            case -41:
               byte[] var17 = new byte[var1.f.available()];
               var1.f.read(var17);
               f5.j(var17);
               return;
            case -40:
               byte[] var16 = new byte[var1.f.available()];
               var1.f.read(var16);
               f5.h(var16);
               return;
            case -37:
               byte[] var15 = new byte[var1.f.available()];
               var1.f.read(var15);
               f5.d(var15);
               return;
            case -16:
               byte[] var14 = new byte[var1.f.available()];
               var1.f.read(var14);
               f5.b(var14);
               return;
            case -15:
               byte[] var20 = new byte[var1.f.available()];
               var1.f.read(var20);
               f5.f(var20);
               return;
            case -14:
               t var23;
               (var23 = new t()).b = var1.f.readShort();
               var23.c = var1.f.readShort();
               int var13 = var1.f.readUnsignedShort();
               var23.e = new byte[var13];

               for(int var19 = 0; var19 < var13; ++var19) {
                  var23.e[var19] = var1.f.readByte();
               }

               var23.d = -1;
               if (var1.f.available() >= 2) {
                  var23.d = var1.f.readShort();
               }

               f5.b(var23);
               return;
            case -11:
               Vector var2 = new Vector();
               short var3 = var1.f.readByte();

               for(int var4 = 0; var4 < var3; ++var4) {
                  t var5;
                  (var5 = new t()).b = var1.f.readShort();
                  var5.c = var1.f.readShort();
                  var2.addElement(var5);
               }

               short var21 = var1.f.readShort();
               short var22 = var1.f.readShort();
               var3 = var1.f.readShort();
               short var6 = var1.f.readShort();
               short var7 = var1.f.readShort();
               byte var8 = var1.f.readByte();

               for(int var9 = 0; var9 < var8; ++var9) {
                  t var10;
                  (var10 = new t()).b = var1.f.readShort();
                  var10.c = var1.f.readShort();
                  var2.addElement(var10);
               }

               var1.f.readInt();
               f5.b(var2, var21, var22, var3, var6, var7);
               return;
         }
      } catch (Exception var12) {
         var12.printStackTrace();
      }
   }
}
