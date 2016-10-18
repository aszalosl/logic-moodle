[{:question "Jelölje meg a kielégíthetetlen formulákat!"
  :good [
    "\\( p\\land \\lnot (p\\lor q) \\)"
    "\\( \\lnot (q\\land p\\supset q) \\)"
    "\\( \\lnot (p\\lor q)\\land q \\)"
    "\\( \\lnot (p\\supset q\\supset p) \\)"
    "\\( (p\\lor p)\\land \\lnot p \\)"
    "\\( (p\\land p)\\land \\lnot p \\)"
    "\\( \\lnot q\\equiv q\\lor q \\)"
    "\\( q\\land \\lnot q\\land p \\)"
    "\\( p\\lor p\\equiv \\lnot p \\)"
    "\\( \\lnot (q\\lor (q\\equiv q)) \\)"
    "\\( \\lnot q\\land q\\land p \\)"
    "\\( \\lnot (q\\lor q)\\land q \\)"
    "\\( (p\\land p)\\land \\lnot p \\)"
    "\\( \\lnot (q\\land q)\\land q \\)"
    "\\( (p\\land \\lnot p)\\land p \\)"
    "\\( (p\\equiv \\lnot p)\\land q \\)"
    "\\( p\\land \\lnot p\\land q \\)"
    "\\( \\lnot (p\\lor (p\\supset q)) \\)"
    "\\( \\lnot (q\\supset q)\\land p \\)"
    "\\( \\lnot (p\\supset q\\lor p) \\)"
    "\\( \\lnot (\\lnot p\\lor p) \\)"
    "\\( p\\equiv \\lnot (p\\land p) \\)"
    "\\( q\\land (p\\equiv \\lnot p) \\)"
    "\\( \\lnot (q\\supset p\\supset q) \\)"
    "\\( q\\land (\\lnot q\\equiv q) \\)"
    "\\( q\\land p\\land \\lnot q \\)"
    "\\( \\lnot (q\\supset (p\\equiv p)) \\)"
    "\\( \\lnot (q\\lor (q\\supset p)) \\)"
    "\\( \\lnot (q\\supset q)\\land q \\)"
    "\\( \\lnot p\\equiv p \\)"
  ]
  :wrong [
    ["\\( \\lnot q\\land (q\\equiv p) \\)" " a formula eredetije: \\( (\\lnot q\\land (q\\equiv p)) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot q\\equiv p\\supset q \\)" " a formula eredetije: \\( (\\lnot q\\equiv (p\\supset q)) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( q\\equiv \\lnot q\\land p \\)" " a formula eredetije: \\( (q\\equiv (\\lnot q\\land p)) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot p\\land (q\\equiv p) \\)" " a formula eredetije: \\( (\\lnot p\\land (q\\equiv p)) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot q\\land p\\equiv q \\)" " a formula eredetije: \\( ((\\lnot q\\land p)\\equiv q) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot (q\\lor q\\supset p) \\)" " a formula eredetije: \\( \\lnot ((q\\lor q)\\supset p) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( \\lnot (q\\supset p)\\land q \\)" " a formula eredetije: \\( (\\lnot (q\\supset p)\\land q) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( (q\\equiv \\lnot p)\\land q \\)" " a formula eredetije: \\( ((q\\equiv \\lnot p)\\land q) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( \\lnot (p\\lor (p\\equiv q)) \\)" " a formula eredetije: \\( \\lnot (p\\lor (p\\equiv q)) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( \\lnot (p\\equiv p\\lor q) \\)" " a formula eredetije: \\( \\lnot (p\\equiv (p\\lor q)) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( p\\supset \\lnot (p\\land p) \\)" " a formula eredetije: \\( (p\\supset \\lnot (p\\land p)) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( p\\supset \\lnot (p\\land p) \\)" " a formula eredetije: \\( (p\\supset \\lnot (p\\land p)) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( \\lnot ((q\\equiv q)\\supset p) \\)" " a formula eredetije: \\( \\lnot ((q\\equiv q)\\supset p) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( (p\\equiv \\lnot p)\\equiv p \\)" " a formula eredetije: \\( ((p\\equiv \\lnot p)\\equiv p) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( p\\lor q\\supset \\lnot p \\)" " a formula eredetije: \\( ((p\\lor q)\\supset \\lnot p) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( \\lnot (q\\land p)\\land p \\)" " a formula eredetije: \\( (\\lnot (q\\land p)\\land p) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( \\lnot (q\\lor (p\\equiv q)) \\)" " a formula eredetije: \\( \\lnot (q\\lor (p\\equiv q)) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( p\\supset \\lnot q\\equiv p \\)" " a formula eredetije: \\( ((p\\supset \\lnot q)\\equiv p) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( p\\equiv \\lnot (q\\land p) \\)" " a formula eredetije: \\( (p\\equiv \\lnot (q\\land p)) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( \\lnot ((p\\supset q)\\lor q) \\)" " a formula eredetije: \\( \\lnot ((p\\supset q)\\lor q) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( \\lnot ((q\\lor q)\\land q) \\)" " a formula eredetije: \\( \\lnot ((q\\lor q)\\land q) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( \\lnot (q\\equiv q)\\equiv q \\)" " a formula eredetije: \\( (\\lnot (q\\equiv q)\\equiv q) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( \\lnot ((q\\equiv q)\\supset q) \\)" " a formula eredetije: \\( \\lnot ((q\\equiv q)\\supset q) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( q\\supset \\lnot p\\land p \\)" " a formula eredetije: \\( (q\\supset (\\lnot p\\land p)) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( q\\supset \\lnot (p\\lor q) \\)" " a formula eredetije: \\( (q\\supset \\lnot (p\\lor q)) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( p\\lor p\\equiv \\lnot q \\)" " a formula eredetije: \\( ((p\\lor p)\\equiv \\lnot q) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( \\lnot q\\equiv p\\lor p \\)" " a formula eredetije: \\( (\\lnot q\\equiv (p\\lor p)) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( q\\supset \\lnot q\\equiv p \\)" " a formula eredetije: \\( ((q\\supset \\lnot q)\\equiv p) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( q\\supset \\lnot q\\equiv p \\)" " a formula eredetije: \\( ((q\\supset \\lnot q)\\equiv p) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( \\lnot q\\equiv p \\)" " a formula eredetije: \\( (\\lnot q\\equiv p) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( q\\supset q\\land \\lnot p \\)" " a formula eredetije: \\( (q\\supset (q\\land \\lnot p)) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( \\lnot ((p\\equiv q)\\land q) \\)" " a formula eredetije: \\( \\lnot ((p\\equiv q)\\land q) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( p\\supset \\lnot (q\\lor q) \\)" " a formula eredetije: \\( (p\\supset \\lnot (q\\lor q)) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( q\\supset \\lnot (q\\equiv p) \\)" " a formula eredetije: \\( (q\\supset \\lnot (q\\equiv p)) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( q\\land p\\supset \\lnot p \\)" " a formula eredetije: \\( ((q\\land p)\\supset \\lnot p) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( p\\land ((q\\equiv p)\\equiv p) \\)" " a formula eredetije: \\( (p\\land ((q\\equiv p)\\equiv p)) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( (p\\supset q)\\land q\\land p \\)" " a formula eredetije: \\( ((p\\supset q)\\land (q\\land p)) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( p\\land (p\\supset p\\land q) \\)" " a formula eredetije: \\( (p\\land (p\\supset (p\\land q))) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( \\lnot \\lnot p\\land q \\)" " a formula eredetije: \\( (\\lnot \\lnot p\\land q) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( (p\\land (p\\lor q))\\land q \\)" " a formula eredetije: \\( ((p\\land (p\\lor q))\\land q) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( q\\land (p\\supset p)\\equiv p \\)" " a formula eredetije: \\( ((q\\land (p\\supset p))\\equiv p) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( (q\\equiv p)\\land (p\\supset p) \\)" " a formula eredetije: \\( ((q\\equiv p)\\land (p\\supset p)) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( (q\\equiv p)\\land (q\\equiv p) \\)" " a formula eredetije: \\( ((q\\equiv p)\\land (q\\equiv p)) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( p\\equiv \\lnot \\lnot q \\)" " a formula eredetije: \\( (p\\equiv \\lnot \\lnot q) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( \\lnot \\lnot p\\equiv q \\)" " a formula eredetije: \\( (\\lnot \\lnot p\\equiv q) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( (p\\land p\\supset q)\\land q \\)" " a formula eredetije: \\( (((p\\land p)\\supset q)\\land q) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( q\\equiv p\\lor (q\\equiv q) \\)" " a formula eredetije: \\( (q\\equiv (p\\lor (q\\equiv q))) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( (q\\equiv q\\lor q)\\supset q \\)" " a formula eredetije: \\( ((q\\equiv (q\\lor q))\\supset q) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( ((p\\supset q)\\lor q)\\land q \\)" " a formula eredetije: \\( (((p\\supset q)\\lor q)\\land q) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( \\lnot q\\lor q\\supset q \\)" " a formula eredetije: \\( ((\\lnot q\\lor q)\\supset q) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( (q\\land q)\\land p\\equiv p \\)" " a formula eredetije: \\( (((q\\land q)\\land p)\\equiv p) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( p\\land p\\land p\\supset q \\)" " a formula eredetije: \\( ((p\\land (p\\land p))\\supset q) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( (q\\equiv p\\land p)\\lor q \\)" " a formula eredetije: \\( ((q\\equiv (p\\land p))\\lor q) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( (p\\supset p)\\land (p\\supset q) \\)" " a formula eredetije: \\( ((p\\supset p)\\land (p\\supset q)) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( p\\supset q\\lor q\\land p \\)" " a formula eredetije: \\( (p\\supset (q\\lor (q\\land p))) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( \\lnot (q\\land p)\\supset p \\)" " a formula eredetije: \\( (\\lnot (q\\land p)\\supset p) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( (q\\equiv q\\land q)\\land p \\)" " a formula eredetije: \\( ((q\\equiv (q\\land q))\\land p) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( p\\land (p\\equiv p\\supset p) \\)" " a formula eredetije: \\( (p\\land (p\\equiv (p\\supset p))) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( p\\lor \\lnot p\\supset p \\)" " a formula eredetije: \\( ((p\\lor \\lnot p)\\supset p) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( p\\lor p\\land (q\\lor p) \\)" " a formula eredetije: \\( (p\\lor (p\\land (q\\lor p))) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( q\\supset q\\land (q\\equiv p) \\)" " a formula eredetije: \\( (q\\supset (q\\land (q\\equiv p))) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( p\\land p\\equiv p\\lor q \\)" " a formula eredetije: \\( ((p\\land p)\\equiv (p\\lor q)) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( (p\\supset p)\\supset q\\supset p \\)" " a formula eredetije: \\( ((p\\supset p)\\supset (q\\supset p)) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( p\\equiv (p\\equiv q)\\supset p \\)" " a formula eredetije: \\( (p\\equiv ((p\\equiv q)\\supset p)) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( q\\supset \\lnot p\\supset p \\)" " a formula eredetije: \\( (q\\supset (\\lnot p\\supset p)) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( (p\\land q\\equiv q)\\supset p \\)" " a formula eredetije: \\( (((p\\land q)\\equiv q)\\supset p) \\)<br>az igazságtábla főoszlopa: 0111"]
    ["\\( p\\land p\\lor q\\lor q \\)" " a formula eredetije: \\( ((p\\land p)\\lor (q\\lor q)) \\)<br>az igazságtábla főoszlopa: 0111"]
    ["\\( q\\land q\\lor p \\)" " a formula eredetije: \\( ((q\\land q)\\lor p) \\)<br>az igazságtábla főoszlopa: 0111"]
    ["\\( (p\\lor p\\lor q)\\lor p \\)" " a formula eredetije: \\( ((p\\lor (p\\lor q))\\lor p) \\)<br>az igazságtábla főoszlopa: 0111"]
    ["\\( p\\lor (q\\lor p)\\lor p \\)" " a formula eredetije: \\( (p\\lor ((q\\lor p)\\lor p)) \\)<br>az igazságtábla főoszlopa: 0111"]
    ["\\( (\\lnot p\\equiv p)\\supset q \\)" " a formula eredetije: \\( ((\\lnot p\\equiv p)\\supset q) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\lor p)\\lor (p\\equiv q) \\)" " a formula eredetije: \\( ((q\\lor p)\\lor (p\\equiv q)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( q\\land p\\equiv p\\land q \\)" " a formula eredetije: \\( ((q\\land p)\\equiv (p\\land q)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\equiv p)\\supset (p\\equiv q) \\)" " a formula eredetije: \\( ((q\\equiv p)\\supset (p\\equiv q)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\equiv p)\\land (p\\supset p) \\)" " a formula eredetije: \\( ((p\\equiv p)\\land (p\\supset p)) \\)<br>az igazságtábla főoszlopa: 1111"]
]}]
