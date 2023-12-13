import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;

final class d1 implements CommandListener {
   private d0 b;
   private final ChoiceGroup c;
   private final TextField d;

   d1(d0 var1, ChoiceGroup var2, TextField var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1.getCommandType() == 4) {
         j7.m = this.c.isSelected(0);
         fu.aR = this.c.isSelected(1);
         fu.aS = this.c.isSelected(2);
         j7.q = Integer.parseInt(this.d.getString());
      }

      GameMidlet.j.b(k4.b);
   }
}
