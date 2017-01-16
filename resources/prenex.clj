[{:question "A felsoroltak közül melyek prenex alakjai a \\( \\exists x\\forall y(\\lnot P(y)\\land \\lnot (\\lnot \\lnot P(f(g(y,x)))\\supset c=x)) \\) formulának?"
  :good [
    "\\( \\exists x\\forall y(\\lnot P(y)\\land \\lnot (\\lnot \\lnot P(f(g(y,x)))\\supset c=x)) \\)"
    "\\( \\exists x\\forall y(\\lnot P(y)\\land \\lnot (P(f(g(y,x)))\\supset c=x)) \\)"
    "\\( \\exists u\\forall y(\\lnot P(y)\\land \\lnot (\\lnot \\lnot P(f(g(y,u)))\\supset c=u)) \\)"
    "\\( \\exists x\\forall z(\\lnot P(z)\\land \\lnot (\\lnot \\lnot P(f(g(z,x)))\\supset c=x)) \\)"]
  :wrong [
    ["\\( \\forall y\\exists x(\\lnot P(y)\\land \\lnot (\\lnot \\lnot P(f(g(y,x)))\\supset c=x)) \\)"
     "különböző kvantorok felcserélése nem ekvivalens átalakítás"]
    ["\\( \\exists x\\forall z(\\lnot P(z)\\land \\lnot (\\lnot \\lnot P(f(g(y,x)))\\supset c=x)) \\)"
     "átnevezéskor az összes kötött előfordulást át kell nevezni"]]}
 
 {:question "A felsoroltak közül melyek prenex alakjai a \\( \\lnot \\exists z((P(g(y,z))\\supset \\lnot (Q(d,y)\\lor g(z,y)=c\\lor \\forall yy=d))\\land P(g(g(c,x),x))) \\) formulának?"
  :good [
    "\\( \\forall z\\forall u\\lnot ((P(g(y,z))\\supset \\lnot (Q(d,y)\\lor g(z,y)=c\\lor u=d))\\land P(g(g(c,x),x))) \\)"
    "\\( \\forall u\\forall z\\lnot ((P(g(y,z))\\supset \\lnot (Q(d,y)\\lor g(z,y)=c\\lor u=d))\\land P(g(g(c,x),x))) \\)"
    "\\( \\forall z\\forall v\\lnot ((P(g(y,z))\\supset \\lnot (Q(d,y)\\lor g(z,y)=c\\lor v=d))\\land P(g(g(c,x),x))) \\)"]
  :wrong [
    ["\\( \\forall z\\forall y\\lnot ((P(g(y,z))\\supset \\lnot (Q(d,y)\\lor g(z,y)=c\\lor y=d))\\land P(g(g(c,x),x))) \\)"
     "Mivel y-nak az eredeti formulában kötött és szabad előfordulása is van, szükséges átnevezni a kvantort"]
    ["\\( \\forall z\\forall x\\lnot ((P(g(y,z))\\supset \\lnot (Q(d,y)\\lor g(z,y)=c\\lor x=d))\\land P(g(g(c,x),x))) \\)"
     "mivel x-nek az eredeti formulában volt szabad előfordulása a kvantort nem lehet x-re átnevezni"]]}
 
 {:question "A felsoroltak közül melyek prenex alakjai a \\( \\lnot ((\\forall x\\forall z\\forall zQ(d,x)\\land x=c)\\land \\exists z\\forall xP(x)) \\) formulának?"
  :good [
    "\\( \\forall z\\exists v\\exists u\\exists w\\exists t\\lnot ((Q(d,u)\\land x=c)\\land P(v)) \\)"
    "\\( \\forall z\\exists u\\exists v\\exists w\\exists t\\lnot ((Q(d,u)\\land x=c)\\land P(v)) \\)"
    "\\( \\exists u\\exists w\\exists t\\forall z\\exists v\\lnot ((Q(d,u)\\land x=c)\\land P(v)) \\)"
    "\\( \\forall z\\exists u\\exists v\\exists w\\exists t\\lnot ((Q(d,u)\\land x=c)\\land P(v)) \\)"
    "\\( \\exists u\\forall z\\exists w\\exists v\\exists t\\lnot ((Q(d,u)\\land x=c)\\land P(v)) \\)"
    "\\( \\exists u\\exists v\\lnot ((Q(d,u)\\land x=c)\\land P(v)) \\)"]
  :wrong [
    ["\\( \\forall z\\exists v\\exists w\\exists t\\lnot ((Q(d,u)\\land x=c)\\land P(v)) \\)"
     "az eredeti formulában csak egy szabad változó volt, itt már kettő van"]
    ["\\( \\forall z\\exists u\\exists v\\exists w\\exists t\\lnot ((Q(d,u)\\land u=c)\\land P(v)) \\)"
     "az eredeti formula nem volt zárt, ez már az"]]}
 
 {:question "A felsoroltak közül melyek prenex alakjai a \\( \\forall z(P(c)\\lor ((x=d\\supset c=y)\\supset \\exists z((\\exists zd=c\\supset Q(d,f(d)))\\lor y=c))) \\) formulának?"
  :good [
    "\\( \\forall u\\exists v\\forall z(P(c)\\lor ((x=d\\supset c=y)\\supset (d=c\\supset Q(d,f(d)))\\lor y=c)) \\)"
    "\\( (P(c)\\lor ((x=d\\supset c=y)\\supset (d=c\\supset Q(d,f(d)))\\lor y=c)) \\)"
    "\\( \\exists v\\forall u(P(c)\\lor ((x=d\\supset c=y)\\supset (d=c\\supset Q(d,f(d)))\\lor y=c)) \\)"
    "\\( \\forall u\\exists v(P(c)\\lor ((x=d\\supset c=y)\\supset (d=c\\supset Q(d,f(d)))\\lor y=c)) \\)"
    "\\( \\forall u\\forall z(P(c)\\lor ((x=d\\supset c=y)\\supset (d=c\\supset Q(d,f(d)))\\lor y=c)) \\)"]
  :wrong [
    ["\\( \\forall z\\exists y\\forall x(P(c)\\lor ((x=d\\supset c=y)\\supset (d=c\\supset Q(d,f(d)))\\lor y=c)) \\)"
     "ez a formula zárt, noha az eredeti nem az"]
    ["\\( \\forall u\\exists v\\forall x(P(c)\\lor ((x=d\\supset c=y)\\supset (d=c\\supset Q(d,f(d)))\\lor y=c)) \\)"
     "az eredeti formulában az x formulának volt szabad előfordulása, itt nincs"]
    ["\\( \\forall u\\exists v\\forall z(P(c)\\lor ((x=d\\supset c=u)\\supset (d=c\\supset Q(d,f(d)))\\lor y=c)) \\)"
     "nem kötött előfordulást nem lehet átnevezni"]]}
 
 {:question "A felsoroltak közül melyek prenex alakjai a \\( \\lnot (\\forall xg(c,x)=y\\supset \\exists z(d=z\\lor x=x)\\land P(f(g(x,d)))\\lor x=g(d,c)\\supset c=c) \\) formulának?"
  :good [
    "\\( \\forall u\\exists z\\lnot (g(c,u)=y\\supset (d=z\\lor x=x)\\land P(f(g(x,d)))\\lor x=g(d,c)\\supset c=c) \\)"
    "\\( \\exists z\\forall u\\lnot (g(c,u)=y\\supset (d=z\\lor x=x)\\land P(f(g(x,d)))\\lor x=g(d,c)\\supset c=c) \\)"
    "\\( \\forall u\\exists v\\lnot (g(c,u)=y\\supset (d=v\\lor x=x)\\land P(f(g(x,d)))\\lor x=g(d,c)\\supset c=c) \\)"
    "\\( \\forall v\\exists z\\lnot (g(c,v)=y\\supset (d=z\\lor x=x)\\land P(f(g(x,d)))\\lor x=g(d,c)\\supset c=c) \\)"]
  :wrong [
    ["\\( \\exists z\\forall x\\lnot (g(c,x)=y\\supset (d=z\\lor x=x)\\land P(f(g(x,d)))\\lor x=g(d,c)\\supset c=c) \\)"
     "Az eredeti formulában az x változónak volt szabad előfordulása, itt nincs"]
    ["\\( \\forall c\\exists z\\lnot (g(c,u)=y\\supset (d=z\\lor x=x)\\land P(f(g(x,d)))\\lor x=g(d,c)\\supset c=c) \\)"
     "a kvantort csak változó követheti"]]}
 
 {:question "A felsoroltak közül melyek prenex alakjai a \\( \\exists z((\\lnot y=c\\supset \\exists xP(c))\\land (P(x)\\lor \\forall x\\forall xg(d,y)=x)) \\) formulának?"
  :good [
    "\\( \\exists z\\exists u\\forall w\\forall v((\\lnot y=c\\supset P(c))\\land (P(x)\\lor g(d,y)=w)) \\)"
    "\\( \\exists z\\exists u\\forall v\\forall w((\\lnot y=c\\supset P(c))\\land (P(x)\\lor g(d,y)=w)) \\)"
    "\\( \\exists z\\forall v\\exists u\\forall w((\\lnot y=c\\supset P(c))\\land (P(x)\\lor g(d,y)=w)) \\)"
    "\\( \\exists z\\exists u\\forall v\\forall w((\\lnot y=c\\supset P(c))\\land (P(x)\\lor g(d,y)=w)) \\)"
    "\\( \\exists z\\forall v\\forall w((\\lnot y=c\\supset P(c))\\land (P(x)\\lor g(d,y)=w)) \\)"
    "\\( \\forall w((\\lnot y=c\\supset P(c))\\land (P(x)\\lor g(d,y)=w)) \\)"]
  :wrong [
    ["\\( \\exists z\\forall v\\exists u\\forall x((\\lnot y=c\\supset P(c))\\land (P(x)\\lor g(d,y)=x)) \\)"
     "az eredeti formulában x-nek volt szabad előfordulása, itt nincs"]
    ["\\( \\exists y\\exists u\\forall v\\forall w((\\lnot y=c\\supset P(c))\\land (P(x)\\lor g(d,y)=w)) \\)"
     "az eredeti formulában y-nek volt szabad előfordulása, itt nincs"]
    ["\\( \\forall v\\exists u\\forall w((\\lnot z=c\\supset P(c))\\land (P(x)\\lor g(d,y)=w)) \\)"
     "csak kötött előfordulást lehet átnevezni"]]}

 {:question "A felsoroltak közül melyek prenex alakjai a \\( Q(y,x)\\supset \\exists x(P(c)\\land y=x\\supset Q(x,g(z,d)))\\land \\forall x(\\lnot Q(y,d)\\land Q(d,c)) \\) formulának?"
  :good [
    "\\( \\exists u(Q(y,x)\\supset (P(c)\\land y=u\\supset Q(u,g(z,d)))\\land \\lnot Q(y,d)\\land Q(d,c)) \\)"
    "\\( \\forall v\\exists u(Q(y,x)\\supset (P(c)\\land y=u\\supset Q(u,g(z,d)))\\land \\lnot Q(y,d)\\land Q(d,c)) \\)"
    "\\( \\exists u\\forall v(Q(y,x)\\supset (P(c)\\land y=u\\supset Q(u,g(z,d)))\\land \\lnot Q(y,d)\\land Q(d,c)) \\)"]
  :wrong [
    ["\\( \\forall v(Q(y,x)\\supset (P(c)\\land y=u\\supset Q(u,g(z,d)))\\land \\lnot Q(y,d)\\land Q(d,c)) \\)"
     "az eredeti formulában nem volt u-nak szabad előfordulása, itt van"]
    ["\\( \\forall v\\exists x(Q(y,x)\\supset (P(c)\\land y=x\\supset Q(x,g(z,d)))\\land \\lnot Q(y,d)\\land Q(d,c)) \\)"
     "az eredeti formulában x-nek volt szabad előfordulása, itt nincs"]
    ["\\( \\exists x(Q(y,x)\\supset (P(c)\\land y=x\\supset Q(x,g(z,d)))\\land \\lnot Q(y,d)\\land Q(d,c)) \\)"
     "az eredeti formulában x-nek volt szabad előfordulása, itt nincs"]]}
     
 {:question "A felsoroltak közül melyek prenex alakjai a \\( \\forall x\\lnot ((\\forall y(Q(g(c,y),d)\\supset P(y))\\supset Q(c,x))\\lor (Q(d,d)\\supset Q(y,f(d)))\\land P(d)) \\) formulának?"
  :good [
    "\\( \\forall x\\forall u\\lnot (((Q(g(c,u),d)\\supset P(u))\\supset Q(c,x))\\lor (Q(d,d)\\supset Q(y,f(d)))\\land P(d)) \\)"
    "\\( \\forall v\\forall u\\lnot (((Q(g(c,u),d)\\supset P(u))\\supset Q(c,v))\\lor (Q(d,d)\\supset Q(y,f(d)))\\land P(d)) \\)"
    "\\( \\forall v\\forall x\\lnot (((Q(g(c,u),d)\\supset P(u))\\supset Q(c,x))\\lor (Q(d,d)\\supset Q(y,f(d)))\\land P(d)) \\)"]
  :wrong [
    ["\\( \\forall x\\forall y\\lnot (((Q(g(c,y),d)\\supset P(y))\\supset Q(c,x))\\lor (Q(d,d)\\supset Q(y,f(d)))\\land P(d)) \\)"
     "az eredeti formulában az y-nak volt szabad előfordulása, itt nincs"]
    ["\\( \\forall x\\forall u\\lnot (((Q(g(c,y),d)\\supset P(y))\\supset Q(c,x))\\lor (Q(d,d)\\supset Q(u,f(d)))\\land P(d)) \\)" 
     "megváltoztak a kötési viszonyok (y)"]
    ["\\( \\forall u\\lnot (((Q(g(c,u),d)\\supset P(u))\\supset Q(c,x))\\lor (Q(d,d)\\supset Q(y,f(d)))\\land P(d)) \\)"
     "az eredeti formulában az x-nek nem volt szabad előfordulása, itt van"]]}
     
 {:question "A felsoroltak közül melyek prenex alakjai a \\( (x=c\\supset P(g(c,c))\\lor \\forall zQ(x,x))\\land P(f(x))\\lor (d=f(y)\\land P(g(g(z,c),y))\\lor P(d)\\supset Q(c,f(c))) \\) formulának?"
  :good [
    "\\( ((x=c\\supset P(g(c,c))\\lor Q(x,x))\\land P(f(x))\\lor (d=f(y)\\land P(g(g(z,c),y))\\lor P(d)\\supset Q(c,f(c)))) \\)"
    "\\( \\forall u((x=c\\supset P(g(c,c))\\lor Q(x,x))\\land P(f(x))\\lor (d=f(y)\\land P(g(g(z,c),y))\\lor P(d)\\supset Q(c,f(c)))) \\)"
    "\\( \\forall v((x=c\\supset P(g(c,c))\\lor Q(x,x))\\land P(f(x))\\lor (d=f(y)\\land P(g(g(z,c),y))\\lor P(d)\\supset Q(c,f(c)))) \\)"
    "\\( \\forall w((x=c\\supset P(g(c,c))\\lor Q(x,x))\\land P(f(x))\\lor (d=f(y)\\land P(g(g(z,c),y))\\lor P(d)\\supset Q(c,f(c)))) \\)"]
  :wrong [
    ["\\( \\forall z((x=c\\supset P(g(c,c))\\lor Q(x,x))\\land P(f(x))\\lor (d=f(y)\\land P(g(g(z,c),y))\\lor P(d)\\supset Q(c,f(c)))) \\)"
     "az eredeti formulában a z-nek volt szabad előfordulása, itt nincs"]
    ["\\( \\forall x((x=c\\supset P(g(c,c))\\lor Q(x,x))\\land P(f(x))\\lor (d=f(y)\\land P(g(g(z,c),y))\\lor P(d)\\supset Q(c,f(c)))) \\)"
     "az eredeti formulában az x-nek volt szabad előfordulása, itt nincs"]
    ["\\( \\forall y((x=c\\supset P(g(c,c))\\lor Q(x,x))\\land P(f(x))\\lor (d=f(y)\\land P(g(g(z,c),y))\\lor P(d)\\supset Q(c,f(c)))) \\)"
     "az eredeti formulában az y-nek volt szabad előfordulása, itt nincs"]]}
     
 {:question "A felsoroltak közül melyek prenex alakjai a \\( \\lnot (\\exists x((Q(y,x)\\lor (Q(y,d)\\supset P(f(f(y)))))\\lor \\forall zP(d))\\lor P(d)\\lor y=c) \\) formulának?"
  :good [
    "\\( \\forall x\\exists z\\lnot (((Q(y,x)\\lor (Q(y,d)\\supset P(f(f(y)))))\\lor P(d))\\lor P(d)\\lor y=c) \\)"
    "\\( \\forall u\\lnot (((Q(y,u)\\lor (Q(y,d)\\supset P(f(f(y)))))\\lor P(d))\\lor P(d)\\lor y=c) \\)"
    "\\( \\exists z\\forall x\\lnot (((Q(y,x)\\lor (Q(y,d)\\supset P(f(f(y)))))\\lor P(d))\\lor P(d)\\lor y=c) \\)"
    "\\( \\forall u\\exists z\\lnot (((Q(y,u)\\lor (Q(y,d)\\supset P(f(f(y)))))\\lor P(d))\\lor P(d)\\lor y=c) \\)"]
  :wrong [
    ["\\( \\forall y\\lnot (((Q(y,x)\\lor (Q(y,d)\\supset P(f(f(y)))))\\lor P(d))\\lor P(d)\\lor y=c) \\)"
     "az eredeti formulában az y-nek volt szabad előfordulása, itt nincs"]
    ["\\( \\lnot \\exists y (((Q(y,x)\\lor (Q(y,d)\\supset P(f(f(y)))))\\lor P(d))\\lor P(d)\\lor y=c) \\)"
     "negációval nem kezdődhet prenex alak"]]}

  {:question "A felsoroltak közül melyek prenex alakjai a \\( \\exists y\\forall y\\forall y(\\exists y(Q(x,c)\\supset \\forall yQ(d,c))\\supset \\forall zP(x)) \\) formulának?"
  :good [
    "\\( \\exists u\\forall v\\forall w\\forall z\\forall t\\exists y((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
    "\\( \\exists u\\forall v\\forall w\\forall t\\exists y\\forall z((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
    "\\( \\exists u\\forall v\\forall w\\forall z\\forall t\\exists y((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
    "\\( \\exists u\\forall v\\forall w\\forall t\\forall z\\exists y((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
    "\\( \\forall v\\forall w\\forall t\\forall z\\exists y((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
    "\\( \\forall w\\forall t\\exists y\\forall z((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
    "\\( \\forall z\\forall t\\exists y((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
    "\\( \\forall z\\exists y((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
    "\\( \\forall z((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"]
  :wrong [
    ["\\( \\exists u\\forall v\\forall w\\forall t\\exists x\\forall z((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
     "az eredeti formulában az x-nek volt szabad előfordulása, itt nincs"]
    ["\\( \\exists u\\forall t\\forall w\\forall v\\exists x\\forall z((Q(x,c)\\supset Q(d,c))\\supset P(x)) \\)"
     "az eredeti formulában az x-nek volt szabad előfordulása, itt nincs"]
    ["\\( \\exists u\\forall t\\forall w\\forall v\\exists y\\forall z(Q(x,c)\\supset Q(d,c))\\supset P(x) \\)"
     "ez egy implikáció, mely előtagjában szerepel kvantor"]]}

  {:question "A felsoroltak közül melyek prenex alakjai a \\( \\forall zP(d)\\supset \\lnot \\forall x\\lnot \\exists x\\exists y(Q(y,g(c,c))\\supset Q(d,g(d,x))) \\) formulának?"
  :good [
    "\\( \\exists x\\exists y(P(d)\\supset \\lnot \\lnot (Q(y,g(c,c))\\supset Q(d,g(d,x)))) \\)"
    "\\( \\exists u\\exists x\\exists y(P(d)\\supset \\lnot \\lnot (Q(y,g(c,c))\\supset Q(d,g(d,x)))) \\)"
    "\\( \\exists z\\exists x\\exists y(P(d)\\supset \\lnot \\lnot (Q(y,g(c,c))\\supset Q(d,g(d,x)))) \\)"
    "\\( \\exists u\\exists v\\exists x\\exists z(P(d)\\supset \\lnot \\lnot (Q(v,g(c,c))\\supset Q(d,g(d,x)))) \\)"
    "\\( \\exists u\\exists z\\exists v\\exists y(P(d)\\supset \\lnot \\lnot (Q(y,g(c,c))\\supset Q(d,g(d,v)))) \\)"]
  :wrong [
    ["\\( \\exists u\\exists x\\exists z(P(d)\\supset \\lnot \\lnot (Q(y,g(c,c))\\supset Q(d,g(d,x)))) \\)"
     "eredetileg az y-nak nem volt szabad előfordulása, itt van"]
    ["\\( \\exists z\\exists u\\exists y(P(d)\\supset \\lnot \\lnot (Q(y,g(c,c))\\supset Q(d,g(d,x)))) \\)"
     "eredetileg az x-nek nem volt szabad előfordulása, itt van"]]}

  {:question "A felsoroltak közül melyek prenex alakjai a \\( (Q(c,x)\\lor f(x)=z)\\lor \\exists x\\forall x(P(d)\\land (\\exists yf(x)=x\\lor Q(y,d))\\supset P(d)) \\) formulának?"
  :good [
    "\\( \\forall w((Q(c,x)\\lor f(x)=z)\\lor (P(d)\\land (f(w)=w\\lor Q(y,d))\\supset P(d))) \\)"
    "\\( \\forall w\\forall u((Q(c,x)\\lor f(x)=z)\\lor (P(d)\\land (f(w)=w\\lor Q(y,d))\\supset P(d))) \\)"
    "\\( \\exists v\\forall w((Q(c,x)\\lor f(x)=z)\\lor (P(d)\\land (f(w)=w\\lor Q(y,d))\\supset P(d))) \\)"
    "\\( \\forall w\\exists v\\forall u((Q(c,x)\\lor f(x)=z)\\lor (P(d)\\land (f(w)=w\\lor Q(y,d))\\supset P(d))) \\)"]
  :wrong [
    ["\\( \\exists v\\forall y\\forall u((Q(c,x)\\lor f(x)=z)\\lor (P(d)\\land (f(x)=x\\lor Q(y,d))\\supset P(d))) \\)"
     "az eredeti formulában az y-nak volt szabad előfordulása, itt nincs"]
    ["\\( \\exists v\\forall x\\forall u((Q(c,x)\\lor f(x)=z)\\lor (P(d)\\land (f(x)=x\\lor Q(y,d))\\supset P(d))) \\)"
     "az eredeti formulában az x-nek volt szabad előfordulása, itt nincs"]]}

  {:question "A felsoroltak közül melyek prenex alakjai a \\( \\exists z\\exists y(\\lnot \\lnot \\exists z(P(c)\\supset Q(y,d))\\land \\lnot c=d) \\) formulának?"
  :good [
    "\\( \\exists u\\exists y\\exists z(\\lnot \\lnot (P(c)\\supset Q(y,d))\\land \\lnot c=d) \\)"
    "\\( \\exists u\\exists z\\exists y(\\lnot \\lnot (P(c)\\supset Q(y,d))\\land \\lnot c=d) \\)"
    "\\( \\exists u\\exists y\\exists z(\\lnot \\lnot (P(c)\\supset Q(y,d))\\land \\lnot c=d) \\)"
    "\\( \\exists y(\\lnot \\lnot (P(c)\\supset Q(y,d))\\land \\lnot c=d) \\)"]
  :wrong [
    ["\\( \\exists u\\exists z(\\lnot \\lnot (P(c)\\supset Q(y,d))\\land \\lnot c=d) \\)"
     "az eredeti formulában az y-nak nem volt szabad előfordulása, itt van"]
    ["\\( \\exists z\\exists y\\exists z(\\lnot \\lnot (P(c)\\supset Q(y,d))\\land \\lnot c=d) \\)"
     "a formula nem teljesíti a feltételeket, a kvantorai nem különbözőek"]]}

  {:question "A felsoroltak közül melyek prenex alakjai a \\( \\exists z\\forall x(\\exists y((\\lnot Q(x,c)\\lor z=d\\supset g(y,d)=g(d,y))\\supset P(g(c,y)))\\lor x=c) \\) formulának?"
  :good [
    "\\( \\exists z\\forall x\\exists y(((\\lnot Q(x,c)\\lor z=d\\supset g(y,d)=g(d,y))\\supset P(g(c,y)))\\lor x=c) \\)"
    "\\( \\exists u\\forall x\\exists y(((\\lnot Q(x,c)\\lor u=d\\supset g(y,d)=g(d,y))\\supset P(g(c,y)))\\lor x=c) \\)"
    "\\( \\exists z\\forall u\\exists y(((\\lnot Q(u,c)\\lor z=d\\supset g(y,d)=g(d,y))\\supset P(g(c,y)))\\lor u=c) \\)"]
  :wrong [
    ["\\( \\forall x\\exists y\\exists z(((\\lnot Q(x,c)\\lor z=d\\supset g(y,d)=g(d,y))\\supset P(g(c,y)))\\lor x=c) \\)"
     "a különböző típusú kvantorok felcserélése nem ekvivalens átalakítás"]
    ["\\( \\exists z\\exists y\\forall x(((\\lnot Q(x,c)\\lor z=d\\supset g(y,d)=g(d,y))\\supset P(g(c,y)))\\lor x=c) \\)"
     "a különböző típusú kvantorok felcserélése nem ekvivalens átalakítás"]
    ["\\( \\forall x\\exists z\\exists y(((\\lnot Q(x,c)\\lor z=d\\supset g(y,d)=g(d,y))\\supset P(g(c,y)))\\lor x=c) \\)"
     "a különböző típusú kvantorok felcserélése nem ekvivalens átalakítás"]
    ["\\( \\forall x\\exists y\\exists z(((\\lnot Q(x,c)\\lor z=d\\supset g(y,d)=g(d,y))\\supset P(g(c,y)))\\lor x=c) \\)"
     "a különböző típusú kvantorok felcserélése nem ekvivalens átalakítás"]
    ["\\( \\exists y\\exists z\\forall x(((\\lnot Q(x,c)\\lor z=d\\supset g(y,d)=g(d,y))\\supset P(g(c,y)))\\lor x=c) \\)"
     "a különböző típusú kvantorok felcserélése nem ekvivalens átalakítás"]]}
     
  {:question "A felsoroltak közül melyek prenex alakjai a \\( \\lnot (\\forall zQ(x,g(x,x))\\supset \\exists z\\forall x(Q(z,f(d))\\lor Q(y,z)\\supset y=c\\supset P(g(c,z)))) \\) formulának?"
  :good [
    "\\( \\forall v\\forall z\\exists u\\lnot (Q(x,g(x,x))\\supset Q(z,f(d))\\lor Q(y,z)\\supset y=c\\supset P(g(c,z))) \\)"
    "\\( \\forall z\\forall v\\exists u\\lnot (Q(x,g(x,x))\\supset Q(z,f(d))\\lor Q(y,z)\\supset y=c\\supset P(g(c,z))) \\)"
    "\\( \\forall z\\exists u\\forall v\\lnot (Q(x,g(x,x))\\supset Q(z,f(d))\\lor Q(y,z)\\supset y=c\\supset P(g(c,z))) \\)"
    "\\( \\forall z\\lnot (Q(x,g(x,x))\\supset Q(z,f(d))\\lor Q(y,z)\\supset y=c\\supset P(g(c,z))) \\)"
    "\\( \\forall z\\exists u\\lnot (Q(x,g(x,x))\\supset Q(z,f(d))\\lor Q(y,z)\\supset y=c\\supset P(g(c,z))) \\)"
    "\\( \\forall z\\forall v\\lnot (Q(x,g(x,x))\\supset Q(z,f(d))\\lor Q(y,z)\\supset y=c\\supset P(g(c,z))) \\)"]
  :wrong [
    ["\\( \\forall z\\forall v\\exists x\\lnot (Q(x,g(x,x))\\supset Q(z,f(d))\\lor Q(y,z)\\supset y=c\\supset P(g(c,z))) \\)"
     "eredetileg az x-nek volt szabad előfordulása, itt már nincs"]
    ["\\( \\forall v\\forall z\\exists y\\lnot (Q(x,g(x,x))\\supset Q(z,f(d))\\lor Q(y,z)\\supset y=c\\supset P(g(c,z))) \\)"
     "eredetileg az y-nak volt szabad előfordulása, itt már nincs"]]}

  {:question "A felsoroltak közül melyek prenex alakjai a \\( (\\forall z\\exists x(\\lnot P(d)\\lor Q(d,y)\\land P(f(g(y,y))))\\land Q(y,c))\\land \\forall zQ(c,x) \\) formulának?"
  :good [
    "\\( \\forall z\\forall u\\exists w(((\\lnot P(d)\\lor Q(d,y)\\land P(f(g(y,y))))\\land Q(y,c))\\land Q(c,x)) \\)"
    "\\( (((\\lnot P(d)\\lor Q(d,y)\\land P(f(g(y,y))))\\land Q(y,c))\\land Q(c,x)) \\)"
    "\\( \\exists w\\forall z(((\\lnot P(d)\\lor Q(d,y)\\land P(f(g(y,y))))\\land Q(y,c))\\land Q(c,x)) \\)"
    "\\( \\forall u\\exists w(((\\lnot P(d)\\lor Q(d,y)\\land P(f(g(y,y))))\\land Q(y,c))\\land Q(c,x)) \\)"
    "\\( \\forall z\\forall u(((\\lnot P(d)\\lor Q(d,y)\\land P(f(g(y,y))))\\land Q(y,c))\\land Q(c,x)) \\)"
    "\\( \\exists w(((\\lnot P(d)\\lor Q(d,y)\\land P(f(g(y,y))))\\land Q(y,c))\\land Q(c,x)) \\)"]
  :wrong [
    ["\\( \\forall z\\forall u\\exists x(((\\lnot P(d)\\lor Q(d,y)\\land P(f(g(y,y))))\\land Q(y,c))\\land Q(c,x)) \\)"
     "eredetileg az x-nek volt szabad előfordulása, itt már nincs"]
    ["\\( \\forall z\\forall y\\exists w(((\\lnot P(d)\\lor Q(d,y)\\land P(f(g(y,y))))\\land Q(y,c))\\land Q(c,x)) \\)"
     "eredetileg az y-nak volt szabad előfordulása, itt már nincs"]]}

  {:question "A felsoroltak közül melyek prenex alakjai a \\( z=d\\land \\exists y\\forall x\\forall z(Q(x,y)\\land (\\lnot Q(g(d,c),c)\\supset \\lnot y=f(c))) \\) formulának?"
  :good [
    "\\( \\exists y\\forall x(z=d\\land Q(x,y)\\land (\\lnot Q(g(d,c),c)\\supset \\lnot y=f(c))) \\)"
    "\\( \\exists y\\forall u\\forall x(z=d\\land Q(x,y)\\land (\\lnot Q(g(d,c),c)\\supset \\lnot y=f(c))) \\)"
    "\\( \\forall u\\exists y\\forall x(z=d\\land Q(x,y)\\land (\\lnot Q(g(d,c),c)\\supset \\lnot y=f(c))) \\)"
    "\\( \\exists y\\forall x\\forall v(z=d\\land Q(x,y)\\land (\\lnot Q(g(d,c),c)\\supset \\lnot y=f(c))) \\)"
    "\\( \\exists v\\forall x\\forall u(z=d\\land Q(x,v)\\land (\\lnot Q(g(d,c),c)\\supset \\lnot y=f(c))) \\)"]
  :wrong [
    ["\\( \\exists y\\forall x\\forall z(z=d\\land Q(x,y)\\land (\\lnot Q(g(d,c),c)\\supset \\lnot y=f(c))) \\)"
     "eredetileg a z-nek volt szabad előfordulása, itt már nincs"]
    ["\\( \\forall x\\exists y\\forall u(z=d\\land Q(x,y)\\land (\\lnot Q(g(d,c),c)\\supset \\lnot y=f(c))) \\)"
     "a különböző típusú kvantorok felcserélése nem ekvivalens átalakítás"]]}

  {:question "A felsoroltak közül melyek prenex alakjai a \\( \\forall y\\exists x\\forall x\\lnot (y=c\\land (P(x)\\supset x=y\\land Q(x,c)))\\supset P(x) \\) formulának?"
  :good [
    "\\( \\exists y\\forall u\\exists v(\\lnot (y=c\\land (P(v)\\supset v=y\\land Q(v,c)))\\supset P(x)) \\)"
    "\\( \\exists y\\exists v(\\lnot (y=c\\land (P(v)\\supset v=y\\land Q(v,c)))\\supset P(x)) \\)"
    "\\( \\exists v\\forall u\\exists y(\\lnot (y=c\\land (P(v)\\supset v=y\\land Q(v,c)))\\supset P(x)) \\)"
    "\\( \\exists y\\exists u(\\lnot (y=c\\land (P(u)\\supset u=y\\land Q(u,c)))\\supset P(x)) \\)"]
  :wrong [
    ["\\( \\exists y\\forall u\\exists x(\\lnot (y=c\\land (P(x)\\supset x=y\\land Q(v,c)))\\supset P(x)) \\)"
     "eredetileg az x-nek volt szabad előfordulása, itt már nincs"]
    ["\\( \\exists y\\forall u \\exists u(\\lnot (y=c\\land (P(u)\\supset u=y\\land Q(ue,c)))\\supset P(x)) \\)"
    "nem teljesíti a feltételeket, a kvantorváltozók nem különbözőek"]]}

  {:question "A felsoroltak közül melyek prenex alakjai a 
     \\( (Q(y,g(z,d))\\supset d=d\\supset d=x\\lor Q(g(z,y),g(z,y))\\lor f(x)=d)\\lor \\exists y\\exists xx=c\\land Q(x,x) \\) formulának?"
  :good [
    "\\( \\exists v\\exists u((Q(y,g(z,d))\\supset d=d\\supset d=x\\lor Q(g(z,y),g(z,y))\\lor f(x)=d)\\lor u=c\\land Q(x,x)) \\)"
    "\\( \\exists u\\exists v((Q(y,g(z,d))\\supset d=d\\supset d=x\\lor Q(g(z,y),g(z,y))\\lor f(x)=d)\\lor u=c\\land Q(x,x)) \\)"
    "\\( \\exists u((Q(y,g(z,d))\\supset d=d\\supset d=x\\lor Q(g(z,y),g(z,y))\\lor f(x)=d)\\lor u=c\\land Q(x,x)) \\)"
    "\\( \\exists v((Q(y,g(z,d))\\supset d=d\\supset d=x\\lor Q(g(z,y),g(z,y))\\lor f(x)=d)\\lor v=c\\land Q(x,x)) \\)"]
  :wrong [
    ["\\( \\exists v\\exists x((Q(y,g(z,d))\\supset d=d\\supset d=x\\lor Q(g(z,y),g(z,y))\\lor f(x)=d)\\lor x=c\\land Q(x,x)) \\)"
     "az eredeti formulában x-nek volt szabad előfordulása, itt nincs"]
    ["\\( \\exists y\\exists u((Q(y,g(z,d))\\supset d=d\\supset d=x\\lor Q(g(z,y),g(z,y))\\lor f(x)=d)\\lor u=c\\land Q(x,x)) \\)"
     "az eredeti formulában y-nak volt szabad előfordulása, itt nincs"]
    ["\\( \\exists y\\exists x((Q(y,g(z,d))\\supset d=d\\supset d=x\\lor Q(g(z,y),g(z,y))\\lor f(x)=d)\\lor x=c\\land Q(x,x)) \\)"
     "az eredeti formulában y-nak és x-nek is volt szabad előfordulása, itt egyiknek nincs"]]}]