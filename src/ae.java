import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class ae extends hj implements cq {
	public static ae a;
	public static byte b;
	public static byte c;
	public static Image d;
	public by H;
	public by e;
	public by f;
	public by I;
	public by J;
	public static byte g = -1;
	public static hn h;
	public static byte i = -1;
	public static String j;
	public static Image k;
	public static Vector l = new Vector();
	public static int m = -1;
	public static Vector n;
	public static Vector o;
	public static Vector p;
	public static Vector q;
	public static boolean r = false;
	public static boolean s = false;
	public static boolean t = false;
	public static boolean u = false;
	public static int v = -1;
	static byte[] w = new byte[] { 10, 4, 3, 5 };
	private byte K = 0;
	private byte L = -1;
	public static boolean x = false;
	private Vector M = new Vector();
	private int N;
	private int O = 60;
	public boolean y = true;
	public static byte z;
	public static byte A;
	public static short[] B;
	public static hn C;
	public static int D = -1;
	public static int E;
	public static int F;
	public static int G = -1;

	public final void a() {
		this.c();
		super.a();
	}

	public static ae b() {
		if (a == null) {
			a = new ae();
		}

		return a;
	}

	public final void c() {
		this.H = new by(kf.c, 0, this);
		super.ac = this.H;
		this.f = cd.b().a(kf.bR, new ig(this), 15);
		this.e = new by(main.a.H ? (main.a.Z == 0 ? kf.O : kf.c) : "", 1, this);
		if (main.a.Z > 0 && main.a.D == null) {
			super.ac = this.e;
		}

		this.I = new by(kf.x, 2, this);
		this.J = new by(kf.bZ, 2);
	}

	public final void a(int var1) {
		switch (var1) {
		case 0:
			this.A();
			return;
		case 1:
			if (!t) {
				cd.b().f();
				return;
			}
			break;
		case 2:
			this.e();
			return;
		case 3:
			w();
		}

	}

	public final void d() {
		this.I.b();
	}

	public ae() {
		this.c();
	}

	public final void e() {
		main.a.i();
		g = -1;
		i = -1;
		if (GameMidlet.e == 8) {
			this.t();
		} else {
			cx.a().d(8);
		}
	}

	protected static void f() {
		hc.b().a(main.a.r);
	}

	protected final void g() {
		if (h != null) {
			f(100);
		}
	}

	protected static void h() {
		if (h != null) {
			bf.a().c(0, h.w);
		}

	}

	public final void a(byte var1, int var2) {
		main.a.h();
		hn var3;
		if ((var3 = ir.g(var2)) != null) {
			if (var1 == 0) {
				main.a.a(kf.dp + var3.x + ". " + kf.dq, new ih(this, var2));
			} else {
				if (var1 == 1) {
					v = var2;
					cx.a().d(11);
					main.a.i();
				}

			}
		}
	}

	protected final void i() {
		hc.b().a(h.w, h.x);
		hc.b().a(this);
	}

	private void A() {
		Vector var1 = new Vector();
		short[] var2 = null;
		if (ir.a != 25 && n != null && n.size() > 0) {
			var2 = new short[n.size()];

			for (int var3 = 0; var3 < n.size(); ++var3) {
				bc var4 = (bc) n.elementAt(var3);
				var2[var3] = (short) var4.d;
				var1.addElement(new by(var4.a, 2, var3));
			}
		}

		var1.addElement(this.I);
		le var10000 = le.a();
		boolean var5 = false;
		le var6 = var10000;
		var10000.a(var1, 0);
		le.h = var2;
		if (var2 != null) {
			var6.c += var6.e;
		}

	}

	public static void a(byte var0) {
		GameMidlet.i.a(var0);
		iy.a().a((int)var0);
	}

	public static void b(int var0) {
		GameMidlet.i.e(var0);
		GameMidlet.i.U = GameMidlet.i.S;
		GameMidlet.i.T = 0;
		iy.a().a(var0 + 100);
	}

	public static void a(int var0, byte var1) {
		hn var2;
		if ((var2 = ir.g(var0)) != null) {
			if (var1 >= 100) {
				var2.e(var1 - 100);
				var2.U = var2.S;
				var2.T = 0;
				return;
			}

			var2.a(var1);
		}

	}

	protected final void j() {
		Vector var1 = new Vector();

		for (int var2 = 0; var2 < 4; ++var2) {
			by var3 = cd.b().a(kf.ey[var2], new io(this, var2), var2 + 7);
			var1.addElement(var3);
		}

		cd.b().b = null;
		cd.b().a(var1);
	}

	public final void k() {
		main.a.x.b();
		if (main.a.Z == 0 && ir.p != null) {
			if (h != null && ir.p.az != 5 && h.w > 2000000000) {
				super.ad = this.J;
			} else {
				super.ad = null;
			}

			super.ae = ir.q;
			if (ir.p.az == 0) {
				super.ae.a = ((hn) ir.p).x;
				if (super.ae.a.length() > 8) {
					super.ae.a = super.ae.a.substring(0, 8) + "..";
				}
			}
		}

		if (ir.p == null && super.ae == ir.q) {
			super.ae = null;
			super.ad = null;
		}

		hn var2;
		hn var3;
		if (t) {
			hn var4;
			if (this.K == 1 && main.a.J == -1) {
				System.out.println("updateWedding1111111111111: " + this.K);
				this.K = 2;
				var2 = ir.g(-100);
				var3 = ir.g(E);
				var4 = ir.g(F);
				if (var3 != null && var4 != null) {
					do2.a().h = var2;
					System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
					var2.a(150, kf.eB[0] + var3.x + kf.eB[1] + var4.x + kf.eB[2], (byte) 1);
				} else {
					this.B();
				}
			}

			if (this.K == 2 && main.a.l % 4 == 2 && ir.g(-100).O == null) {
				this.K = 3;
				var3 = ir.g(E);
				var4 = ir.g(F);
				if (var3 != null && var4 != null) {
					var4.C = 26 * ir.i - ir.i;
					var4.Q = -5;
					var3.C = 26 * ir.i - (ir.i << 1);
					var3.Q = -5;
					do2.a().h = var3;
				} else {
					this.B();
				}
			}

			if (this.K == 3) {
				var2 = ir.g(E);
				var3 = ir.g(F);
				if (var2 != null && var3 != null && var2.Q == 0 && var3.Q == 0) {
					this.K = 4;
					var4 = ir.g(-100);
					do2.a().h = var4;
					var4.a(200, kf.eC[0] + var2.x + kf.eB[1] + var3.x, (byte) 1);
					var4.a(200, kf.eC[1], (byte) 1);
					var4.a(150, kf.eC[2], (byte) 1);
					var4.a(100, kf.eC[3], (byte) 1);
				}
			}

			if (this.K == 4) {
				var2 = ir.g(E);
				var3 = ir.g(F);
				var2.G = 4;
				var3.G = 4;
				if ((var4 = ir.g(-100)).O == null && var4.P.size() == 0) {
					if (E == GameMidlet.i.w) {
						bf.a().b(F, 101);
					}

					this.L = 0;
					this.K = 5;
				}
			}
		}

		if (this.K == 5 && this.L >= 0) {
			++this.L;
			if (this.L > 20) {
				if (this.L == 21) {
					ba var5 = new ba(2, 0);
					main.a.B.addElement(var5);
					do2.a().h = GameMidlet.i;
					GameMidlet.i.G = 4;
				}

				if (GameMidlet.i.w != E) {
					t = false;
					this.L = -1;
				}

				if (GameMidlet.i.Q == 0 && GameMidlet.i.w == E) {
					t = false;
					var2 = ir.g(E);
					var3 = ir.g(F);
					if (var2 != null && var3 != null) {
						var2.G = 4;
						var3.G = 4;
					}

					this.K = 6;
					this.L = -1;
					bf.a().b(F, 102);
				}
			}
		}

		if (super.ad == null && main.a.Z == 0 && main.a.D == null) {
			super.ad = this.e;
		} else if (main.a.D != null) {
			super.ad = null;
		}

		if (l.size() > 0) {
			for (int var1 = 0; var1 < l.size(); ++var1) {
				((db) l.elementAt(var1)).c();
			}
		}

		if (this.N > 0) {
			--this.N;
			if (this.N == 0) {
				if (this.M.size() > 0) {
					this.M.removeElementAt(0);
				}

				if (this.M.size() > 0) {
					this.N = this.O;
				}
			}
		}

	}

	private void B() {
		t = false;
		this.K = 0;

		for (int var1 = 0; var1 < ir.m.size(); ++var1) {
			js var2;
			if ((var2 = (js) ir.m.elementAt(var1)).az == 0) {
				hn var3;
				(var3 = (hn) var2).G = 4;
			}
		}

	}

	public final void l() {
		if (main.a.g && main.a.a(0, 0, main.a.m, 0)) {
			main.a.g = false;
			cx.a().c(GameMidlet.i.w);
		}

		if (main.a.D == null || !bb.d) {
			super.l();
		}

		main.a.x.a();
		GameMidlet.i.e();
	}

	public final void a(Graphics var1) {
		this.b(var1);
		if (main.a.D == null || !bb.d) {
			super.a(var1);
		}

		main.a.a(var1);
	}

	public final void b(Graphics var1) {
		main.a.c(var1);
		main.a.x.b(var1);
		int var2;
		if (l.size() > 0) {
			for (var2 = 0; var2 < l.size(); ++var2) {
				((db) l.elementAt(var2)).a(var1);
			}
		}

		main.a.x.d(var1);
		main.a.c(var1);
		if (this.M.size() != 0) {
			String var4 = (String) this.M.elementAt(0);
			if ((var2 = this.O - this.N) > 10) {
				var2 = 10;
			}

			int var5 = main.a.m;

			for (int var6 = 0; var6 < var2; ++var6) {
				var5 >>= 1;
			}

			main.a.L.a(var1, var4, var5 + 3, 2, 0);
		}

		main.a.c(var1);
	}

	public final void a(int var1, int var2) {
		switch (var1) {
		case 0:
			this.A();
			return;
		case 2:
			cx.a().h(h.w);
			return;
		case 52:
			if (main.a.r == ea.a && ir.a == -1) {
				main.a.i();
				cx.a().d(8);
			}
			break;
		default:
		}
	}

	public final void a(byte var1, byte var2, short var3, short var4, Vector var5, Vector var6, Vector var7) {
		if (var2 == -1) {
			main.a.b(kf.aW, 52, (gy) null);
		} else {
			if (ir.y == -1) {
				ir.F = var6;
				ir.G = var7;
			}

			main.a.S.a(var1);
			main.a.g();
			b = var1;
			c = var2;
			h = null;
			ir.p = null;
			GameMidlet.i.Q = 0;
			if (main.a.I || var1 != ir.a || var1 == ir.a && ir.y == -1
					|| ir.y == -1 && (ir.a == 14 || ir.a == 15 || ir.a == 16)) {
				GameMidlet.i.L = false;
				if (var1 != ir.a) {
					GameMidlet.i.aw = var3;
					GameMidlet.i.ax = var4;
				}

				ir.l.removeAllElements();
				main.a.x.e(var1 + 1);
			} else {
				l.removeAllElements();
				ir.m.removeAllElements();
				ir.n.removeAllElements();
				main.a.B.removeAllElements();
				ir.b(GameMidlet.i);
			}

			if (var6 != null) {
				ir.d();
			}

			if (ir.B != -1) {
				GameMidlet.i.a(ir.B, ir.C);
				ir.C = -1;
				ir.B = -1;
			}

			if (ir.H != -1) {
				GameMidlet.i.aw = ir.H;
				GameMidlet.i.ax = ir.I;
				ir.I = -1;
				ir.H = -1;
				a(GameMidlet.i.aw, GameMidlet.i.ax, GameMidlet.i.K, 0);
			}

			main.a.a.b();
			if (main.a.r != this) {
				if (jy.c == 0) {
					b().a();
				} else {
					jy.c = 2;
					jv.b().a();
				}
			}

			for (int var8 = 0; var8 < var5.size(); ++var8) {
				js var9;
				if ((var9 = (js) var5.elementAt(var8)).az == 0) {
					hn var10;
					(var10 = (hn) var9).C = var10.aw;
					var10.D = var10.ax;
					var10.t = var10.K;
					var10.h();
					if (var10.w != GameMidlet.i.w) {
						e(var10);
						ir.b(var10);
					}
				} else if (var9.az == 5) {
					hm var11;
					(var11 = (hm) var9).b = var11.aw;
					var11.c = var11.ax;
					ir.m.addElement(var11);
				}
			}

			if (ca.b) {
				a(ca.a.a, ca.a.b, GameMidlet.i.K, GameMidlet.i.N);
			} else {
				++GameMidlet.i.ax;
				this.n();
			}

			b((int) GameMidlet.i.S);
			if (main.a.Z == 0 && main.a.D == null) {
				super.ac = this.H;
			}

			h = null;
			if (ir.a != 25) {
				main.a.h();
			}

			main.a.a.sizeChanged(0, 0);
			if (main.a.I) {
				if (ir.a == 9 && bb.e != 0) {
					(main.a.D = new bb()).b();
				} else if (!ca.b && ir.a == 23) {
					(main.a.D = new bb()).d();
				} else if (ir.a == 25 && bb.f > 0) {
					(main.a.D = new bb()).a(a);
				}

				super.ac = null;
				super.ad = null;
			}

			GameMidlet.i.M = false;
			GameMidlet.i.N = 0;
			GameMidlet.i.G = 4;
			r = false;
			t = false;
			main.a.A = null;
			if (ir.a == 108) {
				do2.a().d();
				do2.a().b();
			}

			if (main.a.J == 0) {
				main.a.J = 1;
			}

		}
	}

	public static void m() {
		byte var0 = 0;
		switch (i) {
		case 0:
			var0 = 3;
			break;
		case 1:
			var0 = 7;
			break;
		case 2:
			var0 = 21;
			break;
		case 3:
			var0 = 22;
			break;
		case 4:
			var0 = 21;
			break;
		case 5:
			var0 = 22;
			break;
		}

		cx.a().b(var0);
	}

	public final void b(byte var1) {
		if (g == -1) {
			this.n();
			System.out.println("doJoinShop: " + var1);
			main.a.i();
			g = var1;
			cx.a().d(8);
		}
	}

	public static void a(int var0, int var1, int var2, int var3) {
		if ((GameMidlet.e == 9 || GameMidlet.e == 11) && !t) {
			GameMidlet.i.C = var0;
			GameMidlet.i.D = var1;
			bf.a().a(var0, var1, var2, var3);
		}
	}

	public final void n() {
		a(GameMidlet.i.aw, GameMidlet.i.ax, GameMidlet.i.K, GameMidlet.i.N);
	}

	public static void a(int var0, int var1, int var2, int var3, short var4) {
		hn var5 = ir.g(var0);
		if (var0 != GameMidlet.i.w && !t) {
			if (var5 != null) {
				if (var5.L && var5.Q == 0) {
					var5.L = false;
					var5.a(var1, var2);
					var5.N = var4;
				}

				if (var5.H == -3) {
					var5.H = 0;
				}

				var5.R = -1;
				if (var5.Q == 0) {
					dr var6;
					(var6 = new dr(var1, var2, var3)).d = var4;
					var5.g.addElement(var6);
				}
			}

		}
	}

	public final void a(hn var1) {
		e(var1);
		var1.h();
		var1.L = true;
		hn var2;
		if ((var2 = ir.g(var1.w)) != null) {
			ir.m.removeElement(var2);
		}

		ir.b(var1);
	}

	private static void e(hn var0) {
		fa var1;
		if ((var1 = fx.a(var0.e, 50)) != null) {
			var0.d = var1.b;
		}

	}

	public static void c(int var0) {
		hn var1;
		if ((var1 = ir.g(var0)) != null) {
			var1.f();
			var1.p = true;
			db var2;
			if ((var2 = kv.c(var0)) != null) {
				l.removeElement(var2);
			}
		}

	}

	public final void d(int var1) {
		im.d().a(var1, this);
		super.d(var1);
	}

	public final void a(String var1) {
		if (!var1.trim().equals("")) {
			if (var1.indexOf("dmw") != -1) {
				if (h != null) {
					cx.a().b(h.w, var1);
				}

			} else if (var1.indexOf("ptw") == 0 && h != null && h.O != null && h.O.d != null) {
				String var2 = var1 + " (";

				for (int var3 = 0; var3 < h.O.d.length; ++var3) {
					var2 = var2 + " " + h.O.d[var3];
				}

				var2 = var2 + ").";
				cx.a().b(h.w, var2);
			} else {
				bf.a().a(var1);
			}
		}
	}

	public static void a(int var0, String var1) {
		if (ir.a != 24 && ir.a != 53) {
			hn var2;
			if ((var2 = ir.g(var0)) != null) {
				var2.O = null;
				var2.a(100, var1, (byte) (var0 >= 2000000000 ? 1 : 0));
				if (var0 < 2000000000) {
					hc var10000 = hc.b();
					var1 = var2.x + ": " + var1;
					var10000.a.a(var1);
				}

			}
		}
	}

	protected static void o() {
		if (h != null && h.Q == 0) {
			bf.a().b(h.w, 101);
		}
	}

	public final void e(int var1) {
		if (h != null) {
			fa var2;
			main.a.a((var2 = (fa) fx.a((short) var1)).i[0], var2.i[1], new ij(this, var2), new ik(this, var2),
					(ii) null);
		}
	}

	public static void f(int var0) {
		bf.a().b(h.w, var0);
	}

	public final void a(int var1, int var2, int var3, String var4, int var5) {
		if (var3 == -1) {
			main.a.b(var4);
		} else {
			this.a(1, var1, var2, var3, (int) var5);
		}
	}

	public final void a(int var1, int var2, int var3, String var4, int var5, int var6, int var7, int var8) {
		if (var3 == -1) {
			main.a.b(var4);
		} else {
			if (var1 == GameMidlet.i.w) {
				System.out.println("onGiftGiving: " + var5);
				GameMidlet.i.a(var6, var7, var8);
			}

			this.a(0, var1, var2, var3, (int) 0);
		}
	}

	private void a(int var1, int var2, int var3, int var4, int var5) {
		hn var6 = ir.g(var2);
		hn var7 = ir.g(var3);
		if (var6 != null && var7 != null) {
			if (var6.Q == 0 && var7.Q == 0) {
				var6.j = var7.w;
				var6.i = var6.w;
				var7.i = var6.w;
				var7.j = var7.w;
				if (var2 == GameMidlet.i.w) {
					GameMidlet.i.D = var7.ax;
					if (GameMidlet.i.aw < var7.aw) {
						var2 = var7.aw - 15;
					} else {
						var2 = var7.aw + 15;
					}

					GameMidlet.i.C = var2;
					a(var2, var7.ax, GameMidlet.i.K, GameMidlet.i.N);
				}

				if (var3 == GameMidlet.i.w) {
					a(GameMidlet.i.aw, GameMidlet.i.ax, var6.K == 0 ? gx.J : 0, GameMidlet.i.N);
				}

				if (var1 == 1) {
					var7.R = -1;
					switch (var4) {
					case 0:
						var7.Q = var6.Q = -3;
						this.b(var6.x + " " + kf.ca + var7.x);
						break;
					case 100:
						if (var7.Q == 0) {
							var6.Q = -2;
							var7.Q = -2;
							var6.g.removeAllElements();
							var7.g.removeAllElements();
							var6.ao = var7;
							var6.d(var7.aw, var7.ax + 5);
						}
						break;
					case 101:
						if (var7.Q == 0) {
							var6.Q = 11;
							var7.Q = 11;
							var6.g.removeAllElements();
							var7.g.removeAllElements();
							var6.ao = var7;
							if (var6.aw < var7.aw) {
								var6.d(var7.aw - 20, var7.ax + 2);
							} else {
								var6.d(var7.aw + 20, var7.ax + 2);
							}
						}
						break;
					case 102:
					case 103:
						var7.Q = var6.Q = 12;
						var7.Y = var6.Y = (short) var5;
						this.b(var6.x + " " + kf.bS + " " + var7.x);
						break;
					default:
						this.b(var6.x + " " + "tặng quà" + " " + var7.x);
					}
				} else {
					var6.Q = 9;
					var7.Q = 8;
					var7.R = -1;
					var7.k = var4;
					ld var8 = fx.a((short) var4);
					this.b(var6.x + " " + kf.di + " " + var8.l + " " + kf.dh + " " + var7.x);
				}

				var7.U = var7.S;
				var7.T = 0;
				var6.U = var6.S;
				var6.T = 0;
			}
		}
	}

	public static void b(hn var0) {
		hx var1;
		if ((var1 = fx.a(((fa) fx.a((short) var0.k)).j, var0.e)) == null) {
			var0.a(new hx((short) var0.k));
			var0.h();
		} else {
			var1.a = (short) var0.k;
		}
	}

	public static void c(hn var0) {
		if (var0 != null) {
			bf.a().a(var0.w);
			main.a.b(kf.b + " " + var0.x + "  " + kf.e);
		}
	}

	public final void a(hn var1, String var2) {
		cw var3;
		(var3 = new cw(kf.y, -2, new by(kf.e, new in(this, var1)), new by(kf.cc, new ej(this, var1)), false)).a(var2);
		hc var4 = hc.b();
		var3.a = true;
		var4.b(var3);
		if (main.a.r != hc.b()) {
			++hj.as;
		}

	}

	public static void a(boolean var0, String var1) {
		if (var0) {
			cy.b();
			cy.h();
		}

		main.a.b(var1);
	}

	protected static void p() {
		if (h != null) {
			main.a.d(kf.b);
			bf.a().b(h.w);
		}

	}

	public static void b(int var0, int var1) {
		if (var0 != GameMidlet.i.w) {
			hn var2;
			hx var3;
			if ((var2 = ir.g(var0)) != null && (var3 = fx.b(var2.e, var1)) != null) {
				var2.e.removeElement(var3);
			}

		}
	}

	public final void a(int[] var1) {
		hk.b().a(var1);
		hk.b().a(this);
	}

	public final void a(Vector var1) {
		GameMidlet.k = var1;
		if (cd.b().c) {
			cd.b();
			cd.g();
		} else {
			this.q();
		}
	}

	public static void a(int var0, short var1) {
		hn var2;
		if ((var2 = ir.g(var0)) != null) {
			if (fx.a(var1).j == -1) {
				if (var2.V == var1) {
					gr var3;
					if ((var3 = ir.h(var2.w)) != null) {
						ir.m.removeElement(var3);
						var2.V = -1;
					}
				} else {
					var2.a(var1);
					iy.a().e(var2.w);
				}
			} else {
				hx var4;
				if ((var4 = fx.b(var2.e, var1)) != null) {
					var2.e.removeElement(var4);
				} else {
					var2.b(new hx(var1));
					var2.h();
				}
			}

			if (var0 == GameMidlet.i.w) {
				if (main.a.r == dp.b()) {
					dp.b().d();
				}

				GameMidlet.k = null;
				main.a.h();
			}

			r = false;
		}
	}

	public final by a(Vector var1, int var2, int var3, boolean var4) {
		by var5 = new by(kf.bJ, new eh(this, var1, var2, var3));
		return var4 ? new by(kf.c, new ee(this, var5)) : var5;
	}

	protected final void q() {
		if (GameMidlet.i != null) {
		hn var1 = GameMidlet.i;
		if (main.a.r != cd.a) {
			dp.b().m = true;
			dp.b().a(new String[] { kf.co, kf.l, /*"Other Item", "Other Item 2"*/ },
					new Vector[] { this.a(GameMidlet.k, var1.w, 1), this.a((hn) var1, 0) /*getVipItem(), getVipItem2()*/ }, (Vector) null);
			dp.b().a(this.a(var1.e, 0, 0, false), 1);
			dp.b().a(this.a(GameMidlet.k, 1, 0, true), 0);
			if (main.a.r != dp.b()) {
				dp.b().a();
			}
		}
		}
	}
	
	public final Vector a(hn var1, int var2) {
		hn var6;
		(var6 = new hn()).x = var1.x;
		var6.a(var1.a());
		var6.w = var1.w;
		var6.V = var1.V;
		var6.W = var1.W;

		for (int var3 = 0; var3 < var1.e.size(); ++var3) {
			hx var4;
			ld var5;
			if ((var5 = fx.a((var4 = (hx) var1.e.elementAt(var3)).a)) != null/* && var5.j != 30 && var5.j != 40*/) {
				var6.a(var4);
			}
		}

		if (var6.V != -1) {
			hx var7;
			(var7 = new hx(var6.V)).b = (byte) (100 - var6.W);
			var6.e.addElement(var7);
		}

		new Vector();
		return this.a(var6.e, var6.w, 0);
	}

	public final Vector a(Vector var1, int var2, int var3) {
		Vector var4 = new Vector();
		for (int var5 = 0; var5 < var1.size(); ++var5) {
			hx var7;
			ld var8 = fx.a((var7 = (hx) var1.elementAt(var5)).a);
			String var9 = null;
			if (var2 == GameMidlet.i.w /*&& (!fx.c((int)var8.j)*/ || var3 != 0) {
				if (var3 == 1) {
					var9 = kf.cs;
				} else {
					var9 = kf.cq;
				}
			}

			fz var6 = new fz(this, var9, new gf(this, var7, var2, var3, var5), var7, var5, var3);
			var4.addElement(var6);
		}
		return var4;
	}

	private by b(kp var1) {
		return new fk(this, (String) null, (ii) null, var1);
	}

	public final void a(kp var1) {
		Vector var2;
		(var2 = new Vector()).addElement(this.b(var1));
		dp.b().m = true;
		dp.b().a(new String[] { kf.by }, new Vector[1], var2);
		if (main.a.r != dp.b()) {
			dp.b().a();
		}

	}

	public static void a(Graphics var0, String var1, int var2, int var3, int var4) {
		var0.drawImage(k, var2, var3 + 2, 17);
		int var5 = k.getWidth() - 4 * gy.Y;
		int var6;
		if ((var6 = var4 * var5 / 100) > var5) {
			var6 = var5;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		main.a.N.a(var0, var1, var2 - 32 * gy.Y, var3 + 4 * gy.Y - gy.af / 2, 1);
		je.a(var5 = var2 - 27 * gy.Y, var3 + 4 * gy.Y - 1, var6, 4 * gy.Y, '\ub7ec', var0);
		je.a(var5, var3 + 5 * gy.Y - 1, var6, 1 * gy.Y, 8575990, var0);
		je.a(var5 + var6, var3 + 4 * gy.Y - 1, 1, 4 * gy.Y, 13379, var0);
		if (!var1.equals("")) {
			main.a.N.a(var0, String.valueOf(var4), var2 + 29 * gy.Y + main.a.N.a("100"), var3 + 4 * gy.Y - gy.af / 2,
					1);
		}

	}

	public static String r() {
		return kf.aJ + ": " + main.a.b(GameMidlet.i.a[0]) + kf.T;
	}

	private static void f(int var0, int var1) {
		if (var0 != var1) {
			main.a.a((var1 - var0 > 0 ? "+" : "") + (var1 - var0), GameMidlet.i.aw, GameMidlet.i.ax - 40, -1, 0, -1);
		}

	}
	
    public final void a(int i, kp kpVar, hn hnVar, String str, short s, byte b, byte b2, String str2, short s2, String str3) {
        if (i == GameMidlet.i.w) {
            f(GameMidlet.j.g, kpVar.g);
            f(GameMidlet.j.a, kpVar.a);
            f(GameMidlet.j.b, kpVar.b);
            f(GameMidlet.j.e, kpVar.e);
            f(GameMidlet.j.c, kpVar.c);
            f(GameMidlet.j.d, kpVar.d);
            GameMidlet.j = kpVar;
        }
        main.a.h();
        hn g = ir.g(i);
        if (g != null && x) {
            x = false;
            Vector a = g.w != GameMidlet.i.w ? a(g, 0) : new Vector();
            Vector vector = new Vector();
            String toString = new StringBuffer(String.valueOf(kf.aJ)).append(": ").append(main.a.a(GameMidlet.i.a[0], GameMidlet.i.a[2], GameMidlet.i.b, true)).toString();
            fj fjVar = new fj(null, null, g, ir.h(g.w), new bc(toString, main.a.N.a(toString)));
            g.K = (byte) 0;
            vector.addElement(fjVar);
            if (hnVar != null) {
                hnVar.aa = g.aa;
                vector.addElement(new fm(this, "", null, str, g, hnVar, s, b, b2, str2));
            }
            if (GameMidlet.i.w != g.w) {
                vector.addElement(b(kpVar));
            }
            if (main.a.r != cd.a) {
                dp.b().m = true;
                if (GameMidlet.i.w == g.w) {
                    if (hnVar != null) {
                        dp.b().a(new String[]{kf.by, kf.a}, new Vector[2], vector);
                        if (s2 != (short) -1) {
                            dp.b().a(new by(str3, new fv(this, s2)), 1);
                        }
                    } else {
                        dp.b().a(new String[]{kf.by}, new Vector[1], vector);
                    }
                } else if (hnVar != null) {
                    dp x = dp.b();
                    String[] r3 = new String[]{kf.by, kf.a, kf.cd, kf.by};
                    Vector[] r4 = new Vector[4];
                    r4[3] = a;
                    x.a(r3, r4, vector);
                    if (s2 != (short) -1) {
                        dp.b().a(new by(str3, new fo(this, s2)), 1);
                    }
                } else {
                    dp x = dp.b();
                    String[] r3 = new String[]{kf.by, kf.cd, kf.by};
                    Vector[] r4 = new Vector[3];
                    r4[2] = a;
                    x.a(r3, r4, vector);
                }
                if (main.a.r != dp.b()) {
                    dp.b().a();
                }
            }
        }
    }


	public final void a(String var1, int var2) {
		Vector var3 = new Vector();

		for (int var4 = 0; var4 < fx.c.size(); ++var4) {
			dc var5;
			if ((var5 = (dc) fx.c.elementAt(var4)).c == var2) {
				var3.addElement(var5);
			}
		}

		Vector var8 = new Vector();

		for (int var9 = 0; var9 < var3.size(); ++var9) {
			dc var6 = (dc) var3.elementAt(var9);
			fe var7 = new fe(this, kf.Z, new fg(this, var6), var6, var9);
			var8.addElement(var7);
		}

		dp.b().a();
		dp.b().a(new String[] { var1 }, new Vector[] { var8 }, (Vector) null);
	}

	protected final void a(dc var1) {
		main.a.a(kf.aF, new fc(this, var1));
	}

	public static void a(short var0, int var1) {
		main.a.h();
		dp.n = true;
		dc var2;
		if ((var2 = dc.a(fx.c, var0)) != null) {
			if (var2.c == 5) {
				iy.a().e(GameMidlet.i.w);
			}

			GameMidlet.i.a(var1);
		}

	}

	public final void a(byte var1, int var2, String var3, short[] var4, int var5, String[] var6) {
		if (main.a.r != dp.b()) {
			d(GameMidlet.i);
			if (var2 == 26) {
				if (h == null) {
					return;
				}

				d(h);
			} else {
				d(GameMidlet.i);
			}

			Vector var7 = new Vector();
			if (var1 == 0) {
				int var12;
				if (var4 != null && var4.length != 0) {
					for (var12 = 0; var12 < var4.length; ++var12) {
						var7.addElement(fx.a(var4[var12]));
					}
				} else {
					for (var12 = 0; var12 < fx.b.length; ++var12) {
						ld var8;
						if ((var8 = fx.b[var12]) != null && (var8.i[0] > 0 || var8.i[1] > 0) && var2 == var8.k) {
							var7.addElement(var8);
						}
					}
				}

				String var11;
				int var20;
				if (var2 == 26) {
					Vector[] var15 = new Vector[6];

					for (var20 = 0; var20 < 6; ++var20) {
						var15[var20] = new Vector();
					}

					int[] var22 = new int[6];

					int var21;
					for (var21 = 0; var21 < var7.size(); ++var21) {
						ld var24 = (ld) var7.elementAt(var21);
						var11 = "";
						if (var6 != null && var6.length > 0) {
							var11 = var6[var21];
						}

						var3 = "Tặng";
						if (var24.j == 20) {
							var15[0].addElement(new jx(this, var3,
									new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5, var22[0]),
									var24, var4 != null ? var4[var21] : -1, var22[0], var5, var2));
							++var22[0];
						} else if (var24.j == 10) {
							var15[1].addElement(new jx(this, var3,
									new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5, var22[1]),
									var24, var4 != null ? var4[var21] : -1, var22[1], var5, var2));
							++var22[1];
						} else if (var24.j != 52 && var24.j != 53 && var24.j != 5) {
							if (var24.j == 60) {
								var15[3].addElement(new jx(this, var3,
										new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5,
												var22[3]),
										var24, var4 != null ? var4[var21] : -1, var22[3], var5, var2));
								++var22[3];
							} else if (var24.j == 70) {
								var15[4].addElement(new jx(this, var3,
										new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5,
												var22[4]),
										var24, var4 != null ? var4[var21] : -1, var22[4], var5, var2));
								++var22[4];
							} else {
								var15[5].addElement(new jx(this, var3,
										new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5,
												var22[5]),
										var24, var4 != null ? var4[var21] : -1, var22[5], var5, var2));
								++var22[5];
							}
						} else {
							var15[2].addElement(new jx(this, var3,
									new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5, var22[2]),
									var24, var4 != null ? var4[var21] : -1, var22[2], var5, var2));
							++var22[2];
						}
					}

					var21 = 0;

					for (int var25 = 0; var25 < var15.length; ++var25) {
						if (var15[var25].size() > 0) {
							++var21;
						}
					}

					String[] var26 = new String[] { "Áo", "Quần", "Trang sức", "Nón", "Cầm tay", "Khác" };
					byte[] var27 = new byte[] { 0, 1, 2, 3, 4, 5 };
					Vector[] var16 = new Vector[var21];
					byte[] var13 = new byte[var21];
					String[] var17 = new String[var21];
					var5 = 0;
					int var18 = 0;

					while (true) {
						if (var18 >= var15.length) {
							dp.b().a();
							dp.o = true;
							dp.b().a(var17, var16, (Vector) null);
							break;
						}

						if (var15[var18].size() > 0 || var18 == 5) {
							if (var18 == 5) {
								int var19 = var15[5].size();

								for (var20 = 0; var20 < q.size(); ++var20) {
									km var23 = (km) q.elementAt(var20);
									var15[5].addElement(
											new ey(this, kf.bS, new ku(this, var20, var23.a), var20, var23, var19));
								}
							}

							var16[var5] = var15[var18];
							var13[var5] = var27[var18];
							var17[var5] = var26[var18];
							++var5;
						}

						++var18;
					}
				} else {
					Vector var14 = new Vector();

					for (var20 = 0; var20 < var7.size(); ++var20) {
						ld var9 = (ld) var7.elementAt(var20);
						String var10 = "";
						if (var6 != null && var6.length > 0) {
							var10 = var6[var20];
						}

						if (var2 == 100) {
							var11 = kf.cO;
						} else if (var2 == 26) {
							var11 = "Tặng";
						} else {
							var11 = kf.Z;
						}

						var14.addElement(new jx(this, var11,
								new gt(this, var9, var4 != null ? var4[var20] : -1, var2, var10, var5, var20), var9,
								var4 != null ? var4[var20] : -1, var20, var5, var2));
					}

					if (var14.size() > 0) {
						dp.b().a();
						dp.o = true;
						dp.b().a(new String[] { var3 }, new Vector[] { var14 }, (Vector) null);
					}
				}

				main.a.h();
			}

		}
	}

	public static void b(int var0, byte var1) {
		if (var0 == GameMidlet.i.w) {
			GameMidlet.i.W = var1;
		} else {
			hn var2;
			if ((var2 = ir.g(var0)) != null) {
				var2.W = var1;
			}

		}
	}

	public final void a(int var1, int var2, String var3, String[] var4) {
		Vector var5 = new Vector();

		for (int var6 = 0; var6 < var4.length; ++var6) {
			var5.addElement(new by(var4[var6], new ac(this, var1, var2, var6)));
		}

		main.a.a(var3, var5);
	}

	public static void b(int var0, short var1) {
		hn var2;
		if ((var2 = ir.g(var0)) != null) {
			var2.X = var1;
		}

	}

	private void b(String var1) {
		this.M.addElement(var1);
		if (this.N == 0) {
			this.N = this.O;
		}

	}

	public final void b(Vector var1) {
		if (var1.size() != 0) {
			Vector var2 = new Vector();

			for (int var3 = 0; var3 < var1.size(); ++var3) {
				bc var4 = (bc) var1.elementAt(var3);
				var2.addElement(new y(this, var4.a, new aa(this, var4), var4));
			}

			cd.b().a(var2);
		}
	}

	public static void a(byte var0, int var1, short var2, int var3, short var4, short var5) {
		hm var6;
		(var6 = new hm(var0, var2, var3)).a(var1, var4, var5);
		ir.m.addElement(var6);
		ir.a(ir.l);
	}

	public static void c(int var0, int var1) {
		int var2 = 0;

		hm var10000;
		while (true) {
			if (var2 >= ir.m.size()) {
				var10000 = null;
				break;
			}

			js var3;
			hm var5;
			if ((var3 = (js) ir.m.elementAt(var2)).az == 5 && (var5 = (hm) var3).d == var0) {
				var10000 = var5;
				break;
			}

			++var2;
		}

		hm var4 = var10000;
		if (var10000 != null) {
			var4.a(var1);
		}

	}

	public static void a(lc var0) {
		if (ir.x == null) {
			ir.x = new Vector();
		}

		ir.x.addElement(var0);
	}

	public static void a(int var0, Vector var1) {
		hn var2;
		if ((var2 = ir.g(var0)) != null) {
			var2.f = var1;
			var2.as = 0;
		}

	}

	public final void s() {
		if (this.y) {
			this.y = true;
			main.a.i();
			if (ea.b().e == 2) {
				cx.a().c((byte)-1);
			} else {
				byte[] var1 = new byte[] { 0, 13, 20, 9, 23, 11, 17 };
				bf.a().a(var1[ea.b().e], -1);
			}
		}
	}

	public final void t() {
		if (GameMidlet.i.d == 0) {
			if (!jn.a) {
				ic.b().a();
				main.a.h();
			}
		} else {
			if (main.a.r != hc.d && main.a.r != dm.a) {
				main.a.J = 0;
			}
			if (!this.y) {	//try it. then i will not close the KEmlator:V
				cx.a().d(9);
				cx.a().c(0);	// your method is work. i think its caused by another error
				// hmm, only ae.java error
				// yes!!! ht.class is working! c2.class too.
				// hmmmmm the citiMap doesnt load:((
				// i thinnk class c.class not initalize, heyyy, heyyyy, where are you now ? ok. i think sooo. lets try
				// find method init c.class in ae.java
				// i search full project but not find it !
			} else {
				c localc = new c();
				int var1 = 16 * gy.Y;
				ir.y = -1;
				localc.b(kf.aw); // method init c.class waitt
				ht var10 = ht.a("ct", var1, var1); // <- error here !!!
				localc.a(); // try it, but static method
				Vector var2 = new Vector();	// show me the Game....ok
				byte[] var3 = new byte[884];		//wait
				int var4 = 0;
				InputStream var5 = getClass().getResourceAsStream(kf.a() + "/citiMap");
				try {
					for (int var6 = 0; var6 < 26; ++var6) {
						for (int var7 = 0; var7 < 34; ++var7) {
							var3[var6 * 34 + var7] = (byte) var5.read();
							if (var3[var6 * 34 + var7] == 69) {
								kb var8;
								(var8 = new kb()).a = (byte) var7;
								var8.b = (byte) var6;
								var8.d = (short) (var4 + 819);
								var8.c = kf.ez[var4];
								var2.addElement(var8);
								++var4;
							}
						}
					}

					var5.close();
				} catch (IOException var9) {
					var9.printStackTrace();
				}

				ir.a = -1;
				ea.j = true;
				ea.b().a(var10, var3, var2, (byte) 34, 16 * gy.Y, new by(kf.O, new p(this)));
				ea.b().h = new o(this);
				ea.b().e = 3;
				ea.b().a();
				main.a.h();
				if (ea.n != null && ea.o == 0 && !main.a.I) {
					ea.n.a();
					ea.o = 1;
				}

			}
		}
	}
	
	protected final void u() {
		dx[] var1 = new dx[3];

		for (int var2 = 0; var2 < 3; ++var2) {
			var1[var2] = new dx();
			var1[var2].d(2);
		}

		var1[0].a(true);
		by var3 = new by(kf.cy, new m(this, var1));
		hi.b().a(var1, kf.cx, kf.eF, var3);
		main.a.A = hi.b();
	}

	public static boolean a(dx[] var0) {
		int var1 = -1;

		for (int var2 = 0; var2 < 3; ++var2) {
			if (var0[var2].f().equals("")) {
				var1 = var2;
			}
		}

		if (!var0[1].f().equals(var0[2].f())) {
			var1 = 3;
		}

		if (var0[0].f().equals(var0[1].f())) {
			var1 = 4;
		}

		if (var1 != -1) {
			main.a.b(kf.er[var1]);
			return false;
		} else {
			return true;
		}
	}

	public static void a(byte[] var0, byte var1, byte var2, byte var3, Image var4, short[] var5, Vector var6,
			Vector var7) {
		B = var5;
		main.a.J = 0;
		b = var1;
		ir.F = var6;
		ir.G = var7;
		ByteArrayInputStream var11 = new ByteArrayInputStream(var0);
		ir.d = new short[var0.length];
		ir.e = var3;
		ir.f = (short) (var0.length / var3);
		ir.b = var4;
		if (var4 != null) {
			int[] var9 = new int[4];
			var4.getRGB(var9, 0, 2, 0, 0, 2, 2);
			ir.s = var9[0];
		}

		try {
			for (int var10 = 0; var10 < ir.d.length; ++var10) {
				ir.d[var10] = (short) var11.read();
			}
		} catch (Exception var8) {
			var8.printStackTrace();
		}

		if (var2 != ir.y) {
			cx.a().d(var2);
		} else {
			main.a.x.e();
		}
	}

	public final void v() {
		main.a.a(kf.P, new l(this));
	}

	public static void w() {
		if (GameMidlet.i.e != null) {
			GameMidlet.i.e.removeAllElements();
		}

		ir.t = -1;
		ir.c = null;
		ir.i = 24;
		kt.a().c();
		es.b().a();
		es.b().e();
		jy.b = false;
		jy.c = 0;
		cy.d = null;
		ir.m.removeAllElements();
		GameMidlet.i = new hn();
		GameMidlet.j = new kp();
		main.a.C.removeAllElements();
		ce.a().a = null;
	}

	public final void d(int var1, int var2) {
		switch (var1) {
		case 0:
			iy.a().b(GameMidlet.i.w);
			main.a.i();
			return;
		case 1:
			ei.b().e();
			return;
		case 2:
			cx.a().h(var2);
			return;
		case 3:
			b().b(GameMidlet.i, 0);
			return;
		case 4:
			b().b(GameMidlet.i, 1);
			return;
		default:
		}
	}

	public static void g(int var0) {
		ei.b().c = (byte) var0;
		if (GameMidlet.i.q != var0 && GameMidlet.i.q != -1) {
			ei.b().e();
		} else {
			Vector var1;
			(var1 = new Vector()).addElement(new by(kf.df, 0));
			var1.addElement(new by(kf.dg, 1));
			le.a().a(var1, 2);
		}
	}

	public static void d(hn var0) {
		(C = new hn()).e = new Vector();
		C.K = 0;
		C.d = var0.d;
		C.v = var0.v;

		for (int var1 = 0; var1 < var0.e.size(); ++var1) {
			hx var2;
			(var2 = new hx()).a = ((hx) var0.e.elementAt(var1)).a;
			C.a(var2);
		}

	}

	private void b(hn var1, int var2) {
		d(var1);
		byte[] var3 = null;
		byte[] var5 = new byte[2];
		if (g == 3) {
			var5[0] = 3;
			var5[1] = 8;
		}

		System.out.println("typeJoin: " + g);
		byte[] var4;
		Vector[] var6;
		String[] var7;
		switch (g) {
		case 1:
		case 6:
			var3 = new byte[] { 10, 20 };
			(var6 = new Vector[2])[0] = new Vector();
			var6[1] = new Vector();
			(var7 = new String[2])[0] = kf.aB;
			var7[1] = kf.aC;
			var5[0] = 1;
			var5[1] = 6;
			var4 = new byte[2];
			break;
		case 2:
		case 7:
			var3 = new byte[] { 40, 50 };
			(var6 = new Vector[2])[0] = new Vector();
			var6[1] = new Vector();
			(var7 = new String[2])[0] = kf.aE;
			var7[1] = kf.aD;
			var4 = new byte[2];
			var5[0] = 2;
			var5[1] = 7;
			break;
		case 3:
		case 4:
		case 5:
		default:
			(var6 = new Vector[1])[0] = new Vector();
			(var7 = new String[1])[0] = kf.dy;
			var4 = new byte[1];
		}

		for (int var8 = 0; var8 < fx.b.length; ++var8) {
			if (fx.b[var8].f != -2) {
				ld var9;
				byte var10;
				if ((var9 = fx.b[var8]).f >= 0) {
					var10 = ((fa) fx.b[var9.f]).b;
				} else {
					var10 = ((fa) var9).b;
				}

				if (var9 != null && (var9.i[0] > 0 || var9.i[1] > 0) && (var1.d == var10 || var10 == 0)
						&& (var5[0] == var9.k || var5[1] == var9.k) && var9.f > -2) {
					if (var3 == null) {
						var10 = var4[0];
						var6[0].addElement(new i(this, kf.O, new k(this, var9), var9, var10));
						++var4[0];
					} else {
						for (int var12 = 0; var12 < var6.length; ++var12) {
							if (var3[var12] == var9.j) {
								byte var11 = var4[var12];
								var6[var12].addElement(new e(this, kf.O, new g(this, var9), var9, var11));
								++var4[var12];
							}
						}
					}
				}
			}
		}

		dp.b().a();
		dp.o = true;
		dp.b().a(var7, var6, (Vector) null);
		dp.g = var2;
		dp.b().i();
		main.a.h();
		if (ir.a == 57 && main.a.I) {
			(main.a.D = new bb()).b(dp.a);
		}

	}

	public static void a(ld var0) {
		(C = new hn()).K = 0;
		C.e = new Vector();
		boolean var1 = false;

		for (int var2 = 0; var2 < GameMidlet.i.e.size(); ++var2) {
			hx var3;
			(var3 = new hx()).a = ((hx) GameMidlet.i.e.elementAt(var2)).a;
			if (fx.a(var3.a).j == var0.j) {
				var3.a = var0.g;
				var1 = true;
			}

			C.a(var3);
		}

		if (!var1) {
			hx var5;
			(var5 = new hx()).a = var0.g;
			C.a(var5);
			C.h();
		}

	}

	public static void h(int var0) {
		b(fx.a((short) var0));
	}

	public static void b(ld var0) {
		main.a.a(var0.i[0], var0.i[1], new at(var0), new ar(var0), (ii) null);
	}

	public static void a(short var0, String var1, int var2, int var3, int var4) {
		main.a.b(var1);
		GameMidlet.i.a(var2);
		GameMidlet.i.c(var3);
		GameMidlet.i.b = var4;
		ld var5;
		if ((var5 = fx.a(var0)).f != -2) {
			hx var6;
			if ((var6 = fx.a(var5.j, GameMidlet.i.e)) != null) {
				var6.a = var0;
			} else if (var5.j == -1 && GameMidlet.i.V != -1) {
				GameMidlet.i.a(var0);
				iy.a().e(GameMidlet.i.w);
			} else {
				GameMidlet.i.a(new hx(var0));
				GameMidlet.i.h();
			}

			GameMidlet.i.e(11);
			if (var5.j == -1 && GameMidlet.i.V == -1) {
				GameMidlet.i.j();
				iy.a().e(GameMidlet.i.w);
			}
		}

		GameMidlet.k = null;
	}

	public static void x() {
		bf.a().a(b, -1);
		g = -1;
	}

	public final void y() {
		this.d(3, -1);
	}

	public final void a(byte var1, Vector var2, Vector var3, Vector var4) {
		byte[] var5 = new byte[] { 59, 60, 58, 104, 105, 101, 102 };
		ir.F = var3;
		ir.G = var4;
		main.a.x.e(var5[var1]);
		if (var3 != null) {
			ir.d();
		}

		for (int var6 = 0; var6 < var2.size(); ++var6) {
			js var7;
			if ((var7 = (js) var2.elementAt(var6)).az == 0) {
				hn var8;
				(var8 = (hn) var7).C = var8.aw;
				var8.D = var8.ax;
				var8.t = var8.K;
				var8.h();
				if (var8.w != GameMidlet.i.w) {
					e(var8);
					ir.b(var8);
				}
			} else if (var7.az == 5) {
				hm var9;
				(var9 = (hm) var7).b = var9.aw;
				var9.c = var9.ax;
				ir.m.addElement(var9);
			}
		}

		if (ca.b) {
			a(ca.a.a, ca.a.b, GameMidlet.i.K, GameMidlet.i.N);
		} else {
			++GameMidlet.i.ax;
			this.n();
		}

		b((int) GameMidlet.i.S);
		if (main.a.I && var5[var1] == 101) {
			(main.a.D = new bb()).e();
		}

	}

	public static void i(int var0) {
		D = var0;
		G = ir.a;
		b().n();
		cx.a().d(8);
		main.a.i();
	}

	public final void e(int var1, int var2) {
		if (main.a.r == dp.a) {
			dp.b().d();
		}

		System.out.println("onWeddingStart 1111111111111");
		main.a.J = 1;
		E = var1;
		F = var2;
		t = true;
		this.K = 0;

		int var3;
		int var5;
		for (var3 = 0; var3 < p.size() - 1; ++var3) {
			dr var4 = (dr) p.elementAt(var3);

			for (var5 = var3 + 1; var5 < p.size(); ++var5) {
				dr var6 = (dr) p.elementAt(var5);
				if (var4.e > var6.e) {
					p.setElementAt(var6, var3);
					p.setElementAt(var4, var5);
					var4 = var6;
				}
			}
		}

		js var10;
		for (var3 = 0; var3 < ir.m.size() - 1; ++var3) {
			if ((var10 = (js) ir.m.elementAt(var3)).az == 0) {
				for (var5 = var3 + 1; var5 < ir.m.size(); ++var5) {
					js var14;
					if ((var14 = (js) ir.m.elementAt(var5)).az == 0 && ((hn) var10).w > ((hn) var14).w) {
						ir.m.setElementAt(var14, var3);
						ir.m.setElementAt(var10, var5);
						var10 = var14;
					}
				}
			}
		}

		for (var3 = 0; var3 < ir.m.size(); ++var3) {
			if ((var10 = (js) ir.m.elementAt(var3)).az == 0) {
				hn var13;
				(var13 = (hn) var10).g.removeAllElements();
				if (var13.w == var2) {
					var13.aw = var13.C = 0;
					var13.ax = var13.D = 8 * ir.i + ir.i / 2 - ir.i / 2;
					var13.G = 2;
					this.K = 1;
					var13.f(2475, 20);
					var13.f(2476, 10);
					var13.f(300, 60);
					var13.f(302, 70);
					var13.h();
				} else if (var13.w == var1) {
					var13.aw = var13.C = 0;
					var13.ax = var13.D = 8 * ir.i + ir.i / 2 + ir.i / 2;
					var13.G = 2;
					this.K = 1;
					var13.f(2477, 20);
					var13.f(2478, 10);
					var13.h();
				}
			}
		}

		hn var11 = ir.g(var1);
		hn var12 = ir.g(var2);
		ir.m.removeElement(var11);
		ir.m.removeElement(var12);
		var5 = 0;

		for (int var15 = 0; var15 < ir.m.size(); ++var15) {
			js var7;
			hn var8;
			if ((var7 = (js) ir.m.elementAt(var15)).az == 0 && (var8 = (hn) var7).w != -100) {
				dr var9;
				main.a.h = main.a.j = (var9 = (dr) p.elementAt(var5 / 2)).a - do2.a().a + ir.i / 2;
				main.a.i = main.a.k = var9.b - do2.a().b + ir.i / 2 + var15 % 2 * (ir.i - 5);
				++var5;
				var8.a(main.a.h + do2.a().a, main.a.i + do2.a().b);
			}
		}

		ir.m.addElement(var11);
		ir.m.addElement(var12);
		ir.a(ir.m);
		main.a.h();
		System.out.println("onWeddingStart 2222222222222222222: " + t + "     " + this.K);
	}
}
