[{:question "A felsoroltak közül melyek részformulái a \\( \\lnot (r\\lor \\lnot \\lnot (p\\equiv p\\lor \\lnot p)) \\) formulának?"
  :feedback "Az eredeti formula \\( \\lnot (r\\lor \\lnot \\lnot (p\\equiv (p\\lor \\lnot p)))\\) "
  :good [
    "\\( \\lnot \\lnot (p\\equiv p\\lor \\lnot p) \\)"
    "\\( \\lnot p \\)"
    "\\( \\lnot (p\\equiv p\\lor \\lnot p) \\)"
    "\\( \\lnot (r\\lor \\lnot \\lnot (p\\equiv p\\lor \\lnot p)) \\)"
    "\\( p \\)"
    "\\( p\\equiv p\\lor \\lnot p \\)"
    "\\( p\\lor \\lnot p \\)"
    "\\( r \\)"
    "\\( r\\lor \\lnot \\lnot (p\\equiv p\\lor \\lnot p) \\)"  ]
  :wrong [
    ["\\( p\\equiv p \\)" "a diszjunkció erősebb, mint az ekvivalencia"]
    ["\\( \\lnot p\\equiv p\\lor \\lnot p \\)" "a tagadás miatt nem törölhető a zárójel"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (p\\land (q\\supset (q\\equiv p)))\\land r\\equiv r\\land \\lnot r \\) formulának?"
  :feedback "Az eredeti formula \\( (((p\\land (q\\supset (q\\equiv p)))\\land r)\\equiv (r\\land \\lnot r))\\) "
  :good [
    "\\( \\lnot r \\)"
    "\\( p \\)"
    "\\( p\\land (q\\supset (q\\equiv p)) \\)"
    "\\( (p\\land (q\\supset (q\\equiv p)))\\land r \\)"
    "\\( (p\\land (q\\supset (q\\equiv p)))\\land r\\equiv r\\land \\lnot r \\)"
    "\\( q \\)"
    "\\( q\\equiv p \\)"
    "\\( q\\supset (q\\equiv p) \\)"
    "\\( r \\)"
    "\\( r\\land \\lnot r \\)"]
  :wrong [
    ["\\( r\\equiv r \\)" "a konjunkció erősebb mint az ekvivalencia"]
    ["\\( q\\supset q\\equiv p \\)" "az ekvivalencia gyengébb, mint az implikáció, ezért nem törölhető a zárójel"]
    ["\\( p\\land q \\)" "az implikáció gyengébb mint a konjunkció, ezért nem törölhető a zárójel"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (p\\land q)\\land (p\\land p\\land r\\lor (\\lnot q\\equiv q)) \\) formulának?"
  :feedback "Az eredeti formula \\( ((p\\land q)\\land ((p\\land (p\\land r))\\lor (\\lnot q\\equiv q)))\\) "
  :good [
    "\\( \\lnot q \\)"
    "\\( q \\)"
    "\\( p \\)"
    "\\( p\\land q \\)"
    "\\( p\\land p\\land r \\)"
    "\\( p\\land p\\land r\\lor (\\lnot q\\equiv q) \\)"
    "\\( (p\\land q)\\land (p\\land p\\land r\\lor (\\lnot q\\equiv q)) \\)"
    "\\( p\\land r \\)"
    "\\( \\lnot q\\equiv q \\)"
    "\\( r \\)"]
  :wrong [
    ["\\( p\\land p \\)" "a jobb oldali művelet erősebben köt az azonos műveletek közül"]
    ["\\( q\\equiv q \\)" "a tagadás erősebb mint az ekvivalencia"]
    ["\\( q\\land p \\)" "részformuláknál nem számít az asszociativitás"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (\\lnot (p\\land r)\\supset r\\supset r\\lor q)\\lor \\lnot p \\) formulának?"
  :feedback "Az eredeti formula \\( ((\\lnot (p\\land r)\\supset (r\\supset (r\\lor q)))\\lor \\lnot p)\\) "
  :good [
    "\\( \\lnot p \\)"
    "\\( \\lnot (p\\land r) \\)"
    "\\( \\lnot (p\\land r)\\supset r\\supset r\\lor q \\)"
    "\\( (\\lnot (p\\land r)\\supset r\\supset r\\lor q)\\lor \\lnot p \\)"
    "\\( p \\)"
    "\\( p\\land r \\)"
    "\\( q \\)"
    "\\( r \\)"
    "\\( r\\lor q \\)"
    "\\( r\\supset r\\lor q \\)"]
  :wrong [
    ["\\( r\\supset r\\)" "a diszjunkció erősebb, mint az implikáció"]
    ["\\( q\\lor\\lnot p\\)" "a zárójelben gyengébb művelet szerepel, ezért nem törölhető"]
    ["\\( \\lnot p\\land r \\)" "a konjunkció gyengébb, mint a negáció, ezért nem törölhető a zárójel"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot (p\\equiv p)\\land ((r\\supset \\lnot q)\\lor (q\\supset p)) \\) formulának?"
  :feedback "Az eredeti formula \\( (\\lnot (p\\equiv p)\\land ((r\\supset \\lnot q)\\lor (q\\supset p)))\\) "
  :good [
    "\\( \\lnot (p\\equiv p) \\)"
    "\\( \\lnot (p\\equiv p)\\land ((r\\supset \\lnot q)\\lor (q\\supset p)) \\)"
    "\\( \\lnot q \\)"
    "\\( p \\)"
    "\\( p\\equiv p \\)"
    "\\( q \\)"
    "\\( q\\supset p \\)"
    "\\( r \\)"
    "\\( r\\supset \\lnot q \\)"
    "\\( (r\\supset \\lnot q)\\lor (q\\supset p) \\)"]
  :wrong [
    ["\\( \\lnot p\\equiv p \\)" "az ekvivalencia gyengébb mint a negáció, nem törölhető a zárójel"]
    ["\\( \\lnot q\\lor q\\supset p \\)" "az implikáció gyengébb, mint a diszjunkció, ezért nem törölhetőek a zárójelek"]
    ["\\( q\\lor q\\supset p \\)" "az implikáció gyengébb, mint a diszjunkció, ezért nem törölhetőek a zárójelek"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (q\\supset q)\\lor (p\\supset r)\\supset \\lnot \\lnot p\\lor r \\) formulának?"
  :feedback "Az eredeti formula \\( (((q\\supset q)\\lor (p\\supset r))\\supset (\\lnot \\lnot p\\lor r))\\) "
  :good [
    "\\( \\lnot \\lnot p \\)"
    "\\( \\lnot \\lnot p\\lor r \\)"
    "\\( \\lnot p \\)"
    "\\( p \\)"
    "\\( p\\supset r \\)"
    "\\( q \\)"
    "\\( q\\supset q \\)"
    "\\( (q\\supset q)\\lor (p\\supset r) \\)"
    "\\( (q\\supset q)\\lor (p\\supset r)\\supset \\lnot \\lnot p\\lor r \\)"
    "\\( r \\)"]
  :wrong [
    ["\\( p\\supset r\\supset \\lnot \\lnot p \\)" "az azonos műveleti jelek közül a jobboldali köt erősebben, ezért nem törölhető a zárójel"]
    ["\\( q\\supset q\\lor p\\supset r \\)" "az implikáció gyengébb, mint a diszjunkció, ezért nem törölhetőek a zárójelek"]
    ["\\( p\\lor r \\)" "a diszjunkció gyengébb, mint a negáció"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((q\\supset r\\equiv r\\equiv r\\lor r)\\land \\lnot r)\\land r \\) formulának?"
  :feedback "Az eredeti formula \\( ((((q\\supset r)\\equiv (r\\equiv (r\\lor r)))\\land \\lnot r)\\land r)\\) "
  :good [
    "\\( \\lnot r \\)"
    "\\( q \\)"
    "\\( q\\supset r \\)"
    "\\( q\\supset r\\equiv r\\equiv r\\lor r \\)"
    "\\( (q\\supset r\\equiv r\\equiv r\\lor r)\\land \\lnot r \\)"
    "\\( ((q\\supset r\\equiv r\\equiv r\\lor r)\\land \\lnot r)\\land r \\)"
    "\\( r \\)"
    "\\( r\\equiv r\\lor r \\)"
    "\\( r\\lor r \\)"]
  :wrong [
    ["\\( r\\land r \\)" "a negáció erősebb mint a konjunkció"]
    ["\\( \\lnot r\\land r \\)" "ugyanolyan műveletek közül a jobb oldali köt erősebben, ezért nem törölhető a zárójel"]
    ["\\( q \\supset r\\equiv r \\)" "a diszjunkció erősebb mint az ekvivalencia"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( ((q\\equiv q)\\lor r)\\lor (r\\equiv q\\land (q\\lor p\\land q)) \\) formulának?"
  :feedback "Az eredeti formula \\( (((q\\equiv q)\\lor r)\\lor (r\\equiv (q\\land (q\\lor (p\\land q)))))\\) "
  :good [
    "\\( p \\)"
    "\\( p\\land q \\)"
    "\\( q \\)"
    "\\( q\\equiv q \\)"
    "\\( (q\\equiv q)\\lor r \\)"
    "\\( ((q\\equiv q)\\lor r)\\lor (r\\equiv q\\land (q\\lor p\\land q)) \\)"
    "\\( q\\land (q\\lor p\\land q) \\)"
    "\\( q\\lor p\\land q \\)"
    "\\( r \\)"
    "\\( r\\equiv q\\land (q\\lor p\\land q) \\)"]
  :wrong [
    ["\\( r\\equiv q \\)" "a konjunkció erősebben köt, mint az ekvivalencia"]
    ["\\( r\\equiv q \\land q\\)" "a diszjunkció gyengébb mint a konjunkció, ezért nem törölhető a zárójel"]
    ["\\( q\\equiv q\\lor r \\)" "az ekvivalencia gyengébb, mint a diszjunkció, ezért nem törölhető a zárójel"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( r\\lor q\\supset ((r\\equiv \\lnot r\\land r)\\equiv q\\supset q) \\) formulának?"
  :feedback "Az eredeti formula \\( ((r\\lor q)\\supset ((r\\equiv (\\lnot r\\land r))\\equiv (q\\supset q)))\\) "
  :good [
    "\\( \\lnot r \\)"
    "\\( \\lnot r\\land r \\)"
    "\\( q \\)"
    "\\( q\\supset q \\)"
    "\\( r \\)"
    "\\( r\\equiv \\lnot r\\land r \\)"
    "\\( (r\\equiv \\lnot r\\land r)\\equiv q\\supset q \\)"
    "\\( r\\lor q \\)"
    "\\( r\\lor q\\supset ((r\\equiv \\lnot r\\land r)\\equiv q\\supset q) \\)"]
  :wrong [
    ["\\( r\\land r \\)" "a negáció erősebb, mint a konjunkció"]
    ["\\( r\\equiv \\lnot r \\)" "a konjunkció erősebb, mint az ekvivalencia"]
    ["\\( r\\equiv \\lnot r\\land r\\equiv q\\)" "az implikáció erősebb, mint az ekvivalencia"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot (r\\lor \\lnot ((q\\supset p\\supset r)\\land (p\\equiv r))) \\) formulának?"
  :feedback "Az eredeti formula \\( \\lnot (r\\lor \\lnot ((q\\supset (p\\supset r))\\land (p\\equiv r)))\\) "
  :good [
    "\\( \\lnot ((q\\supset p\\supset r)\\land (p\\equiv r)) \\)"
    "\\( \\lnot (r\\lor \\lnot ((q\\supset p\\supset r)\\land (p\\equiv r))) \\)"
    "\\( p \\)"
    "\\( p\\equiv r \\)"
    "\\( p\\supset r \\)"
    "\\( q \\)"
    "\\( q\\supset p\\supset r \\)"
    "\\( (q\\supset p\\supset r)\\land (p\\equiv r) \\)"
    "\\( r \\)"
    "\\( r\\lor \\lnot ((q\\supset p\\supset r)\\land (p\\equiv r)) \\)"]
  :wrong [
    ["\\( q\\supset p\\)" "azonos műveleti jelek esetén a jobboldali köt erősebben"]
    ["\\( r\\land p\\)" "a konjunkció erősebb mint az implikáció és ekvivalencia, ezért nem törölhetőek a zárójelek"]
    ["\\( \\lnot q\\supset p\\supset r \\)" "az implikácó gyengébb mint a negáció, nem törölhetőek a zárójelek"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (p\\equiv p)\\land (r\\lor (r\\supset r))\\supset r\\lor (q\\equiv q) \\) formulának?"
  :feedback "Az eredeti formula \\( (((p\\equiv p)\\land (r\\lor (r\\supset r)))\\supset (r\\lor (q\\equiv q)))\\) "
  :good [
    "\\( p \\)"
    "\\( p\\equiv p \\)"
    "\\( (p\\equiv p)\\land (r\\lor (r\\supset r)) \\)"
    "\\( (p\\equiv p)\\land (r\\lor (r\\supset r))\\supset r\\lor (q\\equiv q) \\)"
    "\\( q \\)"
    "\\( q\\equiv q \\)"
    "\\( r \\)"
    "\\( r\\lor (q\\equiv q) \\)"
    "\\( r\\lor (r\\supset r) \\)"
    "\\( r\\supset r \\)"]
  :wrong [
    ["\\( r\\lor q\\equiv q \\)" "az ekvivalencia gyengébb mint a diszjunkció, nem törölhető a zárójel"]
    ["\\( r\\lor r\\supset r \\)" "az implikáció gyengébb mint a diszjunkció, ezért nem törölhető a zárójel"]
    ["\\( (p\\equiv p)\\land r \\)" "a diszjunkció gyengébb mint a konjunkció, ezért nem törölhető a zárójel"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( q\\supset \\lnot (q\\land q\\lor \\lnot q\\supset p\\land p) \\) formulának?"
  :feedback "Az eredeti formula \\( (q\\supset \\lnot (((q\\land q)\\lor \\lnot q)\\supset (p\\land p)))\\) "
  :good [
    "\\( \\lnot q \\)"
    "\\( \\lnot (q\\land q\\lor \\lnot q\\supset p\\land p) \\)"
    "\\( p \\)"
    "\\( p\\land p \\)"
    "\\( q \\)"
    "\\( q\\land q \\)"
    "\\( q\\land q\\lor \\lnot q \\)"
    "\\( q\\land q\\lor \\lnot q\\supset p\\land p \\)"
    "\\( q\\supset \\lnot (q\\land q\\lor \\lnot q\\supset p\\land p) \\)"]
  :wrong [
    ["\\(  q\\lor \\lnot q \\)" "a konjunkció erősebb mint a diszjunkció"]
    ["\\(  q\\supset p \\)" "a tagadás erősebb, mint az implikáció"]
    ["\\(  \\lnot q\\supset p \\)" "a konjunkció erősebb, mint az implikáció"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (q\\lor p\\lor r)\\land ((\\lnot p\\lor r)\\lor r\\land r) \\) formulának?"
  :feedback "Az eredeti formula \\( ((q\\lor (p\\lor r))\\land ((\\lnot p\\lor r)\\lor (r\\land r)))\\) "
  :good [
    "\\( \\lnot p \\)"
    "\\( \\lnot p\\lor r \\)"
    "\\( (\\lnot p\\lor r)\\lor r\\land r \\)"
    "\\( p \\)"
    "\\( p\\lor r \\)"
    "\\( q \\)"
    "\\( q\\lor p\\lor r \\)"
    "\\( (q\\lor p\\lor r)\\land ((\\lnot p\\lor r)\\lor r\\land r) \\)"
    "\\( r \\)"
    "\\( r\\land r \\)"]
  :wrong [
    ["\\( p\\lor r \\)" "a negáció erősebb mint a diszjunkció"]
    ["\\( q\\lor p \\)" "azonos műveleti jelek közül a jobboldali köt erősebben"]
    ["\\( ((\\lnot p\\lor r)\\lor r \\)" "a konjunkció erősebb, mint a diszjunkció"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( p\\equiv (q\\lor q\\supset r\\lor q)\\lor q\\supset p\\land p \\) formulának?"
  :feedback "Az eredeti formula \\( (p\\equiv ((((q\\lor q)\\supset (r\\lor q))\\lor q)\\supset (p\\land p)))\\) "
  :good [
    "\\( p \\)"
    "\\( p\\equiv (q\\lor q\\supset r\\lor q)\\lor q\\supset p\\land p \\)"
    "\\( p\\land p \\)"
    "\\( q \\)"
    "\\( q\\lor q \\)"
    "\\( q\\lor q\\supset r\\lor q \\)"
    "\\( (q\\lor q\\supset r\\lor q)\\lor q \\)"
    "\\( (q\\lor q\\supset r\\lor q)\\lor q\\supset p\\land p \\)"
    "\\( r \\)"
    "\\( r\\lor q \\)"]
  :wrong [
    ["\\( q\\supset r \\)" "a diszjunkció erősebb, mint az implikáció"]
    ["\\( q\\lor q\\supset r \\)" "a diszjunkció erősebb, mint az implikáció"]
    ["\\( q\\supset r\\lor q \\)" "a diszjunkció erősebb, mint az implikáció"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot \\lnot ((((p\\supset q)\\land p)\\land (r\\equiv p))\\land p) \\) formulának?"
  :feedback "Az eredeti formula \\( \\lnot \\lnot ((((p\\supset q)\\land p)\\land (r\\equiv p))\\land p)\\) "
  :good [
    "\\( \\lnot \\lnot ((((p\\supset q)\\land p)\\land (r\\equiv p))\\land p) \\)"
    "\\( \\lnot ((((p\\supset q)\\land p)\\land (r\\equiv p))\\land p) \\)"
    "\\( p \\)"
    "\\( p\\supset q \\)"
    "\\( (p\\supset q)\\land p \\)"
    "\\( ((p\\supset q)\\land p)\\land (r\\equiv p) \\)"
    "\\( (((p\\supset q)\\land p)\\land (r\\equiv p))\\land p \\)"
    "\\( q \\)"
    "\\( r \\)"
    "\\( r\\equiv p \\)"]
  :wrong [
    ["\\( p\\supset q\\land p \\)" "a konjunkció erősebb mint az implikáció, nem hagyható el a zárójel"]
    ["\\( (r\\equiv p)\\land p \\)" "a konjunkció erősebb, mint az ekvivalencia, nem hagyható el a zárójel"]
    ["\\( \\lnot (((p\\supset q)\\land p)\\land (r\\equiv p)) \\)" "a végső konjunkció nem hagyható el, mert a negáció erősebb, mint a konjunkció"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot (q\\land q\\land p)\\lor (p\\lor p\\equiv p\\supset r) \\) formulának?"
  :feedback "Az eredeti formula \\( (\\lnot (q\\land (q\\land p))\\lor ((p\\lor p)\\equiv (p\\supset r)))\\) "
  :good [
    "\\( \\lnot (q\\land q\\land p) \\)"
    "\\( \\lnot (q\\land q\\land p)\\lor (p\\lor p\\equiv p\\supset r) \\)"
    "\\( p \\)"
    "\\( p\\lor p \\)"
    "\\( p\\lor p\\equiv p\\supset r \\)"
    "\\( p\\supset r \\)"
    "\\( q \\)"
    "\\( q\\land p \\)"
    "\\( q\\land q\\land p \\)"
    "\\( r \\)"]
  :wrong [
    ["\\( q\\land q \\)" "azonos műveleti jelek közül a jobboldali köt erősebben"]
    ["\\( p\\equiv p\\supset r \\)" "a diszjunkció erősebb mint az ekvivalencia"]
    ["\\( p\\lor p\\equiv p \\)" "az implikáció erősebb mint az ekvivalencia"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( p\\equiv (q\\land (p\\supset p))\\land (q\\lor q\\supset \\lnot p) \\) formulának?"
  :feedback "Az eredeti formula \\( (p\\equiv ((q\\land (p\\supset p))\\land ((q\\lor q)\\supset \\lnot p)))\\) "
  :good [
    "\\( \\lnot p \\)"
    "\\( p \\)"
    "\\( p\\equiv (q\\land (p\\supset p))\\land (q\\lor q\\supset \\lnot p) \\)"
    "\\( p\\supset p \\)"
    "\\( q \\)"
    "\\( q\\land (p\\supset p) \\)"
    "\\( (q\\land (p\\supset p))\\land (q\\lor q\\supset \\lnot p) \\)"
    "\\( q\\lor q \\)"
    "\\( q\\lor q\\supset \\lnot p \\)"]
  :wrong [
    ["\\( q\\supset \\lnot p \\)" "a diszjunkció erősebb, mint az implikáció"]
    ["\\( q\\land p\\supset p \\)" "a konjunkció erősebb mint az implikáció, ezért nem hagyható el a zárójel"]
    ["\\( p\\equiv (q\\land (p\\supset p)) \\)" "a konjunkció erősebb mint az ekvivalencia"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (p\\lor (p\\supset q)\\equiv p)\\equiv r\\lor r\\equiv p\\supset r \\) formulának?"
  :feedback "Az eredeti formula \\( (((p\\lor (p\\supset q))\\equiv p)\\equiv ((r\\lor r)\\equiv (p\\supset r)))\\) "
  :good [
    "\\( p \\)"
    "\\( p\\lor (p\\supset q) \\)"
    "\\( p\\lor (p\\supset q)\\equiv p \\)"
    "\\( (p\\lor (p\\supset q)\\equiv p)\\equiv r\\lor r\\equiv p\\supset r \\)"
    "\\( p\\supset q \\)"
    "\\( p\\supset r \\)"
    "\\( q \\)"
    "\\( r \\)"
    "\\( r\\lor r \\)"
    "\\( r\\lor r\\equiv p\\supset r \\)"]
  :wrong [
    ["\\( p\\lor p\\supset q \\)" "az implikáció gyengébb mint a diszjunkció, ezért nem hagyható el a zárójel"]
    ["\\( r\\lor r\\equiv p\\)" "az ekvivalencia gyengébb mint az implikáció"]
    ["\\( r\\equiv p\\supset r \\)" "az ekvivalencia gyengébb mint a diszjunkció"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot (q\\lor p)\\lor q\\equiv (q\\equiv p)\\lor r\\supset r \\) formulának?"
  :feedback "Az eredeti formula \\( ((\\lnot (q\\lor p)\\lor q)\\equiv (((q\\equiv p)\\lor r)\\supset r))\\) "
  :good [
    "\\( \\lnot (q\\lor p) \\)"
    "\\( \\lnot (q\\lor p)\\lor q \\)"
    "\\( \\lnot (q\\lor p)\\lor q\\equiv (q\\equiv p)\\lor r\\supset r \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( q\\equiv p \\)"
    "\\( (q\\equiv p)\\lor r \\)"
    "\\( (q\\equiv p)\\lor r\\supset r \\)"
    "\\( q\\lor p \\)"
    "\\( r \\)"]
  :wrong [
    ["\\( r\\supset r \\)" "az implikáció gyengébb mint a diszjunkció"]
    ["\\( \\lnot q\\lor p\\lor q \\)" "a diszjunkció gyengébb mint a negáció, ezért nem törölhető a zárójel"]
    ["\\( \\lnot q\\lor p\\)" "a diszjunkció gyengébb mint a negáció, ezért nem törölhető a zárójel"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (q\\equiv p)\\land \\lnot (r\\equiv q)\\supset r\\lor \\lnot p \\) formulának?"
  :feedback "Az eredeti formula \\( (((q\\equiv p)\\land \\lnot (r\\equiv q))\\supset (r\\lor \\lnot p))\\) "
  :good [
    "\\( \\lnot p \\)"
    "\\( \\lnot (r\\equiv q) \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( q\\equiv p \\)"
    "\\( (q\\equiv p)\\land \\lnot (r\\equiv q) \\)"
    "\\( (q\\equiv p)\\land \\lnot (r\\equiv q)\\supset r\\lor \\lnot p \\)"
    "\\( r \\)"
    "\\( r\\equiv q \\)"
    "\\( r\\lor \\lnot p \\)"]
  :wrong [
    ["\\( (q\\equiv p)\\land \\lnot (r\\equiv q)\\supset r \\)" "a diszjunkció erősebb mint az implikáció"]
    ["\\( (r\\equiv q)\\supset r \\)" "a negáció erősebb mint az implikáció"]
    ["\\( \\lnot (r\\equiv q)\\supset r\\lor \\lnot p \\)" "a konjunkció erősebb mint az implikáció"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (\\lnot (r\\equiv p)\\supset q\\equiv p)\\land \\lnot (r\\land r) \\) formulának?"
  :feedback "Az eredeti formula \\( (((\\lnot (r\\equiv p)\\supset q)\\equiv p)\\land \\lnot (r\\land r))\\) "
  :good [
    "\\( \\lnot (r\\equiv p) \\)"
    "\\( \\lnot (r\\equiv p)\\supset q \\)"
    "\\( \\lnot (r\\equiv p)\\supset q\\equiv p \\)"
    "\\( (\\lnot (r\\equiv p)\\supset q\\equiv p)\\land \\lnot (r\\land r) \\)"
    "\\( \\lnot (r\\land r) \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( r \\)"
    "\\( r\\equiv p \\)"
    "\\( r\\land r \\)"]
  :wrong [
    ["\\( (r\\equiv p)\\supset q \\)" "a negáció erősebb mint az implikáció"]
    ["\\( q\\equiv p \\)" "az implikáció erősebb mint az ekvivalencia"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot ((\\lnot \\lnot (r\\equiv r\\land p)\\supset q)\\land r) \\) formulának?"
  :feedback "Az eredeti formula \\( \\lnot ((\\lnot \\lnot (r\\equiv (r\\land p))\\supset q)\\land r)\\) "
  :good [
    "\\( \\lnot ((\\lnot \\lnot (r\\equiv r\\land p)\\supset q)\\land r) \\)"
    "\\( \\lnot \\lnot (r\\equiv r\\land p) \\)"
    "\\( \\lnot \\lnot (r\\equiv r\\land p)\\supset q \\)"
    "\\( (\\lnot \\lnot (r\\equiv r\\land p)\\supset q)\\land r \\)"
    "\\( \\lnot (r\\equiv r\\land p) \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( r \\)"
    "\\( r\\equiv r\\land p \\)"
    "\\( r\\land p \\)"]
  :wrong [
    ["\\( r\\equiv r\\)" "a konjunkció erősebb mint az ekvivalencia"]
    ["\\( q\\land r \\)" "az implikáció gyengébb mint a konjunkció, ezért nem törölhető a zárójel"]
    ["\\( \\lnot (r\\equiv r\\land p)\\supset q \\)" "a negáció erősebb mint az implikáció"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( p\\land (q\\land p\\land q\\lor p\\equiv \\lnot r\\equiv p) \\) formulának?"
  :feedback "Az eredeti formula \\( (p\\land (((q\\land (p\\land q))\\lor p)\\equiv (\\lnot r\\equiv p)))\\) "
  :good [
    "\\( \\lnot r \\)"
    "\\( \\lnot r\\equiv p \\)"
    "\\( p \\)"
    "\\( p\\land q \\)"
    "\\( p\\land (q\\land p\\land q\\lor p\\equiv \\lnot r\\equiv p) \\)"
    "\\( q \\)"
    "\\( q\\land p\\land q \\)"
    "\\( q\\land p\\land q\\lor p \\)"
    "\\( q\\land p\\land q\\lor p\\equiv \\lnot r\\equiv p \\)"
    "\\( r \\)"]
  :wrong [
    ["\\( r\\equiv p \\)" "a negáció erősebb mint az ekvivalencia"]
    ["\\( q\\land p \\)" "azonos műveleti jelek közül a jobboldali köt erősebben"]
    ["\\( q\\lor p \\)" "a konjunkció erősebb mint a diszjunkció"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (q\\supset \\lnot q)\\land r\\land (q\\equiv q)\\supset p\\supset p \\) formulának?"
  :feedback "Az eredeti formula \\( (((q\\supset \\lnot q)\\land (r\\land (q\\equiv q)))\\supset (p\\supset p))\\) "
  :good [
    "\\( \\lnot q \\)"
    "\\( p \\)"
    "\\( p\\supset p \\)"
    "\\( q \\)"
    "\\( q\\equiv q \\)"
    "\\( q\\supset \\lnot q \\)"
    "\\( (q\\supset \\lnot q)\\land r\\land (q\\equiv q) \\)"
    "\\( (q\\supset \\lnot q)\\land r\\land (q\\equiv q)\\supset p\\supset p \\)"
    "\\( r \\)"
    "\\( r\\land (q\\equiv q) \\)"]
  :wrong [
    ["\\( (q\\equiv q)\\supset p\\supset p \\)" "a konjunkció erősebb mint az implikáció"]
    ["\\( (q\\equiv q)\\supset p \\)" "a konjunkció erősebb mint az implikáció"]
    ["\\( (q\\supset \\lnot q)\\land r \\)" "azonos műveleti jelek esetén a jobboldali köt erősebben"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( \\lnot (q\\land \\lnot p\\equiv (p\\supset p)\\land (r\\equiv r)) \\) formulának?"
  :feedback "Az eredeti formula \\( \\lnot ((q\\land \\lnot p)\\equiv ((p\\supset p)\\land (r\\equiv r)))\\) "
  :good [
    "\\( \\lnot p \\)"
    "\\( \\lnot (q\\land \\lnot p\\equiv (p\\supset p)\\land (r\\equiv r)) \\)"
    "\\( p \\)"
    "\\( p\\supset p \\)"
    "\\( (p\\supset p)\\land (r\\equiv r) \\)"
    "\\( q \\)"
    "\\( q\\land \\lnot p \\)"
    "\\( q\\land \\lnot p\\equiv (p\\supset p)\\land (r\\equiv r) \\)"
    "\\( r \\)"
    "\\( r\\equiv r \\)"]
  :wrong [
    ["\\(  p\\equiv (p\\supset p)\\land (r\\equiv r) \\)" "a negáció erősebb mint az ekvivalencia"]
    ["\\(  p\\equiv (p\\supset p) \\)" "a negáció erősebb mint az ekvivalencia"]
    ["\\( p\\supset p\\land r\\equiv r \\)" "az implikáció gyengébb mint a konjunkció, ezért nem törölhető a zárójel"]]}

 {:question "A felsoroltak közül melyek részformulái a \\( (q\\equiv p)\\equiv \\lnot \\lnot (q\\lor r)\\lor (r\\equiv p) \\) formulának?"
  :feedback "Az eredeti formula \\( ((q\\equiv p)\\equiv (\\lnot \\lnot (q\\lor r)\\lor (r\\equiv p)))\\) "
  :good [
    "\\( \\lnot \\lnot (q\\lor r) \\)"
    "\\( \\lnot \\lnot (q\\lor r)\\lor (r\\equiv p) \\)"
    "\\( \\lnot (q\\lor r) \\)"
    "\\( p \\)"
    "\\( q \\)"
    "\\( q\\equiv p \\)"
    "\\( (q\\equiv p)\\equiv \\lnot \\lnot (q\\lor r)\\lor (r\\equiv p) \\)"
    "\\( q\\lor r \\)"
    "\\( r \\)"
    "\\( r\\equiv p \\)"]
  :wrong [
    ["\\(  \\lnot (q\\lor r)\\lor (r\\equiv p) \\)" "a negáció erősebb mint a diszjunkció"]
    ["\\(  (q\\lor r)\\lor (r\\equiv p) \\)" "a negáció erősebb mint a diszjunkció"]]}]
