import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;

final class d2 implements ItemStateListener {
   private dz b;
   private final ChoiceGroup c;
   private final Form d;
   private final TextField e;

   d2(dz var1, ChoiceGroup var2, Form var3, TextField var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final void itemStateChanged(Item var1) {
      if (var1 == this.c) {
         if (this.c.isSelected(0)) {
            if (this.d.get(1) != this.e) {
               this.d.insert(1, this.e);
               this.c.notifyStateChanged();
               return;
            }
         } else if (this.d.get(1) == this.e) {
            this.d.delete(1);
            this.c.notifyStateChanged();
         }
      }
   }
}
