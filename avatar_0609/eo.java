import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

final class eo implements CommandListener {
   private fj b;
   private final ChoiceGroup c;

   eo(fj var1, ChoiceGroup var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1.getCommandType() == 4) {
         j7.m = this.c.isSelected(0);
         fu.aR = this.c.isSelected(1);
         fu.aS = this.c.isSelected(2);
      }

      Display.getDisplay(GameMidlet.j).setCurrent(k4.b);
      fj.g().a(30, -1);
      f1.d().p = 4;
      f1.d().l = false;
      f1.d().g();
   }
}
