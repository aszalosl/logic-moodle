 [{:question "Válassza ki az alábbiak közül a változóiban tiszta formulákat!"
  :good [
         "\\( \\forall y\\forall z\\lnot ((\\lnot P(g(z,x))\\lor d=g(c,c))\\lor P(f(c))\\lor y=f(c)) \\)"
         "\\( \\forall y\\forall x((y=d\\lor (P(f(d))\\supset \\lnot P(y)))\\lor (P(g(c,y))\\supset f(y)=c)) \\)"
         "\\( (\\lnot (P(y)\\equiv P(c))\\equiv \\forall xP(f(f(d))))\\lor (Q(y,d)\\equiv d=f(d))\\equiv P(g(d,d)) \\)"
         "\\( (c=g(c,x)\\supset Q(c,d))\\land (Q(d,c)\\equiv P(g(d,z))\\supset (Q(y,d)\\land y=c\\lor Q(y,d))\\lor c=x) \\)"
         "\\( P(d)\\land \\exists x(P(y)\\land \\lnot (y=x\\land Q(c,y))\\land \\lnot P(g(f(x),z))) \\)"
         "\\( \\forall x\\lnot ((c=f(y)\\supset f(f(g(d,d)))=c\\land P(d)\\lor P(x))\\lor (Q(z,d)\\equiv x=g(y,x))) \\)"
         "\\( Q(c,g(g(z,d),y))\\lor (Q(y,c)\\equiv (d=x\\lor d=f(f(c)))\\lor P(y))\\equiv \\lnot (P(y)\\land P(f(g(f(x),c)))) \\)"
         "\\( \\forall z(P(x)\\land P(y)\\lor \\lnot Q(y,d)\\equiv P(f(y))\\equiv Q(d,f(c))\\equiv P(x)) \\)"
         "\\( (g(g(d,d),x)=z\\equiv Q(c,f(f(z))))\\lor P(x)\\lor \\lnot \\lnot (Q(c,c)\\supset Q(z,c)\\lor P(d)) \\)"
         "\\( \\lnot (\\lnot x=g(d,y)\\equiv d=g(x,c)\\equiv P(g(x,y)))\\equiv Q(y,d)\\land Q(y,y)\\supset P(f(y)) \\)"
  ]
  :wrong [
          ["\\( \\exists z(P(f(f(g(d,d))))\\lor P(d))\\supset \\lnot (\\exists xP(y)\\lor (Q(c,x)\\supset y=y)) \\)" "a(z) x változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\forall zQ(z,c)\\supset \\lnot \\lnot \\forall x\\lnot (Q(c,d)\\supset Q(z,y)) \\)" "a(z) z változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( (\\lnot Q(y,d)\\equiv \\lnot (x=x\\land Q(x,f(f(y)))\\supset P(x)))\\lor \\exists yQ(x,g(y,y)) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists y(\\exists yP(d)\\lor P(d)\\equiv \\forall y\\forall yP(g(x,g(c,c)))\\land P(d)) \\)" "a(z) y változó 4 kvantornak változója"]
          ["\\( \\exists x\\forall y(\\exists z\\forall x\\forall xc=g(d,y)\\supset \\lnot Q(d,d)) \\)" "a(z) x változó 3 kvantornak változója"]
          ["\\( c=f(f(d))\\land g(f(x),c)=z\\supset \\exists z\\lnot Q(c,y)\\lor \\exists x(g(c,y)=d\\supset P(y)) \\)" "a(z) z változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\lnot \\exists z\\forall z\\lnot Q(x,c)\\equiv \\forall x\\lnot Q(c,f(x)) \\)" "a(z) x változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\lnot \\forall z\\forall y((z=d\\supset y=x)\\supset \\lnot \\exists yP(d)) \\)" "a(z) y változó 2 kvantornak változója"]
          ["\\( \\exists z(c=x\\land c=c)\\equiv \\lnot (Q(x,d)\\lor \\exists xQ(c,d)\\equiv Q(c,g(y,x))) \\)" "a(z) x változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists x(\\exists xQ(f(x),f(c))\\land P(d)\\lor \\exists x\\exists x\\forall zP(c)) \\)" "a(z) x változó 4 kvantornak változója"]
          ["\\( g(c,y)=g(z,y)\\lor c=c\\supset \\exists y(\\exists z(x=y\\lor y=c)\\lor \\exists yQ(d,f(g(d,y)))) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists yP(y)\\supset \\lnot (P(d)\\land Q(d,z))\\lor \\lnot (x=d\\land Q(z,f(f(y)))) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\lnot \\lnot \\lnot \\forall y\\forall y(Q(f(x),y)\\supset g(x,f(x))=y\\land P(x)) \\)" "a(z) y változó 2 kvantornak változója"]
          ["\\( ((Q(y,x)\\land Q(x,x))\\land \\forall y\\lnot P(g(c,d))\\lor Q(d,g(c,g(x,d))))\\lor \\lnot Q(y,x) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists y(Q(x,y)\\land (P(c)\\supset P(d))\\lor \\exists z\\exists zd=z\\supset d=y) \\)" "a(z) z változó 2 kvantornak változója"]
          ["\\( \\forall z\\forall x(\\exists x\\forall zP(c)\\lor (g(g(x,c),y)=f(z)\\land y=c\\supset P(c))) \\)" "a(z) z változó 2 kvantornak változója"]
          ["\\( \\exists z(d=y\\supset \\lnot (Q(y,d)\\equiv \\exists x\\forall x(P(x)\\supset Q(c,x)))) \\)" "a(z) x változó 2 kvantornak változója"]
          ["\\( \\lnot (\\lnot (\\exists yP(c)\\lor \\forall xy=f(c))\\equiv \\lnot P(y)) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists zc=y\\land \\lnot \\exists y(Q(c,x)\\lor Q(d,y)\\land y=y)\\equiv Q(c,d) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( ((\\exists xQ(x,c)\\lor P(d)\\equiv z=x)\\equiv Q(d,f(g(z,y))))\\supset \\forall y(Q(d,x)\\supset Q(y,g(z,y))) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\lnot (((P(f(g(c,c)))\\equiv P(f(g(z,g(y,d)))))\\equiv \\exists z\\lnot P(g(x,d)))\\supset \\forall yy=y) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( (P(x)\\supset \\exists zQ(d,c))\\supset \\lnot \\lnot x=d\\lor \\forall xf(g(c,c))=x \\)" "a(z) x változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( (\\exists xd=f(x)\\supset z=x\\land \\lnot (Q(g(x,g(x,y)),c)\\lor Q(g(c,c),f(d))))\\lor \\exists yy=z \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\lnot ((Q(g(y,d),d)\\supset Q(x,g(c,c)))\\land (c=f(f(y))\\land d=x\\lor \\exists xQ(c,d)\\lor P(x))) \\)" "a(z) x változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists y(\\exists y\\forall z\\lnot (Q(c,f(y))\\supset P(c))\\land Q(d,c)\\land d=d) \\)" "a(z) y változó 2 kvantornak változója"]
          ["\\( \\forall zy=y\\lor (\\exists z\\exists y(P(x)\\lor g(d,y)=y)\\supset Q(d,f(y))\\lor P(d)) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\lnot \\exists y(P(d)\\land (\\forall y\\forall x\\exists zQ(g(x,c),g(z,f(c)))\\lor z=c)) \\)" "a(z) z változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists x(x=c\\land Q(d,y)\\supset (P(f(g(y,y)))\\equiv c=y))\\supset Q(g(x,g(y,c)),x)\\supset P(y)\\lor P(d) \\)" "a(z) x változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists y(c=g(z,y)\\land \\lnot \\exists x\\forall z((Q(z,y)\\equiv Q(x,f(y)))\\supset P(g(d,d)))) \\)" "a(z) z változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( (f(d)=g(x,d)\\equiv Q(d,d))\\supset P(d)\\lor \\exists x((Q(c,f(y))\\equiv \\forall xy=c)\\equiv Q(f(c),d)) \\)" "a(z) x változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( P(g(x,c))\\equiv Q(d,y)\\lor d=x\\supset \\forall x(Q(g(x,c),d)\\land P(c)\\equiv P(d))\\supset x=g(d,x) \\)" "a(z) x változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( (Q(d,x)\\lor \\lnot \\exists x(z=c\\supset Q(g(x,y),c)))\\land (\\exists zQ(z,y)\\lor c=c) \\)" "a(z) z változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\lnot Q(x,f(c))\\equiv \\forall z\\exists y(d=z\\land (P(d)\\lor \\exists xQ(d,x))) \\)" "a(z) x változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\lnot (\\lnot \\forall z(f(y)=y\\land y=c)\\equiv P(f(f(g(c,d))))\\equiv P(g(z,g(f(y),d)))\\land d=y) \\)" "a(z) z változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists y((x=g(z,z)\\equiv P(d)\\land \\exists xd=f(x))\\equiv P(f(g(c,y))))\\land \\forall xQ(d,g(x,y)) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\exists x(\\forall y\\lnot ((Q(d,g(z,z))\\lor Q(y,c))\\lor P(c))\\equiv \\forall zQ(z,y)) \\)" "a(z) y változónak vannak mind szabad, mind kötött előfordulásai is"]
          ["\\( \\forall y(\\forall zQ(c,f(d))\\equiv \\exists x((\\exists xQ(y,x)\\equiv f(c)=g(y,y))\\lor x=x)) \\)" "a(z) x változó 2 kvantornak változója"] ]}]
