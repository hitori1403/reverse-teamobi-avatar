import java.io.IOException;
import java.util.Vector;

public final class h1 extends hs {
   private static h1 d;

   public static h1 b() {
      if (d == null) {
         d = new h1();
      }

      return d;
   }

   public final void c() {
      this.a((byte)6);
      this.a();
   }

   public final void b(byte var1) {
      this.a((byte)7);
      this.b(var1);
      this.a();
   }

   public final void d(int var1) {
      try {
         this.c((byte)56);
         ij var2 = super.c;
         super.c.d.writeByte(var1);
      } catch (Exception var3) {
      }

      this.a();
   }

   public final void b(byte var1, byte var2, String var3) {
      this.a((byte)8);

      try {
         ij var4 = super.c;
         super.c.d.writeByte(var1);
         var4 = super.c;
         super.c.d.writeByte(var2);
         var4 = super.c;
         super.c.d.writeUTF(var3);
      } catch (IOException var5) {
      }

      this.a();
   }

   public final void d() {
      this.a((byte)28);
      this.a();
   }

   public final void e() {
      this.a((byte)-18);
      this.a();
   }

   public final void b(byte[] var1) {
      try {
         this.c((byte)21);
         ij var3 = super.c;
         super.c.d.writeByte(var1.length);

         for(int var2 = 0; var2 < var1.length; ++var2) {
            var3 = super.c;
            super.c.d.write(var1[var2]);
         }
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void f() {
      try {
         this.c((byte)49);
      } catch (Exception var1) {
      }

      this.a();
   }

   public final void c(byte var1) {
      super.a(var1);
      ij var2 = super.c;
      super.c.d.writeByte(ft.G);
      ij var3 = super.c;
      super.c.d.writeByte(ft.H);
   }

   public final void d(byte var1) {
      try {
         this.c((byte)21);
         ij var2 = super.c;
         super.c.d.writeByte(var1);
      } catch (Exception var3) {
      }

      this.a();
   }

   public final void g() {
      try {
         this.c((byte)63);
      } catch (Exception var1) {
      }

      this.a();
   }

   public final void b(int[] var1, byte var2) {
      try {
         this.c((byte)64);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            ij var4 = super.c;
            super.c.d.writeByte(var1[var3]);
         }

         ij var6 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var5) {
      }

      this.a();
   }

   public final void b(b3[] var1) {
      try {
         this.c((byte)65);
         byte var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1[var3].b != 0) {
               if (var1[var3].b != var2 && var2 != -1) {
                  ij var4 = super.c;
                  super.c.d.writeByte(-1);
               }

               var2 = var1[var3].b;
               ij var6 = super.c;
               super.c.d.writeByte(var1[var3].c);
            } else if (var2 != -1) {
               ij var7 = super.c;
               super.c.d.writeByte(-1);
               var2 = -1;
            }
         }
      } catch (Exception var5) {
      }

      this.a();
   }

   public final void b(int[] var1) {
      try {
         this.c((byte)67);

         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] != -1) {
               ij var3 = super.c;
               super.c.d.writeByte(var1[var2]);
            }
         }
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void b(int[] var1, int var2) {
      try {
         this.c((byte)68);
         ij var3 = super.c;
         super.c.d.writeByte(var2);

         for(int var5 = 0; var5 < 5 && var1[var5] != -1; ++var5) {
            var3 = super.c;
            super.c.d.writeByte(var1[var5]);
         }
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void b(String var1) {
      try {
         this.c((byte)9);
         ij var2 = super.c;
         super.c.d.writeUTF(var1);
      } catch (IOException var3) {
      }

      this.a();
   }

   public final void h() {
      try {
         this.c((byte)15);
      } catch (IOException var1) {
      }

      this.a();
   }

   public final void b(boolean var1) {
      try {
         this.c((byte)16);
         ij var2 = super.c;
         super.c.d.writeBoolean(var1);
      } catch (IOException var3) {
      }

      this.a();
   }

   public final void e(int var1) {
      try {
         this.c((byte)19);
         ij var2 = super.c;
         super.c.d.writeInt(var1);
      } catch (IOException var3) {
      }

      this.a();
   }

   public final void c(String var1) {
      try {
         this.c((byte)18);
         ij var2 = super.c;
         super.c.d.writeUTF(var1);
      } catch (IOException var3) {
      }

      this.a();
   }

   public final void f(int var1) {
      try {
         this.c((byte)11);
         ij var2 = super.c;
         super.c.d.writeInt(var1);
      } catch (IOException var3) {
      }

      this.a();
   }

   public final void i() {
      try {
         this.c((byte)20);
      } catch (IOException var1) {
      }

      this.a();
   }

   public final void b(is[][] var1) {
      try {
         this.c((byte)64);

         for(int var2 = 0; var2 < 8; ++var2) {
            for(int var3 = 0; var3 < 8; ++var3) {
               if (var1[var2][var3].q) {
                  var1[var2][var3].q = false;
                  ij var4 = super.c;
                  super.c.d.writeByte((var2 << 3) + var3);
               }
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      this.a();
   }

   public final void b(int var1, int var2) {
      try {
         this.c((byte)21);
         ij var3 = super.c;
         super.c.d.writeByte(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      this.a();
   }

   public final void j() {
      try {
         this.c((byte)24);
      } catch (IOException var1) {
         var1.printStackTrace();
      }

      this.a();
   }

   public final void b(Vector var1) {
      try {
         this.c((byte)21);
         if (var1.size() > 0) {
            for(int var2 = 0; var2 < var1.size(); ++var2) {
               h8 var3 = (h8)var1.elementAt(var2);
               ij var4 = super.c;
               super.c.d.writeByte(var3.c);
               var3.c = 0;
            }
         }
      } catch (Exception var5) {
      }

      this.a();
   }

   public final void b(byte var1, byte var2) {
      try {
         this.c((byte)65);
         ij var3 = super.c;
         super.c.d.writeByte(var1);
         var3 = super.c;
         super.c.d.writeByte(var2);
      } catch (Exception var4) {
      }

      this.a();
   }

   public final void k() {
      try {
         this.c((byte)49);
      } catch (Exception var1) {
      }

      this.a();
   }
}
