[{:question "Jelölje meg a kielégíthető, de nem érvényes formulákat!"
  :good [
    "\\( \\lnot ((p\\equiv q)\\supset p) \\)"
    "\\( \\lnot q\\equiv p\\supset q \\)"
    "\\( \\lnot (q\\lor p\\lor q) \\)"
    "\\( \\lnot q\\land p\\equiv q \\)"
    "\\( p\\equiv q\\land \\lnot p \\)"
    "\\( q\\equiv \\lnot (p\\land q) \\)"
    "\\( \\lnot (q\\equiv q\\land p) \\)"
    "\\( \\lnot (p\\lor (q\\supset p)) \\)"
    "\\( q\\equiv p\\supset \\lnot q \\)"
    "\\( q\\land \\lnot (q\\supset p) \\)"
    "\\( (p\\equiv p)\\equiv \\lnot p \\)"
    "\\( \\lnot (q\\supset q)\\equiv p \\)"
    "\\( (q\\equiv q)\\supset \\lnot p \\)"
    "\\( \\lnot ((p\\lor p)\\lor p) \\)"
    "\\( \\lnot p\\land (p\\supset q) \\)"
    "\\( \\lnot (q\\lor p)\\equiv q \\)"
    "\\( p\\land (q\\equiv \\lnot p) \\)"
    "\\( (q\\lor p)\\land \\lnot q \\)"
    "\\( \\lnot (p\\lor q\\supset q) \\)"
    "\\( \\lnot (\\lnot p\\lor q) \\)"
    "\\( \\lnot q\\equiv q\\supset q \\)"
    "\\( \\lnot (q\\land (p\\supset q)) \\)"
    "\\( q\\equiv q\\equiv \\lnot q \\)"
    "\\( \\lnot ((q\\supset p)\\supset q) \\)"
    "\\( \\lnot (q\\equiv p)\\equiv p \\)"
    "\\( \\lnot (q\\land q)\\equiv p \\)"
    "\\( \\lnot (p\\land p)\\equiv q \\)"
    "\\( q\\equiv \\lnot (p\\land p) \\)"
    "\\( \\lnot (q\\land q)\\equiv p \\)"
    "\\( p\\supset \\lnot p\\equiv q \\)"
    "\\( \\lnot (q\\land p\\land p) \\)"
    "\\( q\\land q\\supset \\lnot p \\)"
    "\\( q\\land p\\supset \\lnot p \\)"
    "\\( (p\\supset q)\\supset \\lnot p \\)"
    "\\( \\lnot (p\\supset q\\equiv p) \\)"
    "\\( (p\\equiv p)\\land q\\land p \\)"
    "\\( q\\land ((q\\equiv q)\\supset p) \\)"
    "\\( (p\\lor q)\\land (q\\equiv p) \\)"
    "\\( (q\\land (p\\lor q))\\land p \\)"
    "\\( q\\equiv q\\lor q\\supset p \\)"
    "\\( q\\equiv (p\\equiv p)\\land p \\)"
    "\\( p\\equiv q\\lor q\\land p \\)"
    "\\( p\\equiv q \\)"
    "\\( (q\\equiv p)\\lor p\\land q \\)"
    "\\( (q\\equiv q\\supset q)\\equiv p \\)"
    "\\( (p\\lor (q\\supset q))\\land q \\)"
    "\\( (q\\land p\\supset p)\\supset q \\)"
    "\\( ((p\\supset p)\\lor q)\\land q \\)"
    "\\( q\\lor q\\land q\\land q \\)"
    "\\( q\\land (q\\equiv q\\lor p) \\)"
    "\\( q\\lor (q\\lor p\\supset q) \\)"
    "\\( \\lnot p\\lor q \\)"
    "\\( (p\\supset q)\\lor q\\land p \\)"
    "\\( q\\lor (p\\equiv q\\lor q) \\)"
    "\\( (p\\supset (q\\equiv p))\\lor q \\)"
    "\\( (p\\supset p)\\lor p\\equiv p \\)"
    "\\( (p\\land (p\\equiv p))\\land p \\)"
    "\\( p\\lor q\\land (p\\lor p) \\)"
    "\\( p\\equiv p\\equiv p\\lor p \\)"
    "\\( p\\lor p\\land q\\land q \\)"
    "\\( q\\supset q\\supset p\\land q \\)"
    "\\( p\\lor \\lnot q\\lor p \\)"
    "\\( (p\\equiv q)\\land q\\equiv q \\)"
    "\\( p\\land p\\lor (p\\equiv q) \\)"
    "\\( \\lnot (q\\lor p)\\lor p \\)"
    "\\( (q\\land q\\equiv p)\\supset q \\)"
    "\\( (p\\equiv q\\land p)\\supset q \\)"
    "\\( \\lnot (p\\equiv q)\\lor p \\)"
    "\\( (p\\supset q\\equiv q)\\lor q \\)"
    "\\( p\\lor \\lnot (p\\equiv q) \\)"
  ]
  :wrong [
    ["\\( \\lnot ((q\\equiv q)\\lor p) \\)" " a formula eredetije: \\( \\lnot ((q\\equiv q)\\lor p) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( q\\land (p\\equiv \\lnot p) \\)" " a formula eredetije: \\( (q\\land (p\\equiv \\lnot p)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (p\\lor p)\\equiv p \\)" " a formula eredetije: \\( (\\lnot (p\\lor p)\\equiv p) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\lor (q\\equiv q)) \\)" " a formula eredetije: \\( \\lnot (q\\lor (q\\equiv q)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\supset p\\supset q) \\)" " a formula eredetije: \\( \\lnot (q\\supset (p\\supset q)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (p\\equiv p)\\land q \\)" " a formula eredetije: \\( (\\lnot (p\\equiv p)\\land q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\land q)\\land q \\)" " a formula eredetije: \\( (\\lnot (q\\land q)\\land q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot p\\equiv p \\)" " a formula eredetije: \\( (\\lnot p\\equiv p) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( q\\land \\lnot q\\land p \\)" " a formula eredetije: \\( (q\\land (\\lnot q\\land p)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot q\\equiv q)\\land p \\)" " a formula eredetije: \\( ((\\lnot q\\equiv q)\\land p) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( p\\land (\\lnot q\\equiv q) \\)" " a formula eredetije: \\( (p\\land (\\lnot q\\equiv q)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (p\\supset (p\\equiv p)) \\)" " a formula eredetije: \\( \\lnot (p\\supset (p\\equiv p)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (p\\lor (p\\supset p)) \\)" " a formula eredetije: \\( \\lnot (p\\lor (p\\supset p)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( q\\land \\lnot (p\\supset q) \\)" " a formula eredetije: \\( (q\\land \\lnot (p\\supset q)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\equiv q)\\land p \\)" " a formula eredetije: \\( (\\lnot (q\\equiv q)\\land p) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( (q\\equiv \\lnot q)\\land p \\)" " a formula eredetije: \\( ((q\\equiv \\lnot q)\\land p) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\lor q\\equiv q) \\)" " a formula eredetije: \\( \\lnot ((q\\lor q)\\equiv q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (p\\supset p)\\land q \\)" " a formula eredetije: \\( (\\lnot (p\\supset p)\\land q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( p\\land (q\\equiv \\lnot q) \\)" " a formula eredetije: \\( (p\\land (q\\equiv \\lnot q)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (p\\supset q)\\land q \\)" " a formula eredetije: \\( (\\lnot (p\\supset q)\\land q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot p\\land p\\land p \\)" " a formula eredetije: \\( (\\lnot p\\land (p\\land p)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot ((q\\supset p)\\lor q) \\)" " a formula eredetije: \\( \\lnot ((q\\supset p)\\lor q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\equiv q)\\land q \\)" " a formula eredetije: \\( (\\lnot (q\\equiv q)\\land q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (p\\land q\\supset p) \\)" " a formula eredetije: \\( \\lnot ((p\\land q)\\supset p) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (p\\supset p)\\land p \\)" " a formula eredetije: \\( (\\lnot (p\\supset p)\\land p) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( q\\land \\lnot q \\)" " a formula eredetije: \\( (q\\land \\lnot q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot ((q\\supset p)\\lor q) \\)" " a formula eredetije: \\( \\lnot ((q\\supset p)\\lor q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\lor (p\\equiv p)) \\)" " a formula eredetije: \\( \\lnot (q\\lor (p\\equiv p)) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( q\\supset \\lnot q\\equiv q \\)" " a formula eredetije: \\( ((q\\supset \\lnot q)\\equiv q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( q\\land \\lnot q \\)" " a formula eredetije: \\( (q\\land \\lnot q) \\)<br>az igazságtábla főoszlopa: 0000"]
    ["\\( p\\equiv p\\land (p\\lor p) \\)" " a formula eredetije: \\( (p\\equiv (p\\land (p\\lor p))) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( p\\supset (q\\equiv q)\\supset p \\)" " a formula eredetije: \\( (p\\supset ((q\\equiv q)\\supset p)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( q\\land p\\supset q\\lor p \\)" " a formula eredetije: \\( ((q\\land p)\\supset (q\\lor p)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( p\\lor (p\\supset q\\lor q) \\)" " a formula eredetije: \\( (p\\lor (p\\supset (q\\lor q))) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\lor q)\\lor (p\\equiv q) \\)" " a formula eredetije: \\( ((p\\lor q)\\lor (p\\equiv q)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( q\\land p\\land q\\supset p \\)" " a formula eredetije: \\( ((q\\land (p\\land q))\\supset p) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( \\lnot (\\lnot p\\equiv p) \\)" " a formula eredetije: \\( \\lnot (\\lnot p\\equiv p) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( q\\supset q\\equiv p\\supset p \\)" " a formula eredetije: \\( ((q\\supset q)\\equiv (p\\supset p)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( p\\lor (p\\equiv p)\\lor p \\)" " a formula eredetije: \\( (p\\lor ((p\\equiv p)\\lor p)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( p\\supset (p\\equiv p\\lor p) \\)" " a formula eredetije: \\( (p\\supset (p\\equiv (p\\lor p))) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( \\lnot (\\lnot q\\equiv q) \\)" " a formula eredetije: \\( \\lnot (\\lnot q\\equiv q) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\land p)\\land p\\equiv p \\)" " a formula eredetije: \\( (((p\\land p)\\land p)\\equiv p) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\equiv p)\\supset q\\supset q \\)" " a formula eredetije: \\( ((q\\equiv p)\\supset (q\\supset q)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( q\\land \\lnot q\\supset p \\)" " a formula eredetije: \\( ((q\\land \\lnot q)\\supset p) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( p\\lor q\\supset (p\\equiv p) \\)" " a formula eredetije: \\( ((p\\lor q)\\supset (p\\equiv p)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( \\lnot p\\lor (p\\supset p) \\)" " a formula eredetije: \\( (\\lnot p\\lor (p\\supset p)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\equiv p)\\land p\\supset p \\)" " a formula eredetije: \\( (((p\\equiv p)\\land p)\\supset p) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( q\\land q\\land p\\supset q \\)" " a formula eredetije: \\( ((q\\land (q\\land p))\\supset q) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( p\\equiv p\\equiv p\\equiv p \\)" " a formula eredetije: \\( (p\\equiv (p\\equiv (p\\equiv p))) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\lor p\\equiv q)\\lor p \\)" " a formula eredetije: \\( (((q\\lor p)\\equiv q)\\lor p) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\land p)\\land q\\supset q \\)" " a formula eredetije: \\( (((p\\land p)\\land q)\\supset q) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( p\\equiv p\\equiv q\\supset q \\)" " a formula eredetije: \\( (p\\equiv (p\\equiv (q\\supset q))) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\equiv q)\\land (p\\equiv p) \\)" " a formula eredetije: \\( ((q\\equiv q)\\land (p\\equiv p)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( p\\lor (q\\supset q\\lor p) \\)" " a formula eredetije: \\( (p\\lor (q\\supset (q\\lor p))) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( q\\supset (q\\supset p)\\supset p \\)" " a formula eredetije: \\( (q\\supset ((q\\supset p)\\supset p)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( q\\land (q\\equiv q)\\equiv q \\)" " a formula eredetije: \\( ((q\\land (q\\equiv q))\\equiv q) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\supset p\\equiv q)\\supset q \\)" " a formula eredetije: \\( (((p\\supset p)\\equiv q)\\supset q) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\equiv q)\\equiv p\\supset p \\)" " a formula eredetije: \\( ((q\\equiv q)\\equiv (p\\supset p)) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( ((p\\equiv p)\\equiv p)\\equiv p \\)" " a formula eredetije: \\( (((p\\equiv p)\\equiv p)\\equiv p) \\)<br>az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\supset q\\supset p)\\lor q \\)" " a formula eredetije: \\( ((p\\supset (q\\supset p))\\lor q) \\)<br>az igazságtábla főoszlopa: 1111"]
]}]
