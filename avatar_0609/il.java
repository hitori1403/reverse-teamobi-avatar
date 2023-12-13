import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class il extends ik {
   public int f;
   public short g;

   public il() {
      super.d = 1;
   }

   public il(int var1, int var2, int var3, int var4) {
      super.d = 1;
      this.f = var1;
      super.a = var2;
      super.b = var3;
      this.g = (short)var4;
   }

   public void b(Graphics var1) {
      if (this.f >= 0 || super.a * ik.c + this.g / 2 >= cl.b().c && super.a * ik.c - this.g / 2 <= cl.b().c + k4.o) {
         int var2 = super.a * ik.c;
         int var3 = super.b * ik.c;
         switch(this.f) {
            case -10:
            case -3:
               var1.drawImage(fj.N, var2, var3, 40);
               return;
            case -9:
               if (k4.H != null) {
                  var1.drawImage(gx.w, var2, var3, 3);
                  f5.b(var1, 900, var2, var3 + k4.H.s - 10, 33);
               }
            case -4:
            case -1:
            default:
               return;
            case -8:
               b(var1, var2, var3, fj.H);
               return;
            case -7:
               b(var1, var2, var3, fj.I);
               return;
            case -6:
               fj.T.b(0, var2, var3, 0, 3, var1);
               if (iw.S != -1) {
                  fj.T.b(1, var2, var3, 0, 3, var1);
               }

               return;
            case -5:
               fj.S.b(0, var2, var3, 0, 3, var1);
               if (iv.U != -1) {
                  fj.S.b(2, var2, var3, 0, 3, var1);
               }

               return;
            case -2:
               if (fj.aj != -1) {
                  fj.U.b(fj.ak, var2, var3, GameMidlet.k.s == it.r ? 2 : 0, 3, var1);
               }

               return;
            case 0:
               f5.b(var1, 243, var2, var3, 33);
         }
      }
   }

   private static void b(Graphics var0, int var1, int var2, Vector var3) {
      for(int var4 = 0; var4 < var3.size(); ++var4) {
         cn var5;
         if ((var5 = (cn)var3.elementAt(var4)).b * ik.c == var1 && var5.c * ik.c == var2) {
            n var6;
            if ((var6 = f8.d(var5.d)).j != -1) {
               f5.b(var0, var6.j, var1, var2, 3);
            }

            for(int var7 = 0; var7 < fj.J.size(); ++var7) {
               iu var8;
               if ((var8 = (iu)fj.J.elementAt(var7)).J == var5.d && var8.N > 0) {
                  f5.b(var0, var6.i, var1, var2, 3);
                  return;
               }
            }
         }
      }
   }
}
