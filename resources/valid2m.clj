[{:question "Jelölje meg az érvényes formulákat!"
  :good [
    "\\( q\\supset (q\\lor p)\\land q \\)"
    "\\( p\\land (p\\supset p)\\equiv p \\)"
    "\\( (q\\equiv q)\\land (p\\supset p) \\)"
    "\\( p\\land q\\supset (p\\equiv p) \\)"
    "\\( p\\land p\\supset q\\supset p \\)"
    "\\( q\\lor (p\\supset p\\lor p) \\)"
    "\\( q\\supset q\\land (q\\equiv q) \\)"
    "\\( p\\supset p \\)"
    "\\( q\\supset p\\lor q\\land q \\)"
    "\\( p\\supset (p\\supset p)\\lor p \\)"
    "\\( q\\supset (p\\supset p)\\lor q \\)"
    "\\( p\\land p\\supset q\\supset q \\)"
    "\\( p\\land \\lnot q\\supset p \\)"
    "\\( p\\equiv (q\\equiv q)\\supset p \\)"
    "\\( q\\lor q\\lor (p\\equiv p) \\)"
    "\\( (p\\supset q)\\lor p\\land p \\)"
    "\\( q\\equiv q\\land (p\\supset p) \\)"
    "\\( (q\\supset q\\lor p)\\lor q \\)"
    "\\( q\\supset q\\land q\\supset q \\)"
    "\\( p\\lor q\\lor (p\\equiv q) \\)"
    "\\( p\\supset q\\supset q\\land q \\)"
    "\\( p\\supset q\\lor q\\supset p \\)"
    "\\( p\\lor p\\equiv p\\lor p \\)"
    "\\( p\\supset q\\supset p\\land q \\)"
    "\\( p\\land p\\lor \\lnot p \\)"
    "\\( q\\supset \\lnot p\\supset q \\)"
    "\\( q\\lor (p\\land q\\equiv q) \\)"
    "\\( \\lnot (q\\supset q)\\supset p \\)"
    "\\( (p\\equiv p)\\land (p\\equiv p) \\)"
    "\\( \\lnot p\\land p\\supset p \\)"
  ]
  :wrong [
    ["\\( \\lnot q\\land q\\land q \\)" " a formula eredetije: \\( (\\lnot q\\land (q\\land q)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( q\\land (p\\equiv \\lnot p) \\)" " a formula eredetije: \\( (q\\land (p\\equiv \\lnot p)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\equiv q)\\land p \\)" " a formula eredetije: \\( (\\lnot (q\\equiv q)\\land p) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot p\\land p\\land q \\)" " a formula eredetije: \\( (\\lnot p\\land (p\\land q)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot ((p\\supset p)\\lor q) \\)" " a formula eredetije: \\( \\lnot ((p\\supset p)\\lor q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot ((p\\equiv q)\\supset p) \\)" " a formula eredetije: \\( \\lnot ((p\\equiv q)\\supset p) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot ((q\\supset p)\\supset p) \\)" " a formula eredetije: \\( \\lnot ((q\\supset p)\\supset p) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( (p\\equiv q)\\land \\lnot q \\)" " a formula eredetije: \\( ((p\\equiv q)\\land \\lnot q) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot (q\\lor p) \\)" " a formula eredetije: \\( \\lnot (q\\lor p) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot (p\\lor q\\lor p) \\)" " a formula eredetije: \\( \\lnot (p\\lor (q\\lor p)) \\)<br>az igazságtábla főoszlopa: 1000"]
    ["\\( q\\land \\lnot p \\)" " a formula eredetije: \\( (q\\land \\lnot p) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( (\\lnot p\\land q)\\land q \\)" " a formula eredetije: \\( ((\\lnot p\\land q)\\land q) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( p\\land q\\equiv \\lnot q \\)" " a formula eredetije: \\( ((p\\land q)\\equiv \\lnot q) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( \\lnot (q\\land p\\equiv q) \\)" " a formula eredetije: \\( \\lnot ((q\\land p)\\equiv q) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( \\lnot (q\\supset p) \\)" " a formula eredetije: \\( \\lnot (q\\supset p) \\)<br>az igazságtábla főoszlopa: 0100"]
    ["\\( \\lnot (p\\land p\\lor p) \\)" " a formula eredetije: \\( \\lnot ((p\\land p)\\lor p) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( p\\equiv q\\equiv \\lnot q \\)" " a formula eredetije: \\( (p\\equiv (q\\equiv \\lnot q)) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( (p\\supset p)\\land \\lnot p \\)" " a formula eredetije: \\( ((p\\supset p)\\land \\lnot p) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( p\\supset p\\equiv \\lnot p \\)" " a formula eredetije: \\( ((p\\supset p)\\equiv \\lnot p) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( \\lnot ((q\\lor p)\\land p) \\)" " a formula eredetije: \\( \\lnot ((q\\lor p)\\land p) \\)<br>az igazságtábla főoszlopa: 1100"]
    ["\\( p\\land \\lnot q\\land p \\)" " a formula eredetije: \\( (p\\land (\\lnot q\\land p)) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( \\lnot (p\\equiv q\\land p) \\)" " a formula eredetije: \\( \\lnot (p\\equiv (q\\land p)) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( \\lnot (q\\land p)\\equiv p \\)" " a formula eredetije: \\( (\\lnot (q\\land p)\\equiv p) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( \\lnot (p\\supset (p\\equiv q)) \\)" " a formula eredetije: \\( \\lnot (p\\supset (p\\equiv q)) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( p\\land \\lnot (q\\land p) \\)" " a formula eredetije: \\( (p\\land \\lnot (q\\land p)) \\)<br>az igazságtábla főoszlopa: 0010"]
    ["\\( \\lnot ((p\\supset p)\\supset q) \\)" " a formula eredetije: \\( \\lnot ((p\\supset p)\\supset q) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( q\\supset (\\lnot p\\equiv p) \\)" " a formula eredetije: \\( (q\\supset (\\lnot p\\equiv p)) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( q\\supset \\lnot q\\land q \\)" " a formula eredetije: \\( (q\\supset (\\lnot q\\land q)) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( (q\\supset q)\\land \\lnot q \\)" " a formula eredetije: \\( ((q\\supset q)\\land \\lnot q) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( q\\supset \\lnot (p\\lor q) \\)" " a formula eredetije: \\( (q\\supset \\lnot (p\\lor q)) \\)<br>az igazságtábla főoszlopa: 1010"]
    ["\\( \\lnot q\\equiv p\\land p \\)" " a formula eredetije: \\( (\\lnot q\\equiv (p\\land p)) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( \\lnot (p\\equiv q\\land q) \\)" " a formula eredetije: \\( \\lnot (p\\equiv (q\\land q)) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( \\lnot (p\\equiv q\\lor q) \\)" " a formula eredetije: \\( \\lnot (p\\equiv (q\\lor q)) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( q\\equiv \\lnot (p\\land p) \\)" " a formula eredetije: \\( (q\\equiv \\lnot (p\\land p)) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( \\lnot q\\equiv p\\land p \\)" " a formula eredetije: \\( (\\lnot q\\equiv (p\\land p)) \\)<br>az igazságtábla főoszlopa: 0110"]
    ["\\( \\lnot (p\\supset q\\equiv p) \\)" " a formula eredetije: \\( \\lnot ((p\\supset q)\\equiv p) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( p\\land q\\supset \\lnot q \\)" " a formula eredetije: \\( ((p\\land q)\\supset \\lnot q) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( \\lnot (p\\land p\\land q) \\)" " a formula eredetije: \\( \\lnot (p\\land (p\\land q)) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( \\lnot p\\land q\\equiv q \\)" " a formula eredetije: \\( ((\\lnot p\\land q)\\equiv q) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( \\lnot ((q\\lor q)\\land p) \\)" " a formula eredetije: \\( \\lnot ((q\\lor q)\\land p) \\)<br>az igazságtábla főoszlopa: 1110"]
    ["\\( (q\\lor (q\\equiv p))\\land p \\)" " a formula eredetije: \\( ((q\\lor (q\\equiv p))\\land p) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( (q\\land q)\\land p \\)" " a formula eredetije: \\( ((q\\land q)\\land p) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( (p\\land p)\\land (q\\equiv p) \\)" " a formula eredetije: \\( ((p\\land p)\\land (q\\equiv p)) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( p\\land ((q\\supset p)\\supset q) \\)" " a formula eredetije: \\( (p\\land ((q\\supset p)\\supset q)) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( q\\land ((q\\equiv q)\\equiv p) \\)" " a formula eredetije: \\( (q\\land ((q\\equiv q)\\equiv p)) \\)<br>az igazságtábla főoszlopa: 0001"]
    ["\\( p\\land q\\equiv p\\lor q \\)" " a formula eredetije: \\( ((p\\land q)\\equiv (p\\lor q)) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( q\\lor q\\land q\\equiv p \\)" " a formula eredetije: \\( ((q\\lor (q\\land q))\\equiv p) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( p\\equiv p\\equiv q\\equiv p \\)" " a formula eredetije: \\( (p\\equiv (p\\equiv (q\\equiv p))) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( (q\\equiv q)\\supset q\\equiv p \\)" " a formula eredetije: \\( (((q\\equiv q)\\supset q)\\equiv p) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( p\\equiv q\\lor p\\land q \\)" " a formula eredetije: \\( (p\\equiv (q\\lor (p\\land q))) \\)<br>az igazságtábla főoszlopa: 1001"]
    ["\\( \\lnot (q\\land q)\\supset q \\)" " a formula eredetije: \\( (\\lnot (q\\land q)\\supset q) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( p\\land (q\\equiv p)\\lor q \\)" " a formula eredetije: \\( ((p\\land (q\\equiv p))\\lor q) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( (q\\supset q)\\lor p\\supset q \\)" " a formula eredetije: \\( (((q\\supset q)\\lor p)\\supset q) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( (p\\equiv p)\\lor q\\supset q \\)" " a formula eredetije: \\( (((p\\equiv p)\\lor q)\\supset q) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( q\\land q\\land (p\\equiv p) \\)" " a formula eredetije: \\( (q\\land (q\\land (p\\equiv p))) \\)<br>az igazságtábla főoszlopa: 0101"]
    ["\\( (p\\supset q\\equiv q)\\equiv q \\)" " a formula eredetije: \\( (((p\\supset q)\\equiv q)\\equiv q) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( p\\supset p\\land q\\lor q \\)" " a formula eredetije: \\( (p\\supset ((p\\land q)\\lor q)) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( \\lnot p\\lor q \\)" " a formula eredetije: \\( (\\lnot p\\lor q) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( (p\\equiv q\\lor q)\\lor q \\)" " a formula eredetije: \\( ((p\\equiv (q\\lor q))\\lor q) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( q\\land q\\equiv p\\lor q \\)" " a formula eredetije: \\( ((q\\land q)\\equiv (p\\lor q)) \\)<br>az igazságtábla főoszlopa: 1101"]
    ["\\( ((p\\lor q)\\lor q)\\land p \\)" " a formula eredetije: \\( (((p\\lor q)\\lor q)\\land p) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( p\\lor (p\\supset p\\equiv p) \\)" " a formula eredetije: \\( (p\\lor ((p\\supset p)\\equiv p)) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( p\\equiv q\\lor (q\\equiv q) \\)" " a formula eredetije: \\( (p\\equiv (q\\lor (q\\equiv q))) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( (p\\supset \\lnot q)\\supset p \\)" " a formula eredetije: \\( ((p\\supset \\lnot q)\\supset p) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( (p\\lor p)\\land (p\\equiv p) \\)" " a formula eredetije: \\( ((p\\lor p)\\land (p\\equiv p)) \\)<br>az igazságtábla főoszlopa: 0011"]
    ["\\( q\\land (q\\lor p)\\supset p \\)" " a formula eredetije: \\( ((q\\land (q\\lor p))\\supset p) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( q\\equiv (p\\lor p)\\land q \\)" " a formula eredetije: \\( (q\\equiv ((p\\lor p)\\land q)) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( q\\land q\\supset (p\\equiv q) \\)" " a formula eredetije: \\( ((q\\land q)\\supset (p\\equiv q)) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( (q\\equiv p\\supset q)\\equiv p \\)" " a formula eredetije: \\( ((q\\equiv (p\\supset q))\\equiv p) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( (p\\equiv q)\\lor \\lnot q \\)" " a formula eredetije: \\( ((p\\equiv q)\\lor \\lnot q) \\)<br>az igazságtábla főoszlopa: 1011"]
    ["\\( q\\equiv p\\supset (p\\equiv q) \\)" " a formula eredetije: \\( (q\\equiv (p\\supset (p\\equiv q))) \\)<br>az igazságtábla főoszlopa: 0111"]
    ["\\( p\\land (q\\supset q)\\lor q \\)" " a formula eredetije: \\( ((p\\land (q\\supset q))\\lor q) \\)<br>az igazságtábla főoszlopa: 0111"]
    ["\\( q\\lor p \\)" " a formula eredetije: \\( (q\\lor p) \\)<br>az igazságtábla főoszlopa: 0111"]
    ["\\( p\\lor (q\\supset q\\equiv q) \\)" " a formula eredetije: \\( (p\\lor ((q\\supset q)\\equiv q)) \\)<br>az igazságtábla főoszlopa: 0111"]
    ["\\( (q\\lor q\\land p)\\lor p \\)" " a formula eredetije: \\( ((q\\lor (q\\land p))\\lor p) \\)<br>az igazságtábla főoszlopa: 0111"]
]}]
