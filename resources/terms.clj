[
 {:question "Válassza ki azokat a karaktersorozatokat, melyek termjei annak az elsőrendű nyelvnek, ahol \\(Var=\\{x, y, ...\\}\\), \\(\\mathcal{F}(0)=\\{c,d\\}\\), \\(\\mathcal{F}(1)=\\{f\\}\\), \\(\\mathcal{F}(2)=\\{g\\}\\), \\(\\mathcal{P}(1)=\\{P\\}\\) és \\(\\mathcal{P}(2)=\\{Q\\}\\)!"
  :good [
    "\\( c \\)"
    "\\( d \\)"
    "\\( f(c) \\)"
    "\\( f(d) \\)"
    "\\( f(f(c)) \\)"
    "\\( f(f(d)) \\)"
    "\\( f(f(x)) \\)"
    "\\( f(g(x,g(c,f(y)))) \\)"
    "\\( f(g(y,c)) \\)"
    "\\( f(g(z,c)) \\)"
    "\\( f(x) \\)"
    "\\( f(y) \\)"
    "\\( g(c,d) \\)"
    "\\( g(c,f(g(c,c))) \\)"
    "\\( g(c,x) \\)"
    "\\( g(d,c) \\)"
    "\\( g(d,f(g(g(z,y),x))) \\)"
    "\\( g(d,x) \\)"
    "\\( g(f(x),x) \\)"
    "\\( g(x,f(f(d))) \\)"
    "\\( g(x,g(y,f(d))) \\)"
    "\\( g(x,g(z,y)) \\)"
    "\\( g(x,x) \\)"
    "\\( g(x,y) \\)"
    "\\( g(y,d) \\)"
    "\\( g(y,g(d,d)) \\)"
    "\\( g(y,g(y,c)) \\)"
    "\\( g(y,g(y,x)) \\)"
    "\\( g(y,y) \\)"
    "\\( g(y,z) \\)"
    "\\( g(z,f(c)) \\)"
    "\\( g(z,x) \\)"
    "\\( g(z,y) \\)"
    "\\( x \\)"
    "\\( y \\)"]
  :wrong [
    ["\\( c = f(g(z,c)) \\)" "formula és nem term"]
    ["\\( g(x,g(x,g(z,y))) = c \\)" "formula és nem term"]
    ["\\( P(f(g(z,y))) \\)" "formula és nem term"]
    ["\\( Q(d,f(g(g(y,y),x))) \\)" "formula és nem term"]
    ["\\( y = g(g(d,g(g(d,d),d)),z) \\)" "formula és nem term"]
    ["\\( g(c,g(f(c,c))) \\)" "a g-nek 2, az f-nek 1 argumentuma van"]
    ["\\( f \\)" "az f-nek 1 argumentuma van"]
    ["\\( g(y,Q(y,x)) \\)" "a függvényjelnek nem lehet formula az argumentuma"]
    ["\\( g(c,P(g(c,c))) \\)" "a függvényjelnek nem lehet formula az argumentuma"]
    ["\\( f(x,f(f(d))) \\)" "az f-nek 1 argumentuma van"]
    ["\\( g(g(x,g(c,f(y)))) \\)" "a g-nek két argumentuma van"]]}
 {:question "Válassza ki azokat a karaktersorozatokat, melyek formulái annak az elsőrendű nyelvnek, ahol \\(Var=\\{x, y, ...\\}\\), \\(\\mathcal{F}(0)=\\{c,d\\}\\), \\(\\mathcal{F}(1)=\\{f\\}\\), \\(\\mathcal{F}(2)=\\{g\\}\\), \\(\\mathcal{P}(1)=\\{P\\}\\) és \\(\\mathcal{P}(2)=\\{Q\\}\\)!"
 :good [
    "\\( c = c \\)"
    "\\( c = d \\)"
    "\\( c = f(d) \\)"
    "\\( c = f(f(c)) \\)"
    "\\( c = f(g(d,y)) \\)"
    "\\( c = f(g(z,c)) \\)"
    "\\( c = f(x) \\)"
    "\\( c = f(y) \\)"
    "\\( c = g(c,d) \\)"
    "\\( c = g(d,d) \\)"
    "\\( c = g(g(x,y),c) \\)"
    "\\( c = g(x,x) \\)"
    "\\( c = g(y,d) \\)"
    "\\( c = x \\)"
    "\\( c = y \\)"
    "\\( d = c \\)"
    "\\( d = d \\)"
    "\\( d = f(d) \\)"
    "\\( d = f(f(d)) \\)"
    "\\( d = f(g(x,x)) \\)"
    "\\( d = f(g(y,z)) \\)"
    "\\( d = f(y) \\)"
    "\\( d = g(c,c) \\)"
    "\\( d = g(d,z) \\)"
    "\\( d = g(z,y) \\)"
    "\\( d = x \\)"
    "\\( d = y \\)"
    "\\( f(c) = x \\)"
    "\\( f(d) = g(c,x) \\)"
    "\\( f(d) = g(c,y) \\)"
    "\\( f(f(c)) = d \\)"
    "\\( f(f(y)) = x \\)"
    "\\( f(g(f(x),f(g(d,c)))) = x \\)"
    "\\( f(g(x,c)) = d \\)"
    "\\( f(x) = f(c) \\)"
    "\\( f(x) = f(x) \\)"
    "\\( f(y) = d \\)"
    "\\( f(y) = g(d,z) \\)"
    "\\( f(y) = g(x,y) \\)"
    "\\( f(y) = y \\)"
    "\\( f(z) = g(d,g(y,y)) \\)"
    "\\( g(c,d) = x \\)"
    "\\( g(c,z) = c \\)"
    "\\( g(c,z) = f(y) \\)"
    "\\( g(d,d) = g(z,c) \\)"
    "\\( g(d,x) = f(x) \\)"
    "\\( g(d,x) = g(g(c,z),g(c,x)) \\)"
    "\\( g(d,z) = d \\)"
    "\\( g(d,z) = y \\)"
    "\\( g(f(y),x) = g(g(c,d),f(y)) \\)"
    "\\( g(g(c,c),x) = g(c,y) \\)"
    "\\( g(g(c,x),y) = z \\)"
    "\\( g(g(f(z),c),g(x,y)) = g(c,y) \\)"
    "\\( g(x,c) = y \\)"
    "\\( g(x,g(x,g(z,y))) = c \\)"
    "\\( g(x,x) = x \\)"
    "\\( g(y,g(x,c)) = g(c,x) \\)"
    "\\( g(z,g(x,y)) = x \\)"
    "\\( g(z,x) = f(x) \\)"
    "\\( g(z,y) = g(f(y),f(d)) \\)"
    "\\( P(c) \\)"
    "\\( P(d) \\)"
    "\\( P(f(c)) \\)"
    "\\( P(f(d)) \\)"
    "\\( P(f(f(c))) \\)"
    "\\( P(f(f(d))) \\)"
    "\\( P(f(f(f(c)))) \\)"
    "\\( P(f(f(g(x,d)))) \\)"
    "\\( P(f(f(g(y,g(y,x))))) \\)"
    "\\( P(f(f(y))) \\)"
    "\\( P(f(g(d,c))) \\)"
    "\\( P(f(g(x,y))) \\)"
    "\\( P(f(g(z,y))) \\)"
    "\\( P(f(x)) \\)"
    "\\( P(f(y)) \\)"
    "\\( P(g(c,c)) \\)"
    "\\( P(g(c,d)) \\)"
    "\\( P(g(c,y)) \\)"
    "\\( P(g(d,c)) \\)"
    "\\( P(g(d,g(g(c,c),x))) \\)"
    "\\( P(g(d,g(x,y))) \\)"
    "\\( P(g(d,x)) \\)"
    "\\( P(g(f(g(x,y)),y)) \\)"
    "\\( P(g(g(c,x),d)) \\)"
    "\\( P(g(g(g(z,c),f(y)),f(g(z,c)))) \\)"
    "\\( P(g(g(x,c),f(d))) \\)"
    "\\( P(g(g(y,z),y)) \\)"
    "\\( P(g(g(z,x),x)) \\)"
    "\\( P(g(x,c)) \\)"
    "\\( P(g(x,g(f(f(x)),d))) \\)"
    "\\( P(g(x,g(y,y))) \\)"
    "\\( P(g(x,x)) \\)"
    "\\( P(g(y,c)) \\)"
    "\\( P(g(y,d)) \\)"
    "\\( P(g(y,f(y))) \\)"
    "\\( P(g(y,g(y,f(c)))) \\)"
    "\\( P(g(y,x)) \\)"
    "\\( P(g(y,y)) \\)"
    "\\( P(x) \\)"
    "\\( P(y) \\)"
    "\\( Q(c,c) \\)"
    "\\( Q(c,d) \\)"
    "\\( Q(c,f(c)) \\)"
    "\\( Q(c,f(g(y,c))) \\)"
    "\\( Q(c,g(g(c,y),x)) \\)"
    "\\( Q(c,g(g(c,z),d)) \\)"
    "\\( Q(c,g(g(z,d),y)) \\)"
    "\\( Q(c,g(y,y)) \\)"
    "\\( Q(c,x) \\)"
    "\\( Q(c,y) \\)"
    "\\( Q(d,c) \\)"
    "\\( Q(d,d) \\)"
    "\\( Q(d,f(c)) \\)"
    "\\( Q(d,f(d)) \\)"
    "\\( Q(d,f(g(g(y,y),x))) \\)"
    "\\( Q(d,f(g(y,c))) \\)"
    "\\( Q(d,f(x)) \\)"
    "\\( Q(d,f(y)) \\)"
    "\\( Q(d,g(c,d)) \\)"
    "\\( Q(d,g(x,c)) \\)"
    "\\( Q(d,g(x,d)) \\)"
    "\\( Q(d,g(z,x)) \\)"
    "\\( Q(d,x) \\)"
    "\\( Q(d,y) \\)"
    "\\( Q(f(c),c) \\)"
    "\\( Q(f(c),y) \\)"
    "\\( Q(f(d),d) \\)"
    "\\( Q(f(d),g(c,g(y,c))) \\)"
    "\\( Q(f(d),x) \\)"
    "\\( Q(f(f(c)),x) \\)"
    "\\( Q(f(f(d)),c) \\)"
    "\\( Q(f(f(g(g(c,c),y))),d) \\)"
    "\\( Q(f(f(x)),f(x)) \\)"
    "\\( Q(f(f(x)),y) \\)"
    "\\( Q(f(g(d,y)),c) \\)"
    "\\( Q(f(x),d) \\)"
    "\\( Q(f(x),x) \\)"
    "\\( Q(f(y),d) \\)"
    "\\( Q(f(y),x) \\)"
    "\\( Q(f(y),y) \\)"
    "\\( Q(f(z),x) \\)"
    "\\( Q(g(c,d),c) \\)"
    "\\( Q(g(c,d),f(f(x))) \\)"
    "\\( Q(g(c,x),d) \\)"
    "\\( Q(g(c,y),g(y,d)) \\)"
    "\\( Q(g(c,y),z) \\)"
    "\\( Q(g(d,d),c) \\)"
    "\\( Q(g(d,x),c) \\)"
    "\\( Q(g(d,y),d) \\)"
    "\\( Q(g(f(c),d),f(c)) \\)"
    "\\( Q(g(f(c),z),y) \\)"
    "\\( Q(g(f(d),x),g(z,y)) \\)"
    "\\( Q(g(g(c,x),y),c) \\)"
    "\\( Q(g(g(c,z),y),x) \\)"
    "\\( Q(g(x,c),g(y,y)) \\)"
    "\\( Q(g(x,d),f(d)) \\)"
    "\\( Q(g(x,f(y)),x) \\)"
    "\\( Q(g(x,y),d) \\)"
    "\\( Q(g(x,z),x) \\)"
    "\\( Q(g(y,c),y) \\)"
    "\\( Q(g(y,x),d) \\)"
    "\\( Q(g(y,y),y) \\)"
    "\\( Q(g(z,d),g(x,z)) \\)"
    "\\( Q(g(z,g(y,x)),g(z,x)) \\)"
    "\\( Q(x,c) \\)"
    "\\( Q(x,d) \\)"
    "\\( Q(x,f(x)) \\)"
    "\\( Q(x,f(y)) \\)"
    "\\( Q(x,g(d,d)) \\)"
    "\\( Q(x,x) \\)"
    "\\( Q(x,y) \\)"
    "\\( Q(x,z) \\)"
    "\\( Q(y,c) \\)"
    "\\( Q(y,d) \\)"
    "\\( Q(y,f(f(g(x,d)))) \\)"
    "\\( Q(y,f(f(y))) \\)"
    "\\( Q(y,g(c,d)) \\)"
    "\\( Q(y,g(y,y)) \\)"
    "\\( Q(y,x) \\)"
    "\\( Q(y,y) \\)"
    "\\( Q(z,d) \\)"
    "\\( Q(z,g(z,g(y,c))) \\)"
    "\\( x = c \\)"
    "\\( x = d \\)"
    "\\( x = f(g(f(f(c)),x)) \\)"
    "\\( x = f(y) \\)"
    "\\( x = g(c,c) \\)"
    "\\( x = g(c,d) \\)"
    "\\( x = g(g(d,y),x) \\)"
    "\\( x = g(x,g(d,d)) \\)"
    "\\( x = g(x,x) \\)"
    "\\( x = g(z,y) \\)"
    "\\( x = x \\)"
    "\\( x = y \\)"
    "\\( y = c \\)"
    "\\( y = d \\)"
    "\\( y = f(d) \\)"
    "\\( y = g(d,c) \\)"
    "\\( y = g(g(d,g(g(d,d),d)),z) \\)"
    "\\( y = g(g(x,x),x) \\)"
    "\\( y = g(y,d) \\)"
    "\\( y = g(y,x) \\)"
    "\\( y = g(y,y) \\)"
    "\\( y = g(y,z) \\)"
    "\\( y = x \\)"
    "\\( y = y \\)"
    "\\( y = z \\)"
    "\\( z = c \\)"
    "\\( z = d \\)"
    "\\( z = g(d,g(x,y)) \\)"
    "\\( z = g(g(f(c),g(c,y)),y) \\)"
    "\\( z = g(y,g(d,z)) \\)"
    "\\( z = x \\)"
    "\\( P(g(d,x)) \\land \\( Q(d,g(z,x)) \\)"
    "\\( Q(f(z),x) \\supset x = g(c,c) \\)"
    "\\( \\lnot c = g(g(x,y),c) \\)"
  ]
  :wrong [
    ["\\( g(x,f(f(d))) \\)" "term és nem formula"]
    ["\\( f(f(d)) \\)" "term és nem formula"]
    ["\\( g(y,g(y,x)) \\)" "term és nem formula"]
    ["\\( y \\)" "term és nem formula"]
    ["\\( g(d,f(g(g(z,y),x))) \\)" "term és nem formula"]
    ["\\( P \\)" "a P-nek 1 argumentuma van"]
    ["\\( y = Q(y,x) \\)" "term és formula egyenlősége nem formula"]
    ["\\( P(f(y)) = x \\)" "term és formula egyenlősége nem formula"]
    ["\\( P(z) = Q(d,g(y,y)) \\)" "formulák egyenlősége nem formula"]
    ["\\( g(d,x) \\equiv g(g(c,z),g(c,x)) \\)" "termek ekvivalenciája nem formula"]
    ["\\( Q(y,g(y,y))\\supset g(d,x) \\)" "formula és term implikációja nem formula"]
    ["\\( c \\not= g(g(x,y),c) \\)" "a \\( \\not= \\) nem része a nyelvnek"]
    ["\\( d = f(Q(x,x)) \\)" "formula nem lehet term argumentuma"]
    ["\\( P(d,f(g(g(y,y),x))) \\)" "a P-nek 1 argumentuma van"]
    ["\\( Q(c,f(c), f(f(c))) \\)" "a Q-nak 2 argumentuma van"]
    ["\\( Q(P(d),d) \\)" "Q argumentuma nem lehet formula"]
    ["\\( x = g(c,f) \\)" "g argumentuma nem lehet függvényjel, csak teljes term"]]}]
