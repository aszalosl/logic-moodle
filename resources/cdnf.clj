[{:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( \\lnot (r\\lor p\\lor \\lnot \\lnot q) \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 10000000 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
  ]
  :wrong [
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( (\\lnot r\\land p)\\land (r\\equiv q\\equiv r) \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 00000010 "
  :good [
    "\\( (p \\land q \\land \\lnot r) \\)"
  ]
  :wrong [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( (r\\supset r)\\land ((r\\lor p\\supset q)\\lor q) \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 10110011 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( p\\supset (p\\supset q)\\supset q\\supset (p\\equiv r) \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 11111101 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (p \\land q \\land \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( (q\\supset p\\land (r\\equiv r))\\land r\\land q \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 00000001 "
  :good [
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( q\\lor (r\\supset q\\equiv p\\lor p\\supset r) \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 10110011 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( p\\land q\\lor (r\\equiv q)\\supset \\lnot p \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 11110100 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
  ]
  :wrong [
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( \\lnot \\lnot ((r\\land (q\\equiv p))\\land r) \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 01000001 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( (p\\lor q)\\lor \\lnot (r\\supset q)\\lor p \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 01111111 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( p\\equiv (r\\land q)\\land (q\\lor p\\land r) \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 11100001 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( (q\\supset q)\\lor r\\supset p\\supset q\\equiv r \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 01011001 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( (\\lnot (r\\supset p)\\lor \\lnot r)\\lor q \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 11111011 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (p \\land \\lnot q \\land r) \\)"
  ]}
 {:question "A felsoroltak közül mely elemi konjunkciók szerepelnek a \\( (q\\equiv r)\\land \\lnot \\lnot p\\equiv p \\) formulának teljes diszjunktív normálformájában?"
  :feedback "a formula főoszlopának tartalma: 11111001 "
  :good [
    "\\( (\\lnot p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land \\lnot q \\land r) \\)"
    "\\( (\\lnot p \\land q \\land \\lnot r) \\)"
    "\\( (\\lnot p \\land q \\land r) \\)"
    "\\( (p \\land \\lnot q \\land \\lnot r) \\)"
    "\\( (p \\land q \\land r) \\)"
  ]
  :wrong [
    "\\( (p \\land \\lnot q \\land r) \\)"
    "\\( (p \\land q \\land \\lnot r) \\)"
  ]}]
