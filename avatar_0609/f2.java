import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;

final class f2 implements CommandListener {
   private final Command b;
   private final TextField c;

   f2(Command var1, TextField var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.b) {
         if (this.c.getString().equals("")) {
            return;
         }

         hx.b().b((byte)2, this.c.getString());
      }

      k4.b.setFullScreenMode(true);
      Display.getDisplay(GameMidlet.j).setCurrent(k4.b);
   }
}
