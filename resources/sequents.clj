[{:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( p\\lor r\\supset r\\lor q\\equiv r, \\lnot r\\lor p\\vdash \\lnot s, s\\equiv r\\land r \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( p\\lor r\\supset r\\lor q, r, \\lnot r\\lor p\\vdash \\lnot s, s\\equiv r\\land r \\) "
    " \\( \\lnot r\\lor p\\vdash \\lnot s, s\\equiv r\\land r, p\\lor r\\supset r\\lor q, r \\) "
    " \\( p\\lor r\\supset r\\lor q\\equiv r, \\lnot r\\vdash \\lnot s, s\\equiv r\\land r \\) "
    " \\( p\\lor r\\supset r\\lor q\\equiv r, p\\vdash \\lnot s, s\\equiv r\\land r \\) "
    " \\( p\\lor r\\supset r\\lor q\\equiv r, \\lnot r\\lor p, s\\vdash s\\equiv r\\land r \\) "
    " \\( p\\lor r\\supset r\\lor q\\equiv r, \\lnot r\\lor p, s\\vdash \\lnot s, r\\land r \\) "
    " \\( p\\lor r\\supset r\\lor q\\equiv r, \\lnot r\\lor p, r\\land r\\vdash \\lnot s, s \\) " ]
  :wrong [
    ["\\( p\\lor r\\supset r\\lor q\\equiv r, \\lnot r\\lor p\\vdash \\lnot s, s\\equiv r \\)"
     "precedencia!"]
    ["\\( p\\lor r\\supset r\\lor q\\equiv r, \\lnot r, p\\vdash \\lnot s, s\\equiv r\\land r \\)"
     "ha a diszjunkciót a baloldalon bontjuk, csak az egyik tag marad meg"]
    ["\\( \\lnot r\\lor p, r\\lor q\\equiv r \\vdash \\lnot s, s\\equiv r\\land r \\)"
     "precedencia!"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( r\\supset r, \\lnot s\\equiv s\\land s\\land p, p\\lor p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r\\lor r \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( \\lnot s\\equiv s\\land s\\land p, p\\lor p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r\\lor r, r \\) "
    " \\( r, \\lnot s\\equiv s\\land s\\land p, p\\lor p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r\\lor r \\) "
    " \\( r\\supset r, \\lnot s, s\\land s\\land p, p\\lor p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r\\lor r \\) "
    " \\( r\\supset r, p\\lor p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r\\lor r, \\lnot s, s\\land s\\land p \\) "
    " \\( r\\supset r, \\lnot s\\equiv s\\land s\\land p, p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r\\lor r \\) "
    " \\( r\\supset r, \\lnot s\\equiv s\\land s\\land p, p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r\\lor r \\) "
    " \\( r\\supset r, \\lnot s\\equiv s\\land s\\land p, p\\lor p, r\\equiv \\lnot p\\vdash q\\lor r\\lor r \\) "
    " \\( r\\supset r, \\lnot s\\equiv s\\land s\\land p, p\\lor p\\vdash \\lnot (r\\equiv \\lnot p), q, r\\lor r \\) "]
  :wrong [
    ["\\( r\\supset r, \\lnot s\\equiv s, s\\land p, p\\lor p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r\\lor r \\)"
     "precedencia!"]
    ["\\( r\\supset r, \\lnot s\\equiv s\\land s, p, p\\lor p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r\\lor r \\)"
     "precedencia!"]
    ["\\( r\\supset r, \\lnot s\\equiv s\\land s\\land p, p\\lor p\\vdash \\lnot (r\\equiv \\lnot p), q\\lor r, r \\)"
     "balról jobbra szabály"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( s\\equiv (s\\supset q)\\land s, \\lnot ((r\\supset p)\\supset p)\\vdash (p\\supset q)\\land r, q\\supset q \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
     " \\( s, (s\\supset q)\\land s, \\lnot ((r\\supset p)\\supset p)\\vdash (p\\supset q)\\land r, q\\supset q \\) "
     " \\( \\lnot ((r\\supset p)\\supset p)\\vdash (p\\supset q)\\land r, q\\supset q, s, (s\\supset q)\\land s \\) "
     " \\( s\\equiv (s\\supset q)\\land s\\vdash (p\\supset q)\\land r, q\\supset q, (r\\supset p)\\supset p \\) "
     " \\( s\\equiv (s\\supset q)\\land s, \\lnot ((r\\supset p)\\supset p)\\vdash q\\supset q, p\\supset q \\) "
     " \\( s\\equiv (s\\supset q)\\land s, \\lnot ((r\\supset p)\\supset p)\\vdash q\\supset q, r \\) "
     " \\( s\\equiv (s\\supset q)\\land s, \\lnot ((r\\supset p)\\supset p), q\\vdash (p\\supset q)\\land r, q \\) " ]
  :wrong [
    ["\\( s\\equiv (s\\supset q)\\land s, \\lnot ((r\\supset p)\\supset p)\\vdash  q\\supset q, p\\supset q, r\\)"
     "precedencia!"]
    ["\\( s\\equiv (s\\supset q)\\land s, \\lnot ((r\\supset p)\\supset p)\\vdash (p\\supset q)\\land r, q \\)"
     "a jobboldalon felbontott implikáció előtagja megjelenik a baloldalon"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( \\lnot (s\\land q)\\supset p\\land p, (s\\lor r)\\land s\\vdash p\\land (r\\supset q)\\land q, (r\\equiv s)\\land p\\land s \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( (s\\lor r)\\land s\\vdash p\\land (r\\supset q)\\land q, (r\\equiv s)\\land p\\land s, \\lnot (s\\land q) \\) "
     " \\( p\\land p, (s\\lor r)\\land s\\vdash p\\land (r\\supset q)\\land q, (r\\equiv s)\\land p\\land s \\) "
     " \\( \\lnot (s\\land q)\\supset p\\land p, s\\lor r, s\\vdash p\\land (r\\supset q)\\land q, (r\\equiv s)\\land p\\land s \\) "
     " \\( \\lnot (s\\land q)\\supset p\\land p, (s\\lor r)\\land s\\vdash (r\\equiv s)\\land p\\land s, p \\) "
     " \\( \\lnot (s\\land q)\\supset p\\land p, (s\\lor r)\\land s\\vdash (r\\equiv s)\\land p\\land s, (r\\supset q)\\land q \\) "
     " \\( \\lnot (s\\land q)\\supset p\\land p, (s\\lor r)\\land s\\vdash p\\land (r\\supset q)\\land q, r\\equiv s \\) "
     " \\( \\lnot (s\\land q)\\supset p\\land p, (s\\lor r)\\land s\\vdash p\\land (r\\supset q)\\land q, p\\land s \\) " ]
  :wrong [
   ["\\( \\lnot (s\\land q)\\supset p, p, (s\\lor r)\\land s\\vdash p\\land (r\\supset q)\\land q, (r\\equiv s)\\land p\\land s \\)"
    "precedencia!"]
   ["\\( \\lnot (s\\land q)\\supset p\\land p, (s\\lor r)\\land s\\vdash (r\\equiv s)\\land p\\land s, p, (r\\supset q)\\land q \\)"
    "a konjunkció jobb oldali bontásánál csak az egyik tag marad meg"]
   ["\\( \\lnot (s\\land q)\\supset p\\land p, (s\\lor r)\\land s\\vdash p\\land (r\\supset q)\\land q, (r\\equiv s)\\land p,s \\)"
    "balról jobbra szabály"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( q\\supset q, q\\equiv \\lnot s\\equiv q\\vdash r\\lor r, p\\land s \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( q\\equiv \\lnot s\\equiv q\\vdash r\\lor r, p\\land s, q \\) "
     " \\( q, q\\equiv \\lnot s\\equiv q\\vdash r\\lor r, p\\land s \\) "
     " \\( q\\supset q, q, \\lnot s\\equiv q\\vdash r\\lor r, p\\land s \\) "
     " \\( q\\supset q\\vdash r\\lor r, p\\land s, q, \\lnot s\\equiv q \\) "
     " \\( q\\supset q, q\\equiv \\lnot s\\equiv q\\vdash p\\land s, r, r \\) "
     " \\( q\\supset q, q\\equiv \\lnot s\\equiv q\\vdash r\\lor r, p \\) "
     " \\( q\\supset q, q\\equiv \\lnot s\\equiv q\\vdash r\\lor r, s \\) " ]
  :wrong [
    ["\\( q\\supset q, q\\equiv \\lnot s\\equiv q\\vdash r\\lor r, p, s \\)"
     "a konjunkció jobb oldali bontásánál csak az egyik tag marad meg"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( q\\lor q, (r\\equiv r)\\lor s\\supset r, \\lnot (r\\equiv s)\\vdash \\lnot p, q\\supset q\\lor p\\supset q, q\\lor q\\equiv p\\equiv \\lnot s \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( q, (r\\equiv r)\\lor s\\supset r, \\lnot (r\\equiv s)\\vdash \\lnot p, q\\supset q\\lor p\\supset q, q\\lor q\\equiv p\\equiv \\lnot s \\) "
     " \\( q, (r\\equiv r)\\lor s\\supset r, \\lnot (r\\equiv s)\\vdash \\lnot p, q\\supset q\\lor p\\supset q, q\\lor q\\equiv p\\equiv \\lnot s \\) "
     " \\( q\\lor q, \\lnot (r\\equiv s)\\vdash \\lnot p, q\\supset q\\lor p\\supset q, q\\lor q\\equiv p\\equiv \\lnot s, (r\\equiv r)\\lor s \\) "
     " \\( q\\lor q, r, \\lnot (r\\equiv s)\\vdash \\lnot p, q\\supset q\\lor p\\supset q, q\\lor q\\equiv p\\equiv \\lnot s \\) "
     " \\( q\\lor q, (r\\equiv r)\\lor s\\supset r\\vdash \\lnot p, q\\supset q\\lor p\\supset q, q\\lor q\\equiv p\\equiv \\lnot s, r\\equiv s \\) "
     " \\( q\\lor q, (r\\equiv r)\\lor s\\supset r, \\lnot (r\\equiv s), p\\vdash q\\supset q\\lor p\\supset q, q\\lor q\\equiv p\\equiv \\lnot s \\) "
     " \\( q\\lor q, (r\\equiv r)\\lor s\\supset r, \\lnot (r\\equiv s), q\\vdash \\lnot p, q\\lor q\\equiv p\\equiv \\lnot s, q\\lor p\\supset q \\) "
     " \\( q\\lor q, (r\\equiv r)\\lor s\\supset r, \\lnot (r\\equiv s), q\\lor q\\vdash \\lnot p, q\\supset q\\lor p\\supset q, p\\equiv \\lnot s \\) "
     " \\( q\\lor q, (r\\equiv r)\\lor s\\supset r, \\lnot (r\\equiv s), p\\equiv \\lnot s\\vdash \\lnot p, q\\supset q\\lor p\\supset q, q\\lor q \\) " ]
  :wrong [
    ["\\( q\\lor q, (r\\equiv r), s\\supset r, \\lnot (r\\equiv s)\\vdash \\lnot p, q\\supset q\\lor p\\supset q, q\\lor q\\equiv p\\equiv \\lnot s \\)"
      "precedencia!"]
    ["\\( q\\lor q, (r\\equiv r)\\lor s\\supset r, \\lnot (r\\equiv s), q\\supset q\\lor p \\vdash \\lnot p, q\\lor q\\equiv p\\equiv \\lnot s, q \\)"
     "balról jobbra szabály"]
    ["\\( q\\lor q, (r\\equiv r)\\lor s\\supset r, \\lnot (r\\equiv s)\\vdash \\lnot p, q\\supset q\\lor p\\supset q, q, q\\equiv p\\equiv \\lnot s \\)"
     "precedencia!"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( \\lnot (p\\equiv r\\equiv s), q\\land (p\\land q\\lor q)\\vdash q\\land r\\equiv r, (r\\supset s)\\supset s \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( q\\land (p\\land q\\lor q)\\vdash q\\land r\\equiv r, (r\\supset s)\\supset s, p\\equiv r\\equiv s \\) "
     " \\( \\lnot (p\\equiv r\\equiv s), q, p\\land q\\lor q\\vdash q\\land r\\equiv r, (r\\supset s)\\supset s \\) "
     " \\( \\lnot (p\\equiv r\\equiv s), q\\land (p\\land q\\lor q), q\\land r\\vdash (r\\supset s)\\supset s, r \\) "
     " \\( \\lnot (p\\equiv r\\equiv s), q\\land (p\\land q\\lor q), r\\vdash (r\\supset s)\\supset s, q\\land r \\) "
     " \\( \\lnot (p\\equiv r\\equiv s), q\\land (p\\land q\\lor q), r\\supset s\\vdash q\\land r\\equiv r, s \\) " ]
  :wrong [
    ["\\( \\lnot (p\\equiv r\\equiv s), q\\land (p, q\\lor q)\\vdash q\\land r\\equiv r, (r\\supset s)\\supset s \\)"
     "nem is formula, így nem is szekvent"]
    ["\\( \\lnot (p\\equiv r\\equiv s), q\\land (p\\land q\\lor q) \\vdash r\\equiv r, (r\\supset s)\\supset s \\)"
     "precedencia!"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( \\lnot (s\\supset p)\\lor \\lnot q, (r\\supset \\lnot q)\\supset s\\vdash \\lnot p\\supset \\lnot q, r\\land \\lnot s\\lor r, p\\land r\\supset (s\\equiv r) \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( \\lnot (s\\supset p), (r\\supset \\lnot q)\\supset s\\vdash \\lnot p\\supset \\lnot q, r\\land \\lnot s\\lor r, p\\land r\\supset (s\\equiv r) \\) "
     " \\( \\lnot q, (r\\supset \\lnot q)\\supset s\\vdash \\lnot p\\supset \\lnot q, r\\land \\lnot s\\lor r, p\\land r\\supset (s\\equiv r) \\) "
     " \\( \\lnot (s\\supset p)\\lor \\lnot q\\vdash \\lnot p\\supset \\lnot q, r\\land \\lnot s\\lor r, p\\land r\\supset (s\\equiv r), r\\supset \\lnot q \\) "
     " \\( \\lnot (s\\supset p)\\lor \\lnot q, s\\vdash \\lnot p\\supset \\lnot q, r\\land \\lnot s\\lor r, p\\land r\\supset (s\\equiv r) \\) "
     " \\( \\lnot (s\\supset p)\\lor \\lnot q, (r\\supset \\lnot q)\\supset s, \\lnot p\\vdash r\\land \\lnot s\\lor r, p\\land r\\supset (s\\equiv r), \\lnot q \\) "
     " \\( \\lnot (s\\supset p)\\lor \\lnot q, (r\\supset \\lnot q)\\supset s\\vdash \\lnot p\\supset \\lnot q, p\\land r\\supset (s\\equiv r), r\\land \\lnot s, r \\) "
     " \\( \\lnot (s\\supset p)\\lor \\lnot q, (r\\supset \\lnot q)\\supset s, p\\land r\\vdash \\lnot p\\supset \\lnot q, r\\land \\lnot s\\lor r, s\\equiv r \\) " ]
  :wrong [
   ["\\( \\lnot (s\\supset p)\\lor \\lnot q, (r\\supset \\lnot q)\\supset s\\vdash \\lnot p\\supset \\lnot q, r\\land \\lnot s\\lor r, r\\supset (s\\equiv r) \\)"
    "precedencia!"]
   ["\\( \\lnot (s\\supset p)\\lor \\lnot q, (r\\supset \\lnot q)\\supset s\\vdash r\\land \\lnot s\\lor r, p\\land r\\supset (s\\equiv r), \\lnot q \\)"
    "implikáció jobboldalon bontásakor az előtag megjelenik a baloldalon"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( p\\land (p\\supset r), \\lnot ((q\\supset r)\\land p), \\lnot \\lnot (q\\equiv r\\supset s)\\vdash q\\equiv s, \\lnot \\lnot p, ((\\lnot q\\supset q)\\land q)\\land p \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( p, p\\supset r, \\lnot ((q\\supset r)\\land p), \\lnot \\lnot (q\\equiv r\\supset s)\\vdash q\\equiv s, \\lnot \\lnot p, ((\\lnot q\\supset q)\\land q)\\land p \\) "
     " \\( p\\land (p\\supset r), \\lnot \\lnot (q\\equiv r\\supset s)\\vdash q\\equiv s, \\lnot \\lnot p, ((\\lnot q\\supset q)\\land q)\\land p, (q\\supset r)\\land p \\) "
     " \\( p\\land (p\\supset r), \\lnot ((q\\supset r)\\land p)\\vdash q\\equiv s, \\lnot \\lnot p, ((\\lnot q\\supset q)\\land q)\\land p, \\lnot (q\\equiv r\\supset s) \\) "
     " \\( p\\land (p\\supset r), \\lnot ((q\\supset r)\\land p), \\lnot \\lnot (q\\equiv r\\supset s), q\\vdash \\lnot \\lnot p, ((\\lnot q\\supset q)\\land q)\\land p, s \\) "
     " \\( p\\land (p\\supset r), \\lnot ((q\\supset r)\\land p), \\lnot \\lnot (q\\equiv r\\supset s), s\\vdash \\lnot \\lnot p, ((\\lnot q\\supset q)\\land q)\\land p, q \\) "
     " \\( p\\land (p\\supset r), \\lnot ((q\\supset r)\\land p), \\lnot \\lnot (q\\equiv r\\supset s), \\lnot p\\vdash q\\equiv s, ((\\lnot q\\supset q)\\land q)\\land p \\) "
     " \\( p\\land (p\\supset r), \\lnot ((q\\supset r)\\land p), \\lnot \\lnot (q\\equiv r\\supset s)\\vdash q\\equiv s, \\lnot \\lnot p, (\\lnot q\\supset q)\\land q \\) "
     " \\( p\\land (p\\supset r), \\lnot ((q\\supset r)\\land p), \\lnot \\lnot (q\\equiv r\\supset s)\\vdash q\\equiv s, \\lnot \\lnot p, p \\) " ]
  :wrong [
    ["\\( p\\land (p\\supset r), \\lnot ((q\\supset r)\\land p), \\lnot \\lnot (q\\equiv r\\supset s)\\vdash q\\equiv s, \\lnot \\lnot p, ((\\lnot q\\supset q)\\land q), p \\)"
     "a konjunkció jobb oldali bontásánál csak az egyik tag marad meg"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( ((s\\equiv p)\\land r\\equiv p)\\lor r, s\\supset s, \\lnot (s\\land q\\equiv q\\lor p)\\vdash r\\land q, p\\lor p\\equiv r \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( (s\\equiv p)\\land r\\equiv p, s\\supset s, \\lnot (s\\land q\\equiv q\\lor p)\\vdash r\\land q, p\\lor p\\equiv r \\) "
     " \\( r, s\\supset s, \\lnot (s\\land q\\equiv q\\lor p)\\vdash r\\land q, p\\lor p\\equiv r \\) "
     " \\( ((s\\equiv p)\\land r\\equiv p)\\lor r, \\lnot (s\\land q\\equiv q\\lor p)\\vdash r\\land q, p\\lor p\\equiv r, s \\) "
     " \\( ((s\\equiv p)\\land r\\equiv p)\\lor r, s, \\lnot (s\\land q\\equiv q\\lor p)\\vdash r\\land q, p\\lor p\\equiv r \\) "
     " \\( ((s\\equiv p)\\land r\\equiv p)\\lor r, s\\supset s\\vdash r\\land q, p\\lor p\\equiv r, s\\land q\\equiv q\\lor p \\) "
     " \\( ((s\\equiv p)\\land r\\equiv p)\\lor r, s\\supset s, \\lnot (s\\land q\\equiv q\\lor p)\\vdash p\\lor p\\equiv r, r \\) "
     " \\( ((s\\equiv p)\\land r\\equiv p)\\lor r, s\\supset s, \\lnot (s\\land q\\equiv q\\lor p)\\vdash p\\lor p\\equiv r, q \\) "
     " \\( ((s\\equiv p)\\land r\\equiv p)\\lor r, s\\supset s, \\lnot (s\\land q\\equiv q\\lor p), p\\lor p\\vdash r\\land q, r \\) "
     " \\( ((s\\equiv p)\\land r\\equiv p)\\lor r, s\\supset s, \\lnot (s\\land q\\equiv q\\lor p), r\\vdash r\\land q, p\\lor p \\) " ]
  :wrong [
    ["\\( ((s\\equiv p)\\land r\\equiv p)\\lor r, s\\supset s, \\lnot (s\\land q\\equiv q\\lor p)\\vdash r\\land q, p, p\\equiv r \\)"
     "precedencia!"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( p\\equiv q, r\\equiv r\\vdash q\\land (p\\equiv p), (s\\equiv r)\\equiv r\\supset q, \\lnot (p\\land (s\\lor (s\\equiv q))) \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( p, q, r\\equiv r\\vdash q\\land (p\\equiv p), (s\\equiv r)\\equiv r\\supset q, \\lnot (p\\land (s\\lor (s\\equiv q))) \\) "
     " \\( r\\equiv r\\vdash q\\land (p\\equiv p), (s\\equiv r)\\equiv r\\supset q, \\lnot (p\\land (s\\lor (s\\equiv q))), p, q \\) "
     " \\( p\\equiv q, r, r\\vdash q\\land (p\\equiv p), (s\\equiv r)\\equiv r\\supset q, \\lnot (p\\land (s\\lor (s\\equiv q))) \\) "
     " \\( p\\equiv q\\vdash q\\land (p\\equiv p), (s\\equiv r)\\equiv r\\supset q, \\lnot (p\\land (s\\lor (s\\equiv q))), r, r \\) "
     " \\( p\\equiv q, r\\equiv r\\vdash (s\\equiv r)\\equiv r\\supset q, \\lnot (p\\land (s\\lor (s\\equiv q))), q \\) "
     " \\( p\\equiv q, r\\equiv r\\vdash (s\\equiv r)\\equiv r\\supset q, \\lnot (p\\land (s\\lor (s\\equiv q))), p\\equiv p \\) "
     " \\( p\\equiv q, r\\equiv r, s\\equiv r\\vdash q\\land (p\\equiv p), \\lnot (p\\land (s\\lor (s\\equiv q))), r\\supset q \\) "
     " \\( p\\equiv q, r\\equiv r, r\\supset q\\vdash q\\land (p\\equiv p), \\lnot (p\\land (s\\lor (s\\equiv q))), s\\equiv r \\) "
     " \\( p\\equiv q, r\\equiv r, p\\land (s\\lor (s\\equiv q))\\vdash q\\land (p\\equiv p), (s\\equiv r)\\equiv r\\supset q \\) " ]
  :wrong [
    ["\\( p\\equiv q, r\\equiv r\\vdash (s\\equiv r)\\equiv r\\supset q, \\lnot (p\\land (s\\lor (s\\equiv q))), q, (p\\equiv p) \\)"
     "a konjunkció jobb oldali bontásánál csak az egyik tag marad meg"]
    ["\\( p\\equiv q, r\\equiv r, (s\\equiv r)\\equiv r \\vdash q\\land (p\\equiv p), \\lnot (p\\land (s\\lor (s\\equiv q))), q \\)"
     "precedencia!"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( (((q\\equiv r)\\supset s)\\supset s)\\lor q, \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p))\\vdash r\\equiv q\\supset s\\lor p, q\\land q\\land (p\\equiv r), p\\supset s \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( ((q\\equiv r)\\supset s)\\supset s, \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p))\\vdash r\\equiv q\\supset s\\lor p, q\\land q\\land (p\\equiv r), p\\supset s \\) "
     " \\( q, \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p))\\vdash r\\equiv q\\supset s\\lor p, q\\land q\\land (p\\equiv r), p\\supset s \\) "
     " \\( (((q\\equiv r)\\supset s)\\supset s)\\lor q, \\lnot (p\\land s), \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p))\\vdash r\\equiv q\\supset s\\lor p, q\\land q\\land (p\\equiv r), p\\supset s \\) "
     " \\( (((q\\equiv r)\\supset s)\\supset s)\\lor q, \\lnot (p\\land s)\\land \\lnot s\\vdash r\\equiv q\\supset s\\lor p, q\\land q\\land (p\\equiv r), p\\supset s, (q\\lor p)\\lor (q\\equiv p) \\) "
     " \\( (((q\\equiv r)\\supset s)\\supset s)\\lor q, \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p)), r\\vdash q\\land q\\land (p\\equiv r), p\\supset s, q\\supset s\\lor p \\) "
     " \\( (((q\\equiv r)\\supset s)\\supset s)\\lor q, \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p)), q\\supset s\\lor p\\vdash q\\land q\\land (p\\equiv r), p\\supset s, r \\) "
     " \\( (((q\\equiv r)\\supset s)\\supset s)\\lor q, \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p))\\vdash r\\equiv q\\supset s\\lor p, p\\supset s, q \\) "
     " \\( (((q\\equiv r)\\supset s)\\supset s)\\lor q, \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p))\\vdash r\\equiv q\\supset s\\lor p, p\\supset s, q\\land (p\\equiv r) \\) "
     " \\( (((q\\equiv r)\\supset s)\\supset s)\\lor q, \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p)), p\\vdash r\\equiv q\\supset s\\lor p, q\\land q\\land (p\\equiv r), s \\) " ]
  :wrong [
    ["\\( \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p)),(((q\\equiv r)\\supset s)\\supset s), q \\vdash r\\equiv q\\supset s\\lor p, q\\land q\\land (p\\equiv r), p\\supset s \\)"
     "diszjunkció bontása esetén a bal oldalon csak az egyik tag szerepel"]
    ["\\( (((q\\equiv r)\\supset s)\\supset s)\\lor q,  \\lnot ((q\\lor p)\\lor (q\\equiv p))\\vdash r\\equiv q\\supset s\\lor p, q\\land q\\land (p\\equiv r), p\\supset s, (p\\land s)\\land \\lnot s\\)"
     "precedencia!"]
    ["\\( (((q\\equiv r)\\supset s)\\supset s)\\lor q, \\lnot (p\\land s)\\land \\lnot s, \\lnot ((q\\lor p)\\lor (q\\equiv p)), r\\equiv q \\vdash q\\land q\\land (p\\equiv r), p\\supset s, s\\lor p\\)"
     "precedencia!"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( q\\equiv s, s\\supset s\\supset s\\vdash \\lnot (q\\land s), q\\equiv (q\\lor r)\\land (p\\supset q) \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( q, s, s\\supset s\\supset s\\vdash \\lnot (q\\land s), q\\equiv (q\\lor r)\\land (p\\supset q) \\) "
     " \\( s\\supset s\\supset s\\vdash \\lnot (q\\land s), q\\equiv (q\\lor r)\\land (p\\supset q), q, s \\) "
     " \\( q\\equiv s\\vdash \\lnot (q\\land s), q\\equiv (q\\lor r)\\land (p\\supset q), s \\) "
     " \\( q\\equiv s, s\\supset s\\vdash \\lnot (q\\land s), q\\equiv (q\\lor r)\\land (p\\supset q) \\) "
     " \\( q\\equiv s, s\\supset s\\supset s, q\\land s\\vdash q\\equiv (q\\lor r)\\land (p\\supset q) \\) "
     " \\( q\\equiv s, s\\supset s\\supset s, q\\vdash \\lnot (q\\land s), (q\\lor r)\\land (p\\supset q) \\) "
     " \\( q\\equiv s, s\\supset s\\supset s, (q\\lor r)\\land (p\\supset q)\\vdash \\lnot (q\\land s), q \\) "]
  :wrong [
    ["\\( q\\equiv s, s\\supset s\\supset s\\vdash \\lnot (q\\land s), q\\equiv (q\\lor r) \\)"
     "precedencia!"]]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( r\\lor r, r\\supset s\\vdash p\\supset r\\lor q, \\lnot (p\\land r\\equiv p) \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( r, r\\supset s\\vdash p\\supset r\\lor q, \\lnot (p\\land r\\equiv p) \\) "
     " \\( r, r\\supset s\\vdash p\\supset r\\lor q, \\lnot (p\\land r\\equiv p) \\) "
     " \\( r\\lor r\\vdash p\\supset r\\lor q, \\lnot (p\\land r\\equiv p), r \\) "
     " \\( r\\lor r, s\\vdash p\\supset r\\lor q, \\lnot (p\\land r\\equiv p) \\) "
     " \\( r\\lor r, r\\supset s, p\\vdash \\lnot (p\\land r\\equiv p), r\\lor q \\) "
     " \\( r\\lor r, r\\supset s, p\\land r\\equiv p\\vdash p\\supset r\\lor q \\) " ]
  :wrong [
    [" \\( r\\lor r\\vdash p\\supset r\\lor q, \\lnot (p\\land r\\equiv p) \\)"
     "a szekvent kalkulusban nincs lehetőség szűkítésre, azaz formulák elhagyására"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( \\lnot (p\\equiv q)\\supset s\\land s, \\lnot \\lnot p\\equiv p, p\\land (p\\lor p)\\lor p\\vdash r\\lor \\lnot r, (r\\equiv s)\\supset s\\supset s \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( \\lnot \\lnot p\\equiv p, p\\land (p\\lor p)\\lor p\\vdash r\\lor \\lnot r, (r\\equiv s)\\supset s\\supset s, \\lnot (p\\equiv q) \\) "
     " \\( s\\land s, \\lnot \\lnot p\\equiv p, p\\land (p\\lor p)\\lor p\\vdash r\\lor \\lnot r, (r\\equiv s)\\supset s\\supset s \\) "
     " \\( \\lnot (p\\equiv q)\\supset s\\land s, \\lnot \\lnot p, p, p\\land (p\\lor p)\\lor p\\vdash r\\lor \\lnot r, (r\\equiv s)\\supset s\\supset s \\) "
     " \\( \\lnot (p\\equiv q)\\supset s\\land s, p\\land (p\\lor p)\\lor p\\vdash r\\lor \\lnot r, (r\\equiv s)\\supset s\\supset s, \\lnot \\lnot p, p \\) "
     " \\( \\lnot (p\\equiv q)\\supset s\\land s, \\lnot \\lnot p\\equiv p, p\\land (p\\lor p)\\vdash r\\lor \\lnot r, (r\\equiv s)\\supset s\\supset s \\) "
     " \\( \\lnot (p\\equiv q)\\supset s\\land s, \\lnot \\lnot p\\equiv p, p\\vdash r\\lor \\lnot r, (r\\equiv s)\\supset s\\supset s \\) "
     " \\( \\lnot (p\\equiv q)\\supset s\\land s, \\lnot \\lnot p\\equiv p, p\\land (p\\lor p)\\lor p\\vdash (r\\equiv s)\\supset s\\supset s, r, \\lnot r \\) "
     " \\( \\lnot (p\\equiv q)\\supset s\\land s, \\lnot \\lnot p\\equiv p, p\\land (p\\lor p)\\lor p, r\\equiv s\\vdash r\\lor \\lnot r, s\\supset s \\) " ]
  :wrong [
    ["\\(  \\lnot \\lnot p\\equiv p, p\\land (p\\lor p)\\lor p, \\lnot (p\\equiv q)\\supset s, s \\vdash r\\lor \\lnot r, (r\\equiv s)\\supset s\\supset s \\)"
     "precedencia!"]
    ["\\( \\lnot (p\\equiv q)\\supset s\\land s,  p\\land (p\\lor p)\\lor p\\vdash r\\lor \\lnot r, (r\\equiv s)\\supset s\\supset s, \\lnot p\\equiv p\\)"
     "precedencia!"]
    ["\\( \\lnot (p\\equiv q)\\supset s\\land s, \\lnot \\lnot p\\equiv p, p\\land (p\\lor p)\\lor p, (r\\equiv s)\\supset s\\vdash r\\lor \\lnot r,  s \\)"
     "balról jobbra szabály"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( s\\lor s\\land (p\\lor s), \\lnot (q\\supset q)\\vdash (p\\supset s)\\lor (r\\land s\\supset q), \\lnot s\\equiv r\\supset r\\land p \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( s, \\lnot (q\\supset q)\\vdash (p\\supset s)\\lor (r\\land s\\supset q), \\lnot s\\equiv r\\supset r\\land p \\) "
     " \\( s\\land (p\\lor s), \\lnot (q\\supset q)\\vdash (p\\supset s)\\lor (r\\land s\\supset q), \\lnot s\\equiv r\\supset r\\land p \\) "
     " \\( s\\lor s\\land (p\\lor s)\\vdash (p\\supset s)\\lor (r\\land s\\supset q), \\lnot s\\equiv r\\supset r\\land p, q\\supset q \\) "
     " \\( s\\lor s\\land (p\\lor s), \\lnot (q\\supset q)\\vdash \\lnot s\\equiv r\\supset r\\land p, p\\supset s, r\\land s\\supset q \\) "
     " \\( s\\lor s\\land (p\\lor s), \\lnot (q\\supset q), \\lnot s\\vdash (p\\supset s)\\lor (r\\land s\\supset q), r\\supset r\\land p \\) "
     " \\( s\\lor s\\land (p\\lor s), \\lnot (q\\supset q), r\\supset r\\land p\\vdash (p\\supset s)\\lor (r\\land s\\supset q), \\lnot s \\) " ]
  :wrong [
    ["\\(  \\lnot (q\\supset q), s\\lor s, (p\\lor s)\\vdash (p\\supset s)\\lor (r\\land s\\supset q), \\lnot s\\equiv r\\supset r\\land p \\)"
     "precedencia!"]
    ["\\( s\\lor s\\land (p\\lor s), \\lnot (q\\supset q), s\\equiv r\\supset r\\land p\\vdash (p\\supset s)\\lor (r\\land s\\supset q) \\)"
     "precedencia!"]]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( \\lnot r, (\\lnot p\\equiv s)\\lor r, \\lnot (r\\equiv \\lnot s)\\land q\\vdash r\\lor \\lnot \\lnot s, r\\supset \\lnot s \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( (\\lnot p\\equiv s)\\lor r, \\lnot (r\\equiv \\lnot s)\\land q\\vdash r\\lor \\lnot \\lnot s, r\\supset \\lnot s, r \\) "
     " \\( \\lnot r, \\lnot p\\equiv s, \\lnot (r\\equiv \\lnot s)\\land q\\vdash r\\lor \\lnot \\lnot s, r\\supset \\lnot s \\) "
     " \\( \\lnot r, r, \\lnot (r\\equiv \\lnot s)\\land q\\vdash r\\lor \\lnot \\lnot s, r\\supset \\lnot s \\) "
     " \\( \\lnot r, (\\lnot p\\equiv s)\\lor r, \\lnot (r\\equiv \\lnot s), q\\vdash r\\lor \\lnot \\lnot s, r\\supset \\lnot s \\) "
     " \\( \\lnot r, (\\lnot p\\equiv s)\\lor r, \\lnot (r\\equiv \\lnot s)\\land q\\vdash r\\supset \\lnot s, r, \\lnot \\lnot s \\) "
     " \\( \\lnot r, (\\lnot p\\equiv s)\\lor r, \\lnot (r\\equiv \\lnot s)\\land q, r\\vdash r\\lor \\lnot \\lnot s, \\lnot s \\) "
]
  :wrong [
    ["\\( \\lnot r, (\\lnot p\\equiv s)\\lor r, \\vdash r\\lor \\lnot \\lnot s, r\\supset \\lnot s, (r\\equiv \\lnot s)\\land q \\)"
     "precedencia!"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( (q\\lor (r\\equiv p))\\lor q\\land p, (q\\supset q)\\land p\\equiv p\\supset p, (p\\supset \\lnot r)\\supset s\\land r\\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( q\\lor (r\\equiv p), (q\\supset q)\\land p\\equiv p\\supset p, (p\\supset \\lnot r)\\supset s\\land r\\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s \\) "
     " \\( q\\land p, (q\\supset q)\\land p\\equiv p\\supset p, (p\\supset \\lnot r)\\supset s\\land r\\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s \\) "
     " \\( (q\\lor (r\\equiv p))\\lor q\\land p, (q\\supset q)\\land p, p\\supset p, (p\\supset \\lnot r)\\supset s\\land r\\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s \\) "
     " \\( (q\\lor (r\\equiv p))\\lor q\\land p, (p\\supset \\lnot r)\\supset s\\land r\\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s, (q\\supset q)\\land p, p\\supset p \\) "
     " \\( (q\\lor (r\\equiv p))\\lor q\\land p, (q\\supset q)\\land p\\equiv p\\supset p\\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s, p\\supset \\lnot r \\) "
     " \\( (q\\lor (r\\equiv p))\\lor q\\land p, (q\\supset q)\\land p\\equiv p\\supset p, s\\land r\\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s \\) "
     " \\( (q\\lor (r\\equiv p))\\lor q\\land p, (q\\supset q)\\land p\\equiv p\\supset p, (p\\supset \\lnot r)\\supset s\\land r, q\\vdash (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s, r \\) "
     " \\( (q\\lor (r\\equiv p))\\lor q\\land p, (q\\supset q)\\land p\\equiv p\\supset p, (p\\supset \\lnot r)\\supset s\\land r\\vdash q\\supset r, r\\lor p\\lor s, s\\equiv s \\) "
     " \\( (q\\lor (r\\equiv p))\\lor q\\land p, (q\\supset q)\\land p\\equiv p\\supset p, (p\\supset \\lnot r)\\supset s\\land r\\vdash q\\supset r, r\\lor p\\lor s, s\\lor r \\) "
     " \\( (q\\lor (r\\equiv p))\\lor q\\land p, (q\\supset q)\\land p\\equiv p\\supset p, (p\\supset \\lnot r)\\supset s\\land r\\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r, p\\lor s \\) " ]
  :wrong [
    ["\\( (q\\supset q)\\land p\\equiv p\\supset p, (p\\supset \\lnot r)\\supset s\\land r, (q\\lor (r\\equiv p))\\lor q, p \\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s \\)"
     "precedencia!"]
    ["\\( (q\\lor (r\\equiv p))\\lor q\\land p,  (p\\supset \\lnot r)\\supset s\\land r, (q\\supset q), p\\equiv p\\supset p \\vdash q\\supset r, (s\\equiv s)\\land (s\\lor r), r\\lor p\\lor s \\)"
     "precedencia!"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( s\\supset (q\\lor (p\\equiv p))\\lor q, r\\land (s\\supset r), \\lnot r\\vdash \\lnot (((p\\equiv q)\\supset r)\\land s), p\\equiv q \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( r\\land (s\\supset r), \\lnot r\\vdash \\lnot (((p\\equiv q)\\supset r)\\land s), p\\equiv q, s \\) "
     " \\( (q\\lor (p\\equiv p))\\lor q, r\\land (s\\supset r), \\lnot r\\vdash \\lnot (((p\\equiv q)\\supset r)\\land s), p\\equiv q \\) "
     " \\( s\\supset (q\\lor (p\\equiv p))\\lor q, r, s\\supset r, \\lnot r\\vdash \\lnot (((p\\equiv q)\\supset r)\\land s), p\\equiv q \\) "
     " \\( s\\supset (q\\lor (p\\equiv p))\\lor q, r\\land (s\\supset r)\\vdash \\lnot (((p\\equiv q)\\supset r)\\land s), p\\equiv q, r \\) "
     " \\( s\\supset (q\\lor (p\\equiv p))\\lor q, r\\land (s\\supset r), \\lnot r, ((p\\equiv q)\\supset r)\\land s\\vdash p\\equiv q \\) "
     " \\( s\\supset (q\\lor (p\\equiv p))\\lor q, r\\land (s\\supset r), \\lnot r, p\\vdash \\lnot (((p\\equiv q)\\supset r)\\land s), q \\) "
     " \\( s\\supset (q\\lor (p\\equiv p))\\lor q, r\\land (s\\supset r), \\lnot r, q\\vdash \\lnot (((p\\equiv q)\\supset r)\\land s), p \\) " ]
  :wrong [
    ["\\( r\\land (s\\supset r), \\lnot r, q\\vdash \\lnot (((p\\equiv q)\\supset r)\\land s), p\\equiv q \\)"
     "precedencia!"] ]}
 {:question "Válassza ki a felsoroltak közül azokat a szekventeket, melyek a  \\( s\\equiv s\\equiv q, (s\\equiv s)\\supset r\\vdash p\\equiv r\\equiv q\\supset s, (r\\supset r)\\lor (s\\lor s)\\land p \\)  szekvent premissza-szekventjei lehetnek!"
  :good [
    " \\( s, s\\equiv q, (s\\equiv s)\\supset r\\vdash p\\equiv r\\equiv q\\supset s, (r\\supset r)\\lor (s\\lor s)\\land p \\) "
     " \\( (s\\equiv s)\\supset r\\vdash p\\equiv r\\equiv q\\supset s, (r\\supset r)\\lor (s\\lor s)\\land p, s, s\\equiv q \\) "
     " \\( s\\equiv s\\equiv q\\vdash p\\equiv r\\equiv q\\supset s, (r\\supset r)\\lor (s\\lor s)\\land p, s\\equiv s \\) "
     " \\( s\\equiv s\\equiv q, r\\vdash p\\equiv r\\equiv q\\supset s, (r\\supset r)\\lor (s\\lor s)\\land p \\) "
     " \\( s\\equiv s\\equiv q, (s\\equiv s)\\supset r, p\\vdash (r\\supset r)\\lor (s\\lor s)\\land p, r\\equiv q\\supset s \\) "
     " \\( s\\equiv s\\equiv q, (s\\equiv s)\\supset r, r\\equiv q\\supset s\\vdash (r\\supset r)\\lor (s\\lor s)\\land p, p \\) "
     " \\( s\\equiv s\\equiv q, (s\\equiv s)\\supset r\\vdash p\\equiv r\\equiv q\\supset s, r\\supset r, (s\\lor s)\\land p \\) " ]
  :wrong [
    ["\\( (s\\equiv s)\\supset r, s\\equiv s, q \\vdash p\\equiv r\\equiv q\\supset s, (r\\supset r)\\lor (s\\lor s)\\land p \\)"
     "precedencia!"]
    ["\\( s\\equiv s\\equiv q, (s\\equiv s)\\supset r, p\\equiv r\\equiv q \\vdash (r\\supset r)\\lor (s\\lor s)\\land p, s \\)"
     "precedencia!"]]}]
