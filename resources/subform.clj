[ {:question "A felsoroltak közül melyek részformulái a \\( (p\\equiv (((p\\lor p)\\supset p)\\land ((q\\land (r\\lor p))\\land p))) \\) formulának?"
  :good [
    "\\( p \\)"
    "\\( (p\\equiv (((p\\lor p)\\supset p)\\land ((q\\land (r\\lor p))\\land p))) \\)"
    "\\( (((p\\lor p)\\supset p)\\land ((q\\land (r\\lor p))\\land p)) \\)"
    "\\( q \\)"
    "\\( ((q\\land (r\\lor p))\\land p) \\)"
    "\\( r \\)"
    "\\( (r\\lor p) \\)"]
  :wrong [
    ["\\( (p\\lor p)\\supset p) \\)" "nem formula, a zárójelek nincsenek párban"]
    ["\\( ((r\\lor p)\\land q) \\)" "mások a konjunkciók kötési viszonyai"]
    ["\\( (p\\land p) \\)" "diszjunkcióval szerepel konjunkció helyett"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (\\lnot r\\equiv ((\\lnot q\\equiv p)\\land ((r\\supset r)\\land q))) \\) formulának?"
  :good [
    "\\( \\lnot q \\)"
    "\\( q \\)"
    "\\( p \\)"
    "\\( (\\lnot r\\equiv ((\\lnot q\\equiv p)\\land ((r\\supset r)\\land q))) \\)"
    "\\( ((r\\supset r)\\land q) \\)"
    "\\( r \\)"
    "\\( ((\\lnot q\\equiv p)\\land ((r\\supset r)\\land q)) \\)"
    "\\( \\lnot r \\)"
    "\\( (\\lnot q\\equiv p) \\)"]
  :wrong [
    ["\\( (r\\subset r) \\)" "ez nem formula, helytelen az implikáció jele"]
    ["\\( (\\lnot r\\equiv ((q\\equiv p)\\land ((r\\supset r)\\land q))) \\)" "egy tagadással kevesebb, mint az eredeti formula"]
    ["\\( (q\\equiv p) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"] 
    ["\\( ((\\lnot q\\equiv p)\\land (r\\supset r)) \\)" "mások a konjunkciók kötési viszonyai"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot (\\lnot \\lnot q\\supset (\\lnot p\\land \\lnot r)) \\) formulának?"
  :good [
    "\\( \\lnot q \\)"
    "\\( q \\)"
    "\\( p \\)"
    "\\( (\\lnot \\lnot q\\supset (\\lnot p\\land \\lnot r)) \\)"
    "\\( \\lnot \\lnot q \\)"
    "\\( (\\lnot p\\land \\lnot r) \\)"
    "\\( r \\)"
    "\\( \\lnot r \\)"
    "\\( \\lnot p \\)"
    "\\( \\lnot (\\lnot \\lnot q\\supset (\\lnot p\\land \\lnot r)) \\)"]
  :wrong [
    ["\\( (\\lnot q\\supset (\\lnot p\\land \\lnot r)) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]
    ["\\( (p\\land \\lnot r) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]
    ["\\( (\\lnot p\\land r) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (\\lnot \\lnot (p\\lor \\lnot (p\\equiv r))\\equiv (r\\lor p)) \\) formulának?"
  :good [
    "\\( (p\\lor \\lnot (p\\equiv r)) \\)"
    "\\( (r\\lor p) \\)"
    "\\( p \\)"
    "\\( (p\\equiv r) \\)"
    "\\( \\lnot (p\\lor \\lnot (p\\equiv r)) \\)"
    "\\( \\lnot (p\\equiv r) \\)"
    "\\( \\lnot \\lnot (p\\lor \\lnot (p\\equiv r)) \\)"
    "\\( (\\lnot \\lnot (p\\lor \\lnot (p\\equiv r))\\equiv (r\\lor p)) \\)"
    "\\( r \\)"]
  :wrong [
    ["\\( q\\)" "egyáltalán nem szerepel az eredeti formulában"]
    ["\\( (p\\lor (p\\equiv r)) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]
    ["\\( (p\\not\\equiv r) \\)" "Ilyen logikai konstans nincs!"]
    ["\\( (\\lnot \\lnot (p\\lor \\lnot p\\equiv r)\\equiv (r\\lor p)) \\)" "kevés a zárójel, nem formula"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot \\lnot (q\\supset ((r\\supset (r\\equiv r))\\supset (p\\lor p))) \\) formulának?"
  :good [
    "\\( (r\\supset (r\\equiv r)) \\)"
    "\\( \\lnot \\lnot (q\\supset ((r\\supset (r\\equiv r))\\supset (p\\lor p))) \\)"
    "\\( ((r\\supset (r\\equiv r))\\supset (p\\lor p)) \\)"
    "\\( q \\)"
    "\\( p \\)"
    "\\( (q\\supset ((r\\supset (r\\equiv r))\\supset (p\\lor p))) \\)"
    "\\( \\lnot (q\\supset ((r\\supset (r\\equiv r))\\supset (p\\lor p))) \\)"
    "\\( (p\\lor p) \\)"
    "\\( r \\)"
    "\\( (r\\equiv r) \\)"]
  :wrong [
    ["\\( ((r\\supset r)\\equiv r) \\)" "más sorrendben vannak a zárójelek az eredeti formulában"]
    ["\\( \\lnot (q\\supset (r\\supset (r\\equiv r))\\supset (p\\lor p))) \\)" "kevés a zárójel, nem formula"]
    ["\\( (r\\supset (r\\equiv r)\\supset (p\\lor p)) \\)" "kevés a zárójel, nem formula"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((\\lnot ((q\\land q)\\equiv q)\\land q)\\supset ((r\\lor q)\\lor q)) \\) formulának?"
  :good [
    "\\( q \\)"
    "\\( (\\lnot ((q\\land q)\\equiv q)\\land q) \\)"
    "\\( ((r\\lor q)\\lor q) \\)"
    "\\( ((\\lnot ((q\\land q)\\equiv q)\\land q)\\supset ((r\\lor q)\\lor q)) \\)"
    "\\( (q\\land q) \\)"
    "\\( r \\)"
    "\\( (r\\lor q) \\)"
    "\\( \\lnot ((q\\land q)\\equiv q) \\)"
    "\\( ((q\\land q)\\equiv q) \\)"]
  :wrong [
    ["\\( (r\\lor q\\lor q) \\)" "kevés a zárójel, nem formula"]
    ["\\( (((q\\land q)\\equiv q)\\land q) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]
    ["\\( (q\\lor q) \\)" "ilyen része nincs a formulának"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((\\lnot (r\\supset q)\\lor (q\\equiv r))\\supset (r\\supset \\lnot r)) \\) formulának?"
  :good [
    "\\( (r\\supset q) \\)"
    "\\( q \\)"
    "\\( ((\\lnot (r\\supset q)\\lor (q\\equiv r))\\supset (r\\supset \\lnot r)) \\)"
    "\\( (r\\supset \\lnot r) \\)"
    "\\( \\lnot (r\\supset q) \\)"
    "\\( (\\lnot (r\\supset q)\\lor (q\\equiv r)) \\)"
    "\\( r \\)"
    "\\( \\lnot r \\)"
    "\\( (q\\equiv r) \\)"]
  :wrong [
    ["\\( (q\\supset r) \\)" "ilyen része nincs a formulának"]
    ["\\( ((r\\supset q)\\lor (q\\equiv r)) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]
    ["\\( (r\\equiv q) \\)" "ilyen része nincs a formulának"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot (((r\\lor q)\\lor (p\\equiv r))\\supset (q\\land (q\\land r))) \\) formulának?"
  :good [
    "\\( q \\)"
    "\\( \\lnot (((r\\lor q)\\lor (p\\equiv r))\\supset (q\\land (q\\land r))) \\)"
    "\\( p \\)"
    "\\( (q\\land (q\\land r)) \\)"
    "\\( (p\\equiv r) \\)"
    "\\( (q\\land r) \\)"
    "\\( ((r\\lor q)\\lor (p\\equiv r)) \\)"
    "\\( r \\)"
    "\\( (r\\lor q) \\)"
    "\\( (((r\\lor q)\\lor (p\\equiv r))\\supset (q\\land (q\\land r))) \\)"]
  :wrong [
    ["\\( ((q\\land q)\\land r)) \\)" "nem ez a zárójelek sorrendje"]
    ["\\( (r\\land q) \\)" "más a nemlogikai konstansok sorrendje"]
    ["\\( (r\\lor (q\\lor (p\\equiv r))) \\)" "nem ez a zárójelek sorrendje"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((r\\lor (r\\equiv (q\\lor ((r\\land r)\\equiv p))))\\supset (r\\supset q)) \\) formulának?"
  :good [
    "\\( p \\)"
    "\\( q \\)"
    "\\( (q\\lor ((r\\land r)\\equiv p)) \\)"
    "\\( r \\)"
    "\\( (r\\equiv (q\\lor ((r\\land r)\\equiv p))) \\)"
    "\\( (r\\land r) \\)"
    "\\( ((r\\land r)\\equiv p) \\)"
    "\\( (r\\lor (r\\equiv (q\\lor ((r\\land r)\\equiv p)))) \\)"
    "\\( ((r\\lor (r\\equiv (q\\lor ((r\\land r)\\equiv p))))\\supset (r\\supset q)) \\)"
    "\\( (r\\supset q) \\)"]
  :wrong [
    ["\\( (((r\\lor (r\\equiv (q\\lor ((r\\land r)\\equiv p))))\\supset r)\\supset q) \\)" "nem ez a zárójelek sorrendje"]
    ["\\( (r\\land (r\\equiv p)) \\)" "nem ez a zárójelek sorrendje"]
    ["\\( (r\\lor (r\\equiv (q\\lor ((r\\land r)\\equiv p))) \\)" "nem formula, nincsenek párban a zárójelek"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot (((r\\equiv (r\\equiv p))\\lor ((q\\lor p)\\lor p))\\lor r) \\) formulának?"
  :good [
    "\\( \\lnot (((r\\equiv (r\\equiv p))\\lor ((q\\lor p)\\lor p))\\lor r) \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( (q\\lor p) \\)"
    "\\( ((q\\lor p)\\lor p) \\)"
    "\\( r \\)"
    "\\( (r\\equiv p) \\)"
    "\\( (r\\equiv (r\\equiv p)) \\)"
    "\\( ((r\\equiv (r\\equiv p))\\lor ((q\\lor p)\\lor p)) \\)"
    "\\( (((r\\equiv (r\\equiv p))\\lor ((q\\lor p)\\lor p))\\lor r) \\)"]
  :wrong [
    ["\\( ((r\\equiv r)\\equiv p) \\)" "nem ez a zárójelek sorrendje"]
    ["\\( (((r\\equiv (r\\equiv p))\\lor (q\\lor p))\\lor p) \\)"  "nem ez a zárójelek sorrendje"]
    ["\\( \\lnot (r\\equiv (r\\equiv p)) \\)" "nem bontható fel a zárójel, ha előtte negáció található"]
    ["\\( (p\\equiv r) \\)" "nem ez a nemlogikai konstansok sorrendje"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((((r\\supset p)\\land \\lnot (r\\equiv r))\\land q)\\land (q\\lor r)) \\) formulának?"
  :good [
    "\\( \\lnot (r\\equiv r) \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( (q\\lor r) \\)"
    "\\( r \\)"
    "\\( (r\\equiv r) \\)"
    "\\( (r\\supset p) \\)"
    "\\( ((r\\supset p)\\land \\lnot (r\\equiv r)) \\)"
    "\\( (((r\\supset p)\\land \\lnot (r\\equiv r))\\land q) \\)"
    "\\( ((((r\\supset p)\\land \\lnot (r\\equiv r))\\land q)\\land (q\\lor r)) \\)"]
  :wrong [
    ["\\( \\lnot r \\)" "nem bontható fel a zárójel, ha előtte negáció található"]
    ["\\( ((r\\supset p)\\land (r\\equiv r)) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]
    ["\\(  ((\\lnot (r\\equiv r)\\land q)\\land (q\\lor r)) \\)" "mások a konjunkciók kötési viszonyai"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (((p\\land ((r\\equiv p)\\land r))\\land (p\\land p))\\equiv (p\\equiv r)) \\) formulának?"
  :good [
    "\\( p \\)"
    "\\( (p\\equiv r) \\)"
    "\\( (p\\land p) \\)"
    "\\( (p\\land ((r\\equiv p)\\land r)) \\)"
    "\\( ((p\\land ((r\\equiv p)\\land r))\\land (p\\land p)) \\)"
    "\\( (((p\\land ((r\\equiv p)\\land r))\\land (p\\land p))\\equiv (p\\equiv r)) \\)"
    "\\( r \\)"
    "\\( (r\\equiv p) \\)"
    "\\( ((r\\equiv p)\\land r) \\)"]
  :wrong [
    ["\\( (((r\\equiv p)\\land r)\\land p) \\)"  "mások a konjunkciók kötési viszonyai"]
    ["\\( (p\\equiv (p\\equiv r)) \\)" "mások az ekvivalenciák kötési viszonyai az eredeti formula végén"]
    ["\\( ((p\\land (r\\equiv p))\\land r) \\)"  "mások a konjunkciók kötési viszonyai"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((q\\equiv q)\\land (\\lnot (\\lnot (p\\supset r)\\lor p)\\lor p)) \\) formulának?"
  :good [
    "\\( \\lnot (\\lnot (p\\supset r)\\lor p) \\)"
    "\\( (\\lnot (\\lnot (p\\supset r)\\lor p)\\lor p) \\)"
    "\\( \\lnot (p\\supset r) \\)"
    "\\( (\\lnot (p\\supset r)\\lor p) \\)"
    "\\( p \\)"
    "\\( (p\\supset r) \\)"
    "\\( q \\)"
    "\\( (q\\equiv q) \\)"
    "\\( ((q\\equiv q)\\land (\\lnot (\\lnot (p\\supset r)\\lor p)\\lor p)) \\)"
    "\\( r \\)"]
  :wrong [
    ["\\( (\\lnot ((p\\supset r)\\lor p)\\lor p) \\)" "nem bontható fel a zárójel, ha előtte negáció található"]
    ["\\( (\\lnot (\\lnot (p\\supset r)\\lor (p\\lor p))) \\)" "mások a diszjunkciók kötési viszonyai"]
    ["\\( (\\lnot (\\lnot p\\supset r)\\lor p) \\)" "a negáció másképp helyezkedett el eredetileg"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot (((p\\lor r)\\lor q)\\lor ((\\lnot r\\lor p)\\land q)) \\) formulának?"
  :good [
    "\\( \\lnot (((p\\lor r)\\lor q)\\lor ((\\lnot r\\lor p)\\land q)) \\)"
    "\\( \\lnot r \\)"
    "\\( (\\lnot r\\lor p) \\)"
    "\\( ((\\lnot r\\lor p)\\land q) \\)"
    "\\( p \\)"
    "\\( (p\\lor r) \\)"
    "\\( ((p\\lor r)\\lor q) \\)"
    "\\( (((p\\lor r)\\lor q)\\lor ((\\lnot r\\lor p)\\land q)) \\)"
    "\\( q \\)"
    "\\( r \\)"]
  :wrong [
    ["\\( \\lnot (p\\lor r) \\)" "ez így nem szerepel a formulában"]
    ["\\( \\lnot (r\\lor p) \\)" "a zárójel és a negáció felcserélődött az eredetihez képest"]
    ["\\( ((r\\lor p)\\land q) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((q\\equiv ((r\\equiv \\lnot r)\\equiv p))\\equiv \\lnot (p\\lor p)) \\) formulának?"
  :good [
    "\\( \\lnot (p\\lor p) \\)"
    "\\( \\lnot r \\)"
    "\\( p \\)"
    "\\( (p\\lor p) \\)"
    "\\( q \\)"
    "\\( (q\\equiv ((r\\equiv \\lnot r)\\equiv p)) \\)"
    "\\( ((q\\equiv ((r\\equiv \\lnot r)\\equiv p))\\equiv \\lnot (p\\lor p)) \\)"
    "\\( r \\)"
    "\\( (r\\equiv \\lnot r) \\)"
    "\\( ((r\\equiv \\lnot r)\\equiv p) \\)"]
  :wrong [
    ["\\( (\\lnot p\\lor p) \\)" "a zárójel és a negáció felcserélődött az eredetihez képest"]
    ["\\( ((q\\equiv (r\\equiv \\lnot r))\\equiv p) \\)" "mások az ekvivalenciák kötési viszonyai"]
    ["\\( (q\\equiv ((r\\equiv r)\\equiv p)) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (\\lnot q\\land (\\lnot (r\\supset q)\\equiv (q\\equiv \\lnot p))) \\) formulának?"
  :good [
    "\\( \\lnot p \\)"
    "\\( \\lnot q \\)"
    "\\( (\\lnot q\\land (\\lnot (r\\supset q)\\equiv (q\\equiv \\lnot p))) \\)"
    "\\( \\lnot (r\\supset q) \\)"
    "\\( (\\lnot (r\\supset q)\\equiv (q\\equiv \\lnot p)) \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( r \\)"
    "\\( (r\\supset q) \\)"]
  :wrong [
    ["\\( (\\lnot r\\supset q) \\)" "a zárójel és a negáció felcserélődött az eredetihez képest"]
    ["\\( \\lnot ((r\\supset q)\\equiv (q\\equiv \\lnot p)) \\)" "a zárójel és a negáció felcserélődött az eredetihez képest"]
    ["\\( (q\\equiv p) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]
    ["\\( ((r\\supset q)\\equiv (q\\equiv \\lnot p)) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (((q\\supset \\lnot r)\\lor ((r\\lor r)\\equiv \\lnot p))\\equiv q) \\) formulának?"
  :good [
    "\\( \\lnot p \\)"
    "\\( \\lnot r \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( (q\\supset \\lnot r) \\)"
    "\\( ((q\\supset \\lnot r)\\lor ((r\\lor r)\\equiv \\lnot p)) \\)"
    "\\( (((q\\supset \\lnot r)\\lor ((r\\lor r)\\equiv \\lnot p))\\equiv q) \\)"
    "\\( r \\)"
    "\\( (r\\lor r) \\)"
    "\\( ((r\\lor r)\\equiv \\lnot p) \\)"]
  :wrong [
    ["\\( (q\\supset r) \\)" "a negáció csak zárójel vagy nemlogikai konstans elől vehető le, nem pedig zárójelen belül"]
    ["\\( (\\lnot r \\lor (r\\lor r)) \\)" "mások a diszjunkciók kötési viszonyai"]
    ["\\( ((r\\lor r)\\equiv (\\lnot p\\equiv q)) \\)" "mások az ekvivalenciák kötési viszonyai"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot ((((r\\land r)\\equiv r)\\supset (p\\land q))\\equiv (r\\equiv r)) \\) formulának?"
  :good [
    "\\( \\lnot ((((r\\land r)\\equiv r)\\supset (p\\land q))\\equiv (r\\equiv r)) \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( r \\)"
    "\\( (r\\equiv r) \\)"
    "\\( (r\\land r) \\)"
    "\\( ((r\\land r)\\equiv r) \\)"]
  :wrong [
    ["\\( (q\\land q) \\)" "\\(q\\) szerepel \\(p\\) helyett"]
    ["\\( (((r\\land r)\\equiv r)\\supset (q\\land q)) \\)" "\\(q\\) szerepel \\(p\\) helyett"]
    ["\\( ((((r\\land r)\\equiv r)\\supset (q\\land q))\\equiv (r\\equiv r)) \\)" "\\(q\\) szerepel \\(p\\) helyett"]
    ["\\( \\lnot (((r\\land r)\\equiv r)\\supset (p\\land q)) \\)" "a zárójel és a negáció felcserélődött az eredetihez képest"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (q\\equiv ((\\lnot r\\land (p\\supset r))\\equiv (r\\land (r\\land p)))) \\) formulának?"
  :good [
    "\\( \\lnot r \\)"
    "\\( (\\lnot r\\land (p\\supset r)) \\)"
    "\\( ((\\lnot r\\land (p\\supset r))\\equiv (r\\land (r\\land p))) \\)"
    "\\( p \\)"
    "\\( (q\\equiv ((\\lnot r\\land (p\\supset r))\\equiv (r\\land (r\\land p)))) \\)"
    "\\( (p\\supset r) \\)"
    "\\( r \\)"
    "\\( (r\\land p) \\)"
    "\\( (r\\land (r\\land p)) \\)"]
  :wrong [
    ["\\( (p\\equiv ((\\lnot r\\land (p\\supset r))\\equiv (r\\land (r\\land p)))) \\)" "\\(p\\) szerepel \\(q\\) helyett"]
    ["\\( (q\\equiv (\\lnot r\\land (p\\supset r))) \\)" "mások az ekvivalenciák kötési viszonyai az eredeti formulában"]
    ["\\( ((r\\land r)\\land p) \\)" "mások a konjunkciók kötési viszonyai"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((q\\equiv (p\\supset p))\\land ((q\\equiv (p\\lor q))\\equiv (p\\lor q))) \\) formulának?"
  :good [
    "\\( (p\\supset p) \\)"
    "\\( q \\)"
    "\\( p \\)"
    "\\( (q\\equiv (p\\supset p)) \\)"
    "\\( ((q\\equiv (p\\lor q))\\equiv (p\\lor q)) \\)"
    "\\( (p\\lor q) \\)"
    "\\( ((q\\equiv (p\\supset p))\\land ((q\\equiv (p\\lor q))\\equiv (p\\lor q))) \\)"
    "\\( (q\\equiv (p\\lor q)) \\)"]
  :wrong [
    ["\\( r \\)" "egyáltalán nem szerepel"]
    ["\\( (q\\equiv ((p\\lor q)\\equiv (p\\lor q))) \\)" "mások az ekvivalenciák kötési viszonyai"]
    ["\\( (p\\equiv (p\\supset q)) \\)" "a \\(p\\) és \\(q\\) nemlogikai konstansok felcserélődtek"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot \\lnot ((p\\equiv ((r\\supset p)\\equiv q))\\lor (r\\lor p)) \\) formulának?"
  :good [
    "\\( \\lnot \\lnot ((p\\equiv ((r\\supset p)\\equiv q))\\lor (r\\lor p)) \\)"
    "\\( \\lnot ((p\\equiv ((r\\supset p)\\equiv q))\\lor (r\\lor p)) \\)"
    "\\( p \\)"
    "\\( (p\\equiv ((r\\supset p)\\equiv q)) \\)"
    "\\( ((p\\equiv ((r\\supset p)\\equiv q))\\lor (r\\lor p)) \\)"
    "\\( q \\)"
    "\\( r \\)"
    "\\( (r\\lor p) \\)"
    "\\( (r\\supset p) \\)"
    "\\( ((r\\supset p)\\equiv q) \\)"
  ]
  :wrong [
    ["\\( ((p\\equiv (r\\supset p))\\equiv q) \\)" "mások az ekvivalenciák kötési viszonyai"]
    ["\\( (q\\lor (r\\lor p)) \\)" "mások a diszjunkciók kötési viszonyai"]
    ["\\( \\lnot ((p\\equiv ((r\\supset p)\\equiv q))) \\)" "a negáció mögött álló zárójelet nem lehet felbontani"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (\\lnot ((q\\supset q)\\supset (q\\lor p))\\supset (r\\lor (p\\land q))) \\) formulának?"
  :good [
    "\\( \\lnot ((q\\supset q)\\supset (q\\lor p)) \\)"
    "\\( (\\lnot ((q\\supset q)\\supset (q\\lor p))\\supset (r\\lor (p\\land q))) \\)"
    "\\( p \\)"
    "\\( (p\\land q) \\)"
    "\\( q \\)"
    "\\( (q\\lor p) \\)"
    "\\( (q\\supset q) \\)"
    "\\( ((q\\supset q)\\supset (q\\lor p)) \\)"
    "\\( r \\)"
    "\\( (r\\lor (p\\land q)) \\)"]
  :wrong [
    ["\\( \\lnot (q\\supset q) \\)" "a negáció mögött álló zárójelet nem lehet felbontani"]
    ["\\( (\\lnot (q\\supset q)\\supset (q\\lor p)) \\)" "a negáció és a zárójel helyet cserélt"]
    ["\\( ((q\\supset q)\\supset q)\\lor p)) \\)" "mások az implikációk kötési viszonyai"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot ((\\lnot \\lnot q\\supset r)\\supset ((p\\land p)\\lor q)) \\) formulának?"
  :good [
    "\\( \\lnot ((\\lnot \\lnot q\\supset r)\\supset ((p\\land p)\\lor q)) \\)"
    "\\( \\lnot \\lnot q \\)"
    "\\( (\\lnot \\lnot q\\supset r) \\)"
    "\\( ((\\lnot \\lnot q\\supset r)\\supset ((p\\land p)\\lor q)) \\)"
    "\\( \\lnot q \\)"
    "\\( p \\)"
    "\\( (p\\land p) \\)"
    "\\( ((p\\land p)\\lor q) \\)"
    "\\( q \\)"
    "\\( r \\)"]
  :wrong [
    ["\\( (\\lnot q\\supset r) \\)" "zárójelben nem törölhető a tagadás"]
    ["\\( (\\lnot (\\lnot \\lnot q\\supset r)\\supset ((p\\land p)\\lor q)) \\)" "a negáció és a zárójel helyet cserélt"]
    ["\\( ((\\lnot \\lnot q\\supset r)\\supset (p\\land p)) \\)" "más volt eredetileg a zárójelezés"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((\\lnot r\\lor r)\\land ((r\\lor p)\\land (r\\equiv (q\\land p)))) \\) formulának?"
  :good [
    "\\( \\lnot r \\)"
    "\\( (\\lnot r\\lor r) \\)"
    "\\( ((\\lnot r\\lor r)\\land ((r\\lor p)\\land (r\\equiv (q\\land p)))) \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( (q\\land p) \\)"
    "\\( r \\)"
    "\\( (r\\equiv (q\\land p)) \\)"
    "\\( (r\\lor p) \\)"
    "\\( ((r\\lor p)\\land (r\\equiv (q\\land p))) \\)"]
  :wrong [
    ["\\( (r\\lor r) \\)" "zárójelben nem törölhető a negáció"]
    ["\\( (r\\equiv q) \\)" "más volt eredetileg a zárójelezés"]
    ["\\( ((\\lnot r\\lor r)\\land (r\\lor p)) \\)" "mások a konjunkciók kötési viszonyai"]]} ]

