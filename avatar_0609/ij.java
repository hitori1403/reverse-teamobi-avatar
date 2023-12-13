import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class ij {
   public byte b;
   ByteArrayOutputStream c = null;
   DataOutputStream d = null;
   private ByteArrayInputStream e = null;
   DataInputStream f = null;

   public ij() {
   }

   public ij(byte var1) {
      this.b = var1;
      this.c = new ByteArrayOutputStream();
      this.d = new DataOutputStream(this.c);
   }

   public ij(byte var1, byte[] var2) {
      this.b = var1;
      this.e = new ByteArrayInputStream(var2);
      this.f = new DataInputStream(this.e);
   }

   public final DataInputStream b() {
      return this.f;
   }
}
