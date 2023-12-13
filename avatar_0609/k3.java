import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public class k3 extends Canvas {
   protected void paint(Graphics var1) {
   }

   protected void b(int var1) {
   }

   protected void c(int var1) {
   }

   protected void keyRepeated(int var1) {
      he.c(var1);
   }

   protected final void keyReleased(int var1) {
      this.b(var1);
   }

   protected final void keyPressed(int var1) {
      if (!he.b(var1)) {
         this.c(var1);
      }
   }
}
