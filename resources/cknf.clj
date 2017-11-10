[{:question "A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\( \\lnot (r\\land ((\\lnot q\\lor r)\\lor p)) \\) formulának teljes konjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 10101010 "
  :good [
    "\\( (p \\lor q \\lor \\lnot r) \\)"
    "\\( (p \\lor \\lnot q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor \\lnot r) \\)"
  ]
  :wrong [
    "\\( (p \\lor q \\lor r) \\)"
    "\\( (p \\lor \\lnot q \\lor r) \\)"
    "\\( (\\lnot p \\lor q \\lor r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\( r\\supset r\\equiv (p\\lor p\\land p)\\lor q \\) formulának teljes konjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 00111111 "
  :good [
    "\\( (p \\lor q \\lor r) \\)"
    "\\( (p \\lor q \\lor \\lnot r) \\)"
  ]
  :wrong [
    "\\( (p \\lor \\lnot q \\lor r) \\)"
    "\\( (p \\lor \\lnot q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor q \\lor r) \\)"
    "\\( (\\lnot p \\lor q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\( q\\lor p\\land (p\\supset p)\\lor r\\lor q \\) formulának teljes konjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 01111111 "
  :good [
    "\\( (p \\lor q \\lor r) \\)"
  ]
  :wrong [
    "\\( (p \\lor q \\lor \\lnot r) \\)"
    "\\( (p \\lor \\lnot q \\lor r) \\)"
    "\\( (p \\lor \\lnot q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor q \\lor r) \\)"
    "\\( (\\lnot p \\lor q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\( ((q\\supset r\\equiv r)\\equiv q\\lor p)\\supset r \\) formulának teljes konjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 01011101 "
  :good [
    "\\( (p \\lor q \\lor r) \\)"
    "\\( (p \\lor \\lnot q \\lor r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor r) \\)"
  ]
  :wrong [
    "\\( (p \\lor q \\lor \\lnot r) \\)"
    "\\( (p \\lor \\lnot q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor q \\lor r) \\)"
    "\\( (\\lnot p \\lor q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\( q\\supset q\\lor p\\land \\lnot (p\\equiv r) \\) formulának teljes konjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 11111111 "
  :good [
  ]
  :wrong [
    "\\( (p \\lor q \\lor r) \\)"
    "\\( (p \\lor q \\lor \\lnot r) \\)"
    "\\( (p \\lor \\lnot q \\lor r) \\)"
    "\\( (p \\lor \\lnot q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor q \\lor r) \\)"
    "\\( (\\lnot p \\lor q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\( (q\\equiv r\\supset r)\\lor (r\\supset (q\\equiv p)) \\) formulának teljes konjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 11111011 "
  :good [
    "\\( (\\lnot p \\lor q \\lor \\lnot r) \\)"
  ]
  :wrong [
    "\\( (p \\lor q \\lor r) \\)"
    "\\( (p \\lor q \\lor \\lnot r) \\)"
    "\\( (p \\lor \\lnot q \\lor r) \\)"
    "\\( (p \\lor \\lnot q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor q \\lor r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\( r\\land q\\lor \\lnot p\\equiv p\\supset p \\) formulának teljes konjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 11110001 "
  :good [
    "\\( (\\lnot p \\lor q \\lor r) \\)"
    "\\( (\\lnot p \\lor q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor r) \\)"
  ]
  :wrong [
    "\\( (p \\lor q \\lor r) \\)"
    "\\( (p \\lor q \\lor \\lnot r) \\)"
    "\\( (p \\lor \\lnot q \\lor r) \\)"
    "\\( (p \\lor \\lnot q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\( ((\\lnot r\\equiv r)\\lor q)\\lor q\\land p \\) formulának teljes konjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 00110011 "
  :good [
    "\\( (p \\lor q \\lor r) \\)"
    "\\( (p \\lor q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor q \\lor r) \\)"
    "\\( (\\lnot p \\lor q \\lor \\lnot r) \\)"
  ]
  :wrong [
    "\\( (p \\lor \\lnot q \\lor r) \\)"
    "\\( (p \\lor \\lnot q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi diszjunkciók szerepelnek a \\( (\\lnot p\\supset p\\land p)\\lor q\\supset r \\) formulának teljes konjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 11010101 "
  :good [
    "\\( (p \\lor \\lnot q \\lor r) \\)"
    "\\( (\\lnot p \\lor q \\lor r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor r) \\)"
  ]
  :wrong [
    "\\( (p \\lor q \\lor r) \\)"
    "\\( (p \\lor q \\lor \\lnot r) \\)"
    "\\( (p \\lor \\lnot q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor q \\lor \\lnot r) \\)"
    "\\( (\\lnot p \\lor \\lnot q \\lor \\lnot r) \\)"
  ]}]
