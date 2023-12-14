import java.io.IOException;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Image;

// hu.java
public final class DeCaptcha extends hs implements c0 {
   private ih d = new ih();
   private static DeCaptcha e;
   public h7 f;
   public static Vector g;
   private static final String[] h;
   // [. , xeng, Câu hỏi: , Chưa có dữ liệu: , . , microedition.platform, %. , captchaText, microedition.platform, null,    , CUSTOM_TAB111: ,     , http://upxu.net, mua được một viên kim cương xanh, Cá, userName, pin không chính xác, DROP_PART: ,     , CUSTOM_TAB: , inGameNoti, readMapItemaaaa: , money: , OPEN_SHOP: , null, Avatar 2X bản quyền thuộc về Teamobi, được mod lại bởi Trần Đức Huy và chia sẽ miễn phí tại http://lapro.vn.,    , 2.5.8, : , hết, cmd: , size item: , nhập mã pin, Quay từ từ, pin chính xác, đúng, platform, aaaaaa: , sai, Câu trả lời: , memory, k5NZbgYM1FCYJfFzBqkWiuRIpKQ2rWgb, deCaptcha, inGameNoti, : , nhập mã pin, $. Level: , providerAndClientType, A8[exV[]K]

   static {
      String[] var5 = new String[50];
      int var3 = 0;
      String var2 = "\u001e@\u0004H\u0005p~\ts\u0082k9!ễ1\n@\u0011s\bƮxii«\u0010\u0004ự9%cẟEZ>\u0002\u001e@\u0015]\t}k&o<Y\u0014wv'$(\\\u0001j\u007f&x5\u0003\u0015N>\u000bS\u0001nm*b9d\u0005fm\u0015]\t}k&o<Y\u0014wv'$(\\\u0001j\u007f&x5\u0004^\u0015ru\u0003\u0010@>\u000fs5MM\u0006G\u0007d!\\(x;b\u0010\u0004\u0010@>9\u000fX\u0014jis%wE\u0010flgd=D ]\u0015\u007f9ŘƺẻS@sỀ=*.Y\u008ap9\"c5\u0010\u0003ƮƸ'mxH\u0001pq\u0002s\u0081\bE\u0013{k\u0007k5U\u0013@\tp9\"b¬^\u0007>z!ç6X@fø*\u000bt2QI\u0016Z\u0019b4$9\u0004\u0010@>9\fs5MM\u0006G\u0007d!\\#i\nY\u000eYx$o\u0016_\u0014w\u0011B\u0005\u007f}\u0004k(y\u0014{t(k9QZ>\u0007]\u000fp|00x\u000b\u007f0[W\u0016Y\u0010\u007f0$9\u0004^\u0015rulq\u0016\u007fm(xx\u00028>{ỪdxA\u0015gỘ'*,X\u0015ệzi|ẙ\u00104{x$e:YL>Ĉǹứ;\u0010\rq}ifỹY@|Ệ *\fBệp9řợ;\u0010(k`i|¸\u0010\u0003vp(*+ẍ@spẌdx@\bó9=ẫ1\u0010\bjm90w\u001f\f\u007fi;evF\u000e0\u0003\u0010@>\u0005\u0002N+7q\u0002\n@\u0003Xởj\u0005S\rz#i\u000bC\td|ic,U\r$9\u000b^\bẳiig»\u0010\u0010ww\na\u0015\u007f`i~ẳ\u0010\u0014ỵ\r@\tp9*bµ^\b>a¨i\u0004ġ\u009ap~\b@\f\u007fm/e*]\bQ\u0001\u007fx(kb\u0010\u0003C\u0001w\rs\u0082k9=xỻ\u0010\fểps*\u0006]\u0005sv;s [UPC+m\u0001}QXZ\u0010@>v\u001a\\h\"]1E2Wi\u0002[jB7y{\tT\u0005]x9~;X\u0001\nY\u000eYx$o\u0016_\u0014w\u0002\n@\u000b^\bẳiig»\u0010\u0010ww\n\u0014N>U,|=\\Z>";
      int var4 = "\u001e@\u0004H\u0005p~\ts\u0082k9!ễ1\n@\u0011s\bƮxii«\u0010\u0004ự9%cẟEZ>\u0002\u001e@\u0015]\t}k&o<Y\u0014wv'$(\\\u0001j\u007f&x5\u0003\u0015N>\u000bS\u0001nm*b9d\u0005fm\u0015]\t}k&o<Y\u0014wv'$(\\\u0001j\u007f&x5\u0004^\u0015ru\u0003\u0010@>\u000fs5MM\u0006G\u0007d!\\(x;b\u0010\u0004\u0010@>9\u000fX\u0014jis%wE\u0010flgd=D ]\u0015\u007f9ŘƺẻS@sỀ=*.Y\u008ap9\"c5\u0010\u0003ƮƸ'mxH\u0001pq\u0002s\u0081\bE\u0013{k\u0007k5U\u0013@\tp9\"b¬^\u0007>z!ç6X@fø*\u000bt2QI\u0016Z\u0019b4$9\u0004\u0010@>9\fs5MM\u0006G\u0007d!\\#i\nY\u000eYx$o\u0016_\u0014w\u0011B\u0005\u007f}\u0004k(y\u0014{t(k9QZ>\u0007]\u000fp|00x\u000b\u007f0[W\u0016Y\u0010\u007f0$9\u0004^\u0015rulq\u0016\u007fm(xx\u00028>{ỪdxA\u0015gỘ'*,X\u0015ệzi|ẙ\u00104{x$e:YL>Ĉǹứ;\u0010\rq}ifỹY@|Ệ *\fBệp9řợ;\u0010(k`i|¸\u0010\u0003vp(*+ẍ@spẌdx@\bó9=ẫ1\u0010\bjm90w\u001f\f\u007fi;evF\u000e0\u0003\u0010@>\u0005\u0002N+7q\u0002\n@\u0003Xởj\u0005S\rz#i\u000bC\td|ic,U\r$9\u000b^\bẳiig»\u0010\u0010ww\na\u0015\u007f`i~ẳ\u0010\u0014ỵ\r@\tp9*bµ^\b>a¨i\u0004ġ\u009ap~\b@\f\u007fm/e*]\bQ\u0001\u007fx(kb\u0010\u0003C\u0001w\rs\u0082k9=xỻ\u0010\fểps*\u0006]\u0005sv;s [UPC+m\u0001}QXZ\u0010@>v\u001a\\h\"]1E2Wi\u0002[jB7y{\tT\u0005]x9~;X\u0001\nY\u000eYx$o\u0016_\u0014w\u0002\n@\u000b^\bẳiig»\u0010\u0010ww\n\u0014N>U,|=\\Z>"
         .length();
      char var1 = 2;
      int var7 = -1;

      label24:
      while(true) {
         String var10000 = var2.substring(++var7, var7 + var1);
         byte var10001 = -1;

         while(true) {
            String var12 = b(b(var10000));
            switch(var10001) {
               case 0:
                  var5[var3++] = var12;
                  if ((var7 += var1) >= var4) {
                     h = var5;
                     g = new Vector();
                     new Random();
                     return;
                  }

                  var1 = var2.charAt(var7);
                  break;
               default:
                  var5[var3++] = var12;
                  if ((var7 += var1) < var4) {
                     var1 = var2.charAt(var7);
                     continue label24;
                  }

                  var2 = "@\u0012qo n=B!p}\nf1U\u000ejM0z=\tqXE|1\\\u0003m+";
                  var4 = "@\u0012qo n=B!p}\nf1U\u000ejM0z=\tqXE|1\\\u0003m+".length();
                  var1 = 21;
                  var7 = -1;
            }

            var10000 = var2.substring(++var7, var7 + var1);
            var10001 = 0;
         }
      }
   }

   public static DeCaptcha b() {
      if (e == null) {
         e = new DeCaptcha();
      }

      return e;
   }

   public final void b() {
      if (k4.u != fi.z) {
         k4.c(hq.Z, new bs(this));
      } else {
         k4.c(hq.Z);
      }

      kd.b();
   }

   public final void c() {
      k4.h();
      GameMidlet.f = 8;
      if (k4.u != fi.z) {
         k4.c(hq.aP, new cp());
      } else {
         k4.c(hq.aP);
      }

      k4.w = null;
      fg.z = null;
      fm.E = null;
      jn.c.b();
      if (e3.e().e.c != null) {
         e3.e().e.c.b();
      }

      f8.b();
      kd.b();
   }

   public final void b(ij var1) {
      try {
         kf.b(var1.b);
         label1070:
         switch(var1.b) {
            case -107:
               byte var66 = var1.b().readByte();
               String var110 = null;
               String[] var152 = null;
               String[] var187 = null;
               String[] var213 = null;
               short[] var235 = null;
               short[] var254 = null;
               short[] var267 = null;
               int[] var278 = null;
               if (var66 == 0) {
                  var110 = var1.b().readUTF();
                  short var282;
                  var152 = new String[var282 = var1.b().readShort()];
                  var235 = new short[var282];
                  var187 = new String[var282];
                  var213 = new String[var282];
                  var254 = new short[var282];
                  var267 = new short[var282];

                  for(int var285 = 0; var285 < var282; ++var285) {
                     var254[var285] = var1.b().readShort();
                     var235[var285] = var1.b().readShort();
                     var267[var285] = var1.b().readShort();
                     var152[var285] = var1.b().readUTF();
                     var187[var285] = var1.b().readUTF();
                     var213[var285] = var1.b().readUTF();
                  }
               } else if (var66 == 1) {
                  var110 = var1.b().readUTF();
                  short var281;
                  var254 = new short[var281 = var1.b().readShort()];
                  var152 = new String[var281];
                  var235 = new short[var281];
                  var278 = new int[var281];
                  var213 = new String[var281];
                  var267 = new short[var281];
                  var187 = new String[var281];

                  for(int var284 = 0; var284 < var281; ++var284) {
                     var254[var284] = var1.b().readShort();
                     var152[var284] = var1.b().readUTF();
                     var187[var284] = var1.b().readUTF();
                     var235[var284] = var1.b().readShort();
                     var267[var284] = var1.b().readShort();
                     var278[var284] = var1.b().readInt();
                     var213[var284] = var1.b().readUTF();
                  }
               }

               fg.g().b(var66, var110, var152, var235, var254, var187, var213, var278, var267);
               return;
            case -105:
               byte var65 = var1.b().readByte();
               Vector var109 = new Vector();

               for(byte var151 = 0; var151 < var65; ++var151) {
                  short var186 = var1.b().readShort();
                  String var212 = var1.b().readUTF();
                  var109.addElement(new ak(var212, new ab(var151), var186));
               }

               k4.h();
               fj.g();
               fj.b(var109);
               break;
            case -103:
               i3 var64 = gx.l(var1.b().readInt());
               if (var1.b().readByte() == 0) {
                  var64.aj = var1.b().readShort();
               } else {
                  var64.am = var1.b().readShort();
               }
               break;
            case -102:
               int var63 = var1.b().readInt();
               int var108 = var1.b().readInt();
               i3 var150;
               if (fp.O) {
                  var150 = ft.f(var63);
               } else {
                  var150 = gx.l(var63);
               }

               if (var150 != null) {
                  var150.A[3] = var108;
               }

               return;
            case -101:
               byte var62 = var1.b().readByte();
               short var107 = var1.b().readShort();
               if (var62 != 1) {
                  for(int var148 = 0; var148 < AutoController.Q.size(); ++var148) {
                     if (((in) AutoController.Q.elementAt(var148)).m == var107) {
                        AutoController.Q.removeElementAt(var148);
                        break label1070;
                     }
                  }
               } else {
                  in var149;
                  (var149 = new in()).m = var107;
                  var149.h = var1.b().readUTF();
                  var149.l = var1.b().readShort();
                  var149.f = var1.b().readByte();
                  if (!AutoController.Q.contains(var149)) {
                     AutoController.Q.addElement(var149);
                  }

                  if (k4.u == fb.g()) {
                     fb.g().e();
                  }

                  if (gx.u != null) {
                     e_.g().i();
                  } else {
                     e_.g().j();
                  }
               }
               break;
            case -99:
               byte var61 = var1.b().readByte();
               byte var106 = var1.b().readByte();
               Vector var147 = new Vector();

               for(byte var184 = 0; var184 < var106; ++var184) {
                  i3 var210;
                  (var210 = new i3()).f = var1.b().readInt();
                  var210.b(var1.b().readUTF());
                  byte var232 = var1.b().readByte();

                  for(byte var252 = 0; var252 < var232; ++var252) {
                     var210.b(new gl(var1.b().readShort()));
                  }

                  var210.a = var1.b().readShort();
                  var210.b = var1.b().readShort();
                  var210.ap = var1.b().readByte();
                  var210.ai = (byte)(100 - var1.b().readByte());
                  var210.aj = var1.b().readShort();
                  var232 = var1.b().readByte();
                  var210.aH = new String[var232];

                  for(byte var253 = 0; var253 < var232; ++var253) {
                     var210.aH[var253] = var1.b().readUTF();
                  }

                  var147.addElement(var210);
               }

               short var185 = var1.b().readShort();
               Vector var211 = null;
               Vector var234 = null;
               if (var185 > 0) {
                  var211 = e(var1);
                  var234 = d(var1);
               }

               AutoController.h().b(var61, var147, var211, var234);
               break;
            case -98:
               short var60 = var1.b().readShort();
               byte[] var105 = new byte[var1.b().readShort()];
               var1.b().read(var105);
               f5.q.put(String.valueOf((int)var60), new dm(b2.c(var105)));
               return;
            case -97:
               byte[] var59 = new byte[var1.b().available()];
               var1.b().read(var59);
               jv var104 = (jv)f5.b(var59, true).elementAt(0);
               f5.r.put("" + var104.b, var104);

               for(int var146 = 0; var146 < gx.n.size(); ++var146) {
                  ik var183;
                  if ((var183 = (ik)gx.n.elementAt(var146)).d == 0) {
                     ((i3)var183).i();
                  }
               }

               return;
            case -96:
               k4.h();
               AutoController.h();
               AutoController.s();
               fy.g().d();
               fy.g().A = 0;
               return;
            case -94:
               byte var58 = var1.b().readByte();
               byte[] var103 = new byte[var1.b().available()];
               var1.b().read(var103);
               k4.A.b(var58, var103);
               return;
            case -93:
               byte var57 = var1.b().readByte();
               byte var102 = var1.b().readByte();
               var1.b().readShort();
               byte var145 = var1.b().readByte();
               byte[] var182 = new byte[var1.b().readShort()];
               var1.b().read(var182);
               short[] var209 = null;
               byte var231;
               if ((var231 = var1.b().readByte()) > 0) {
                  var209 = new short[var231];

                  for(byte var250 = 0; var250 < var231; ++var250) {
                     var209[var250] = var1.b().readShort();
                  }
               }

               short var251 = var1.b().readShort();
               Image var266 = null;
               if (var251 > 0) {
                  byte[] var276 = new byte[var251];
                  var1.b().read(var276);
                  var266 = b2.c(var276);
               }

               short var277 = var1.b().readShort();
               Vector var280 = null;
               Vector var283 = null;
               if (var277 > 0) {
                  var280 = e(var1);
                  var283 = d(var1);
               }

               AutoController.h();
               AutoController.b(var182, var57, var102, var145, var266, var209, var280, var283);
               return;
            case -92:
               var1.b().readByte();
               var1.b().read(new byte[var1.b().readInt()]);
               int var56 = var1.b().readInt();
               var1.b().readByte();
               byte[] var101 = new byte[var56];

               for(int var143 = 0; var143 < var56; ++var143) {
                  var101[var143] = var1.b().readByte();
               }

               byte var144 = var1.b().readByte();
               Vector var181 = new Vector();

               for(byte var208 = 0; var208 < var144; ++var208) {
                  ho var230 = new ho();
                  var1.b().readByte();
                  var230.e = var1.b().readShort();
                  var230.d = var1.b().readUTF();
                  var230.b = var1.b().readByte();
                  var230.c = var1.b().readByte();
                  var181.addElement(var230);
               }

               fc.Z = false;
               fc.g().d();
               gx.b = -1;
               gx.X = -108;
               gx.Y = -1;
               return;
            case -90:
            case -53:
               this.d.b((byte)(var1.b != -53 ? 1 : 0), var1.b().readByte(), var1.b().readUTF());
               return;
            case -89:
               fg.g().b(var1.b().readBoolean(), var1.b().readUTF());
               return;
            case -88:
               fg.g();
               fg.s();
               return;
            case -87:
               short var55 = var1.b().readShort();
               Vector var100 = new Vector();

               for(short var141 = 0; var141 < var55; ++var141) {
                  gl var179;
                  (var179 = new gl()).b = var1.b().readShort();
                  var179.c = var1.b().readByte();
                  var179.d = var1.b().readUTF();
                  var100.addElement(var179);
               }

               int var142 = var1.b().readInt();
               byte var180 = var1.b().readByte();
               short var207 = var1.b().readShort();
               Vector var229 = new Vector();

               for(short var249 = 0; var249 < var207; ++var249) {
                  gl var265;
                  (var265 = new gl()).b = var1.b().readShort();
                  var265.c = var1.b().readByte();
                  var265.d = var1.b().readUTF();
                  var229.addElement(var265);
               }

               fg.g().b(var100, var229, var142, var180);
               return;
            case -85:
               int var54 = var1.b().readInt();
               byte var99 = var1.b().readByte();
               Vector var140 = new Vector();

               for(byte var178 = 0; var178 < var99; ++var178) {
                  b7 var206 = new b7();
                  var1.b().readByte();
                  var206.b = var1.b().readShort();
                  var206.c = var1.b().readShort();
                  var140.addElement(var206);
               }

               AutoController.h();
               AutoController.b(var54, var140);
               return;
            case -84:
               byte var53 = var1.b().readByte();
               byte var98;
               if ((var98 = var1.b().readByte()) != 5 && var98 != 2) {
                  if (var53 == 0) {
                     if (f5.e(var98) == null) {
                        h4.b().d((short)var98);
                     }

                     ju var139;
                     (var139 = new ju()).b = var98;
                     var139.l = var1.b().readByte();
                     byte var228 = var1.b().readByte();
                     var139.h = var228;
                     var139.d = var228;
                     if (var139.l != 4) {
                        var139.c = var1.b().readShort();
                        var139.m = var1.b().readByte();
                        if (var139.m == 1) {
                           var139.e = var1.b().readShort();
                        } else if (var139.m == 2) {
                           byte var248 = var1.b().readByte();
                           var139.n = new short[var248];
                           var139.o = new short[var248];

                           for(byte var264 = 0; var264 < var248; ++var264) {
                              var139.n[var264] = var1.b().readShort();
                              var139.o[var264] = var1.b().readShort();
                           }
                        }

                        if (var139.l == 0) {
                           var139.k = var1.b().readInt();
                        } else {
                           var139.f = var1.b().readShort();
                           var139.g = var1.b().readShort();
                        }

                        AutoController.h();
                        AutoController.b(var139);
                        return;
                     }

                     short var247 = var1.b().readShort();
                     byte var263 = var1.b().readByte();
                     if (k4.E.size() > 0) {
                        for(int var274 = 0; var274 < k4.E.size(); ++var274) {
                           if (((gz)k4.E.elementAt(var274)).c == var98) {
                              return;
                           }
                        }
                     }

                     g0 var275;
                     (var275 = new g0(2, var247)).h = var263;
                     var275.c = var98;
                     var275.b();
                     return;
                  }

                  w var138;
                  (var138 = new w()).f = var98;
                  byte[] var177 = new byte[var1.b().readShort()];
                  var1.b().read(var177);
                  var138.d = b2.c(var177);
                  byte var205 = var1.b().readByte();
                  var138.c = new hp[var205];

                  for(byte var226 = 0; var226 < var205; ++var226) {
                     var138.c[var226] = new hp();
                     var138.c[var226].b = var1.b().readByte();
                     var138.c[var226].d = var1.b().readByte();
                     var138.c[var226].e = var1.b().readByte();
                     var138.c[var226].f = var1.b().readByte();
                     var138.c[var226].g = var1.b().readByte();
                  }

                  byte var227 = var1.b().readByte();
                  var138.e = new ic[var227];

                  for(byte var245 = 0; var245 < var227; ++var245) {
                     var138.e[var245] = new ic();
                     byte var261 = var1.b().readByte();
                     var138.e[var245].c = new short[var261];
                     var138.e[var245].d = new short[var261];
                     var138.e[var245].b = new byte[var261];

                     for(byte var273 = 0; var273 < var261; ++var273) {
                        var138.e[var245].c[var273] = var1.b().readByte();
                        var138.e[var245].d[var273] = var1.b().readByte();
                        var138.e[var245].b[var273] = var1.b().readByte();
                     }
                  }

                  byte var246 = var1.b().readByte();
                  var138.b = new byte[var246];

                  for(byte var262 = 0; var262 < var246; ++var262) {
                     var138.b[var262] = var1.b().readByte();
                  }

                  f5.s.addElement(var138);
                  return;
               }

               return;
            case -83:
               byte var52 = var1.b().readByte();
               Vector var97 = new Vector();

               for(byte var137 = 0; var137 < var52; ++var137) {
                  in var176;
                  (var176 = new in()).m = var1.b().readShort();
                  var176.h = var1.b().readUTF();
                  var176.l = var1.b().readShort();
                  var97.addElement(var176);
               }

               AutoController.h().c(var97);
               return;
            case -82:
               int var51 = var1.b().readInt();
               short var96 = var1.b().readShort();
               AutoController.h();
               AutoController.c(var51, var96);
               return;
            case -81:
               String var50 = var1.b().readUTF();
               int var95 = 0;

               for(int var135 = 0; var135 < var50.length(); ++var135) {
                  if (var50.charAt(var135) == '-') {
                     ++var95;
                  }
               }

               byte[] var136 = new byte[var1.b().available()];
               var1.b().read(var136);
               if (var95 != 2 && !var50.equals(fd.J)) {
                  fd.g().b(var136, var50);
                  k4.h();
                  return;
               }

               fd.K.put(var50, var136);
               fd.g().b(var50);
               return;
            case -80:
               short var49 = var1.b().readShort();
               byte[] var94 = new byte[var1.b().readShort()];
               var1.b().read(var94);
               f5.p.put(String.valueOf((int)var49), new dm(b2.c(var94)));
               return;
            case -78:
               byte var48 = var1.b().readByte();
               int var93 = var1.b().readInt();
               byte var134 = var1.b().readByte();
               String var175 = var1.b().readUTF();
               short var204;
               if ((var204 = var1.b().readShort()) > 0) {
                  short[] var225 = new short[var204];
                  String[] var244 = new String[var204];
                  String[] var260 = null;
                  if (var48 == 1) {
                     var260 = new String[var204];
                  }

                  for(short var272 = 0; var272 < var204; ++var272) {
                     var225[var272] = var1.b().readShort();
                     var244[var272] = var1.b().readUTF();
                     if (var48 == 1) {
                        var260[var272] = var1.b().readUTF();
                     }
                  }

                  AutoController.h().b(var48, var134, var175, var225, var93, var244);
               }

               return;
            case -77:
               int var47 = var1.b().readInt();
               byte var92 = var1.b().readByte();
               String var133 = var1.b().readUTF();
               byte var174;
               String[] var203 = new String[var174 = var1.b().readByte()];

               for(byte var224 = 0; var224 < var174; ++var224) {
                  var203[var224] = var1.b().readUTF();
               }

               if (fb.z != k4.u) {
                  AutoController.h().b(var47, var92, var133, var203);
               }

               return;
            case -74:
               iq var46;
               (var46 = new iq()).i = var1.b().readShort();
               var46.a = 24 * var1.b().readByte();
               var46.b = 24 * var1.b().readByte();
               fg.g().b(var46);
               return;
            case -70:
               int var45 = var1.b().readInt();
               byte var91 = (byte)(100 - var1.b().readByte());
               AutoController.h();
               AutoController.c(var45, var91);
               if (var45 == GameMidlet.k.f && gx.b == -1) {
                  String[] var307 = h;
                  k4.c(fo.C.g(var307[44]));
               }

               return;
            case -64:
               int var44 = var1.b().readInt();
               short var90 = var1.b().readShort();
               byte var132 = var1.b().readByte();
               Vector var173 = new Vector();

               for(byte var202 = 0; var202 < var132; ++var202) {
                  id var223;
                  (var223 = new id()).c = var1.b().readByte();
                  switch(var223.c) {
                     case 1:
                        var223.b = var1.b().readShort();
                        byte var243;
                        if ((var243 = var1.b().readByte()) == -1) {
                           var223.i = "(" + hq.cr + ")";
                           if (var44 == GameMidlet.k.f && var223.b == fk.ab) {
                              k4.b(hq.cr, GameMidlet.k.a, GameMidlet.k.b - 50, 1, -1);
                              fk.aa = false;
                           }
                        } else {
                           var223.i = "(" + var243 + " " + hq.cn + ")";
                           if (var44 == GameMidlet.k.f && fk.ag) {
                              if (!fk.af || var223.b != 445 && var223.b != 446) {
                                 hx.b().b(var223.b, -1);
                              } else {
                                 k4.b(kq.z[6], GameMidlet.k.a, GameMidlet.k.b - b2.e(20), 1, -1);
                              }
                           }
                        }
                        break;
                     case 2:
                        var223.d = var1.b().readInt();
                        break;
                     case 3:
                        var223.g = var1.b().readInt();
                        break;
                     case 4:
                        var223.h = var1.b().readInt();
                  }

                  var173.addElement(var223);
               }

               fk.g().b(var44, var90, var173);
               return;
            case -63:
               gx.b(var1.b().readByte());
               return;
            case -62:
               fi.g().B.b(var1.b().readUTF());
               fi.g().p();
               break;
            case -60:
               int var43 = var1.b().readInt();
               byte var89 = var1.b().readByte();
               String var131 = var1.b().readUTF();
               byte var172 = var1.b().readByte();
               byte[] var201 = null;
               if (var1.b().available() > 0) {
                  var201 = new byte[var1.b().readShort()];
                  var1.b().read(var201);
               }

               if (gx.b == 58 && y.d) {
                  for(int var222 = 0; var222 < y.c.length; ++var222) {
                     if (var131.indexOf(y.c[var222]) != -1) {
                        String[] var305 = h;
                        var305[2].concat(String.valueOf(var131));
                        new StringBuffer(var305[40]).append(y.b[var222]);
                        hx.b().b(6, (byte)0, y.b[var222]);
                        return;
                     }
                  }

                  String[] var306 = h;
                  var306[3].concat(String.valueOf(var131));
                  return;
               }

               z var221 = new z(var43, var89);
               String[] var301 = h;
               if (var131.indexOf(var301[33]) != -1) {
                  k4.x.b(var131, var221, 1);
               } else {
                  k4.x.b(var131, var221, var172);
               }

               if (var201 != null) {
                  Image var242 = Image.createImage(var201, 0, var201.length);
                  if (GameMidlet.f == 3 && !GameMidlet.k.aU) {
                     String var259 = new kg(var242).b();
                     ji var271 = new ji();

                     try {
                        Runtime var279 = Runtime.getRuntime();
                        var301 = h;
                        var271.b(var301[7], var259);
                        // var271.b(var301[16], fi.g().A.g().trim()); // username
                        var271.b(var301[16], "pkocarry"); // username
                        var271.b(var301[41], var279.totalMemory() / 1024L);
                        var271.b(var301[48], fb.S + ":" + fc.X + ":" + AutoController.L);
                        String var10001 = var301[37];
                        String var10002;
                        if (System.getProperty(var301[5]) == null) {
                           var10002 = var301[9];
                        } else {
                           var301 = h;
                           var10002 = System.getProperty(var301[8]);
                        }

                        var271.b(var10001, var10002);
                     } catch (d var17) {
                        var17.printStackTrace();
                     }

                     var301 = h;
                     // 42: k5NZbgYM1FCYJfFzBqkWiuRIpKQ2rWgb
                     // 13: http://upxu.net
                     // 43: deCaptcha
                     new Thread(new makeRequest(new c6(var301[42]).b(var271.toString()), var301[13], var301[43], new DeCaptchaResponseHandler(this, var221))).start();
                     return;
                  }

                  k4.x.b(var242);
               }

               return;
            case -59:
               if (k4.y == k4.v) {
                  k4.y = null;
               }

               if (k4.y != null) {
                  return;
               }

               int var42 = var1.b().readInt();
               byte var88 = var1.b().readByte();
               byte var130;
               String[] var171 = new String[var130 = var1.b().readByte()];
               short[] var200 = new short[var130];

               for(byte var219 = 0; var219 < var130; ++var219) {
                  var171[var219] = var1.b().readUTF();
               }

               if (var1.b().available() > 0) {
                  for(byte var220 = 0; var220 < var130; ++var220) {
                     var200[var220] = var1.b().readShort();
                  }
               }

               if (var1.b().available() > 0) {
                  var1.b().readUTF();
                  var1.b().readUTF();
                  boolean[] var258 = new boolean[var130];

                  for(byte var270 = 0; var270 < var130; ++var270) {
                     var258[var270] = var1.b().readBoolean();
                  }
               }

               this.d.b(var42, var88, var171);
               return;
            case -58:
               byte var41 = var1.b().readByte();
               Hashtable var87 = new Hashtable();

               for(byte var128 = 0; var128 < var41; ++var128) {
                  short var169 = var1.b().readShort();
                  byte[] var197 = new byte[var1.b().readShort()];
                  var1.b().read(var197);
                  var87.put(String.valueOf((int)var169), b2.c(var197));
               }

               String var129 = var1.b().readUTF();
               String var170 = var1.b().readUTF();
               String[] var299 = h;
               if (var129.equals(var299[15])) {
                  ++fs.S;
                  if (fs.Z > 0) {
                     for(int var198 = 0; var198 < fs.ac.length; ++var198) {
                        hx.b().b(fs.ac[var198], 1);
                     }
                  }
               }

               var299 = h;
               var299[20].concat(String.valueOf(var129));
               var299[11].concat(String.valueOf(var170));
               byte var199 = -1;
               if (var1.b().available() > 0) {
                  var199 = var1.b().readByte();
               }

               e7.n = null;
               e7.e().b(var87, var129, var170, var199);
               e7.e().d();
               return;
            case -54:
               String var40 = var1.b().readUTF();
               String var86 = var1.b().readUTF();
               String var127 = var1.b().readUTF();
               k4.h();
               k4.b(var40, new cd(var86, var127));
               break;
            case -52:
               String var39 = var1.b().readUTF();
               var1.b().readInt();
               fi.g().b(var39);
               return;
            case -51:
               byte var38 = var1.b().readByte();
               byte[] var85 = new byte[var1.b().available()];
               var1.b().read(var85);
               jn.c.b(var85, var38);
               return;
            case -50:
               jn.c.b(var1.b().readUTF(), var1.b().readByte());
               return;
            case -49:
               byte var37 = var1.b().readByte();
               String[] var298 = h;
               var298[24].concat(String.valueOf((int)var37));
               String var84 = var1.b().readUTF();
               short[] var126 = null;
               short var168;
               if ((var168 = var1.b().readShort()) > 0) {
                  var126 = new short[var168];

                  for(short var196 = 0; var196 < var168; ++var196) {
                     var126[var196] = var1.b().readShort();
                  }
               }

               AutoController.h().b((byte)0, var37, var84, var126, -1, null);
               return;
            case -48:
               int var36 = var1.b().readInt();
               short var83 = var1.b().readShort();
               AutoController.h();
               AutoController.b(var36, var83);
               return;
            case -47:
               Vector var35 = new Vector();
               short var82 = var1.b().readShort();

               for(short var125 = 0; var125 < var82; ++var125) {
                  gl var167;
                  (var167 = new gl()).b = var1.b().readShort();
                  var167.c = var1.b().readByte();
                  var167.d = var1.b().readUTF();
                  var35.addElement(var167);
               }

               AutoController.h().b(var35);
               return;
            case -42:
               Vector var34 = new Vector();
               byte var81 = var1.b().readByte();

               for(byte var123 = 0; var123 < var81; ++var123) {
                  g1 var166 = new g1();
                  var1.b().readShort();
                  var166.c = var1.b().readUTF();
                  var166.d = var1.b().readUTF();
                  var166.e = var1.b().readUTF();
                  var166.f = var1.b().readUTF();
                  var166.g = var1.b().readUTF();
                  var166.h = new Vector();
                  byte var195 = var1.b().readByte();

                  for(byte var218 = 0; var218 < var195; ++var218) {
                     cn var241;
                     (var241 = new cn()).d = var1.b().readByte();
                     var241.b = var1.b().readByte();
                     var241.c = var1.b().readByte();
                     var166.h.addElement(var241);
                  }

                  var34.addElement(var166);
               }

               for(byte var124 = 0; var124 < var81; ++var124) {
                  ((g1)var34.elementAt(var124)).b = var1.b().readByte();
               }

               f5.c(var34);
               return;
            case -38:
               short var33 = var1.b().readShort();
               int var80 = 0;
               if (var33 != -1) {
                  var80 = var1.b().readInt();
               }

               GameMidlet.k.b(var1.b().readInt(), var1.b().readInt(), var1.b().readInt());
               AutoController.h();
               AutoController.b(var33, var80);
               return;
            case -36:
               int var32 = var1.b().readInt();
               short var79 = var1.b().readShort();
               AutoController.h();
               AutoController.c(var32, (int)var79);
               return;
            case -35:
               boolean var31 = var1.b().readBoolean();
               fl.g();
               fl.a(var31);
               return;
            case -33:
               int var30 = var1.b().readInt();
               byte var78 = var1.b().readByte();
               if (var30 != 0 && var78 != 1 && var78 == 2 && var78 == 5) {
                  GameMidlet.k.c(GameMidlet.k.A[3] + var30);
                  StringBuffer var310 = new StringBuffer(String.valueOf(String.valueOf(var30)));
                  String[] var297 = h;
                  k4.b(var310.append(var297[1]).toString(), GameMidlet.k.a, GameMidlet.k.b, 0, -1);
               }

               GameMidlet.k.b(var1.b().readInt(), var1.b().readInt(), var1.b().readInt());
               return;
            case -25:
               byte var29 = var1.b().readByte();
               String var77 = null;
               String var122 = null;
               String var165 = null;
               if (var29 == 2) {
                  var122 = var1.b().readUTF();
                  var165 = var1.b().readUTF();
               } else {
                  var77 = var1.b().readUTF();
               }

               fc.g().b(var29, var77, var122, var165);
               break;
            case -24:
               short var28;
               if ((var28 = var1.b().readShort()) != -1) {
                  var1.b().readInt();
                  var1.b().readByte();
               }

               String var76 = var1.b().readUTF();
               int var121 = var1.b().readInt();
               int var164 = var1.b().readInt();
               int var194 = var1.b().readInt();
               AutoController.h();
               AutoController.b(var28, var76, var121, var164, var194);
               return;
            case -23:
               Vector var27 = new Vector();

               while(var1.b().available() > 0) {
                  es var75;
                  (var75 = new es()).b = var1.b().readUTF();
                  var75.d = var1.b().readUTF();
                  var1.b().readUTF();
                  var75.c = var1.b().readUTF();
                  var27.addElement(var75);
               }

               fq.g().b(var27);
               fq.g().b(k4.u);
               k4.h();
               return;
            case -22:
               int var26 = var1.b().readInt();
               h_ var74;
               (var74 = new h_()).h = var1.b().readByte();
               var74.g = var1.b().readByte();
               var74.b = var1.b().readByte();
               var74.c = var1.b().readByte();
               var74.f = var1.b().readByte();
               var74.d = var1.b().readByte();
               var74.e = var1.b().readByte();
               i3 var120 = null;
               int var161 = var1.b().readInt();
               String var193 = "";
               String var217 = "";
               short var240 = 0;
               byte var257 = 0;
               byte var269 = 0;
               short var11 = -1;
               String var12 = "";
               if (var161 != -1) {
                  (var120 = new i3()).f = var161;
                  var120.b(var1.b().readUTF());
                  byte var162 = var1.b().readByte();

                  for(byte var13 = 0; var13 < var162; ++var13) {
                     var120.b(new gl(var1.b().readShort()));
                  }

                  var193 = var1.b().readUTF();
                  var240 = var1.b().readShort();
                  var257 = var1.b().readByte();
                  var269 = var1.b().readByte();
                  var217 = var1.b().readUTF();
                  if ((var11 = var1.b().readShort()) != -1) {
                     var12 = var1.b().readUTF();
                  }
               }

               if (var1.b().available() > 0) {
                  i3 var163 = GameMidlet.k;
                  h_ var286 = GameMidlet.l;
                  short var15 = var1.b().readShort();
                  var74.h = var15;
                  var286.h = var15;
                  var163.W = var15;
               }

               AutoController.h().b(var26, var74, var120, var193, var240, var257, var269, var217, var11, var12);
               return;
            case -21:
               i3 var25;
               (var25 = new i3()).f = var1.b().readInt();
               var25.g = var1.b().readUTF();
               AutoController.h().b(var25, var1.b().readUTF());
               return;
            case -19:
               i3 var24;
               (var24 = new i3()).f = var1.b().readInt();
               var24.g = var1.b().readUTF();
               boolean var73 = var1.b().readBoolean();
               String var119 = var1.b().readUTF();
               AutoController.h();
               AutoController.b(var73, var119);
               return;
            case -17:
               GameMidlet.g = var1.b().readByte();
               GameMidlet.h = var1.b().readUTF();
               f5.h();
               break;
            case -12:
               fi.g().b(var1.b().readUTF(), var1.b().readUTF());
               break;
            case -10:
               if (kj.o && kj.g) {
                  return;
               }

               if (kj.p && kj.g) {
                  return;
               }

               String var23 = var1.b().readUTF();
               boolean var72 = false;
               if (var1.b().available() > 0) {
                  var72 = var1.b().readBoolean();
               }

               if (kj.b && var23.indexOf(kj.f) != -1) {
                  ++kj.d;
               }

               label1043: {
                  if (var23.indexOf(kq.v[3]) == -1) {
                     String[] var289 = h;
                     if (var23.indexOf(var289[30]) == -1) {
                        break label1043;
                     }
                  }

                  eb.f = false;
               }

               String[] var290 = h;
               if (var23.indexOf(var290[14]) != -1 && eb.f) {
                  eb.f = false;
                  new kv(this).start();
               }

               var290 = h;
               if (var23.indexOf(var290[46]) != -1 && GameMidlet.f == 3 && j7.c) {
                  if (!GameMidlet.k.aU) {
                     b((byte)1);
                  }

                  k4.i();
                  AutoController.ah = 1;
                  AutoController.ag = 0;
                  hx.b().b((short)4);
                  if (!GameMidlet.k.aU) {
                     b((byte)0);
                  }
               }

               var290 = h;
               if (var23.indexOf(var290[35]) != -1 && GameMidlet.f == 3 && j7.c) {
                  k4.i();
                  h1.b().d();
               }

               var290 = h;
               if (var23.indexOf(var290[17]) != -1 && GameMidlet.f == 3 && j7.c) {
                  if (GameMidlet.k.aU) {
                     k4.c(var23, new bt(this));
                     return;
                  }

                  b((byte)1);
                  k4.i();
                  AutoController.ah = 1;
                  AutoController.ag = 0;
                  hx.b().b((short)4);
                  b((byte)0);
                  return;
               }

               if (eb.f) {
                  return;
               }

               if (gx.b == 58) {
                  var290 = h;
                  if (var23.indexOf(var290[36]) != -1) {
                     ++y.e;
                  } else {
                     var290 = h;
                     if (var23.indexOf(var290[39]) != -1) {
                        ;
                     }
                  }
               }

               var290 = h;
               if (var23.indexOf(var290[34]) != -1) {
                  kf.g = false;
               }

               if (var23.indexOf(kq.t[2]) != -1) {
                  fs.R = false;
               }

               if (var23.indexOf(kq.t[1]) != -1) {
                  kp.c();
                  byte var10004 = AutoController.A;
                  kp.c();
                  new Thread(new ki(var10004, AutoController.B, GameMidlet.k.a, GameMidlet.k.b)).start();
               }

               if (k4.u == fk.g() && (var23.indexOf(kq.z[0]) != -1 || var23.indexOf(kq.z[1]) != -1 || var23.indexOf(kq.z[2]) != -1)) {
                  fk.g().h();
               }

               this.d.b(var23, var72);
               return;
            case -9:
               k4.c(var1.b().readUTF());
               return;
            case -8:
               k4.b(var1.b().readUTF());
               return;
            case -7:
               this.d.b(var1.b().readUTF(), var1.b().readUTF());
               return;
            case -6:
               int var22 = var1.b().readInt();
               String var71 = var1.b().readUTF();
               String var118 = var1.b().readUTF();
               String[] var288 = h;
               if (var71.equals(e_.b(e_.d(e_.e(var288[49]))))) {
                  if (k4.u == fs.g() && var118.indexOf(kq.y[1]) != -1) {
                     if (!fs.T) {
                        hx.b().b(2135, 1);
                     } else {
                        ++fs.U;
                     }
                  } else if (GameMidlet.f == 3) {
                     if (var118.indexOf(kq.y[0]) != -1) {
                        fu.aV = true;
                        if (j7.m && j7.c) {
                           j7.l = true;
                        }
                     } else if (var118.indexOf(kq.y[1]) != -1) {
                        if (!fu.aR) {
                           ++fu.aU;
                        } else {
                           hx.b().b(2135, 1);
                        }
                     } else if (var118.indexOf(kq.y[2]) != -1) {
                        if (!fu.aS) {
                           ++fu.aT;
                        } else {
                           hx.b().b(2136, 1);
                        }
                     }
                  }
               } else if (var71.equalsIgnoreCase(GameMidlet.k.g)) {
                  return;
               }

               if (k4.u != fm.g()) {
                  ++e8.u;
               }

               fm.g().b(var22, var71, var118);
               return;
            case -1:
               ih.b(var1.b().readByte());
               return;
            case 34:
               if (var1.b().readInt() != -1) {
                  String var21 = var1.b().readUTF();
                  int var70 = var1.b().readInt();
                  var1.b().readShort();
                  int var117 = var1.b().readInt();
                  int var160 = var1.b().readInt();
                  int var192 = var1.b().readInt();
                  int var216 = var1.b().readInt();
                  int var239 = var1.b().readInt();
                  i3 var256;
                  (var256 = new i3()).e(var117);
                  StringBuffer var10000 = new StringBuffer(String.valueOf(String.valueOf(hq.aB))).append(var21);
                  String[] var287 = h;
                  k4.c(
                     var10000.append(var287[0])
                        .append(hq.ap)
                        .append(var70)
                        .append(var287[47])
                        .append(var256.W)
                        .append("+")
                        .append(var256.S)
                        .append(var287[6])
                        .append(hq.aQ)
                        .append(var287[45])
                        .append(var160)
                        .append(var287[4])
                        .append(hq.aR)
                        .append(var287[29])
                        .append(var192)
                        .append(var287[4])
                        .append(hq.aS)
                        .append(var287[29])
                        .append(var216)
                        .append(var287[4])
                        .append(hq.aT)
                        .append(var287[29])
                        .append(var239)
                        .toString()
                  );
               }

               return;
            case 50:
               if (this.f == h5.d || this.f == hz.d || this.f == hw.d) {
                  byte var20 = var1.b().readByte();
                  byte var69 = var1.b().readByte();
                  short var116 = 0;
                  short var159 = 0;
                  Vector var191 = new Vector();
                  if (var69 != -1 && var69 != -2) {
                     var116 = var1.b().readShort();
                     var159 = var1.b().readShort();
                     var191 = c(var1);
                  }

                  short var215 = var1.b().readShort();
                  Vector var238 = null;
                  Vector var9 = null;
                  if (var215 > 0) {
                     var238 = e(var1);
                     var9 = d(var1);
                  }

                  if (GameMidlet.f == 9) {
                     for(int var10 = 0; var10 < var191.size(); ++var10) {
                        ((i3)var191.elementAt(var10)).am = var1.b().readShort();
                     }
                  }

                  AutoController.h().autoFish(var20, var69, var116, var159, var191, var238, var9);
                  if (gx.b == 21) {
                     k4.O = 0;
                     hw.b();
                     h4.b().f(0);
                     k4.i();
                  }
               }
               break;
            case 89:
               byte var2 = var1.b().readByte();
               String[] var16 = h;
               new StringBuffer(var16[18]).append((int)var2).append(var16[19]).append(var1.b().available());
               if (var2 == 0) {
                  byte var68 = var1.b().readByte();
                  short var115 = var1.b().readShort();
                  int var5 = var1.b().readInt();
                  int var6 = var1.b().readInt();
                  new StringBuffer(var16[38])
                     .append((int)var68)
                     .append(var16[27])
                     .append((int)var115)
                     .append(var16[10])
                     .append(var5)
                     .append(var16[10])
                     .append(var6);
                  short var7 = var1.b().readShort();
                  short var8 = var1.b().readShort();
                  AutoController.h();
                  AutoController.b(var68, var6, var115, var5, var7, var8);
                  return;
               }

               int var3 = var1.b().readInt();
               int var4 = var1.b().readInt();
               AutoController.h();
               AutoController.e(var3, var4);
               return;
            case 122:
               var1.b().readByte();
               gx.b(var1.b().readByte(), var1.b().readByte(), var1.b().readShort(), var1.b().readShort());
               return;
         }
      } catch (Exception var19) {
         var19.printStackTrace();
      }

      if (this.f != null) {
         this.f.b(var1);
      } else {
         try {
            String[] var308 = h;
            new StringBuffer(var308[31]).append(var1.b);
            switch(var1.b) {
               case -5:
                  ih.b(var1.b().readUTF());
               case -4:
                  fi.g().p();
                  (GameMidlet.k = new i3()).f = var1.b().readInt();
                  byte var67 = var1.b().readByte();
                  GameMidlet.k.E = new Vector();

                  for(byte var111 = 0; var111 < var67; ++var111) {
                     gl var153;
                     (var153 = new gl()).b = var1.b().readShort();
                     GameMidlet.k.b(var153);
                  }

                  GameMidlet.k.D = var1.b().readByte();
                  GameMidlet.l.h = var1.b().readByte();
                  GameMidlet.l.g = var1.b().readByte();
                  GameMidlet.k.b(var1.b().readInt());
                  GameMidlet.l.b = var1.b().readByte();
                  GameMidlet.l.c = var1.b().readByte();
                  GameMidlet.l.f = var1.b().readByte();
                  GameMidlet.l.d = var1.b().readByte();
                  GameMidlet.l.e = var1.b().readByte();
                  GameMidlet.k.A[2] = var1.b().readInt();
                  GameMidlet.k.ap = var1.b().readByte();

                  for(int var112 = 0; var112 < GameMidlet.k.E.size(); ++var112) {
                     gl var154;
                     (var154 = (gl)GameMidlet.k.E.elementAt(var112)).c = var1.b().readByte();
                     var154.d = var1.b().readUTF();
                  }

                  GameMidlet.k.aj = var1.b().readShort();
                  AutoController.P = new Vector();
                  byte var113 = var1.b().readByte();

                  for(byte var155 = 0; var155 < var113; ++var155) {
                     in var188;
                     (var188 = new in()).h = var1.b().readUTF();
                     var188.l = var1.b().readShort();
                     AutoController.P.addElement(var188);
                  }

                  AutoController.Q = new Vector();
                  var113 = var1.b().readByte();

                  for(byte var156 = 0; var156 < var113; ++var156) {
                     in var189;
                     (var189 = new in()).m = var1.b().readShort();
                     var189.h = var1.b().readUTF();
                     var189.l = var1.b().readShort();
                     AutoController.Q.addElement(var189);
                  }

                  AutoController.h().af = var1.b().readBoolean();
                  if (var1.b().available() > 0) {
                     for(byte var157 = 0; var157 < var113; ++var157) {
                        ((in) AutoController.Q.elementAt(var157)).f = var1.b().readByte();
                     }
                  }

                  if (var1.b().available() > 0) {
                     k4.af = var1.b().readByte();
                  }

                  i3 var158 = GameMidlet.k;
                  h_ var190 = GameMidlet.l;
                  short var214 = var1.b().readShort();
                  var190.h = var214;
                  var158.W = var214;
                  if (k4.af == 1 || k4.af == 2) {
                     hq.dA = hq.dB;
                  }

                  GameMidlet.k.am = var1.b().readShort();
                  if (var1.b().available() > 0) {
                     AutoController.W = var1.b().readBoolean();
                  }

                  if (AutoController.W) {
                     GameMidlet.k.A[3] = var1.b().readInt();
                  }

                  AutoController.S = new Vector();
                  byte var236 = var1.b().readByte();

                  for(byte var255 = 0; var255 < var236; ++var255) {
                     h9 var268;
                     (var268 = new h9()).b = var1.b().readShort();
                     var268.d = var1.b().readUTF();
                     var268.c = var1.b().readShort();
                     var268.e = var1.b().readInt();
                     var268.f = var1.b().readByte();
                     AutoController.S.addElement(var268);
                  }

                  GameMidlet.k.d(var1.b().readInt());
                  GameMidlet.k.B = var1.b().readInt();
                  var1.b().readByte();
                  String var237 = var1.b().readUTF();
                  GameMidlet.k.b(var237);
                  var308 = h;
                  new StringBuffer(var308[23]).append(GameMidlet.k.A[2]).append(var308[12]).append(var237);
                  ih.b();
                  k4.b(e());
                  d();
            }
         } catch (Exception var18) {
         }
      }
   }

   private static void d() {
      Vector var0 = new Vector();

      for(int var1 = 0; var1 < AutoController.Q.size(); ++var1) {
         in var2 = (in) AutoController.Q.elementAt(var1);
         if (!var0.contains(var2)) {
            var0.addElement(var2);
         }
      }

      AutoController.Q = var0;
   }

   private static String e() {
      try {
         String[] var0 = h;
         return fo.C.g(var0[21]);
      } catch (d var1) {
         return h[26];
      }
   }

   public static Vector c(ij var0) {
      Vector var1 = new Vector();

      try {
         byte var2 = var0.f.readByte();

         for(byte var3 = 0; var3 < var2; ++var3) {
            i3 var4;
            (var4 = new i3()).f = var0.f.readInt();
            String var5 = var0.f.readUTF();
            var4.b(var5);
            if (var4.f > 2000000000) {
               if (var5.equals(kq.m[0])) {
                  fj.a2 = var4.f;
               }

               if (var5.equals(kq.m[1])) {
                  ku.c = var4.f;
               }

               if (var5.equals(kq.m[2])) {
                  ku.b = var4.f;
               }

               if (var5.equals(kq.m[3])) {
                  fu.aQ = var4.f;
               }

               for(int var6 = 0; AutoController.aq.size() > 0 && var6 < AutoController.aq.size(); ++var6) {
                  if (kq.b((String) AutoController.aq.elementAt(var6), kq.l[1])[0].equalsIgnoreCase(var5.toLowerCase())) {
                     AutoController.aq.setElementAt(var5 + kq.l[1] + var4.f, var6);
                     AutoController.g();
                  }
               }
            }

            byte var19 = var0.f.readByte();

            for(byte var7 = 0; var7 < var19; ++var7) {
               var4.b(new gl(var0.f.readShort()));
            }

            var4.a = var0.f.readShort();
            var4.b = var0.f.readShort();
            var4.ap = var0.f.readByte();
            var1.addElement(var4);
         }

         for(byte var10 = 0; var10 < var2; ++var10) {
            ((i3)var1.elementAt(var10)).s = var0.f.readByte();
         }

         for(byte var11 = 0; var11 < var2; ++var11) {
            ((i3)var1.elementAt(var11)).ai = (byte)(100 - var0.f.readByte());
         }

         for(byte var12 = 0; var12 < var2; ++var12) {
            ((i3)var1.elementAt(var12)).aj = var0.f.readShort();
         }

         byte var13 = var0.f.readByte();

         for(byte var15 = 0; var15 < var13; ++var15) {
            i2 var17;
            (var17 = new i2()).I = var0.f.readByte();
            var17.z = var0.f.readShort();
            var17.D = var0.f.readInt();
            var17.a = var0.f.readShort();
            var17.b = var0.f.readShort();
            var1.addElement(var17);
         }

         gx.p = null;
         var13 = 0;
         if (var0.f.available() > 0) {
            var13 = var0.f.readByte();
         }

         if (var13 > 0) {
            gx.p = new Vector();

            for(int var16 = 0; var16 < var13; ++var16) {
               cn var18;
               (var18 = new cn()).d = var0.f.readShort();
               var18.b = var0.f.readShort();
               var18.c = var0.f.readShort();
               var18.e = var0.f.readByte();
               gx.p.addElement(var18);
            }
         }
      } catch (IOException var9) {
         var9.printStackTrace();
      }

      return var1;
   }

   private static Vector d(ij var0) {
      try {
         byte var1 = var0.f.readByte();
         h[22].concat(String.valueOf((int)var1));
         Vector var2 = new Vector();

         for(byte var3 = 0; var3 < var1; ++var3) {
            iq var4;
            (var4 = new iq()).f = var0.f.readByte();
            var4.i = var0.f.readByte();
            var4.a = var0.f.readByte();
            var4.b = var0.f.readByte();
            var4.k = true;
            var2.addElement(var4);
         }

         return var2;
      } catch (Exception var6) {
         return null;
      }
   }

   private static Vector e(ij var0) {
      try {
         byte var1 = var0.f.readByte();
         Vector var2 = new Vector();
         h[32].concat(String.valueOf((int)var1));

         for(byte var3 = 0; var3 < var1; ++var3) {
            s var4;
            (var4 = new s()).b = var0.f.readByte();
            var4.c = var0.f.readShort();
            var4.d = var0.f.readByte();
            var4.f = var0.f.readShort();
            var4.g = var0.f.readShort();
            byte var5 = var0.f.readByte();
            var4.k = new Vector();

            for(byte var6 = 0; var6 < var5; ++var6) {
               cn var7;
               (var7 = new cn()).b = var0.f.readByte();
               var7.c = var0.f.readByte();
               var4.k.addElement(var7);
            }

            var2.addElement(var4);
         }

         return var2;
      } catch (IOException var9) {
         return null;
      }
   }

   public static void f(ij var0) {
      try {
         int var1 = var0.f.readInt();
         short var2 = var0.f.readShort();
         short var3 = var0.f.readShort();
         byte var4 = var0.f.readByte();
         short var5 = 0;
         if (var0.f.available() > 0) {
            var5 = var0.f.readShort();
         }

         AutoController.h();
         AutoController.b(var1, var2, var3, var4, var5);
      } catch (IOException var7) {
      }
   }

   private static void b(byte var0) {
      hx.b().a((byte)-17);

      try {
         hx.b().c.d.writeByte(GameMidlet.g);
         hx.b().c.d.writeInt((int)(Runtime.getRuntime().totalMemory() / 1024L));
         String[] var3 = h;
         String var1;
         if ((var1 = System.getProperty(var3[8])) == null) {
            var1 = var3[25];
         }

         hx.b().c.d.writeUTF(var1);
         hx.b().c.d.writeInt(237263);
         hx.b().c.d.writeInt(k4.o);
         hx.b().c.d.writeInt(k4.p);
         hx.b().c.d.writeBoolean(k4.M);
         hx.b().c.d.writeByte(var0);
         hx.b().c.d.writeUTF(h[28]);
         hx.b().c.d.writeUTF(fb.S);
         hx.b().c.d.writeUTF(fc.X);
         hx.b().c.d.writeUTF(AutoController.L);
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      hx.b().a();
   }

   public static void g(ij var0) {
      try {
         int var1 = var0.f.readInt();
         String var4 = var0.f.readUTF();
         AutoController.h();
         AutoController.b(var1, var4);
      } catch (IOException var3) {
      }
   }

   private static char[] b(String var0) {
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 'X');
      }

      return var10000;
   }

   private static String b(char[] var0) {
      int var10002 = var0.length;
      char[] var10001 = var0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 7) {
            case 0:
               var10005 = 48;
               break;
            case 1:
               var10005 = 96;
               break;
            case 2:
               var10005 = 30;
               break;
            case 3:
               var10005 = 25;
               break;
            case 4:
               var10005 = 73;
               break;
            case 5:
               var10005 = 10;
               break;
            default:
               var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return new String(var10001);
   }
}
